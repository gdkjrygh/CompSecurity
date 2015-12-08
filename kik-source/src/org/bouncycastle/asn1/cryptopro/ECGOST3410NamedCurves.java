// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.params.ECDomainParameters;

// Referenced classes of package org.bouncycastle.asn1.cryptopro:
//            CryptoProObjectIdentifiers

public class ECGOST3410NamedCurves
{

    static final Hashtable a;
    static final Hashtable b;
    static final Hashtable c;

    public ECGOST3410NamedCurves()
    {
    }

    public static ECDomainParameters a(String s)
    {
        s = (DERObjectIdentifier)a.get(s);
        if (s != null)
        {
            return (ECDomainParameters)b.get(s);
        } else
        {
            return null;
        }
    }

    public static ECDomainParameters a(DERObjectIdentifier derobjectidentifier)
    {
        return (ECDomainParameters)b.get(derobjectidentifier);
    }

    public static String b(DERObjectIdentifier derobjectidentifier)
    {
        return (String)c.get(derobjectidentifier);
    }

    public static DERObjectIdentifier b(String s)
    {
        return (DERObjectIdentifier)a.get(s);
    }

    static 
    {
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        Object obj1 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        Object obj = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        obj1 = new org.bouncycastle.math.ec.ECCurve.Fp(((BigInteger) (obj1)), new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"));
        obj = new ECDomainParameters(((org.bouncycastle.math.ec.ECCurve) (obj1)), new org.bouncycastle.math.ec.ECPoint.Fp(((org.bouncycastle.math.ec.ECCurve) (obj1)), new org.bouncycastle.math.ec.ECFieldElement.Fp(((org.bouncycastle.math.ec.ECCurve.Fp) (obj1)).e(), new BigInteger("1")), new org.bouncycastle.math.ec.ECFieldElement.Fp(((org.bouncycastle.math.ec.ECCurve.Fp) (obj1)).e(), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612"))), ((BigInteger) (obj)));
        b.put(CryptoProObjectIdentifiers.o, obj);
        obj1 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        obj = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        obj1 = new org.bouncycastle.math.ec.ECCurve.Fp(((BigInteger) (obj1)), new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"));
        obj = new ECDomainParameters(((org.bouncycastle.math.ec.ECCurve) (obj1)), new org.bouncycastle.math.ec.ECPoint.Fp(((org.bouncycastle.math.ec.ECCurve) (obj1)), new org.bouncycastle.math.ec.ECFieldElement.Fp(((org.bouncycastle.math.ec.ECCurve.Fp) (obj1)).e(), new BigInteger("1")), new org.bouncycastle.math.ec.ECFieldElement.Fp(((org.bouncycastle.math.ec.ECCurve.Fp) (obj1)).e(), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612"))), ((BigInteger) (obj)));
        b.put(CryptoProObjectIdentifiers.r, obj);
        obj = new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823193");
        obj1 = new BigInteger("57896044618658097711785492504343953927102133160255826820068844496087732066703");
        org.bouncycastle.math.ec.ECCurve.Fp fp = new org.bouncycastle.math.ec.ECCurve.Fp(((BigInteger) (obj)), new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823190"), new BigInteger("28091019353058090096996979000309560759124368558014865957655842872397301267595"));
        obj = new ECDomainParameters(fp, new org.bouncycastle.math.ec.ECPoint.Fp(fp, new org.bouncycastle.math.ec.ECFieldElement.Fp(((BigInteger) (obj)), new BigInteger("1")), new org.bouncycastle.math.ec.ECFieldElement.Fp(((BigInteger) (obj)), new BigInteger("28792665814854611296992347458380284135028636778229113005756334730996303888124"))), ((BigInteger) (obj1)));
        b.put(CryptoProObjectIdentifiers.p, obj);
        obj = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        obj1 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        fp = new org.bouncycastle.math.ec.ECCurve.Fp(((BigInteger) (obj)), new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"));
        obj = new ECDomainParameters(fp, new org.bouncycastle.math.ec.ECPoint.Fp(fp, new org.bouncycastle.math.ec.ECFieldElement.Fp(((BigInteger) (obj)), new BigInteger("0")), new org.bouncycastle.math.ec.ECFieldElement.Fp(((BigInteger) (obj)), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247"))), ((BigInteger) (obj1)));
        b.put(CryptoProObjectIdentifiers.s, obj);
        obj = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        obj1 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        fp = new org.bouncycastle.math.ec.ECCurve.Fp(((BigInteger) (obj)), new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"));
        obj = new ECDomainParameters(fp, new org.bouncycastle.math.ec.ECPoint.Fp(fp, new org.bouncycastle.math.ec.ECFieldElement.Fp(((BigInteger) (obj)), new BigInteger("0")), new org.bouncycastle.math.ec.ECFieldElement.Fp(((BigInteger) (obj)), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247"))), ((BigInteger) (obj1)));
        b.put(CryptoProObjectIdentifiers.q, obj);
        a.put("GostR3410-2001-CryptoPro-A", CryptoProObjectIdentifiers.o);
        a.put("GostR3410-2001-CryptoPro-B", CryptoProObjectIdentifiers.p);
        a.put("GostR3410-2001-CryptoPro-C", CryptoProObjectIdentifiers.q);
        a.put("GostR3410-2001-CryptoPro-XchA", CryptoProObjectIdentifiers.r);
        a.put("GostR3410-2001-CryptoPro-XchB", CryptoProObjectIdentifiers.s);
        c.put(CryptoProObjectIdentifiers.o, "GostR3410-2001-CryptoPro-A");
        c.put(CryptoProObjectIdentifiers.p, "GostR3410-2001-CryptoPro-B");
        c.put(CryptoProObjectIdentifiers.q, "GostR3410-2001-CryptoPro-C");
        c.put(CryptoProObjectIdentifiers.r, "GostR3410-2001-CryptoPro-XchA");
        c.put(CryptoProObjectIdentifiers.s, "GostR3410-2001-CryptoPro-XchB");
    }
}
