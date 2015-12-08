.class public Lorg/spongycastle/jce/provider/JCEMac$DES9797Alg3with7816d4;
.super Lorg/spongycastle/jce/provider/JCEMac;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEMac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DES9797Alg3with7816d4"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 211
    new-instance v0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;

    new-instance v1, Lorg/spongycastle/crypto/engines/DESEngine;

    invoke-direct {v1}, Lorg/spongycastle/crypto/engines/DESEngine;-><init>()V

    new-instance v2, Lorg/spongycastle/crypto/paddings/ISO7816d4Padding;

    invoke-direct {v2}, Lorg/spongycastle/crypto/paddings/ISO7816d4Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;-><init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/JCEMac;-><init>(Lorg/spongycastle/crypto/Mac;)V

    .line 212
    return-void
.end method
