// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.ParcelUuid;
import com.spotify.mobile.android.util.Assertion;
import egv;
import ehh;
import ehp;
import ehr;
import eht;
import ehu;
import ehx;
import ehy;
import ehz;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;

public class AppProtocolBluetoothService extends Service
{

    private static final UUID a = UUID.fromString("E3CCCCCD-33B7-457D-A03C-AA1C54BF617F");
    private static final UUID b = UUID.fromString("7FBE865E-518B-462A-B31B-90ACF6A472FC");
    private Set c;
    private ehx d;
    private ehx e;
    private ehy f;
    private ehy g;

    public AppProtocolBluetoothService()
    {
        c = new HashSet();
        f = new ehy() {

            public final egv a(InputStream inputstream, OutputStream outputstream)
            {
                return new ehh(inputstream, outputstream, Executors.newSingleThreadExecutor());
            }

        };
        g = new ehy() {

            public final egv a(InputStream inputstream, OutputStream outputstream)
            {
                java.util.concurrent.ExecutorService executorservice = Executors.newSingleThreadExecutor();
                java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = Executors.newSingleThreadScheduledExecutor();
                new ehp();
                inputstream = new ehr(inputstream, executorservice);
                new ehp();
                return new ehu(inputstream, new eht(outputstream, scheduledexecutorservice));
            }

        };
    }

    public static void a(AppProtocolBluetoothService appprotocolbluetoothservice, egv egv)
    {
        egv = new ehz(appprotocolbluetoothservice, egv);
        appprotocolbluetoothservice.c.add(egv);
        ((ehz) (egv)).c.post(new ehz._cls1(egv));
    }

    public static boolean a(BluetoothAdapter bluetoothadapter)
    {
        if (bluetoothadapter == null || bluetoothadapter.getBondedDevices() == null)
        {
            return false;
        }
        if (bluetoothadapter.getState() != 12)
        {
            return false;
        }
        for (bluetoothadapter = bluetoothadapter.getBondedDevices().iterator(); bluetoothadapter.hasNext();)
        {
            if (a((BluetoothDevice)bluetoothadapter.next()))
            {
                return true;
            }
        }

        return false;
    }

    private static boolean a(BluetoothDevice bluetoothdevice)
    {
        try
        {
            bluetoothdevice = bluetoothdevice.getUuids();
        }
        // Misplaced declaration of an exception variable
        catch (BluetoothDevice bluetoothdevice)
        {
            Assertion.a("Unexpected NPE from system call", bluetoothdevice);
            return false;
        }
        while (bluetoothdevice == null || !Arrays.asList(bluetoothdevice).contains(ParcelUuid.fromString("00001101-0000-1000-8000-00805F9B34FB"))) 
        {
            return false;
        }
        return true;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        BluetoothAdapter bluetoothadapter;
        super.onCreate();
        bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothadapter == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        d = new ehx(this, a, bluetoothadapter, f);
        d.start();
        e = new ehx(this, b, bluetoothadapter, g);
        e.start();
        return;
        IOException ioexception;
        ioexception;
        Assertion.a("Cannot start accept thread", ioexception);
        return;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (d != null)
        {
            d.a();
        }
        if (e != null)
        {
            e.a();
        }
        ehz ehz1;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ehz1.c.post(new ehz._cls2(ehz1)))
        {
            ehz1 = (ehz)iterator.next();
        }

    }

}
