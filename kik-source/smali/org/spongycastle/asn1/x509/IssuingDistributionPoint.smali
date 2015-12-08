.class public Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/DistributionPointName;

.field private b:Z

.field private c:Z

.field private d:Lorg/spongycastle/asn1/x509/ReasonFlags;

.field private e:Z

.field private f:Z

.field private g:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 3

    .prologue
    .line 144
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 145
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->g:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 147
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 149
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    .line 151
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 173
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown tag in IssuingDistributionPoint"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 155
    :pswitch_0
    invoke-static {v1}, Lorg/spongycastle/asn1/x509/DistributionPointName;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/DistributionPointName;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    .line 147
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 158
    :pswitch_1
    invoke-static {v1}, Lorg/spongycastle/asn1/DERBoolean;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBoolean;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBoolean;->d()Z

    move-result v1

    iput-boolean v1, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->b:Z

    goto :goto_1

    .line 161
    :pswitch_2
    invoke-static {v1}, Lorg/spongycastle/asn1/DERBoolean;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBoolean;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBoolean;->d()Z

    move-result v1

    iput-boolean v1, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->c:Z

    goto :goto_1

    .line 164
    :pswitch_3
    new-instance v2, Lorg/spongycastle/asn1/x509/ReasonFlags;

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/ReasonFlags;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/x509/ReasonFlags;-><init>(Lorg/spongycastle/asn1/DERBitString;)V

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->d:Lorg/spongycastle/asn1/x509/ReasonFlags;

    goto :goto_1

    .line 167
    :pswitch_4
    invoke-static {v1}, Lorg/spongycastle/asn1/DERBoolean;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBoolean;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBoolean;->d()Z

    move-result v1

    iput-boolean v1, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->e:Z

    goto :goto_1

    .line 170
    :pswitch_5
    invoke-static {v1}, Lorg/spongycastle/asn1/DERBoolean;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBoolean;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBoolean;->d()Z

    move-result v1

    iput-boolean v1, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->f:Z

    goto :goto_1

    .line 177
    :cond_0
    return-void

    .line 151
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static a(Z)Ljava/lang/String;
    .locals 1

    .prologue
    .line 272
    if-eqz p0, :cond_0

    const-string v0, "true"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "false"

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;
    .locals 2

    .prologue
    .line 50
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;

    if-eqz v0, :cond_0

    .line 52
    check-cast p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;

    .line 59
    :goto_0
    return-object p0

    .line 54
    :cond_0
    if-eqz p0, :cond_1

    .line 56
    new-instance v0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 59
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method

.method private static a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 258
    const-string v0, "    "

    .line 260
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 261
    invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 262
    const-string v1, ":"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 263
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 264
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 265
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 266
    invoke-virtual {p0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 267
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 268
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->g:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 181
    iget-boolean v0, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->b:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 186
    iget-boolean v0, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->c:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 191
    iget-boolean v0, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->e:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 196
    iget-boolean v0, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->f:Z

    return v0
.end method

.method public final g()Lorg/spongycastle/asn1/x509/DistributionPointName;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    return-object v0
.end method

.method public final h()Lorg/spongycastle/asn1/x509/ReasonFlags;
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->d:Lorg/spongycastle/asn1/x509/ReasonFlags;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 222
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 223
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 225
    const-string v2, "IssuingDistributionPoint: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 226
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 227
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    if-eqz v2, :cond_0

    .line 229
    const-string v2, "distributionPoint"

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a:Lorg/spongycastle/asn1/x509/DistributionPointName;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    :cond_0
    iget-boolean v2, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->b:Z

    if-eqz v2, :cond_1

    .line 233
    const-string v2, "onlyContainsUserCerts"

    iget-boolean v3, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->b:Z

    invoke-static {v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    :cond_1
    iget-boolean v2, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->c:Z

    if-eqz v2, :cond_2

    .line 237
    const-string v2, "onlyContainsCACerts"

    iget-boolean v3, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->c:Z

    invoke-static {v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    :cond_2
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->d:Lorg/spongycastle/asn1/x509/ReasonFlags;

    if-eqz v2, :cond_3

    .line 241
    const-string v2, "onlySomeReasons"

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->d:Lorg/spongycastle/asn1/x509/ReasonFlags;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/ReasonFlags;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    :cond_3
    iget-boolean v2, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->f:Z

    if-eqz v2, :cond_4

    .line 245
    const-string v2, "onlyContainsAttributeCerts"

    iget-boolean v3, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->f:Z

    invoke-static {v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    :cond_4
    iget-boolean v2, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->e:Z

    if-eqz v2, :cond_5

    .line 249
    const-string v2, "indirectCRL"

    iget-boolean v3, p0, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->e:Z

    invoke-static {v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    :cond_5
    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 252
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 253
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
