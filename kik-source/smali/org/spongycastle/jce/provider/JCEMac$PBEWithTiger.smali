.class public Lorg/spongycastle/jce/provider/JCEMac$PBEWithTiger;
.super Lorg/spongycastle/jce/provider/JCEMac;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCEMac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithTiger"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 418
    new-instance v0, Lorg/spongycastle/crypto/macs/HMac;

    new-instance v1, Lorg/spongycastle/crypto/digests/TigerDigest;

    invoke-direct {v1}, Lorg/spongycastle/crypto/digests/TigerDigest;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/macs/HMac;-><init>(Lorg/spongycastle/crypto/Digest;)V

    const/4 v1, 0x3

    const/16 v2, 0xc0

    invoke-direct {p0, v0, v1, v2}, Lorg/spongycastle/jce/provider/JCEMac;-><init>(Lorg/spongycastle/crypto/Mac;II)V

    .line 419
    return-void
.end method
