.class public Lorg/spongycastle/ocsp/RespData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/cert/X509Extension;


# instance fields
.field a:Lorg/spongycastle/asn1/ocsp/ResponseData;


# direct methods
.method private a(Z)Ljava/util/Set;
    .locals 5

    .prologue
    .line 87
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 88
    invoke-direct {p0}, Lorg/spongycastle/ocsp/RespData;->a()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v2

    .line 90
    if-eqz v2, :cond_1

    .line 92
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509Extensions;->c()Ljava/util/Enumeration;

    move-result-object v3

    .line 94
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 97
    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v4

    .line 99
    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/X509Extension;->a()Z

    move-result v4

    if-ne p1, v4, :cond_0

    .line 101
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 106
    :cond_1
    return-object v1
.end method

.method private a()Lorg/spongycastle/asn1/x509/X509Extensions;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lorg/spongycastle/ocsp/RespData;->a:Lorg/spongycastle/asn1/ocsp/ResponseData;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ocsp/ResponseData;->c()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 111
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/spongycastle/ocsp/RespData;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getExtensionValue(Ljava/lang/String;)[B
    .locals 4

    .prologue
    .line 121
    invoke-direct {p0}, Lorg/spongycastle/ocsp/RespData;->a()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    .line 123
    if-eqz v0, :cond_0

    .line 125
    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v0

    .line 127
    if-eqz v0, :cond_0

    .line 131
    :try_start_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 140
    :goto_0
    return-object v0

    .line 133
    :catch_0
    move-exception v0

    .line 135
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

    .line 140
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getNonCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 116
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/spongycastle/ocsp/RespData;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public hasUnsupportedCriticalExtension()Z
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, Lorg/spongycastle/ocsp/RespData;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    .line 77
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    const/4 v0, 0x1

    .line 82
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
