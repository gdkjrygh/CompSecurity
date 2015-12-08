// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.html.HCardPage;
import ezvcard.util.IOUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    public String go()
    {
        StringWriter stringwriter = new StringWriter();
        try
        {
            go(((Writer) (stringwriter)));
        }
        catch (IOException ioexception) { }
        return stringwriter.toString();
    }

    public void go(File file)
        throws IOException
    {
        Object obj = null;
        file = new FileWriter(file);
        go(((Writer) (file)));
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

    public void go(OutputStream outputstream)
        throws IOException
    {
        go(((Writer) (new OutputStreamWriter(outputstream))));
    }

    public void go(Writer writer)
        throws IOException
    {
        HCardPage hcardpage = new HCardPage();
        for (Iterator iterator = vcards.iterator(); iterator.hasNext(); hcardpage.add((VCard)iterator.next())) { }
        hcardpage.write(writer);
    }

    private (Collection collection)
    {
        super(collection);
    }

    t>(Collection collection, t> t>)
    {
        this(collection);
    }
}
