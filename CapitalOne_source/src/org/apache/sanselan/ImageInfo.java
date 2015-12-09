// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

// Referenced classes of package org.apache.sanselan:
//            ImageFormat

public class ImageInfo
{

    private final String a;
    private final int b;
    private final ArrayList c;
    private final ImageFormat d;
    private final String e;
    private final int f;
    private final String g;
    private final int h;
    private final int i;
    private final float j;
    private final int k;
    private final float l;
    private final int m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final int q;
    private final String r;

    private void a(PrintWriter printwriter)
    {
        int i1;
        printwriter.println((new StringBuilder("Format Details: ")).append(a).toString());
        printwriter.println((new StringBuilder("Bits Per Pixel: ")).append(b).toString());
        printwriter.println((new StringBuilder("Comments: ")).append(c.size()).toString());
        i1 = 0;
_L10:
        if (i1 < c.size()) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        printwriter.println((new StringBuilder("Format: ")).append(d.a).toString());
        printwriter.println((new StringBuilder("Format Name: ")).append(e).toString());
        printwriter.println((new StringBuilder("Compression Algorithm: ")).append(r).toString());
        printwriter.println((new StringBuilder("Height: ")).append(f).toString());
        printwriter.println((new StringBuilder("MimeType: ")).append(g).toString());
        printwriter.println((new StringBuilder("Number Of Images: ")).append(h).toString());
        printwriter.println((new StringBuilder("Physical Height Dpi: ")).append(i).toString());
        printwriter.println((new StringBuilder("Physical Height Inch: ")).append(j).toString());
        printwriter.println((new StringBuilder("Physical Width Dpi: ")).append(k).toString());
        printwriter.println((new StringBuilder("Physical Width Inch: ")).append(l).toString());
        printwriter.println((new StringBuilder("Width: ")).append(m).toString());
        printwriter.println((new StringBuilder("Is Progressive: ")).append(n).toString());
        printwriter.println((new StringBuilder("Is Transparent: ")).append(o).toString());
        stringbuilder = new StringBuilder("Color Type: ");
        q;
        JVM INSTR tableswitch -2 3: default 440
    //                   -2 570
    //                   -1 564
    //                   0 540
    //                   1 546
    //                   2 552
    //                   3 558;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L4:
        break MISSING_BLOCK_LABEL_570;
_L3:
        String s = "Unknown";
_L11:
        printwriter.println(stringbuilder.append(s).toString());
        printwriter.println((new StringBuilder("Uses Palette: ")).append(p).toString());
        printwriter.flush();
        return;
_L2:
        s = (String)c.get(i1);
        printwriter.println((new StringBuilder("\t")).append(i1).append(": '").append(s).append("'").toString());
        i1++;
          goto _L10
_L6:
        s = "Black and White";
          goto _L11
_L7:
        s = "Grayscale";
          goto _L11
_L8:
        s = "RGB";
          goto _L11
_L9:
        s = "CMYK";
          goto _L11
_L5:
        s = "Other";
          goto _L11
        s = "Unknown";
          goto _L11
    }

    public String toString()
    {
        Object obj;
        try
        {
            obj = new StringWriter();
            PrintWriter printwriter = new PrintWriter(((java.io.Writer) (obj)));
            a(printwriter);
            printwriter.flush();
            obj = ((StringWriter) (obj)).toString();
        }
        catch (Exception exception)
        {
            return "Image Data: Error";
        }
        return ((String) (obj));
    }
}
