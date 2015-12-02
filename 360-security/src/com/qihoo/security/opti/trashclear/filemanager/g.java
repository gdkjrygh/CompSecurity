// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public final class g
{

    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    private static InputStream a()
    {
        Object obj;
        obj = System.getProperty("content.types.user.table");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj = new File(((String) (obj)));
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj = new FileInputStream(((File) (obj)));
        return ((InputStream) (obj));
        IOException ioexception;
        ioexception;
        ioexception = new File(System.getProperty("java.home"), (new StringBuilder()).append("lib").append(File.separator).append("content-types.properties").toString());
        if (!ioexception.exists())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        ioexception = new FileInputStream(ioexception);
        return ioexception;
        ioexception;
        return null;
    }

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return (String)b.get(s);
        }
    }

    private static void a(String s, String s1)
    {
        if (!a.containsKey(s))
        {
            a.put(s, s1);
        }
        b.put(s1, s);
    }

    private static void b()
    {
        InputStream inputstream;
        inputstream = a();
        if (inputstream == null)
        {
            return;
        }
        Object obj = new Properties();
        ((Properties) (obj)).load(inputstream);
        java.util.Map.Entry entry;
        String s;
        for (obj = ((Properties) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); a((String)entry.getValue(), s))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            s = (String)entry.getKey();
        }

        break MISSING_BLOCK_LABEL_84;
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
        inputstream.close();
        return;
        IOException ioexception;
        ioexception;
    }

    static 
    {
        a("application/andrew-inset", "ez");
        a("application/dsptype", "tsp");
        a("application/futuresplash", "spl");
        a("application/hta", "hta");
        a("application/mac-binhex40", "hqx");
        a("application/mac-compactpro", "cpt");
        a("application/mathematica", "nb");
        a("application/msaccess", "mdb");
        a("application/oda", "oda");
        a("application/ogg", "ogg");
        a("application/pdf", "pdf");
        a("application/pgp-keys", "key");
        a("application/pgp-signature", "pgp");
        a("application/pics-rules", "prf");
        a("application/rar", "rar");
        a("application/rdf+xml", "rdf");
        a("application/rss+xml", "rss");
        a("application/zip", "zip");
        a("application/vnd.android.package-archive", "apk");
        a("application/vnd.cinderella", "cdy");
        a("application/vnd.ms-pki.stl", "stl");
        a("application/vnd.oasis.opendocument.database", "odb");
        a("application/vnd.oasis.opendocument.formula", "odf");
        a("application/vnd.oasis.opendocument.graphics", "odg");
        a("application/vnd.oasis.opendocument.graphics-template", "otg");
        a("application/vnd.oasis.opendocument.image", "odi");
        a("application/vnd.oasis.opendocument.spreadsheet", "ods");
        a("application/vnd.oasis.opendocument.spreadsheet-template", "ots");
        a("application/vnd.oasis.opendocument.text", "odt");
        a("application/vnd.oasis.opendocument.text-master", "odm");
        a("application/vnd.oasis.opendocument.text-template", "ott");
        a("application/vnd.oasis.opendocument.text-web", "oth");
        a("application/vnd.google-earth.kml+xml", "kml");
        a("application/vnd.google-earth.kmz", "kmz");
        a("application/msword", "doc");
        a("application/msword", "dot");
        a("application/vnd.openxmlformats-officedocument.wordprocessingml.document", "docx");
        a("application/vnd.openxmlformats-officedocument.wordprocessingml.template", "dotx");
        a("application/vnd.ms-excel", "xls");
        a("application/vnd.ms-excel", "xlt");
        a("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx");
        a("application/vnd.openxmlformats-officedocument.spreadsheetml.template", "xltx");
        a("application/vnd.ms-powerpoint", "ppt");
        a("application/vnd.ms-powerpoint", "pot");
        a("application/vnd.ms-powerpoint", "pps");
        a("application/vnd.openxmlformats-officedocument.presentationml.presentation", "pptx");
        a("application/vnd.openxmlformats-officedocument.presentationml.template", "potx");
        a("application/vnd.openxmlformats-officedocument.presentationml.slideshow", "ppsx");
        a("application/vnd.rim.cod", "cod");
        a("application/vnd.smaf", "mmf");
        a("application/vnd.stardivision.calc", "sdc");
        a("application/vnd.stardivision.draw", "sda");
        a("application/vnd.stardivision.impress", "sdd");
        a("application/vnd.stardivision.impress", "sdp");
        a("application/vnd.stardivision.math", "smf");
        a("application/vnd.stardivision.writer", "sdw");
        a("application/vnd.stardivision.writer", "vor");
        a("application/vnd.stardivision.writer-global", "sgl");
        a("application/vnd.sun.xml.calc", "sxc");
        a("application/vnd.sun.xml.calc.template", "stc");
        a("application/vnd.sun.xml.draw", "sxd");
        a("application/vnd.sun.xml.draw.template", "std");
        a("application/vnd.sun.xml.impress", "sxi");
        a("application/vnd.sun.xml.impress.template", "sti");
        a("application/vnd.sun.xml.math", "sxm");
        a("application/vnd.sun.xml.writer", "sxw");
        a("application/vnd.sun.xml.writer.global", "sxg");
        a("application/vnd.sun.xml.writer.template", "stw");
        a("application/vnd.visio", "vsd");
        a("application/x-abiword", "abw");
        a("application/x-apple-diskimage", "dmg");
        a("application/x-bcpio", "bcpio");
        a("application/x-bittorrent", "torrent");
        a("application/x-cdf", "cdf");
        a("application/x-cdlink", "vcd");
        a("application/x-chess-pgn", "pgn");
        a("application/x-cpio", "cpio");
        a("application/x-debian-package", "deb");
        a("application/x-debian-package", "udeb");
        a("application/x-director", "dcr");
        a("application/x-director", "dir");
        a("application/x-director", "dxr");
        a("application/x-dms", "dms");
        a("application/x-doom", "wad");
        a("application/x-dvi", "dvi");
        a("application/x-flac", "flac");
        a("application/x-font", "pfa");
        a("application/x-font", "pfb");
        a("application/x-font", "gsf");
        a("application/x-font", "pcf");
        a("application/x-font", "pcf.Z");
        a("application/x-freemind", "mm");
        a("application/x-futuresplash", "spl");
        a("application/x-gnumeric", "gnumeric");
        a("application/x-go-sgf", "sgf");
        a("application/x-graphing-calculator", "gcf");
        a("application/x-gtar", "gtar");
        a("application/x-gtar", "tgz");
        a("application/x-gtar", "taz");
        a("application/x-hdf", "hdf");
        a("application/x-ica", "ica");
        a("application/x-internet-signup", "ins");
        a("application/x-internet-signup", "isp");
        a("application/x-iphone", "iii");
        a("application/x-iso9660-image", "iso");
        a("application/x-jmol", "jmz");
        a("application/x-kchart", "chrt");
        a("application/x-killustrator", "kil");
        a("application/x-koan", "skp");
        a("application/x-koan", "skd");
        a("application/x-koan", "skt");
        a("application/x-koan", "skm");
        a("application/x-kpresenter", "kpr");
        a("application/x-kpresenter", "kpt");
        a("application/x-kspread", "ksp");
        a("application/x-kword", "kwd");
        a("application/x-kword", "kwt");
        a("application/x-latex", "latex");
        a("application/x-lha", "lha");
        a("application/x-lzh", "lzh");
        a("application/x-lzx", "lzx");
        a("application/x-maker", "frm");
        a("application/x-maker", "maker");
        a("application/x-maker", "frame");
        a("application/x-maker", "fb");
        a("application/x-maker", "book");
        a("application/x-maker", "fbdoc");
        a("application/x-mif", "mif");
        a("application/x-ms-wmd", "wmd");
        a("application/x-ms-wmz", "wmz");
        a("application/x-msi", "msi");
        a("application/x-ns-proxy-autoconfig", "pac");
        a("application/x-nwc", "nwc");
        a("application/x-object", "o");
        a("application/x-oz-application", "oza");
        a("application/x-pkcs12", "p12");
        a("application/x-pkcs7-certreqresp", "p7r");
        a("application/x-pkcs7-crl", "crl");
        a("application/x-quicktimeplayer", "qtl");
        a("application/x-shar", "shar");
        a("application/x-shockwave-flash", "swf");
        a("application/x-stuffit", "sit");
        a("application/x-sv4cpio", "sv4cpio");
        a("application/x-sv4crc", "sv4crc");
        a("application/x-tar", "tar");
        a("application/x-texinfo", "texinfo");
        a("application/x-texinfo", "texi");
        a("application/x-troff", "t");
        a("application/x-troff", "roff");
        a("application/x-troff-man", "man");
        a("application/x-ustar", "ustar");
        a("application/x-wais-source", "src");
        a("application/x-wingz", "wz");
        a("application/x-webarchive", "webarchive");
        a("application/x-webarchive-xml", "webarchivexml");
        a("application/x-x509-ca-cert", "crt");
        a("application/x-x509-user-cert", "crt");
        a("application/x-xcf", "xcf");
        a("application/x-xfig", "fig");
        a("application/xhtml+xml", "xhtml");
        a("audio/3gpp", "3gpp");
        a("audio/amr", "amr");
        a("audio/basic", "snd");
        a("audio/midi", "mid");
        a("audio/midi", "midi");
        a("audio/midi", "kar");
        a("audio/midi", "xmf");
        a("audio/mobile-xmf", "mxmf");
        a("audio/mpeg", "mpga");
        a("audio/mpeg", "mpega");
        a("audio/mpeg", "mp2");
        a("audio/mpeg", "mp3");
        a("audio/mpeg", "m4a");
        a("audio/mpeg", "aac");
        a("audio/mpeg", "awb");
        a("audio/mpeg", "oga");
        a("audio/mpeg", "mka");
        a("audio/mpeg", "ape");
        a("audio/mpegurl", "m3u");
        a("audio/prs.sid", "sid");
        a("audio/x-aiff", "aif");
        a("audio/x-aiff", "aiff");
        a("audio/x-aiff", "aifc");
        a("audio/x-gsm", "gsm");
        a("audio/x-mpegurl", "m3u");
        a("audio/x-ms-wma", "wma");
        a("audio/x-ms-wax", "wax");
        a("audio/x-pn-realaudio", "ra");
        a("audio/x-pn-realaudio", "rm");
        a("audio/x-pn-realaudio", "ram");
        a("audio/x-realaudio", "ra");
        a("audio/x-scpls", "pls");
        a("audio/x-sd2", "sd2");
        a("audio/x-wav", "wav");
        a("image/bmp", "bmp");
        a("audio/x-qcp", "qcp");
        a("image/gif", "gif");
        a("image/ico", "cur");
        a("image/ico", "ico");
        a("image/ief", "ief");
        a("image/jpeg", "jpeg");
        a("image/jpeg", "jpg");
        a("image/jpeg", "jpe");
        a("image/jpeg", "psd");
        a("image/jpeg", "svg");
        a("image/jpeg", "vsd");
        a("image/pcx", "pcx");
        a("image/png", "png");
        a("image/svg+xml", "svg");
        a("image/svg+xml", "svgz");
        a("image/tiff", "tiff");
        a("image/tiff", "tif");
        a("image/vnd.djvu", "djvu");
        a("image/vnd.djvu", "djv");
        a("image/vnd.wap.wbmp", "wbmp");
        a("image/x-cmu-raster", "ras");
        a("image/x-coreldraw", "cdr");
        a("image/x-coreldrawpattern", "pat");
        a("image/x-coreldrawtemplate", "cdt");
        a("image/x-corelphotopaint", "cpt");
        a("image/x-icon", "ico");
        a("image/x-jg", "art");
        a("image/x-jng", "jng");
        a("image/x-ms-bmp", "bmp");
        a("image/x-photoshop", "psd");
        a("image/x-portable-anymap", "pnm");
        a("image/x-portable-bitmap", "pbm");
        a("image/x-portable-graymap", "pgm");
        a("image/x-portable-pixmap", "ppm");
        a("image/x-rgb", "rgb");
        a("image/x-xbitmap", "xbm");
        a("image/x-xpixmap", "xpm");
        a("image/x-xwindowdump", "xwd");
        a("model/iges", "igs");
        a("model/iges", "iges");
        a("model/mesh", "msh");
        a("model/mesh", "mesh");
        a("model/mesh", "silo");
        a("text/calendar", "ics");
        a("text/calendar", "icz");
        a("text/comma-separated-values", "csv");
        a("text/css", "css");
        a("text/html", "htm");
        a("text/html", "html");
        a("text/html", "xml");
        a("text/html", "chm");
        a("text/h323", "323");
        a("text/iuls", "uls");
        a("text/mathml", "mml");
        a("text/plain", "txt");
        a("text/plain", "log");
        a("text/plain", "asc");
        a("text/plain", "text");
        a("text/plain", "diff");
        a("text/plain", "po");
        a("text/plain", "ini");
        a("text/plain", "lrc");
        a("text/plain", "epub");
        a("text/richtext", "rtx");
        a("text/rtf", "rtf");
        a("text/text", "phps");
        a("text/tab-separated-values", "tsv");
        a("text/xml", "xml");
        a("text/x-bibtex", "bib");
        a("text/x-boo", "boo");
        a("text/x-c++hdr", "h++");
        a("text/x-c++hdr", "hpp");
        a("text/x-c++hdr", "hxx");
        a("text/x-c++hdr", "hh");
        a("text/x-c++src", "c++");
        a("text/x-c++src", "cpp");
        a("text/x-c++src", "cxx");
        a("text/x-chdr", "h");
        a("text/x-component", "htc");
        a("text/x-csh", "csh");
        a("text/x-csrc", "c");
        a("text/x-dsrc", "d");
        a("text/x-haskell", "hs");
        a("text/x-java", "java");
        a("text/x-literate-haskell", "lhs");
        a("text/x-moc", "moc");
        a("text/x-pascal", "p");
        a("text/x-pascal", "pas");
        a("text/x-pcs-gcd", "gcd");
        a("text/x-setext", "etx");
        a("text/x-tcl", "tcl");
        a("text/x-tex", "tex");
        a("text/x-tex", "ltx");
        a("text/x-tex", "sty");
        a("text/x-tex", "cls");
        a("text/x-vcalendar", "vcs");
        a("text/x-vcard", "vcf");
        a("video/3gpp", "3gpp");
        a("video/3gpp", "3gp");
        a("video/3gpp", "3g2");
        a("video/3gpp", "3gpp2");
        a("video/dl", "dl");
        a("video/dv", "dif");
        a("video/dv", "dv");
        a("video/fli", "fli");
        a("video/m4v", "m4v");
        a("video/mpeg", "mpeg");
        a("video/mpeg", "mpg");
        a("video/mpeg", "mpe");
        a("video/mpeg", "flv");
        a("video/mp4", "mp4");
        a("video/mpeg", "vob");
        a("video/quicktime", "qt");
        a("video/quicktime", "mov");
        a("video/quicktime", "mkv");
        a("video/vnd.mpegurl", "mxu");
        a("video/x-la-asf", "lsf");
        a("video/x-la-asf", "lsx");
        a("video/x-mng", "mng");
        a("video/x-ms-asf", "asf");
        a("video/x-ms-asf", "asx");
        a("video/x-ms-wm", "wm");
        a("video/x-ms-wmv", "wmv");
        a("video/x-ms-wmx", "wmx");
        a("video/x-ms-wvx", "wvx");
        a("video/x-msvideo", "avi");
        a("video/x-sgi-movie", "movie");
        a("video/mpeg", "webm");
        a("video/mpeg", "ts");
        a("video/mpeg", "rmvb");
        a("video/mpeg", "tp");
        a("video/mpeg", "f4v");
        a("video/mpeg", "bdv");
        a("video/mpeg", "vdat");
        a("x-conference/x-cooltalk", "ice");
        a("x-epoc/x-sisx-app", "sisx");
        b();
    }
}
