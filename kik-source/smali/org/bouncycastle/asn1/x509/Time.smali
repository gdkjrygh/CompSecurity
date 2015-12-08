.class public Lorg/bouncycastle/asn1/x509/Time;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field a:Lorg/bouncycastle/asn1/DERObject;


# direct methods
.method private constructor <init>(Lorg/bouncycastle/asn1/DERObject;)V
    .locals 2

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    instance-of v0, p1, Lorg/bouncycastle/asn1/DERUTCTime;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/bouncycastle/asn1/DERGeneralizedTime;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown object passed to Time"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/Time;->a:Lorg/bouncycastle/asn1/DERObject;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Time;
    .locals 3

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/Time;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/x509/Time;

    :goto_0
    return-object p0

    :cond_1
    instance-of v0, p0, Lorg/bouncycastle/asn1/DERUTCTime;

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/asn1/x509/Time;

    check-cast p0, Lorg/bouncycastle/asn1/DERUTCTime;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/x509/Time;-><init>(Lorg/bouncycastle/asn1/DERObject;)V

    move-object p0, v0

    goto :goto_0

    :cond_2
    instance-of v0, p0, Lorg/bouncycastle/asn1/DERGeneralizedTime;

    if-eqz v0, :cond_3

    new-instance v0, Lorg/bouncycastle/asn1/x509/Time;

    check-cast p0, Lorg/bouncycastle/asn1/DERGeneralizedTime;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/x509/Time;-><init>(Lorg/bouncycastle/asn1/DERObject;)V

    move-object p0, v0

    goto :goto_0

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
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Time;->a:Lorg/bouncycastle/asn1/DERObject;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Time;->a:Lorg/bouncycastle/asn1/DERObject;

    instance-of v0, v0, Lorg/bouncycastle/asn1/DERUTCTime;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Time;->a:Lorg/bouncycastle/asn1/DERObject;

    check-cast v0, Lorg/bouncycastle/asn1/DERUTCTime;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERUTCTime;->f()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Time;->a:Lorg/bouncycastle/asn1/DERObject;

    check-cast v0, Lorg/bouncycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERGeneralizedTime;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final f()Ljava/util/Date;
    .locals 5

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Time;->a:Lorg/bouncycastle/asn1/DERObject;

    instance-of v0, v0, Lorg/bouncycastle/asn1/DERUTCTime;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Time;->a:Lorg/bouncycastle/asn1/DERObject;

    check-cast v0, Lorg/bouncycastle/asn1/DERUTCTime;

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyyMMddHHmmssz"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/SimpleTimeZone;

    const/4 v3, 0x0

    const-string v4, "Z"

    invoke-direct {v2, v3, v4}, Ljava/util/SimpleTimeZone;-><init>(ILjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERUTCTime;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Time;->a:Lorg/bouncycastle/asn1/DERObject;

    check-cast v0, Lorg/bouncycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERGeneralizedTime;->f()Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

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

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/Time;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
