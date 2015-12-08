// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.localmedia.ui.LocalFoldersHeaderView;

public final class fxd
    implements android.view.View.OnClickListener
{

    private LocalFoldersHeaderView a;

    public fxd(LocalFoldersHeaderView localfoldersheaderview)
    {
        a = localfoldersheaderview;
        super();
    }

    public final void onClick(View view)
    {
        LocalFoldersHeaderView.c(a).a(a, LocalFoldersHeaderView.b(a));
    }
}
