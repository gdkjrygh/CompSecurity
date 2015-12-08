// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso;

import android.app.PendingIntent;
import android.os.Bundle;
import com.microsoft.onlineid.b.c;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.f;
import com.microsoft.onlineid.g;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.sts.a.e;
import com.microsoft.onlineid.sts.b;
import com.microsoft.onlineid.sts.h;
import com.microsoft.onlineid.sts.l;
import com.microsoft.onlineid.sts.q;
import java.util.Date;

// Referenced classes of package com.microsoft.onlineid.internal.sso:
//            f, c, b

public final class a
{

    public static Bundle a(PendingIntent pendingintent)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.microsoft.onlineid.ui_resolution_intent", pendingintent);
        return bundle;
    }

    public static Bundle a(d d1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.microsoft.onlineid.ticket_scope_target", d1.a());
        bundle.putString("com.microsoft.onlineid.ticket_scope_policy", d1.b());
        return bundle;
    }

    public static Bundle a(f f1)
    {
        Bundle bundle = new Bundle();
        com.microsoft.onlineid.f.a a1 = f1.a();
        if (a1 != com.microsoft.onlineid.f.a.a)
        {
            bundle.putString("com.microsoft.onlineid.preferred_membername_type", a1.toString());
        }
        f1 = f1.b();
        if (f1 != null && !f1.isEmpty())
        {
            bundle.putString("com.microsoft.onlineid.cobranding_id", f1);
        }
        return bundle;
    }

    public static Bundle a(i j)
    {
        Bundle bundle = a(j.a());
        bundle.putString("com.microsoft.onlineid.ticket_value", j.c());
        bundle.putLong("com.microsoft.onlineid.ticket_expiration_time", j.b().getTime());
        return bundle;
    }

    public static Bundle a(com.microsoft.onlineid.internal.sso.f f1, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.microsoft.onlineid.error_code", f1.a());
        bundle.putString("com.microsoft.onlineid.error_message", s);
        return bundle;
    }

    public static Bundle a(b b1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.microsoft.onlineid.user_cid", b1.d());
        bundle.putString("com.microsoft.onlineid.user_puid", b1.b());
        bundle.putString("com.microsoft.onlineid.user_username", b1.c());
        bundle.putString("com.microsoft.onlineid.user_display_name", b1.f());
        return bundle;
    }

    public static Bundle a(Exception exception)
    {
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(com.microsoft.onlineid.internal.sso.f.b, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(com.microsoft.onlineid.internal.sso.f.c, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(com.microsoft.onlineid.internal.sso.f.d, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(com.microsoft.onlineid.internal.sso.f.e, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(com.microsoft.onlineid.internal.sso.f.f, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(com.microsoft.onlineid.internal.sso.f.g, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(com.microsoft.onlineid.internal.sso.f.h, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(com.microsoft.onlineid.internal.sso.f.i, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(f.k, exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Bundle bundle = a(f.j, exception.getMessage());
            bundle.putString("com.microsoft.onlineid.redirect_request_to", exception.a());
            return bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return a(f.a, (new StringBuilder()).append(exception.getClass().getName()).append(": ").append(exception.getMessage()).toString());
        }
    }

    public static com.microsoft.onlineid.sts.i a(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        try
        {
            h h1 = new h(bundle.getString("com.microsoft.onlineid.device_username"), bundle.getString("com.microsoft.onlineid.device_password"));
            com.microsoft.onlineid.sts.f f1 = new com.microsoft.onlineid.sts.f(bundle.getString("com.microsoft.onlineid.device_datoken"), bundle.getByteArray("com.microsoft.onlineid.device_session_key_base64"));
            bundle = new com.microsoft.onlineid.sts.i(h1, bundle.getString("com.microsoft.onlineid.device_puid"), f1);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new com.microsoft.onlineid.internal.sso.b("Could not create DeviceIdentity from Bundle.", bundle);
        }
        return bundle;
    }

    public static b b(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        try
        {
            com.microsoft.onlineid.sts.f f1 = i(bundle);
            bundle = c(bundle);
            bundle.a(f1);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new com.microsoft.onlineid.internal.sso.b("Could not create AuthenticatorUserAccount from Bundle.", bundle);
        }
        return bundle;
    }

    public static b c(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        b b1;
        try
        {
            b1 = new b(bundle.getString("com.microsoft.onlineid.user_puid"), bundle.getString("com.microsoft.onlineid.user_cid"), bundle.getString("com.microsoft.onlineid.user_username"), null);
            b1.a(bundle.getString("com.microsoft.onlineid.user_display_name"));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new com.microsoft.onlineid.internal.sso.b("Could not create limited AuthenticatorUserAccount from Bundle.", bundle);
        }
        return b1;
    }

    public static d d(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        try
        {
            bundle = new g(bundle.getString("com.microsoft.onlineid.ticket_scope_target"), bundle.getString("com.microsoft.onlineid.ticket_scope_policy"));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new com.microsoft.onlineid.internal.sso.b("Could not create SecurityScope from Bundle.", bundle);
        }
        return bundle;
    }

    public static i e(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        try
        {
            bundle = new i(d(bundle), new Date(bundle.getLong("com.microsoft.onlineid.ticket_expiration_time")), bundle.getString("com.microsoft.onlineid.ticket_value"));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new com.microsoft.onlineid.internal.sso.b("Could not create Ticket from Bundle.", bundle);
        }
        return bundle;
    }

    public static PendingIntent f(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        bundle = (PendingIntent)bundle.getParcelable("com.microsoft.onlineid.ui_resolution_intent");
        if (bundle == null)
        {
            throw new com.microsoft.onlineid.internal.sso.b("PendingIntent not found in Bundle.");
        } else
        {
            return bundle;
        }
    }

    public static boolean g(Bundle bundle)
    {
        int j = bundle.getInt("com.microsoft.onlineid.error_code");
        bundle = bundle.getString("com.microsoft.onlineid.error_message");
        return j != 0 || bundle != null;
    }

    public static com.microsoft.onlineid.b.a h(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        int j = bundle.getInt("com.microsoft.onlineid.error_code");
        String s = bundle.getString("com.microsoft.onlineid.error_message");
        if (j != 0)
        {
            com.microsoft.onlineid.internal.sso.f f1 = com.microsoft.onlineid.internal.sso.f.a(j);
            static final class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[com.microsoft.onlineid.internal.sso.f.values().length];
                    try
                    {
                        a[com.microsoft.onlineid.internal.sso.f.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[com.microsoft.onlineid.internal.sso.f.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[com.microsoft.onlineid.internal.sso.f.d.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[com.microsoft.onlineid.internal.sso.f.e.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[com.microsoft.onlineid.internal.sso.f.f.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[com.microsoft.onlineid.internal.sso.f.g.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[com.microsoft.onlineid.internal.sso.f.h.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[com.microsoft.onlineid.internal.sso.f.i.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[f.j.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[f.k.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[f.a.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1.a[f1.ordinal()])
            {
            default:
                return new com.microsoft.onlineid.b.b(s);

            case 1: // '\001'
                return new com.microsoft.onlineid.internal.sso.a.a(s);

            case 2: // '\002'
                return new com.microsoft.onlineid.internal.sso.a.b(s);

            case 3: // '\003'
                return new com.microsoft.onlineid.b.b(new com.microsoft.onlineid.internal.e.d(s));

            case 4: // '\004'
                return new com.microsoft.onlineid.b.b(new IllegalArgumentException(s));

            case 5: // '\005'
                return new com.microsoft.onlineid.internal.b.a(s);

            case 6: // '\006'
                return new c(s);

            case 7: // '\007'
                return new e(s, new q(new l(0)));

            case 8: // '\b'
                return new com.microsoft.onlineid.sts.a.c(s);

            case 9: // '\t'
                return new com.microsoft.onlineid.internal.sso.c(s, bundle.getString("com.microsoft.onlineid.redirect_request_to"));

            case 10: // '\n'
                return new com.microsoft.onlineid.internal.sso.client.a(s);
            }
        }
        if (s != null)
        {
            return new com.microsoft.onlineid.b.b(s);
        } else
        {
            throw new com.microsoft.onlineid.internal.sso.b("Neither error_code nor error_message was found in the given Bundle.");
        }
    }

    private static com.microsoft.onlineid.sts.f i(Bundle bundle)
        throws com.microsoft.onlineid.internal.sso.b
    {
        try
        {
            bundle = new com.microsoft.onlineid.sts.f(bundle.getString("com.microsoft.onlineid.user_datoken"), bundle.getByteArray("com.microsoft.onlineid.user_session_key_base64"));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new com.microsoft.onlineid.internal.sso.b("Could not create DAToken from Bundle.", bundle);
        }
        return bundle;
    }
}
