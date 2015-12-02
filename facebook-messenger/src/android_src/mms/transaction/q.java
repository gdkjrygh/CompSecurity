// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android_src.c.i;
import android_src.mms.e.e;
import android_src.mms.e.k;
import android_src.mms.e.r;
import android_src.mms.e.t;
import android_src.mms.e.y;
import android_src.mms.e.z;
import android_src.mms.f.a;
import android_src.mms.g.l;
import android_src.mms.g.n;
import android_src.mms.g.o;
import com.facebook.debug.log.b;
import java.util.Arrays;

// Referenced classes of package android_src.mms.transaction:
//            r, p, x, w

public class q extends android_src.mms.transaction.r
    implements Runnable
{

    private Thread a;
    private final Uri f;

    public q(Context context, int j, w w, String s)
    {
        super(context, j, w);
        f = Uri.parse(s);
        c = s;
        a(android_src.mms.transaction.p.a(context));
    }

    public void a()
    {
        a = new Thread(this);
        a.start();
    }

    public int b()
    {
        return 2;
    }

    public void run()
    {
        l l1 = l.a();
        if (!l1.c() || l1.d())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        com.facebook.debug.log.b.e("fb-mms:SendTransaction", "Sending rate limit surpassed.");
        if (d.a() != 1)
        {
            d.a(2);
            d.a(f);
            com.facebook.debug.log.b.e("fb-mms:SendTransaction", "Delivery failed.");
        }
        c();
        return;
        Object obj;
        Object obj2;
        Object obj3;
        obj = t.a(b);
        obj2 = (z)((t) (obj)).a(f);
        long l2 = System.currentTimeMillis() / 1000L;
        ((z) (obj2)).a(l2);
        obj3 = new ContentValues(1);
        ((ContentValues) (obj3)).put("date", Long.valueOf(l2));
        o.a(b, b.getContentResolver(), f, ((ContentValues) (obj3)), null, null);
        obj3 = android_src.mms.f.a.a(b);
        if (!TextUtils.isEmpty(((CharSequence) (obj3))))
        {
            ((z) (obj2)).a(new e(((String) (obj3))));
        }
        l2 = ContentUris.parseId(f);
        byte abyte1[] = a(n.a(Long.valueOf(l2)), (new k(b, ((android_src.mms.e.f) (obj2)))).a());
        n.b(Long.valueOf(l2));
        if (com.facebook.debug.log.b.b(2))
        {
            String s = new String(abyte1);
            com.facebook.debug.log.b.b("fb-mms:SendTransaction", (new StringBuilder()).append("[SendTransaction] run: send mms msg (").append(c).append("), resp=").append(s).toString());
        }
        abyte1 = (y)(new r(abyte1)).a();
        if (abyte1 != null)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        com.facebook.debug.log.b.e("fb-mms:SendTransaction", "No M-Send.conf received.");
        byte abyte0[] = ((z) (obj2)).b();
        byte abyte2[] = abyte1.c();
        if (Arrays.equals(abyte0, abyte2))
        {
            break MISSING_BLOCK_LABEL_406;
        }
        com.facebook.debug.log.b.e("fb-mms:SendTransaction", (new StringBuilder()).append("Inconsistent Transaction-ID: req=").append(new String(abyte0)).append(", conf=").append(new String(abyte2)).toString());
        if (d.a() != 1)
        {
            d.a(2);
            d.a(f);
            com.facebook.debug.log.b.e("fb-mms:SendTransaction", "Delivery failed.");
        }
        c();
        return;
        int j;
        abyte0 = new ContentValues(2);
        j = abyte1.b();
        abyte0.put("resp_st", Integer.valueOf(j));
        if (j == 128)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        o.a(b, b.getContentResolver(), f, abyte0, null, null);
        com.facebook.debug.log.b.e("fb-mms:SendTransaction", (new StringBuilder()).append("Server returned an error code: ").append(j).toString());
        if (d.a() != 1)
        {
            d.a(2);
            d.a(f);
            com.facebook.debug.log.b.e("fb-mms:SendTransaction", "Delivery failed.");
        }
        c();
        return;
        abyte0.put("m_id", t.a(abyte1.a()));
        o.a(b, b.getContentResolver(), f, abyte0, null, null);
        obj = ((t) (obj)).a(f, i.a);
        d.a(1);
        d.a(((Uri) (obj)));
        if (d.a() != 1)
        {
            d.a(2);
            d.a(f);
            com.facebook.debug.log.b.e("fb-mms:SendTransaction", "Delivery failed.");
        }
        c();
        return;
        Object obj1;
        obj1;
        com.facebook.debug.log.b.d("fb-mms:SendTransaction", "Throwable caught in SendTransaction", ((Throwable) (obj1)));
        if (d.a() != 1)
        {
            d.a(2);
            d.a(f);
            com.facebook.debug.log.b.e("fb-mms:SendTransaction", "Delivery failed.");
        }
        c();
        return;
        obj1;
        if (d.a() != 1)
        {
            d.a(2);
            d.a(f);
            com.facebook.debug.log.b.e("fb-mms:SendTransaction", "Delivery failed.");
        }
        c();
        throw obj1;
    }
}
