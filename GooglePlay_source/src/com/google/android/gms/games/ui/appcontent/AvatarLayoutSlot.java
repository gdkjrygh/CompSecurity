// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.text.TextUtils;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentUtils

public final class AvatarLayoutSlot extends LayoutSlot
{

    private final MetagameAvatarView mAvatarView;
    private final ArrayList mClickableViews = new ArrayList();

    public AvatarLayoutSlot(MetagameAvatarView metagameavatarview)
    {
        mAvatarView = metagameavatarview;
        mClickableViews.add(mAvatarView);
    }

    public final void addSharedViews(SharedElementTransition sharedelementtransition)
    {
        mAvatarView.addSharedViews(sharedelementtransition);
    }

    public final int getAnimationType()
    {
        return 3;
    }

    public final List getClickableViews()
    {
        return mClickableViews;
    }

    public final void resetAnnotation()
    {
        super.resetAnnotation();
        mAvatarView.setVisibility(8);
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        super.setAnnotation(appcontentannotation);
        android.net.Uri uri = appcontentannotation.getImageUri();
        int i = AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId());
        appcontentannotation = appcontentannotation.getTitle();
        if (TextUtils.isEmpty(appcontentannotation))
        {
            mAvatarView.setData(uri, i, 1);
        } else
        if (TextUtils.isDigitsOnly(appcontentannotation))
        {
            mAvatarView.setData(uri, i, Integer.parseInt(appcontentannotation));
        } else
        {
            mAvatarView.setData(uri, i, appcontentannotation);
        }
        mAvatarView.setVisibility(0);
    }
}
