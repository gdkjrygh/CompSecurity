// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            y, ah

public final class q
    implements y
{

    private static final String a;
    private ah b;
    private boolean c;
    private boolean d;

    public q()
    {
        b = ah.a;
        c = false;
        d = false;
    }

    public final ah a()
    {
        return b;
    }

    public final void a(Intent intent, ConnectivityManager connectivitymanager)
    {
        String s = intent.getAction();
        if (s.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            boolean flag;
            try
            {
                connectivitymanager = connectivitymanager.getActiveNetworkInfo();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                AppboyLogger.e(a, "Failed to get active network information.  Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml", intent);
                return;
            }
            flag = intent.getBooleanExtra("noConnectivity", false);
            if (connectivitymanager == null || flag)
            {
                b = ah.b;
                d = false;
                c = false;
                return;
            }
            d = connectivitymanager.isConnectedOrConnecting();
            c = connectivitymanager.isRoaming();
            switch (connectivitymanager.getType())
            {
            default:
                b = ah.a;
                return;

            case 7: // '\007'
                b = ah.a;
                return;

            case 8: // '\b'
                b = ah.a;
                return;

            case 9: // '\t'
                b = ah.a;
                return;

            case 4: // '\004'
                b = ah.a;
                return;

            case 5: // '\005'
                b = ah.a;
                return;

            case 2: // '\002'
                b = ah.a;
                return;

            case 3: // '\003'
                b = ah.a;
                return;

            case 0: // '\0'
                switch (connectivitymanager.getSubtype())
                {
                default:
                    b = ah.c;
                    return;

                case 3: // '\003'
                    b = ah.d;
                    return;

                case 13: // '\r'
                    b = ah.e;
                    break;
                }
                return;

            case 1: // '\001'
                b = ah.f;
                return;

            case 6: // '\006'
                b = ah.f;
                return;
            }
        } else
        {
            AppboyLogger.w(a, String.format("Unexpected system broadcast received [%s]", new Object[] {
                s
            }));
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/q.getName()
        });
    }
}
