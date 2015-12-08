.class public abstract Lorg/spongycastle/crypto/digests/GeneralDigest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/ExtendedDigest;


# instance fields
.field private a:[B

.field private b:I

.field private c:J


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    .line 25
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/crypto/digests/GeneralDigest;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    .line 35
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    iget-object v2, p1, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    iget v0, p1, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    .line 38
    iget-wide v0, p1, Lorg/spongycastle/crypto/digests/GeneralDigest;->c:J

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->c:J

    .line 39
    return-void
.end method


# virtual methods
.method public final a(B)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 44
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    iget v1, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    aput-byte p1, v0, v1

    .line 46
    iget v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 48
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    invoke-virtual {p0, v0, v3}, Lorg/spongycastle/crypto/digests/GeneralDigest;->b([BI)V

    .line 49
    iput v3, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    .line 52
    :cond_0
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->c:J

    .line 53
    return-void
.end method

.method protected abstract a(J)V
.end method

.method public final a([BII)V
    .locals 4

    .prologue
    .line 63
    :goto_0
    iget v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    if-eqz v0, :cond_0

    if-lez p3, :cond_0

    .line 65
    aget-byte v0, p1, p2

    invoke-virtual {p0, v0}, Lorg/spongycastle/crypto/digests/GeneralDigest;->a(B)V

    .line 67
    add-int/lit8 p2, p2, 0x1

    .line 68
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 74
    :cond_0
    :goto_1
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v0, v0

    if-le p3, v0, :cond_1

    .line 76
    invoke-virtual {p0, p1, p2}, Lorg/spongycastle/crypto/digests/GeneralDigest;->b([BI)V

    .line 78
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v0, v0

    add-int/2addr p2, v0

    .line 79
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v0, v0

    sub-int/2addr p3, v0

    .line 80
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->c:J

    iget-object v2, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->c:J

    goto :goto_1

    .line 86
    :cond_1
    :goto_2
    if-lez p3, :cond_2

    .line 88
    aget-byte v0, p1, p2

    invoke-virtual {p0, v0}, Lorg/spongycastle/crypto/digests/GeneralDigest;->a(B)V

    .line 90
    add-int/lit8 p2, p2, 0x1

    .line 91
    add-int/lit8 p3, p3, -0x1

    goto :goto_2

    .line 93
    :cond_2
    return-void
.end method

.method protected abstract b([BI)V
.end method

.method public c()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 116
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->c:J

    .line 118
    iput v1, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    move v0, v1

    .line 119
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 121
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->a:[B

    aput-byte v1, v2, v0

    .line 119
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 123
    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 127
    const/16 v0, 0x40

    return v0
.end method

.method public final e()V
    .locals 3

    .prologue
    .line 97
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->c:J

    const/4 v2, 0x3

    shl-long/2addr v0, v2

    .line 102
    const/16 v2, -0x80

    invoke-virtual {p0, v2}, Lorg/spongycastle/crypto/digests/GeneralDigest;->a(B)V

    .line 104
    :goto_0
    iget v2, p0, Lorg/spongycastle/crypto/digests/GeneralDigest;->b:I

    if-eqz v2, :cond_0

    .line 106
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lorg/spongycastle/crypto/digests/GeneralDigest;->a(B)V

    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {p0, v0, v1}, Lorg/spongycastle/crypto/digests/GeneralDigest;->a(J)V

    .line 111
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/GeneralDigest;->f()V

    .line 112
    return-void
.end method

.method protected abstract f()V
.end method
