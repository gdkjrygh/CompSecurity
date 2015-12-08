// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.json.JCardWriter;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    boolean indent;
    final ScribeIndex index;
    boolean prodId;
    boolean versionStrict;

    private void go(JCardWriter jcardwriter)
        throws IOException
    {
        jcardwriter.setAddProdId(prodId);
        jcardwriter.setIndent(indent);
        jcardwriter.setVersionStrict(versionStrict);
        jcardwriter.setScribeIndex(index);
        for (Iterator iterator = vcards.iterator(); iterator.hasNext(); jcardwriter.flush())
        {
            jcardwriter.write((VCard)iterator.next());
        }

        break MISSING_BLOCK_LABEL_78;
        Exception exception;
        exception;
        jcardwriter.closeJsonStream();
        throw exception;
        jcardwriter.closeJsonStream();
        return;
    }

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
        boolean flag = true;
        if (vcards.size() <= 1)
        {
            flag = false;
        }
        file = new JCardWriter(file, flag);
        go(((JCardWriter) (file)));
        IOUtils.closeQuietly(file);
        return;
        Exception exception;
        exception;
        IOUtils.closeQuietly(file);
        throw exception;
    }

    public void go(OutputStream outputstream)
        throws IOException
    {
        boolean flag = true;
        if (vcards.size() <= 1)
        {
            flag = false;
        }
        go(new JCardWriter(outputstream, flag));
    }

    public void go(Writer writer)
        throws IOException
    {
        boolean flag = true;
        if (vcards.size() <= 1)
        {
            flag = false;
        }
        go(new JCardWriter(writer, flag));
    }

    public t> indent(boolean flag)
    {
        indent = flag;
        return (indent)this_;
    }

    public this_ prodId(boolean flag)
    {
        prodId = flag;
        return (prodId)this_;
    }

    public cribe register(VCardPropertyScribe vcardpropertyscribe)
    {
        index.register(vcardpropertyscribe);
        return (cribe)this_;
    }

    public this_ versionStrict(boolean flag)
    {
        versionStrict = flag;
        return (versionStrict)this_;
    }

    private cribe(Collection collection)
    {
        super(collection);
        prodId = true;
        versionStrict = true;
        indent = false;
        index = new ScribeIndex();
    }

    nit>(Collection collection, nit> nit>)
    {
        this(collection);
    }
}
