.class public Lorg/bouncycastle/jce/provider/JCEMac$PBEWithTiger;
.super Lorg/bouncycastle/jce/provider/JCEMac;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCEMac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithTiger"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/macs/HMac;

    new-instance v1, Lorg/bouncycastle/crypto/digests/TigerDigest;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/digests/TigerDigest;-><init>()V

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    const/4 v1, 0x3

    const/16 v2, 0xc0

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/jce/provider/JCEMac;-><init>(Lorg/bouncycastle/crypto/Mac;II)V

    return-void
.end method
