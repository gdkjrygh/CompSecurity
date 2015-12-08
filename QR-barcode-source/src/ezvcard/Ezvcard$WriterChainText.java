// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.io.text.VCardWriter;
import ezvcard.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard, VCardVersion

public static class <init> extends <init>
{

    boolean caretEncoding;
    final ScribeIndex index;
    boolean prodId;
    VCardVersion version;
    boolean versionStrict;

    private void go(VCardWriter vcardwriter)
        throws IOException
    {
        vcardwriter.setAddProdId(prodId);
        vcardwriter.setCaretEncodingEnabled(caretEncoding);
        vcardwriter.setVersionStrict(versionStrict);
        vcardwriter.setScribeIndex(index);
        for (Iterator iterator = vcards.iterator(); iterator.hasNext(); vcardwriter.flush())
        {
            VCard vcard = (VCard)iterator.next();
            if (version == null)
            {
                VCardVersion vcardversion1 = vcard.getVersion();
                VCardVersion vcardversion = vcardversion1;
                if (vcardversion1 == null)
                {
                    vcardversion = VCardVersion.V3_0;
                }
                vcardwriter.setTargetVersion(vcardversion);
            }
            vcardwriter.write(vcard);
        }

    }

    public e caretEncoding(boolean flag)
    {
        caretEncoding = flag;
        return (caretEncoding)this_;
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
        go(file, false);
    }

    public void go(File file, boolean flag)
        throws IOException
    {
        if (version == null)
        {
            file = new VCardWriter(file, flag);
        } else
        {
            file = new VCardWriter(file, flag, version);
        }
        go(((VCardWriter) (file)));
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
        if (version == null)
        {
            outputstream = new VCardWriter(outputstream);
        } else
        {
            outputstream = new VCardWriter(outputstream, version);
        }
        go(((VCardWriter) (outputstream)));
    }

    public void go(Writer writer)
        throws IOException
    {
        writer = new VCardWriter(writer);
        writer.setTargetVersion(version);
        go(((VCardWriter) (writer)));
    }

    public go prodId(boolean flag)
    {
        prodId = flag;
        return (prodId)this_;
    }

    public cribe register(VCardPropertyScribe vcardpropertyscribe)
    {
        index.register(vcardpropertyscribe);
        return (cribe)this_;
    }

    public this_ version(VCardVersion vcardversion)
    {
        version = vcardversion;
        return (version)this_;
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
        caretEncoding = false;
        index = new ScribeIndex();
    }

    nit>(Collection collection, nit> nit>)
    {
        this(collection);
    }
}
