.class public Lorg/bouncycastle/jce/provider/JCEStreamCipher$Blowfish_CFB8;
.super Lorg/bouncycastle/jce/provider/JCEStreamCipher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCEStreamCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Blowfish_CFB8"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;

    new-instance v1, Lorg/bouncycastle/crypto/engines/BlowfishEngine;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/engines/BlowfishEngine;-><init>()V

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    const/16 v1, 0x40

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jce/provider/JCEStreamCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    return-void
.end method
