// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.location.Location;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            ix, ir, kc, lp, 
//            is, it

public class iw
{

    private static final String b = com/flurry/sdk/iw.getSimpleName();
    byte a[];

    private iw()
    {
    }

    iw(_cls1 _pcls1)
    {
        this();
    }

    public iw(ix ix1)
    {
        Object obj1;
        obj1 = null;
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = new DataOutputStream(bytearrayoutputstream);
        ((DataOutputStream) (obj)).writeShort(7);
        ((DataOutputStream) (obj)).writeUTF(ix1.a());
        ((DataOutputStream) (obj)).writeLong(ix1.b());
        ((DataOutputStream) (obj)).writeLong(ix1.c());
        ((DataOutputStream) (obj)).writeLong(ix1.d());
        ((DataOutputStream) (obj)).writeBoolean(true);
        ((DataOutputStream) (obj)).writeByte(-1);
        if (TextUtils.isEmpty(ix1.f())) goto _L2; else goto _L1
_L1:
        ((DataOutputStream) (obj)).writeBoolean(true);
        ((DataOutputStream) (obj)).writeUTF(ix1.f());
_L21:
        if (TextUtils.isEmpty(ix1.g())) goto _L4; else goto _L3
_L3:
        ((DataOutputStream) (obj)).writeBoolean(true);
        ((DataOutputStream) (obj)).writeUTF(ix1.g());
_L22:
        obj1 = ix1.h();
        if (obj1 != null) goto _L6; else goto _L5
_L5:
        ((DataOutputStream) (obj)).writeShort(0);
_L23:
        obj1 = ix1.e();
        if (obj1 != null) goto _L8; else goto _L7
_L7:
        ((DataOutputStream) (obj)).writeShort(0);
_L24:
        ((DataOutputStream) (obj)).writeUTF(ix1.i());
        ((DataOutputStream) (obj)).writeUTF(ix1.j());
        ((DataOutputStream) (obj)).writeByte(ix1.k());
        ((DataOutputStream) (obj)).writeByte(ix1.l());
        ((DataOutputStream) (obj)).writeUTF(ix1.m());
        if (ix1.n() != null) goto _L10; else goto _L9
_L9:
        ((DataOutputStream) (obj)).writeBoolean(false);
_L25:
        ((DataOutputStream) (obj)).writeInt(ix1.o());
        ((DataOutputStream) (obj)).writeByte(-1);
        ((DataOutputStream) (obj)).writeByte(-1);
        ((DataOutputStream) (obj)).writeByte(ix1.p());
        if (ix1.q() != null) goto _L12; else goto _L11
_L11:
        ((DataOutputStream) (obj)).writeBoolean(false);
_L26:
        obj1 = ix1.r();
        if (obj1 != null) goto _L14; else goto _L13
_L13:
        ((DataOutputStream) (obj)).writeShort(0);
_L27:
        obj1 = ix1.s();
        if (obj1 != null) goto _L16; else goto _L15
_L15:
        ((DataOutputStream) (obj)).writeShort(0);
_L28:
        ((DataOutputStream) (obj)).writeBoolean(ix1.t());
        obj1 = ix1.v();
        if (obj1 == null) goto _L18; else goto _L17
_L17:
        int i;
        int j;
        int k;
        j = 0;
        i = 0;
        k = 0;
_L32:
        if (j >= ((List) (obj1)).size())
        {
            break MISSING_BLOCK_LABEL_337;
        }
        k += ((ir)((List) (obj1)).get(j)).a();
        if (k <= 0x27100)
        {
            break MISSING_BLOCK_LABEL_832;
        }
        kc.a(5, b, "Error Log size exceeded. No more event details logged.");
_L31:
        ((DataOutputStream) (obj)).writeInt(ix1.u());
        ((DataOutputStream) (obj)).writeShort(i);
        j = 0;
_L20:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        ((DataOutputStream) (obj)).write(((ir)((List) (obj1)).get(j)).b());
        j++;
        if (true) goto _L20; else goto _L19
_L2:
        ((DataOutputStream) (obj)).writeBoolean(false);
          goto _L21
        obj1;
        ix1 = ((ix) (obj));
        obj = obj1;
_L30:
        kc.a(6, b, "", ((Throwable) (obj)));
        throw obj;
        obj1;
        obj = ix1;
        ix1 = ((ix) (obj1));
_L29:
        lp.a(((java.io.Closeable) (obj)));
        throw ix1;
_L4:
        ((DataOutputStream) (obj)).writeBoolean(false);
          goto _L22
_L6:
        ((DataOutputStream) (obj)).writeShort(((Map) (obj1)).size());
        obj1 = ((Map) (obj1)).entrySet().iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
            ((DataOutputStream) (obj)).writeUTF((String)entry.getKey());
            ((DataOutputStream) (obj)).writeUTF((String)entry.getValue());
        }
          goto _L23
_L8:
        ((DataOutputStream) (obj)).writeShort(((Map) (obj1)).size());
        obj1 = ((Map) (obj1)).entrySet().iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            ((DataOutputStream) (obj)).writeUTF((String)entry1.getKey());
            ((DataOutputStream) (obj)).writeUTF((String)entry1.getValue());
            ((DataOutputStream) (obj)).writeByte(0);
        }
          goto _L24
_L10:
        ((DataOutputStream) (obj)).writeBoolean(true);
        ((DataOutputStream) (obj)).writeDouble(lp.a(ix1.n().getLatitude(), 3));
        ((DataOutputStream) (obj)).writeDouble(lp.a(ix1.n().getLongitude(), 3));
        ((DataOutputStream) (obj)).writeFloat(ix1.n().getAccuracy());
          goto _L25
_L12:
        ((DataOutputStream) (obj)).writeBoolean(true);
        ((DataOutputStream) (obj)).writeLong(ix1.q().longValue());
          goto _L26
_L14:
        ((DataOutputStream) (obj)).writeShort(((Map) (obj1)).size());
        obj1 = ((Map) (obj1)).entrySet().iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            ((DataOutputStream) (obj)).writeUTF((String)entry2.getKey());
            ((DataOutputStream) (obj)).writeInt(((is)entry2.getValue()).a);
        }
          goto _L27
_L16:
        ((DataOutputStream) (obj)).writeShort(((List) (obj1)).size());
        obj1 = ((List) (obj1)).iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            ((DataOutputStream) (obj)).write(((it)((Iterator) (obj1)).next()).e());
        }
          goto _L28
_L19:
        ((DataOutputStream) (obj)).writeInt(-1);
        ((DataOutputStream) (obj)).writeShort(0);
        ((DataOutputStream) (obj)).writeShort(0);
        ((DataOutputStream) (obj)).writeShort(0);
        a = bytearrayoutputstream.toByteArray();
        lp.a(((java.io.Closeable) (obj)));
        return;
        ix1;
        obj = null;
          goto _L29
        obj;
        ix1 = ((ix) (obj1));
          goto _L30
_L18:
        i = 0;
          goto _L31
        ix1;
          goto _L29
        i++;
        j++;
          goto _L32
    }

    public iw(byte abyte0[])
    {
        a = abyte0;
    }

    public byte[] a()
    {
        return a;
    }

}
