.class public Lorg/spongycastle/crypto/modes/CFBBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field private a:[B

.field private b:[B

.field private c:[B

.field private d:I

.field private e:Lorg/spongycastle/crypto/BlockCipher;

.field private f:Z


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;I)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    .line 33
    iput-object p1, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    .line 34
    div-int/lit8 v0, p2, 0x8

    iput v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    .line 36
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    .line 37
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    .line 38
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->c:[B

    .line 39
    return-void
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 145
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->f:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    add-int/2addr v0, p2

    array-length v2, p1

    if-le v0, v2, :cond_0

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    add-int/2addr v0, p4

    array-length v2, p3

    if-le v0, v2, :cond_1

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->c:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move v0, v1

    :goto_0
    iget v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    if-ge v0, v2, :cond_2

    add-int v2, p4, v0

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->c:[B

    aget-byte v3, v3, v0

    add-int v4, p2, v0

    aget-byte v4, p1, v4

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    array-length v4, v4

    iget v5, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    sub-int/2addr v4, v5

    invoke-static {v0, v2, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    array-length v1, v1

    iget v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    sub-int/2addr v1, v2

    iget v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    invoke-static {p3, p4, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    iget v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    return v0

    :cond_4
    iget v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    add-int/2addr v0, p2

    array-length v2, p1

    if-le v0, v2, :cond_5

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    add-int/2addr v0, p4

    array-length v2, p3

    if-le v0, v2, :cond_6

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->c:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    array-length v4, v4

    iget v5, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    sub-int/2addr v4, v5

    invoke-static {v0, v2, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    array-length v2, v2

    iget v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    sub-int/2addr v2, v3

    iget v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    invoke-static {p1, p2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    iget v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    if-ge v1, v0, :cond_3

    add-int v0, p4, v1

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->c:[B

    aget-byte v2, v2, v1

    add-int v3, p2, v1

    aget-byte v3, p1, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p3, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/CFB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    mul-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 67
    iput-boolean p1, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->f:Z

    .line 69
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_3

    .line 71
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 72
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v2

    .line 74
    array-length v0, v2

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    array-length v3, v3

    if-ge v0, v3, :cond_0

    .line 77
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    array-length v3, v3

    array-length v4, v2

    sub-int/2addr v3, v4

    array-length v4, v2

    invoke-static {v2, v1, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 78
    :goto_0
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    array-length v3, v3

    array-length v4, v2

    sub-int/2addr v3, v4

    if-ge v0, v3, :cond_1

    .line 80
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    aput-byte v1, v3, v0

    .line 78
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    array-length v3, v3

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    :cond_1
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->c()V

    .line 91
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 93
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 102
    :cond_2
    :goto_1
    return-void

    .line 98
    :cond_3
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->c()V

    .line 100
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v5, p2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_1
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 122
    iget v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->d:I

    return v0
.end method

.method public final c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 250
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->a:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 252
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CFBBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 253
    return-void
.end method
