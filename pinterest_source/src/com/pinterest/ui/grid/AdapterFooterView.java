// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.ui.progress.LoadingView;

public class AdapterFooterView extends RelativeLayout
{

    public static final int STATE_LOADED = 1;
    public static final int STATE_LOADING = 0;
    public static final int STATE_NONE = 2;
    private View _footerLayout;
    private LoadingView _spinner;
    private int _state;

    public AdapterFooterView(Context context)
    {
        this(context, null);
    }

    public AdapterFooterView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AdapterFooterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _state = 2;
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f030174, this);
        setBackgroundResource(0x7f02014a);
        _spinner = (LoadingView)findViewById(0x7f0f01d0);
        _footerLayout = findViewById(0x7f0f0391);
        updateView();
    }

    public static final void setState(AdapterFooterView adapterfooterview, int i)
    {
        if (adapterfooterview != null)
        {
            adapterfooterview.setState(i);
        }
    }

    private void updateView()
    {
        switch (_state)
        {
        default:
            return;

        case 0: // '\0'
            _spinner.setState(0);
            _footerLayout.setVisibility(0);
            return;

        case 1: // '\001'
            _spinner.setState(2);
            _footerLayout.setVisibility(0);
            return;

        case 2: // '\002'
            _spinner.setState(2);
            break;
        }
        _footerLayout.setVisibility(8);
    }

    protected void onDetachedFromWindow()
    {
        removeAllViews();
        super.onDetachedFromWindow();
    }

    public void setShadowVisibility(int i)
    {
        findViewById(0x7f0f0392).setVisibility(i);
    }

    public void setState(int i)
    {
        _state = i;
        updateView();
    }
}
