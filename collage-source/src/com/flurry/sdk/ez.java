// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.location.Location;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            fa, eu, gd, hp, 
//            ev, ew, gx

public class ez
{
    public static class a
        implements gx
    {

        public ez a(InputStream inputstream)
            throws IOException
        {
            if (inputstream == null)
            {
                return null;
            }
            inputstream = new DataInputStream(this, inputstream) {

                final a a;

                public void close()
                {
                }

            
            {
                a = a1;
                super(inputstream);
            }
            };
            ez ez1 = new ez();
            int i = inputstream.readUnsignedShort();
            if (i > 0)
            {
                byte abyte0[] = new byte[i];
                inputstream.readFully(abyte0);
                ez1.a = abyte0;
            }
            return ez1;
        }

        public void a(OutputStream outputstream, ez ez1)
            throws IOException
        {
            if (outputstream == null || ez1 == null)
            {
                return;
            }
            outputstream = new DataOutputStream(this, outputstream) {

                final a a;

                public void close()
                {
                }

            
            {
                a = a1;
                super(outputstream);
            }
            };
            int i = 0;
            if (ez1.a != null)
            {
                i = ez1.a.length;
            }
            outputstream.writeShort(i);
            if (i > 0)
            {
                outputstream.write(ez1.a);
            }
            outputstream.flush();
        }

        public volatile void a(OutputStream outputstream, Object obj)
            throws IOException
        {
            a(outputstream, (ez)obj);
        }

        public Object b(InputStream inputstream)
            throws IOException
        {
            return a(inputstream);
        }

        public a()
        {
        }
    }


    private static final String b = com/flurry/sdk/ez.getSimpleName();
    byte a[];

    private ez()
    {
    }


    public ez(fa fa1)
        throws IOException
    {
        Object obj1;
        obj1 = null;
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = new DataOutputStream(bytearrayoutputstream);
        ((DataOutputStream) (obj)).writeShort(5);
        ((DataOutputStream) (obj)).writeUTF(fa1.a());
        ((DataOutputStream) (obj)).writeLong(fa1.b());
        ((DataOutputStream) (obj)).writeLong(fa1.c());
        ((DataOutputStream) (obj)).writeLong(fa1.d());
        obj1 = fa1.e();
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ((DataOutputStream) (obj)).writeShort(0);
_L15:
        ((DataOutputStream) (obj)).writeUTF(fa1.f());
        ((DataOutputStream) (obj)).writeUTF(fa1.g());
        ((DataOutputStream) (obj)).writeByte(fa1.h());
        ((DataOutputStream) (obj)).writeByte(fa1.i());
        ((DataOutputStream) (obj)).writeUTF(fa1.j());
        if (fa1.k() != null) goto _L4; else goto _L3
_L3:
        ((DataOutputStream) (obj)).writeBoolean(false);
_L16:
        ((DataOutputStream) (obj)).writeInt(fa1.l());
        ((DataOutputStream) (obj)).writeByte(-1);
        ((DataOutputStream) (obj)).writeByte(-1);
        ((DataOutputStream) (obj)).writeByte(fa1.m());
        if (fa1.n() != null) goto _L6; else goto _L5
_L5:
        ((DataOutputStream) (obj)).writeBoolean(false);
_L17:
        obj1 = fa1.o();
        if (obj1 != null) goto _L8; else goto _L7
_L7:
        ((DataOutputStream) (obj)).writeShort(0);
_L18:
        obj1 = fa1.p();
        if (obj1 != null) goto _L10; else goto _L9
_L9:
        ((DataOutputStream) (obj)).writeShort(0);
_L19:
        ((DataOutputStream) (obj)).writeBoolean(fa1.q());
        obj1 = fa1.s();
        if (obj1 == null) goto _L12; else goto _L11
_L11:
        int i;
        int j;
        int k;
        j = 0;
        k = 0;
        i = 0;
_L23:
        if (j >= ((List) (obj1)).size())
        {
            break MISSING_BLOCK_LABEL_266;
        }
        k += ((eu)((List) (obj1)).get(j)).a();
        if (k <= 0x27100)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        gd.a(5, b, "Error Log size exceeded. No more event details logged.");
_L22:
        ((DataOutputStream) (obj)).writeInt(fa1.r());
        ((DataOutputStream) (obj)).writeShort(i);
        j = 0;
_L14:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        ((DataOutputStream) (obj)).write(((eu)((List) (obj1)).get(j)).b());
        j++;
        if (true) goto _L14; else goto _L13
_L2:
        ((DataOutputStream) (obj)).writeShort(((Map) (obj1)).size());
        obj1 = ((Map) (obj1)).entrySet().iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
            ((DataOutputStream) (obj)).writeUTF((String)entry.getKey());
            ((DataOutputStream) (obj)).writeUTF((String)entry.getValue());
            ((DataOutputStream) (obj)).writeByte(0);
        }
          goto _L15
        obj1;
        fa1 = ((fa) (obj));
        obj = obj1;
_L21:
        gd.a(6, b, "", ((Throwable) (obj)));
        throw obj;
        obj1;
        obj = fa1;
        fa1 = ((fa) (obj1));
_L20:
        hp.a(((java.io.Closeable) (obj)));
        throw fa1;
_L4:
        ((DataOutputStream) (obj)).writeBoolean(true);
        ((DataOutputStream) (obj)).writeDouble(hp.a(fa1.k().getLatitude(), 3));
        ((DataOutputStream) (obj)).writeDouble(hp.a(fa1.k().getLongitude(), 3));
        ((DataOutputStream) (obj)).writeFloat(fa1.k().getAccuracy());
          goto _L16
_L6:
        ((DataOutputStream) (obj)).writeBoolean(true);
        ((DataOutputStream) (obj)).writeLong(fa1.n().longValue());
          goto _L17
_L8:
        ((DataOutputStream) (obj)).writeShort(((Map) (obj1)).size());
        obj1 = ((Map) (obj1)).entrySet().iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            ((DataOutputStream) (obj)).writeUTF((String)entry1.getKey());
            ((DataOutputStream) (obj)).writeInt(((ev)entry1.getValue()).a);
        }
          goto _L18
_L10:
        ((DataOutputStream) (obj)).writeShort(((List) (obj1)).size());
        obj1 = ((List) (obj1)).iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            ((DataOutputStream) (obj)).write(((ew)((Iterator) (obj1)).next()).e());
        }
          goto _L19
_L13:
        ((DataOutputStream) (obj)).writeInt(-1);
        ((DataOutputStream) (obj)).writeShort(0);
        ((DataOutputStream) (obj)).writeShort(0);
        ((DataOutputStream) (obj)).writeShort(0);
        a = bytearrayoutputstream.toByteArray();
        hp.a(((java.io.Closeable) (obj)));
        return;
        fa1;
        obj = null;
          goto _L20
        obj;
        fa1 = ((fa) (obj1));
          goto _L21
_L12:
        i = 0;
          goto _L22
        fa1;
          goto _L20
        i++;
        j++;
          goto _L23
    }

    public ez(byte abyte0[])
    {
        a = abyte0;
    }

    public byte[] a()
    {
        return a;
    }

}
