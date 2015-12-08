// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.Unit;
import me.lyft.android.utils.MetricsUtils;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func1;
import rx.subjects.PublishSubject;

public class Toolbar extends LinearLayout
{

    private static final int NO_HOME_ICON_LEFT_MARGIN_DP = 12;
    View dividerView;
    View driverModeToggleView;
    final PublishSubject homeClick;
    ImageView homeImageView;
    View homeView;
    final LayoutInflater inflater;
    final PublishSubject itemClick;
    private Action1 itemClickAction;
    LinearLayout itemsContainerView;
    ImageView logoImageView;
    final MetricsUtils metricsUtils;
    TextView titleTextView;
    private final Func1 toolbarItemAsId;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        itemClick = PublishSubject.create();
        homeClick = PublishSubject.create();
        itemClickAction = Actions.empty();
        toolbarItemAsId = new Func1() {

            final Toolbar this$0;

            public Integer call(ToolbarItem toolbaritem)
            {
                return Integer.valueOf(toolbaritem.id);
            }

            public volatile Object call(Object obj)
            {
                return call((ToolbarItem)obj);
            }

            
            {
                this$0 = Toolbar.this;
                super();
            }

            private class ToolbarItem
            {

                private final int iconId;
                private final int id;
                private int layoutId;
                private int textColor;
                private final String title;
                private int typefaceStyle;

                public int getIconId()
                {
                    return iconId;
                }

                public int getId()
                {
                    return id;
                }

                public int getLayoutId()
                {
                    return layoutId;
                }

                public int getTextColor()
                {
                    return textColor;
                }

                public String getTitle()
                {
                    return title;
                }

                public int getTypefaceStyle()
                {
                    return typefaceStyle;
                }

                public ToolbarItem setLayoutId(int i)
                {
                    layoutId = i;
                    return this;
                }


                public ToolbarItem(int i, int j)
                {
                    this(i, null, j, -1);
                }

                public ToolbarItem(int i, String s)
                {
                    this(i, s, 0, -1);
                }

                public ToolbarItem(int i, String s, int j)
                {
                    this(i, s, j, -1);
                }

                public ToolbarItem(int i, String s, int j, int k)
                {
                    this(i, s, j, k, -1);
                }

                public ToolbarItem(int i, String s, int j, int k, int l)
                {
                    layoutId = 0x7f030140;
                    id = i;
                    title = s;
                    iconId = j;
                    textColor = k;
                    typefaceStyle = l;
                }
            }

        };
        inflater = Scoop.a(this).a(getContext());
        inflater.inflate(0x7f03013f, this, true);
        metricsUtils = MetricsUtils.fromView(this);
        ButterKnife.a(this, this);
        homeImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final Toolbar this$0;

            public void onClick(View view)
            {
                onHomeClick();
            }

            
            {
                this$0 = Toolbar.this;
                super();
            }
        });
    }

    private Toolbar setItemViewEnabled(int i, boolean flag)
    {
        View view = ButterKnife.a(itemsContainerView, i);
        if (view != null)
        {
            view.setEnabled(flag);
        }
        return this;
    }

    private Toolbar show(View view, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        return this;
    }

    private Toolbar showLogo(boolean flag)
    {
        show(logoImageView, flag);
        return this;
    }

    private Toolbar showTitle(boolean flag)
    {
        show(titleTextView, flag);
        return this;
    }

    public Toolbar addItem(int i, int j)
    {
        return addItem(new ToolbarItem(i, j));
    }

    public Toolbar addItem(int i, String s)
    {
        return addItem(new ToolbarItem(i, s));
    }

    public Toolbar addItem(int i, String s, int j)
    {
        return addItem(new ToolbarItem(i, s, j));
    }

    public Toolbar addItem(int i, String s, int j, int k)
    {
        return addItem(new ToolbarItem(i, s, j, k));
    }

    public Toolbar addItem(int i, String s, int j, int k, int l)
    {
        return addItem(new ToolbarItem(i, s, j, k, l));
    }

    public Toolbar addItem(final ToolbarItem toolbarItem)
    {
        View view = inflater.inflate(toolbarItem.getLayoutId(), itemsContainerView, false);
        view.setId(toolbarItem.getId());
        TextView textview = (TextView)ButterKnife.a(view, 0x7f0d0061);
        ImageView imageview = (ImageView)ButterKnife.a(view, 0x7f0d0337);
        if (textview != null)
        {
            if (TextUtils.isEmpty(toolbarItem.getTitle()))
            {
                textview.setVisibility(8);
            } else
            {
                textview.setText(toolbarItem.getTitle());
            }
        }
        if (toolbarItem.getTextColor() != -1)
        {
            textview.setTextColor(toolbarItem.getTextColor());
        }
        if (toolbarItem.getTypefaceStyle() != -1)
        {
            textview.setTypeface(null, toolbarItem.getTypefaceStyle());
        }
        if (imageview != null)
        {
            if (toolbarItem.getIconId() == 0)
            {
                imageview.setVisibility(8);
            } else
            {
                imageview.setImageResource(toolbarItem.getIconId());
            }
        }
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final Toolbar this$0;
            final ToolbarItem val$toolbarItem;

            public void onClick(View view1)
            {
                itemClick.onNext(toolbarItem);
                itemClickAction.call(Integer.valueOf(toolbarItem.id));
            }

            
            {
                this$0 = Toolbar.this;
                toolbarItem = toolbaritem;
                super();
            }
        });
        itemsContainerView.addView(view);
        return this;
    }

    public Toolbar clearItems()
    {
        itemsContainerView.removeAllViews();
        return this;
    }

    public Toolbar disableHomeButton()
    {
        setHomeButtonEnabled(false);
        return this;
    }

    public Toolbar disableItem(int i)
    {
        setItemViewEnabled(i, false);
        return this;
    }

    public Toolbar displayBackButton()
    {
        setHomeIcon(0x7f0200fd);
        return this;
    }

    public Toolbar displayMenuButton()
    {
        setHomeIcon(0x7f020108);
        return this;
    }

    public Toolbar enableHomeButton()
    {
        setHomeButtonEnabled(true);
        return this;
    }

    public Toolbar enableItem(int i)
    {
        setItemViewEnabled(i, true);
        return this;
    }

    public View getToolbarItemView(int i)
    {
        return ButterKnife.a(itemsContainerView, i);
    }

    public Toolbar hideDivider()
    {
        dividerView.setVisibility(8);
        return this;
    }

    public Toolbar hideDriverModeToggle()
    {
        driverModeToggleView.setVisibility(8);
        return this;
    }

    public Toolbar hideHomeIcon()
    {
        setHomeIconVisible(false);
        return this;
    }

    public Toolbar hideItem(int i)
    {
        setItemVisible(i, false);
        return this;
    }

    public Observable observeHomeClick()
    {
        return homeClick.asObservable();
    }

    public Observable observeItemClick()
    {
        return itemClick.map(toolbarItemAsId).asObservable();
    }

    protected void onHomeClick()
    {
        homeClick.onNext(Unit.create());
    }

    public Toolbar removeItem(int i)
    {
        View view = ButterKnife.a(itemsContainerView, i);
        if (view != null)
        {
            itemsContainerView.removeView(view);
        }
        return this;
    }

    public Toolbar setHomeButtonEnabled(boolean flag)
    {
        homeView.setEnabled(flag);
        return this;
    }

    public void setHomeIcon(int i)
    {
        homeImageView.setImageResource(i);
    }

    public Toolbar setHomeIconVisible(boolean flag)
    {
        ImageView imageview = homeImageView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        if (flag)
        {
            i = 0;
        } else
        {
            i = metricsUtils.dpToPixels(12F);
        }
        logoImageView.setPadding(i, 0, 0, 0);
        titleTextView.setPadding(i, 0, 0, 0);
        return this;
    }

    public Toolbar setItemVisible(int i, boolean flag)
    {
        View view = ButterKnife.a(itemsContainerView, i);
        if (view != null)
        {
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
        return this;
    }

    public Toolbar setLogo(int i)
    {
        logoImageView.setImageResource(i);
        showLogo();
        return this;
    }

    public void setOnItemClickAction(Action1 action1)
    {
        itemClickAction = action1;
    }

    public Toolbar setTitle(String s)
    {
        titleTextView.setText(s);
        showTitle();
        return this;
    }

    public Toolbar showDivider()
    {
        dividerView.setVisibility(0);
        return this;
    }

    public Toolbar showDriverModeToggle()
    {
        driverModeToggleView.setVisibility(0);
        return this;
    }

    public Toolbar showHomeIcon()
    {
        setHomeIconVisible(true);
        return this;
    }

    public Toolbar showItem(int i)
    {
        setItemVisible(i, true);
        return this;
    }

    public void showLogo()
    {
        showTitle(false);
        showLogo(true);
    }

    public Toolbar showTitle()
    {
        showTitle(true);
        showLogo(false);
        return this;
    }

}
