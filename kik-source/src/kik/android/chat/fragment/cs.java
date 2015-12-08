// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            cr, KikChatFragment, KikDialogFragment

final class cs
    implements Runnable
{

    final KikDialogFragment a;
    final cr b;

    cs(cr cr1, KikDialogFragment kikdialogfragment)
    {
        b = cr1;
        a = kikdialogfragment;
        super();
    }

    public final void run()
    {
        b.a.a(a);
    }
}
