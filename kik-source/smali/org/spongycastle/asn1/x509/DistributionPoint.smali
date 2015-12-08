.class public Lorg/spongycastle/asn1/x509/DistributionPoint;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/x509/DistributionPointName;

.field b:Lorg/spongycastle/asn1/x509/ReasonFlags;

.field c:Lorg/spongycastle/asn1/x509/GeneralNames;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 3

    .prologue
    .line 54
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 55
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 57
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    .line 58
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 55
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 61
    :pswitch_0
    invoke-static {v1}, Lorg/spongycastle/asn1/x509/DistributionPointName;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/DistributionPointName;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    goto :goto_1

    .line 64
    :pswitch_1
    new-instance v2, Lorg/spongycastle/asn1/x509/ReasonFlags;

    invoke-static {v1}, Lorg/spongycastle/asn1/DERBitString;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/x509/ReasonFlags;-><init>(Lorg/spongycastle/asn1/DERBitString;)V

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->b:Lorg/spongycastle/asn1/x509/ReasonFlags;

    goto :goto_1

    .line 67
    :pswitch_2
    invoke-static {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->c:Lorg/spongycastle/asn1/x509/GeneralNames;

    goto :goto_1

    .line 70
    :cond_0
    return-void

    .line 58
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/x509/DistributionPointName;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 76
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 77
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    .line 78
    iput-object v0, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->b:Lorg/spongycastle/asn1/x509/ReasonFlags;

    .line 79
    iput-object v0, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->c:Lorg/spongycastle/asn1/x509/GeneralNames;

    .line 80
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/DistributionPoint;
    .locals 3

    .prologue
    .line 39
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;

    if-eqz v0, :cond_1

    .line 41
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/x509/DistributionPoint;

    .line 46
    :goto_0
    return-object p0

    .line 44
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_2

    .line 46
    new-instance v0, Lorg/spongycastle/asn1/x509/DistributionPoint;

    check-cast p0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 49
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid DistributionPoint: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 147
    const-string v0, "    "

    .line 149
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 150
    invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 151
    const-string v1, ":"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 152
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 153
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 154
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 155
    invoke-virtual {p0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 156
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 157
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 99
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 101
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    if-eqz v1, :cond_0

    .line 106
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    invoke-direct {v1, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 109
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->b:Lorg/spongycastle/asn1/x509/ReasonFlags;

    if-eqz v1, :cond_1

    .line 111
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->b:Lorg/spongycastle/asn1/x509/ReasonFlags;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 114
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->c:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v1, :cond_2

    .line 116
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->c:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 119
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/x509/DistributionPointName;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/x509/ReasonFlags;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->b:Lorg/spongycastle/asn1/x509/ReasonFlags;

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/x509/GeneralNames;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->c:Lorg/spongycastle/asn1/x509/GeneralNames;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 124
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 125
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 126
    const-string v2, "DistributionPoint: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 127
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 128
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    if-eqz v2, :cond_0

    .line 130
    const-string v2, "distributionPoint"

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/DistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    :cond_0
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->b:Lorg/spongycastle/asn1/x509/ReasonFlags;

    if-eqz v2, :cond_1

    .line 134
    const-string v2, "reasons"

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->b:Lorg/spongycastle/asn1/x509/ReasonFlags;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/ReasonFlags;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/DistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    :cond_1
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->c:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v2, :cond_2

    .line 138
    const-string v2, "cRLIssuer"

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/DistributionPoint;->c:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralNames;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/DistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    :cond_2
    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 141
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 142
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
