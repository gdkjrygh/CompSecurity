.class public Lorg/bouncycastle/ocsp/RespID;
.super Ljava/lang/Object;


# instance fields
.field a:Lorg/bouncycastle/asn1/ocsp/ResponderID;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lorg/bouncycastle/ocsp/RespID;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    check-cast p1, Lorg/bouncycastle/ocsp/RespID;

    iget-object v0, p0, Lorg/bouncycastle/ocsp/RespID;->a:Lorg/bouncycastle/asn1/ocsp/ResponderID;

    iget-object v1, p1, Lorg/bouncycastle/ocsp/RespID;->a:Lorg/bouncycastle/asn1/ocsp/ResponderID;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ocsp/ResponderID;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/ocsp/RespID;->a:Lorg/bouncycastle/asn1/ocsp/ResponderID;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ocsp/ResponderID;->hashCode()I

    move-result v0

    return v0
.end method
