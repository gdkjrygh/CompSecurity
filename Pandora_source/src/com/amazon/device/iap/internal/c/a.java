// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.util.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.c:
//            d, e

public class a
{

    private static final String a = com/amazon/device/iap/internal/c/a.getSimpleName();
    private static final String b = (new StringBuilder()).append(com/amazon/device/iap/internal/c/a.getName()).append("_PREFS").toString();
    private static final String c = (new StringBuilder()).append(com/amazon/device/iap/internal/c/a.getName()).append("_CLEANER_PREFS").toString();
    private static int d = 0x240c8400;
    private static final a e = new a();

    public a()
    {
    }

    public static a a()
    {
        return e;
    }

    private void a(long l)
    {
        Object obj = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(obj, "context");
        obj = ((Context) (obj)).getSharedPreferences(c, 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putLong("LAST_CLEANING_TIME", l);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
    }

    static String b()
    {
        return a;
    }

    static String c()
    {
        return b;
    }

    static int d()
    {
        return d;
    }

    private void e()
    {
        com.amazon.device.iap.internal.util.e.a(a, "enter old receipts cleanup! ");
        Object obj = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(obj, "context");
        a(System.currentTimeMillis());
        obj = new Runnable(((Context) (obj))) {

            final Context a;
            final a b;

            public void run()
            {
                SharedPreferences sharedpreferences;
                Iterator iterator;
                com.amazon.device.iap.internal.util.e.a(a.b(), "perform house keeping! ");
                sharedpreferences = a.getSharedPreferences(a.c(), 0);
                iterator = sharedpreferences.getAll().keySet().iterator();
_L1:
                String s;
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_196;
                }
                s = (String)iterator.next();
                com.amazon.device.iap.internal.c.d d1 = com.amazon.device.iap.internal.c.d.a(sharedpreferences.getString(s, null));
                if (System.currentTimeMillis() - d1.c() > (long)com.amazon.device.iap.internal.c.a.d())
                {
                    com.amazon.device.iap.internal.util.e.a(a.b(), (new StringBuilder()).append("house keeping - try remove Receipt:").append(s).append(" since it's too old").toString());
                    b.a(s);
                }
                  goto _L1
                com.amazon.device.iap.internal.c.e e1;
                e1;
                com.amazon.device.iap.internal.util.e.a(a.b(), (new StringBuilder()).append("house keeping - try remove Receipt:").append(s).append(" since it's invalid ").toString());
                b.a(s);
                  goto _L1
                Throwable throwable;
                throwable;
                com.amazon.device.iap.internal.util.e.a(a.b(), (new StringBuilder()).append("Error in running cleaning job:").append(throwable).toString());
            }

            
            {
                b = a.this;
                a = context;
                super();
            }
        };
        (new Handler()).post(((Runnable) (obj)));
    }

    private long f()
    {
        Context context = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(context, "context");
        long l = System.currentTimeMillis();
        long l1 = context.getSharedPreferences(c, 0).getLong("LAST_CLEANING_TIME", 0L);
        if (l1 == 0L)
        {
            a(l);
            return l;
        } else
        {
            return l1;
        }
    }

    public void a(String s)
    {
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("enter removeReceipt for receipt[").append(s).append("]").toString());
        Object obj = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(obj, "context");
        obj = ((Context) (obj)).getSharedPreferences(b, 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).remove(s);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("leave removeReceipt for receipt[").append(s).append("]").toString());
    }

    public void a(String s, String s1, String s2, String s3)
    {
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("enter saveReceipt for receipt [").append(s3).append("]").toString());
        try
        {
            com.amazon.device.iap.internal.util.d.a(s1, "userId");
            com.amazon.device.iap.internal.util.d.a(s2, "receiptId");
            com.amazon.device.iap.internal.util.d.a(s3, "receiptString");
            Object obj = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(obj, "context");
            s1 = new com.amazon.device.iap.internal.c.d(s1, s3, s, System.currentTimeMillis());
            obj = ((Context) (obj)).getSharedPreferences(b, 0).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString(s2, s1.d());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("error in saving pending receipt:").append(s).append("/").append(s3).append(":").append(s1.getMessage()).toString());
        }
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("leaving saveReceipt for receipt id [").append(s2).append("]").toString());
    }

    public Set b(String s)
    {
        Object obj = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(obj, "context");
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("enter getLocalReceipts for user[").append(s).append("]").toString());
        HashSet hashset = new HashSet();
        if (com.amazon.device.iap.internal.util.d.a(s))
        {
            com.amazon.device.iap.internal.util.e.b(a, (new StringBuilder()).append("empty UserId: ").append(s).toString());
            throw new RuntimeException((new StringBuilder()).append("Invalid UserId:").append(s).toString());
        }
        obj = ((Context) (obj)).getSharedPreferences(b, 0).getAll();
        for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            String s1 = (String)((Map) (obj)).get(s2);
            try
            {
                com.amazon.device.iap.internal.c.d d1 = com.amazon.device.iap.internal.c.d.a(s1);
                hashset.add(com.amazon.device.iap.internal.util.a.a(new JSONObject(d1.b()), s, d1.a()));
            }
            catch (com.amazon.device.iap.internal.b.d d2)
            {
                a(s2);
                com.amazon.device.iap.internal.util.e.b(a, (new StringBuilder()).append("failed to verify signature:[").append(s1).append("]").toString());
            }
            catch (JSONException jsonexception)
            {
                a(s2);
                com.amazon.device.iap.internal.util.e.b(a, (new StringBuilder()).append("failed to convert string to JSON object:[").append(s1).append("]").toString());
            }
            catch (Throwable throwable)
            {
                com.amazon.device.iap.internal.util.e.b(a, (new StringBuilder()).append("failed to load the receipt from SharedPreference:[").append(s1).append("]").toString());
            }
        }

        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("leaving getLocalReceipts for user[").append(s).append("], ").append(hashset.size()).append(" local receipts found.").toString());
        if (System.currentTimeMillis() - f() > (long)d)
        {
            e();
        }
        return hashset;
    }

    public String c(String s)
    {
        Object obj = null;
        Object obj1 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(obj1, "context");
        if (com.amazon.device.iap.internal.util.d.a(s))
        {
            com.amazon.device.iap.internal.util.e.b(a, (new StringBuilder()).append("empty receiptId: ").append(s).toString());
            throw new RuntimeException((new StringBuilder()).append("Invalid ReceiptId:").append(s).toString());
        }
        obj1 = ((Context) (obj1)).getSharedPreferences(b, 0).getString(s, null);
        s = obj;
        if (obj1 != null)
        {
            try
            {
                s = com.amazon.device.iap.internal.c.d.a(((String) (obj1))).a();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return s;
    }

}
