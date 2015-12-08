.class public Lorg/bouncycastle/jce/provider/JCEStreamCipher$Skipjack_OFB8;
.super Lorg/bouncycastle/jce/provider/JCEStreamCipher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCEStreamCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Skipjack_OFB8"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;

    new-instance v1, Lorg/bouncycastle/crypto/engines/SkipjackEngine;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/engines/SkipjackEngine;-><init>()V

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    const/16 v1, 0x40

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jce/provider/JCEStreamCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    return-void
.end method
