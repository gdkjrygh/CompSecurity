// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.io.OutputStream;
import java.util.List;
import org.apache.sanselan.common.BinaryOutputStream;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffImageWriterBase, TiffOutputSet, TiffOutputSummary, TiffOutputItem

public class TiffImageWriterLossy extends TiffImageWriterBase
{

    public TiffImageWriterLossy()
    {
    }

    public TiffImageWriterLossy(int i)
    {
        super(i);
    }

    public final void a(OutputStream outputstream, TiffOutputSet tiffoutputset)
    {
        int i;
        TiffOutputSummary tiffoutputsummary = a(tiffoutputset);
        tiffoutputset = tiffoutputset.a(tiffoutputsummary);
        i = 0;
        int j = 8;
        do
        {
            if (i >= tiffoutputset.size())
            {
                tiffoutputsummary.a(a);
                outputstream = new BinaryOutputStream(outputstream, a);
                a(((BinaryOutputStream) (outputstream)));
                i = 0;
                break MISSING_BLOCK_LABEL_59;
            }
            TiffOutputItem tiffoutputitem1 = (TiffOutputItem)tiffoutputset.get(i);
            tiffoutputitem1.a(j);
            int l = tiffoutputitem1.c();
            j = j + l + (4 - l % 4) % 4;
            i++;
        } while (true);
_L2:
        int k;
        int i1;
        if (i >= tiffoutputset.size())
        {
            return;
        }
        TiffOutputItem tiffoutputitem = (TiffOutputItem)tiffoutputset.get(i);
        tiffoutputitem.a(outputstream);
        i1 = tiffoutputitem.c();
        k = 0;
_L3:
label0:
        {
            if (k < (4 - i1 % 4) % 4)
            {
                break label0;
            }
            i++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        outputstream.write(0);
        k++;
          goto _L3
    }
}
