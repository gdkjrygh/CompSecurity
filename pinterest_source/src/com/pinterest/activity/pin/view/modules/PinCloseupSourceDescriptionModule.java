// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinMetadata;
import com.pinterest.api.model.Place;
import com.pinterest.base.Colors;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import java.util.HashMap;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupSourceDescriptionModule extends PinCloseupBaseModule
{

    private boolean _seoDescriptionSeen;
    private CharSequence _seoDescriptionText;
    private CharSequence _sourceDescriptionText;
    private TextView _sourceDescriptionTv;

    public PinCloseupSourceDescriptionModule(Context context)
    {
        super(context);
        _seoDescriptionSeen = false;
    }

    private boolean updateMetadataText()
    {
label0:
        {
            Object obj1 = null;
            boolean flag1 = false;
            String s;
            Object obj;
            boolean flag;
            if (_pinMetadata != null)
            {
                s = _pinMetadata.getDescription();
            } else
            {
                s = null;
            }
            obj = s;
            if (s == null)
            {
                obj = s;
                if (_pinPlace != null)
                {
                    obj = _pinPlace.getMetadataDisplay();
                }
            }
            s = obj1;
            if (StringUtils.isNotBlank(_pin.getSeoDescription()))
            {
                s = _pin.getSeoDescription();
            }
            if (!TextUtils.equals(_sourceDescriptionText, ((CharSequence) (obj))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!Experiments.P())
            {
                break label0;
            }
            if (TextUtils.equals(_sourceDescriptionText, ((CharSequence) (obj))))
            {
                flag = flag1;
                if (TextUtils.equals(_seoDescriptionText, s))
                {
                    break label0;
                }
            }
            flag = true;
        }
        _sourceDescriptionText = ((CharSequence) (obj));
        _seoDescriptionText = s;
        return flag;
    }

    protected HashMap getCardViewAuxData()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("seo_description_shown", String.valueOf(_seoDescriptionSeen));
        return hashmap;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_SOURCE_DESCRIPTION;
    }

    protected boolean hasContent()
    {
        if (Experiments.P())
        {
            return StringUtils.isNotBlank(_sourceDescriptionText) || StringUtils.isNotBlank(_seoDescriptionText);
        } else
        {
            return StringUtils.isNotBlank(_sourceDescriptionText);
        }
    }

    protected void init()
    {
        _padding.left = (int)Resources.dimension(0x7f0a0184);
        _padding.right = (int)Resources.dimension(0x7f0a0185);
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        setOrientation(1);
        _sourceDescriptionTv = new TextView(getContext(), null, 0x7f0100df);
        _sourceDescriptionTv.setVisibility(8);
        int i = (int)Resources.dimension(0x7f0a0186);
        _sourceDescriptionTv.setPadding(0, i, 0, 0);
        addView(_sourceDescriptionTv, -1, -2);
    }

    protected boolean shouldUpdateView()
    {
        return BooleanUtils.or(new boolean[] {
            updateMetadataText()
        });
    }

    protected void updateView()
    {
        if (StringUtils.isNotBlank(_sourceDescriptionText))
        {
            _sourceDescriptionTv.setText(_sourceDescriptionText);
            _sourceDescriptionTv.setVisibility(0);
            return;
        }
        if (StringUtils.isNotBlank(_pin.getSeoDescription()) && Experiments.P())
        {
            _sourceDescriptionTv.setText(_pin.getSeoDescription());
            _sourceDescriptionTv.setVisibility(0);
            _seoDescriptionSeen = true;
            return;
        } else
        {
            _sourceDescriptionTv.setVisibility(8);
            return;
        }
    }
}
