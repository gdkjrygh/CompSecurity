// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.dece;


// Referenced classes of package com.googlecode.mp4parser.boxes.dece:
//            ContentInformationBox

public static class version
{

    String iso_brand;
    String version;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (version)obj;
            if (iso_brand == null ? ((iso_brand) (obj)).iso_brand != null : !iso_brand.equals(((iso_brand) (obj)).iso_brand))
            {
                return false;
            }
            if (version == null ? ((version) (obj)).version != null : !version.equals(((version) (obj)).version))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (iso_brand != null)
        {
            i = iso_brand.hashCode();
        } else
        {
            i = 0;
        }
        if (version != null)
        {
            j = version.hashCode();
        }
        return i * 31 + j;
    }

    public (String s, String s1)
    {
        iso_brand = s;
        version = s1;
    }
}
