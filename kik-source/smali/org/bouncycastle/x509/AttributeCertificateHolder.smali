.class public Lorg/bouncycastle/x509/AttributeCertificateHolder;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/cert/CertSelector;
.implements Lorg/bouncycastle/util/Selector;


# instance fields
.field final a:Lorg/bouncycastle/asn1/x509/Holder;


# direct methods
.method constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/Holder;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Holder;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    return-void
.end method

.method private static a(Lorg/bouncycastle/jce/X509Principal;Lorg/bouncycastle/asn1/x509/GeneralNames;)Z
    .locals 6

    const/4 v2, 0x0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v3

    move v1, v2

    :goto_0
    array-length v0, v3

    if-eq v1, v0, :cond_0

    aget-object v0, v3, v1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/GeneralName;->e()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_1

    :try_start_0
    new-instance v4, Lorg/bouncycastle/jce/X509Principal;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/GeneralName;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Encodable;->a()[B

    move-result-object v0

    invoke-direct {v4, v0}, Lorg/bouncycastle/jce/X509Principal;-><init>([B)V

    invoke-virtual {v4, p0}, Lorg/bouncycastle/jce/X509Principal;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    :cond_0
    return v2

    :catch_0
    move-exception v0

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method private static a([Lorg/bouncycastle/asn1/x509/GeneralName;)[Ljava/lang/Object;
    .locals 4

    new-instance v2, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, p0

    if-eq v1, v0, :cond_1

    aget-object v0, p0, v1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/GeneralName;->e()I

    move-result v0

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    :try_start_0
    new-instance v3, Ljavax/security/auth/x500/X500Principal;

    aget-object v0, p0, v1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/GeneralName;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Encodable;->a()[B

    move-result-object v0

    invoke-direct {v3, v0}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "badly formed Name object"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/bouncycastle/asn1/x509/GeneralNames;)[Ljava/security/Principal;
    .locals 4

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a([Lorg/bouncycastle/asn1/x509/GeneralName;)[Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    array-length v3, v1

    if-eq v0, v3, :cond_1

    aget-object v3, v1, v0

    instance-of v3, v3, Ljava/security/Principal;

    if-eqz v3, :cond_0

    aget-object v3, v1, v0

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

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

    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    check-cast p1, Ljava/security/cert/Certificate;

    invoke-virtual {p0, p1}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->match(Ljava/security/cert/Certificate;)Z

    move-result v0

    goto :goto_0
.end method

.method public final a()[Ljava/security/Principal;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->f()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->f()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a(Lorg/bouncycastle/asn1/x509/GeneralNames;)[Ljava/security/Principal;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()[Ljava/security/Principal;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->e()Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->e()Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/IssuerSerial;->e()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a(Lorg/bouncycastle/asn1/x509/GeneralNames;)[Ljava/security/Principal;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->e()Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->e()Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/IssuerSerial;->f()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    new-instance v1, Lorg/bouncycastle/x509/AttributeCertificateHolder;

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/x509/AttributeCertificateHolder;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    check-cast p1, Lorg/bouncycastle/x509/AttributeCertificateHolder;

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    iget-object v1, p1, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/x509/Holder;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->hashCode()I

    move-result v0

    return v0
.end method

.method public match(Ljava/security/cert/Certificate;)Z
    .locals 5

    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    iget-object v4, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x509/Holder;->e()Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v3, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/Holder;->e()Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/IssuerSerial;->f()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v0}, Lorg/bouncycastle/jce/PrincipalUtil;->a(Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/jce/X509Principal;

    move-result-object v0

    iget-object v3, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/Holder;->e()Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/IssuerSerial;->e()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a(Lorg/bouncycastle/jce/X509Principal;Lorg/bouncycastle/asn1/x509/GeneralNames;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    iget-object v4, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x509/Holder;->f()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v0}, Lorg/bouncycastle/jce/PrincipalUtil;->b(Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/jce/X509Principal;

    move-result-object v0

    iget-object v4, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x509/Holder;->f()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v4

    invoke-static {v0, v4}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a(Lorg/bouncycastle/jce/X509Principal;Lorg/bouncycastle/asn1/x509/GeneralNames;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->g()Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    if-eqz v0, :cond_7

    :try_start_1
    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->g()Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->g()Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;->f()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v2, "BC"

    invoke-static {v0, v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    :try_start_2
    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->g()Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->g()Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;->e()Lorg/bouncycastle/asn1/DEREnumerated;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DEREnumerated;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    :goto_2
    packed-switch v0, :pswitch_data_0

    :goto_3
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->g()Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a:Lorg/bouncycastle/asn1/x509/Holder;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Holder;->g()Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;->g()Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERBitString;->e()[B

    move-result-object v0

    :goto_4
    invoke-static {v2, v0}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    goto/16 :goto_0

    :cond_4
    move-object v0, v3

    goto :goto_1

    :catch_0
    move-exception v0

    move v0, v1

    goto/16 :goto_0

    :cond_5
    const/4 v0, -0x1

    goto :goto_2

    :pswitch_0
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_3

    :catch_1
    move-exception v0

    move v0, v1

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V
    :try_end_2
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :cond_6
    move-object v0, v3

    goto :goto_4

    :cond_7
    move v0, v1

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
