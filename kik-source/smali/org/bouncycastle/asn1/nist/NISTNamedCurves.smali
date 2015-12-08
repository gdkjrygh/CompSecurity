.class public Lorg/bouncycastle/asn1/nist/NISTNamedCurves;
.super Ljava/lang/Object;


# static fields
.field static final a:Ljava/util/Hashtable;

.field static final b:Ljava/util/Hashtable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->b:Ljava/util/Hashtable;

    const-string v0, "B-571"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->F:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "B-409"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->D:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "B-283"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->n:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "B-233"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "B-163"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "P-521"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "P-384"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->A:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "P-256"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->H:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "P-224"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->z:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    const-string v0, "P-192"

    sget-object v1, Lorg/bouncycastle/asn1/sec/SECObjectIdentifiers;->G:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;
    .locals 2

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a:Ljava/util/Hashtable;

    invoke-static {p0}, Lorg/bouncycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V
    .locals 1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 2

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a:Ljava/util/Hashtable;

    invoke-static {p0}, Lorg/bouncycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-object v0
.end method
