.class public Lorg/spongycastle/jce/provider/JCEMac$RC2;
.super Lorg/spongycastle/jce/provider/JCEMac;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEMac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RC2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 179
    new-instance v0, Lorg/spongycastle/crypto/macs/CBCBlockCipherMac;

    new-instance v1, Lorg/spongycastle/crypto/engines/RC2Engine;

    invoke-direct {v1}, Lorg/spongycastle/crypto/engines/RC2Engine;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/macs/CBCBlockCipherMac;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/JCEMac;-><init>(Lorg/spongycastle/crypto/Mac;)V

    .line 180
    return-void
.end method
