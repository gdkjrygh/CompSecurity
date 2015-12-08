// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import kik.android.sdkutils.concurrent.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class mw
    implements android.view.View.OnClickListener
{

    final KikMultiselectContactsListFragment a;

    mw(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.g.setVisibility(0);
        a.o.stop();
        a.o.start();
        a.k.setVisibility(8);
        view = (String)view.getTag();
        a.x.a(view);
        a.x.a();
        a.z();
    }
}
