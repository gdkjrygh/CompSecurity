// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aetn.history.android.historyhere.model.PhotoData;
import com.aetn.history.android.historyhere.utils.Utils;

public class PhotoFragment extends Fragment
{

    private final String TAG = "PhotoFragment";

    public PhotoFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03002d, viewgroup, false);
    }

    public void onResume()
    {
        Utils.logger("PhotoFragment", "onResume()");
        super.onResume();
    }

    public void setData(PhotoData photodata)
    {
    }
}
