.class public Lorg/spongycastle/jce/provider/JCEStreamCipher$PBEWithSHAAnd40BitRC4;
.super Lorg/spongycastle/jce/provider/JCEStreamCipher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEStreamCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithSHAAnd40BitRC4"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 519
    new-instance v0, Lorg/spongycastle/crypto/engines/RC4Engine;

    invoke-direct {v0}, Lorg/spongycastle/crypto/engines/RC4Engine;-><init>()V

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/JCEStreamCipher;-><init>(Lorg/spongycastle/crypto/StreamCipher;)V

    .line 520
    return-void
.end method
