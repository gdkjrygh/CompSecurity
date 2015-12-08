// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.sanselan.FormatCompliance;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.common.byteSources.ByteSourceArray;
import org.apache.sanselan.formats.tiff.TiffContents;
import org.apache.sanselan.formats.tiff.TiffDirectory;
import org.apache.sanselan.formats.tiff.TiffElement;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffReader;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffImageWriterBase, TiffOutputSet, TiffOutputDirectory, TiffOutputItem, 
//            TiffImageWriterLossy, TiffOutputSummary

public class TiffImageWriterLossless extends TiffImageWriterBase
{

    private static final Comparator c = new _cls1();
    private static final Comparator d = new _cls2();
    private final byte b[];

    public TiffImageWriterLossless(int i, byte abyte0[])
    {
        super(i);
        b = abyte0;
    }

    private List a()
    {
        ArrayList arraylist1;
        int i;
        int j;
        int k;
        int l;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        TiffElement tiffelement;
        try
        {
            obj = new ByteSourceArray(b);
            FormatCompliance formatcompliance = FormatCompliance.a();
            obj = (new TiffReader()).a(((org.apache.sanselan.common.byteSources.ByteSource) (obj)), formatcompliance);
            arraylist = new ArrayList();
            obj = ((TiffContents) (obj)).b;
        }
        catch (ImageReadException imagereadexception)
        {
            throw new ImageWriteException(imagereadexception.getMessage(), imagereadexception);
        }
        i = 0;
_L13:
        if (i < ((List) (obj)).size()) goto _L2; else goto _L1
_L1:
        Collections.sort(arraylist, TiffElement.f);
        arraylist1 = new ArrayList();
        obj = null;
        i = 0;
        j = -1;
_L15:
        if (i < arraylist.size()) goto _L4; else goto _L3
_L3:
        if (obj == null) goto _L6; else goto _L5
_L5:
        arraylist1.add(new org.apache.sanselan.formats.tiff.TiffElement.Stub(((TiffElement) (obj)).d, j - ((TiffElement) (obj)).d));
        return arraylist1;
_L2:
        obj1 = (TiffDirectory)((List) (obj)).get(i);
        arraylist.add(obj1);
        arraylist1 = ((TiffDirectory) (obj1)).b();
        j = 0;
_L14:
        if (j < arraylist1.size()) goto _L8; else goto _L7
_L7:
        obj1 = ((TiffDirectory) (obj1)).e();
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        arraylist.add(obj1);
          goto _L10
_L8:
        tiffelement = ((TiffField)arraylist1.get(j)).a();
        if (tiffelement == null) goto _L12; else goto _L11
_L11:
        arraylist.add(tiffelement);
          goto _L12
_L4:
        obj1 = (TiffElement)arraylist.get(i);
        k = ((TiffElement) (obj1)).d;
        l = ((TiffElement) (obj1)).e;
        if (obj == null)
        {
            obj = obj1;
            break MISSING_BLOCK_LABEL_322;
        }
        if (((TiffElement) (obj1)).d - j <= 3)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        arraylist1.add(new org.apache.sanselan.formats.tiff.TiffElement.Stub(((TiffElement) (obj)).d, j - ((TiffElement) (obj)).d));
        obj = obj1;
        break MISSING_BLOCK_LABEL_322;
_L6:
        return arraylist1;
_L10:
        i++;
          goto _L13
_L12:
        j++;
          goto _L14
        j = k + l;
        i++;
          goto _L15
    }

    private void a(OutputStream outputstream, TiffOutputSet tiffoutputset, List list, List list1, int i)
    {
        boolean flag;
        flag = false;
        TiffOutputDirectory tiffoutputdirectory = tiffoutputset.b();
        tiffoutputset = new byte[i];
        System.arraycopy(b, 0, tiffoutputset, 0, Math.min(b.length, tiffoutputset.length));
        a(new BinaryOutputStream(new BufferOutputStream(tiffoutputset, 0), a), tiffoutputdirectory.d());
        i = 0;
_L3:
        if (i < list.size()) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
_L5:
        if (i >= list1.size())
        {
            outputstream.write(tiffoutputset);
            return;
        }
        break MISSING_BLOCK_LABEL_165;
_L2:
        TiffElement tiffelement;
        int j;
        tiffelement = (TiffElement)list.get(i);
        j = 0;
_L4:
label0:
        {
            if (j < tiffelement.e)
            {
                break label0;
            }
            i++;
        }
          goto _L3
        int k = tiffelement.d + j;
        if (k < tiffoutputset.length)
        {
            tiffoutputset[k] = 0;
        }
        j++;
          goto _L4
        list = (TiffOutputItem)list1.get(i);
        list.a(new BinaryOutputStream(new BufferOutputStream(tiffoutputset, list.d()), a));
        i++;
          goto _L5
    }

    public final void a(OutputStream outputstream, TiffOutputSet tiffoutputset)
    {
        List list;
        TiffOutputSummary tiffoutputsummary;
        List list1;
        ArrayList arraylist;
        int i;
        list = a();
        i = b.length;
        if (list.size() <= 0)
        {
            throw new ImageWriteException("Couldn't analyze old tiff data.");
        }
        if (list.size() == 1)
        {
            TiffElement tiffelement = (TiffElement)list.get(0);
            if (tiffelement.d == 8)
            {
                int j = tiffelement.d;
                if (tiffelement.e + j + 8 == i)
                {
                    (new TiffImageWriterLossy(a)).a(outputstream, tiffoutputset);
                    return;
                }
            }
        }
        tiffoutputsummary = a(tiffoutputset);
        list1 = tiffoutputset.a(tiffoutputsummary);
        i = b.length;
        arraylist = new ArrayList(list);
        Collections.sort(arraylist, TiffElement.f);
        Collections.reverse(arraylist);
_L5:
        if (arraylist.size() > 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        Collections.sort(arraylist, c);
        Collections.reverse(arraylist);
        arraylist1 = new ArrayList(list1);
        Collections.sort(arraylist1, d);
        Collections.reverse(arraylist1);
_L8:
        TiffElement tiffelement1;
        TiffOutputItem tiffoutputitem;
        int k;
        int l;
        if (arraylist1.size() <= 0)
        {
            tiffoutputsummary.a(a);
            a(outputstream, tiffoutputset, list, list1, i);
            return;
        }
        tiffoutputitem = (TiffOutputItem)arraylist1.remove(0);
        l = tiffoutputitem.c();
        k = 0;
        tiffelement1 = null;
          goto _L3
_L2:
        if ((tiffelement1 = (TiffElement)arraylist.get(0)).d + tiffelement1.e != i) goto _L1; else goto _L4
_L4:
        k = tiffelement1.e;
        arraylist.remove(0);
        i -= k;
          goto _L5
_L3:
        if (k < arraylist.size()) goto _L7; else goto _L6
_L6:
        TiffElement tiffelement2;
        if (tiffelement1 == null)
        {
            tiffoutputitem.a(i);
            i += l;
        } else
        {
            tiffoutputitem.a(tiffelement1.d);
            arraylist.remove(tiffelement1);
            if (tiffelement1.e > l)
            {
                arraylist.add(new org.apache.sanselan.formats.tiff.TiffElement.Stub(tiffelement1.d + l, tiffelement1.e - l));
                Collections.sort(arraylist, c);
                Collections.reverse(arraylist);
            }
        }
          goto _L8
_L7:
        if ((tiffelement2 = (TiffElement)arraylist.get(k)).e < l) goto _L6; else goto _L9
_L9:
        k++;
        tiffelement1 = tiffelement2;
          goto _L3
    }


    private class BufferOutputStream extends OutputStream
    {

        private final byte a[];
        private int b;

        public void write(int i)
        {
            if (b >= a.length)
            {
                throw new IOException("Buffer overflow.");
            } else
            {
                byte abyte0[] = a;
                int j = b;
                b = j + 1;
                abyte0[j] = (byte)i;
                return;
            }
        }

        public void write(byte abyte0[], int i, int j)
        {
            if (b + j > a.length)
            {
                throw new IOException("Buffer overflow.");
            } else
            {
                System.arraycopy(abyte0, i, a, b, j);
                b = b + j;
                return;
            }
        }

        public BufferOutputStream(byte abyte0[], int i)
        {
            a = abyte0;
            b = i;
        }
    }


    private class _cls1
        implements Comparator
    {

        public int compare(Object obj, Object obj1)
        {
            obj = (TiffElement)obj;
            obj1 = (TiffElement)obj1;
            return ((TiffElement) (obj)).e - ((TiffElement) (obj1)).e;
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Comparator
    {

        public int compare(Object obj, Object obj1)
        {
            obj = (TiffOutputItem)obj;
            obj1 = (TiffOutputItem)obj1;
            return ((TiffOutputItem) (obj)).c() - ((TiffOutputItem) (obj1)).c();
        }

        _cls2()
        {
        }
    }

}
