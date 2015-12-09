// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.util.crypt.SecureDataCoder;
import com.fitbit.util.e.c;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class aw
{

    private static final String b = "PersistenseManager";
    protected final Context a = FitBitApplication.a();

    public aw()
    {
    }

    protected abstract String a();

    protected abstract JSONObject a(Object obj)
        throws JSONException;

    public Object b()
    {
        Object obj;
        SecureDataCoder securedatacoder;
        com.fitbit.e.a.a("PersistenseManager", String.format("Attempt to load %s", new Object[] {
            a()
        }), new Object[0]);
        obj = com.fitbit.util.e.c.a(a, a());
        securedatacoder = new SecureDataCoder();
        securedatacoder.a(a);
        Object obj2 = SecureDataCoder.b(securedatacoder, ((String) (obj)));
        if (obj2 == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_101;
        obj2;
        com.fitbit.e.a.a("PersistenseManager", "Unable to decode credentials. Possibly they are not encoded. Try to encode it and decode again", new Object[0]);
        obj = SecureDataCoder.a(securedatacoder, ((String) (obj)));
        com.fitbit.util.e.c.a(a, a(), ((String) (obj)));
        return b();
        obj = b(new JSONObject(((String) (obj2))));
        return obj;
        Object obj1;
        obj1;
        com.fitbit.e.a.a("PersistenseManager", ((IOException) (obj1)).toString(), new Object[0]);
        return null;
        obj1;
        com.fitbit.e.a.a("PersistenseManager", ((JSONException) (obj1)).toString(), new Object[0]);
        return null;
    }

    protected abstract Object b(JSONObject jsonobject)
        throws JSONException;

    public void b(Object obj)
    {
        try
        {
            obj = a(obj).toString();
            SecureDataCoder securedatacoder = new SecureDataCoder();
            securedatacoder.a(a);
            obj = SecureDataCoder.a(securedatacoder, ((String) (obj)));
            com.fitbit.e.a.a("PersistenseManager", String.format("Writing %s to file %s", new Object[] {
                obj, a()
            }), new Object[0]);
            com.fitbit.util.e.c.a(a, a(), ((String) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
    }

    public void c()
    {
        com.fitbit.e.a.a("PersistenseManager", String.format("Clearing file %s", new Object[] {
            a()
        }), new Object[0]);
        com.fitbit.util.e.c.b(a, a());
    }
}
