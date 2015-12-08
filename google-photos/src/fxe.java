// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.apps.photos.localmedia.ui.LocalFoldersHeaderView;

public final class fxe extends dud
{

    private LocalFoldersHeaderView a;

    public fxe(LocalFoldersHeaderView localfoldersheaderview)
    {
        a = localfoldersheaderview;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        LocalFoldersHeaderView.d(a).setVisibility(8);
    }
}
