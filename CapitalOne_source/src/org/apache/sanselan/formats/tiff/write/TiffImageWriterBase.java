// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryConstants;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffOutputSet, TiffOutputDirectory, TiffOutputField, TiffOutputSummary

public abstract class TiffImageWriterBase
    implements BinaryConstants, TiffConstants
{

    protected final int a;

    public TiffImageWriterBase()
    {
        a = 73;
    }

    public TiffImageWriterBase(int i)
    {
        a = i;
    }

    protected final TiffOutputSummary a(TiffOutputSet tiffoutputset)
    {
        Object obj;
        Object obj1;
        Object obj2;
        TiffOutputField tiffoutputfield;
        TiffOutputField tiffoutputfield1;
        TiffOutputField tiffoutputfield2;
        Object obj7;
        ArrayList arraylist;
        List list;
        int i;
        list = tiffoutputset.a();
        if (1 > list.size())
        {
            throw new ImageWriteException("No directories.");
        }
        obj2 = null;
        tiffoutputfield1 = null;
        tiffoutputfield2 = null;
        tiffoutputfield = null;
        arraylist = new ArrayList();
        obj7 = new HashMap();
        obj = null;
        obj1 = null;
        i = 0;
_L10:
        Object obj3;
        Object obj5;
        int k;
        if (i >= list.size())
        {
            if (arraylist.size() <= 0)
            {
                throw new ImageWriteException("Missing root directory.");
            }
            break MISSING_BLOCK_LABEL_620;
        }
        obj3 = (TiffOutputDirectory)list.get(i);
        k = ((TiffOutputDirectory) (obj3)).a;
        obj5 = new Integer(k);
        ((Map) (obj7)).put(obj5, obj3);
        if (k >= 0) goto _L2; else goto _L1
_L1:
        k;
        JVM INSTR tableswitch -4 -2: default 172
    //                   -4 302
    //                   -3 270
    //                   -2 197;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new ImageWriteException((new StringBuilder("Unknown directory: ")).append(k).toString());
_L6:
        if (obj != null)
        {
            throw new ImageWriteException("More than one EXIF directory.");
        }
        obj5 = obj3;
        obj = obj2;
        obj2 = obj5;
_L7:
        HashSet hashset;
        ArrayList arraylist1;
        hashset = new HashSet();
        arraylist1 = ((TiffOutputDirectory) (obj3)).a();
        k = 0;
_L8:
        if (k >= arraylist1.size())
        {
            i++;
            obj3 = obj2;
            obj2 = obj;
            obj = obj3;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_394;
_L5:
        if (obj1 != null)
        {
            throw new ImageWriteException("More than one GPS directory.");
        }
        obj1 = obj2;
        obj2 = obj;
        obj5 = obj3;
        obj = obj1;
        obj1 = obj5;
          goto _L7
_L4:
        if (obj2 != null)
        {
            throw new ImageWriteException("More than one Interoperability directory.");
        }
        obj2 = obj;
        obj = obj3;
          goto _L7
_L2:
        if (arraylist.contains(obj5))
        {
            throw new ImageWriteException((new StringBuilder("More than one directory with index: ")).append(k).append(".").toString());
        }
        arraylist.add(new Integer(k));
        obj5 = obj;
        obj = obj2;
        obj2 = obj5;
          goto _L7
        Object obj4 = (TiffOutputField)arraylist1.get(k);
        Object obj6 = new Integer(((TiffOutputField) (obj4)).a);
        if (hashset.contains(obj6))
        {
            throw new ImageWriteException((new StringBuilder("Tag (")).append(((TiffOutputField) (obj4)).b.a()).append(") appears twice in directory.").toString());
        }
        hashset.add(obj6);
        int j;
        if (((TiffOutputField) (obj4)).a == co.b)
        {
            if (tiffoutputfield1 != null)
            {
                throw new ImageWriteException("More than one Exif directory offset field.");
            }
            tiffoutputfield1 = tiffoutputfield2;
            tiffoutputfield2 = ((TiffOutputField) (obj4));
        } else
        if (((TiffOutputField) (obj4)).a == dz.b)
        {
            if (tiffoutputfield != null)
            {
                throw new ImageWriteException("More than one Interoperability directory offset field.");
            }
            obj6 = tiffoutputfield1;
            tiffoutputfield = ((TiffOutputField) (obj4));
            tiffoutputfield1 = tiffoutputfield2;
            tiffoutputfield2 = ((TiffOutputField) (obj6));
        } else
        if (((TiffOutputField) (obj4)).a == cw.b)
        {
            if (tiffoutputfield2 != null)
            {
                throw new ImageWriteException("More than one GPS directory offset field.");
            }
            tiffoutputfield2 = tiffoutputfield1;
            tiffoutputfield1 = ((TiffOutputField) (obj4));
        } else
        {
            TiffOutputField tiffoutputfield3 = tiffoutputfield1;
            tiffoutputfield1 = tiffoutputfield2;
            tiffoutputfield2 = tiffoutputfield3;
        }
        k++;
        obj4 = tiffoutputfield2;
        tiffoutputfield2 = tiffoutputfield1;
        tiffoutputfield1 = ((TiffOutputField) (obj4));
          goto _L8
        Collections.sort(arraylist);
        obj4 = null;
        j = 0;
        do
        {
            if (j >= arraylist.size())
            {
                obj6 = (TiffOutputDirectory)((Map) (obj7)).get(new Integer(0));
                obj7 = new TiffOutputSummary(a, ((TiffOutputDirectory) (obj6)), ((Map) (obj7)));
                if (obj2 == null && tiffoutputfield != null)
                {
                    throw new ImageWriteException("Output set has Interoperability Directory Offset field, but no Interoperability Directory");
                }
                break;
            }
            obj6 = (Integer)arraylist.get(j);
            if (((Integer) (obj6)).intValue() != j)
            {
                throw new ImageWriteException((new StringBuilder("Missing directory: ")).append(j).append(".").toString());
            }
            obj6 = (TiffOutputDirectory)((Map) (obj7)).get(obj6);
            if (obj4 != null)
            {
                ((TiffOutputDirectory) (obj4)).a(((TiffOutputDirectory) (obj6)));
            }
            j++;
            obj4 = obj6;
        } while (true);
        obj4 = obj;
        if (obj2 != null)
        {
            obj4 = obj;
            if (obj == null)
            {
                obj4 = tiffoutputset.d();
            }
            tiffoutputset = tiffoutputfield;
            if (tiffoutputfield == null)
            {
                tiffoutputset = TiffOutputField.a(dz, a);
                ((TiffOutputDirectory) (obj4)).a(tiffoutputset);
            }
            ((TiffOutputSummary) (obj7)).a(((TiffOutputItem) (obj2)), tiffoutputset);
        }
        if (obj4 == null && tiffoutputfield1 != null)
        {
            throw new ImageWriteException("Output set has Exif Directory Offset field, but no Exif Directory");
        }
        if (obj4 != null)
        {
            tiffoutputset = tiffoutputfield1;
            if (tiffoutputfield1 == null)
            {
                tiffoutputset = TiffOutputField.a(co, a);
                ((TiffOutputDirectory) (obj6)).a(tiffoutputset);
            }
            ((TiffOutputSummary) (obj7)).a(((TiffOutputItem) (obj4)), tiffoutputset);
        }
        if (obj1 == null && tiffoutputfield2 != null)
        {
            throw new ImageWriteException("Output set has GPS Directory Offset field, but no GPS Directory");
        }
        if (obj1 != null)
        {
            tiffoutputset = tiffoutputfield2;
            if (tiffoutputfield2 == null)
            {
                tiffoutputset = TiffOutputField.a(cw, a);
                ((TiffOutputDirectory) (obj6)).a(tiffoutputset);
            }
            ((TiffOutputSummary) (obj7)).a(((TiffOutputItem) (obj1)), tiffoutputset);
        }
        return ((TiffOutputSummary) (obj7));
        if (true) goto _L10; else goto _L9
_L9:
    }

    public abstract void a(OutputStream outputstream, TiffOutputSet tiffoutputset);

    protected final void a(BinaryOutputStream binaryoutputstream)
    {
        a(binaryoutputstream, 8);
    }

    protected final void a(BinaryOutputStream binaryoutputstream, int i)
    {
        binaryoutputstream.write(a);
        binaryoutputstream.write(a);
        binaryoutputstream.b(42);
        binaryoutputstream.a(i);
    }
}
