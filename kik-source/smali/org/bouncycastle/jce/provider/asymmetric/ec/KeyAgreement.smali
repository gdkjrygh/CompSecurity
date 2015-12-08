.class public Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;
.super Ljavax/crypto/KeyAgreementSpi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement$DH;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement$DHC;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement$DHwithSHA1KDF;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement$MQV;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement$MQVwithSHA1KDF;
    }
.end annotation


# static fields
.field private static final a:Lorg/bouncycastle/asn1/x9/X9IntegerConverter;

.field private static final b:Ljava/util/Hashtable;


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/math/BigInteger;

.field private e:Lorg/bouncycastle/crypto/params/ECDomainParameters;

.field private f:Lorg/bouncycastle/crypto/BasicAgreement;

.field private g:Lorg/bouncycastle/crypto/DerivationFunction;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lorg/bouncycastle/asn1/x9/X9IntegerConverter;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/x9/X9IntegerConverter;-><init>()V

    sput-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a:Lorg/bouncycastle/asn1/x9/X9IntegerConverter;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    new-instance v0, Ljava/lang/Integer;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0xc0

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x100

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    sget-object v3, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    sget-object v4, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    sget-object v4, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    sget-object v4, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    sget-object v4, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    sget-object v3, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->r:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    sget-object v3, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->y:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bw:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Lorg/bouncycastle/crypto/BasicAgreement;Lorg/bouncycastle/crypto/DerivationFunction;)V
    .locals 0

    invoke-direct {p0}, Ljavax/crypto/KeyAgreementSpi;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->c:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->f:Lorg/bouncycastle/crypto/BasicAgreement;

    iput-object p3, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->g:Lorg/bouncycastle/crypto/DerivationFunction;

    return-void
.end method

.method private static a(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/security/Key;)V
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->f:Lorg/bouncycastle/crypto/BasicAgreement;

    instance-of v0, v0, Lorg/bouncycastle/crypto/agreement/ECMQVBasicAgreement;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lorg/bouncycastle/jce/interfaces/MQVPrivateKey;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key agreement requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/bouncycastle/jce/interfaces/MQVPrivateKey;

    invoke-static {v2}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for initialisation"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Lorg/bouncycastle/jce/interfaces/MQVPrivateKey;

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/MQVPrivateKey;->a()Ljava/security/PrivateKey;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/MQVPrivateKey;->b()Ljava/security/PrivateKey;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    const/4 v2, 0x0

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/MQVPrivateKey;->c()Ljava/security/PublicKey;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/MQVPrivateKey;->c()Ljava/security/PublicKey;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    :cond_1
    new-instance v3, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;

    invoke-direct {v3, v0, v1, v2}, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;-><init>(Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->e:Lorg/bouncycastle/crypto/params/ECDomainParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->f:Lorg/bouncycastle/crypto/BasicAgreement;

    invoke-interface {v0, v3}, Lorg/bouncycastle/crypto/BasicAgreement;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    :goto_0
    return-void

    :cond_2
    instance-of v0, p1, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;

    if-nez v0, :cond_3

    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key agreement requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;

    invoke-static {v2}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for initialisation"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    check-cast p1, Ljava/security/PrivateKey;

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->e:Lorg/bouncycastle/crypto/params/ECDomainParameters;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->f:Lorg/bouncycastle/crypto/BasicAgreement;

    invoke-interface {v1, v0}, Lorg/bouncycastle/crypto/BasicAgreement;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    goto :goto_0
.end method

.method private a(Ljava/math/BigInteger;)[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->e:Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECPoint;->b()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x9/X9IntegerConverter;->a(Lorg/bouncycastle/math/ec/ECFieldElement;)I

    move-result v0

    invoke-static {p1, v0}, Lorg/bouncycastle/asn1/x9/X9IntegerConverter;->a(Ljava/math/BigInteger;I)[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected engineDoPhase(Ljava/security/Key;Z)Ljava/security/Key;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->e:Lorg/bouncycastle/crypto/params/ECDomainParameters;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not initialised."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " can only be between two parties."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->f:Lorg/bouncycastle/crypto/BasicAgreement;

    instance-of v0, v0, Lorg/bouncycastle/crypto/agreement/ECMQVBasicAgreement;

    if-eqz v0, :cond_3

    instance-of v0, p1, Lorg/bouncycastle/jce/interfaces/MQVPublicKey;

    if-nez v0, :cond_2

    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key agreement requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/bouncycastle/jce/interfaces/MQVPublicKey;

    invoke-static {v2}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for doPhase"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    check-cast p1, Lorg/bouncycastle/jce/interfaces/MQVPublicKey;

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/MQVPublicKey;->a()Ljava/security/PublicKey;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-interface {p1}, Lorg/bouncycastle/jce/interfaces/MQVPublicKey;->b()Ljava/security/PublicKey;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    new-instance v2, Lorg/bouncycastle/crypto/params/MQVPublicParameters;

    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/crypto/params/MQVPublicParameters;-><init>(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V

    move-object v0, v2

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->f:Lorg/bouncycastle/crypto/BasicAgreement;

    invoke-interface {v1, v0}, Lorg/bouncycastle/crypto/BasicAgreement;->calculateAgreement(Lorg/bouncycastle/crypto/CipherParameters;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->d:Ljava/math/BigInteger;

    const/4 v0, 0x0

    return-object v0

    :cond_3
    instance-of v0, p1, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    if-nez v0, :cond_4

    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key agreement requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    invoke-static {v2}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for doPhase"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    check-cast p1, Ljava/security/PublicKey;

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0
.end method

.method protected engineGenerateSecret([BI)I
    .locals 4

    invoke-virtual {p0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->engineGenerateSecret()[B

    move-result-object v0

    array-length v1, p1

    sub-int/2addr v1, p2

    array-length v2, v0

    if-ge v1, v2, :cond_0

    new-instance v1, Ljavax/crypto/ShortBufferException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " key agreement: need "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " bytes"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v0

    return v0
.end method

.method protected engineGenerateSecret(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->d:Ljava/math/BigInteger;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a(Ljava/math/BigInteger;)[B

    move-result-object v1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->g:Lorg/bouncycastle/crypto/DerivationFunction;

    if-eqz v0, :cond_1

    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown algorithm encountered: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget-object v0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v2, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;

    new-instance v3, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-direct {v3, p1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3, v0, v1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;I[B)V

    div-int/lit8 v0, v0, 0x8

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->g:Lorg/bouncycastle/crypto/DerivationFunction;

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->g:Lorg/bouncycastle/crypto/DerivationFunction;

    const/4 v2, 0x0

    array-length v3, v0

    invoke-interface {v1, v0, v2, v3}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    :goto_0
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v1, v0, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v1

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method protected engineGenerateSecret()[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->g:Lorg/bouncycastle/crypto/DerivationFunction;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "KDF can only be used when algorithm is known"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->d:Ljava/math/BigInteger;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0
.end method

.method protected engineInit(Ljava/security/Key;Ljava/security/SecureRandom;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a(Ljava/security/Key;)V

    return-void
.end method

.method protected engineInit(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;->a(Ljava/security/Key;)V

    return-void
.end method
