.class public Lorg/bouncycastle/jce/provider/symmetric/AES$OFB;
.super Lorg/bouncycastle/jce/provider/JCEBlockCipher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/AES;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OFB"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 4

    new-instance v0, Lorg/bouncycastle/crypto/BufferedBlockCipher;

    new-instance v1, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/engines/AESFastEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/AESFastEngine;-><init>()V

    const/16 v3, 0x80

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/BufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    return-void
.end method
