// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            IBrailleService, BrailleDisplayProperties, BrailleInputEvent

public class Display
{
    private class Connection
        implements ServiceConnection
    {

        private volatile IBrailleService mService;
        final Display this$0;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            Log.i(Display.LOG_TAG, "Connected to braille service");
            componentname = IBrailleService.Stub.asInterface(ibinder);
            componentname.registerCallback(mServiceCallback);
            mService = componentname;
            synchronized (mHandler)
            {
                mNumFailedBinds = 0;
            }
            return;
            ibinder;
            componentname;
            JVM INSTR monitorexit ;
            try
            {
                throw ibinder;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname)
            {
                Log.e(Display.LOG_TAG, "Failed to register callback on service", componentname);
            }
            return;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            mService = null;
            Log.e(Display.LOG_TAG, "Disconnected from braille service");
            mHandler.reportConnectionState(0, null);
            mHandler.scheduleRebind();
        }


        private Connection()
        {
            this$0 = Display.this;
            super();
        }

    }

    private class DisplayHandler extends Handler
    {

        private static final int MSG_REBIND_SERVICE = 3;
        private static final int MSG_REPORT_CONNECTION_STATE = 1;
        private static final int MSG_REPORT_INPUT_EVENT = 2;
        final Display this$0;

        private void handleRebindService()
        {
            if (mConnection != null)
            {
                doUnbindService();
            }
            doBindService();
        }

        private void handleReportConnectionState(int i, BrailleDisplayProperties brailledisplayproperties)
        {
            mDisplayProperties = brailledisplayproperties;
            if (i != currentConnectionState && mConnectionStateChangeListener != null)
            {
                mConnectionStateChangeListener.onConnectionStateChanged(i);
            }
            currentConnectionState = i;
        }

        private void handleReportInputEvent(BrailleInputEvent brailleinputevent)
        {
            OnInputEventListener oninputeventlistener = mInputEventListener;
            if (oninputeventlistener != null)
            {
                oninputeventlistener.onInputEvent(brailleinputevent);
            }
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                handleReportConnectionState(message.arg1, (BrailleDisplayProperties)message.obj);
                return;

            case 2: // '\002'
                handleReportInputEvent((BrailleInputEvent)message.obj);
                return;

            case 3: // '\003'
                handleRebindService();
                break;
            }
        }

        public void reportConnectionState(int i, BrailleDisplayProperties brailledisplayproperties)
        {
            obtainMessage(1, i, 0, brailledisplayproperties).sendToTarget();
        }

        public void reportInputEvent(BrailleInputEvent brailleinputevent)
        {
            obtainMessage(2, brailleinputevent).sendToTarget();
        }

        public void scheduleRebind()
        {
            this;
            JVM INSTR monitorenter ;
            if (mNumFailedBinds >= 5)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            int i = 500 << mNumFailedBinds;
            sendEmptyMessageDelayed(3, i);
            int i = ((obj) (this)).obj + 1;
            Log.w(Display.LOG_TAG, String.format("Will rebind to braille service in %d ms.", new Object[] {
                Integer.valueOf(i)
            }));
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
            reportConnectionState(-1, null);
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public DisplayHandler()
        {
            this$0 = Display.this;
            super();
        }

        public DisplayHandler(Handler handler)
        {
            this$0 = Display.this;
            super(handler.getLooper());
        }
    }

    public static interface OnConnectionStateChangeListener
    {

        public abstract void onConnectionStateChanged(int i);
    }

    public static interface OnInputEventListener
    {

        public abstract void onInputEvent(BrailleInputEvent brailleinputevent);
    }

    private class ServiceCallback extends IBrailleServiceCallback.Stub
    {

        final Display this$0;

        public void onDisplayConnected(BrailleDisplayProperties brailledisplayproperties)
        {
            mHandler.reportConnectionState(1, brailledisplayproperties);
        }

        public void onDisplayDisconnected()
        {
            mHandler.reportConnectionState(0, null);
        }

        public void onInput(BrailleInputEvent brailleinputevent)
        {
            mHandler.reportInputEvent(brailleinputevent);
        }

        private ServiceCallback()
        {
            this$0 = Display.this;
            super();
        }

    }


    public static final String ACTION_DISPLAY_SERVICE = "com.googlecode.eyesfree.braille.service.ACTION_DISPLAY_SERVICE";
    private static final String LOG_TAG = com/googlecode/eyesfree/braille/display/Display.getSimpleName();
    private static final int MAX_REBIND_ATTEMPTS = 5;
    private static final int REBIND_DELAY_MILLIS = 500;
    public static final int STATE_CONNECTED = 1;
    public static final int STATE_ERROR = -1;
    public static final int STATE_NOT_CONNECTED = 0;
    private static final int STATE_UNKNOWN = -2;
    private static final Intent mServiceIntent = new Intent("com.googlecode.eyesfree.braille.service.ACTION_DISPLAY_SERVICE");
    private int currentConnectionState;
    private Connection mConnection;
    private final OnConnectionStateChangeListener mConnectionStateChangeListener;
    private final Context mContext;
    private BrailleDisplayProperties mDisplayProperties;
    private final DisplayHandler mHandler;
    private volatile OnInputEventListener mInputEventListener;
    private int mNumFailedBinds;
    private ServiceCallback mServiceCallback;

    public Display(Context context, OnConnectionStateChangeListener onconnectionstatechangelistener)
    {
        this(context, onconnectionstatechangelistener, null);
    }

    public Display(Context context, OnConnectionStateChangeListener onconnectionstatechangelistener, Handler handler)
    {
        currentConnectionState = -2;
        mServiceCallback = new ServiceCallback();
        mNumFailedBinds = 0;
        mContext = context;
        mConnectionStateChangeListener = onconnectionstatechangelistener;
        if (handler == null)
        {
            mHandler = new DisplayHandler();
        } else
        {
            mHandler = new DisplayHandler(handler);
        }
        doBindService();
    }

    private void doBindService()
    {
        Connection connection = new Connection();
        if (!mContext.bindService(mServiceIntent, connection, 1))
        {
            Log.e(LOG_TAG, "Failed to bind Service");
            mHandler.scheduleRebind();
            return;
        } else
        {
            mConnection = connection;
            Log.i(LOG_TAG, "Bound to braille service");
            return;
        }
    }

    private void doUnbindService()
    {
        IBrailleService ibrailleservice = getBrailleService();
        if (ibrailleservice != null)
        {
            try
            {
                ibrailleservice.unregisterCallback(mServiceCallback);
            }
            catch (RemoteException remoteexception) { }
        }
        if (mConnection != null)
        {
            mContext.unbindService(mConnection);
            mConnection = null;
        }
    }

    private IBrailleService getBrailleService()
    {
        Connection connection = mConnection;
        if (connection != null)
        {
            return connection.mService;
        } else
        {
            return null;
        }
    }

    public void displayDots(byte abyte0[])
    {
        IBrailleService ibrailleservice = getBrailleService();
        if (ibrailleservice != null)
        {
            try
            {
                ibrailleservice.displayDots(abyte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Log.e(LOG_TAG, "Error in displayDots", abyte0);
            }
            return;
        } else
        {
            Log.v(LOG_TAG, "Error in displayDots: service not connected");
            return;
        }
    }

    public BrailleDisplayProperties getDisplayProperties()
    {
        return mDisplayProperties;
    }

    public void setOnInputEventListener(OnInputEventListener oninputeventlistener)
    {
        mInputEventListener = oninputeventlistener;
    }

    public void shutdown()
    {
        doUnbindService();
    }











/*
    static int access$402(Display display, int i)
    {
        display.mNumFailedBinds = i;
        return i;
    }

*/


/*
    static int access$404(Display display)
    {
        int i = display.mNumFailedBinds + 1;
        display.mNumFailedBinds = i;
        return i;
    }

*/


/*
    static BrailleDisplayProperties access$702(Display display, BrailleDisplayProperties brailledisplayproperties)
    {
        display.mDisplayProperties = brailledisplayproperties;
        return brailledisplayproperties;
    }

*/



/*
    static int access$802(Display display, int i)
    {
        display.currentConnectionState = i;
        return i;
    }

*/

}
