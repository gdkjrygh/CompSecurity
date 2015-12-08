// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikStartGroupFragment

final class pp
    implements android.view.View.OnClickListener
{

    final KikStartGroupFragment a;

    pp(KikStartGroupFragment kikstartgroupfragment)
    {
        a = kikstartgroupfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.setGroupPicture();
    }
}
