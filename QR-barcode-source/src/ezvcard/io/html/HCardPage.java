// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.html;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.parameter.ImageType;
import ezvcard.property.Photo;
import ezvcard.util.DataUri;
import ezvcard.util.IOUtils;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HCardPage
{
    public static class DataUriGenerator
    {

        public String generate(String s, byte abyte0[])
        {
            return (new DataUri(s, abyte0)).toString();
        }

        public DataUriGenerator()
        {
        }
    }


    private static final Template template;
    private final List vcards = new ArrayList();

    public HCardPage()
    {
    }

    private Photo readImage(String s, ImageType imagetype)
        throws IOException
    {
        return new Photo(getClass().getResourceAsStream(s), imagetype);
    }

    public void add(VCard vcard)
    {
        vcards.add(vcard);
    }

    public String write()
    {
        StringWriter stringwriter = new StringWriter();
        try
        {
            write(((Writer) (stringwriter)));
        }
        catch (IOException ioexception) { }
        return stringwriter.toString();
    }

    public void write(File file)
        throws IOException
    {
        Object obj = null;
        file = new FileWriter(file);
        write(((Writer) (file)));
        IOUtils.closeQuietly(file);
        return;
        Exception exception;
        exception;
        file = obj;
_L2:
        IOUtils.closeQuietly(file);
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void write(OutputStream outputstream)
        throws IOException
    {
        write(((Writer) (new OutputStreamWriter(outputstream))));
    }

    public void write(Writer writer)
        throws IOException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("vcards", vcards);
        hashmap.put("dataUri", new DataUriGenerator());
        hashmap.put("translucentBg", readImage("translucent-bg.png", ImageType.PNG));
        hashmap.put("noProfile", readImage("no-profile.png", ImageType.PNG));
        hashmap.put("ezVCardVersion", Ezvcard.VERSION);
        hashmap.put("ezVCardUrl", Ezvcard.URL);
        hashmap.put("scribeIndex", new ScribeIndex());
        try
        {
            template.process(hashmap, writer);
        }
        // Misplaced declaration of an exception variable
        catch (Writer writer)
        {
            throw new RuntimeException(writer);
        }
        writer.flush();
    }

    static 
    {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(ezvcard/io/html/HCardPage, "");
        configuration.setObjectWrapper(new DefaultObjectWrapper());
        configuration.setWhitespaceStripping(true);
        try
        {
            template = configuration.getTemplate("hcard-template.html");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
    }
}
