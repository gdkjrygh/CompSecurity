// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldTypeLong;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffOutputItem

public class TiffOutputField
    implements TiffConstants
{

    private static final String h = System.getProperty("line.separator");
    public final int a;
    public final TagInfo b;
    public final FieldType c;
    public final int d;
    private byte e[];
    private final TiffOutputItem.Value f;
    private int g;

    private TiffOutputField(int i, TagInfo taginfo, FieldType fieldtype, int j, byte abyte0[])
    {
        g = -1;
        a = i;
        b = taginfo;
        c = fieldtype;
        d = j;
        e = abyte0;
        if (b())
        {
            f = null;
            return;
        } else
        {
            f = new TiffOutputItem.Value((new StringBuilder("Field Seperate value (")).append(taginfo.a()).append(")").toString(), abyte0);
            return;
        }
    }

    public TiffOutputField(TagInfo taginfo, FieldType fieldtype, int i, byte abyte0[])
    {
        this(taginfo.b, taginfo, fieldtype, i, abyte0);
    }

    protected static final TiffOutputField a(TagInfo taginfo, int i)
    {
        return new TiffOutputField(taginfo, fS, 1, fS.a(new int[1], i));
    }

    protected final TiffOutputItem a()
    {
        return f;
    }

    protected final void a(BinaryOutputStream binaryoutputstream)
    {
        binaryoutputstream.b(a);
        binaryoutputstream.b(c.b);
        binaryoutputstream.a(d);
        if (b())
        {
            if (f != null)
            {
                throw new ImageWriteException("Unexpected separate value item.");
            }
            if (e.length > 4)
            {
                throw new ImageWriteException((new StringBuilder("Local value has invalid length: ")).append(e.length).toString());
            }
            binaryoutputstream.a(e);
            int j = e.length;
            int i = 0;
            do
            {
                if (i >= 4 - j)
                {
                    return;
                }
                binaryoutputstream.write(0);
                i++;
            } while (true);
        }
        if (f == null)
        {
            throw new ImageWriteException("Missing separate value item.");
        } else
        {
            binaryoutputstream.a(f.d());
            return;
        }
    }

    protected final void a(byte abyte0[])
    {
        if (e.length != abyte0.length)
        {
            throw new ImageWriteException("Cannot change size of value.");
        }
        e = abyte0;
        if (f != null)
        {
            f.a(abyte0);
        }
    }

    protected final boolean b()
    {
        return e.length <= 4;
    }

    public final int c()
    {
        return g;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("");
        stringbuffer.append(b);
        stringbuffer.append(h);
        stringbuffer.append("");
        stringbuffer.append((new StringBuilder("count: ")).append(d).toString());
        stringbuffer.append(h);
        stringbuffer.append("");
        stringbuffer.append(c);
        stringbuffer.append(h);
        return stringbuffer.toString();
    }

}
