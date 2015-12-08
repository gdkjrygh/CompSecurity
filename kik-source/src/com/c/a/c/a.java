// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;


// Referenced classes of package com.c.a.c:
//            k, n

abstract class a
    implements k
{

    a()
    {
    }

    public k a(CharSequence charsequence)
    {
        int i = 0;
        for (int j = charsequence.length(); i < j; i++)
        {
            a(charsequence.charAt(i));
        }

        return this;
    }

    public n b(CharSequence charsequence)
    {
        return a(charsequence);
    }
}
