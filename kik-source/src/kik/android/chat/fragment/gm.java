// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            gl, KikChatInfoFragment

final class gm
    implements Runnable
{

    final gl a;

    gm(gl gl1)
    {
        a = gl1;
        super();
    }

    public final void run()
    {
        KikChatInfoFragment.m(a.a);
    }
}
