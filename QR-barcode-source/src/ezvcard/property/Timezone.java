// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.UtcOffset;
import ezvcard.util.VCardDateFormatter;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class Timezone extends VCardProperty
    implements HasAltId
{

    private UtcOffset offset;
    private String text;

    public Timezone(UtcOffset utcoffset)
    {
        this(utcoffset, ((String) (null)));
    }

    public Timezone(UtcOffset utcoffset, String s)
    {
        setOffset(utcoffset);
        setText(s);
    }

    public Timezone(Integer integer, Integer integer1)
    {
        this(new UtcOffset(integer.intValue(), integer1.intValue()));
    }

    public Timezone(Integer integer, Integer integer1, String s)
    {
        this(new UtcOffset(integer.intValue(), integer1.intValue()), s);
    }

    public Timezone(String s)
    {
        this(((UtcOffset) (null)), s);
    }

    public Timezone(TimeZone timezone)
    {
        this(UtcOffset.parse(timezone), timezone.getID());
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (offset == null && text == null)
        {
            list.add("Property does not have text or UTC offset values associated with it.");
        }
        if (offset == null && vcardversion == VCardVersion.V2_1)
        {
            list.add((new StringBuilder()).append("Property requires a UTC offset for its value in version ").append(vcardversion.getVersion()).append(".").toString());
        }
        if (offset != null && (offset.getMinute() < 0 || offset.getMinute() > 59))
        {
            list.add("Minute offset must be between 0 and 59.");
        }
    }

    public void addPid(int i, int j)
    {
        super.addPid(i, j);
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public Integer getHourOffset()
    {
        if (offset == null)
        {
            return null;
        } else
        {
            return Integer.valueOf(offset.getHour());
        }
    }

    public String getMediaType()
    {
        return parameters.getMediaType();
    }

    public Integer getMinuteOffset()
    {
        if (offset == null)
        {
            return null;
        } else
        {
            return Integer.valueOf(offset.getMinute());
        }
    }

    public UtcOffset getOffset()
    {
        return offset;
    }

    public List getPids()
    {
        return super.getPids();
    }

    public Integer getPref()
    {
        return super.getPref();
    }

    public String getText()
    {
        return text;
    }

    public String getType()
    {
        return parameters.getType();
    }

    public void removePids()
    {
        super.removePids();
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setMediaType(String s)
    {
        parameters.setMediaType(s);
    }

    public void setOffset(int i, int j)
    {
        setOffset(new UtcOffset(i, j));
    }

    public void setOffset(UtcOffset utcoffset)
    {
        offset = utcoffset;
    }

    public void setPref(Integer integer)
    {
        super.setPref(integer);
    }

    public void setText(String s)
    {
        text = s;
    }

    public void setType(String s)
    {
        parameters.setType(s);
    }

    public TimeZone toTimeZone()
    {
        if (text != null)
        {
            TimeZone timezone = VCardDateFormatter.parseTimeZoneId(text);
            if (timezone != null)
            {
                return timezone;
            }
        }
        if (offset != null)
        {
            int k = offset.getHour() * 60 * 60 * 1000;
            int j = offset.getMinute() * 60 * 1000;
            int i = j;
            if (k < 0)
            {
                i = j * -1;
            }
            String s;
            if (text == null)
            {
                s = "";
            } else
            {
                s = text;
            }
            return new SimpleTimeZone(k + i, s);
        } else
        {
            return null;
        }
    }
}
