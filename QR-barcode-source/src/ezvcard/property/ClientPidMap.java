// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package ezvcard.property:
//            VCardProperty

public class ClientPidMap extends VCardProperty
{

    private Integer pid;
    private String uri;

    public ClientPidMap(Integer integer, String s)
    {
        pid = integer;
        uri = s;
    }

    public static ClientPidMap random(Integer integer)
    {
        String s = UUID.randomUUID().toString();
        return new ClientPidMap(integer, (new StringBuilder()).append("urn:uuid:").append(s).toString());
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (pid == null && uri == null)
        {
            list.add("Property has no value associated with it.");
        }
    }

    public Integer getPid()
    {
        return pid;
    }

    public String getUri()
    {
        return uri;
    }

    public void setPid(Integer integer)
    {
        pid = integer;
    }

    public void setUri(String s)
    {
        uri = s;
    }
}
