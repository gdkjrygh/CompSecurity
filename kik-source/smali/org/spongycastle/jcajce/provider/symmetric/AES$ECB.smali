.class public Lorg/spongycastle/jcajce/provider/symmetric/AES$ECB;
.super Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/AES;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ECB"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    new-instance v0, Lorg/spongycastle/crypto/engines/AESFastEngine;

    invoke-direct {v0}, Lorg/spongycastle/crypto/engines/AESFastEngine;-><init>()V

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    .line 42
    return-void
.end method
