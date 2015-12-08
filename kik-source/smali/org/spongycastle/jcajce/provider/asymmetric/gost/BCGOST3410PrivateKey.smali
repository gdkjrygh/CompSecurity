.class public Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;
.implements Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private transient b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

.field private transient c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-direct {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 41
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;)V
    .locals 5

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-direct {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 61
    new-instance v1, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->d()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    .line 62
    invoke-virtual {p1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v2

    .line 64
    array-length v0, v2

    new-array v3, v0, [B

    .line 66
    const/4 v0, 0x0

    :goto_0
    array-length v4, v2

    if-eq v0, v4, :cond_0

    .line 68
    array-length v4, v2

    add-int/lit8 v4, v4, -0x1

    sub-int/2addr v4, v0

    aget-byte v4, v2, v4

    aput-byte v4, v3, v0

    .line 66
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 71
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->a:Ljava/math/BigInteger;

    .line 72
    invoke-static {v1}, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;->a(Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;)Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    .line 73
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/crypto/params/GOST3410PrivateKeyParameters;Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;)V
    .locals 2

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-direct {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 79
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/GOST3410PrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->a:Ljava/math/BigInteger;

    .line 80
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    .line 82
    if-nez p2, :cond_0

    .line 84
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "spec is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_0
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;)V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-direct {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 46
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;->c()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->a:Ljava/math/BigInteger;

    .line 47
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;->b()Lorg/spongycastle/jce/interfaces/GOST3410Params;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    .line 48
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;)V
    .locals 5

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-direct {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 53
    invoke-virtual {p1}, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->a()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->a:Ljava/math/BigInteger;

    .line 54
    new-instance v0, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    new-instance v1, Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;

    invoke-virtual {p1}, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->b()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->c()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p1}, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->d()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;-><init>(Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    .line 55
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Enumeration;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v0}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v0, p1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->c:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 199
    return-void
.end method

.method public final b()Lorg/spongycastle/jce/interfaces/GOST3410Params;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    return-object v0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->a:Ljava/math/BigInteger;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 161
    instance-of v2, p1, Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;

    if-nez v2, :cond_1

    .line 168
    :cond_0
    :goto_0
    return v0

    .line 166
    :cond_1
    check-cast p1, Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;

    .line 168
    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->a:Ljava/math/BigInteger;

    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;->c()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v2}, Lorg/spongycastle/jce/interfaces/GOST3410Params;->d()Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;

    move-result-object v2

    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;->b()Lorg/spongycastle/jce/interfaces/GOST3410Params;

    move-result-object v3

    invoke-interface {v3}, Lorg/spongycastle/jce/interfaces/GOST3410Params;->d()Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v2}, Lorg/spongycastle/jce/interfaces/GOST3410Params;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;->b()Lorg/spongycastle/jce/interfaces/GOST3410Params;

    move-result-object v3

    invoke-interface {v3}, Lorg/spongycastle/jce/interfaces/GOST3410Params;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v2}, Lorg/spongycastle/jce/interfaces/GOST3410Params;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/GOST3410PrivateKey;->b()Lorg/spongycastle/jce/interfaces/GOST3410Params;

    move-result-object v3

    invoke-interface {v3}, Lorg/spongycastle/jce/interfaces/GOST3410Params;->c()Ljava/lang/String;

    move-result-object v3

    if-ne v2, v3, :cond_2

    move v2, v1

    :goto_1
    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    move v2, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    const-string v0, "GOST3410"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 112
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v2

    .line 115
    aget-byte v0, v2, v1

    if-nez v0, :cond_0

    .line 117
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [B

    .line 124
    :goto_0
    array-length v3, v0

    if-eq v1, v3, :cond_1

    .line 126
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v1

    aget-byte v3, v2, v3

    aput-byte v3, v0, v1

    .line 124
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 121
    :cond_0
    array-length v0, v2

    new-array v0, v0, [B

    goto :goto_0

    .line 131
    :cond_1
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    instance-of v1, v1, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    if-eqz v1, :cond_2

    .line 133
    new-instance v1, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;

    new-instance v2, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v3, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v4, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    new-instance v5, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iget-object v6, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v6}, Lorg/spongycastle/jce/interfaces/GOST3410Params;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    new-instance v6, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iget-object v7, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v7}, Lorg/spongycastle/jce/interfaces/GOST3410Params;->b()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5, v6}, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v3, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v3, v0}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    move-object v0, v1

    .line 140
    :goto_1
    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 144
    :goto_2
    return-object v0

    .line 137
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;

    new-instance v2, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v3, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    new-instance v3, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v3, v0}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_1

    .line 144
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_2
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    const-string v0, "PKCS#8"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 191
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;->b:Lorg/spongycastle/jce/interfaces/GOST3410Params;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
