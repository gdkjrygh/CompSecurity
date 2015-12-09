// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import java.io.Closeable;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            AppPreferencesManager

class b extends AppPreferencesManager
    implements Closeable
{

    public static final String a = "Nls_Keychain";
    private static b k = null;
    JSONObject b;
    private String j;

    private b(Context context, String s)
    {
        super(context);
        b = null;
        j = "Nls_Keychain";
        b(s);
    }

    public static b a(Context context, String s)
    {
        if (k == null)
        {
            k = new b(context, s);
        }
        return k;
    }

    private void b()
    {
        String s = b.toString();
        a().putString(j, s);
        a().apply();
    }

    private void b(String s)
    {
        b = new JSONObject(c(j, s));
    }

    public boolean a(String s, long l)
    {
        b.put(s, String.valueOf(l));
        b();
        return true;
    }

    public boolean a(String s, String s1)
    {
        b.put(s, s1);
        b();
        return true;
    }

    public long b(String s, long l)
    {
        if (!b.has(s))
        {
            b.put(s, String.valueOf(l));
            b();
            return l;
        } else
        {
            return b.getLong(s);
        }
    }

    public String b(String s, String s1)
    {
        if (!b.has(s))
        {
            b.put(s, s1);
            b();
            return s1;
        } else
        {
            return b.getString(s);
        }
    }

    public void close()
    {
        try
        {
            b();
            return;
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            return;
        }
        catch (NoSuchPaddingException nosuchpaddingexception)
        {
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

}
