.class public Lorg/bouncycastle/jce/provider/WrapCipherSpi$RC2Wrap;
.super Lorg/bouncycastle/jce/provider/WrapCipherSpi;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/WrapCipherSpi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RC2Wrap"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/engines/RC2WrapEngine;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/RC2WrapEngine;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/WrapCipherSpi;-><init>(Lorg/bouncycastle/crypto/Wrapper;)V

    return-void
.end method
