// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.sanselan.FormatCompliance;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.formats.tiff:
//            TiffHeader, TiffDirectory, JpegImageData, TiffField, 
//            TiffContents

public class TiffReader extends BinaryFileParser
    implements TiffConstants
{

    private final boolean b = false;

    public TiffReader()
    {
    }

    private TiffHeader a(ByteSource bytesource)
    {
        ByteSource bytesource1 = null;
        bytesource = bytesource.b();
        bytesource1 = bytesource;
        byte byte0 = a("BYTE_ORDER_1", ((InputStream) (bytesource)), "Not a Valid TIFF File");
        bytesource1 = bytesource;
        b(byte0, a("BYTE_ORDER_2", ((InputStream) (bytesource)), "Not a Valid TIFF File"));
        bytesource1 = bytesource;
        int i = c("tiffVersion", bytesource, "Not a Valid TIFF File");
        if (i == 42)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        bytesource1 = bytesource;
        throw new ImageReadException((new StringBuilder("Unknown Tiff Version: ")).append(i).toString());
        bytesource;
        TiffHeader tiffheader;
        int j;
        if (bytesource1 != null)
        {
            try
            {
                bytesource1.close();
            }
            catch (Exception exception)
            {
                Debug.a(exception);
            }
        }
        throw bytesource;
        bytesource1 = bytesource;
        j = b("offsetToFirstIFD", bytesource, "Not a Valid TIFF File");
        bytesource1 = bytesource;
        a(((InputStream) (bytesource)), j - 8, "Not a Valid TIFF File: couldn't find IFDs");
        bytesource1 = bytesource;
        if (!a_)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        bytesource1 = bytesource;
        System.out.println("");
        bytesource1 = bytesource;
        tiffheader = new TiffHeader(byte0, i, j);
        if (bytesource != null)
        {
            try
            {
                bytesource.close();
            }
            // Misplaced declaration of an exception variable
            catch (ByteSource bytesource)
            {
                Debug.a(bytesource);
                return tiffheader;
            }
        }
        return tiffheader;
    }

    private boolean a(ByteSource bytesource, int i, int j, FormatCompliance formatcompliance, Listener listener, List list)
    {
        return a(bytesource, i, j, formatcompliance, listener, false, list);
    }

    private boolean a(ByteSource bytesource, int i, int j, FormatCompliance formatcompliance, Listener listener, boolean flag, List list)
    {
        ArrayList arraylist;
        Integer integer = new Integer(i);
        if (list.contains(integer))
        {
            return false;
        }
        list.add(integer);
        arraylist = null;
        InputStream inputstream = bytesource.b();
        long l2;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        l2 = i;
        inputstream.skip(l2);
        arraylist = new ArrayList();
        l2 = i;
        long l3 = bytesource.c();
        if (l2 >= l3)
        {
            if (inputstream != null)
            {
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (ByteSource bytesource)
                {
                    Debug.a(bytesource);
                }
            }
            return true;
        }
        int l = c("DirectoryEntryCount", inputstream, "Not a Valid TIFF File");
        int k = 0;
_L5:
        if (k < l) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new TiffDirectory(j, arraylist, i, b("nextDirectoryOffset", inputstream, "Not a Valid TIFF File"));
        if (!listener.a() || !((TiffDirectory) (obj)).c())
        {
            break MISSING_BLOCK_LABEL_236;
        }
        TiffDirectory.ImageDataElement imagedataelement = ((TiffDirectory) (obj)).d();
        l = imagedataelement.d;
        k = imagedataelement.e;
        i = k;
        if ((long)(l + k) == bytesource.c() + 1L)
        {
            i = k - 1;
        }
        ((TiffDirectory) (obj)).a(new JpegImageData(l, i, bytesource.b(l, i)));
        boolean flag1 = listener.a(((TiffDirectory) (obj)));
        if (!flag1)
        {
            int j1;
            int k1;
            int l1;
            int i2;
            if (inputstream != null)
            {
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (ByteSource bytesource)
                {
                    Debug.a(bytesource);
                }
            }
            return true;
        }
          goto _L3
        bytesource;
        if (b)
        {
            throw bytesource;
        }
          goto _L4
        bytesource;
        formatcompliance = inputstream;
_L10:
        ArrayList arraylist1;
        TiffField tifffield;
        int i1;
        if (formatcompliance != null)
        {
            try
            {
                formatcompliance.close();
            }
            // Misplaced declaration of an exception variable
            catch (FormatCompliance formatcompliance)
            {
                Debug.a(formatcompliance);
            }
        }
        throw bytesource;
_L4:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (ByteSource bytesource)
            {
                Debug.a(bytesource);
            }
        }
        return true;
_L2:
        j1 = c("Tag", inputstream, "Not a Valid TIFF File");
        k1 = c("Type", inputstream, "Not a Valid TIFF File");
        l1 = b("Length", inputstream, "Not a Valid TIFF File");
        obj = a("ValueOffset", 4, inputstream, "Not a Valid TIFF File");
        i2 = b("ValueOffset", ((byte []) (obj)));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_430;
        }
        obj = new TiffField(j1, j, k1, l1, i2, ((byte []) (obj)), c());
        ((TiffField) (obj)).a(k);
        ((TiffField) (obj)).a(bytesource);
        arraylist.add(obj);
        listener.a(((TiffField) (obj)));
        k++;
          goto _L5
_L3:
        listener.b();
        arraylist1 = new ArrayList();
        k = 0;
_L11:
        if (k < arraylist.size())
        {
            break MISSING_BLOCK_LABEL_530;
        }
        arraylist.removeAll(arraylist1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_518;
        }
        if (((TiffDirectory) (obj)).c > 0)
        {
            a(bytesource, ((TiffDirectory) (obj)).c, j + 1, formatcompliance, listener, list);
        }
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (ByteSource bytesource)
            {
                Debug.a(bytesource);
            }
        }
        return true;
        tifffield = (TiffField)arraylist.get(k);
        if (tifffield.c != TiffConstants.co.b && tifffield.c != TiffConstants.cw.b && tifffield.c != TiffConstants.dz.b)
        {
            break MISSING_BLOCK_LABEL_721;
        }
        i1 = ((Number)tifffield.c()).intValue();
        if (tifffield.c != TiffConstants.co.b) goto _L7; else goto _L6
_L6:
        i = -2;
_L9:
        if (!a(bytesource, i1, i, formatcompliance, listener, true, list))
        {
            arraylist1.add(tifffield);
        }
        break MISSING_BLOCK_LABEL_721;
_L7:
        if (tifffield.c == TiffConstants.cw.b)
        {
            i = -3;
            continue; /* Loop/switch isn't completed */
        }
        if (tifffield.c != TiffConstants.dz.b)
        {
            break; /* Loop/switch isn't completed */
        }
        i = -4;
        if (true) goto _L9; else goto _L8
_L8:
        throw new ImageReadException("Unknown subdirectory type.");
        bytesource;
        formatcompliance = arraylist;
          goto _L10
        k++;
          goto _L11
    }

    public final TiffContents a(ByteSource bytesource, FormatCompliance formatcompliance)
    {
        Collector collector = new Collector((byte)0);
        TiffHeader tiffheader = a(bytesource);
        collector.a(tiffheader);
        a(bytesource, tiffheader.c, 0, formatcompliance, ((Listener) (collector)), ((List) (new ArrayList())));
        return collector.c();
    }

    private class Listener
    {

        public abstract boolean a();

        public abstract boolean a(TiffDirectory tiffdirectory);

        public abstract boolean a(TiffField tifffield);

        public abstract boolean a(TiffHeader tiffheader);

        public abstract boolean b();
    }


    private class Collector
        implements Listener
    {

        private TiffHeader a;
        private ArrayList b;
        private ArrayList c;
        private final boolean d;

        public boolean a()
        {
            return d;
        }

        public boolean a(TiffDirectory tiffdirectory)
        {
            b.add(tiffdirectory);
            return true;
        }

        public final boolean a(TiffField tifffield)
        {
            c.add(tifffield);
            return true;
        }

        public final boolean a(TiffHeader tiffheader)
        {
            a = tiffheader;
            return true;
        }

        public final boolean b()
        {
            return true;
        }

        public final TiffContents c()
        {
            return new TiffContents(a, b);
        }

        public Collector()
        {
            this((byte)0);
        }

        public Collector(byte byte0)
        {
            a = null;
            b = new ArrayList();
            c = new ArrayList();
            d = true;
        }
    }

}
