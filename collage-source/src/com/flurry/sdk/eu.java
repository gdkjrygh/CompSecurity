// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

// Referenced classes of package com.flurry.sdk:
//            hp

public final class eu
{

    private int a;
    private long b;
    private String c;
    private String d;
    private String e;
    private Throwable f;

    public eu(int i, long l, String s, String s1, String s2, Throwable throwable)
    {
        a = i;
        b = l;
        c = s;
        d = s1;
        e = s2;
        f = throwable;
    }

    public int a()
    {
        return b().length;
    }

    public byte[] b()
    {
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = new DataOutputStream(bytearrayoutputstream);
        Object obj1 = obj;
        ((DataOutputStream) (obj)).writeShort(a);
        obj1 = obj;
        ((DataOutputStream) (obj)).writeLong(b);
        obj1 = obj;
        ((DataOutputStream) (obj)).writeUTF(c);
        obj1 = obj;
        ((DataOutputStream) (obj)).writeUTF(d);
        obj1 = obj;
        ((DataOutputStream) (obj)).writeUTF(e);
        obj1 = obj;
        if (f == null) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        if (c != "uncaught") goto _L4; else goto _L3
_L3:
        obj1 = obj;
        ((DataOutputStream) (obj)).writeByte(3);
_L8:
        obj1 = obj;
        ((DataOutputStream) (obj)).writeByte(2);
        obj1 = obj;
        StringBuilder stringbuilder = new StringBuilder("");
        obj1 = obj;
        String s = System.getProperty("line.separator");
        obj1 = obj;
        StackTraceElement astacktraceelement[] = f.getStackTrace();
        obj1 = obj;
        int j = astacktraceelement.length;
        int i = 0;
_L6:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        stringbuilder.append(astacktraceelement[i]);
        obj1 = obj;
        stringbuilder.append(s);
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
_L4:
        obj1 = obj;
        ((DataOutputStream) (obj)).writeByte(2);
        if (true) goto _L8; else goto _L7
        obj1;
_L17:
        hp.a(((java.io.Closeable) (obj)));
        return new byte[0];
_L7:
        obj1 = obj;
        if (f.getCause() == null) goto _L10; else goto _L9
_L9:
        obj1 = obj;
        stringbuilder.append(s);
        obj1 = obj;
        stringbuilder.append("Caused by: ");
        obj1 = obj;
        astacktraceelement = f.getCause().getStackTrace();
        obj1 = obj;
        j = astacktraceelement.length;
        i = 0;
_L11:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        stringbuilder.append(astacktraceelement[i]);
        obj1 = obj;
        stringbuilder.append(s);
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        obj1 = obj;
        byte abyte1[] = stringbuilder.toString().getBytes();
        obj1 = obj;
        ((DataOutputStream) (obj)).writeInt(abyte1.length);
        obj1 = obj;
        ((DataOutputStream) (obj)).write(abyte1);
_L13:
        obj1 = obj;
        ((DataOutputStream) (obj)).flush();
        obj1 = obj;
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        hp.a(((java.io.Closeable) (obj)));
        return abyte0;
_L2:
        obj1 = obj;
        ((DataOutputStream) (obj)).writeByte(1);
        obj1 = obj;
        ((DataOutputStream) (obj)).writeByte(0);
        if (true) goto _L13; else goto _L12
_L12:
        obj;
_L15:
        hp.a(((java.io.Closeable) (obj1)));
        throw obj;
        obj;
        obj1 = null;
        if (true) goto _L15; else goto _L14
_L14:
        IOException ioexception;
        ioexception;
        ioexception = null;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public String c()
    {
        return c;
    }
}
