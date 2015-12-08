// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.io.xml.XCardDocument;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final File file;
    private final InputStream in;
    private final Reader reader;

    XCardDocument _constructDocument()
        throws IOException, SAXException
    {
        if (in != null)
        {
            return new XCardDocument(in);
        }
        if (file != null)
        {
            return new XCardDocument(file);
        } else
        {
            return new XCardDocument(reader);
        }
    }

    public volatile List all()
        throws IOException, SAXException
    {
        return super.reader();
    }

    public volatile VCard first()
        throws IOException, SAXException
    {
        return super.reader();
    }

    public  register(VCardPropertyScribe vcardpropertyscribe)
    {
        return ()super.er(vcardpropertyscribe);
    }

    public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
    {
        return register(vcardpropertyscribe);
    }

    public  warnings(List list)
    {
        return ()super.gs(list);
    }

    public volatile Object warnings(List list)
    {
        return warnings(list);
    }

    private (File file1)
    {
        in = null;
        reader = null;
        file = file1;
    }

    file(File file1, file file2)
    {
        this(file1);
    }

    private <init>(InputStream inputstream)
    {
        in = inputstream;
        reader = null;
        file = null;
    }

    file(InputStream inputstream, file file1)
    {
        this(inputstream);
    }

    private <init>(Reader reader1)
    {
        in = null;
        reader = reader1;
        file = null;
    }

    file(Reader reader1, file file1)
    {
        this(reader1);
    }
}
