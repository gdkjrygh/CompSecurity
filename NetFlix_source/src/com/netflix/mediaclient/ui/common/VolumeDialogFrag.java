// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.widget.NetflixSeekBar;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;

public class VolumeDialogFrag extends NetflixDialogFrag
    implements android.widget.SeekBar.OnSeekBarChangeListener, com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag.MdxMiniPlayerDialog
{

    private static final String TAG = "VolumeDialogFrag";
    private NetflixSeekBar seekBar;

    public VolumeDialogFrag()
    {
    }

    private int getMostRecentVolume()
    {
        MdxMiniPlayerFrag mdxminiplayerfrag = ((NetflixActivity)getActivity()).getMdxMiniPlayerFrag();
        if (mdxminiplayerfrag != null)
        {
            return mdxminiplayerfrag.getVolume();
        } else
        {
            return 100;
        }
    }

    public static VolumeDialogFrag newInstance()
    {
        VolumeDialogFrag volumedialogfrag = new VolumeDialogFrag();
        volumedialogfrag.setStyle(1, 0x7f0d00cb);
        return volumedialogfrag;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030088, viewgroup, false);
        seekBar = (NetflixSeekBar)layoutinflater.findViewById(0x7f0701ad);
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setMax(100);
        return layoutinflater;
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
    }

    public void onResume()
    {
        super.onResume();
        seekBar.setProgress(getMostRecentVolume());
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        int i = seekbar.getProgress();
        Log.v("VolumeDialogFrag", (new StringBuilder()).append("Setting mdx volume to: ").append(i).toString());
        ((NetflixActivity)getActivity()).getMdxMiniPlayerFrag().setVolume(i);
    }
}
