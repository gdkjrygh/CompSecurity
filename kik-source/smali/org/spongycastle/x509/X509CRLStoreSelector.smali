.class public Lorg/spongycastle/x509/X509CRLStoreSelector;
.super Ljava/security/cert/X509CRLSelector;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/util/Selector;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ljava/math/BigInteger;

.field private d:[B

.field private e:Z

.field private f:Lorg/spongycastle/x509/X509AttributeCertificate;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 23
    invoke-direct {p0}, Ljava/security/cert/X509CRLSelector;-><init>()V

    .line 27
    iput-boolean v0, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->a:Z

    .line 29
    iput-boolean v0, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->b:Z

    .line 31
    iput-object v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    .line 33
    iput-object v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->d:[B

    .line 35
    iput-boolean v0, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->e:Z

    return-void
.end method

.method private static a(Ljava/security/cert/X509CRLSelector;)Lorg/spongycastle/x509/X509CRLStoreSelector;
    .locals 2

    .prologue
    .line 205
    if-nez p0, :cond_0

    .line 207
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot create from null selector"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_0
    new-instance v0, Lorg/spongycastle/x509/X509CRLStoreSelector;

    invoke-direct {v0}, Lorg/spongycastle/x509/X509CRLStoreSelector;-><init>()V

    .line 211
    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getCertificateChecking()Ljava/security/cert/X509Certificate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->setCertificateChecking(Ljava/security/cert/X509Certificate;)V

    .line 212
    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getDateAndTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->setDateAndTime(Ljava/util/Date;)V

    .line 215
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getIssuerNames()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->setIssuerNames(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getIssuers()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->setIssuers(Ljava/util/Collection;)V

    .line 223
    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getMaxCRL()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->setMaxCRLNumber(Ljava/math/BigInteger;)V

    .line 224
    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getMinCRL()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->setMinCRLNumber(Ljava/math/BigInteger;)V

    .line 225
    return-object v0

    .line 217
    :catch_0
    move-exception v0

    .line 220
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->e:Z

    .line 63
    return-void
.end method

.method public final a(Ljava/math/BigInteger;)V
    .locals 0

    .prologue
    .line 288
    iput-object p1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    .line 289
    return-void
.end method

.method public final a(Lorg/spongycastle/x509/X509AttributeCertificate;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->f:Lorg/spongycastle/x509/X509AttributeCertificate;

    .line 79
    return-void
.end method

.method public final a([B)V
    .locals 1

    .prologue
    .line 328
    invoke-static {p1}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->d:[B

    .line 329
    return-void
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 94
    instance-of v0, p1, Ljava/security/cert/X509CRL;

    if-nez v0, :cond_0

    move v0, v2

    .line 160
    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    .line 98
    check-cast v0, Ljava/security/cert/X509CRL;

    .line 99
    const/4 v1, 0x0

    .line 102
    :try_start_0
    sget-object v3, Lorg/spongycastle/asn1/x509/X509Extensions;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/security/cert/X509CRL;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v3

    .line 104
    if-eqz v3, :cond_1

    .line 106
    invoke-static {v3}, Lorg/spongycastle/x509/extension/X509ExtensionUtil;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/DERInteger;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 114
    :cond_1
    iget-boolean v3, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->a:Z

    if-eqz v3, :cond_2

    .line 116
    if-nez v1, :cond_2

    move v0, v2

    .line 118
    goto :goto_0

    .line 112
    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_0

    .line 121
    :cond_2
    iget-boolean v3, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->b:Z

    if-eqz v3, :cond_3

    .line 123
    if-eqz v1, :cond_3

    move v0, v2

    .line 125
    goto :goto_0

    .line 128
    :cond_3
    if-eqz v1, :cond_4

    .line 131
    iget-object v3, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    if-eqz v3, :cond_4

    .line 133
    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERInteger;->d()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v3, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4

    move v0, v2

    .line 135
    goto :goto_0

    .line 139
    :cond_4
    iget-boolean v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->e:Z

    if-eqz v1, :cond_6

    .line 141
    sget-object v1, Lorg/spongycastle/asn1/x509/X509Extensions;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/cert/X509CRL;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    .line 144
    iget-object v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->d:[B

    if-nez v1, :cond_5

    .line 146
    if-eqz v0, :cond_6

    move v0, v2

    .line 148
    goto :goto_0

    .line 153
    :cond_5
    iget-object v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->d:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    if-nez v0, :cond_6

    move v0, v2

    .line 155
    goto :goto_0

    .line 160
    :cond_6
    check-cast p1, Ljava/security/cert/X509CRL;

    invoke-super {p0, p1}, Ljava/security/cert/X509CRLSelector;->match(Ljava/security/cert/CRL;)Z

    move-result v0

    goto :goto_0
.end method

.method public final b()Lorg/spongycastle/x509/X509AttributeCertificate;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->f:Lorg/spongycastle/x509/X509AttributeCertificate;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 177
    iget-boolean v0, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->a:Z

    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 230
    invoke-static {p0}, Lorg/spongycastle/x509/X509CRLStoreSelector;->a(Ljava/security/cert/X509CRLSelector;)Lorg/spongycastle/x509/X509CRLStoreSelector;

    move-result-object v0

    .line 231
    iget-boolean v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->a:Z

    iput-boolean v1, v0, Lorg/spongycastle/x509/X509CRLStoreSelector;->a:Z

    .line 232
    iget-boolean v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->b:Z

    iput-boolean v1, v0, Lorg/spongycastle/x509/X509CRLStoreSelector;->b:Z

    .line 233
    iget-object v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    iput-object v1, v0, Lorg/spongycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    .line 234
    iget-object v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->f:Lorg/spongycastle/x509/X509AttributeCertificate;

    iput-object v1, v0, Lorg/spongycastle/x509/X509CRLStoreSelector;->f:Lorg/spongycastle/x509/X509AttributeCertificate;

    .line 235
    iget-boolean v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->e:Z

    iput-boolean v1, v0, Lorg/spongycastle/x509/X509CRLStoreSelector;->e:Z

    .line 236
    iget-object v1, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->d:[B

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v1

    iput-object v1, v0, Lorg/spongycastle/x509/X509CRLStoreSelector;->d:[B

    .line 237
    return-object v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 262
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/x509/X509CRLStoreSelector;->b:Z

    .line 263
    return-void
.end method

.method public match(Ljava/security/cert/CRL;)Z
    .locals 1

    .prologue
    .line 165
    invoke-virtual {p0, p1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
