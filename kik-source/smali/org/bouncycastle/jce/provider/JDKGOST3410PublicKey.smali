.class public Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/jce/interfaces/GOST3410PublicKey;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;


# direct methods
.method constructor <init>(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    :try_start_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DEROctetString;->f()[B

    move-result-object v2

    array-length v0, v2

    new-array v3, v0, [B

    const/4 v0, 0x0

    :goto_0
    array-length v4, v2

    if-eq v0, v4, :cond_0

    array-length v4, v2

    add-int/lit8 v4, v4, -0x1

    sub-int/2addr v4, v0

    aget-byte v4, v2, v4

    aput-byte v4, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v1}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;->a(Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;)Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid info structure in GOST3410 public key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method constructor <init>(Lorg/bouncycastle/crypto/params/GOST3410PublicKeyParameters;Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/GOST3410PublicKeyParameters;->getY()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/jce/spec/GOST3410PublicKeySpec;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeySpec;->a()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;

    new-instance v0, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    new-instance v1, Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeySpec;->b()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeySpec;->c()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeySpec;->d()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;-><init>(Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    return-void
.end method


# virtual methods
.method public final a()Lorg/bouncycastle/jce/interfaces/GOST3410Params;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    return-object v0
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;

    if-eqz v1, :cond_0

    check-cast p1, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;

    iget-object v2, p1, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    iget-object v2, p1, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "GOST3410"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 9

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v2

    aget-byte v0, v2, v1

    if-nez v0, :cond_0

    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [B

    :goto_0
    array-length v3, v0

    if-eq v1, v3, :cond_1

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v1

    aget-byte v3, v2, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    array-length v0, v2

    new-array v0, v0, [B

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    instance-of v1, v1, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v1}, Lorg/bouncycastle/jce/interfaces/GOST3410Params;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v1, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    new-instance v2, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v3, Lorg/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v4, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    new-instance v5, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v6, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v6}, Lorg/bouncycastle/jce/interfaces/GOST3410Params;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    new-instance v6, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v7, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v7}, Lorg/bouncycastle/jce/interfaces/GOST3410Params;->b()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    new-instance v7, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v8, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v8}, Lorg/bouncycastle/jce/interfaces/GOST3410Params;->c()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5, v6, v7}, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v3, v0}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    move-object v0, v1

    :goto_1
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->b()[B

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v1, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    new-instance v2, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v3, Lorg/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v4, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    new-instance v5, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v6, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v6}, Lorg/bouncycastle/jce/interfaces/GOST3410Params;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    new-instance v6, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v7, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    invoke-interface {v7}, Lorg/bouncycastle/jce/interfaces/GOST3410Params;->b()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5, v6}, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v3, v0}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    move-object v0, v1

    goto :goto_1

    :cond_3
    new-instance v1, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    new-instance v2, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v3, Lorg/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    new-instance v3, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v3, v0}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    move-object v0, v1

    goto :goto_1
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "X.509"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->b:Lorg/bouncycastle/jce/interfaces/GOST3410Params;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "line.separator"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "GOST3410 Public Key"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "            y: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;->a:Ljava/math/BigInteger;

    const/16 v4, 0x10

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
