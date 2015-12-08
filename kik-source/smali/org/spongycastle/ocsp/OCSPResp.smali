.class public Lorg/spongycastle/ocsp/OCSPResp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ocsp/OCSPResponse;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 109
    if-ne p1, p0, :cond_0

    .line 111
    const/4 v0, 0x1

    .line 121
    :goto_0
    return v0

    .line 114
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/ocsp/OCSPResp;

    if-nez v0, :cond_1

    .line 116
    const/4 v0, 0x0

    goto :goto_0

    .line 119
    :cond_1
    check-cast p1, Lorg/spongycastle/ocsp/OCSPResp;

    .line 121
    iget-object v0, p0, Lorg/spongycastle/ocsp/OCSPResp;->a:Lorg/spongycastle/asn1/ocsp/OCSPResponse;

    iget-object v1, p1, Lorg/spongycastle/ocsp/OCSPResp;->a:Lorg/spongycastle/asn1/ocsp/OCSPResponse;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ocsp/OCSPResponse;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lorg/spongycastle/ocsp/OCSPResp;->a:Lorg/spongycastle/asn1/ocsp/OCSPResponse;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ocsp/OCSPResponse;->hashCode()I

    move-result v0

    return v0
.end method
