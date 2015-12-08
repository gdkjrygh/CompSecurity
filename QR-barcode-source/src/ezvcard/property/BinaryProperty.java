// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public abstract class BinaryProperty extends VCardProperty
    implements HasAltId
{

    protected MediaTypeParameter contentType;
    protected byte data[];
    protected String url;

    public BinaryProperty()
    {
    }

    public BinaryProperty(File file, MediaTypeParameter mediatypeparameter)
        throws IOException
    {
        this(((InputStream) (new FileInputStream(file))), mediatypeparameter);
    }

    public BinaryProperty(InputStream inputstream, MediaTypeParameter mediatypeparameter)
        throws IOException
    {
        this(IOUtils.toByteArray(inputstream, true), mediatypeparameter);
    }

    public BinaryProperty(String s, MediaTypeParameter mediatypeparameter)
    {
        setUrl(s, mediatypeparameter);
    }

    public BinaryProperty(byte abyte0[], MediaTypeParameter mediatypeparameter)
    {
        setData(abyte0, mediatypeparameter);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (url == null && data == null)
        {
            list.add("Property has neither a URL nor binary data attached to it.");
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

    public MediaTypeParameter getContentType()
    {
        return contentType;
    }

    public byte[] getData()
    {
        return data;
    }

    public List getPids()
    {
        return super.getPids();
    }

    public Integer getPref()
    {
        return super.getPref();
    }

    public String getType()
    {
        return parameters.getType();
    }

    public String getUrl()
    {
        return url;
    }

    public void removePids()
    {
        super.removePids();
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setContentType(MediaTypeParameter mediatypeparameter)
    {
        contentType = mediatypeparameter;
    }

    public void setData(byte abyte0[], MediaTypeParameter mediatypeparameter)
    {
        url = null;
        data = abyte0;
        setContentType(mediatypeparameter);
    }

    public void setPref(Integer integer)
    {
        super.setPref(integer);
    }

    public void setType(String s)
    {
        parameters.setType(s);
    }

    public void setUrl(String s, MediaTypeParameter mediatypeparameter)
    {
        url = s;
        data = null;
        setContentType(mediatypeparameter);
    }
}
