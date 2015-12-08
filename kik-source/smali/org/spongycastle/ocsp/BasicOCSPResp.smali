.class public Lorg/spongycastle/ocsp/BasicOCSPResp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/cert/X509Extension;


# instance fields
.field a:Lorg/spongycastle/asn1/ocsp/BasicOCSPResponse;

.field b:Lorg/spongycastle/asn1/ocsp/ResponseData;


# direct methods
.method private a(Z)Ljava/util/Set;
    .locals 5

    .prologue
    .line 138
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 139
    invoke-direct {p0}, Lorg/spongycastle/ocsp/BasicOCSPResp;->a()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v2

    .line 141
    if-eqz v2, :cond_1

    .line 143
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509Extensions;->c()Ljava/util/Enumeration;

    move-result-object v3

    .line 145
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 147
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 148
    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v4

    .line 150
    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/X509Extension;->a()Z

    move-result v4

    if-ne p1, v4, :cond_0

    .line 152
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 157
    :cond_1
    return-object v1
.end method

.method private a()Lorg/spongycastle/asn1/x509/X509Extensions;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lorg/spongycastle/ocsp/BasicOCSPResp;->b:Lorg/spongycastle/asn1/ocsp/ResponseData;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ocsp/ResponseData;->c()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 347
    if-ne p1, p0, :cond_0

    .line 349
    const/4 v0, 0x1

    .line 359
    :goto_0
    return v0

    .line 352
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/ocsp/BasicOCSPResp;

    if-nez v0, :cond_1

    .line 354
    const/4 v0, 0x0

    goto :goto_0

    .line 357
    :cond_1
    check-cast p1, Lorg/spongycastle/ocsp/BasicOCSPResp;

    .line 359
    iget-object v0, p0, Lorg/spongycastle/ocsp/BasicOCSPResp;->a:Lorg/spongycastle/asn1/ocsp/BasicOCSPResponse;

    iget-object v1, p1, Lorg/spongycastle/ocsp/BasicOCSPResp;->a:Lorg/spongycastle/asn1/ocsp/BasicOCSPResponse;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ocsp/BasicOCSPResponse;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public getCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 162
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/spongycastle/ocsp/BasicOCSPResp;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getExtensionValue(Ljava/lang/String;)[B
    .locals 4

    .prologue
    .line 172
    invoke-direct {p0}, Lorg/spongycastle/ocsp/BasicOCSPResp;->a()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    .line 174
    if-eqz v0, :cond_0

    .line 176
    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v0

    .line 178
    if-eqz v0, :cond_0

    .line 182
    :try_start_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 191
    :goto_0
    return-object v0

    .line 184
    :catch_0
    move-exception v0

    .line 186
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error encoding "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 191
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getNonCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/spongycastle/ocsp/BasicOCSPResp;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public hasUnsupportedCriticalExtension()Z
    .locals 1

    .prologue
    .line 127
    invoke-virtual {p0}, Lorg/spongycastle/ocsp/BasicOCSPResp;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    .line 128
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 130
    const/4 v0, 0x1

    .line 133
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Lorg/spongycastle/ocsp/BasicOCSPResp;->a:Lorg/spongycastle/asn1/ocsp/BasicOCSPResponse;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ocsp/BasicOCSPResponse;->hashCode()I

    move-result v0

    return v0
.end method
