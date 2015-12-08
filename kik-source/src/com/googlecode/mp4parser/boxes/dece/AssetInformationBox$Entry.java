// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.Utf8;

// Referenced classes of package com.googlecode.mp4parser.boxes.dece:
//            AssetInformationBox

public static class assetId
{

    public String assetId;
    public String namespace;
    public String profileLevelIdc;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (assetId)obj;
            if (!assetId.equals(((assetId) (obj)).assetId))
            {
                return false;
            }
            if (!namespace.equals(((namespace) (obj)).namespace))
            {
                return false;
            }
            if (!profileLevelIdc.equals(((profileLevelIdc) (obj)).profileLevelIdc))
            {
                return false;
            }
        }
        return true;
    }

    public int getSize()
    {
        return Utf8.utf8StringLengthInBytes(namespace) + 3 + Utf8.utf8StringLengthInBytes(profileLevelIdc) + Utf8.utf8StringLengthInBytes(assetId);
    }

    public int hashCode()
    {
        return (namespace.hashCode() * 31 + profileLevelIdc.hashCode()) * 31 + assetId.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("{namespace='")).append(namespace).append('\'').append(", profileLevelIdc='").append(profileLevelIdc).append('\'').append(", assetId='").append(assetId).append('\'').append('}').toString();
    }

    public (String s, String s1, String s2)
    {
        namespace = s;
        profileLevelIdc = s1;
        assetId = s2;
    }
}
