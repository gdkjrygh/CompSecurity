// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.EmailType;
import ezvcard.parameter.VCardParameters;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            TextProperty, HasAltId

public class Email extends TextProperty
    implements HasAltId
{

    public Email(String s)
    {
        super(s);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        super._validate(list, vcardversion, vcard);
        vcard = getTypes().iterator();
        do
        {
            if (!vcard.hasNext())
            {
                break;
            }
            EmailType emailtype = (EmailType)vcard.next();
            if (emailtype != EmailType.PREF && !emailtype.isSupported(vcardversion))
            {
                list.add((new StringBuilder()).append("Type value \"").append(emailtype.getValue()).append("\" is not supported in version ").append(vcardversion.getVersion()).append(".").toString());
            }
        } while (true);
    }

    public void addPid(int i, int j)
    {
        super.addPid(i, j);
    }

    public void addType(EmailType emailtype)
    {
        parameters.addType(emailtype.getValue());
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public List getPids()
    {
        return super.getPids();
    }

    public Integer getPref()
    {
        return super.getPref();
    }

    public Set getTypes()
    {
        Object obj = parameters.getTypes();
        HashSet hashset = new HashSet(((Set) (obj)).size());
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(EmailType.get((String)((Iterator) (obj)).next()))) { }
        return hashset;
    }

    public void removePids()
    {
        super.removePids();
    }

    public void removeType(EmailType emailtype)
    {
        parameters.removeType(emailtype.getValue());
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setPref(Integer integer)
    {
        super.setPref(integer);
    }
}
