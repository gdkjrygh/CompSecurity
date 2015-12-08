.class public Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;
.super Ljava/lang/Object;

# interfaces
.implements Ljavax/crypto/interfaces/DHPublicKey;
.implements Lorg/bouncycastle/jce/interfaces/ElGamalPublicKey;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;


# direct methods
.method constructor <init>(Ljavax/crypto/interfaces/DHPublicKey;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->a:Ljava/math/BigInteger;

    new-instance v0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v2

    invoke-virtual {v2}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    return-void
.end method

.method constructor <init>(Ljavax/crypto/spec/DHPublicKeySpec;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljavax/crypto/spec/DHPublicKeySpec;->getY()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->a:Ljava/math/BigInteger;

    new-instance v0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-virtual {p1}, Ljavax/crypto/spec/DHPublicKeySpec;->getP()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1}, Ljavax/crypto/spec/DHPublicKeySpec;->getG()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    :try_start_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->a:Ljava/math/BigInteger;

    new-instance v0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;->f()Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid info structure in DSA public key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method constructor <init>(Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;->getY()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->a:Ljava/math/BigInteger;

    new-instance v0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/ElGamalParameters;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/ElGamalParameters;->getP()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/ElGamalParameters;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/ElGamalParameters;->getG()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/jce/interfaces/ElGamalPublicKey;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/ElGamalPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->a:Ljava/math/BigInteger;

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/ElGamalPublicKey;->a()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/jce/spec/ElGamalPublicKeySpec;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ElGamalPublicKeySpec;->b()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->a:Ljava/math/BigInteger;

    new-instance v0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ElGamalPublicKeySpec;->a()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->a()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ElGamalPublicKeySpec;->a()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->b()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    return-void
.end method


# virtual methods
.method public final a()Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    return-object v0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "ElGamal"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 6

    new-instance v0, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    new-instance v1, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v2, Lorg/bouncycastle/asn1/oiw/OIWObjectIdentifiers;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v3, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-virtual {v4}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->a()Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->b()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/DERInteger;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->a:Ljava/math/BigInteger;

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->b()[B

    move-result-object v0

    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "X.509"

    return-object v0
.end method

.method public getParams()Ljavax/crypto/spec/DHParameterSpec;
    .locals 3

    new-instance v0, Ljavax/crypto/spec/DHParameterSpec;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->a()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->b:Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->b()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/DHParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public getY()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;->a:Ljava/math/BigInteger;

    return-object v0
.end method
