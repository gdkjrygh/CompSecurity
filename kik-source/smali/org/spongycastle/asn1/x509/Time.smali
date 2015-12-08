.class public Lorg/spongycastle/asn1/x509/Time;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Primitive;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Primitive;)V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 31
    instance-of v0, p1, Lorg/spongycastle/asn1/DERUTCTime;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/spongycastle/asn1/DERGeneralizedTime;

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown object passed to Time"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_0
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/Time;->a:Lorg/spongycastle/asn1/ASN1Primitive;

    .line 38
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Time;
    .locals 3

    .prologue
    .line 69
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/x509/Time;

    if-eqz v0, :cond_1

    .line 71
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/x509/Time;

    .line 79
    :goto_0
    return-object p0

    .line 73
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/DERUTCTime;

    if-eqz v0, :cond_2

    .line 75
    new-instance v0, Lorg/spongycastle/asn1/x509/Time;

    check-cast p0, Lorg/spongycastle/asn1/DERUTCTime;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/x509/Time;-><init>(Lorg/spongycastle/asn1/ASN1Primitive;)V

    move-object p0, v0

    goto :goto_0

    .line 77
    :cond_2
    instance-of v0, p0, Lorg/spongycastle/asn1/DERGeneralizedTime;

    if-eqz v0, :cond_3

    .line 79
    new-instance v0, Lorg/spongycastle/asn1/x509/Time;

    check-cast p0, Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/x509/Time;-><init>(Lorg/spongycastle/asn1/ASN1Primitive;)V

    move-object p0, v0

    goto :goto_0

    .line 82
    :cond_3
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


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Time;->a:Lorg/spongycastle/asn1/ASN1Primitive;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Time;->a:Lorg/spongycastle/asn1/ASN1Primitive;

    instance-of v0, v0, Lorg/spongycastle/asn1/DERUTCTime;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Time;->a:Lorg/spongycastle/asn1/ASN1Primitive;

    check-cast v0, Lorg/spongycastle/asn1/DERUTCTime;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERUTCTime;->d()Ljava/lang/String;

    move-result-object v0

    .line 93
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Time;->a:Lorg/spongycastle/asn1/ASN1Primitive;

    check-cast v0, Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERGeneralizedTime;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final d()Ljava/util/Date;
    .locals 5

    .prologue
    .line 101
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Time;->a:Lorg/spongycastle/asn1/ASN1Primitive;

    instance-of v0, v0, Lorg/spongycastle/asn1/DERUTCTime;

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Time;->a:Lorg/spongycastle/asn1/ASN1Primitive;

    check-cast v0, Lorg/spongycastle/asn1/DERUTCTime;

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyyMMddHHmmssz"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/SimpleTimeZone;

    const/4 v3, 0x0

    const-string v4, "Z"

    invoke-direct {v2, v3, v4}, Ljava/util/SimpleTimeZone;-><init>(ILjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERUTCTime;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 107
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Time;->a:Lorg/spongycastle/asn1/ASN1Primitive;

    check-cast v0, Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERGeneralizedTime;->d()Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 110
    :catch_0
    move-exception v0

    .line 112
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid date string: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/Time;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
