// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.constants;


// Referenced classes of package org.apache.sanselan.formats.tiff.constants:
//            TiffDirectoryConstants, TagInfo

public class TagConstantsUtils
    implements TiffDirectoryConstants
{

    public TagConstantsUtils()
    {
    }

    public static TagInfo[] a(TagInfo ataginfo[][])
    {
        int i;
        int j;
        i = 0;
        j = 0;
_L3:
        if (i < ataginfo.length) goto _L2; else goto _L1
_L1:
        TagInfo ataginfo1[];
        ataginfo1 = new TagInfo[j];
        i = 0;
        j = 0;
_L4:
        if (i >= ataginfo.length)
        {
            return ataginfo1;
        }
        break MISSING_BLOCK_LABEL_41;
_L2:
        j += ataginfo[i].length;
        i++;
          goto _L3
        System.arraycopy(ataginfo[i], 0, ataginfo1, j, ataginfo[i].length);
        j += ataginfo[i].length;
        i++;
          goto _L4
    }
}
