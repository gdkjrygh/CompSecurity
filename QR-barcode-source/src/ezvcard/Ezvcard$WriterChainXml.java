// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.io.xml.XCardDocument;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    int indent;
    final ScribeIndex index;
    boolean prodId;
    boolean versionStrict;

    private XCardDocument createXCardDocument()
    {
        XCardDocument xcarddocument = new XCardDocument();
        xcarddocument.setAddProdId(prodId);
        xcarddocument.setVersionStrict(versionStrict);
        xcarddocument.setScribeIndex(index);
        for (Iterator iterator = vcards.iterator(); iterator.hasNext(); xcarddocument.add((VCard)iterator.next())) { }
        return xcarddocument;
    }

    public Document dom()
    {
        return createXCardDocument().getDocument();
    }

    public String go()
    {
        StringWriter stringwriter = new StringWriter();
        try
        {
            go(((Writer) (stringwriter)));
        }
        catch (TransformerException transformerexception) { }
        return stringwriter.toString();
    }

    public void go(File file)
        throws IOException, TransformerException
    {
        createXCardDocument().write(file, indent);
    }

    public void go(OutputStream outputstream)
        throws TransformerException
    {
        createXCardDocument().write(outputstream, indent);
    }

    public void go(Writer writer)
        throws TransformerException
    {
        createXCardDocument().write(writer, indent);
    }

    public indent indent(int i)
    {
        indent = i;
        return (indent)this_;
    }

    public this_ prodId(boolean flag)
    {
        prodId = flag;
        return (prodId)this_;
    }

    public Scribe register(VCardPropertyScribe vcardpropertyscribe)
    {
        index.register(vcardpropertyscribe);
        return (Scribe)this_;
    }

    public this_ versionStrict(boolean flag)
    {
        versionStrict = flag;
        return (versionStrict)this_;
    }

    private Scribe(Collection collection)
    {
        super(collection);
        prodId = true;
        versionStrict = true;
        indent = -1;
        index = new ScribeIndex();
    }

    init>(Collection collection, init> init>)
    {
        this(collection);
    }
}
