// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarnings;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            VCardProperty

public class Agent extends VCardProperty
{

    private String url;
    private VCard vcard;

    public Agent()
    {
    }

    public Agent(VCard vcard1)
    {
        setVCard(vcard1);
    }

    public Agent(String s)
    {
        setUrl(s);
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V2_1, VCardVersion.V3_0);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard1)
    {
        if (url == null && vcard == null)
        {
            list.add("Property has neither a URL nor an embedded vCard.");
        }
        if (vcard != null)
        {
            for (vcard1 = vcard.validate(vcardversion).iterator(); vcard1.hasNext();)
            {
                Object obj = (ezvcard.ValidationWarnings.WarningsGroup)vcard1.next();
                vcardversion = ((ezvcard.ValidationWarnings.WarningsGroup) (obj)).getProperty();
                if (vcardversion == null)
                {
                    vcardversion = "";
                } else
                {
                    vcardversion = (new StringBuilder()).append("[").append(vcardversion.getClass().getSimpleName()).append("]: ").toString();
                }
                obj = ((ezvcard.ValidationWarnings.WarningsGroup) (obj)).getMessages().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    String s = (String)((Iterator) (obj)).next();
                    list.add((new StringBuilder()).append(vcardversion).append(s).toString());
                }
            }

        }
    }

    public String getUrl()
    {
        return url;
    }

    public VCard getVCard()
    {
        return vcard;
    }

    public void setUrl(String s)
    {
        url = s;
        vcard = null;
    }

    public void setVCard(VCard vcard1)
    {
        vcard = vcard1;
        url = null;
    }
}
