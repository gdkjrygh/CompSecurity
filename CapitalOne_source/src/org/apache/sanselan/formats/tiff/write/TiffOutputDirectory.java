// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.formats.tiff.JpegImageData;
import org.apache.sanselan.formats.tiff.TiffDirectory;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeLong;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffOutputItem, TiffOutputField, TiffOutputSummary

public final class TiffOutputDirectory extends TiffOutputItem
    implements TiffConstants
{

    public final int a;
    private final ArrayList b = new ArrayList();
    private TiffOutputDirectory c;
    private JpegImageData d;

    public TiffOutputDirectory(int i)
    {
        c = null;
        d = null;
        a = i;
    }

    private void a(TagInfo taginfo)
    {
        int i;
        int j;
        j = taginfo.b;
        i = 0;
_L6:
        if (i < b.size()) goto _L2; else goto _L1
_L1:
        taginfo = null;
_L4:
        if (taginfo != null)
        {
            b.remove(taginfo);
        }
        return;
_L2:
        TiffOutputField tiffoutputfield;
        tiffoutputfield = (TiffOutputField)b.get(i);
        taginfo = tiffoutputfield;
        if (tiffoutputfield.a == j) goto _L4; else goto _L3
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final ArrayList a()
    {
        return new ArrayList(b);
    }

    protected final List a(TiffOutputSummary tiffoutputsummary)
    {
        int i = 0;
        a(aE_);
        a(aF_);
        TiffOutputField tiffoutputfield;
        ArrayList arraylist;
        _cls1 _lcls1;
        if (d != null)
        {
            tiffoutputfield = new TiffOutputField(aE_, fS, 1, FieldType.b());
            a(tiffoutputfield);
            FieldTypeLong fieldtypelong = fS;
            int j = d.e;
            int k = tiffoutputsummary.a;
            byte abyte0[] = fieldtypelong.a(new int[] {
                j
            }, k);
            a(new TiffOutputField(aF_, fS, 1, abyte0));
        } else
        {
            tiffoutputfield = null;
        }
        a(K_);
        a(O_);
        a(ar_);
        a(as_);
        arraylist = new ArrayList();
        arraylist.add(this);
        _lcls1 = new _cls1();
        Collections.sort(b, _lcls1);
        do
        {
            if (i >= b.size())
            {
                if (d != null)
                {
                    TiffOutputItem.Value value = new TiffOutputItem.Value("JPEG image data", d.a);
                    arraylist.add(value);
                    tiffoutputsummary.a(value, tiffoutputfield);
                }
                return arraylist;
            }
            TiffOutputField tiffoutputfield1 = (TiffOutputField)b.get(i);
            if (!tiffoutputfield1.b())
            {
                arraylist.add(tiffoutputfield1.a());
            }
            i++;
        } while (true);
    }

    public final void a(BinaryOutputStream binaryoutputstream)
    {
        binaryoutputstream.b(b.size());
        int i = 0;
        do
        {
            if (i >= b.size())
            {
                if (c != null)
                {
                    i = c.d();
                } else
                {
                    i = 0;
                }
                if (i == -1)
                {
                    binaryoutputstream.a(0);
                    return;
                } else
                {
                    binaryoutputstream.a(i);
                    return;
                }
            }
            ((TiffOutputField)b.get(i)).a(binaryoutputstream);
            i++;
        } while (true);
    }

    public final void a(TiffOutputDirectory tiffoutputdirectory)
    {
        c = tiffoutputdirectory;
    }

    public final void a(TiffOutputField tiffoutputfield)
    {
        b.add(tiffoutputfield);
    }

    public final String b()
    {
        return TiffDirectory.a(a);
    }

    public final int c()
    {
        return b.size() * 12 + 2 + 4;
    }

    private class _cls1
        implements Comparator
    {

        final TiffOutputDirectory a;

        public int compare(Object obj, Object obj1)
        {
            obj = (TiffOutputField)obj;
            obj1 = (TiffOutputField)obj1;
            if (((TiffOutputField) (obj)).a != ((TiffOutputField) (obj1)).a)
            {
                return ((TiffOutputField) (obj)).a - ((TiffOutputField) (obj1)).a;
            } else
            {
                return ((TiffOutputField) (obj)).c() - ((TiffOutputField) (obj1)).c();
            }
        }

        _cls1()
        {
            a = TiffOutputDirectory.this;
            super();
        }
    }

}
