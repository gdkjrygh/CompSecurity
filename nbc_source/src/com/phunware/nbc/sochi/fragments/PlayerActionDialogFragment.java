// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.PlaybackDelegate;
import com.nbcsports.liveextra.ui.core.BaseDialogFragment;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.accessenable.SelectProviderActivity;
import com.phunware.nbc.sochi.customview.CustomProgressDialog;
import timber.log.Timber;

public class PlayerActionDialogFragment extends BaseDialogFragment
    implements com.nbcsports.liveextra.library.tve.PlaybackDelegate.Callback
{

    private Asset asset;
    private PlaybackDelegate _flddelegate;
    private com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo mPageInfo;
    AuthService pass;

    public PlayerActionDialogFragment()
    {
    }

    public static PlayerActionDialogFragment getInstance(Asset asset1, com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageinfo)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("asset", asset1);
        bundle.putParcelable("pageInfo", pageinfo);
        asset1 = new PlayerActionDialogFragment();
        asset1.setArguments(bundle);
        return asset1;
    }

    public void authenticate()
    {
        if (isActivityDead())
        {
            return;
        } else
        {
            Intent intent = new Intent(getActivity(), com/phunware/nbc/sochi/accessenable/SelectProviderActivity);
            intent.putExtra("asset", asset);
            intent.putExtra("pageInfo", mPageInfo);
            getActivity().startActivityForResult(intent, 200);
            getActivity().overridePendingTransition(0x7f05000c, 0x7f05000d);
            dismiss();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        _flddelegate = new PlaybackDelegate(getActivity(), asset, mPageInfo, this);
        _flddelegate.authorize();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        MainNavigationContentActivity.component().inject(this);
        bundle = getArguments();
        asset = (Asset)bundle.getParcelable("asset");
        mPageInfo = (com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo)bundle.getParcelable("pageInfo");
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = CustomProgressDialog.show(getActivity(), null, null);
        bundle.setCancelable(false);
        return bundle;
    }

    public void onPause()
    {
        super.onPause();
        pass.unregister(_flddelegate);
    }

    public void onPlaybackDismiss()
    {
        try
        {
            dismiss();
            return;
        }
        catch (Exception exception)
        {
            Timber.e(exception, "Error dismissing player action dialog", new Object[0]);
        }
    }

    public void onResume()
    {
        super.onResume();
        pass.register(_flddelegate);
    }
}
