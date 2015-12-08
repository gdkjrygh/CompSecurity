// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.PlaybackDelegate;
import com.nbcsports.liveextra.ui.core.BaseDialogFragment;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.accessenable.SelectProviderActivity;
import com.phunware.nbc.sochi.content.ContentState;
import com.phunware.nbc.sochi.views.RoundedImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class DetailActionDialogFragment extends BaseDialogFragment
    implements com.nbcsports.liveextra.library.tve.PlaybackDelegate.Callback
{

    private Asset asset;
    Configuration config;
    private PlaybackDelegate _flddelegate;
    private Drawable displayImage;
    FavoriteService favorites;
    private Dialog mDialog;
    private String mEventID;
    private ImageView mIsFavoriteImage;
    private com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo mPageInfo;
    private View mParentView;
    private TextView mPlayButtonFont;
    AuthService pass;
    Picasso picasso;
    private AssetViewModel viewModel;

    public DetailActionDialogFragment()
    {
        displayImage = null;
        mDialog = null;
    }

    private AlertDialog buildAlertDialog()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        mParentView = getActivity().getLayoutInflater().inflate(0x7f040032, null);
        ButterKnife.bind(this, mParentView);
        builder.setView(mParentView);
        builder.setCancelable(true);
        return builder.create();
    }

    public static DetailActionDialogFragment getInstance(Asset asset1, com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageinfo)
    {
        DetailActionDialogFragment detailactiondialogfragment = new DetailActionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("asset", asset1);
        bundle.putParcelable("pageInfo", pageinfo);
        detailactiondialogfragment.setArguments(bundle);
        return detailactiondialogfragment;
    }

    private void showFavoriteSavedDialog(String s, Drawable drawable)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        Object obj = getActivity().getLayoutInflater();
        builder.setCancelable(true);
        obj = ((LayoutInflater) (obj)).inflate(0x7f040036, null);
        TextView textview = (TextView)((View) (obj)).findViewById(0x7f0f0047);
        RoundedImageView roundedimageview = (RoundedImageView)((View) (obj)).findViewById(0x7f0f0043);
        if (drawable != null)
        {
            roundedimageview.setImageDrawable(drawable);
        }
        textview.setText(s);
        builder.setView(((View) (obj))).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final DetailActionDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = DetailActionDialogFragment.this;
                super();
            }
        });
        builder.create().show();
    }

    private void updateView()
    {
        mIsFavoriteImage = (ImageView)mParentView.findViewById(0x7f0f0083);
        final boolean isFavorite = favorites.isFavorite(mEventID);
        mIsFavoriteImage.setSelected(isFavorite);
        Object obj = (TextView)mParentView.findViewById(0x7f0f009e);
        TextView textview = (TextView)mParentView.findViewById(0x7f0f00a1);
        TextView textview1 = (TextView)mParentView.findViewById(0x7f0f00a3);
        RoundedImageView roundedimageview = (RoundedImageView)mParentView.findViewById(0x7f0f009f);
        if (roundedimageview != null)
        {
            picasso.load(viewModel.getThumbnailImageUri(config.getImagesBaseURL())).into(roundedimageview);
            displayImage = roundedimageview.getDrawable();
            roundedimageview.setOnClickListener(new android.view.View.OnClickListener() {

                final DetailActionDialogFragment this$0;

                public void onClick(View view)
                {
                    if (mDialog != null)
                    {
                        mDialog.dismiss();
                    }
                }

            
            {
                this$0 = DetailActionDialogFragment.this;
                super();
            }
            });
        }
        if (obj != null && asset.getTitle() != null)
        {
            ((TextView) (obj)).setText(asset.getTitle());
        }
        if (textview != null && asset.getInfo() != null)
        {
            textview.setText(asset.getInfo());
        }
        if (textview1 != null && asset.getStart() != null)
        {
            textview1.setText(asset.getStart().getDisplayDate(getResources().getConfiguration().locale));
        }
        mPlayButtonFont = (TextView)mParentView.findViewById(0x7f0f00a4);
        obj = ContentState.isLive(asset.getStatus());
        if (obj != com.phunware.nbc.sochi.content.ContentState.EventState.LIVE && obj != com.phunware.nbc.sochi.content.ContentState.EventState.VOD && obj != com.phunware.nbc.sochi.content.ContentState.EventState.FER)
        {
            if (isFavorite)
            {
                mPlayButtonFont.setText(getString(0x7f070173));
            } else
            {
                mPlayButtonFont.setText(getString(0x7f070046));
            }
        }
        viewModel.initSelectedSource(getResources().getString(0x7f070032));
        if (obj == com.phunware.nbc.sochi.content.ContentState.EventState.HIDDEN || viewModel.getStreamUrl() == null && viewModel.getFailoverStreamUrl() == null)
        {
            mPlayButtonFont.setText("Close");
            mIsFavoriteImage.setVisibility(8);
            picasso.load(viewModel.getShowcaseImageUri(config.getImagesBaseURL())).placeholder(0x7f030000).resize(240, 240).centerInside().into(roundedimageview);
        }
        if (mPlayButtonFont != null)
        {
            mPlayButtonFont.setEnabled(true);
            mPlayButtonFont.setOnClickListener(new android.view.View.OnClickListener() {

                final DetailActionDialogFragment this$0;
                final boolean val$isFavorite;

                public void onClick(View view)
                {
                    if (mPlayButtonFont != null)
                    {
                        if (mPlayButtonFont.getText().toString().equals(getString(0x7f070046)))
                        {
                            DetailActionDialogFragment detailactiondialogfragment;
                            if (isFavorite)
                            {
                                mPlayButtonFont.setText(getString(0x7f070173));
                            } else
                            {
                                showFavoriteSavedDialog((new StringBuilder()).append(asset.getTitle()).append("\r\n").append(asset.getInfo()).toString(), displayImage);
                                favorites.addFavorite(asset);
                            }
                            mDialog.dismiss();
                        }
                        if (mPlayButtonFont.getText().toString().equals(getString(0x7f070173)))
                        {
                            favorites.deleteFavorite(mEventID);
                            view = getActivity();
                            detailactiondialogfragment = DetailActionDialogFragment.this;
                            int i;
                            if (asset.isLive() || asset.isFuture())
                            {
                                i = 0x7f070172;
                            } else
                            {
                                i = 0x7f070110;
                            }
                            Toast.makeText(view, detailactiondialogfragment.getString(i), 1).show();
                            mDialog.dismiss();
                        }
                        if (mPlayButtonFont.getText().toString().equals("Close"))
                        {
                            mDialog.dismiss();
                            return;
                        }
                        if (mPlayButtonFont.getText().toString().contains("Play") || mPlayButtonFont.getText().toString().contains("Ver"))
                        {
                            _flddelegate.authorize();
                            return;
                        }
                    }
                }

            
            {
                this$0 = DetailActionDialogFragment.this;
                isFavorite = flag;
                super();
            }
            });
        }
        if (mIsFavoriteImage != null)
        {
            mIsFavoriteImage.setOnClickListener(new android.view.View.OnClickListener() {

                final DetailActionDialogFragment this$0;
                final boolean val$isFavorite;

                public void onClick(View view)
                {
label0:
                    {
                        dismiss();
                        if (mIsFavoriteImage != null)
                        {
                            mIsFavoriteImage.setSelected(isFavorite);
                            if (!isFavorite)
                            {
                                break label0;
                            }
                            favorites.deleteFavorite(mEventID);
                            view = getActivity();
                            DetailActionDialogFragment detailactiondialogfragment = DetailActionDialogFragment.this;
                            int i;
                            if (asset.isLive() || asset.isFuture())
                            {
                                i = 0x7f070172;
                            } else
                            {
                                i = 0x7f070110;
                            }
                            Toast.makeText(view, detailactiondialogfragment.getString(i), 1).show();
                        }
                        return;
                    }
                    favorites.addFavorite(asset);
                    showFavoriteSavedDialog((new StringBuilder()).append(asset.getTitle()).append("\r\n").append(asset.getInfo()).toString(), displayImage);
                }

            
            {
                this$0 = DetailActionDialogFragment.this;
                isFavorite = flag;
                super();
            }
            });
        }
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
            intent.putExtra("allow_temp_pass", pass.isTempPassEnabled());
            getActivity().startActivityForResult(intent, 100);
            getActivity().overridePendingTransition(0x7f05000c, 0x7f05000d);
            dismiss();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        _flddelegate = new PlaybackDelegate(getActivity(), asset, mPageInfo, this);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (j)
        {
        default:
            return;

        case -1: 
            _flddelegate.authorize();
            break;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (MainNavigationContentActivity.component() == null)
        {
            bundle = getActivity();
            if (bundle != null && !bundle.isFinishing())
            {
                bundle.finish();
            }
            return;
        } else
        {
            MainNavigationContentActivity.component().inject(this);
            bundle = getArguments();
            asset = (Asset)bundle.getParcelable("asset");
            viewModel = new AssetViewModel(asset);
            mPageInfo = (com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo)bundle.getParcelable("pageInfo");
            mEventID = asset.getCoalescedEventId();
            return;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = buildAlertDialog();
        bundle.setCanceledOnTouchOutside(true);
        bundle.getWindow().getAttributes().windowAnimations = 0x7f0a00c1;
        mDialog = bundle;
        return mDialog;
    }

    public void onPause()
    {
        super.onPause();
        pass.unregister(_flddelegate);
    }

    public void onPlaybackDismiss()
    {
        if (getActivity() == null || getActivity().isFinishing())
        {
            return;
        }
        try
        {
            dismiss();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        pass.register(_flddelegate);
        updateView();
    }








}
