.class public Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;
.super Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EC"
.end annotation


# static fields
.field private static i:Ljava/util/Hashtable;


# instance fields
.field a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

.field b:Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

.field c:Ljava/lang/Object;

.field d:I

.field e:I

.field f:Ljava/security/SecureRandom;

.field g:Z

.field h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->i:Ljava/util/Hashtable;

    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0xc0

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    const-string v3, "prime192v1"

    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->i:Ljava/util/Hashtable;

    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0xef

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    const-string v3, "prime239v1"

    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->i:Ljava/util/Hashtable;

    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0x100

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    const-string v3, "prime256v1"

    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->i:Ljava/util/Hashtable;

    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0xe0

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    const-string v3, "P-224"

    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->i:Ljava/util/Hashtable;

    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0x180

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    const-string v3, "P-384"

    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->i:Ljava/util/Hashtable;

    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0x209

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    const-string v3, "P-521"

    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "EC"

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->b:Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    const/16 v0, 0xef

    iput v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->d:I

    const/16 v0, 0x32

    iput v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->e:I

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->f:Ljava/security/SecureRandom;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->g:Z

    const-string v0, "EC"

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->b:Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    const/16 v0, 0xef

    iput v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->d:I

    const/16 v0, 0x32

    iput v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->e:I

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->f:Ljava/security/SecureRandom;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->g:Z

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 6

    iget-boolean v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->g:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "EC Key Pair Generator not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->b:Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    instance-of v2, v2, Lorg/bouncycastle/jce/spec/ECParameterSpec;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    check-cast v2, Lorg/bouncycastle/jce/spec/ECParameterSpec;

    new-instance v3, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    invoke-direct {v3, v4, v0, v2}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Lorg/bouncycastle/jce/spec/ECParameterSpec;)V

    new-instance v0, Ljava/security/KeyPair;

    new-instance v4, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    iget-object v5, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    invoke-direct {v4, v5, v1, v3, v2}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/jce/provider/JCEECPublicKey;Lorg/bouncycastle/jce/spec/ECParameterSpec;)V

    invoke-direct {v0, v3, v4}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    :goto_0
    return-object v0

    :cond_1
    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    if-nez v2, :cond_2

    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    invoke-direct {v0, v4, v1}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;)V

    invoke-direct {v2, v3, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    move-object v0, v2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    check-cast v2, Ljava/security/spec/ECParameterSpec;

    new-instance v3, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    invoke-direct {v3, v4, v0, v2}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Ljava/security/spec/ECParameterSpec;)V

    new-instance v0, Ljava/security/KeyPair;

    new-instance v4, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;

    iget-object v5, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    invoke-direct {v4, v5, v1, v3, v2}, Lorg/bouncycastle/jce/provider/JCEECPrivateKey;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/jce/provider/JCEECPublicKey;Ljava/security/spec/ECParameterSpec;)V

    invoke-direct {v0, v3, v4}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    goto :goto_0
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 2

    iput p1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->d:I

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->f:Ljava/security/SecureRandom;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->i:Ljava/util/Hashtable;

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    check-cast v0, Ljava/security/spec/ECGenParameterSpec;

    invoke-virtual {p0, v0, p2}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "key size not configurable."

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "unknown key size."

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v8, 0x1

    instance-of v0, p1, Lorg/bouncycastle/jce/spec/ECParameterSpec;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/jce/spec/ECParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    new-instance v1, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    new-instance v2, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;)V

    invoke-direct {v1, v2, p2}, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;-><init>(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->b:Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    iput-boolean v8, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->g:Z

    :goto_0
    return-void

    :cond_0
    instance-of v0, p1, Ljava/security/spec/ECParameterSpec;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/security/spec/ECParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;)Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-static {v1, v2, v7}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;Ljava/security/spec/ECPoint;Z)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    new-instance v3, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    new-instance v4, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v0

    int-to-long v6, v0

    invoke-static {v6, v7}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v4, v1, v2, v5, v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v3, v4, p2}, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;-><init>(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->b:Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    iput-boolean v8, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->g:Z

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/security/spec/ECGenParameterSpec;

    if-eqz v0, :cond_a

    check-cast p1, Ljava/security/spec/ECGenParameterSpec;

    invoke-virtual {p1}, Ljava/security/spec/ECGenParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->h:Ljava/lang/String;

    const-string v2, "ECGOST3410"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v1}, Lorg/bouncycastle/asn1/cryptopro/ECGOST3410NamedCurves;->a(Ljava/lang/String;)Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v6

    if-nez v6, :cond_2

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown curve name: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v2

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getN()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getH()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getSeed()[B

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;-><init>(Ljava/lang/String;Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    :goto_1
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    check-cast v0, Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;)Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-static {v1, v2, v7}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Lorg/bouncycastle/math/ec/ECCurve;Ljava/security/spec/ECPoint;Z)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    new-instance v3, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    new-instance v4, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v0

    int-to-long v6, v0

    invoke-static {v6, v7}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v4, v1, v2, v5, v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v3, v4, p2}, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;-><init>(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->b:Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    iput-boolean v8, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->g:Z

    goto/16 :goto_0

    :cond_3
    invoke-static {v1}, Lorg/bouncycastle/asn1/x9/X962NamedCurves;->a(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_d

    invoke-static {v1}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->a(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {v1}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :cond_4
    if-nez v0, :cond_5

    invoke-static {v1}, Lorg/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves;->a(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :cond_5
    if-nez v0, :cond_d

    :try_start_0
    new-instance v2, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lorg/bouncycastle/asn1/x9/X962NamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-static {v2}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :cond_6
    if-nez v0, :cond_7

    invoke-static {v2}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :cond_7
    if-nez v0, :cond_8

    invoke-static {v2}, Lorg/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :cond_8
    if-nez v0, :cond_9

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown curve OID: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown curve name: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move-object v5, v0

    :goto_2
    new-instance v0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->e()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v2

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->f()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->g()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->h()Ljava/math/BigInteger;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;-><init>(Ljava/lang/String;Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_a
    if-nez p1, :cond_b

    invoke-static {}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->c:Ljava/lang/Object;

    new-instance v1, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    new-instance v2, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v3

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;)V

    invoke-direct {v1, v2, p2}, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;-><init>(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->b:Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->a:Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    iput-boolean v8, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;->g:Z

    goto/16 :goto_0

    :cond_b
    if-nez p1, :cond_c

    invoke-static {}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    if-nez v0, :cond_c

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "null parameter passed but no implicitCA set"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "parameter object not a ECParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move-object v5, v0

    goto :goto_2
.end method
