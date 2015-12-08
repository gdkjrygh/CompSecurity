// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.snapchat.android.util.fragment.SnapchatFragment;

final class lang.Object
    implements android.view.OnClickListener
{

    private xT a;

    public final void onClick(View view)
    {
        xT.a(a).getActivity().onBackPressed();
    }

    >(xT xt)
    {
        a = xt;
        super();
    }
}
