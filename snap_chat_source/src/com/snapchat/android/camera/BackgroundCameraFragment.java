// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;

import Ll;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.camera.cameradecor.CameraDecor;
import com.snapchat.android.camera.model.CameraModel;
import qA;

// Referenced classes of package com.snapchat.android.camera:
//            BaseCameraFragment

public class BackgroundCameraFragment extends BaseCameraFragment
{

    public CameraModel a;

    public BackgroundCameraFragment()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    public final int a()
    {
        return 0x7f04000a;
    }

    protected final CameraDecor a(RelativeLayout relativelayout)
    {
        return new qA(getActivity(), relativelayout);
    }

    public final void a(int i)
    {
        ((qA)d).b.setBackgroundColor(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        a.a(com.snapchat.android.camera.model.CameraModel.CameraType.FRONT_FACING);
        return mFragmentLayout;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b = null;
        d = null;
    }
}
