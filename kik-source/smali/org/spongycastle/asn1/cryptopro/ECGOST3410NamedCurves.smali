.class public Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/util/Hashtable;

.field static final b:Ljava/util/Hashtable;

.field static final c:Ljava/util/Hashtable;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    .line 18
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a:Ljava/util/Hashtable;

    .line 19
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b:Ljava/util/Hashtable;

    .line 20
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->c:Ljava/util/Hashtable;

    .line 24
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "115792089237316195423570985008687907853269984665640564039457584007913129639319"

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 25
    new-instance v1, Ljava/math/BigInteger;

    const-string v2, "115792089237316195423570985008687907853073762908499243225378155805079068850323"

    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 27
    new-instance v2, Lorg/spongycastle/math/ec/ECCurve$Fp;

    new-instance v3, Ljava/math/BigInteger;

    const-string v4, "115792089237316195423570985008687907853269984665640564039457584007913129639316"

    invoke-direct {v3, v4}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigInteger;

    const-string v5, "166"

    invoke-direct {v4, v5}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v0, v3, v4}, Lorg/spongycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 32
    new-instance v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    new-instance v3, Lorg/spongycastle/math/ec/ECPoint$Fp;

    new-instance v4, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve$Fp;->e()Ljava/math/BigInteger;

    move-result-object v5

    new-instance v6, Ljava/math/BigInteger;

    const-string v7, "1"

    invoke-direct {v6, v7}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5, v6}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v5, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve$Fp;->e()Ljava/math/BigInteger;

    move-result-object v6

    new-instance v7, Ljava/math/BigInteger;

    const-string v8, "64033881142927202683649881450433473985931760268884941288852745803908878638612"

    invoke-direct {v7, v8}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v6, v7}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v3, v2, v4, v5}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-direct {v0, v2, v3, v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)V

    .line 39
    sget-object v1, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b:Ljava/util/Hashtable;

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "115792089237316195423570985008687907853269984665640564039457584007913129639319"

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 42
    new-instance v1, Ljava/math/BigInteger;

    const-string v2, "115792089237316195423570985008687907853073762908499243225378155805079068850323"

    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 44
    new-instance v2, Lorg/spongycastle/math/ec/ECCurve$Fp;

    new-instance v3, Ljava/math/BigInteger;

    const-string v4, "115792089237316195423570985008687907853269984665640564039457584007913129639316"

    invoke-direct {v3, v4}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigInteger;

    const-string v5, "166"

    invoke-direct {v4, v5}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v0, v3, v4}, Lorg/spongycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 49
    new-instance v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    new-instance v3, Lorg/spongycastle/math/ec/ECPoint$Fp;

    new-instance v4, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve$Fp;->e()Ljava/math/BigInteger;

    move-result-object v5

    new-instance v6, Ljava/math/BigInteger;

    const-string v7, "1"

    invoke-direct {v6, v7}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5, v6}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v5, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve$Fp;->e()Ljava/math/BigInteger;

    move-result-object v6

    new-instance v7, Ljava/math/BigInteger;

    const-string v8, "64033881142927202683649881450433473985931760268884941288852745803908878638612"

    invoke-direct {v7, v8}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v6, v7}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v3, v2, v4, v5}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-direct {v0, v2, v3, v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)V

    .line 56
    sget-object v1, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b:Ljava/util/Hashtable;

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "57896044618658097711785492504343953926634992332820282019728792003956564823193"

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 59
    new-instance v1, Ljava/math/BigInteger;

    const-string v2, "57896044618658097711785492504343953927102133160255826820068844496087732066703"

    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 61
    new-instance v2, Lorg/spongycastle/math/ec/ECCurve$Fp;

    new-instance v3, Ljava/math/BigInteger;

    const-string v4, "57896044618658097711785492504343953926634992332820282019728792003956564823190"

    invoke-direct {v3, v4}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigInteger;

    const-string v5, "28091019353058090096996979000309560759124368558014865957655842872397301267595"

    invoke-direct {v4, v5}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v0, v3, v4}, Lorg/spongycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 66
    new-instance v3, Lorg/spongycastle/crypto/params/ECDomainParameters;

    new-instance v4, Lorg/spongycastle/math/ec/ECPoint$Fp;

    new-instance v5, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    new-instance v6, Ljava/math/BigInteger;

    const-string v7, "1"

    invoke-direct {v6, v7}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v0, v6}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v6, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    new-instance v7, Ljava/math/BigInteger;

    const-string v8, "28792665814854611296992347458380284135028636778229113005756334730996303888124"

    invoke-direct {v7, v8}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v0, v7}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v4, v2, v5, v6}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-direct {v3, v2, v4, v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)V

    .line 73
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "70390085352083305199547718019018437841079516630045180471284346843705633502619"

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 76
    new-instance v1, Ljava/math/BigInteger;

    const-string v2, "70390085352083305199547718019018437840920882647164081035322601458352298396601"

    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 78
    new-instance v2, Lorg/spongycastle/math/ec/ECCurve$Fp;

    new-instance v3, Ljava/math/BigInteger;

    const-string v4, "70390085352083305199547718019018437841079516630045180471284346843705633502616"

    invoke-direct {v3, v4}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigInteger;

    const-string v5, "32858"

    invoke-direct {v4, v5}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v0, v3, v4}, Lorg/spongycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 83
    new-instance v3, Lorg/spongycastle/crypto/params/ECDomainParameters;

    new-instance v4, Lorg/spongycastle/math/ec/ECPoint$Fp;

    new-instance v5, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    new-instance v6, Ljava/math/BigInteger;

    const-string v7, "0"

    invoke-direct {v6, v7}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v0, v6}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v6, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    new-instance v7, Ljava/math/BigInteger;

    const-string v8, "29818893917731240733471273240314769927240550812383695689146495261604565990247"

    invoke-direct {v7, v8}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v0, v7}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v4, v2, v5, v6}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-direct {v3, v2, v4, v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)V

    .line 90
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "70390085352083305199547718019018437841079516630045180471284346843705633502619"

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 93
    new-instance v1, Ljava/math/BigInteger;

    const-string v2, "70390085352083305199547718019018437840920882647164081035322601458352298396601"

    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 94
    new-instance v2, Lorg/spongycastle/math/ec/ECCurve$Fp;

    new-instance v3, Ljava/math/BigInteger;

    const-string v4, "70390085352083305199547718019018437841079516630045180471284346843705633502616"

    invoke-direct {v3, v4}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigInteger;

    const-string v5, "32858"

    invoke-direct {v4, v5}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v0, v3, v4}, Lorg/spongycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 99
    new-instance v3, Lorg/spongycastle/crypto/params/ECDomainParameters;

    new-instance v4, Lorg/spongycastle/math/ec/ECPoint$Fp;

    new-instance v5, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    new-instance v6, Ljava/math/BigInteger;

    const-string v7, "0"

    invoke-direct {v6, v7}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v0, v6}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v6, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    new-instance v7, Ljava/math/BigInteger;

    const-string v8, "29818893917731240733471273240314769927240550812383695689146495261604565990247"

    invoke-direct {v7, v8}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v0, v7}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v4, v2, v5, v6}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-direct {v3, v2, v4, v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)V

    .line 106
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a:Ljava/util/Hashtable;

    const-string v1, "GostR3410-2001-CryptoPro-A"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a:Ljava/util/Hashtable;

    const-string v1, "GostR3410-2001-CryptoPro-B"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a:Ljava/util/Hashtable;

    const-string v1, "GostR3410-2001-CryptoPro-C"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a:Ljava/util/Hashtable;

    const-string v1, "GostR3410-2001-CryptoPro-XchA"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a:Ljava/util/Hashtable;

    const-string v1, "GostR3410-2001-CryptoPro-XchB"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->c:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GostR3410-2001-CryptoPro-A"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->c:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GostR3410-2001-CryptoPro-B"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->c:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GostR3410-2001-CryptoPro-C"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->c:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GostR3410-2001-CryptoPro-XchA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->c:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GostR3410-2001-CryptoPro-XchB"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/spongycastle/crypto/params/ECDomainParameters;
    .locals 2

    .prologue
    .line 145
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 147
    if-eqz v0, :cond_0

    .line 149
    sget-object v1, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    .line 152
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/crypto/params/ECDomainParameters;
    .locals 1

    .prologue
    .line 130
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    return-object v0
.end method

.method public static b(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 161
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->c:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 166
    sget-object v0, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method
