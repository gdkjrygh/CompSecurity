// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.io.text.VCardReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final File file;
    private final Reader reader;

    VCardReader _constructReader()
        throws IOException
    {
        if (reader != null)
        {
            return new VCardReader(reader);
        } else
        {
            return new VCardReader(file);
        }
    }

    public volatile List all()
        throws IOException
    {
        return super.file();
    }

    public file caretDecoding(boolean flag)
    {
        return (file)super.ecoding(flag);
    }

    public volatile Object caretDecoding(boolean flag)
    {
        return caretDecoding(flag);
    }

    public volatile VCard first()
        throws IOException
    {
        return super.caretDecoding();
    }

    public caretDecoding register(VCardPropertyScribe vcardpropertyscribe)
    {
        return (caretDecoding)super.er(vcardpropertyscribe);
    }

    public volatile Object register(VCardPropertyScribe vcardpropertyscribe)
    {
        return register(vcardpropertyscribe);
    }

    public register warnings(List list)
    {
        return (register)super.gs(list);
    }

    public volatile Object warnings(List list)
    {
        return warnings(list);
    }

    private (File file1)
    {
        super(true, null);
        reader = null;
        file = file1;
    }

    file(File file1, file file2)
    {
        this(file1);
    }

    private <init>(Reader reader1)
    {
        super(false, null);
        reader = reader1;
        file = null;
    }

    file(Reader reader1, file file1)
    {
        this(reader1);
    }
}
