.class public abstract Lorg/bouncycastle/crypto/digests/GeneralDigest;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/ExtendedDigest;


# instance fields
.field private a:[B

.field private b:I

.field private c:J


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    return-void
.end method

.method protected constructor <init>(Lorg/bouncycastle/crypto/digests/GeneralDigest;)V
    .locals 4

    const/4 v3, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    iget-object v0, p1, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    iget-object v2, p1, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    iget-wide v0, p1, Lorg/bouncycastle/crypto/digests/GeneralDigest;->c:J

    iput-wide v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->c:J

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 3

    iget-wide v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->c:J

    const/4 v2, 0x3

    shl-long/2addr v0, v2

    const/16 v2, -0x80

    invoke-virtual {p0, v2}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->update(B)V

    :goto_0
    iget v2, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->update(B)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->processLength(J)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->processBlock()V

    return-void
.end method

.method public getByteLength()I
    .locals 1

    const/16 v0, 0x40

    return v0
.end method

.method protected abstract processBlock()V
.end method

.method protected abstract processLength(J)V
.end method

.method protected abstract processWord([BI)V
.end method

.method public reset()V
    .locals 4

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->c:J

    iput v1, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    aput-byte v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public update(B)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    iget v1, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    aput-byte p1, v0, v1

    iget v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    invoke-virtual {p0, v0, v3}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->processWord([BI)V

    iput v3, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    :cond_0
    iget-wide v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->c:J

    return-void
.end method

.method public update([BII)V
    .locals 4

    :goto_0
    iget v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->b:I

    if-eqz v0, :cond_0

    if-lez p3, :cond_0

    aget-byte v0, p1, p2

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->update(B)V

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v0, v0

    if-le p3, v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->processWord([BI)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v0, v0

    add-int/2addr p2, v0

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v0, v0

    sub-int/2addr p3, v0

    iget-wide v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->c:J

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/bouncycastle/crypto/digests/GeneralDigest;->c:J

    goto :goto_1

    :cond_1
    :goto_2
    if-lez p3, :cond_2

    aget-byte v0, p1, p2

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->update(B)V

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    goto :goto_2

    :cond_2
    return-void
.end method
