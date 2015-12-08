.class public Lorg/spongycastle/jce/provider/JCEBlockCipher$RC2;
.super Lorg/spongycastle/jce/provider/JCEBlockCipher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEBlockCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RC2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 800
    new-instance v0, Lorg/spongycastle/crypto/engines/RC2Engine;

    invoke-direct {v0}, Lorg/spongycastle/crypto/engines/RC2Engine;-><init>()V

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    .line 801
    return-void
.end method
