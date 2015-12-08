.class public Lorg/bouncycastle/jce/provider/JDKMessageDigest$Tiger;
.super Lorg/bouncycastle/jce/provider/JDKMessageDigest;

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKMessageDigest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Tiger"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/digests/TigerDigest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/TigerDigest;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JDKMessageDigest;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    invoke-super {p0}, Lorg/bouncycastle/jce/provider/JDKMessageDigest;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKMessageDigest$Tiger;

    new-instance v2, Lorg/bouncycastle/crypto/digests/TigerDigest;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKMessageDigest$Tiger;->a:Lorg/bouncycastle/crypto/Digest;

    check-cast v1, Lorg/bouncycastle/crypto/digests/TigerDigest;

    invoke-direct {v2, v1}, Lorg/bouncycastle/crypto/digests/TigerDigest;-><init>(Lorg/bouncycastle/crypto/digests/TigerDigest;)V

    iput-object v2, v0, Lorg/bouncycastle/jce/provider/JDKMessageDigest$Tiger;->a:Lorg/bouncycastle/crypto/Digest;

    return-object v0
.end method
