// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg;

import org.apache.sanselan.ImageParser;
import org.apache.sanselan.formats.tiff.constants.TiffTagConstants;

// Referenced classes of package org.apache.sanselan.formats.jpeg:
//            JpegConstants

public class JpegImageParser extends ImageParser
    implements JpegConstants, TiffTagConstants
{

    public static final String k[] = {
        ".jpg", ".jpeg"
    };

    public JpegImageParser()
    {
        b();
    }

    static boolean a(int i, int ai[])
    {
        boolean flag1 = false;
        if (ai != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        int j = 0;
        do
        {
            flag = flag1;
            if (j >= ai.length)
            {
                continue;
            }
            if (ai[j] == i)
            {
                return true;
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

}
