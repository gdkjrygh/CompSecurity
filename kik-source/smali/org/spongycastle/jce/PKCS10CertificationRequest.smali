.class public Lorg/spongycastle/jce/PKCS10CertificationRequest;
.super Lorg/spongycastle/asn1/pkcs/CertificationRequest;
.source "SourceFile"


# static fields
.field private static d:Ljava/util/Hashtable;

.field private static e:Ljava/util/Hashtable;

.field private static f:Ljava/util/Hashtable;

.field private static g:Ljava/util/Hashtable;

.field private static h:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 76
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    .line 77
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->e:Ljava/util/Hashtable;

    .line 78
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->f:Ljava/util/Hashtable;

    .line 79
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    .line 80
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    .line 84
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "MD2WITHRSAENCRYPTION"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.113549.1.1.2"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "MD2WITHRSA"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.113549.1.1.2"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "MD5WITHRSAENCRYPTION"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.113549.1.1.4"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "MD5WITHRSA"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.113549.1.1.4"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "RSAWITHMD5"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.113549.1.1.4"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA1WITHRSAENCRYPTION"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.113549.1.1.5"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA1WITHRSA"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.113549.1.1.5"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA224WITHRSAENCRYPTION"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->L_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA224WITHRSA"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->L_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA256WITHRSAENCRYPTION"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->I_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA256WITHRSA"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->I_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA384WITHRSAENCRYPTION"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->J_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA384WITHRSA"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->J_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA512WITHRSAENCRYPTION"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->K_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA512WITHRSA"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->K_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA1WITHRSAANDMGF1"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA224WITHRSAANDMGF1"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA256WITHRSAANDMGF1"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA384WITHRSAANDMGF1"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA512WITHRSAANDMGF1"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "RSAWITHSHA1"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.113549.1.1.5"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "RIPEMD128WITHRSAENCRYPTION"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "RIPEMD128WITHRSA"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "RIPEMD160WITHRSAENCRYPTION"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "RIPEMD160WITHRSA"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "RIPEMD256WITHRSAENCRYPTION"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "RIPEMD256WITHRSA"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA1WITHDSA"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.10040.4.3"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "DSAWITHSHA1"

    new-instance v2, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v3, "1.2.840.10040.4.3"

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA224WITHDSA"

    sget-object v2, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA256WITHDSA"

    sget-object v2, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA384WITHDSA"

    sget-object v2, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->E:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA512WITHDSA"

    sget-object v2, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->F:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA1WITHECDSA"

    sget-object v2, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA224WITHECDSA"

    sget-object v2, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA256WITHECDSA"

    sget-object v2, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA384WITHECDSA"

    sget-object v2, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "SHA512WITHECDSA"

    sget-object v2, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "ECDSAWITHSHA1"

    sget-object v2, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "GOST3411WITHGOST3410"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "GOST3410WITHGOST3411"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "GOST3411WITHECGOST3410"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "GOST3411WITHECGOST3410-2001"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->d:Ljava/util/Hashtable;

    const-string v1, "GOST3411WITHGOST3410-2001"

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v2, "1.2.840.113549.1.1.5"

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    const-string v2, "SHA1WITHRSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->L_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA224WITHRSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->I_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA256WITHRSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->J_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA384WITHRSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->K_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA512WITHRSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GOST3411WITHGOST3410"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GOST3411WITHECGOST3410"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v2, "1.2.840.113549.1.1.4"

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    const-string v2, "MD5WITHRSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v2, "1.2.840.113549.1.1.2"

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    const-string v2, "MD2WITHRSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    const-string v2, "1.2.840.10040.4.3"

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    const-string v2, "SHA1WITHDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA1WITHECDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA224WITHECDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA256WITHECDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA384WITHECDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA512WITHECDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/oiw/OIWObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA1WITHRSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/oiw/OIWObjectIdentifiers;->j:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA1WITHDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA224WITHDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->g:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SHA256WITHDSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->f:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->D_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "RSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->f:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->U:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "DSA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 164
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 165
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 166
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 167
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 168
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->V:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 169
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 170
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 175
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 176
    sget-object v0, Lorg/spongycastle/jce/PKCS10CertificationRequest;->h:Ljava/util/Set;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 180
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/oiw/OIWObjectIdentifiers;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v2, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v2}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 181
    sget-object v1, Lorg/spongycastle/jce/PKCS10CertificationRequest;->e:Ljava/util/Hashtable;

    const-string v2, "SHA1WITHRSAANDMGF1"

    const/16 v3, 0x14

    invoke-static {v0, v3}, Lorg/spongycastle/jce/PKCS10CertificationRequest;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;I)Lorg/spongycastle/asn1/pkcs/RSASSAPSSparams;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v2, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v2}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 184
    sget-object v1, Lorg/spongycastle/jce/PKCS10CertificationRequest;->e:Ljava/util/Hashtable;

    const-string v2, "SHA224WITHRSAANDMGF1"

    const/16 v3, 0x1c

    invoke-static {v0, v3}, Lorg/spongycastle/jce/PKCS10CertificationRequest;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;I)Lorg/spongycastle/asn1/pkcs/RSASSAPSSparams;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v2, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v2}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 187
    sget-object v1, Lorg/spongycastle/jce/PKCS10CertificationRequest;->e:Ljava/util/Hashtable;

    const-string v2, "SHA256WITHRSAANDMGF1"

    const/16 v3, 0x20

    invoke-static {v0, v3}, Lorg/spongycastle/jce/PKCS10CertificationRequest;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;I)Lorg/spongycastle/asn1/pkcs/RSASSAPSSparams;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v2, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v2}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 190
    sget-object v1, Lorg/spongycastle/jce/PKCS10CertificationRequest;->e:Ljava/util/Hashtable;

    const-string v2, "SHA384WITHRSAANDMGF1"

    const/16 v3, 0x30

    invoke-static {v0, v3}, Lorg/spongycastle/jce/PKCS10CertificationRequest;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;I)Lorg/spongycastle/asn1/pkcs/RSASSAPSSparams;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v2, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v2}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 193
    sget-object v1, Lorg/spongycastle/jce/PKCS10CertificationRequest;->e:Ljava/util/Hashtable;

    const-string v2, "SHA512WITHRSAANDMGF1"

    const/16 v3, 0x40

    invoke-static {v0, v3}, Lorg/spongycastle/jce/PKCS10CertificationRequest;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;I)Lorg/spongycastle/asn1/pkcs/RSASSAPSSparams;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    return-void
.end method

.method private static a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;I)Lorg/spongycastle/asn1/pkcs/RSASSAPSSparams;
    .locals 5

    .prologue
    .line 198
    new-instance v0, Lorg/spongycastle/asn1/pkcs/RSASSAPSSparams;

    new-instance v1, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->H_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, v2, p0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v2, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v2, p1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    new-instance v3, Lorg/spongycastle/asn1/ASN1Integer;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-direct {v0, p0, v1, v2, v3}, Lorg/spongycastle/asn1/pkcs/RSASSAPSSparams;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/ASN1Integer;Lorg/spongycastle/asn1/ASN1Integer;)V

    return-object v0
.end method


# virtual methods
.method public final b()[B
    .locals 2

    .prologue
    .line 530
    :try_start_0
    const-string v0, "DER"

    invoke-virtual {p0, v0}, Lorg/spongycastle/jce/PKCS10CertificationRequest;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 532
    :catch_0
    move-exception v0

    .line 534
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
