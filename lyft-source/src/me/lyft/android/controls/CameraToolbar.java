// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.controls:
//            Toolbar

public class CameraToolbar extends Toolbar
{

    AppFlow appFlow;
    View toolbarContainer;

    public CameraToolbar(Context context)
    {
        this(context, null);
    }

    public CameraToolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CameraToolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        Scoop.a(this).b(this);
        init();
    }

    private void init()
    {
        setBackgroundColor(getResources().getColor(0x7f0c0001));
        toolbarContainer.setBackgroundColor(getResources().getColor(0x7f0c0001));
        homeView.setBackgroundResource(0x7f020006);
        homeImageView.setBackgroundResource(0x7f020006);
        setHomeIcon(0x7f020132);
        titleTextView.setTextColor(getResources().getColor(0x7f0c00a4));
        dividerView.setVisibility(8);
    }

    protected void onHomeClick()
    {
        super.onHomeClick();
        appFlow.goBack();
    }
}
