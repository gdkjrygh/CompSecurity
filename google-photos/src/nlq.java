// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class nlq
{

    final Uri a;
    final int b;
    private Class c;

    public nlq(Uri uri, int i, Class class1)
    {
        a = uri;
        b = i;
        c = class1;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof nlq)
            {
                obj = (nlq)obj;
                flag = flag1;
                if (b == ((nlq) (obj)).b)
                {
                    flag = flag1;
                    if (a.equals(((nlq) (obj)).a))
                    {
                        flag = flag1;
                        if (c.equals(((nlq) (obj)).c))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(a, b + c.a(c, 31) * 31);
    }

    public final String toString()
    {
        String s = String.valueOf("MediaStoreTokenMapKey{uri=");
        String s1 = String.valueOf(a);
        int i = b;
        String s2 = String.valueOf(c.getName());
        return (new StringBuilder(String.valueOf(s).length() + 44 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", accountId=").append(i).append(", synchronizerClass=").append(s2).append("}").toString();
    }
}
