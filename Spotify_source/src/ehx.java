// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.spotify.mobile.android.spotlets.appprotocol.service.AppProtocolBluetoothService;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.util.UUID;

public final class ehx extends Thread
{

    private BluetoothServerSocket a;
    private final UUID b;
    private final BluetoothAdapter c;
    private final ehy d;
    private volatile boolean e;
    private AppProtocolBluetoothService f;

    public ehx(AppProtocolBluetoothService appprotocolbluetoothservice, UUID uuid, BluetoothAdapter bluetoothadapter, ehy ehy1)
    {
        f = appprotocolbluetoothservice;
        super();
        b = uuid;
        c = bluetoothadapter;
        d = ehy1;
    }

    public final void a()
    {
        e = false;
        try
        {
            if (a != null)
            {
                a.close();
            }
            return;
        }
        catch (IOException ioexception)
        {
            Logger.c("Error closing BT server socket", new Object[] {
                ioexception
            });
        }
    }

    public final void run()
    {
        e = true;
        try
        {
            a = c.listenUsingRfcommWithServiceRecord("Spotify", b);
        }
        catch (IOException ioexception)
        {
            Logger.b(ioexception, "Error closing BT server socket", new Object[0]);
        }
        if (a == null)
        {
            Logger.c("Accept socket is null", new Object[0]);
            e = false;
        } else
        {
            while (e) 
            {
                Object obj1;
                try
                {
                    obj1 = a.accept();
                }
                catch (IOException ioexception2)
                {
                    return;
                }
                if (obj1 != null)
                {
                    try
                    {
                        Object obj = ((BluetoothSocket) (obj1)).getInputStream();
                        obj1 = ((BluetoothSocket) (obj1)).getOutputStream();
                        obj = d.a(((java.io.InputStream) (obj)), ((java.io.OutputStream) (obj1)));
                        AppProtocolBluetoothService.a(f, ((egv) (obj)));
                    }
                    catch (IOException ioexception1)
                    {
                        Logger.c("Error accepting connection", new Object[] {
                            ioexception1
                        });
                    }
                }
            }
        }
    }
}
