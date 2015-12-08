// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class E
    implements k
{

    private static Map a = new HashMap();

    public E()
    {
        a.put(ao.a, "Deze toepassing is niet goedgekeurd voor het scannen van creditcards.");
        a.put(ao.b, "Annuleren");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Gereed");
        a.put(ao.i, "CVV");
        a.put(ao.j, "Postcode");
        a.put(ao.k, "Vervaldatum");
        a.put(ao.l, "Nummer");
        a.put(ao.m, "Creditcard");
        a.put(ao.n, "MM/JJ");
        a.put(ao.o, "OK");
        a.put(ao.p, "Houd kaart hier.\nScannen gaat automatisch.");
        a.put(ao.q, "Toetsenbord\u2026");
        a.put(ao.r, "Creditcardnummer");
        a.put(ao.s, "Kaartgegevens");
        a.put(ao.t, "Oeps!");
        a.put(ao.u, "Met de camera van dit apparaat kunnen geen kaartnummers worden gelezen.");
        a.put(ao.v, "Camera apparaat niet beschikbaar.");
        a.put(ao.w, "Er is een onverwachte fout opgetreden bij het starten van de camera.");
    }

    public final String a()
    {
        return "nl";
    }

    public final String a(Enum enum)
    {
        enum = (ao)enum;
        return (String)a.get(enum);
    }

    static 
    {
        new HashMap();
    }
}
