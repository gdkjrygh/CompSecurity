// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.util.List;

// Referenced classes of package com.google.protobuf.nano:
//            g, f, d, e, 
//            c, j, i, a, 
//            CodedOutputByteBufferNano

public abstract class b extends g
{

    public d unknownFieldData;

    public b()
    {
    }

    public b clone()
    {
        b b1 = (b)super.clone();
        f.a(this, b1);
        return b1;
    }

    public volatile g clone()
    {
        return clone();
    }

    public volatile Object clone()
    {
        return clone();
    }

    public int computeSerializedSize()
    {
        int l = 0;
        int i1;
        if (unknownFieldData != null)
        {
            int k = 0;
            do
            {
                i1 = k;
                if (l >= unknownFieldData.a())
                {
                    break;
                }
                k += unknownFieldData.b(l).a();
                l++;
            } while (true);
        } else
        {
            i1 = 0;
        }
        return i1;
    }

    public final Object getExtension(c c1)
    {
        e e1;
        if (unknownFieldData != null)
        {
            if ((e1 = unknownFieldData.a(j.b(c1.c))) != null)
            {
                if (e1.b != null)
                {
                    if (e1.a != c1)
                    {
                        throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
                    }
                } else
                {
                    e1.a = c1;
                    Object obj = e1.c;
                    if (obj == null)
                    {
                        c1 = null;
                    } else
                    if (c1.d)
                    {
                        c1 = ((c) (c1.a(((List) (obj)))));
                    } else
                    if (((List) (obj)).isEmpty())
                    {
                        c1 = null;
                    } else
                    {
                        i k = (i)((List) (obj)).get(((List) (obj)).size() - 1);
                        obj = c1.b;
                        byte abyte0[] = k.b;
                        c1 = ((c) (((Class) (obj)).cast(c1.a(a.a(abyte0, 0, abyte0.length)))));
                    }
                    e1.b = c1;
                    e1.c = null;
                }
                return e1.b;
            }
        }
        return null;
    }

    public final boolean hasExtension(c c1)
    {
        while (unknownFieldData == null || unknownFieldData.a(j.b(c1.c)) == null) 
        {
            return false;
        }
        return true;
    }

    public final b setExtension(c c1, Object obj)
    {
        boolean flag = true;
        int k = j.b(c1.c);
        if (obj == null)
        {
            if (unknownFieldData != null)
            {
                c1 = unknownFieldData;
                k = c1.c(k);
                if (k >= 0 && ((d) (c1)).c[k] != d.a)
                {
                    ((d) (c1)).c[k] = d.a;
                    c1.b = true;
                }
                if (unknownFieldData.a() != 0)
                {
                    flag = false;
                }
                if (flag)
                {
                    unknownFieldData = null;
                }
            }
            return this;
        }
        e e1;
        if (unknownFieldData == null)
        {
            unknownFieldData = new d();
            e1 = null;
        } else
        {
            e1 = unknownFieldData.a(k);
        }
        if (e1 == null)
        {
            unknownFieldData.a(k, new e(c1, obj));
            return this;
        } else
        {
            e1.a = c1;
            e1.b = obj;
            e1.c = null;
            return this;
        }
    }

    public final boolean storeUnknownField(a a1, int k)
    {
        int i1 = a1.j();
        if (!a1.b(k))
        {
            return false;
        }
        int j1 = j.b(k);
        int k1 = a1.j() - i1;
        Object obj;
        i l;
        if (k1 == 0)
        {
            a1 = j.h;
        } else
        {
            byte abyte0[] = new byte[k1];
            int l1 = a1.b;
            System.arraycopy(a1.a, i1 + l1, abyte0, 0, k1);
            a1 = abyte0;
        }
        l = new i(k, a1);
        a1 = null;
        if (unknownFieldData == null)
        {
            unknownFieldData = new d();
        } else
        {
            a1 = unknownFieldData.a(j1);
        }
        obj = a1;
        if (a1 == null)
        {
            obj = new e();
            unknownFieldData.a(j1, ((e) (obj)));
        }
        ((e) (obj)).c.add(l);
        return true;
    }

    public void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (unknownFieldData != null)
        {
            int k = 0;
            while (k < unknownFieldData.a()) 
            {
                unknownFieldData.b(k).a(codedoutputbytebuffernano);
                k++;
            }
        }
    }
}
