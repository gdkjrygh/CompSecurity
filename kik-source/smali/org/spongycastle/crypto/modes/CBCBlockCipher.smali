.class public Lorg/spongycastle/crypto/modes/CBCBlockCipher;
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
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    .line 31
    iput-object p1, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    .line 32
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    .line 34
    iget v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a:[B

    .line 35
    iget v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    .line 36
    iget v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->c:[B

    .line 37
    return-void
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 148
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->f:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    add-int/2addr v0, p2

    array-length v2, p1

    if-le v0, v2, :cond_0

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move v0, v1

    :goto_0
    iget v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    aget-byte v3, v2, v0

    add-int v4, p2, v0

    aget-byte v4, p1, v4

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    invoke-interface {v0, v2, v1, p3, p4}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    array-length v3, v3

    invoke-static {p3, p4, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    return v0

    :cond_2
    iget v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    add-int/2addr v0, p2

    array-length v2, p1

    if-le v0, v2, :cond_3

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->c:[B

    iget v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    invoke-static {p1, p2, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, p1, p2, p3, p4}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    :goto_2
    iget v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    if-ge v1, v2, :cond_4

    add-int v2, p4, v1

    aget-byte v3, p3, v2

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    aget-byte v4, v4, v1

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p3, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->c:[B

    iput-object v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    iput-object v1, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->c:[B

    goto :goto_1
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/CBC"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 64
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->f:Z

    .line 66
    iput-boolean p1, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->f:Z

    .line 68
    instance-of v1, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v1, :cond_3

    .line 70
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 71
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v1

    .line 73
    array-length v2, v1

    iget v3, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d:I

    if-eq v2, v3, :cond_0

    .line 75
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "initialisation vector must be the same length as block size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_0
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a:[B

    array-length v3, v1

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 80
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->c()V

    .line 83
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 85
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 106
    :cond_1
    :goto_0
    return-void

    .line 87
    :cond_2
    if-eq v0, p1, :cond_1

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot change encrypting state without providing key."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_3
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->c()V

    .line 97
    if-eqz p2, :cond_4

    .line 99
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_0

    .line 101
    :cond_4
    if-eq v0, p1, :cond_1

    .line 103
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot change encrypting state without providing key."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 157
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->c:[B

    invoke-static {v0, v3}, Lorg/spongycastle/util/Arrays;->a([BB)V

    .line 160
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 161
    return-void
.end method

.method public final d()Lorg/spongycastle/crypto/BlockCipher;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->e:Lorg/spongycastle/crypto/BlockCipher;

    return-object v0
.end method
