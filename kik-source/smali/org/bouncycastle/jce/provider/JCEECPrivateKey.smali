.class public Lorg/bouncycastle/jce/provider/JCEECPrivateKey;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/interfaces/ECPrivateKey;
.implements Lorg/bouncycastle/jce/interfaces/ECPointEncoder;
.implements Lorg/bouncycastle/jce/interfaces/ECPrivateKey;
.implements Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/math/BigInteger;

.field private c:Ljava/security/spec/ECParameterSpec;

.field private d:Z

.field private e:Lorg/bouncycastle/asn1/DERBitString;

.field private f:Lorg/bouncycastle/jce/provider/e;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/security/spec/ECPrivateKeySpec;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/security/spec/ECPrivateKeySpec;->getS()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    invoke-virtual {p2}, Ljava/security/spec/ECPrivateKeySpec;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;->getD()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/jce/provider/JCEECPublicKey;Ljava/security/spec/ECParameterSpec;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;->getD()Ljava/math/BigInteger;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    if-nez p4, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getSeed()[B

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v1

    new-instance v2, Ljava/security/spec/ECParameterSpec;

    new-instance v3, Ljava/security/spec/ECPoint;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECPoint;->b()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/math/ec/ECPoint;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getN()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getH()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-direct {v2, v1, v3, v4, v0}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    iput-object v2, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    :goto_0
    invoke-static {p3}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a(Lorg/bouncycastle/jce/provider/JCEECPublicKey;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->e:Lorg/bouncycastle/asn1/DERBitString;

    return-void

    :cond_0
    iput-object p4, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/jce/provider/JCEECPublicKey;Lorg/bouncycastle/jce/spec/ECParameterSpec;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;->getD()Ljava/math/BigInteger;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    if-nez p4, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getSeed()[B

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v1

    new-instance v2, Ljava/security/spec/ECParameterSpec;

    new-instance v3, Ljava/security/spec/ECPoint;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECPoint;->b()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/math/ec/ECPoint;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getN()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getH()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-direct {v2, v1, v3, v4, v0}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    iput-object v2, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    :goto_0
    invoke-static {p3}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a(Lorg/bouncycastle/jce/provider/JCEECPublicKey;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->e:Lorg/bouncycastle/asn1/DERBitString;

    return-void

    :cond_0
    invoke-virtual {p4}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v0

    new-instance v1, Ljava/security/spec/ECParameterSpec;

    new-instance v2, Ljava/security/spec/ECPoint;

    invoke-virtual {p4}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECPoint;->b()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p4}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECPoint;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {p4}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p4}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->intValue()I

    move-result v4

    invoke-direct {v1, v0, v2, v3, v4}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/jce/provider/JCEECPrivateKey;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    iget-boolean v0, p2, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->d:Z

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->d:Z

    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->e:Lorg/bouncycastle/asn1/DERBitString;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->e:Lorg/bouncycastle/asn1/DERBitString;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/jce/spec/ECPrivateKeySpec;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lorg/bouncycastle/jce/spec/ECPrivateKeySpec;->b()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    invoke-virtual {p2}, Lorg/bouncycastle/jce/spec/ECPrivateKeySpec;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lorg/bouncycastle/jce/spec/ECPrivateKeySpec;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-virtual {p2}, Lorg/bouncycastle/jce/spec/ECPrivateKeySpec;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;Lorg/bouncycastle/jce/spec/ECParameterSpec;)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    goto :goto_0
.end method

.method public constructor <init>(Ljava/security/interfaces/ECPrivateKey;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    new-instance v0, Lorg/bouncycastle/jce/provider/e;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/e;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    new-instance v1, Lorg/bouncycastle/asn1/x9/X962Parameters;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObject;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/DERObject;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {v1}, Lorg/bouncycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getSeed()[B

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v2

    new-instance v0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    invoke-static {v1}, Lorg/bouncycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/security/spec/ECPoint;

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECPoint;->b()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/math/ec/ECPoint;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v6

    invoke-direct {v3, v4, v6}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getN()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getH()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;-><init>(Ljava/lang/String;Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    :goto_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    instance-of v0, v0, Lorg/bouncycastle/asn1/DERInteger;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    :goto_1
    return-void

    :cond_0
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->e()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->i()[B

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v2

    new-instance v0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/security/spec/ECPoint;

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->f()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECPoint;->b()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->f()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/math/ec/ECPoint;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v6

    invoke-direct {v3, v4, v6}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->g()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->h()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;-><init>(Ljava/lang/String;Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    goto :goto_0

    :cond_2
    new-instance v2, Lorg/bouncycastle/asn1/x9/X9ECParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->e()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->i()[B

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v0

    new-instance v1, Ljava/security/spec/ECParameterSpec;

    new-instance v3, Ljava/security/spec/ECPoint;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->f()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECPoint;->b()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->f()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/math/ec/ECPoint;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->g()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->h()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-direct {v1, v0, v3, v4, v2}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    goto/16 :goto_0

    :cond_3
    new-instance v1, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;->e()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;->f()Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->e:Lorg/bouncycastle/asn1/DERBitString;

    goto/16 :goto_1
.end method

.method private static a(Lorg/bouncycastle/jce/provider/JCEECPublicKey;)Lorg/bouncycastle/asn1/DERBitString;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->g()Lorg/bouncycastle/asn1/DERBitString;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()Lorg/bouncycastle/jce/spec/ECParameterSpec;
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    iget-boolean v1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->d:Z

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/e;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lorg/bouncycastle/jce/spec/ECParameterSpec;
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    iget-boolean v1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->d:Z

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/jce/provider/e;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    return-void
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final c()Ljava/util/Enumeration;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->f:Lorg/bouncycastle/jce/provider/e;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/e;->c()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    iget-object v2, p1, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->d()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {p1}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->d()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getEncoded()[B
    .locals 6

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    instance-of v0, v0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    check-cast v0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    check-cast v0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/x9/X962Parameters;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    move-object v0, v1

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->e:Lorg/bouncycastle/asn1/DERBitString;

    if-eqz v1, :cond_3

    new-instance v1, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;

    invoke-virtual {p0}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v2

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->e:Lorg/bouncycastle/asn1/DERBitString;

    invoke-direct {v1, v2, v3, v0}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/asn1/DERBitString;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    :goto_1
    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    const-string v3, "ECGOST3410"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    new-instance v3, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->d:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DERObject;)V

    move-object v0, v2

    :goto_2
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->b()[B

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    if-nez v0, :cond_2

    new-instance v0, Lorg/bouncycastle/asn1/x9/X962Parameters;

    sget-object v1, Lorg/bouncycastle/asn1/DERNull;->b:Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/DERObject;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;)Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    new-instance v0, Lorg/bouncycastle/asn1/x9/X9ECParameters;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v2

    iget-boolean v3, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->d:Z

    invoke-static {v1, v2, v3}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;Ljava/security/spec/ECPoint;Z)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v3

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v4}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v4

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v5}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v5

    invoke-virtual {v5}, Ljava/security/spec/EllipticCurve;->getSeed()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    new-instance v1, Lorg/bouncycastle/asn1/x9/X962Parameters;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/x9/X9ECParameters;)V

    move-object v0, v1

    goto :goto_0

    :cond_3
    new-instance v1, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;

    invoke-virtual {p0}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_1

    :cond_4
    new-instance v2, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    new-instance v3, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DERObject;)V

    move-object v0, v2

    goto :goto_2
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "PKCS#8"

    return-object v0
.end method

.method public getParams()Ljava/security/spec/ECParameterSpec;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public getS()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->d()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->hashCode()I

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

    const-string v2, "EC Private Key"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "             S: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

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
