.class public Lorg/spongycastle/jce/provider/JCEIESCipher$BrokenIES;
.super Lorg/spongycastle/jce/provider/JCEIESCipher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEIESCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BrokenIES"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    .line 371
    new-instance v0, Lorg/spongycastle/crypto/engines/IESEngine;

    new-instance v1, Lorg/spongycastle/crypto/agreement/DHBasicAgreement;

    invoke-direct {v1}, Lorg/spongycastle/crypto/agreement/DHBasicAgreement;-><init>()V

    new-instance v2, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;

    new-instance v3, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v3}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v2, v3}, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    new-instance v3, Lorg/spongycastle/crypto/macs/HMac;

    new-instance v4, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v4}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v3, v4}, Lorg/spongycastle/crypto/macs/HMac;-><init>(Lorg/spongycastle/crypto/Digest;)V

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/crypto/engines/IESEngine;-><init>(Lorg/spongycastle/crypto/BasicAgreement;Lorg/spongycastle/crypto/DerivationFunction;Lorg/spongycastle/crypto/Mac;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/JCEIESCipher;-><init>(Lorg/spongycastle/crypto/engines/IESEngine;)V

    .line 375
    return-void
.end method
