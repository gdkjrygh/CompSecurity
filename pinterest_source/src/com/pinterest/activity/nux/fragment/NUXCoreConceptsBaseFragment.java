// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.experience.ExperienceEnabled;

public abstract class NUXCoreConceptsBaseFragment extends BaseFragment
    implements ExperienceEnabled
{

    public me.grantland.widget.AutofitHelper.OnTextSizeChangeListener textSizeChange;

    public NUXCoreConceptsBaseFragment()
    {
        textSizeChange = new _cls1();
    }

    public abstract void applyAnimation();

    private class _cls1
        implements me.grantland.widget.AutofitHelper.OnTextSizeChangeListener
    {

        final NUXCoreConceptsBaseFragment this$0;

        public void onTextSizeChange(float f, float f1)
        {
            Events.post(new com.pinterest.activity.nux.NUXCoreConceptsTitleResizeHelper.NUXCoreConceptsTitleSizeChangedEvent(f));
        }

        _cls1()
        {
            this$0 = NUXCoreConceptsBaseFragment.this;
            super();
        }
    }

}
