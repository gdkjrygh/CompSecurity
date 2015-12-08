// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.parameter.VCardParameters;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class StructuredName extends VCardProperty
    implements HasAltId
{

    private List additional;
    private String family;
    private String given;
    private List prefixes;
    private List suffixes;

    public StructuredName()
    {
        additional = new ArrayList();
        prefixes = new ArrayList();
        suffixes = new ArrayList();
    }

    public void addAdditional(String s)
    {
        additional.add(s);
    }

    public void addPrefix(String s)
    {
        prefixes.add(s);
    }

    public void addSuffix(String s)
    {
        suffixes.add(s);
    }

    public List getAdditional()
    {
        return additional;
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public String getFamily()
    {
        return family;
    }

    public String getGiven()
    {
        return given;
    }

    public String getLanguage()
    {
        return super.getLanguage();
    }

    public List getPrefixes()
    {
        return prefixes;
    }

    public List getSortAs()
    {
        return parameters.getSortAs();
    }

    public List getSuffixes()
    {
        return suffixes;
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setFamily(String s)
    {
        family = s;
    }

    public void setGiven(String s)
    {
        given = s;
    }

    public void setLanguage(String s)
    {
        super.setLanguage(s);
    }

    public void setSortAs(String s)
    {
        if (s == null)
        {
            parameters.setSortAs(new String[0]);
            return;
        } else
        {
            parameters.setSortAs(new String[] {
                s
            });
            return;
        }
    }

    public void setSortAs(String s, String s1)
    {
        parameters.setSortAs(new String[] {
            s, s1
        });
    }
}
