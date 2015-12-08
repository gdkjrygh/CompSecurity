// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;

import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;

// Referenced classes of package ezvcard.io.text:
//            VCardRawReader

public static interface 
{

    public abstract void beginComponent(String s);

    public abstract void endComponent(String s);

    public abstract void invalidLine(String s);

    public abstract void invalidVersion(String s);

    public abstract void readProperty(String s, String s1, VCardParameters vcardparameters, String s2);

    public abstract void readVersion(VCardVersion vcardversion);
}
