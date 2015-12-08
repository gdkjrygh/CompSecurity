.class public Lorg/spongycastle/asn1/x509/CRLDistPoint;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/CRLDistPoint;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 40
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/CRLDistPoint;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 41
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CRLDistPoint;
    .locals 2

    .prologue
    .line 25
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/CRLDistPoint;

    if-eqz v0, :cond_0

    .line 27
    check-cast p0, Lorg/spongycastle/asn1/x509/CRLDistPoint;

    .line 34
    :goto_0
    return-object p0

    .line 29
    :cond_0
    if-eqz p0, :cond_1

    .line 31
    new-instance v0, Lorg/spongycastle/asn1/x509/CRLDistPoint;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/CRLDistPoint;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/CRLDistPoint;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final c()[Lorg/spongycastle/asn1/x509/DistributionPoint;
    .locals 3

    .prologue
    .line 63
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/CRLDistPoint;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    new-array v1, v0, [Lorg/spongycastle/asn1/x509/DistributionPoint;

    .line 65
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/CRLDistPoint;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 67
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/CRLDistPoint;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/DistributionPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/DistributionPoint;

    move-result-object v2

    aput-object v2, v1, v0

    .line 65
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 70
    :cond_0
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 86
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 87
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 89
    const-string v0, "CRLDistPoint:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 91
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/CRLDistPoint;->c()[Lorg/spongycastle/asn1/x509/DistributionPoint;

    move-result-object v3

    .line 92
    const/4 v0, 0x0

    :goto_0
    array-length v4, v3

    if-eq v0, v4, :cond_0

    .line 94
    const-string v4, "    "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 95
    aget-object v4, v3, v0

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 92
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
