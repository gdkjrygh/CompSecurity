// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.json;

import ezvcard.VCardDataType;
import ezvcard.parameter.VCardParameters;

// Referenced classes of package ezvcard.io.json:
//            JCardRawReader, JCardValue

public static interface 
{

    public abstract void beginVCard();

    public abstract void readProperty(String s, String s1, VCardParameters vcardparameters, VCardDataType vcarddatatype, JCardValue jcardvalue);
}
