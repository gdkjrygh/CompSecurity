.class public Lorg/spongycastle/ocsp/RespID;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ocsp/ResponderID;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 66
    instance-of v0, p1, Lorg/spongycastle/ocsp/RespID;

    if-nez v0, :cond_0

    .line 68
    const/4 v0, 0x0

    .line 73
    :goto_0
    return v0

    .line 71
    :cond_0
    check-cast p1, Lorg/spongycastle/ocsp/RespID;

    .line 73
    iget-object v0, p0, Lorg/spongycastle/ocsp/RespID;->a:Lorg/spongycastle/asn1/ocsp/ResponderID;

    iget-object v1, p1, Lorg/spongycastle/ocsp/RespID;->a:Lorg/spongycastle/asn1/ocsp/ResponderID;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ocsp/ResponderID;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lorg/spongycastle/ocsp/RespID;->a:Lorg/spongycastle/asn1/ocsp/ResponderID;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ocsp/ResponderID;->hashCode()I

    move-result v0

    return v0
.end method
