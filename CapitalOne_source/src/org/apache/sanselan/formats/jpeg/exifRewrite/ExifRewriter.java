// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.exifRewrite;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.byteSources.ByteSourceArray;
import org.apache.sanselan.formats.jpeg.JpegConstants;
import org.apache.sanselan.formats.jpeg.JpegUtils;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterBase;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterLossless;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterLossy;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;
import org.apache.sanselan.util.Debug;

public class ExifRewriter extends BinaryFileParser
    implements JpegConstants
{

    public ExifRewriter()
    {
        b();
    }

    private void a(OutputStream outputstream, List list, byte abyte0[])
    {
        int k;
        int l;
        k = 0;
        l = c();
        outputstream.write(e);
        boolean flag;
        int j;
        j = 0;
        flag = false;
_L6:
        if (j < list.size()) goto _L2; else goto _L1
_L1:
        if (flag || abyte0 == null) goto _L4; else goto _L3
_L3:
        byte abyte1[];
        abyte1 = a(65505, l);
        if (abyte0.length > 65535)
        {
            throw new ExifOverflowException((new StringBuilder("APP1 Segment is too long: ")).append(abyte0.length).toString());
        }
          goto _L5
        list;
        byte abyte2[];
        int i;
        try
        {
            outputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            Debug.a(outputstream);
        }
        throw list;
_L5:
        abyte2 = a(abyte0.length + 2, l);
        i = ((JFIFPieceSegment)list.get(0)).a;
        list.add(0, new JFIFPieceSegmentExif(65505, abyte1, abyte2, abyte0));
          goto _L4
_L7:
        k = list.size();
        if (j >= k)
        {
            try
            {
                outputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                Debug.a(outputstream);
            }
            break MISSING_BLOCK_LABEL_310;
        }
        abyte1 = (JFIFPiece)list.get(j);
        if (!(abyte1 instanceof JFIFPieceSegmentExif))
        {
            break MISSING_BLOCK_LABEL_288;
        }
        if (i)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        abyte1 = a(65505, l);
        if (abyte0.length > 65535)
        {
            throw new ExifOverflowException((new StringBuilder("APP1 Segment is too long: ")).append(abyte0.length).toString());
        }
        abyte2 = a(abyte0.length + 2, l);
        outputstream.write(abyte1);
        outputstream.write(abyte2);
        outputstream.write(abyte0);
        i = 1;
        break MISSING_BLOCK_LABEL_336;
        abyte1.a(outputstream);
        break MISSING_BLOCK_LABEL_336;
        return;
        i = 1;
        break MISSING_BLOCK_LABEL_336;
_L2:
        if ((JFIFPiece)list.get(j) instanceof JFIFPieceSegmentExif)
        {
            flag = true;
        }
        j++;
          goto _L6
_L4:
        i = 0;
        j = k;
          goto _L7
        j++;
          goto _L7
    }

    public final void a(byte abyte0[], OutputStream outputstream, TiffOutputSet tiffoutputset)
    {
        abyte0 = new ByteSourceArray(abyte0);
        Object obj = new ArrayList();
        Object obj1 = new ArrayList();
        _cls1 _lcls1 = new _cls1(((ArrayList) (obj)), ((List) (obj1)));
        (new JpegUtils()).a(abyte0, _lcls1);
        abyte0 = new JFIFPieces(((List) (obj)), ((List) (obj1)));
        obj = ((JFIFPieces) (abyte0)).a;
        if (((JFIFPieces) (abyte0)).b.size() > 0)
        {
            abyte0 = a("trimmed exif bytes", ((JFIFPieceSegment)((JFIFPieces) (abyte0)).b.get(0)).d);
            abyte0 = new TiffImageWriterLossless(tiffoutputset.a, abyte0);
        } else
        {
            abyte0 = new TiffImageWriterLossy(tiffoutputset.a);
        }
        obj1 = new ByteArrayOutputStream();
        ((ByteArrayOutputStream) (obj1)).write(c);
        ((ByteArrayOutputStream) (obj1)).write(0);
        ((ByteArrayOutputStream) (obj1)).write(0);
        abyte0.a(((OutputStream) (obj1)), tiffoutputset);
        a(outputstream, ((List) (obj)), ((ByteArrayOutputStream) (obj1)).toByteArray());
    }

    private class ExifOverflowException extends ImageWriteException
    {

        public ExifOverflowException(String s)
        {
            super(s);
        }
    }


    private class JFIFPiece
    {

        protected abstract void a(OutputStream outputstream);

        private JFIFPiece()
        {
        }

        JFIFPiece(byte byte0)
        {
            this();
        }
    }


    private class JFIFPieceSegmentExif extends JFIFPieceSegment
    {
        private class JFIFPieceSegment extends JFIFPiece
        {

            public final int a;
            public final byte b[];
            public final byte c[];
            public final byte d[];

            protected final void a(OutputStream outputstream)
            {
                outputstream.write(b);
                outputstream.write(c);
                outputstream.write(d);
            }

            public JFIFPieceSegment(int i, byte abyte0[], byte abyte1[], byte abyte2[])
            {
                super((byte)0);
                a = i;
                b = abyte0;
                c = abyte1;
                d = abyte2;
            }
        }


        public JFIFPieceSegmentExif(int i, byte abyte0[], byte abyte1[], byte abyte2[])
        {
            super(i, abyte0, abyte1, abyte2);
        }
    }


    private class _cls1
        implements org.apache.sanselan.formats.jpeg.JpegUtils.Visitor
    {

        final ExifRewriter a;
        private final ArrayList b;
        private final List c;

        public final boolean a()
        {
            return true;
        }

        public final boolean a(int i, byte abyte0[], byte abyte1[], byte abyte2[])
        {
            if (i != 65505)
            {
                b.add(new JFIFPieceSegment(i, abyte0, abyte1, abyte2));
            } else
            if (!ExifRewriter.b(abyte2, ExifRewriter.c))
            {
                b.add(new JFIFPieceSegment(i, abyte0, abyte1, abyte2));
            } else
            {
                abyte0 = new JFIFPieceSegmentExif(i, abyte0, abyte1, abyte2);
                b.add(abyte0);
                c.add(abyte0);
            }
            return true;
        }

        public final boolean a(byte abyte0[], InputStream inputstream)
        {
            b.add(new JFIFPieceImageData(abyte0, inputstream));
            return true;
        }

        _cls1(ArrayList arraylist, List list)
        {
            a = ExifRewriter.this;
            b = arraylist;
            c = list;
            super();
        }

        private class JFIFPieceImageData extends JFIFPiece
        {

            public final byte a[];
            public final byte b[] = null;
            public final InputStream c;

            protected final void a(OutputStream outputstream)
            {
                outputstream.write(a);
                if (b != null)
                {
                    outputstream.write(b);
                    return;
                }
                byte abyte0[] = new byte[1024];
                do
                {
                    int i = c.read(abyte0);
                    if (i <= 0)
                    {
                        try
                        {
                            c.close();
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (OutputStream outputstream)
                        {
                            return;
                        }
                    }
                    outputstream.write(abyte0, 0, i);
                } while (true);
            }

            public JFIFPieceImageData(byte abyte0[], InputStream inputstream)
            {
                super((byte)0);
                a = abyte0;
                c = inputstream;
            }
        }

    }


    private class JFIFPieces
    {

        public final List a;
        public final List b;

        public JFIFPieces(List list, List list1)
        {
            a = list;
            b = list1;
        }
    }

}
