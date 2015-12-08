// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.KeyType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package ezvcard.property:
//            BinaryProperty

public class Key extends BinaryProperty
{

    private String text;

    public Key()
    {
    }

    public Key(File file, KeyType keytype)
        throws IOException
    {
        super(file, keytype);
    }

    public Key(InputStream inputstream, KeyType keytype)
        throws IOException
    {
        super(inputstream, keytype);
    }

    public Key(String s, KeyType keytype)
    {
        super(s, keytype);
    }

    public Key(byte abyte0[], KeyType keytype)
    {
        super(abyte0, keytype);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (url == null && data == null && text == null)
        {
            list.add("Property has no value attached to it.");
        }
        if (url != null && (vcardversion == VCardVersion.V2_1 || vcardversion == VCardVersion.V3_0))
        {
            list.add((new StringBuilder()).append("URL values are not permitted in version ").append(vcardversion.getVersion()).append(".").toString());
        }
    }

    public String getText()
    {
        return text;
    }

    public void setText(String s, KeyType keytype)
    {
        text = s;
        data = null;
        url = null;
        setContentType(keytype);
    }
}
