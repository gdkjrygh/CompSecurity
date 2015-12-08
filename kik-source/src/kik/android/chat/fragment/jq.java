// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment, jr

final class jq
    implements Runnable
{

    final KikConversationsFragment a;

    jq(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void run()
    {
        KikDialogFragment.a a1 = new KikDialogFragment.a(a.getResources());
        a1.b(a.getString(0x7f090132)).a(a.getString(0x7f09033d)).c(0x7f090193, new jr(this)).a(false);
        a.a(a1.a);
    }
}
