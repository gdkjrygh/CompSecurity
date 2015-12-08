.class public Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR384;
.super Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ecNR384"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    .line 201
    new-instance v0, Lorg/spongycastle/crypto/digests/SHA384Digest;

    invoke-direct {v0}, Lorg/spongycastle/crypto/digests/SHA384Digest;-><init>()V

    new-instance v1, Lorg/spongycastle/crypto/signers/ECNRSigner;

    invoke-direct {v1}, Lorg/spongycastle/crypto/signers/ECNRSigner;-><init>()V

    new-instance v2, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$b;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$b;-><init>(B)V

    invoke-direct {p0, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;-><init>(Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/DSA;Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;)V

    .line 202
    return-void
.end method
