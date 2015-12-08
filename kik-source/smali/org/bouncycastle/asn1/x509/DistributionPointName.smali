.class public Lorg/bouncycastle/asn1/x509/DistributionPointName;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field a:Lorg/bouncycastle/asn1/DEREncodable;

.field b:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->b:I

    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    return-void
.end method

.method private constructor <init>(Lorg/bouncycastle/asn1/ASN1TaggedObject;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->e()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->b:I

    iget v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->b:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    :goto_0
    return-void

    :cond_0
    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1Set;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    goto :goto_0
.end method

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/DistributionPointName;
    .locals 4

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/ASN1TaggedObject;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lorg/bouncycastle/asn1/x509/DistributionPointName;

    if-eqz v1, :cond_1

    :cond_0
    check-cast v0, Lorg/bouncycastle/asn1/x509/DistributionPointName;

    :goto_0
    return-object v0

    :cond_1
    instance-of v1, v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-eqz v1, :cond_2

    new-instance v1, Lorg/bouncycastle/asn1/x509/DistributionPointName;

    check-cast v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/x509/DistributionPointName;-><init>(Lorg/bouncycastle/asn1/ASN1TaggedObject;)V

    move-object v0, v1

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown object in factory: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "    "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, ":"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    iget v2, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->b:I

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->b:I

    return v0
.end method

.method public final f()Lorg/bouncycastle/asn1/ASN1Encodable;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Encodable;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "DistributionPointName: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->b:I

    if-nez v2, :cond_0

    const-string v2, "fullName"

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v2, "nameRelativeToCRLIssuer"

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
