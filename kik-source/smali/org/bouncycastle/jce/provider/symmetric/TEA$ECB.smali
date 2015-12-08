.class public Lorg/bouncycastle/jce/provider/symmetric/TEA$ECB;
.super Lorg/bouncycastle/jce/provider/JCEBlockCipher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/TEA;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ECB"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/engines/TEAEngine;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/TEAEngine;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    return-void
.end method
