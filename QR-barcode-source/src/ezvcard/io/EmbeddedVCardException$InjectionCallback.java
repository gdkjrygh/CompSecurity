// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io;

import ezvcard.VCard;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io:
//            EmbeddedVCardException

public static interface _cls9
{

    public abstract VCardProperty getProperty();

    public abstract void injectVCard(VCard vcard);
}
