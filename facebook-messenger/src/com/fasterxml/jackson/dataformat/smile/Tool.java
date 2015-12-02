// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

// Referenced classes of package com.fasterxml.jackson.dataformat.smile:
//            SmileFactory

public class Tool
{

    public static final String SUFFIX = ".lzf";
    public final JsonFactory jsonFactory = new JsonFactory();
    public final SmileFactory smileFactory = new SmileFactory();

    public Tool()
    {
        smileFactory.configure(SmileGenerator.Feature.CHECK_SHARED_NAMES, true);
        smileFactory.configure(SmileGenerator.Feature.CHECK_SHARED_STRING_VALUES, true);
        smileFactory.configure(SmileGenerator.Feature.ENCODE_BINARY_AS_7BIT, true);
        smileFactory.configure(SmileGenerator.Feature.WRITE_HEADER, true);
        smileFactory.configure(SmileGenerator.Feature.WRITE_END_MARKER, false);
        smileFactory.configure(SmileParser.Feature.REQUIRE_HEADER, false);
    }

    private void decode(InputStream inputstream)
    {
        inputstream = smileFactory.createJsonParser(inputstream);
        JsonGenerator jsongenerator = jsonFactory.createJsonGenerator(System.out, JsonEncoding.UTF8);
        do
        {
            if (inputstream.nextToken() == null && inputstream.nextToken() == null)
            {
                inputstream.close();
                jsongenerator.close();
                return;
            }
            jsongenerator.copyCurrentEvent(inputstream);
        } while (true);
    }

    private void encode(InputStream inputstream)
    {
        inputstream = jsonFactory.createJsonParser(inputstream);
        SmileGenerator smilegenerator = smileFactory.createJsonGenerator(System.out, JsonEncoding.UTF8);
        for (; inputstream.nextToken() != null; smilegenerator.copyCurrentEvent(inputstream)) { }
        inputstream.close();
        smilegenerator.close();
    }

    private InputStream inputStream(String s)
    {
        if (s == null)
        {
            return System.in;
        }
        File file = new File(s);
        if (!file.exists())
        {
            System.err.println((new StringBuilder()).append("File '").append(s).append("' does not exist.").toString());
            System.exit(1);
        }
        return new FileInputStream(file);
    }

    public static void main(String args[])
    {
        (new Tool()).process(args);
    }

    private void process(String as[])
    {
        String s = null;
        if (as.length == 2)
        {
            s = as[0];
            String s1 = as[1];
            as = s;
            s = s1;
        } else
        if (as.length == 1)
        {
            as = as[0];
        } else
        {
            showUsage();
            as = null;
        }
        if ("-e".equals(as))
        {
            encode(inputStream(s));
            return;
        }
        if ("-d".equals(as))
        {
            decode(inputStream(s));
            return;
        }
        if ("-v".equals(as))
        {
            verify(inputStream(s), inputStream(s));
            return;
        } else
        {
            showUsage();
            return;
        }
    }

    private void verify(InputStream inputstream, InputStream inputstream1)
    {
        inputstream = jsonFactory.createJsonParser(inputstream);
        Object obj = new ByteArrayOutputStream(4000);
        SmileGenerator smilegenerator = smileFactory.createJsonGenerator(((java.io.OutputStream) (obj)), JsonEncoding.UTF8);
        for (; inputstream.nextToken() != null; smilegenerator.copyCurrentEvent(inputstream)) { }
        inputstream.close();
        smilegenerator.close();
        inputstream = jsonFactory.createJsonParser(inputstream1);
        inputstream1 = ((ByteArrayOutputStream) (obj)).toByteArray();
        obj = smileFactory.createJsonParser(inputstream1);
        int i = 0;
        do
        {
            Object obj1 = inputstream.nextToken();
            if (obj1 != null)
            {
                Object obj2 = ((JsonParser) (obj)).nextToken();
                int j = i + 1;
                if (obj1 != obj2)
                {
                    throw new IOException((new StringBuilder()).append("Input and encoded differ, token #").append(j).append("; expected ").append(obj1).append(", got ").append(obj2).toString());
                }
                obj1 = inputstream.getText();
                obj2 = ((JsonParser) (obj)).getText();
                i = j;
                if (!((String) (obj1)).equals(obj2))
                {
                    throw new IOException((new StringBuilder()).append("Input and encoded differ, token #").append(j).append("; expected text '").append(((String) (obj1))).append("', got '").append(((String) (obj2))).append("'").toString());
                }
            } else
            {
                System.out.println((new StringBuilder()).append("OK: verified ").append(i).append(" tokens (from ").append(inputstream1.length).append(" bytes of Smile encoded data), input and encoded contents are identical").toString());
                return;
            }
        } while (true);
    }

    protected void showUsage()
    {
        System.err.println((new StringBuilder()).append("Usage: java ").append(getClass().getName()).append(" -e/-d [file]").toString());
        System.err.println(" (if no file given, reads from stdin -- always writes to stdout)");
        System.err.println(" -d: decode Smile encoded input as JSON");
        System.err.println(" -e: encode JSON (text) input as Smile");
        System.err.println(" -v: encode JSON (text) input as Smile; read back, verify, do not write out");
        System.exit(1);
    }
}
