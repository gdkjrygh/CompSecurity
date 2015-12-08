// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.protobuf.nano:
//            j, g, CodedOutputByteBufferNano, a, 
//            i

public final class c
{

    public final int a = 11;
    public final Class b;
    public final int c;
    public final boolean d = false;

    private c(Class class1, int k)
    {
        b = class1;
        c = k;
    }

    public static c a(Class class1, long l)
    {
        return new c(class1, (int)l);
    }

    final int a(Object obj)
    {
        int k = j.b(c);
        switch (a)
        {
        default:
            k = a;
            throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(k).toString());

        case 10: // '\n'
            return CodedOutputByteBufferNano.b(k, (g)obj);

        case 11: // '\013'
            return CodedOutputByteBufferNano.c(k, (g)obj);
        }
    }

    final Object a(a a1)
    {
        Object obj;
        if (d)
        {
            obj = b.getComponentType();
        } else
        {
            obj = b;
        }
        a;
        JVM INSTR tableswitch 10 11: default 221
    //                   10 128
    //                   11 150;
           goto _L1 _L2 _L3
_L1:
        int k = a;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(k).toString());
_L2:
        g g1;
        try
        {
            g1 = (g)((Class) (obj)).newInstance();
            a1.a(g1, j.b(c));
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new IllegalArgumentException("Error reading extension field", a1);
        }
        return g1;
_L3:
        g1 = (g)((Class) (obj)).newInstance();
        a1.a(g1);
        return g1;
    }

    final Object a(List list)
    {
        ArrayList arraylist;
        boolean flag;
        int j1;
        flag = false;
        arraylist = new ArrayList();
        for (int l = 0; l < list.size(); l++)
        {
            i k = (i)list.get(l);
            if (k.b.length != 0)
            {
                byte abyte0[] = k.b;
                arraylist.add(a(com.google.protobuf.nano.a.a(abyte0, 0, abyte0.length)));
            }
        }

        j1 = arraylist.size();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        Object obj = b.cast(Array.newInstance(b.getComponentType(), j1));
        int i1 = ((flag) ? 1 : 0);
        do
        {
            list = ((List) (obj));
            if (i1 >= j1)
            {
                continue;
            }
            Array.set(obj, i1, arraylist.get(i1));
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.c(c);
        a;
        JVM INSTR tableswitch 10 11: default 114
    //                   10 80
    //                   11 105;
           goto _L1 _L2 _L3
_L1:
        int k = a;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(k).toString());
_L2:
        try
        {
            obj = (g)obj;
            int l = j.b(c);
            ((g) (obj)).writeTo(codedoutputbytebuffernano);
            codedoutputbytebuffernano.f(l, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        codedoutputbytebuffernano.a((g)obj);
        return;
    }
}
