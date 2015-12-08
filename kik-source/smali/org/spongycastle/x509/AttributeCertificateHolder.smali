.class public Lorg/spongycastle/x509/AttributeCertificateHolder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/cert/CertSelector;
.implements Lorg/spongycastle/util/Selector;


# instance fields
.field final a:Lorg/spongycastle/asn1/x509/Holder;


# direct methods
.method constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-static {p1}, Lorg/spongycastle/asn1/x509/Holder;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Holder;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    .line 58
    return-void
.end method

.method private static a(Lorg/spongycastle/jce/X509Principal;Lorg/spongycastle/asn1/x509/GeneralNames;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 209
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v2

    move v0, v1

    .line 211
    :goto_0
    array-length v3, v2

    if-eq v0, v3, :cond_0

    .line 213
    aget-object v3, v2, v0

    .line 215
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_1

    .line 219
    :try_start_0
    new-instance v4, Lorg/spongycastle/jce/X509Principal;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-interface {v3}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1Primitive;->b()[B

    move-result-object v3

    invoke-direct {v4, v3}, Lorg/spongycastle/jce/X509Principal;-><init>([B)V

    invoke-virtual {v4, p0}, Lorg/spongycastle/jce/X509Principal;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-eqz v3, :cond_1

    .line 222
    const/4 v1, 0x1

    .line 231
    :cond_0
    return v1

    :catch_0
    move-exception v3

    .line 211
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static a([Lorg/spongycastle/asn1/x509/GeneralName;)[Ljava/lang/Object;
    .locals 4

    .prologue
    .line 236
    new-instance v1, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-eq v0, v2, :cond_1

    .line 240
    aget-object v2, p0, v0

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    .line 244
    :try_start_0
    new-instance v2, Ljavax/security/auth/x500/X500Principal;

    aget-object v3, p0, v0

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-interface {v3}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1Primitive;->b()[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 249
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "badly formed Name object"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 254
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/spongycastle/asn1/x509/GeneralNames;)[Ljava/security/Principal;
    .locals 4

    .prologue
    .line 259
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a([Lorg/spongycastle/asn1/x509/GeneralName;)[Ljava/lang/Object;

    move-result-object v1

    .line 260
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 262
    const/4 v0, 0x0

    :goto_0
    array-length v3, v1

    if-eq v0, v3, :cond_1

    .line 264
    aget-object v3, v1, v0

    instance-of v3, v3, Ljava/security/Principal;

    if-eqz v3, :cond_0

    .line 266
    aget-object v3, v1, v0

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 270
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/security/Principal;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/security/Principal;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 413
    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    .line 415
    const/4 v0, 0x0

    .line 418
    :goto_0
    return v0

    :cond_0
    check-cast p1, Ljava/security/cert/Certificate;

    invoke-virtual {p0, p1}, Lorg/spongycastle/x509/AttributeCertificateHolder;->match(Ljava/security/cert/Certificate;)Z

    move-result v0

    goto :goto_0
.end method

.method public final a()[Ljava/security/Principal;
    .locals 1

    .prologue
    .line 282
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->d()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->d()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a(Lorg/spongycastle/asn1/x509/GeneralNames;)[Ljava/security/Principal;

    move-result-object v0

    .line 287
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()[Ljava/security/Principal;
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->c()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->c()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/IssuerSerial;->c()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a(Lorg/spongycastle/asn1/x509/GeneralNames;)[Ljava/security/Principal;

    move-result-object v0

    .line 302
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 314
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->c()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->c()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/IssuerSerial;->d()Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    .line 319
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 324
    new-instance v1, Lorg/spongycastle/x509/AttributeCertificateHolder;

    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Object;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 391
    if-ne p1, p0, :cond_0

    .line 393
    const/4 v0, 0x1

    .line 403
    :goto_0
    return v0

    .line 396
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/x509/AttributeCertificateHolder;

    if-nez v0, :cond_1

    .line 398
    const/4 v0, 0x0

    goto :goto_0

    .line 401
    :cond_1
    check-cast p1, Lorg/spongycastle/x509/AttributeCertificateHolder;

    .line 403
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    iget-object v1, p1, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/Holder;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->hashCode()I

    move-result v0

    return v0
.end method

.method public match(Ljava/security/cert/Certificate;)Z
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 330
    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    move v0, v1

    .line 386
    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    .line 335
    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 339
    :try_start_0
    iget-object v4, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/Holder;->c()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 341
    iget-object v3, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/Holder;->c()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/IssuerSerial;->d()Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v0}, Lorg/spongycastle/jce/PrincipalUtil;->a(Ljava/security/cert/X509Certificate;)Lorg/spongycastle/jce/X509Principal;

    move-result-object v0

    iget-object v3, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/Holder;->c()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/IssuerSerial;->c()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a(Lorg/spongycastle/jce/X509Principal;Lorg/spongycastle/asn1/x509/GeneralNames;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0

    .line 345
    :cond_2
    iget-object v4, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/Holder;->d()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 347
    invoke-static {v0}, Lorg/spongycastle/jce/PrincipalUtil;->b(Ljava/security/cert/X509Certificate;)Lorg/spongycastle/jce/X509Principal;

    move-result-object v0

    iget-object v4, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/Holder;->d()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v4

    invoke-static {v0, v4}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a(Lorg/spongycastle/jce/X509Principal;Lorg/spongycastle/asn1/x509/GeneralNames;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    .line 350
    goto :goto_0

    .line 353
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->e()Lorg/spongycastle/asn1/x509/ObjectDigestInfo;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    if-eqz v0, :cond_7

    .line 355
    :try_start_1
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->e()Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->e()Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->d()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v2, "SC"

    invoke-static {v0, v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .line 365
    :try_start_2
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->e()Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->e()Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->c()Lorg/spongycastle/asn1/DEREnumerated;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DEREnumerated;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    :goto_2
    packed-switch v0, :pswitch_data_0

    .line 375
    :goto_3
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->e()Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateHolder;->a:Lorg/spongycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Holder;->e()Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->e()Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERBitString;->c()[B

    move-result-object v0

    :goto_4
    invoke-static {v2, v0}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    .line 377
    goto/16 :goto_0

    :cond_4
    move-object v0, v3

    .line 355
    goto :goto_1

    .line 363
    :catch_0
    move-exception v0

    move v0, v1

    goto/16 :goto_0

    .line 365
    :cond_5
    const/4 v0, -0x1

    goto :goto_2

    .line 369
    :pswitch_0
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_3

    .line 383
    :catch_1
    move-exception v0

    move v0, v1

    goto/16 :goto_0

    .line 372
    :pswitch_1
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V
    :try_end_2
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :cond_6
    move-object v0, v3

    .line 375
    goto :goto_4

    :cond_7
    move v0, v1

    .line 386
    goto/16 :goto_0

    .line 365
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
