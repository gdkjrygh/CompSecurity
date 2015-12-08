.class public Lorg/spongycastle/ocsp/SingleResp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/cert/X509Extension;


# instance fields
.field a:Lorg/spongycastle/asn1/ocsp/SingleResponse;


# direct methods
.method private a(Z)Ljava/util/Set;
    .locals 5

    .prologue
    .line 109
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 110
    invoke-direct {p0}, Lorg/spongycastle/ocsp/SingleResp;->a()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v2

    .line 112
    if-eqz v2, :cond_1

    .line 114
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509Extensions;->c()Ljava/util/Enumeration;

    move-result-object v3

    .line 116
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 119
    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v4

    .line 121
    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/X509Extension;->a()Z

    move-result v4

    if-ne p1, v4, :cond_0

    .line 123
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 128
    :cond_1
    return-object v1
.end method

.method private a()Lorg/spongycastle/asn1/x509/X509Extensions;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lorg/spongycastle/ocsp/SingleResp;->a:Lorg/spongycastle/asn1/ocsp/SingleResponse;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ocsp/SingleResponse;->c()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 133
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/spongycastle/ocsp/SingleResp;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getExtensionValue(Ljava/lang/String;)[B
    .locals 4

    .prologue
    .line 143
    invoke-direct {p0}, Lorg/spongycastle/ocsp/SingleResp;->a()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    .line 145
    if-eqz v0, :cond_0

    .line 147
    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v0

    .line 149
    if-eqz v0, :cond_0

    .line 153
    :try_start_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 162
    :goto_0
    return-object v0

    .line 155
    :catch_0
    move-exception v0

    .line 157
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

    .line 162
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getNonCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 138
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/spongycastle/ocsp/SingleResp;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public hasUnsupportedCriticalExtension()Z
    .locals 1

    .prologue
    .line 102
    invoke-virtual {p0}, Lorg/spongycastle/ocsp/SingleResp;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    .line 104
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
