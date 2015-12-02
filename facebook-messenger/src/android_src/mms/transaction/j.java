// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android_src.c.f;
import android_src.mms.c;
import android_src.mms.d;
import android_src.mms.e.h;
import android_src.mms.e.i;
import android_src.mms.e.k;
import android_src.mms.e.r;
import android_src.mms.e.t;
import android_src.mms.g.o;
import com.facebook.debug.log.b;
import java.io.IOException;

// Referenced classes of package android_src.mms.transaction:
//            r, p, x, w

public class j extends android_src.mms.transaction.r
    implements Runnable
{

    private Uri a;
    private h f;
    private String g;

    public j(Context context, int l, w w, h h1)
    {
        super(context, l, w);
        try
        {
            a = t.a(context).a(h1, f.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.facebook.debug.log.b.d("fb-mms:NotificationTransaction", "Failed to save NotificationInd in constructor.", context);
            throw new IllegalArgumentException();
        }
        f = h1;
        c = new String(h1.k());
    }

    public j(Context context, int l, w w, String s)
    {
        super(context, l, w);
        a = Uri.parse(s);
        try
        {
            f = (h)t.a(context).a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.facebook.debug.log.b.d("fb-mms:NotificationTransaction", (new StringBuilder()).append("Failed to load NotificationInd from: ").append(s).toString(), context);
            throw new IllegalArgumentException();
        }
        c = new String(f.k());
        g = new String(f.b());
        a(p.a(context));
    }

    private void a(int l)
    {
        i i1 = new i(18, f.k(), l);
        if (c.l())
        {
            a((new k(b, i1)).a(), g);
            return;
        } else
        {
            a((new k(b, i1)).a());
            return;
        }
    }

    public void a()
    {
        (new Thread(this)).start();
    }

    public int b()
    {
        return 0;
    }

    public void run()
    {
        byte abyte0[];
        Object obj1;
        char c1;
        boolean flag;
        c1 = '\204';
        abyte0 = null;
        obj1 = android_src.mms.g.d.b();
        flag = ((android_src.mms.g.d) (obj1)).a();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((android_src.mms.g.d) (obj1)).a(a, 129);
        obj1 = a(g);
        abyte0 = ((byte []) (obj1));
_L11:
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        Object obj = (new r(abyte0)).a();
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (((android_src.mms.e.f) (obj)).f() == 132) goto _L7; else goto _L6
_L6:
        obj1 = (new StringBuilder()).append("Invalid M-RETRIEVE.CONF PDU. ");
        if (obj == null) goto _L9; else goto _L8
_L8:
        obj = (new StringBuilder()).append("message type: ").append(((android_src.mms.e.f) (obj)).f()).toString();
_L12:
        com.facebook.debug.log.b.e("fb-mms:NotificationTransaction", ((StringBuilder) (obj1)).append(((String) (obj))).toString());
        d.a(2);
          goto _L10
_L13:
        a(c1);
        d.a(a);
        Exception exception;
        IOException ioexception;
        if (!flag)
        {
            d.a(1);
        }
        if (d.a() != 1)
        {
            d.a(2);
            com.facebook.debug.log.b.e("fb-mms:NotificationTransaction", "NotificationTransaction failed.");
        }
        c();
        return;
_L2:
        ((android_src.mms.g.d) (obj1)).a(a, 128);
        a(131);
        d.a(a);
        if (!flag)
        {
            d.a(1);
        }
        if (d.a() != 1)
        {
            d.a(2);
            com.facebook.debug.log.b.e("fb-mms:NotificationTransaction", "NotificationTransaction failed.");
        }
        c();
        return;
        ioexception;
        d.a(2);
          goto _L11
        obj;
        com.facebook.debug.log.b.d("fb-mms:NotificationTransaction", "Throwable caught in NotificationTransaction", ((Throwable) (obj)));
        d.a(a);
        if (!flag)
        {
            d.a(1);
        }
        if (d.a() != 1)
        {
            d.a(2);
            com.facebook.debug.log.b.e("fb-mms:NotificationTransaction", "NotificationTransaction failed.");
        }
        c();
        return;
_L9:
        obj = "null pdu";
          goto _L12
_L7:
        obj = t.a(b).a(((android_src.mms.e.f) (obj)), f.a);
        ioexception = new ContentValues(1);
        ioexception.put("date", Long.valueOf(System.currentTimeMillis() / 1000L));
        o.a(b, b.getContentResolver(), ((Uri) (obj)), ioexception, null, null);
        o.a(b, b.getContentResolver(), a, null, null);
        a = ((Uri) (obj));
        c1 = '\201';
          goto _L10
_L15:
        d.a(1);
          goto _L13
        exception;
        d.a(a);
        if (!flag)
        {
            d.a(1);
        }
        if (d.a() != 1)
        {
            d.a(2);
            com.facebook.debug.log.b.e("fb-mms:NotificationTransaction", "NotificationTransaction failed.");
        }
        c();
        throw exception;
_L16:
        if (d.a() != 0) goto _L13; else goto _L14
_L14:
        d.a(1);
          goto _L13
_L4:
        c1 = '\203';
_L10:
        c1;
        JVM INSTR tableswitch 129 131: default 576
    //                   129 431
    //                   130 137
    //                   131 491;
           goto _L13 _L15 _L13 _L16
    }
}
