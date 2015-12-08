// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikPermissionsFragment

final class nh
    implements android.view.View.OnClickListener
{

    final KikPermissionsFragment a;

    nh(KikPermissionsFragment kikpermissionsfragment)
    {
        a = kikpermissionsfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.J();
    }
}
