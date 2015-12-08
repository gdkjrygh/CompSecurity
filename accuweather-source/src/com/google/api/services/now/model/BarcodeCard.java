// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Image, TemplatedString, Action

public final class BarcodeCard extends GenericJson
{

    private Image barcodeImage;
    private String barcodeText;
    private List buttons;
    private String domainUrl;
    private List labelContentPairs;
    private Image logo;
    private String secondaryTitle;
    private TemplatedString subtitle;
    private Action tapAction;
    private TemplatedString title;

    public BarcodeCard()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public BarcodeCard clone()
    {
        return (BarcodeCard)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Image getBarcodeImage()
    {
        return barcodeImage;
    }

    public String getBarcodeText()
    {
        return barcodeText;
    }

    public List getButtons()
    {
        return buttons;
    }

    public String getDomainUrl()
    {
        return domainUrl;
    }

    public List getLabelContentPairs()
    {
        return labelContentPairs;
    }

    public Image getLogo()
    {
        return logo;
    }

    public String getSecondaryTitle()
    {
        return secondaryTitle;
    }

    public TemplatedString getSubtitle()
    {
        return subtitle;
    }

    public Action getTapAction()
    {
        return tapAction;
    }

    public TemplatedString getTitle()
    {
        return title;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public BarcodeCard set(String s, Object obj)
    {
        return (BarcodeCard)super.set(s, obj);
    }

    public BarcodeCard setBarcodeImage(Image image)
    {
        barcodeImage = image;
        return this;
    }

    public BarcodeCard setBarcodeText(String s)
    {
        barcodeText = s;
        return this;
    }

    public BarcodeCard setButtons(List list)
    {
        buttons = list;
        return this;
    }

    public BarcodeCard setDomainUrl(String s)
    {
        domainUrl = s;
        return this;
    }

    public BarcodeCard setLabelContentPairs(List list)
    {
        labelContentPairs = list;
        return this;
    }

    public BarcodeCard setLogo(Image image)
    {
        logo = image;
        return this;
    }

    public BarcodeCard setSecondaryTitle(String s)
    {
        secondaryTitle = s;
        return this;
    }

    public BarcodeCard setSubtitle(TemplatedString templatedstring)
    {
        subtitle = templatedstring;
        return this;
    }

    public BarcodeCard setTapAction(Action action)
    {
        tapAction = action;
        return this;
    }

    public BarcodeCard setTitle(TemplatedString templatedstring)
    {
        title = templatedstring;
        return this;
    }
}
