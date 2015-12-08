// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.graphics.Bitmap;
import com.google.android.gms.wearable.Asset;
import com.google.gson.a;
import com.google.gson.e;
import com.google.gson.f;
import com.google.gson.internal.c;
import com.google.gson.q;
import com.tinder.model.WearUser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ag
{

    private static e a;

    public static Asset a(Bitmap bitmap)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream);
        bitmap = Asset.a(bytearrayoutputstream.toByteArray());
        bytearrayoutputstream.close();
        return bitmap;
    }

    public static String a(WearUser wearuser)
    {
        return a.a(wearuser);
    }

    public static String a(byte abyte0[])
    {
        return new String(abyte0, Charset.forName("UTF-8"));
    }

    static 
    {
        Object obj;
        f f1;
        ArrayList arraylist;
        int i;
        int j;
        f1 = new f();
        obj = f1.a.a();
        obj.e = true;
        f1.a = ((c) (obj));
        arraylist = new ArrayList();
        arraylist.addAll(f1.e);
        Collections.reverse(arraylist);
        arraylist.addAll(f1.f);
        obj = f1.h;
        i = f1.i;
        j = f1.j;
        if (obj == null || "".equals(((String) (obj)).trim())) goto _L2; else goto _L1
_L1:
        obj = new a(((String) (obj)));
_L6:
        arraylist.add(q.a(com.google.gson.b.a.a(java/util/Date), obj));
        arraylist.add(q.a(com.google.gson.b.a.a(java/sql/Timestamp), obj));
        arraylist.add(q.a(com.google.gson.b.a.a(java/sql/Date), obj));
_L4:
        a = new e(f1.a, f1.c, f1.d, f1.g, f1.k, f1.o, f1.m, f1.n, f1.l, f1.b, arraylist);
        return;
_L2:
        if (i == 2 || j == 2) goto _L4; else goto _L3
_L3:
        obj = new a(i, j);
        if (true) goto _L6; else goto _L5
_L5:
    }
}
