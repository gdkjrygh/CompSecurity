// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.pinterest.activity.board.view.FollowSimilarBoardsLayout;
import com.pinterest.ui.actionbar.MetadataBar;
import com.pinterest.ui.actions.ScrollableListener;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0
    implements ScrollableListener
{

    final BaseBoardFragment this$0;

    private void slideBoardRecommendationsContainerAway(float f)
    {
        ViewPropertyAnimator viewpropertyanimator = BaseBoardFragment.access$300(BaseBoardFragment.this).animate().translationY(-1F * f);
        class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
        {

            final BaseBoardFragment._cls3 this$1;

            public void onAnimationEnd(Animator animator)
            {
                BaseBoardFragment.access$300(this$0).setVisibility(8);
            }

            _cls1()
            {
                this$1 = BaseBoardFragment._cls3.this;
                super();
            }
        }

        viewpropertyanimator.setListener(new _cls1());
        viewpropertyanimator.start();
    }

    public void onScroll(View view, int i, int j, int k, int l)
    {
        if (BaseBoardFragment.access$100(BaseBoardFragment.this) && BaseBoardFragment.access$200(BaseBoardFragment.this))
        {
            BaseBoardFragment.access$202(BaseBoardFragment.this, false);
            float f = BaseBoardFragment.access$300(BaseBoardFragment.this).getHeight();
            if (_useLibraryStyle)
            {
                f += BaseBoardFragment.access$400(BaseBoardFragment.this).getHeight();
            } else
            {
                f += _floatingMetadataBar.getHeight();
            }
            slideBoardRecommendationsContainerAway(f);
        }
    }

    _cls1()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
