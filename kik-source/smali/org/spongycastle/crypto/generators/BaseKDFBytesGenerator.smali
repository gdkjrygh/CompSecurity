.class public Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DerivationFunction;


# instance fields
.field private a:I

.field private b:Lorg/spongycastle/crypto/Digest;

.field private c:[B

.field private d:[B


# direct methods
.method protected constructor <init>(Lorg/spongycastle/crypto/Digest;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x1

    iput v0, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->a:I

    .line 34
    iput-object p1, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    .line 35
    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 81
    array-length v0, p1

    sub-int/2addr v0, p3

    if-ge v0, p2, :cond_0

    .line 83
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too small"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_0
    int-to-long v0, p3

    .line 87
    iget-object v2, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v5

    .line 95
    const-wide v6, 0x1ffffffffL

    cmp-long v2, v0, v6

    if-lez v2, :cond_1

    .line 97
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Output length too large"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_1
    int-to-long v6, v5

    add-long/2addr v0, v6

    const-wide/16 v6, 0x1

    sub-long/2addr v0, v6

    int-to-long v6, v5

    div-long/2addr v0, v6

    long-to-int v6, v0

    .line 102
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v7, v0, [B

    .line 106
    iget v0, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->a:I

    move v2, v3

    move v4, v0

    move v1, p2

    move v0, p3

    .line 108
    :goto_0
    if-ge v2, v6, :cond_4

    .line 110
    iget-object v8, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    iget-object v9, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->c:[B

    iget-object v10, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->c:[B

    array-length v10, v10

    invoke-interface {v8, v9, v3, v10}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 112
    iget-object v8, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    shr-int/lit8 v9, v4, 0x18

    int-to-byte v9, v9

    invoke-interface {v8, v9}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 113
    iget-object v8, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    shr-int/lit8 v9, v4, 0x10

    int-to-byte v9, v9

    invoke-interface {v8, v9}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 114
    iget-object v8, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    shr-int/lit8 v9, v4, 0x8

    int-to-byte v9, v9

    invoke-interface {v8, v9}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 115
    iget-object v8, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    int-to-byte v9, v4

    invoke-interface {v8, v9}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 117
    iget-object v8, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    if-eqz v8, :cond_2

    .line 119
    iget-object v8, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    iget-object v9, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    iget-object v10, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    array-length v10, v10

    invoke-interface {v8, v9, v3, v10}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 122
    :cond_2
    iget-object v8, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v8, v7, v3}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 124
    if-le v0, v5, :cond_3

    .line 126
    invoke-static {v7, v3, p1, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 127
    add-int/2addr v1, v5

    .line 128
    sub-int/2addr v0, v5

    .line 135
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 108
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 132
    :cond_3
    invoke-static {v7, v3, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 138
    :cond_4
    iget-object v1, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 140
    return v0
.end method

.method public final a(Lorg/spongycastle/crypto/DerivationParameters;)V
    .locals 2

    .prologue
    .line 40
    instance-of v0, p1, Lorg/spongycastle/crypto/params/KDFParameters;

    if-eqz v0, :cond_0

    .line 42
    check-cast p1, Lorg/spongycastle/crypto/params/KDFParameters;

    .line 44
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/KDFParameters;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->c:[B

    .line 45
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/KDFParameters;->b()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    .line 53
    :goto_0
    return-void

    .line 47
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/crypto/params/ISO18033KDFParameters;

    if-eqz v0, :cond_1

    .line 49
    check-cast p1, Lorg/spongycastle/crypto/params/ISO18033KDFParameters;

    .line 51
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ISO18033KDFParameters;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->c:[B

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    goto :goto_0

    .line 56
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "KDF parameters required for KDF2Generator"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
