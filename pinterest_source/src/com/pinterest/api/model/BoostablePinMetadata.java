// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.view.ViewGroup;
import com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.ComponentType;
import java.util.HashMap;

// Referenced classes of package com.pinterest.api.model:
//            PinMetadata, Pin

public abstract class BoostablePinMetadata extends PinMetadata
{

    private Boolean _fromAggregatedData;

    public BoostablePinMetadata(Pin pin, PinterestJsonObject pinterestjsonobject)
    {
        super(pin, pinterestjsonobject);
        pin = getJsonObject(pinterestjsonobject);
        if (pin != null)
        {
            _fromAggregatedData = pin.a("from_aggregated_data", Boolean.valueOf(false));
            if (_fromAggregatedData.booleanValue())
            {
                pin = pin.c("additional_data");
                if (pin != null)
                {
                    setUrl(pin.a("url", getUrl()));
                    setWebsiteName(pin.a("site_name", getWebsiteName()));
                    setImageSmallUrl(pin.a("favicon_link", getImageUrl()));
                    return;
                }
            }
        }
    }

    public void addMoreDetailsView(ViewGroup viewgroup, final ComponentType componentType, final String apiTag)
    {
        IconDoubleTextCellView icondoubletextcellview = new IconDoubleTextCellView(viewgroup.getContext(), com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView.TextOrientation.VERTICAL, 0x7f0100e8, 0x7f0100e8);
        icondoubletextcellview.setBackgroundResource(0x7f020283);
        icondoubletextcellview.setTitle(Resources.string(0x7f07036f));
        icondoubletextcellview.setSubTitle(getWebsiteName());
        int i = (int)Resources.dimension(0x7f0a0184);
        icondoubletextcellview.setPadding(i, Constants.MARGIN, i, 0);
        icondoubletextcellview.setOnClickListener(new _cls1());
        viewgroup.addView(icondoubletextcellview, -1, -2);
    }

    public HashMap getAuxData()
    {
        HashMap hashmap = null;
        if (isFromAggregatedData().booleanValue())
        {
            hashmap = new HashMap();
            hashmap.put("from_aggregated_data", "true");
        }
        return hashmap;
    }

    protected abstract PinterestJsonObject getJsonObject(PinterestJsonObject pinterestjsonobject);

    public Boolean isFromAggregatedData()
    {
        return _fromAggregatedData;
    }

    public void setFromAggregatedData(Boolean boolean1)
    {
        _fromAggregatedData = boolean1;
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BoostablePinMetadata this$0;
        final String val$apiTag;
        final ComponentType val$componentType;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.CARD_ATTRIBUTION_LINK, componentType, getPin().getUid());
            ClickThroughUtil.gotoPinLink(getUrl(), null, apiTag);
        }

        _cls1()
        {
            this$0 = BoostablePinMetadata.this;
            componentType = componenttype;
            apiTag = s;
            super();
        }
    }

}
