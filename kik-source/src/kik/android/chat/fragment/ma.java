// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase

final class ma
    implements Runnable
{

    final KikIqFragmentBase a;

    ma(KikIqFragmentBase kikiqfragmentbase)
    {
        a = kikiqfragmentbase;
        super();
    }

    public final void run()
    {
        a.a(null);
    }
}
