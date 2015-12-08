// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikDialogFragment

final class a
{

    final KikDialogFragment a;
    private String b;
    private android.content.ickListener c;

    public final String a()
    {
        return b;
    }

    public final void a(android.content.ickListener icklistener)
    {
        c = icklistener;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final android.content.ickListener b()
    {
        return c;
    }

    r(KikDialogFragment kikdialogfragment)
    {
        a = kikdialogfragment;
        super();
    }
}
