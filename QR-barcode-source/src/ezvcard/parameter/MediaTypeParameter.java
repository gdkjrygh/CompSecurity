// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;


// Referenced classes of package ezvcard.parameter:
//            VCardParameter

public class MediaTypeParameter extends VCardParameter
{

    protected final String extension;
    protected final String mediaType;

    public MediaTypeParameter(String s, String s1, String s2)
    {
        super(s);
        mediaType = s1;
        extension = s2;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!super.equals(obj))
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (MediaTypeParameter)obj;
        if (extension == null)
        {
            if (((MediaTypeParameter) (obj)).extension != null)
            {
                return false;
            }
        } else
        if (!extension.equals(((MediaTypeParameter) (obj)).extension))
        {
            return false;
        }
        if (mediaType != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((MediaTypeParameter) (obj)).mediaType == null) goto _L1; else goto _L3
_L3:
        return false;
        if (mediaType.equals(((MediaTypeParameter) (obj)).mediaType)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getExtension()
    {
        return extension;
    }

    public String getMediaType()
    {
        return mediaType;
    }

    public int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int i;
        if (extension == null)
        {
            i = 0;
        } else
        {
            i = extension.hashCode();
        }
        if (mediaType != null)
        {
            j = mediaType.hashCode();
        }
        return (k * 31 + i) * 31 + j;
    }
}
