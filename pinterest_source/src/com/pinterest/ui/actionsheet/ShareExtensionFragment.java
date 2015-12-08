// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.schemas.experiences.Placement;
import com.pinterest.ui.text.PButton;

public class ShareExtensionFragment extends BaseFragment
{

    PButton _dismissButton;
    private ExperienceValue _exp;
    PButton _sharePositiveButton;

    public ShareExtensionFragment()
    {
        _layoutId = 0x7f03019b;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(_layoutId, viewgroup, false);
        ButterKnife.a(this, layoutinflater);
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _dismissButton.setOnClickListener(new _cls1());
        _sharePositiveButton.setOnClickListener(new _cls2());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        } else
        {
            _exp = Experiences.a(String.valueOf(Placement.ANDROID_HOME_FEED_TAKEOVER.getValue()));
            return;
        }
    }




    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ShareExtensionFragment this$0;

        public void onClick(View view)
        {
            if (_exp != null)
            {
                _exp.c();
            }
            pressBackButton();
        }

        _cls1()
        {
            this$0 = ShareExtensionFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ShareExtensionFragment this$0;

        public void onClick(View view)
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Resources.string(0x7f07074d)));
            intent.addFlags(0x10000000);
            intent.setPackage("com.android.chrome");
            view = view.getContext();
            if (_exp != null)
            {
                _exp.b();
            }
            try
            {
                view.startActivity(intent);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                intent.setPackage(null);
                view.startActivity(intent);
            }
            pressBackButton();
        }

        _cls2()
        {
            this$0 = ShareExtensionFragment.this;
            super();
        }
    }

}
