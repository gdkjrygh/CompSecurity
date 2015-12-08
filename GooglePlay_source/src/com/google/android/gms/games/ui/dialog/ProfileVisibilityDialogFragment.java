// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.common.players.ProfileVisibilityHelper;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogFragment, GamesDialogBuilder

public final class ProfileVisibilityDialogFragment extends GamesDialogFragment
    implements android.view.View.OnClickListener
{

    private ProfileVisibilityHelper mHelper;
    private boolean mPublic;

    public ProfileVisibilityDialogFragment()
    {
    }

    protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        int i = -1;
        bundle = super.mActivity;
        if (!(bundle instanceof com.google.android.gms.games.ui.common.players.ProfileVisibilityHelper.ProfileVisibilityHelperProvider))
        {
            throw new IllegalStateException("Caller must provide profile visibility switching.");
        }
        mHelper = (ProfileVisibilityHelper)Preconditions.checkNotNull(((com.google.android.gms.games.ui.common.players.ProfileVisibilityHelper.ProfileVisibilityHelperProvider)bundle).getProfileVisibilityHelper());
        mPublic = mHelper.isProfileVisibilityPublic();
        bundle = bundle.getLayoutInflater().inflate(0x7f0400be, null);
        bundle.setOnClickListener(this);
        Resources resources = super.mActivity.getResources();
        TextView textview = (TextView)bundle.findViewById(0x7f0d024b);
        int j;
        if (mPublic)
        {
            textview.setText(0x7f100226);
            if (PlatformVersion.checkVersion(11))
            {
                i = resources.getColor(0x7f0b008f);
            }
        } else
        {
            textview.setText(0x7f100225);
            if (PlatformVersion.checkVersion(11))
            {
                i = resources.getColor(0x7f0b008e);
            }
        }
        textview.setTextColor(i);
        if (mPublic)
        {
            i = 0x7f100222;
        } else
        {
            i = 0x7f100221;
        }
        if (mPublic)
        {
            j = 0x7f100224;
        } else
        {
            j = 0x7f100223;
        }
        return gamesdialogbuilder.setTitle(0x7f10022c).setView(bundle).setPositiveButton(i, this).setNegativeButton(j, null);
    }

    public final void onClick(int i)
    {
        if (i == -1)
        {
            ProfileVisibilityHelper profilevisibilityhelper = mHelper;
            boolean flag;
            if (!mPublic)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            profilevisibilityhelper.setProfileVisibility(flag);
        }
        dismissInternal(false);
    }

    public final void onClick(View view)
    {
        if (view.getId() != 0x7f0d024a || !isAttachedToParent())
        {
            return;
        } else
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)G.playGamesProfileVisibilityWebpageUrl.get())));
            return;
        }
    }
}
