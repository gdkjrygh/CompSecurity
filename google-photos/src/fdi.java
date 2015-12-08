// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class fdi
    implements dur
{

    private static final Uri a = (new android.net.Uri.Builder()).authority("com.google.android.apps.photos.devicemanagement.assistant").scheme("content").appendPath("card").build();
    private final Context b;
    private final fcl c;

    public fdi(Context context, fcl fcl1)
    {
        b = context;
        c = fcl1;
    }

    public final int a(int i)
    {
        List list = a(i, null);
        if (list.isEmpty())
        {
            return 0;
        }
        if (list.size() > 1)
        {
            throw new IllegalStateException("Device Management is providing more than one assistant card");
        }
        return b(((dum)list.get(0)).a) != dut.a ? 0 : 1;
    }

    public final duu a(dui dui1)
    {
        fcm fcm1 = c.a(dui1.a());
        if (fcm1 != null && !fcm1.f && fcm1.b.equals(dui1.b()))
        {
            return new duu(dui1, b.getString(s.y), b.getString(s.x), dut.a, 1000);
        } else
        {
            return null;
        }
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.devicemanagement.assistant";
    }

    public final List a(int i, imi imi1)
    {
        fcm fcm1;
        fbw fbw1;
        fcm1 = c.a(i);
        fbw1 = (fbw)olm.a(b, fbw);
        if (fcm1 == null || fcm1.f) goto _L2; else goto _L1
_L1:
        long l;
        if (imi1 == null)
        {
            l = -1L;
        } else
        {
            l = imi1.a("com.google.android.apps.photos.devicemanagement.assistant".hashCode());
        }
        imi1 = new dun();
        imi1.f = "com.google.android.apps.photos.devicemanagement.assistant";
        imi1.g = 1000;
        imi1.a = new duj(i, fcm1.b, "com.google.android.apps.photos.devicemanagement.assistant");
        imi1.c = System.currentTimeMillis();
        imi1.e = l;
        imi1.d = fcm1;
        imi1.h = dul.c;
        fdj.a[fbw1.b().ordinal()];
        JVM INSTR tableswitch 1 3: default 148
    //                   1 177
    //                   2 187
    //                   3 187;
           goto _L3 _L4 _L5 _L5
_L3:
        return Arrays.asList(new dum[] {
            imi1.a()
        });
_L4:
        imi1.b = dva.a;
        continue; /* Loop/switch isn't completed */
_L5:
        imi1.b = dva.b;
        if (true) goto _L3; else goto _L2
_L2:
        return Collections.emptyList();
    }

    public final void a(List list)
    {
        if (list.size() > 1)
        {
            throw new IllegalStateException("Cannot mark more than one Device Management card as read");
        } else
        {
            list = (dui)list.get(0);
            list = c.a(list.a(), list.b());
            list = mvj.a(c.a, ((fcm) (list)).a);
            ContentValues contentvalues = new ContentValues(1);
            contentvalues.put("is_read", Integer.valueOf(1));
            list.update("device_mgmt_batch", contentvalues, null, null);
            return;
        }
    }

    public final int b(dui dui1)
    {
        dui1 = c.a(dui1.a(), dui1.b());
        if (dui1 != null && !((fcm) (dui1)).f && !((fcm) (dui1)).g)
        {
            return dut.a;
        } else
        {
            return dut.b;
        }
    }

    public final Uri b()
    {
        return a;
    }

    public final boolean c()
    {
        return false;
    }

}
