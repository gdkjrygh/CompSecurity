// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import FZ;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            ForgetDeviceFragment

final class a extends FZ
{

    private ForgetDeviceFragment a;

    protected final void a()
    {
        dismiss();
        a.getActivity().onBackPressed();
    }

    (ForgetDeviceFragment forgetdevicefragment, Context context, String s)
    {
        a = forgetdevicefragment;
        super(context, s);
    }
}
