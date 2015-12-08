// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.Calscale;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.PartialDate;
import java.util.Date;
import java.util.List;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class DateOrTimeProperty extends VCardProperty
    implements HasAltId
{

    private Date date;
    private boolean dateHasTime;
    private PartialDate partialDate;
    private String text;

    public DateOrTimeProperty(PartialDate partialdate)
    {
        setPartialDate(partialdate);
    }

    public DateOrTimeProperty(String s)
    {
        setText(s);
    }

    public DateOrTimeProperty(Date date1)
    {
        this(date1, false);
    }

    public DateOrTimeProperty(Date date1, boolean flag)
    {
        setDate(date1, flag);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (date == null && partialDate == null && text == null)
        {
            list.add("Property has no value associated with it.");
        }
        if (vcardversion == VCardVersion.V2_1 || vcardversion == VCardVersion.V3_0)
        {
            if (text != null)
            {
                list.add((new StringBuilder()).append("Text values are not supported in version ").append(vcardversion).append(".").toString());
            }
            if (partialDate != null)
            {
                list.add((new StringBuilder()).append("Reduced accuracy or truncated dates are not supported in version ").append(vcardversion).append(".").toString());
            }
        }
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public Calscale getCalscale()
    {
        return parameters.getCalscale();
    }

    public Date getDate()
    {
        return date;
    }

    public PartialDate getPartialDate()
    {
        return partialDate;
    }

    public String getText()
    {
        return text;
    }

    public boolean hasTime()
    {
        return dateHasTime;
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setCalscale(Calscale calscale)
    {
        parameters.setCalscale(calscale);
    }

    public void setDate(Date date1, boolean flag)
    {
        date = date1;
        if (date1 == null)
        {
            flag = false;
        }
        dateHasTime = flag;
        text = null;
        partialDate = null;
    }

    public void setPartialDate(PartialDate partialdate)
    {
        partialDate = partialdate;
        boolean flag;
        if (partialdate == null)
        {
            flag = false;
        } else
        {
            flag = partialdate.hasTimeComponent();
        }
        dateHasTime = flag;
        text = null;
        date = null;
    }

    public void setText(String s)
    {
        text = s;
        date = null;
        partialDate = null;
        dateHasTime = false;
    }
}
