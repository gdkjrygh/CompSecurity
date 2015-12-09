// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.api.GamesDestinationApi;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

public final class ProfileSummaryDialogFragment extends DialogFragment
    implements android.view.View.OnClickListener
{

    private boolean mFinishOnExit;
    private boolean mIsSelf;
    private Player mPlayer;

    public ProfileSummaryDialogFragment()
    {
    }

    public static ProfileSummaryDialogFragment newInstance(Player player, boolean flag)
    {
        return newInstance(player, flag, false);
    }

    public static ProfileSummaryDialogFragment newInstance(Player player, boolean flag, boolean flag1)
    {
        ProfileSummaryDialogFragment profilesummarydialogfragment = new ProfileSummaryDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.games.PLAYER", (Parcelable)player.freeze());
        bundle.putBoolean("isSelf", flag);
        bundle.putBoolean("finishOnExit", flag1);
        profilesummarydialogfragment.setArguments(bundle);
        return profilesummarydialogfragment;
    }

    public final void onClick(View view)
    {
        view = ((View) (UiUtils.getValidTag(view)));
        if (view != null && (view instanceof Player))
        {
            FragmentActivity fragmentactivity = super.mActivity;
            if (fragmentactivity == null)
            {
                GamesLog.w("ProfileSummaryDFrag", "onClick: getActivity() returned null");
            } else
            {
                view = fragmentactivity.getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
                if (view == null)
                {
                    Asserts.checkState(fragmentactivity instanceof GamesFragmentActivity);
                    view = ((GamesFragmentActivity)fragmentactivity).mConfiguration.getCurrentAccountName();
                }
                if (view == null)
                {
                    GamesLog.w("ProfileSummaryDFrag", "No account name specified!");
                    return;
                }
                if (mIsSelf)
                {
                    GamesDestinationApi.checkClientUi(fragmentactivity);
                    Bundle bundle = new Bundle();
                    GamesIntents.addObfuscatedAccount(bundle, view);
                    bundle.putBoolean("com.google.android.gms.games.FORCE_RESOLVE_ACCOUNT_KEY", true);
                    Intent intent = new Intent("com.google.android.gms.games.destination.VIEW_MY_PROFILE");
                    intent.putExtras(bundle);
                    GamesDestinationApi.startIntent(fragmentactivity, intent, view);
                } else
                {
                    Player player = mPlayer;
                    GamesDestinationApi.checkClientUi(fragmentactivity);
                    Bundle bundle1 = new Bundle();
                    GamesIntents.addObfuscatedAccount(bundle1, view);
                    bundle1.putBoolean("com.google.android.gms.games.FORCE_RESOLVE_ACCOUNT_KEY", true);
                    Intent intent1 = new Intent("com.google.android.gms.games.destination.VIEW_PROFILE_COMPARISON");
                    intent1.putExtras(bundle1);
                    Asserts.checkNotNull(player, "The given player cannot be null");
                    bundle1 = new Bundle();
                    android.content.Context context = UiUtils.getDestinationAppContext(fragmentactivity);
                    boolean flag;
                    if (!com.google.android.gms.common.internal.DowngradeableSafeParcel.DowngradeableSafeParcelHelper.putParcelable(bundle1, "com.google.android.gms.games.OTHER_PLAYER", (PlayerEntity)player.freeze(), context, GamesDestinationApi.getDestinationAppClientJarVersion(fragmentactivity)))
                    {
                        GamesLog.i("GamesDestApi", "Failed to downgrade player safely! Aborting.");
                        flag = false;
                    } else
                    {
                        intent1.putExtras(bundle1);
                        flag = true;
                    }
                    if (!flag)
                    {
                        GamesLog.e("GamesDestApi", "viewProfileComparison - Failed to add the player to the Intent");
                    } else
                    {
                        GamesDestinationApi.startIntent(fragmentactivity, intent1, view);
                    }
                }
                if (mFinishOnExit)
                {
                    super.mActivity.finish();
                    return;
                }
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = super.mArguments;
        mPlayer = (Player)bundle.getParcelable("com.google.android.gms.games.PLAYER");
        mIsSelf = bundle.getBoolean("isSelf");
        mFinishOnExit = bundle.getBoolean("finishOnExit");
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.requestWindowFeature(1);
        return bundle;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400bd, viewgroup, false);
        viewgroup = mPlayer;
        Object obj = layoutinflater.findViewById(0x7f0d023a);
        Object obj1 = layoutinflater.findViewById(0x7f0d0172);
        bundle = layoutinflater.findViewById(0x7f0d0247);
        MetagameAvatarView metagameavatarview = (MetagameAvatarView)layoutinflater.findViewById(0x7f0d01ba);
        TextView textview1 = (TextView)layoutinflater.findViewById(0x7f0d0236);
        TextView textview2 = (TextView)layoutinflater.findViewById(0x7f0d01d5);
        TextView textview = (TextView)layoutinflater.findViewById(0x7f0d0105);
        View view = layoutinflater.findViewById(0x7f0d0072);
        view.setOnClickListener(this);
        Resources resources = getResources();
        float af[];
        int i;
        if (!TextUtils.isEmpty(viewgroup.getTitle()))
        {
            textview1.setText(viewgroup.getTitle());
            textview1.setVisibility(0);
        } else
        {
            textview1.setVisibility(8);
        }
        textview2.setText(viewgroup.getDisplayName());
        metagameavatarview.setData(viewgroup);
        metagameavatarview.setOutlineStrokeWidthResId(0x7f0c0108);
        metagameavatarview.setShadowStrokeWidthResId(0x7f0c0109);
        i = UiUtils.getLevelColor(resources, viewgroup.getLevelInfo().mCurrentLevel.mLevelNumber);
        af = new float[3];
        Color.colorToHSV(i, af);
        af[2] = af[2] * 0.5F;
        ((View) (obj1)).setBackgroundColor(Color.HSVToColor(af));
        obj1 = ((View) (obj)).getLayoutParams();
        obj1.height = resources.getDimensionPixelSize(0x7f0c0239);
        ((View) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        if (mIsSelf)
        {
            textview.setText(resources.getString(0x7f1002ac));
        } else
        {
            textview.setText(resources.getString(0x7f1002a4));
        }
        obj = bundle.getLayoutParams();
        obj.height = (int)(float)(resources.getDimensionPixelSize(0x7f0c0239) + resources.getDimensionPixelSize(0x7f0c0232) + resources.getDimensionPixelSize(0x7f0c0229));
        bundle.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        bundle.setBackgroundResource(0x106000b);
        bundle.setPadding(0, 0, 0, 0);
        view.setTag(viewgroup.freeze());
        view.setContentDescription(resources.getString(0x7f10022a, new Object[] {
            viewgroup.getDisplayName(), viewgroup.getTitle()
        }));
        return layoutinflater;
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (mFinishOnExit && super.mActivity != null)
        {
            super.mActivity.finish();
        }
    }
}
