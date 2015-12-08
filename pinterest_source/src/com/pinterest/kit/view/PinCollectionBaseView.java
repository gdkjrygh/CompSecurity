// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.List;

public class PinCollectionBaseView extends LinearLayout
{

    private static final int IMAGE_VIEW_IDS[] = {
        0x7f0f00a6, 0x7f0f00a9, 0x7f0f00ac, 0x7f0f00a7, 0x7f0f00aa, 0x7f0f00ad, 0x7f0f00a8, 0x7f0f00ab
    };
    private static final int IMAGE_VIEW_IDS_TABLET[] = {
        0x7f0f00a6, 0x7f0f00a9, 0x7f0f00ac, 0x7f0f00a7, 0x7f0f00aa, 0x7f0f00ad, 0x7f0f00a8, 0x7f0f00ab, 0x7f0f03c8, 0x7f0f03c9, 
        0x7f0f03ca
    };
    private static final boolean IS_TABLET = Device.isTablet();
    protected boolean _clearCurrentBeforeSet;
    protected boolean _fadeInImages;
    protected LinearLayout _gridContainer;
    private int _numPins;
    protected List _pinImageViews;
    private int _weights[];

    public PinCollectionBaseView(Context context)
    {
        this(context, null);
        init();
    }

    public PinCollectionBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _pinImageViews = new ArrayList();
        _clearCurrentBeforeSet = true;
        _fadeInImages = false;
        init();
    }

    public void calculateAndSetWeights(List list, int i)
    {
        int j = 0;
        float f = -1F;
        int k = 0;
        for (; j < i && j < list.size(); j++)
        {
            Pin pin = (Pin)list.get(j);
            float f1 = (float)pin.getImageMediumHeight().intValue() / (float)pin.getImageMediumWidth().intValue();
            if (f1 > f)
            {
                k = j;
                f = f1;
            }
        }

        setWeights(i, k);
    }

    protected void fadeInImageAt(int i)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat((WebImageView)_pinImageViews.get(i), "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration((long)((double)Constants.ANIM_SPEED_FAST * Math.random()));
        objectanimator.start();
    }

    protected int[] getImageViewIds()
    {
        if (IS_TABLET)
        {
            return IMAGE_VIEW_IDS_TABLET;
        } else
        {
            return IMAGE_VIEW_IDS;
        }
    }

    protected int getLayoutId()
    {
        return !IS_TABLET ? 0x7f030189 : 0x7f03018a;
    }

    protected int getMaxNumPins()
    {
        if (IS_TABLET)
        {
            return IMAGE_VIEW_IDS_TABLET.length;
        } else
        {
            return IMAGE_VIEW_IDS.length;
        }
    }

    public int getNumPins()
    {
        return _numPins;
    }

    protected void init()
    {
        inflate(getContext(), getLayoutId(), this);
        ButterKnife.a(this);
        int ai[] = getImageViewIds();
        if (getMaxNumPins() > ai.length)
        {
            throwMaxPinsException();
        }
        for (int i = 0; i < getMaxNumPins(); i++)
        {
            _pinImageViews.add((WebImageView)findViewById(ai[i]));
        }

    }

    protected void onPinsSet()
    {
        float f = getResources().getDimensionPixelSize(0x7f0a00f5);
        if (IS_TABLET)
        {
            ((WebImageView)_pinImageViews.get(4)).setCornerRadius(0.0F, 0.0F, f, 0.0F);
            ((WebImageView)_pinImageViews.get(7)).setCornerRadius(0.0F, 0.0F, 0.0F, f);
            return;
        } else
        {
            ((WebImageView)_pinImageViews.get(3)).setCornerRadius(0.0F, 0.0F, f, 0.0F);
            return;
        }
    }

    public void setContent(List list)
    {
        int i;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        _numPins = i;
        i = 0;
        while (i < _weights.length) 
        {
            WebImageView webimageview = (WebImageView)_pinImageViews.get(i);
            setLayoutWeightAt(i, _weights[i]);
            if (list != null && i < list.size())
            {
                if (_fadeInImages)
                {
                    webimageview.setImageListener(new _cls1(i));
                }
                webimageview.loadUrl(((Pin)list.get(i)).getImageMediumUrl(), _clearCurrentBeforeSet);
            } else
            {
                webimageview.setImageDrawable(getResources().getDrawable(0x7f020264), true);
            }
            i++;
        }
        if (_weights.length < getMaxNumPins())
        {
            for (int j = 1; j <= getMaxNumPins() - _weights.length; j++)
            {
                ViewHelper.setVisibility((View)_pinImageViews.get(getMaxNumPins() - j), 8);
            }

        }
        onPinsSet();
    }

    public void setContentUrls(List list)
    {
        int i;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        _numPins = i;
        i = 0;
        while (i < _weights.length) 
        {
            WebImageView webimageview = (WebImageView)_pinImageViews.get(i);
            setLayoutWeightAt(i, _weights[i]);
            if (list != null && i < list.size())
            {
                if (_fadeInImages)
                {
                    webimageview.setImageListener(new _cls2(i));
                }
                webimageview.loadUrl((String)list.get(i), _clearCurrentBeforeSet);
            } else
            {
                webimageview.setImageDrawable(getResources().getDrawable(0x7f020264), true);
            }
            i++;
        }
        if (_weights.length < getMaxNumPins())
        {
            for (int j = 1; j <= getMaxNumPins() - _weights.length; j++)
            {
                ViewHelper.setVisibility((View)_pinImageViews.get(getMaxNumPins() - j), 8);
            }

        }
        onPinsSet();
    }

    protected void setLayoutWeightAt(int i, int j)
    {
        ((android.widget.LinearLayout.LayoutParams)((WebImageView)_pinImageViews.get(i)).getLayoutParams()).weight = j;
    }

    public void setWeights(int i, int j)
    {
        int ai[] = new int[i * 2];
        int k = 0;
        while (k < i) 
        {
            int l;
            if (k == j)
            {
                l = 3;
            } else
            {
                l = 2;
            }
            ai[k] = l;
            if (k == j)
            {
                l = 1;
            } else
            {
                l = 2;
            }
            ai[i + k] = l;
            k++;
        }
        setWeights(ai);
    }

    protected void setWeights(int ai[])
    {
        _weights = ai;
        if (ai.length > getMaxNumPins())
        {
            throwMaxPinsException();
        }
    }

    protected void throwMaxPinsException()
    {
        throw new IndexOutOfBoundsException(String.format("View only supports up to %s pins", new Object[] {
            Integer.valueOf(getMaxNumPins())
        }));
    }


    private class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
    {

        final int a;
        final PinCollectionBaseView b;

        public void onBitmapSet()
        {
            b.fadeInImageAt(a);
        }

        _cls1(int i)
        {
            b = PinCollectionBaseView.this;
            a = i;
            super();
        }
    }


    private class _cls2 extends com.pinterest.ui.imageview.WebImageView.ImageListener
    {

        final int a;
        final PinCollectionBaseView b;

        public void onBitmapSet()
        {
            b.fadeInImageAt(a);
        }

        _cls2(int i)
        {
            b = PinCollectionBaseView.this;
            a = i;
            super();
        }
    }

}
