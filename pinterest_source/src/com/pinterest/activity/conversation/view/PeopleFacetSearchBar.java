// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.ui.grid.RoundProfileImageCell;

// Referenced classes of package com.pinterest.activity.conversation.view:
//            PeopleSearchEditText

public class PeopleFacetSearchBar extends HorizontalScrollView
{

    private int FACET_LEFT_MARGIN;
    private int PEOPLE_WIDTH_HEIGHT;
    private int _initialChildCount;
    LinearLayout _searchContainer;
    PeopleSearchEditText _searchEt;

    public PeopleFacetSearchBar(Context context)
    {
        this(context, null);
    }

    public PeopleFacetSearchBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PeopleFacetSearchBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        PEOPLE_WIDTH_HEIGHT = (int)Resources.dimension(0x7f0a01eb);
        FACET_LEFT_MARGIN = (int)Resources.dimension(0x7f0a0157);
    }

    private void init()
    {
        ButterKnife.a(this);
    }

    public void addTextChangedListener(TextWatcher textwatcher)
    {
        _searchEt.addTextChangedListener(textwatcher);
    }

    public void getFocus()
    {
        _searchEt.requestFocus();
        _searchEt.requestFocusFromTouch();
        Device.showSoftKeyboard(_searchEt);
    }

    protected void onDetachedFromWindow()
    {
        ButterKnife.a(this);
        super.onDetachedFromWindow();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        _initialChildCount = getChildCount();
        init();
    }

    public void onPersonSelected(TypeAheadItem typeaheaditem)
    {
        RoundProfileImageCell roundprofileimagecell = new RoundProfileImageCell(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(PEOPLE_WIDTH_HEIGHT, PEOPLE_WIDTH_HEIGHT);
        layoutparams.leftMargin = FACET_LEFT_MARGIN;
        layoutparams.gravity = 16;
        roundprofileimagecell.setLayoutParams(layoutparams);
        roundprofileimagecell.setTag(typeaheaditem);
        int i = Math.max(0, _searchContainer.getChildCount() - 1);
        _searchContainer.addView(roundprofileimagecell, i);
        _searchEt.setText("");
        if (ModelHelper.isValidString(typeaheaditem.getImageUri()))
        {
            ImageCache.loadImage(roundprofileimagecell, typeaheaditem.getImageUri());
        } else
        {
            roundprofileimagecell.setImageResource(0x7f020182);
        }
        postDelayed(new _cls1(), 100L);
    }

    public void onPersonUnselected(TypeAheadItem typeaheaditem)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < _searchContainer.getChildCount())
                {
                    View view = _searchContainer.getChildAt(i);
                    if (!typeaheaditem.equals(view.getTag()))
                    {
                        break label0;
                    }
                    _searchContainer.removeView(view);
                }
                return;
            }
            i++;
        } while (true);
    }

    public TypeAheadItem removeLastFacet()
    {
        int i = _searchContainer.getChildCount();
        if (i > _initialChildCount)
        {
            i = i - _initialChildCount - 1;
            TypeAheadItem typeaheaditem = (TypeAheadItem)_searchContainer.getChildAt(i).getTag();
            _searchContainer.removeViewAt(i);
            return typeaheaditem;
        } else
        {
            return null;
        }
    }

    public void setSearchEtKeyListener(android.view.View.OnKeyListener onkeylistener)
    {
        _searchEt.setOnKeyListener(onkeylistener);
    }

    private class _cls1
        implements Runnable
    {

        final PeopleFacetSearchBar this$0;

        public void run()
        {
            fullScroll(66);
        }

        _cls1()
        {
            this$0 = PeopleFacetSearchBar.this;
            super();
        }
    }

}
