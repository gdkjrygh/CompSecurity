.class public Lorg/bouncycastle/crypto/params/MQVPrivateParameters;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/CipherParameters;


# instance fields
.field private a:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

.field private b:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

.field private c:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;-><init>(Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;->a:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    iput-object p2, p0, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;->b:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    iput-object p3, p0, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;->c:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    return-void
.end method


# virtual methods
.method public getEphemeralPrivateKey()Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;->b:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    return-object v0
.end method

.method public getEphemeralPublicKey()Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;->c:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    return-object v0
.end method

.method public getStaticPrivateKey()Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/MQVPrivateParameters;->a:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    return-object v0
.end method
