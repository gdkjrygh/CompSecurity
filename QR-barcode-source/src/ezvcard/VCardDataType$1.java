// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.util.CaseClasses;

// Referenced classes of package ezvcard:
//            VCardDataType, VCardVersion

static final class  extends CaseClasses
{

    protected VCardDataType create(String s)
    {
        return new VCardDataType(s, new VCardVersion[0], null);
    }

    protected volatile Object create(Object obj)
    {
        return create((String)obj);
    }

    protected boolean matches(VCardDataType vcarddatatype, String s)
    {
        return VCardDataType.access$100(vcarddatatype).equalsIgnoreCase(s);
    }

    protected volatile boolean matches(Object obj, Object obj1)
    {
        return matches((VCardDataType)obj, (String)obj1);
    }

    (Class class1)
    {
        super(class1);
    }
}
