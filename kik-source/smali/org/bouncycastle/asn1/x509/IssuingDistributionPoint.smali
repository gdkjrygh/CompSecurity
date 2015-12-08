.class public Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/x509/DistributionPointName;

.field private b:Z

.field private c:Z

.field private d:Lorg/bouncycastle/asn1/x509/ReasonFlags;

.field private e:Z

.field private f:Z

.field private g:Lorg/bouncycastle/asn1/ASN1Sequence;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 3

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->e()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown tag in IssuingDistributionPoint"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a:Lorg/bouncycastle/asn1/x509/DistributionPointName;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :pswitch_1
    invoke-static {v1}, Lorg/bouncycastle/asn1/DERBoolean;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBoolean;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBoolean;->e()Z

    move-result v1

    iput-boolean v1, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->b:Z

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lorg/bouncycastle/asn1/DERBoolean;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBoolean;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBoolean;->e()Z

    move-result v1

    iput-boolean v1, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->c:Z

    goto :goto_1

    :pswitch_3
    new-instance v2, Lorg/bouncycastle/asn1/x509/ReasonFlags;

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/ReasonFlags;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/x509/ReasonFlags;-><init>(Lorg/bouncycastle/asn1/DERBitString;)V

    iput-object v2, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->d:Lorg/bouncycastle/asn1/x509/ReasonFlags;

    goto :goto_1

    :pswitch_4
    invoke-static {v1}, Lorg/bouncycastle/asn1/DERBoolean;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBoolean;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBoolean;->e()Z

    move-result v1

    iput-boolean v1, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->e:Z

    goto :goto_1

    :pswitch_5
    invoke-static {v1}, Lorg/bouncycastle/asn1/DERBoolean;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBoolean;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBoolean;->e()Z

    move-result v1

    iput-boolean v1, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->f:Z

    goto :goto_1

    :cond_0
    return-void

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

    if-eqz p0, :cond_0

    const-string v0, "true"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "false"

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;
    .locals 3

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;

    :goto_0
    return-object p0

    :cond_1
    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;

    check-cast p0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown object in factory: "

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
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->g:Lorg/bouncycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->b:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->c:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->e:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->f:Z

    return v0
.end method

.method public final i()Lorg/bouncycastle/asn1/x509/DistributionPointName;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a:Lorg/bouncycastle/asn1/x509/DistributionPointName;

    return-object v0
.end method

.method public final j()Lorg/bouncycastle/asn1/x509/ReasonFlags;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->d:Lorg/bouncycastle/asn1/x509/ReasonFlags;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "IssuingDistributionPoint: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a:Lorg/bouncycastle/asn1/x509/DistributionPointName;

    if-eqz v2, :cond_0

    const-string v2, "distributionPoint"

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a:Lorg/bouncycastle/asn1/x509/DistributionPointName;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-boolean v2, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->b:Z

    if-eqz v2, :cond_1

    const-string v2, "onlyContainsUserCerts"

    iget-boolean v3, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->b:Z

    invoke-static {v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-boolean v2, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->c:Z

    if-eqz v2, :cond_2

    const-string v2, "onlyContainsCACerts"

    iget-boolean v3, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->c:Z

    invoke-static {v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->d:Lorg/bouncycastle/asn1/x509/ReasonFlags;

    if-eqz v2, :cond_3

    const-string v2, "onlySomeReasons"

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->d:Lorg/bouncycastle/asn1/x509/ReasonFlags;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/ReasonFlags;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-boolean v2, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->f:Z

    if-eqz v2, :cond_4

    const-string v2, "onlyContainsAttributeCerts"

    iget-boolean v3, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->f:Z

    invoke-static {v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-boolean v2, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->e:Z

    if-eqz v2, :cond_5

    const-string v2, "indirectCRL"

    iget-boolean v3, p0, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->e:Z

    invoke-static {v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
