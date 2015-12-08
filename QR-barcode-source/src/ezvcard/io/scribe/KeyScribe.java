// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.parameter.KeyType;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.property.BinaryProperty;
import ezvcard.property.Key;

// Referenced classes of package ezvcard.io.scribe:
//            BinaryPropertyScribe

public class KeyScribe extends BinaryPropertyScribe
{

    public KeyScribe()
    {
        super(ezvcard/property/Key, "KEY");
    }

    protected KeyType _buildMediaTypeObj(String s)
    {
        return KeyType.get(null, s, null);
    }

    protected volatile MediaTypeParameter _buildMediaTypeObj(String s)
    {
        return _buildMediaTypeObj(s);
    }

    protected KeyType _buildTypeObj(String s)
    {
        return KeyType.get(s, null, null);
    }

    protected volatile MediaTypeParameter _buildTypeObj(String s)
    {
        return _buildTypeObj(s);
    }

    protected volatile BinaryProperty _newInstance(String s, MediaTypeParameter mediatypeparameter)
    {
        return _newInstance(s, (KeyType)mediatypeparameter);
    }

    protected volatile BinaryProperty _newInstance(byte abyte0[], MediaTypeParameter mediatypeparameter)
    {
        return _newInstance(abyte0, (KeyType)mediatypeparameter);
    }

    protected Key _newInstance(String s, KeyType keytype)
    {
        return new Key(s, keytype);
    }

    protected Key _newInstance(byte abyte0[], KeyType keytype)
    {
        return new Key(abyte0, keytype);
    }
}
