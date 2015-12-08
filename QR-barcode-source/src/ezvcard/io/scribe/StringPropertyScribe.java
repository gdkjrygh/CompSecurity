// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.property.TextProperty;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            SimplePropertyScribe

public abstract class StringPropertyScribe extends SimplePropertyScribe
{

    public StringPropertyScribe(Class class1, String s)
    {
        this(class1, s, VCardDataType.TEXT);
    }

    public StringPropertyScribe(Class class1, String s, VCardDataType vcarddatatype)
    {
        super(class1, s, vcarddatatype);
    }

    protected String _writeValue(TextProperty textproperty)
    {
        return (String)textproperty.getValue();
    }

    protected volatile String _writeValue(VCardProperty vcardproperty)
    {
        return _writeValue((TextProperty)vcardproperty);
    }
}
