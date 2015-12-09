// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;
import com.ford.syncV4.trace.enums.InterfaceActivityDirection;
import java.io.IOException;
import java.io.InputStream;

final class axj extends Thread
{

    Boolean a;
    private byte b[];
    private axh c;

    private axj(axh axh1)
    {
        c = axh1;
        super();
        b = new byte[4096];
        a = Boolean.valueOf(false);
    }

    axj(axh axh1, byte byte0)
    {
        this(axh1);
    }

    public final void run()
    {
        axg.a("BTTransport: Waiting for incoming RFCOMM connect", "", InterfaceActivityDirection.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
        boolean flag;
        axh.a(c, axh.a(c).accept());
        flag = a.booleanValue();
        {
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_195;
            }
            if (!axh.d(c) && axh.a(c) != null && !a.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
            {
                Object obj;
                String s;
                IOException ioexception1;
                int i;
                try
                {
                    axh.a(c).close();
                }
                catch (IOException ioexception) { }
                axh.e(c);
            }
        }
        if (a.booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        i = axh.f(c).read(b);
        if (i != -1)
        {
            try
            {
                c.a(b, i);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (!a.booleanValue())
                {
                    s = (new StringBuilder("Failure in BTTransport reader thread: ")).append(((Exception) (obj)).toString()).toString();
                    axt.a(s, ((Throwable) (obj)));
                    axh.a(c, s, ((Exception) (obj)));
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_581;
        axg.a("BTTransport: RFCOMM Connection Accepted", axg.a(axh.b(c).getRemoteDevice()), InterfaceActivityDirection.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
        axh.a(c, axh.b(c).getOutputStream());
        axh.a(c, axh.b(c).getInputStream());
        c.e();
        if (!axh.d(c) && axh.a(c) != null && !a.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
        {
            try
            {
                axh.a(c).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            axh.e(c);
        }
        continue; /* Loop/switch isn't completed */
        obj;
        if (!a.booleanValue())
        {
            if (axh.c(c) == null || axh.c(c).isEnabled())
            {
                break MISSING_BLOCK_LABEL_437;
            }
            axh.a(c, "Bluetooth Adapater has been disabled.", new SyncException("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", ((Throwable) (obj)), SyncExceptionCause.b));
        }
_L1:
        if (!axh.d(c) && axh.a(c) != null && !a.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
        {
            try
            {
                axh.a(c).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            axh.e(c);
        }
        continue; /* Loop/switch isn't completed */
        axh.a(c, "Failed to accept connection", ((Exception) (obj)));
          goto _L1
        obj;
        if (!axh.d(c) && axh.a(c) != null && !a.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
        {
            try
            {
                axh.a(c).close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception1) { }
            axh.e(c);
        }
        throw obj;
        obj;
        if (a.booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (axh.c(c) != null && !axh.c(c).isEnabled())
        {
            axh.a(c, "Bluetooth Adapater has been disabled.", new SyncException("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", ((Throwable) (obj)), SyncExceptionCause.b));
            continue; /* Loop/switch isn't completed */
        }
        axh.a(c, "Failed to read from Bluetooth transport.", ((Exception) (obj)));
        continue; /* Loop/switch isn't completed */
        if (!a.booleanValue())
        {
            axt.a("End of stream reached!");
            axh.a(c, "End of stream reached.", null);
        }
        if (true) goto _L3; else goto _L2
_L3:
        break MISSING_BLOCK_LABEL_102;
_L2:
    }
}
