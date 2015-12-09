// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.util.ArrayList;
import java.util.List;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffOutputDirectory, TiffOutputField, TiffOutputSummary

public final class TiffOutputSet
    implements TiffConstants
{

    private static final String c = System.getProperty("line.separator");
    public final int a;
    private final ArrayList b;

    public TiffOutputSet()
    {
        this(73);
    }

    public TiffOutputSet(int i)
    {
        b = new ArrayList();
        a = i;
    }

    private TiffOutputDirectory a(int i)
    {
        int j = 0;
_L6:
        if (j < b.size()) goto _L2; else goto _L1
_L1:
        TiffOutputDirectory tiffoutputdirectory = null;
_L4:
        return tiffoutputdirectory;
_L2:
        TiffOutputDirectory tiffoutputdirectory1;
        tiffoutputdirectory1 = (TiffOutputDirectory)b.get(j);
        tiffoutputdirectory = tiffoutputdirectory1;
        if (tiffoutputdirectory1.a == i) goto _L4; else goto _L3
_L3:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(TiffOutputDirectory tiffoutputdirectory)
    {
        if (a(tiffoutputdirectory.a) != null)
        {
            throw new ImageWriteException("Output set already contains a directory of that type.");
        } else
        {
            b.add(tiffoutputdirectory);
            return;
        }
    }

    public final List a()
    {
        return new ArrayList(b);
    }

    protected final List a(TiffOutputSummary tiffoutputsummary)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= b.size())
            {
                return arraylist;
            }
            arraylist.addAll(((TiffOutputDirectory)b.get(i)).a(tiffoutputsummary));
            i++;
        } while (true);
    }

    public final TiffOutputDirectory b()
    {
        return a(0);
    }

    public final TiffOutputDirectory c()
    {
        if (a(0) == null)
        {
            a(new TiffOutputDirectory(0));
        }
        TiffOutputDirectory tiffoutputdirectory = a(-2);
        if (tiffoutputdirectory != null)
        {
            return tiffoutputdirectory;
        } else
        {
            return d();
        }
    }

    public final TiffOutputDirectory d()
    {
        TiffOutputDirectory tiffoutputdirectory = new TiffOutputDirectory(-2);
        a(tiffoutputdirectory);
        return tiffoutputdirectory;
    }

    public final String toString()
    {
        StringBuffer stringbuffer;
        int i;
        stringbuffer = new StringBuffer();
        stringbuffer.append("");
        stringbuffer.append("TiffOutputSet {");
        stringbuffer.append(c);
        stringbuffer.append("");
        stringbuffer.append((new StringBuilder("byteOrder: ")).append(a).toString());
        stringbuffer.append(c);
        i = 0;
_L2:
        if (i >= b.size())
        {
            stringbuffer.append("");
            stringbuffer.append("}");
            stringbuffer.append(c);
            return stringbuffer.toString();
        }
        Object obj = (TiffOutputDirectory)b.get(i);
        stringbuffer.append("");
        stringbuffer.append((new StringBuilder("\tdirectory ")).append(i).append(": ").append(((TiffOutputDirectory) (obj)).b()).append(" (").append(((TiffOutputDirectory) (obj)).a).append(")").toString());
        stringbuffer.append(c);
        obj = ((TiffOutputDirectory) (obj)).a();
        int j = 0;
        do
        {
label0:
            {
                if (j < ((ArrayList) (obj)).size())
                {
                    break label0;
                }
                i++;
            }
            if (true)
            {
                continue;
            }
            TiffOutputField tiffoutputfield = (TiffOutputField)((ArrayList) (obj)).get(j);
            stringbuffer.append("");
            stringbuffer.append((new StringBuilder("\t\tfield ")).append(i).append(": ").append(tiffoutputfield.b).toString());
            stringbuffer.append(c);
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

}
