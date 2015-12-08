.class public Lorg/bouncycastle/jce/provider/JCEElGamalCipher$NoPadding;
.super Lorg/bouncycastle/jce/provider/JCEElGamalCipher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCEElGamalCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NoPadding"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/engines/ElGamalEngine;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/ElGamalEngine;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JCEElGamalCipher;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    return-void
.end method
