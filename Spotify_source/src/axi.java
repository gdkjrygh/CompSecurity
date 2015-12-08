// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;

final class axi
{

    boolean a;
    BluetoothAdapter b;
    Thread c;
    final axh d;

    public axi(axh axh, BluetoothAdapter bluetoothadapter)
    {
        d = axh;
        super();
        a = false;
        b = null;
        c = null;
        if (bluetoothadapter == null)
        {
            throw new IllegalArgumentException("BluetoothAdapter cannot be null.");
        } else
        {
            b = bluetoothadapter;
            c = new Thread(new Runnable() {

                private axi a;

                public final void run()
                {
                    do
                    {
                        if (a.a)
                        {
                            break;
                        }
                        axi axi1 = a;
                        if (axi1.b != null && !axi1.b.isEnabled())
                        {
                            axh.a(axi1.d, "Bluetooth adapter has been disabled.", new SyncException("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", SyncExceptionCause.b));
                        }
                        try
                        {
                            Thread.sleep(15000L);
                            continue;
                        }
                        catch (InterruptedException interruptedexception) { }
                        break;
                    } while (true);
                }

            
            {
                a = axi.this;
                super();
            }
            });
            c.setName("BluetoothAdapterMonitor");
            c.setDaemon(true);
            c.start();
            return;
        }
    }
}
