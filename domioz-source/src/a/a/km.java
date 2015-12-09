// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appboy.f;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            d, l

public final class km
    implements d
{

    private static final String a;
    private l b;
    private boolean c;
    private boolean d;

    public km()
    {
        b = a.a.l.a;
        c = false;
        d = false;
    }

    public final l a()
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
                com.appboy.f.a.c(a, "Failed to get active network information.  Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml", intent);
                return;
            }
            flag = intent.getBooleanExtra("noConnectivity", false);
            if (connectivitymanager == null || flag)
            {
                b = l.b;
                d = false;
                c = false;
                return;
            }
            d = connectivitymanager.isConnectedOrConnecting();
            c = connectivitymanager.isRoaming();
            switch (connectivitymanager.getType())
            {
            default:
                b = a.a.l.a;
                return;

            case 7: // '\007'
                b = a.a.l.a;
                return;

            case 8: // '\b'
                b = a.a.l.a;
                return;

            case 9: // '\t'
                b = a.a.l.a;
                return;

            case 4: // '\004'
                b = a.a.l.a;
                return;

            case 5: // '\005'
                b = a.a.l.a;
                return;

            case 2: // '\002'
                b = a.a.l.a;
                return;

            case 3: // '\003'
                b = a.a.l.a;
                return;

            case 0: // '\0'
                switch (connectivitymanager.getSubtype())
                {
                default:
                    b = l.c;
                    return;

                case 3: // '\003'
                    b = l.d;
                    return;

                case 13: // '\r'
                    b = l.e;
                    break;
                }
                return;

            case 1: // '\001'
                b = a.a.l.f;
                return;

            case 6: // '\006'
                b = a.a.l.f;
                return;
            }
        } else
        {
            com.appboy.f.a.c(a, String.format("Unexpected system broadcast received [%s]", new Object[] {
                s
            }));
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/km.getName()
        });
    }
}
