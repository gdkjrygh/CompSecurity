.class public Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithSHAAndTwofish;
.super Lorg/spongycastle/jce/provider/JCEBlockCipher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEBlockCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithSHAAndTwofish"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 898
    new-instance v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    new-instance v1, Lorg/spongycastle/crypto/engines/TwofishEngine;

    invoke-direct {v1}, Lorg/spongycastle/crypto/engines/TwofishEngine;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    .line 899
    return-void
.end method
