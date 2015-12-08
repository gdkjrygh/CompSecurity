// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io;

import ezvcard.VCard;
import ezvcard.VCardException;
import ezvcard.property.VCardProperty;

public class EmbeddedVCardException extends VCardException
{
    public static interface InjectionCallback
    {

        public abstract VCardProperty getProperty();

        public abstract void injectVCard(VCard vcard1);
    }


    private final InjectionCallback callback;
    private final VCard vcard;

    public EmbeddedVCardException(VCard vcard1)
    {
        callback = null;
        vcard = vcard1;
    }

    public EmbeddedVCardException(InjectionCallback injectioncallback)
    {
        callback = injectioncallback;
        vcard = null;
    }

    public VCardProperty getProperty()
    {
        if (callback == null)
        {
            return null;
        } else
        {
            return callback.getProperty();
        }
    }

    public VCard getVCard()
    {
        return vcard;
    }

    public void injectVCard(VCard vcard1)
    {
        if (callback == null)
        {
            return;
        } else
        {
            callback.injectVCard(vcard1);
            return;
        }
    }
}
