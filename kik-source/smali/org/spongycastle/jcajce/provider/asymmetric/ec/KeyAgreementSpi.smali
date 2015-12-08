.class public Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;
.super Ljavax/crypto/KeyAgreementSpi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQVwithSHA1KDF;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHwithSHA1KDF;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$MQV;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DHC;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi$DH;
    }
.end annotation


# static fields
.field private static final a:Lorg/spongycastle/asn1/x9/X9IntegerConverter;

.field private static final b:Ljava/util/Hashtable;


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/math/BigInteger;

.field private e:Lorg/spongycastle/crypto/params/ECDomainParameters;

.field private f:Lorg/spongycastle/crypto/BasicAgreement;

.field private g:Lorg/spongycastle/crypto/DerivationFunction;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 50
    new-instance v0, Lorg/spongycastle/asn1/x9/X9IntegerConverter;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;-><init>()V

    sput-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a:Lorg/spongycastle/asn1/x9/X9IntegerConverter;

    .line 51
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    .line 55
    new-instance v0, Ljava/lang/Integer;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 56
    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0xc0

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 57
    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x100

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 59
    sget-object v3, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    sget-object v4, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v3, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    sget-object v4, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v3, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    sget-object v4, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v3, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    sget-object v4, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    sget-object v3, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    sget-object v3, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->y:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->bx:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Lorg/spongycastle/crypto/BasicAgreement;Lorg/spongycastle/crypto/DerivationFunction;)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0}, Ljavax/crypto/KeyAgreementSpi;-><init>()V

    .line 85
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->c:Ljava/lang/String;

    .line 86
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->f:Lorg/spongycastle/crypto/BasicAgreement;

    .line 87
    iput-object p3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->g:Lorg/spongycastle/crypto/DerivationFunction;

    .line 88
    return-void
.end method

.method private static a(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 266
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 268
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

    .prologue
    .line 221
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->f:Lorg/spongycastle/crypto/BasicAgreement;

    instance-of v0, v0, Lorg/spongycastle/crypto/agreement/ECMQVBasicAgreement;

    if-eqz v0, :cond_2

    .line 223
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/MQVPrivateKey;

    if-nez v0, :cond_0

    .line 225
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key agreement requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/spongycastle/jce/interfaces/MQVPrivateKey;

    invoke-static {v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a(Ljava/lang/Class;)Ljava/lang/String;

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

    .line 229
    :cond_0
    check-cast p1, Lorg/spongycastle/jce/interfaces/MQVPrivateKey;

    .line 230
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/MQVPrivateKey;->a()Ljava/security/PrivateKey;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    .line 232
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/MQVPrivateKey;->b()Ljava/security/PrivateKey;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    .line 235
    const/4 v2, 0x0

    .line 236
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/MQVPrivateKey;->c()Ljava/security/PublicKey;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 238
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/MQVPrivateKey;->c()Ljava/security/PublicKey;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    .line 242
    :cond_1
    new-instance v3, Lorg/spongycastle/crypto/params/MQVPrivateParameters;

    invoke-direct {v3, v0, v1, v2}, Lorg/spongycastle/crypto/params/MQVPrivateParameters;-><init>(Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;Lorg/spongycastle/crypto/params/ECPublicKeyParameters;)V

    .line 243
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->b()Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->e:Lorg/spongycastle/crypto/params/ECDomainParameters;

    .line 247
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->f:Lorg/spongycastle/crypto/BasicAgreement;

    invoke-interface {v0, v3}, Lorg/spongycastle/crypto/BasicAgreement;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    .line 262
    :goto_0
    return-void

    .line 251
    :cond_2
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    if-nez v0, :cond_3

    .line 253
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key agreement requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    invoke-static {v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a(Ljava/lang/Class;)Ljava/lang/String;

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

    .line 257
    :cond_3
    check-cast p1, Ljava/security/PrivateKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    .line 258
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->b()Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->e:Lorg/spongycastle/crypto/params/ECDomainParameters;

    .line 260
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->f:Lorg/spongycastle/crypto/BasicAgreement;

    invoke-interface {v1, v0}, Lorg/spongycastle/crypto/BasicAgreement;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_0
.end method

.method private a(Ljava/math/BigInteger;)[B
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->e:Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECDomainParameters;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Lorg/spongycastle/math/ec/ECFieldElement;)I

    move-result v0

    invoke-static {p1, v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Ljava/math/BigInteger;I)[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected engineDoPhase(Ljava/security/Key;Z)Ljava/security/Key;
    .locals 3

    .prologue
    .line 95
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->e:Lorg/spongycastle/crypto/params/ECDomainParameters;

    if-nez v0, :cond_0

    .line 97
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not initialised."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_0
    if-nez p2, :cond_1

    .line 102
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " can only be between two parties."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->f:Lorg/spongycastle/crypto/BasicAgreement;

    instance-of v0, v0, Lorg/spongycastle/crypto/agreement/ECMQVBasicAgreement;

    if-eqz v0, :cond_3

    .line 108
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/MQVPublicKey;

    if-nez v0, :cond_2

    .line 110
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key agreement requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/spongycastle/jce/interfaces/MQVPublicKey;

    invoke-static {v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a(Ljava/lang/Class;)Ljava/lang/String;

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

    .line 114
    :cond_2
    check-cast p1, Lorg/spongycastle/jce/interfaces/MQVPublicKey;

    .line 115
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/MQVPublicKey;->a()Ljava/security/PublicKey;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    .line 117
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/MQVPublicKey;->b()Ljava/security/PublicKey;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    .line 120
    new-instance v2, Lorg/spongycastle/crypto/params/MQVPublicParameters;

    invoke-direct {v2, v0, v1}, Lorg/spongycastle/crypto/params/MQVPublicParameters;-><init>(Lorg/spongycastle/crypto/params/ECPublicKeyParameters;Lorg/spongycastle/crypto/params/ECPublicKeyParameters;)V

    move-object v0, v2

    .line 137
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->f:Lorg/spongycastle/crypto/BasicAgreement;

    invoke-interface {v1, v0}, Lorg/spongycastle/crypto/BasicAgreement;->b(Lorg/spongycastle/crypto/CipherParameters;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    .line 139
    const/4 v0, 0x0

    return-object v0

    .line 126
    :cond_3
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    if-nez v0, :cond_4

    .line 128
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key agreement requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    invoke-static {v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a(Ljava/lang/Class;)Ljava/lang/String;

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

    .line 132
    :cond_4
    check-cast p1, Ljava/security/PublicKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0
.end method

.method protected engineGenerateSecret([BI)I
    .locals 4

    .prologue
    .line 159
    invoke-virtual {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->engineGenerateSecret()[B

    move-result-object v0

    .line 161
    array-length v1, p1

    sub-int/2addr v1, p2

    array-length v2, v0

    if-ge v1, v2, :cond_0

    .line 163
    new-instance v1, Ljavax/crypto/ShortBufferException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->c:Ljava/lang/String;

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

    .line 166
    :cond_0
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 168
    array-length v0, v0

    return v0
.end method

.method protected engineGenerateSecret(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 4

    .prologue
    .line 175
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a(Ljava/math/BigInteger;)[B

    move-result-object v1

    .line 177
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->g:Lorg/spongycastle/crypto/DerivationFunction;

    if-eqz v0, :cond_1

    .line 179
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 181
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

    .line 184
    :cond_0
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 186
    new-instance v2, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;

    new-instance v3, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-direct {v3, p1}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3, v0, v1}, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;-><init>(Lorg/spongycastle/asn1/DERObjectIdentifier;I[B)V

    .line 188
    div-int/lit8 v0, v0, 0x8

    new-array v0, v0, [B

    .line 189
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->g:Lorg/spongycastle/crypto/DerivationFunction;

    invoke-interface {v1, v2}, Lorg/spongycastle/crypto/DerivationFunction;->a(Lorg/spongycastle/crypto/DerivationParameters;)V

    .line 190
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->g:Lorg/spongycastle/crypto/DerivationFunction;

    const/4 v2, 0x0

    array-length v3, v0

    invoke-interface {v1, v0, v2, v3}, Lorg/spongycastle/crypto/DerivationFunction;->a([BII)I

    .line 198
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

    .prologue
    .line 145
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->g:Lorg/spongycastle/crypto/DerivationFunction;

    if-eqz v0, :cond_0

    .line 147
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "KDF can only be used when algorithm is known"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 151
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0
.end method

.method protected engineInit(Ljava/security/Key;Ljava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 215
    invoke-direct {p0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a(Ljava/security/Key;)V

    .line 216
    return-void
.end method

.method protected engineInit(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 207
    invoke-direct {p0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyAgreementSpi;->a(Ljava/security/Key;)V

    .line 208
    return-void
.end method
