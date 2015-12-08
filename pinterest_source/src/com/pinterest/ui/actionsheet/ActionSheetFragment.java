// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Colors;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.FontUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.pinterest.ui.actionsheet:
//            ActionSheetItemView

public class ActionSheetFragment extends BaseFragment
{

    private static final int SLIDE_DURATION = 300;
    View _dismissBg;
    private ActionSheetItem _footerItem;
    private ActionSheetItem _headerItem;
    private List _items;
    LinearLayout _sheetContainer;
    private boolean _showDivider;

    public ActionSheetFragment()
    {
        _items = new LinkedList();
        _showDivider = true;
    }

    private ActionSheetItemView createItem(ActionSheetItem actionsheetitem)
    {
        ActionSheetItemView actionsheetitemview = new ActionSheetItemView(getActivity());
        actionsheetitemview.setText(actionsheetitem.text);
        actionsheetitemview.setOnClickListener(actionsheetitem.onClickListener);
        if (actionsheetitem.leftDrawable != 0)
        {
            actionsheetitemview.setLeftDrawable(actionsheetitem.leftDrawable);
        }
        actionsheetitemview.setTextColor(actionsheetitem.color);
        actionsheetitemview.showDivider(_showDivider);
        actionsheetitemview.setGrayOut(actionsheetitem.grayOut);
        return actionsheetitemview;
    }

    private void init()
    {
        if (_headerItem != null)
        {
            _sheetContainer.addView(createHeader(_headerItem));
        }
        ActionSheetItem actionsheetitem;
        for (Iterator iterator = _items.iterator(); iterator.hasNext(); _sheetContainer.addView(createItem(actionsheetitem)))
        {
            actionsheetitem = (ActionSheetItem)iterator.next();
        }

        if (_footerItem != null)
        {
            _sheetContainer.addView(createFooter(_footerItem));
        }
        float f = Math.max(Device.getScreenWidth(), Device.getScreenHeight());
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_sheetContainer, "translationY", new float[] {
            f, 0.0F
        });
        objectanimator.setDuration(300L);
        objectanimator.setInterpolator(new DecelerateInterpolator());
        objectanimator.start();
    }

    public void addFooter(String s)
    {
        addFooter(s, null);
    }

    public void addFooter(String s, android.view.View.OnClickListener onclicklistener)
    {
        _footerItem = new ActionSheetItem(s, onclicklistener);
    }

    public void addHeader(String s)
    {
        addHeader(s, null);
    }

    public void addHeader(String s, android.view.View.OnClickListener onclicklistener)
    {
        _headerItem = new ActionSheetItem(s, onclicklistener);
    }

    public void addItem(ActionSheetItem actionsheetitem)
    {
        _items.add(actionsheetitem);
    }

    public void addItem(String s, android.view.View.OnClickListener onclicklistener)
    {
        _items.add(new ActionSheetItem(s, onclicklistener));
    }

    public void clear()
    {
        _headerItem = null;
        _footerItem = null;
        _items.clear();
    }

    public ActionSheetItemView createFooter(ActionSheetItem actionsheetitem)
    {
        actionsheetitem = createItem(actionsheetitem);
        TextView textview = ((ActionSheetItemView) (actionsheetitem))._tv;
        textview.setTextSize(0, Resources.dimension(0x7f0a01d9));
        textview.setSingleLine(false);
        textview.setTextColor(Colors.TEXT_LIGHT);
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT, textview);
        actionsheetitem.showDivider(false);
        return actionsheetitem;
    }

    public ActionSheetItemView createHeader(ActionSheetItem actionsheetitem)
    {
        actionsheetitem = createItem(actionsheetitem);
        ((ActionSheetItemView) (actionsheetitem))._tv.setTextSize(0, Resources.dimension(0x7f0a01e2));
        return actionsheetitem;
    }

    public void dismiss()
    {
        AnimatorSet animatorset = new AnimatorSet();
        float f = Math.max(Device.getScreenWidth(), Device.getScreenHeight());
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(_sheetContainer, "translationY", new float[] {
                0.0F, f
            }).setDuration(300L), ObjectAnimator.ofFloat(_dismissBg, "alpha", new float[] {
                1.0F, 0.0F
            }).setDuration(300L)
        });
        animatorset.addListener(new _cls1());
        animatorset.start();
    }

    void dismissClicked(View view)
    {
        dismiss();
    }

    public void dismissImmediately()
    {
        getActivity().onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300a4;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        init();
    }

    public void setShowDivider(boolean flag)
    {
        _showDivider = flag;
    }

    public void show()
    {
        Events.post(new ActionSheetEvent());
    }

    private class ActionSheetItem
    {

        public static final int COLOR_DEFAULT = Resources.color(0x7f0e00a9);
        public int color;
        public boolean grayOut;
        public int leftDrawable;
        public android.view.View.OnClickListener onClickListener;
        public String text;

        public void setGrayOut(boolean flag)
        {
            grayOut = flag;
        }

        public ActionSheetItem setLeftDrawable(int i)
        {
            leftDrawable = i;
            return this;
        }

        public ActionSheetItem setTextColor(int i)
        {
            color = i;
            return this;
        }


        public ActionSheetItem(int i, android.view.View.OnClickListener onclicklistener)
        {
            this(Resources.string(i), onclicklistener);
        }

        public ActionSheetItem(String s, android.view.View.OnClickListener onclicklistener)
        {
            color = COLOR_DEFAULT;
            text = s;
            onClickListener = onclicklistener;
        }
    }


    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final ActionSheetFragment this$0;

        public void onAnimationEnd(Animator animator)
        {
            if (getActivity() != null)
            {
                getActivity().onBackPressed();
            }
        }

        _cls1()
        {
            this$0 = ActionSheetFragment.this;
            super();
        }
    }


    private class ActionSheetEvent
    {

        private ActionSheetFragment _fragment;

        public ActionSheetFragment getFragment()
        {
            return _fragment;
        }

        public ActionSheetEvent()
        {
            _fragment = ActionSheetFragment.this;
        }
    }

}
