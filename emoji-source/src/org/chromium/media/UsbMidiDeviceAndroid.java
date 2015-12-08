// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbRequest;
import android.os.Handler;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class UsbMidiDeviceAndroid
{

    static final int MIDI_SUBCLASS = 3;
    private final UsbDeviceConnection mConnection;
    private final SparseArray mEndpointMap = new SparseArray();
    private final Handler mHandler = new Handler();
    private boolean mHasInputThread;
    private boolean mIsClosed;
    private long mNativePointer;
    private final Map mRequestMap = new HashMap();

    UsbMidiDeviceAndroid(UsbManager usbmanager, UsbDevice usbdevice)
    {
        mConnection = usbmanager.openDevice(usbdevice);
        mIsClosed = false;
        mHasInputThread = false;
        mNativePointer = 0L;
        int i = 0;
        while (i < usbdevice.getInterfaceCount()) 
        {
            usbmanager = usbdevice.getInterface(i);
            if (usbmanager.getInterfaceClass() == 1 && usbmanager.getInterfaceSubclass() == 3)
            {
                mConnection.claimInterface(usbmanager, true);
                int j = 0;
                while (j < usbmanager.getEndpointCount()) 
                {
                    UsbEndpoint usbendpoint = usbmanager.getEndpoint(j);
                    if (usbendpoint.getDirection() == 0)
                    {
                        mEndpointMap.put(usbendpoint.getEndpointNumber(), usbendpoint);
                    }
                    j++;
                }
            }
            i++;
        }
        startListen(usbdevice);
    }

    private static int getInputDataLength(ByteBuffer bytebuffer)
    {
        int j = bytebuffer.position();
        for (int i = 0; i < j; i += 4)
        {
            if (bytebuffer.get(i) == 0)
            {
                return i;
            }
        }

        return j;
    }

    private static native void nativeOnData(long l, int i, byte abyte0[]);

    private void postOnDataEvent(final int endpointNumber, final byte bs[])
    {
        mHandler.post(new Runnable() {

            final UsbMidiDeviceAndroid this$0;
            final byte val$bs[];
            final int val$endpointNumber;

            public void run()
            {
                if (mIsClosed)
                {
                    return;
                } else
                {
                    UsbMidiDeviceAndroid.nativeOnData(mNativePointer, endpointNumber, bs);
                    return;
                }
            }

            
            {
                this$0 = UsbMidiDeviceAndroid.this;
                endpointNumber = i;
                bs = abyte0;
                super();
            }
        });
    }

    private boolean shouldUseBulkTransfer()
    {
        return mHasInputThread;
    }

    private void startListen(UsbDevice usbdevice)
    {
        final HashMap bufferForEndpoints = new HashMap();
        int i = 0;
        while (i < usbdevice.getInterfaceCount()) 
        {
            UsbInterface usbinterface = usbdevice.getInterface(i);
            if (usbinterface.getInterfaceClass() == 1 && usbinterface.getInterfaceSubclass() == 3)
            {
                int j = 0;
                while (j < usbinterface.getEndpointCount()) 
                {
                    UsbEndpoint usbendpoint = usbinterface.getEndpoint(j);
                    if (usbendpoint.getDirection() == 128)
                    {
                        ByteBuffer bytebuffer = ByteBuffer.allocate(usbendpoint.getMaxPacketSize());
                        UsbRequest usbrequest = new UsbRequest();
                        usbrequest.initialize(mConnection, usbendpoint);
                        usbrequest.queue(bytebuffer, bytebuffer.remaining());
                        bufferForEndpoints.put(usbendpoint, bytebuffer);
                    }
                    j++;
                }
            }
            i++;
        }
        if (bufferForEndpoints.isEmpty())
        {
            return;
        } else
        {
            mHasInputThread = true;
            (new Thread() {

                final UsbMidiDeviceAndroid this$0;
                final Map val$bufferForEndpoints;

                public void run()
                {
                    do
                    {
                        UsbRequest usbrequest1;
                        UsbEndpoint usbendpoint1;
                        do
                        {
                            usbrequest1 = mConnection.requestWait();
                            if (usbrequest1 == null)
                            {
                                return;
                            }
                            usbendpoint1 = usbrequest1.getEndpoint();
                        } while (usbendpoint1.getDirection() != 128);
                        ByteBuffer bytebuffer1 = (ByteBuffer)bufferForEndpoints.get(usbendpoint1);
                        int k = UsbMidiDeviceAndroid.getInputDataLength(bytebuffer1);
                        if (k > 0)
                        {
                            bytebuffer1.rewind();
                            byte abyte0[] = new byte[k];
                            bytebuffer1.get(abyte0, 0, k);
                            postOnDataEvent(usbendpoint1.getEndpointNumber(), abyte0);
                        }
                        bytebuffer1.rewind();
                        usbrequest1.queue(bytebuffer1, bytebuffer1.capacity());
                    } while (true);
                }

            
            {
                this$0 = UsbMidiDeviceAndroid.this;
                bufferForEndpoints = map;
                super();
            }
            }).start();
            return;
        }
    }

    void close()
    {
        mEndpointMap.clear();
        for (Iterator iterator = mRequestMap.values().iterator(); iterator.hasNext(); ((UsbRequest)iterator.next()).close()) { }
        mRequestMap.clear();
        mConnection.close();
        mNativePointer = 0L;
        mIsClosed = true;
    }

    byte[] getDescriptors()
    {
        if (mConnection == null)
        {
            return new byte[0];
        } else
        {
            return mConnection.getRawDescriptors();
        }
    }

    void registerSelf(long l)
    {
        mNativePointer = l;
    }

    void send(int i, byte abyte0[])
    {
        UsbEndpoint usbendpoint;
        if (!mIsClosed)
        {
            if ((usbendpoint = (UsbEndpoint)mEndpointMap.get(i)) != null)
            {
                if (shouldUseBulkTransfer())
                {
                    mConnection.bulkTransfer(usbendpoint, abyte0, 0, abyte0.length, 100);
                    return;
                }
                UsbRequest usbrequest1 = (UsbRequest)mRequestMap.get(usbendpoint);
                UsbRequest usbrequest = usbrequest1;
                if (usbrequest1 == null)
                {
                    usbrequest = new UsbRequest();
                    usbrequest.initialize(mConnection, usbendpoint);
                    mRequestMap.put(usbendpoint, usbrequest);
                }
                usbrequest.queue(ByteBuffer.wrap(abyte0), abyte0.length);
                return;
            }
        }
    }






}
