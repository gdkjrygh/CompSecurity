// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.json.JCardReader;
import ezvcard.io.scribe.VCardPropertyScribe;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final File file;
    private final InputStream in;
    private final Reader reader;

    JCardReader _constructReader()
        throws IOException
    {
        if (in != null)
        {
            return new JCardReader(in);
        }
        if (file != null)
        {
            return new JCardReader(file);
        } else
        {
            return new JCardReader(reader);
        }
    }

    public volatile List all()
        throws IOException
    {
        return super.reader();
    }

    public volatile VCard first()
        throws IOException
    {
        return super.reader();
    }

    public reader register(VCardPropertyScribe vcardpropertyscribe)
    {
        return (reader)super.er(vcardpropertyscribe);
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
        super(false, null);
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
        super(false, null);
        in = null;
        reader = reader1;
        file = null;
    }

    file(Reader reader1, file file1)
    {
        this(reader1);
    }
}
