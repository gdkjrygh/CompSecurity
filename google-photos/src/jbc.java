// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

final class jbc
    implements ngs
{

    private final Context a;
    private final mmv b;
    private final eto c;
    private final jae d;
    private final gdb e;
    private final ivi f;

    jbc(Context context)
    {
        this(context, new gdb());
    }

    private jbc(Context context, gdb gdb1)
    {
        a = context;
        b = (mmv)olm.a(context, mmv);
        c = (eto)olm.a(context, eto);
        d = (jae)olm.a(context, jae);
        f = (ivi)olm.a(context, ivi);
        e = gdb1;
    }

    public final void a(int i)
    {
        if (!b.a(i).a("logged_in", false)) goto _L2; else goto _L1
_L1:
        Object obj = d.a();
        if (((List) (obj)).isEmpty()) goto _L2; else goto _L3
_L3:
        SQLiteDatabase sqlitedatabase;
        erb erb1;
        erb1 = new erb(a, i);
        sqlitedatabase = mvj.a(a, i);
        sqlitedatabase.beginTransactionWithListenerNonExclusive(erb1);
        Iterator iterator = ((List) (obj)).iterator();
_L11:
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        double d1;
        double d2;
        jaa jaa1;
        eui eui1;
        Object obj1;
        String s;
        String s1;
        String as[];
        gdc gdc1;
        String s2;
        int l;
        long l2;
        long l3;
        long l4;
        long l5;
        jaa1 = (jaa)iterator.next();
        obj = b.d(Uri.parse(jaa1.c));
        eui1 = new eui();
        obj1 = jaa1.e;
        as = nlk.b(((Uri) (obj)));
        gdc1 = new gdc(((android.content.ContentValues) (obj1)));
        l2 = gdc1.b(as[0]);
        obj1 = gdc1.d(as[1]);
        s2 = gdc1.d(as[2]);
        s = gdc1.d(as[3]);
        l3 = gdc1.b(as[4]);
        d1 = gdc1.c(as[5]);
        d2 = gdc1.c(as[6]);
        l = gdc1.a(as[12]);
        s1 = gdc1.d(as[7]);
        l4 = gdc1.b(as[11]);
        l5 = gdc1.b(as[13]);
        if (as[8] != null) goto _L7; else goto _L6
_L6:
        long l1 = 0L;
          goto _L8
_L13:
        l = b.a(s2, l, l4);
        obj = ContentUris.withAppendedId(((Uri) (obj)), l2);
        eui1.a(((Uri) (obj)));
        eui1.d(l5);
        eui1.c(0L);
        if (!b.g(((Uri) (obj)))) goto _L10; else goto _L9
_L9:
        obj = njx.b;
_L14:
        int j;
        int k;
        eui1.b(((njx) (obj)));
        eui1.b(l);
        eui1.c(((String) (obj1)));
        eui1.b(s);
        eui1.e(l3);
        eui1.b(Double.valueOf(d1));
        eui1.a(Double.valueOf(d2));
        eui1.e(s1);
        eui1.a(Long.valueOf(l1));
        eui1.c(Integer.valueOf(j));
        eui1.d(Integer.valueOf(k));
        obj = (eui)eui1;
        ((eui) (obj)).a(eun.b);
        ((eui) (obj)).a(jaa1.a);
        ((eui) (obj)).a(f.a(jaa1.c, ((eui) (obj)).g().longValue()));
        c.a(i, sqlitedatabase, ((eui) (obj)), jaa1.c, true, erb1);
          goto _L11
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
_L7:
        l1 = gdc1.b(as[8]);
          goto _L8
_L16:
        j = gdc1.a(as[9]);
          goto _L12
_L18:
        k = gdc1.a(as[10]);
          goto _L13
_L10:
        obj = njx.a;
          goto _L14
_L5:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
_L2:
        return;
_L8:
        if (as[9] != null) goto _L16; else goto _L15
_L15:
        j = 0;
_L12:
        if (as[10] != null) goto _L18; else goto _L17
_L17:
        k = 0;
          goto _L13
    }
}
