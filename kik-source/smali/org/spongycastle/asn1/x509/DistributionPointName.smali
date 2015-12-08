.class public Lorg/spongycastle/asn1/x509/DistributionPointName;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Encodable;

.field b:I


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->b:I

    .line 57
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 58
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1TaggedObject;)V
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 89
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->b:I

    .line 91
    iget v0, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->b:I

    if-nez v0, :cond_0

    .line 93
    invoke-static {p1}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 99
    :goto_0
    return-void

    .line 97
    :cond_0
    invoke-static {p1}, Lorg/spongycastle/asn1/ASN1Set;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/DistributionPointName;
    .locals 4

    .prologue
    .line 34
    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lorg/spongycastle/asn1/x509/DistributionPointName;

    if-eqz v1, :cond_1

    :cond_0
    check-cast v0, Lorg/spongycastle/asn1/x509/DistributionPointName;

    :goto_0
    return-object v0

    :cond_1
    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-eqz v1, :cond_2

    new-instance v1, Lorg/spongycastle/asn1/x509/DistributionPointName;

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x509/DistributionPointName;-><init>(Lorg/spongycastle/asn1/ASN1TaggedObject;)V

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

    .prologue
    .line 127
    const-string v0, "    "

    .line 129
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 130
    invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 131
    const-string v1, ":"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 132
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 133
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 134
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 135
    invoke-virtual {p0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 136
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 137
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 103
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    iget v2, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->b:I

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 73
    iget v0, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->b:I

    return v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 108
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 109
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 110
    const-string v2, "DistributionPointName: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 111
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 112
    iget v2, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->b:I

    if-nez v2, :cond_0

    .line 114
    const-string v2, "fullName"

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :goto_0
    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 118
    :cond_0
    const-string v2, "nameRelativeToCRLIssuer"

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/DistributionPointName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
