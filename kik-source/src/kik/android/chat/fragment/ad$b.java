// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            ad

protected final class a
{

    a a[];
    final ad b;

    final a a(int i)
    {
        if (i < 0 || i >= a.length)
        {
            return null;
        } else
        {
            return a[i];
        }
    }

    (ad ad1)
    {
        b = ad1;
        super();
        a = new a[ad1.b];
    }
}
