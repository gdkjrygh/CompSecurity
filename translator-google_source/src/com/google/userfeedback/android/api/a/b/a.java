// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.b;

import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package com.google.userfeedback.android.api.a.b:
//            c

public final class a
{

    public Object a[];
    public Hashtable b;
    public int c;
    public int d;
    public int e;

    public a()
    {
        this((byte)0);
    }

    private a(byte byte0)
    {
        a = new Object[Math.min(16, 128)];
        e = 0;
        d = 0x80000000;
        c = 0x80000000;
    }

    private int a()
    {
        if (b == null)
        {
            return e;
        } else
        {
            return e + b.size();
        }
    }

    public final Object a(int i)
    {
        Object obj1 = null;
        Object obj;
        if (i <= c && i >= 0)
        {
            obj = a[i];
        } else
        {
            obj = obj1;
            if (i <= d)
            {
                obj = obj1;
                if (b != null)
                {
                    return b.get(com.google.userfeedback.android.api.a.b.c.a(i));
                }
            }
        }
        return obj;
    }

    public final void a(int i, Object obj)
    {
        boolean flag;
        flag = false;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (i < 0 || i >= a.length) goto _L2; else goto _L1
_L1:
        if (a[i] != null)
        {
            e = e - 1;
        }
        a[i] = null;
_L4:
        return;
_L2:
        if (b == null) goto _L4; else goto _L3
_L3:
        b.remove(com.google.userfeedback.android.api.a.b.c.a(i));
        return;
        if (i > d)
        {
            d = i;
        }
        if (i >= 0 && i < a.length) goto _L6; else goto _L5
_L5:
        int j;
        j = ((flag) ? 1 : 0);
        if (i < 128)
        {
            j = ((flag) ? 1 : 0);
            if (i >= a.length)
            {
                j = ((flag) ? 1 : 0);
                if (i > 0)
                {
                    j = a.length;
                    int k;
                    do
                    {
                        k = j << 1;
                        j = k;
                    } while (k <= i);
                    Object aobj[] = new Object[Math.min(k, 128)];
                    System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, a.length);
                    a = aobj;
                    j = 1;
                }
            }
        }
        if (j == 0) goto _L7; else goto _L6
_L6:
        if (i <= c) goto _L9; else goto _L8
_L8:
        c = i;
        e = e + 1;
_L10:
        a[i] = obj;
        return;
_L9:
        if (a[i] == null)
        {
            e = e + 1;
        }
        if (true) goto _L10; else goto _L7
_L7:
        if (b == null)
        {
            b = new Hashtable();
        }
        b.put(com.google.userfeedback.android.api.a.b.c.a(i), obj);
        return;
    }

    public final boolean equals(Object obj)
    {
        Object obj1;
        Object aobj[];
        int i;
        int j;
        if (this == obj)
        {
            return true;
        }
        if (obj == null || !(obj instanceof a))
        {
            return false;
        }
        obj1 = (a)obj;
        if (a() != ((a) (obj1)).a())
        {
            return false;
        }
        obj = ((Object) (a));
        aobj = ((a) (obj1)).a;
        i = Math.min(obj.length, aobj.length);
        j = 0;
_L10:
        if (j >= i) goto _L2; else goto _L1
_L1:
        if ((obj[j] != null || aobj[j] == null) && (obj[j] == null || obj[j].equals(aobj[j]))) goto _L4; else goto _L3
_L3:
        i = 0;
_L5:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj = b;
        obj1 = ((a) (obj1)).b;
        if (obj == obj1)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        if (obj == null || obj1 == null)
        {
            i = 0;
        } else
        if (((Hashtable) (obj)).size() != ((Hashtable) (obj1)).size())
        {
            i = 0;
        } else
        {
            Enumeration enumeration = ((Hashtable) (obj)).keys();
            Object obj2;
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break MISSING_BLOCK_LABEL_293;
                }
                obj2 = enumeration.nextElement();
            } while (((Hashtable) (obj)).get(obj2).equals(((Hashtable) (obj1)).get(obj2)));
            i = 0;
        }
_L8:
        if (i != 0)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_299;
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj.length <= aobj.length)
        {
            break MISSING_BLOCK_LABEL_188;
        }
_L6:
label0:
        {
            if (i >= obj.length)
            {
                break MISSING_BLOCK_LABEL_224;
            }
            if (obj[i] == null)
            {
                break label0;
            }
            i = 0;
        }
          goto _L5
        i++;
          goto _L6
        if (obj.length >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_224;
        }
_L7:
label1:
        {
            if (i >= aobj.length)
            {
                break MISSING_BLOCK_LABEL_224;
            }
            if (aobj[i] == null)
            {
                break label1;
            }
            i = 0;
        }
          goto _L5
        i++;
          goto _L7
        i = 1;
          goto _L5
        i = 1;
          goto _L8
        return false;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final int hashCode()
    {
        int j = 1;
        for (int i = 0; i < a.length;)
        {
            Object obj = a[i];
            int k = j;
            if (obj != null)
            {
                k = j * 31 + obj.hashCode() + i;
            }
            i++;
            j = k;
        }

        if (b == null)
        {
            return j;
        } else
        {
            return j + b.size();
        }
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("IntMap{lower:");
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != null)
            {
                stringbuffer.append(i);
                stringbuffer.append("=>");
                stringbuffer.append(a[i]);
                stringbuffer.append(", ");
            }
        }

        String s = String.valueOf(b);
        stringbuffer.append((new StringBuilder(String.valueOf(s).length() + 10)).append(", higher:").append(s).append("}").toString());
        return stringbuffer.toString();
    }
}
