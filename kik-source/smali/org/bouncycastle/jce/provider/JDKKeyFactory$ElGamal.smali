.class public Lorg/bouncycastle/jce/provider/JDKKeyFactory$ElGamal;
.super Lorg/bouncycastle/jce/provider/JDKKeyFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ElGamal"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyFactory$ElGamal;->a:Z

    return-void
.end method


# virtual methods
.method protected engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    .locals 1

    instance-of v0, p1, Lorg/bouncycastle/jce/spec/ElGamalPrivateKeySpec;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEElGamalPrivateKey;

    check-cast p1, Lorg/bouncycastle/jce/spec/ElGamalPrivateKeySpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEElGamalPrivateKey;-><init>(Lorg/bouncycastle/jce/spec/ElGamalPrivateKeySpec;)V

    :goto_0
    return-object v0

    :cond_0
    instance-of v0, p1, Ljavax/crypto/spec/DHPrivateKeySpec;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEElGamalPrivateKey;

    check-cast p1, Ljavax/crypto/spec/DHPrivateKeySpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEElGamalPrivateKey;-><init>(Ljavax/crypto/spec/DHPrivateKeySpec;)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    goto :goto_0
.end method

.method protected engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    .locals 1

    instance-of v0, p1, Lorg/bouncycastle/jce/spec/ElGamalPublicKeySpec;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;

    check-cast p1, Lorg/bouncycastle/jce/spec/ElGamalPublicKeySpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;-><init>(Lorg/bouncycastle/jce/spec/ElGamalPublicKeySpec;)V

    :goto_0
    return-object v0

    :cond_0
    instance-of v0, p1, Ljavax/crypto/spec/DHPublicKeySpec;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;

    check-cast p1, Ljavax/crypto/spec/DHPublicKeySpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;-><init>(Ljavax/crypto/spec/DHPublicKeySpec;)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    goto :goto_0
.end method
