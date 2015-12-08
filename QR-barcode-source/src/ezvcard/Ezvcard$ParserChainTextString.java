// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.io.text.VCardReader;
import java.io.IOException;
import java.util.List;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final String text;

    VCardReader _constructReader()
    {
        return new VCardReader(text);
    }

    public List all()
    {
        List list;
        try
        {
            list = super.text();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return list;
    }

    public text caretDecoding(boolean flag)
    {
        return (text)super.ecoding(flag);
    }

    public volatile Object caretDecoding(boolean flag)
    {
        return caretDecoding(flag);
    }

    public VCard first()
    {
        VCard vcard;
        try
        {
            vcard = super.caretDecoding();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return vcard;
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

    private (String s)
    {
        super(false, null);
        text = s;
    }

    text(String s, text text1)
    {
        this(s);
    }
}
