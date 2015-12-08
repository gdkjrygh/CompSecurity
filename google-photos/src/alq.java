// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class alq
{

    public Map a;
    public Map b;
    public Map c;
    public Pattern d;

    public alq()
    {
        a = new HashMap();
        b = new HashMap();
        c = new HashMap();
        d = Pattern.compile("[/*?\\[\\]]");
        try
        {
            a();
            b();
            return;
        }
        catch (alo alo1)
        {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    public String a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (String)a.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public String a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        b.e(s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        if (s1.length() != 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new alo("Empty prefix", 4);
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        String s2;
        String s3;
        if (s1.charAt(s1.length() - 1) != ':')
        {
            s1 = String.valueOf(s1);
            s1 = (new StringBuilder(String.valueOf(s1).length() + 1)).append(s1).append(":").toString();
        }
        if (!alr.a(s1.substring(0, s1.length() - 1)))
        {
            throw new alo("The prefix is a bad XML name", 201);
        }
        s3 = (String)a.get(s);
        s2 = (String)b.get(s1);
        if (s3 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return s3;
_L2:
        int i;
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 1;
        s2 = s1;
_L4:
        s3 = s2;
        if (!b.containsKey(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = String.valueOf(s1.substring(0, s1.length() - 1));
        s2 = (new StringBuilder(String.valueOf(s2).length() + 14)).append(s2).append("_").append(i).append("_:").toString();
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        b.put(s3, s);
        a.put(s, s3);
        if (true) goto _L1; else goto _L5
_L5:
        s3 = s1;
        if (true) goto _L3; else goto _L6
_L6:
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void a()
    {
        a("http://www.w3.org/XML/1998/namespace", "xml");
        a("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
        a("http://purl.org/dc/elements/1.1/", "dc");
        a("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
        a("adobe:ns:meta/", "x");
        a("http://ns.adobe.com/iX/1.0/", "iX");
        a("http://ns.adobe.com/xap/1.0/", "xmp");
        a("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
        a("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
        a("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
        a("http://ns.adobe.com/xmp/note/", "xmpNote");
        a("http://ns.adobe.com/pdf/1.3/", "pdf");
        a("http://ns.adobe.com/pdfx/1.3/", "pdfx");
        a("http://www.npes.org/pdfx/ns/id/", "pdfxid");
        a("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
        a("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
        a("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
        a("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
        a("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
        a("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
        a("http://ns.adobe.com/photoshop/1.0/", "photoshop");
        a("http://ns.adobe.com/album/1.0/", "album");
        a("http://ns.adobe.com/exif/1.0/", "exif");
        a("http://ns.adobe.com/exif/1.0/aux/", "aux");
        a("http://ns.adobe.com/tiff/1.0/", "tiff");
        a("http://ns.adobe.com/png/1.0/", "png");
        a("http://ns.adobe.com/jpeg/1.0/", "jpeg");
        a("http://ns.adobe.com/jp2k/1.0/", "jp2k");
        a("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
        a("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
        a("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
        a("http://ns.adobe.com/asf/1.0/", "asf");
        a("http://ns.adobe.com/xmp/wav/1.0/", "wav");
        a("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
        a("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
        a("http://ns.adobe.com/xap/1.0/t/", "xmpT");
        a("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
        a("http://ns.adobe.com/xap/1.0/g/", "xmpG");
        a("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
        a("http://ns.adobe.com/xap/1.0/sType/Font#", "stFNT");
        a("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
        a("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
        a("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
        a("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
        a("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
        a("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
        a("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
    }

    public void a(String s, String s1, String s2, String s3, alu alu1)
    {
        this;
        JVM INSTR monitorenter ;
        b.e(s);
        b.d(s1);
        b.e(s2);
        b.d(s3);
        if (alu1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        alu1 = new alu(((alv) (als.a(new alw(((alv) (alu1)).a), null))).a);
_L1:
        if (d.matcher(s1).find() || d.matcher(s3).find())
        {
            throw new alo("Alias and actual property names must be simple", 102);
        }
        break MISSING_BLOCK_LABEL_111;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        alu1 = new alu();
          goto _L1
        String s4;
        s = a(s);
        s4 = a(s2);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        throw new alo("Alias namespace is not registered", 101);
        if (s4 != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        throw new alo("Actual namespace is not registered", 101);
        s = String.valueOf(s);
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        if (c.containsKey(s))
        {
            throw new alo("Alias is already existing", 4);
        }
        Map map = c;
        s1 = String.valueOf(s4);
        String s5 = String.valueOf(s3);
        if (s5.length() != 0)
        {
            s1 = s1.concat(s5);
        } else
        {
            s1 = new String(s1);
        }
        if (map.containsKey(s1))
        {
            throw new alo("Actual property is already an alias, use the base property", 4);
        }
        s1 = new alt(this, s2, s4, s3, alu1);
        c.put(s, s1);
        this;
        JVM INSTR monitorexit ;
    }

    public void b()
    {
        alu alu1 = new alu();
        alu1.a(1536, true);
        alu alu2 = new alu();
        alu2.a(7680, true);
        a("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", alu1);
        a("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
        a("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
        a("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
        a("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        a("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
        a("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", null);
        a("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
        a("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", alu1);
        a("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
        a("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        a("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        a("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        a("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", alu2);
        a("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", alu2);
        a("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", alu1);
        a("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", alu2);
        a("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", alu2);
        a("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        a("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
        a("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", alu2);
        a("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
        a("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", alu1);
        a("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
        a("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        a("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
        a("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        a("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", alu1);
        a("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", alu2);
        a("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        a("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", alu2);
        a("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        a("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        a("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", alu2);
    }
}
