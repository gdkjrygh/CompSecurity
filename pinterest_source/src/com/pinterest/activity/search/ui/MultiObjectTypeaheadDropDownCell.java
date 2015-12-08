// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.search.model.GuidedSearchTypeAheadItem;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.IconView;
import com.pinterest.ui.text.PTextView;

public class MultiObjectTypeaheadDropDownCell extends LinearLayout
{

    RelativeLayout _autocompleteHeader;
    TextView _autocompleteText;
    protected String _currentSearchTerm;
    TextView _desc;
    TextView _desc2;
    View _dividerView;
    TextView _historyHeader;
    TextView _historyHeaderClear;
    RelativeLayout _historyHeaderWrapper;
    IconView _iconImage;
    WebImageView _imageView;
    RelativeLayout _imageWrapperLayout;
    protected GuidedSearchTypeAheadItem _item;
    ImageView _overlayImage;
    View _rightImageLayout;
    ImageView _searchLeftIcon;
    View _sectionBody;
    LinearLayout _sectionHeader;
    PTextView _titleTextView;

    public MultiObjectTypeaheadDropDownCell(Context context)
    {
        super(context);
    }

    public MultiObjectTypeaheadDropDownCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void adjustTitleTypeface()
    {
        if ((_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_MY_PIN) && !Experiments.s())
        {
            _titleTextView.setTypeface(Typeface.DEFAULT);
            return;
        } else
        {
            _titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
            return;
        }
    }

    private void loadRightImage()
    {
label0:
        {
            if (_rightImageLayout != null)
            {
                if (_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER_HEADER || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN)
                {
                    break label0;
                }
                _rightImageLayout.setVisibility(8);
            }
            return;
        }
        if (_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_MY_PIN || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER_HEADER)
        {
            _rightImageLayout.setVisibility(0);
            return;
        } else
        {
            _rightImageLayout.setVisibility(8);
            return;
        }
    }

    private void removeEmptySpaceHeaderMargin(boolean flag)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)_sectionHeader.getLayoutParams();
        if (flag)
        {
            layoutparams.setMargins(0, 0, 0, 0);
        } else
        {
            layoutparams.setMargins(0, Constants.SEARH_TYPEAHEAD_EMPTY_HEADER_MARGIN, 0, 0);
        }
        _sectionHeader.setLayoutParams(layoutparams);
    }

    private void removeImageWrapperMargins(boolean flag)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)_imageWrapperLayout.getLayoutParams();
        if (flag)
        {
            layoutparams.setMargins(0, 0, 0, 0);
        } else
        {
            layoutparams.setMargins(0, 0, Constants.LIST_CELL_TEXT_IMAGE_GAP, 0);
        }
        _imageWrapperLayout.setLayoutParams(layoutparams);
    }

    private void resetCells()
    {
        _imageView.clear();
        _titleTextView.setText(null);
        _desc.setText(null);
        _desc2.setText(null);
        _desc.setCompoundDrawables(null, null, null, null);
        _titleTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }

    private void setBackground()
    {
        switch (_cls1..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[_item.getItemType().ordinal()])
        {
        default:
            setBackgroundResource(0x7f020040);
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            setBackgroundColor(Resources.color(0x7f0e0024));
            break;
        }
    }

    private void setSectionBody()
    {
        switch (_cls1..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[_item.getItemType().ordinal()])
        {
        default:
            _sectionBody.setVisibility(8);
            return;

        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
            _sectionBody.setVisibility(0);
            break;
        }
        loadLeftImage();
        loadRightImage();
        setTitle();
        setDesc();
    }

    private void setSectionHeader()
    {
        _cls1..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[_item.getItemType().ordinal()];
        JVM INSTR tableswitch 1 12: default 76
    //                   1 292
    //                   2 86
    //                   3 86
    //                   4 86
    //                   5 86
    //                   6 165
    //                   7 234
    //                   8 234
    //                   9 234
    //                   10 234
    //                   11 234
    //                   12 234;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L4 _L5 _L5 _L5 _L5 _L5 _L5
_L1:
        _sectionHeader.setVisibility(8);
_L7:
        return;
_L3:
        _sectionHeader.setVisibility(0);
        _historyHeaderWrapper.setVisibility(0);
        _dividerView.setVisibility(8);
        _historyHeader.setText(_item.getTitle());
        _autocompleteHeader.setVisibility(8);
        _historyHeaderClear.setVisibility(8);
        if (_item.getItemType() != com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER) goto _L7; else goto _L6
_L6:
        _historyHeaderClear.setVisibility(0);
        return;
_L4:
        _sectionHeader.setVisibility(0);
        _historyHeaderWrapper.setVisibility(8);
        _dividerView.setVisibility(8);
        _autocompleteHeader.setVisibility(8);
        _historyHeaderClear.setVisibility(8);
        if (_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.EMPTY_SPACE_HEADER)
        {
            removeEmptySpaceHeaderMargin(false);
            return;
        } else
        {
            removeEmptySpaceHeaderMargin(true);
            return;
        }
_L5:
        _sectionHeader.setVisibility(0);
        _historyHeaderWrapper.setVisibility(8);
        _dividerView.setVisibility(8);
        _autocompleteHeader.setVisibility(0);
        _autocompleteText.setText(_item.getTitle());
        _searchLeftIcon.setVisibility(8);
        return;
_L2:
        _sectionHeader.setVisibility(0);
        _historyHeaderWrapper.setVisibility(8);
        _dividerView.setVisibility(0);
        _autocompleteHeader.setVisibility(8);
        return;
    }

    private void updateUi()
    {
        if (_titleTextView == null || _item == null)
        {
            return;
        } else
        {
            resetCells();
            setBackground();
            setSectionHeader();
            setSectionBody();
            return;
        }
    }

    protected void loadLeftImage()
    {
        byte byte1;
        byte1 = 8;
        if (_item.getItemType() != com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER && _item.getItemType() != com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD)
        {
            _imageView.setVisibility(8);
            _overlayImage.setVisibility(8);
            _iconImage.setVisibility(8);
            return;
        }
        if (_item.getImageUri() == null) goto _L2; else goto _L1
_L1:
        Uri uri = Uri.parse(_item.getImageUri());
        if (uri == null) goto _L2; else goto _L3
_L3:
        byte byte0;
        _imageView.loadUri(uri);
        byte0 = 1;
_L5:
        Object obj;
        int i;
        if (_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER)
        {
            _imageView.setOval(true);
        } else
        {
            _imageView.setOval(false);
        }
        obj = _imageView;
        if (byte0 != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((WebImageView) (obj)).setVisibility(i);
        obj = _overlayImage;
        if (_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        obj = _iconImage;
        if (byte0 != 0)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((IconView) (obj)).setVisibility(byte0);
        return;
_L2:
        byte0 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onFinishInflate()
    {
        ButterKnife.a(this);
        _iconImage.setTint(0x7f0e00bf);
        _titleTextView.setIconTint(Colors.RED);
        super.onFinishInflate();
    }

    public void setCurrentSearchTerm(String s)
    {
        _currentSearchTerm = s;
    }

    protected void setDesc()
    {
        if (_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER)
        {
            _desc.setVisibility(0);
            _desc.setText(_item.getIdentifier());
            removeImageWrapperMargins(false);
        } else
        if (_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD)
        {
            _desc.setVisibility(0);
            _desc2.setVisibility(0);
            String s = Resources.stringPlural(0x7f090016, Integer.valueOf(_item.getPinCount()));
            _desc.setText(Resources.string(0x7f070068, new Object[] {
                _item.getOwner()
            }));
            _desc2.setText(s);
            removeImageWrapperMargins(false);
        } else
        {
            _desc.setVisibility(8);
            removeImageWrapperMargins(true);
        }
        _desc2.setVisibility(8);
    }

    public void setItem(GuidedSearchTypeAheadItem guidedsearchtypeaheaditem)
    {
        _item = guidedsearchtypeaheaditem;
        if (_rightImageLayout != null)
        {
            _rightImageLayout.setTag(_item);
            if (Experiments.s())
            {
                _historyHeaderClear.setTag(_item);
            }
        }
        updateUi();
    }

    public void setRecentHistoryClearOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        if (_historyHeaderClear != null)
        {
            _historyHeaderClear.setOnClickListener(onclicklistener);
        }
    }

    public void setRightIvOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        if (_rightImageLayout != null)
        {
            _rightImageLayout.setOnClickListener(onclicklistener);
        }
    }

    protected void setTitle()
    {
        _titleTextView.setTextColor(Resources.color(0x106000b));
        if ((_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN || _item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_LOCAL_CACHE) && _item.getTitle().startsWith(_currentSearchTerm))
        {
            _titleTextView.setTypeface(Typeface.DEFAULT);
            _titleTextView.setText(Html.fromHtml((new StringBuilder("<b><font color='#ffffff'>")).append(_item.getTitle().substring(0, _currentSearchTerm.length())).append("</font><font color='#999999'>").append(_item.getTitle().substring(_currentSearchTerm.length())).append("</font></b>").toString()));
        } else
        {
            if (_item.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.TRENDING_QUERY)
            {
                _titleTextView.setTextColor(_item.getTextColor());
                _titleTextView.setText(_item.getTitle());
                return;
            }
            _titleTextView.setText(_item.getTitle());
            adjustTitleTypeface();
            if (_item.isVerifiedIdentity())
            {
                DrawableUtils.setTextViewRightDrawable(_titleTextView, 0x7f020201);
                return;
            }
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.HEADER_DIVIDER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror20) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror19) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD_HEADER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror18) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER_HEADER.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror17) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.TRENDING_QUERY_HEADER.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror16) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.EMPTY_SPACE_HEADER.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror15) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SEARCH_ALL.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SEARCH_ALL.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD_SEARCH_ALL.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SECTION_FOOTER.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD_SECTION_FOOTER.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SECTION_FOOTER.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD.ordinal()] = 14;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN.ordinal()] = 15;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER.ordinal()] = 16;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD.ordinal()] = 17;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_MY_PIN.ordinal()] = 18;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_LOCAL_CACHE.ordinal()] = 19;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN.ordinal()] = 20;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.TRENDING_QUERY.ordinal()] = 21;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
