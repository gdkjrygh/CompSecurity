.class public Lorg/spongycastle/jce/provider/JCEMac$DES64;
.super Lorg/spongycastle/jce/provider/JCEMac;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEMac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DES64"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 167
    new-instance v0, Lorg/spongycastle/crypto/macs/CBCBlockCipherMac;

    new-instance v1, Lorg/spongycastle/crypto/engines/DESEngine;

    invoke-direct {v1}, Lorg/spongycastle/crypto/engines/DESEngine;-><init>()V

    const/16 v2, 0x40

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/crypto/macs/CBCBlockCipherMac;-><init>(Lorg/spongycastle/crypto/BlockCipher;I)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/JCEMac;-><init>(Lorg/spongycastle/crypto/Mac;)V

    .line 168
    return-void
.end method
