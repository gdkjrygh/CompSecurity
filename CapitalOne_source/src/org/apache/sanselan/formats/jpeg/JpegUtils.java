// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg;

import java.io.InputStream;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.formats.jpeg:
//            JpegConstants

public class JpegUtils extends BinaryFileParser
    implements JpegConstants
{

    public JpegUtils()
    {
        b();
    }

    public static String a(int i)
    {
        switch (i)
        {
        case 65488: 
        case 65489: 
        case 65490: 
        case 65491: 
        case 65492: 
        case 65493: 
        case 65494: 
        case 65495: 
        case 65496: 
        case 65497: 
        case 65499: 
        case 65500: 
        case 65501: 
        case 65502: 
        case 65503: 
        case 65507: 
        case 65508: 
        case 65509: 
        case 65510: 
        case 65511: 
        case 65512: 
        case 65513: 
        case 65514: 
        case 65515: 
        case 65516: 
        default:
            return "Unknown";

        case 65498: 
            return "SOS_Marker";

        case 65505: 
            return "JPEG_APP1_Marker";

        case 65506: 
            return "JPEG_APP2_Marker";

        case 65517: 
            return "JPEG_APP13_Marker";

        case 65518: 
            return "JPEG_APP14_Marker";

        case 65519: 
            return "JPEG_APP15_Marker";

        case 65504: 
            return "JFIFMarker";

        case 65472: 
            return "SOF0Marker";

        case 65473: 
            return "SOF1Marker";

        case 65474: 
            return "SOF2Marker";

        case 65475: 
            return "SOF3Marker";

        case 65476: 
            return "SOF4Marker";

        case 65477: 
            return "SOF5Marker";

        case 65478: 
            return "SOF6Marker";

        case 65479: 
            return "SOF7Marker";

        case 65480: 
            return "SOF8Marker";

        case 65481: 
            return "SOF9Marker";

        case 65482: 
            return "SOF10Marker";

        case 65483: 
            return "SOF11Marker";

        case 65484: 
            return "SOF12Marker";

        case 65485: 
            return "SOF13Marker";

        case 65486: 
            return "SOF14Marker";

        case 65487: 
            return "SOF15Marker";
        }
    }

    public final void a(ByteSource bytesource, Visitor visitor)
    {
        ByteSource bytesource1 = null;
        bytesource = bytesource.b();
        bytesource1 = bytesource;
        a(((InputStream) (bytesource)), e, "Not a Valid JPEG File: doesn't begin with 0xffd8");
        bytesource1 = bytesource;
        int i = c();
_L8:
        bytesource1 = bytesource;
        byte abyte0[] = a("markerBytes", 2, ((InputStream) (bytesource)), "markerBytes");
        bytesource1 = bytesource;
        int j = c("marker", abyte0, i);
        if (j != 65497 && j != 65498) goto _L2; else goto _L1
_L1:
        bytesource1 = bytesource;
        boolean flag = visitor.a();
        if (flag) goto _L4; else goto _L3
_L3:
        if (bytesource == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        bytesource.close();
_L6:
        return;
        bytesource;
        Debug.a(bytesource);
        return;
_L4:
        bytesource1 = bytesource;
        flag = visitor.a(abyte0, bytesource);
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (bytesource == null || i == 0) goto _L6; else goto _L5
_L5:
        try
        {
            bytesource.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteSource bytesource)
        {
            Debug.a(bytesource);
        }
        return;
_L2:
        bytesource1 = bytesource;
        byte abyte1[] = a("segmentLengthBytes", 2, ((InputStream) (bytesource)), "segmentLengthBytes");
        bytesource1 = bytesource;
        flag = visitor.a(j, abyte0, abyte1, a("Segment Data", c("segmentLength", abyte1, i) - 2, ((InputStream) (bytesource)), "Invalid Segment: insufficient data"));
        if (flag) goto _L8; else goto _L7
_L7:
        if (bytesource == null) goto _L6; else goto _L9
_L9:
        try
        {
            bytesource.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteSource bytesource)
        {
            Debug.a(bytesource);
        }
        return;
        bytesource;
        if (bytesource1 != null)
        {
            try
            {
                bytesource1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Visitor visitor)
            {
                Debug.a(visitor);
            }
        }
        throw bytesource;
    }

    private class Visitor
    {

        public abstract boolean a();

        public abstract boolean a(int i, byte abyte0[], byte abyte1[], byte abyte2[]);

        public abstract boolean a(byte abyte0[], InputStream inputstream);
    }

}
