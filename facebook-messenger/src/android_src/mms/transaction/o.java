// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android_src.c.f;
import android_src.mms.c;
import android_src.mms.d;
import android_src.mms.e.a;
import android_src.mms.e.e;
import android_src.mms.e.k;
import android_src.mms.e.r;
import android_src.mms.e.t;
import android_src.mms.e.x;
import com.facebook.debug.log.b;

// Referenced classes of package android_src.mms.transaction:
//            r, p, x, w

public class o extends android_src.mms.transaction.r
    implements Runnable
{

    static final String a[] = {
        "ct_l", "locked"
    };
    private final Uri f;
    private final String g;
    private boolean h;

    public o(Context context, int i, w w, String s)
    {
        super(context, i, w);
        if (s.startsWith("content://"))
        {
            f = Uri.parse(s);
            w = a(context, f);
            g = w;
            c = w;
            a(android_src.mms.transaction.p.a(context));
            return;
        } else
        {
            throw new IllegalArgumentException("Initializing from X-Mms-Content-Location is abandoned!");
        }
    }

    private String a(Context context, Uri uri)
    {
        context = android_src.mms.g.o.a(context, context.getContentResolver(), uri, a, null, null, null);
        h = false;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (context.getCount() != 1 || !context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_83;
        }
        boolean flag;
        if (context.getInt(1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        uri = context.getString(0);
        context.close();
        return uri;
        context.close();
        throw new d((new StringBuilder()).append("Cannot get X-Mms-Content-Location from: ").append(uri).toString());
        uri;
        context.close();
        throw uri;
    }

    private static void a(Context context, Uri uri, String s, boolean flag)
    {
        ContentValues contentvalues = new ContentValues(2);
        contentvalues.put("ct_l", s);
        contentvalues.put("locked", Boolean.valueOf(flag));
        android_src.mms.g.o.a(context, context.getContentResolver(), uri, contentvalues, null, null);
    }

    private void a(x x1)
    {
label0:
        {
            x1 = x1.d();
            if (x1 != null)
            {
                x1 = new a(18, x1);
                x1.a(new e(android_src.mms.f.a.a(b)));
                if (!c.l())
                {
                    break label0;
                }
                a((new k(b, x1)).a(), g);
            }
            return;
        }
        a((new k(b, x1)).a());
    }

    private static boolean a(Context context, x x1)
    {
        x1 = x1.c();
        if (x1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        x1 = new String(x1);
        context = android_src.mms.g.o.a(context, context.getContentResolver(), android_src.c.d.a, new String[] {
            "_id"
        }, "(m_id = ? AND m_type = ?)", new String[] {
            x1, String.valueOf(132)
        }, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        int i = context.getCount();
        if (i > 0)
        {
            context.close();
            return true;
        }
        context.close();
        return false;
        x1;
        context.close();
        throw x1;
    }

    public void a()
    {
        (new Thread(this)).start();
    }

    public int b()
    {
        return 1;
    }

    public void run()
    {
        Object obj = null;
        x x1;
        android_src.mms.g.d.b().a(f, 129);
        x1 = (x)(new r(a(g))).a();
        Exception exception;
        if (x1 != null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        ContentValues contentvalues;
        try
        {
            throw new d("Invalid M-Retrieve.conf PDU.");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            if (d.a() == 1) goto _L0; else goto _L0
        }
        com.facebook.debug.log.b.d("fb-mms:RetrieveTransaction", "Throwable caught in RetreiveTransaction", ((Throwable) (obj)));
        if (d.a() != 1)
        {
            d.a(2);
            d.a(f);
            com.facebook.debug.log.b.e("fb-mms:RetrieveTransaction", "Retrieval failed.");
        }
        c();
        return;
        if (!a(b, x1))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        d.a(2);
        d.a(f);
_L1:
        android_src.mms.g.o.a(b, b.getContentResolver(), f, null, null);
        if (obj == null);
        a(x1);
        if (d.a() != 1)
        {
            d.a(2);
            d.a(f);
            com.facebook.debug.log.b.e("fb-mms:RetrieveTransaction", "Retrieval failed.");
        }
        c();
        return;
        obj = t.a(b).a(x1, f.a);
        contentvalues = new ContentValues(1);
        contentvalues.put("date", Long.valueOf(System.currentTimeMillis() / 1000L));
        android_src.mms.g.o.a(b, b.getContentResolver(), ((Uri) (obj)), contentvalues, null, null);
        d.a(1);
        d.a(((Uri) (obj)));
        a(b, ((Uri) (obj)), g, h);
          goto _L1
        d.a(2);
        d.a(f);
        com.facebook.debug.log.b.e("fb-mms:RetrieveTransaction", "Retrieval failed.");
        c();
        throw exception;
    }

}
