// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common;

import java.util.ArrayList;

// Referenced classes of package org.apache.sanselan.common:
//            IImageMetadata

public class ImageMetadata
    implements IImageMetadata
{

    protected static final String a = System.getProperty("line.separator");
    private final ArrayList b = new ArrayList();

    public ImageMetadata()
    {
    }

    public String a(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        s = new StringBuffer();
        int i = 0;
        do
        {
            if (i >= b.size())
            {
                return s.toString();
            }
            if (i > 0)
            {
                s.append(a);
            }
            s.append(((IImageMetadata.IImageMetadataItem)b.get(i)).a((new StringBuilder(String.valueOf(s1))).append("\t").toString()));
            i++;
        } while (true);
    }

    public String toString()
    {
        return a(null);
    }

}
