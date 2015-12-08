// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.protobuf.nano:
//            CodedOutputByteBufferNano, c, i, g

final class e
    implements Cloneable
{

    c a;
    Object b;
    List c;

    e()
    {
        c = new ArrayList();
    }

    e(c c1, Object obj)
    {
        a = c1;
        b = obj;
    }

    private byte[] c()
    {
        byte abyte0[] = new byte[a()];
        a(CodedOutputByteBufferNano.a(abyte0, 0, abyte0.length));
        return abyte0;
    }

    final int a()
    {
        int k = 0;
        if (b != null)
        {
            c c1 = a;
            Object obj = b;
            int j1;
            if (c1.d)
            {
                int k1 = Array.getLength(obj);
                int l = 0;
                do
                {
                    j1 = k;
                    if (l >= k1)
                    {
                        break;
                    }
                    j1 = k;
                    if (Array.get(obj, l) != null)
                    {
                        j1 = k + c1.a(Array.get(obj, l));
                    }
                    l++;
                    k = j1;
                } while (true);
            } else
            {
                j1 = c1.a(obj);
            }
            return j1;
        }
        Iterator iterator = c.iterator();
        i j;
        int i1;
        for (k = 0; iterator.hasNext(); k = j.b.length + (i1 + 0) + k)
        {
            j = (i)iterator.next();
            i1 = CodedOutputByteBufferNano.d(j.a);
        }

        return k;
    }

    final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            c c1 = a;
            Object obj = b;
            if (c1.d)
            {
                int l = Array.getLength(obj);
                for (int k = 0; k < l; k++)
                {
                    Object obj1 = Array.get(obj, k);
                    if (obj1 != null)
                    {
                        c1.a(obj1, codedoutputbytebuffernano);
                    }
                }

            } else
            {
                c1.a(obj, codedoutputbytebuffernano);
            }
        } else
        {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                i j = (i)iterator.next();
                codedoutputbytebuffernano.c(j.a);
                codedoutputbytebuffernano.b(j.b);
            }
        }
    }

    public final e b()
    {
        Object obj;
        int j;
        j = 0;
        obj = new e();
        obj.a = a;
        if (c != null) goto _L2; else goto _L1
_L1:
        obj.c = null;
_L7:
        if (b == null) goto _L4; else goto _L3
_L3:
        if (!(b instanceof g)) goto _L6; else goto _L5
_L5:
        obj.b = ((g)b).clone();
        return ((e) (obj));
_L2:
        try
        {
            ((e) (obj)).c.addAll(c);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
          goto _L7
_L6:
        if (!(b instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj.b = ((byte[])b).clone();
        return ((e) (obj));
        if (!(b instanceof byte[][])) goto _L9; else goto _L8
_L8:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])b;
        obj2 = new byte[obj1.length][];
        obj.b = obj2;
        j = 0;
_L10:
        if (j >= obj1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2[j] = (byte[])obj1[j].clone();
        j++;
        if (true) goto _L10; else goto _L4
_L9:
        if (!(b instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj.b = ((boolean[])b).clone();
        return ((e) (obj));
        if (!(b instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj.b = ((int[])b).clone();
        return ((e) (obj));
        if (!(b instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj.b = ((long[])b).clone();
        return ((e) (obj));
        if (!(b instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_283;
        }
        obj.b = ((float[])b).clone();
        return ((e) (obj));
        if (!(b instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj.b = ((double[])b).clone();
        return ((e) (obj));
        if (!(b instanceof g[])) goto _L4; else goto _L11
_L11:
        obj1 = (g[])b;
        obj2 = new g[obj1.length];
        obj.b = obj2;
_L13:
        if (j >= obj1.length) goto _L4; else goto _L12
_L12:
        obj2[j] = obj1[j].clone();
        j++;
          goto _L13
_L4:
        return ((e) (obj));
    }

    public final Object clone()
    {
        return b();
    }

    public final boolean equals(Object obj)
    {
        boolean flag2 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag2;
            if (obj instanceof e)
            {
                obj = (e)obj;
                if (b != null && ((e) (obj)).b != null)
                {
                    flag = flag2;
                    if (a == ((e) (obj)).a)
                    {
                        if (!a.b.isArray())
                        {
                            return b.equals(((e) (obj)).b);
                        }
                        if (b instanceof byte[])
                        {
                            return Arrays.equals((byte[])b, (byte[])((e) (obj)).b);
                        }
                        if (b instanceof int[])
                        {
                            return Arrays.equals((int[])b, (int[])((e) (obj)).b);
                        }
                        if (b instanceof long[])
                        {
                            return Arrays.equals((long[])b, (long[])((e) (obj)).b);
                        }
                        if (b instanceof float[])
                        {
                            return Arrays.equals((float[])b, (float[])((e) (obj)).b);
                        }
                        if (b instanceof double[])
                        {
                            return Arrays.equals((double[])b, (double[])((e) (obj)).b);
                        }
                        if (b instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])b, (boolean[])((e) (obj)).b);
                        } else
                        {
                            return Arrays.deepEquals((Object[])b, (Object[])((e) (obj)).b);
                        }
                    }
                } else
                {
                    if (c != null && ((e) (obj)).c != null)
                    {
                        return c.equals(((e) (obj)).c);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(c(), ((e) (obj)).c());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw new IllegalStateException(((Throwable) (obj)));
                    }
                    return flag1;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int j;
        try
        {
            j = Arrays.hashCode(c());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return j + 527;
    }
}
