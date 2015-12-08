// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.localmedia.ui.LocalFoldersHeaderView;

public final class fxc
    implements android.view.View.OnClickListener
{

    private fwy a;
    private fux b;

    fxc(LocalFoldersHeaderView localfoldersheaderview, fwy fwy1, fux fux)
    {
        a = fwy1;
        b = fux;
        super();
    }

    public final void onClick(View view)
    {
        a.a(b);
    }
}
