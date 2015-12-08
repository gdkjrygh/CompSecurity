// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.utils.TransitionUtils;
import com.soundcloud.android.view.screen.BaseLayoutHelper;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchPresenter

public class SearchActivity extends ScActivity
{

    BaseLayoutHelper layoutHelper;
    PlayerController playerController;
    SearchPresenter presenter;

    public SearchActivity()
    {
    }

    private void dismiss()
    {
        if (TransitionUtils.transitionsSupported())
        {
            ((ViewGroup)findViewById(0x7f0f0022)).getChildAt(1).animate().alpha(0.0F).setDuration(300L).setListener(new _cls2()).start();
            return;
        } else
        {
            supportFinishAfterTransition();
            return;
        }
    }

    private void setBgClickHandler()
    {
        findViewById(0x7f0f0226).setOnClickListener(new _cls1());
    }

    public void onBackPressed()
    {
        if (!playerController.handleBackPressed())
        {
            dismiss();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        TransitionUtils.setChangeBoundsEnterTransition(getWindow(), 500, new DecelerateInterpolator());
        TransitionUtils.setChangeBoundsExitTransition(getWindow(), 200, new DecelerateInterpolator());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    protected void setActivityContentView()
    {
        layoutHelper.createActionBarLayout(this, 0x7f0300a9);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setBgClickHandler();
    }


    private class _cls2 extends AnimatorListenerAdapter
    {

        final SearchActivity this$0;

        public void onAnimationEnd(Animator animator)
        {
            supportFinishAfterTransition();
        }

        _cls2()
        {
            this$0 = SearchActivity.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SearchActivity this$0;

        public void onClick(View view)
        {
            dismiss();
        }

        _cls1()
        {
            this$0 = SearchActivity.this;
            super();
        }
    }

}
