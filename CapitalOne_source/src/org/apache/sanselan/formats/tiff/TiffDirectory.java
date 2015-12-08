// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;

import java.util.ArrayList;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;

// Referenced classes of package org.apache.sanselan.formats.tiff:
//            TiffElement, TiffField, JpegImageData

public class TiffDirectory extends TiffElement
    implements TiffConstants
{

    public final int a;
    public final ArrayList b;
    public final int c;
    private JpegImageData g;

    public TiffDirectory(int i, ArrayList arraylist, int j, int k)
    {
        super(j, arraylist.size() * 12 + 2 + 4);
        g = null;
        a = i;
        b = arraylist;
        c = k;
    }

    public static final String a(int i)
    {
        switch (i)
        {
        default:
            return "Bad Type";

        case -1: 
            return "Unknown";

        case 0: // '\0'
            return "Root";

        case 1: // '\001'
            return "Sub";

        case 2: // '\002'
            return "Thumbnail";

        case -2: 
            return "Exif";

        case -3: 
            return "Gps";

        case -4: 
            return "Interoperability";
        }
    }

    private TiffField a(TagInfo taginfo)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        TiffField tifffield = null;
_L4:
        return tifffield;
_L2:
        int i = 0;
        do
        {
            if (i >= b.size())
            {
                return null;
            }
            TiffField tifffield1 = (TiffField)b.get(i);
            tifffield = tifffield1;
            if (tifffield1.c == taginfo.b)
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a()
    {
        return a(a);
    }

    public final void a(JpegImageData jpegimagedata)
    {
        g = jpegimagedata;
    }

    public final ArrayList b()
    {
        return new ArrayList(b);
    }

    public final boolean c()
    {
        return a(aE_) != null;
    }

    public final ImageDataElement d()
    {
        TiffField tifffield = a(aE_);
        TiffField tifffield1 = a(aF_);
        if (tifffield != null && tifffield1 != null)
        {
            return new ImageDataElement(tifffield.d()[0], tifffield1.d()[0]);
        } else
        {
            throw new ImageReadException("Couldn't find image data.");
        }
    }

    public final JpegImageData e()
    {
        return g;
    }

    private class ImageDataElement extends TiffElement
    {

        final TiffDirectory a;

        public ImageDataElement(int i, int j)
        {
            a = TiffDirectory.this;
            super(i, j);
        }
    }

}
