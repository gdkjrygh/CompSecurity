.class public Lorg/spongycastle/crypto/modes/SICBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field private final a:Lorg/spongycastle/crypto/BlockCipher;

.field private final b:I

.field private c:[B

.field private d:[B

.field private e:[B


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    .line 30
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->b:I

    .line 31
    iget v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->c:[B

    .line 32
    iget v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d:[B

    .line 33
    iget v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->e:[B

    .line 34
    return-void
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 87
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->e:[B

    invoke-interface {v0, v3, v1, v4, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move v0, v1

    .line 92
    :goto_0
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->e:[B

    array-length v3, v3

    if-ge v0, v3, :cond_0

    .line 94
    add-int v3, p4, v0

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->e:[B

    aget-byte v4, v4, v0

    add-int v5, p2, v0

    aget-byte v5, p1, v5

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, p3, v3

    .line 92
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d:[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    move v0, v2

    :goto_1
    if-ltz v3, :cond_2

    .line 101
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d:[B

    aget-byte v4, v4, v3

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v4, v0

    .line 103
    const/16 v0, 0xff

    if-le v4, v0, :cond_1

    move v0, v2

    .line 112
    :goto_2
    iget-object v5, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d:[B

    int-to-byte v4, v4

    aput-byte v4, v5, v3

    .line 99
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_1
    move v0, v1

    .line 109
    goto :goto_2

    .line 115
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d:[B

    array-length v0, v0

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/SIC"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 53
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_1

    .line 55
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 56
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v0

    .line 57
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->c:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->c:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->c()V

    .line 62
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 66
    :cond_0
    return-void

    .line 69
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SIC mode requires ParametersWithIV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 121
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->c:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 122
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 123
    return-void
.end method

.method public final d()Lorg/spongycastle/crypto/BlockCipher;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    return-object v0
.end method
