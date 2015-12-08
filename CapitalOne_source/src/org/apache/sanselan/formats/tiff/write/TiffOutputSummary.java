// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeLong;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffOutputItem, TiffOutputField, ImageDataOffsets, TiffOutputDirectory

class TiffOutputSummary
    implements TiffConstants
{

    public final int a;
    public final TiffOutputDirectory b;
    public final Map c;
    private List d;
    private List e;

    public TiffOutputSummary(int i, TiffOutputDirectory tiffoutputdirectory, Map map)
    {
        d = new ArrayList();
        e = new ArrayList();
        a = i;
        b = tiffoutputdirectory;
        c = map;
    }

    public final void a(int i)
    {
        int j;
        j = 0;
        do
        {
            if (j >= d.size())
            {
                j = 0;
                break MISSING_BLOCK_LABEL_20;
            }
            OffsetItem offsetitem = (OffsetItem)d.get(j);
            byte abyte0[] = fS.a(new int[] {
                offsetitem.a.d()
            }, i);
            offsetitem.b.a(abyte0);
            j++;
        } while (true);
_L2:
        ImageDataOffsets imagedataoffsets;
        int k;
        if (j >= e.size())
        {
            return;
        }
        imagedataoffsets = (ImageDataOffsets)e.get(j);
        k = 0;
_L3:
label0:
        {
            if (k < imagedataoffsets.c.length)
            {
                break label0;
            }
            imagedataoffsets.b.a(fS.a(imagedataoffsets.a, i));
            j++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        TiffOutputItem tiffoutputitem = imagedataoffsets.c[k];
        imagedataoffsets.a[k] = tiffoutputitem.d();
        k++;
          goto _L3
    }

    public final void a(TiffOutputItem tiffoutputitem, TiffOutputField tiffoutputfield)
    {
        d.add(new OffsetItem(tiffoutputitem, tiffoutputfield));
    }

    private class OffsetItem
    {

        public final TiffOutputItem a;
        public final TiffOutputField b;

        public OffsetItem(TiffOutputItem tiffoutputitem, TiffOutputField tiffoutputfield)
        {
            b = tiffoutputfield;
            a = tiffoutputitem;
        }
    }

}
