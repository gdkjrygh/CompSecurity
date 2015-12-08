.class public Lorg/spongycastle/asn1/nist/NISTNamedCurves;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/util/Hashtable;

.field static final b:Ljava/util/Hashtable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 17
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a:Ljava/util/Hashtable;

    .line 18
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->b:Ljava/util/Hashtable;

    .line 30
    const-string v0, "B-571"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->F:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 31
    const-string v0, "B-409"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 32
    const-string v0, "B-283"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 33
    const-string v0, "B-233"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->t:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 34
    const-string v0, "B-163"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 35
    const-string v0, "P-521"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->B:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 36
    const-string v0, "P-384"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->A:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 37
    const-string v0, "P-256"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->H:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 38
    const-string v0, "P-224"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->z:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 39
    const-string v0, "P-192"

    sget-object v1, Lorg/spongycastle/asn1/sec/SECObjectIdentifiers;->G:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/spongycastle/asn1/x9/X9ECParameters;
    .locals 2

    .prologue
    .line 45
    sget-object v0, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a:Ljava/util/Hashtable;

    invoke-static {p0}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 47
    if-eqz v0, :cond_0

    .line 49
    invoke-static {v0}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    .line 52
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;
    .locals 1

    .prologue
    .line 64
    invoke-static {p0}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget-object v0, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    return-void
.end method

.method public static b(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 2

    .prologue
    .line 76
    sget-object v0, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a:Ljava/util/Hashtable;

    invoke-static {p0}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method
