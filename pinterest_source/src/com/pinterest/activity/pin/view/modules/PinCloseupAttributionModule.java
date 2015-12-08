// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.metadata.article.Article;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupAttributionModule extends PinCloseupBaseModule
{

    private IconDoubleTextCellView _articleAttribution;
    private IconDoubleTextCellView _photoAttribution;

    public PinCloseupAttributionModule(Context context)
    {
        super(context);
    }

    private boolean hasAttributionData()
    {
        if (_pinMetadata != null && (_pinMetadata instanceof Article))
        {
            Article article = (Article)_pinMetadata;
            return !StringUtils.isEmpty(article.getAuthorsDisplay()) || !StringUtils.isEmpty(article.getDatePublishedFormatted());
        } else
        {
            return _pin.hasAttribution();
        }
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_ATTRIBUTION;
    }

    protected boolean hasContent()
    {
        return hasAttributionData();
    }

    protected void init()
    {
        int i = (int)Resources.dimension(0x7f0a0184);
        _padding.top = (int)Resources.dimension(0x7f0a0186);
        _padding.left = i;
        _padding.right = i;
    }

    protected void initView()
    {
        int i = (int)Resources.dimension(0x7f0a018a);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F);
        setBackgroundColor(-1);
        removeAllViews();
        _articleAttribution = new IconDoubleTextCellView(getContext(), com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView.TextOrientation.VERTICAL, 0x7f0100e8, 0x7f0100e8);
        _articleAttribution.showImage(false);
        _articleAttribution.setPadding(0, 0, i, 0);
        _articleAttribution.setVisibility(8);
        addView(_articleAttribution, layoutparams);
        _photoAttribution = new IconDoubleTextCellView(getContext(), com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView.TextOrientation.VERTICAL, 0x7f0100e8, 0x7f0100e8);
        _photoAttribution.showImage(false);
        _photoAttribution.setPadding(0, 0, i, 0);
        _photoAttribution.setSubTitleFontStyle(0);
        _photoAttribution.setVisibility(8);
        addView(_photoAttribution, layoutparams);
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        boolean flag2 = true;
        boolean flag1 = false;
        int i;
        if (_pinMetadata != null && (_pinMetadata instanceof Article))
        {
            Object obj1 = (Article)_pinMetadata;
            Object obj = ((Article) (obj1)).getAuthorsDisplay();
            obj1 = ((Article) (obj1)).getDatePublishedFormatted();
            boolean flag;
            if (!StringUtils.isEmpty(((CharSequence) (obj))))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (!StringUtils.isEmpty(((CharSequence) (obj1))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _articleAttribution.setVisibility(0);
            if (i != 0 && flag)
            {
                _articleAttribution.setTitle(((String) (obj1)));
                _articleAttribution.setSubTitle(((String) (obj)));
            } else
            if (i != 0)
            {
                _articleAttribution.setTitle(Resources.string(0x7f0703f8));
                _articleAttribution.setSubTitle(((String) (obj)));
            } else
            if (flag)
            {
                _articleAttribution.setTitle(Resources.string(0x7f0703f9));
                _articleAttribution.setSubTitle(((String) (obj1)));
            } else
            {
                _articleAttribution.setVisibility(8);
            }
        } else
        {
            _articleAttribution.setVisibility(8);
        }
        if (_pin.hasAttribution())
        {
            obj = _pin.getAttributionHtml();
            if (ModelHelper.isValid(obj))
            {
                _photoAttribution.setTitle(Resources.string(0x7f0703fa));
                _photoAttribution.setSubTitle(((android.text.Spanned) (obj)));
                _photoAttribution.setOnClickListener(new _cls1());
                _photoAttribution.setVisibility(0);
            } else
            {
                _photoAttribution.setVisibility(8);
            }
        } else
        {
            _photoAttribution.setVisibility(8);
        }
        i = ((flag2) ? 1 : 0);
        if (_articleAttribution.getVisibility() == 8)
        {
            if (_photoAttribution.getVisibility() != 8)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
        }
        if (i != 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        setVisibility(i);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCloseupAttributionModule this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PIN_ATTRIBUTION, null, _pin.getUid());
            view = new Navigation(Location.BROWSER, _pin.getAttrAuthorUrl());
            view.putExtra("Referer", _pin.getPinterestLink());
            Events.post(view);
        }

        _cls1()
        {
            this$0 = PinCloseupAttributionModule.this;
            super();
        }
    }

}
