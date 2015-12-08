.class public Lorg/bouncycastle/jce/provider/JDKKeyFactory$GOST3410;
.super Lorg/bouncycastle/jce/provider/JDKKeyFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GOST3410"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;-><init>()V

    return-void
.end method


# virtual methods
.method protected engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    .locals 1

    instance-of v0, p1, Lorg/bouncycastle/jce/spec/GOST3410PrivateKeySpec;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKGOST3410PrivateKey;

    check-cast p1, Lorg/bouncycastle/jce/spec/GOST3410PrivateKeySpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JDKGOST3410PrivateKey;-><init>(Lorg/bouncycastle/jce/spec/GOST3410PrivateKeySpec;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    goto :goto_0
.end method

.method protected engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    .locals 1

    instance-of v0, p1, Lorg/bouncycastle/jce/spec/GOST3410PublicKeySpec;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;

    check-cast p1, Lorg/bouncycastle/jce/spec/GOST3410PublicKeySpec;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;-><init>(Lorg/bouncycastle/jce/spec/GOST3410PublicKeySpec;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    goto :goto_0
.end method
