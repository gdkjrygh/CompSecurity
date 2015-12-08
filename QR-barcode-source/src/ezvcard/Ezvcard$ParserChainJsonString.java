// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.io.json.JCardReader;
import ezvcard.io.scribe.VCardPropertyScribe;
import java.io.IOException;
import java.util.List;

// Referenced classes of package ezvcard:
//            Ezvcard, VCard

public static class <init> extends <init>
{

    private final String json;

    JCardReader _constructReader()
    {
        return new JCardReader(json);
    }

    public List all()
    {
        List list;
        try
        {
            list = super.json();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return list;
    }

    public VCard first()
    {
        VCard vcard;
        try
        {
            vcard = super.json();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return vcard;
    }

    public json register(VCardPropertyScribe vcardpropertyscribe)
    {
        return (json)super.er(vcardpropertyscribe);
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
        json = s;
    }

    json(String s, json json1)
    {
        this(s);
    }
}
