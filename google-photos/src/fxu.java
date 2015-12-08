// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;
import android.widget.Switch;
import com.google.android.apps.photos.localmedia.ui.LocalPhotosHeaderView;

public final class fxu
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private LocalPhotosHeaderView a;

    public fxu(LocalPhotosHeaderView localphotosheaderview)
    {
        a = localphotosheaderview;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (LocalPhotosHeaderView.a(a).b())
        {
            LocalPhotosHeaderView.c(a).setChecked(LocalPhotosHeaderView.b(a).b);
        }
        LocalPhotosHeaderView.d(a).a(flag);
    }
}
