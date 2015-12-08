// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;

// Referenced classes of package kik.android.chat.fragment:
//            KikStartGroupFragment

final class px
    implements android.content.DialogInterface.OnClickListener
{

    final KikStartGroupFragment a;

    px(KikStartGroupFragment kikstartgroupfragment)
    {
        a = kikstartgroupfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(KikStartGroupFragment.b(0x7f090337), KikStartGroupFragment.b(0x7f09001f));
        KikStartGroupFragment.b(a, KikStartGroupFragment.c(a));
    }
}
