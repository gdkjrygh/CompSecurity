.class public Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithAESCBC;
.super Lorg/spongycastle/jce/provider/JCEBlockCipher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEBlockCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithAESCBC"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 910
    new-instance v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    new-instance v1, Lorg/spongycastle/crypto/engines/AESFastEngine;

    invoke-direct {v1}, Lorg/spongycastle/crypto/engines/AESFastEngine;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    .line 911
    return-void
.end method
