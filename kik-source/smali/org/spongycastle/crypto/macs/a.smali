.class final Lorg/spongycastle/crypto/macs/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:[B

.field private c:[B

.field private d:I

.field private e:Lorg/spongycastle/crypto/BlockCipher;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/a;->e:Lorg/spongycastle/crypto/BlockCipher;

    .line 33
    iput-object p1, p0, Lorg/spongycastle/crypto/macs/a;->e:Lorg/spongycastle/crypto/BlockCipher;

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    .line 36
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/a;->a:[B

    .line 37
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    .line 38
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/a;->c:[B

    .line 39
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 98
    iget v0, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    return v0
.end method

.method public final a([BI[B)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 121
    iget v0, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    add-int/2addr v0, p2

    array-length v2, p1

    if-le v0, v2, :cond_0

    .line 123
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    add-int/lit8 v0, v0, 0x0

    array-length v2, p3

    if-le v0, v2, :cond_1

    .line 128
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/a;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/a;->c:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move v0, v1

    .line 136
    :goto_0
    iget v2, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    if-ge v0, v2, :cond_2

    .line 138
    add-int/lit8 v2, v0, 0x0

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/a;->c:[B

    aget-byte v3, v3, v0

    add-int v4, p2, v0

    aget-byte v4, p1, v4

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p3, v2

    .line 136
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 144
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    iget v2, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    array-length v4, v4

    iget v5, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    sub-int/2addr v4, v5

    invoke-static {v0, v2, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 145
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    array-length v2, v2

    iget v3, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    sub-int/2addr v2, v3

    iget v3, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    invoke-static {p3, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 147
    iget v0, p0, Lorg/spongycastle/crypto/macs/a;->d:I

    return v0
.end method

.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 54
    instance-of v0, p1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_1

    .line 56
    check-cast p1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 57
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v0

    .line 59
    array-length v1, v0

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/a;->a:[B

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 61
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/a;->a:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/a;->a:[B

    array-length v2, v2

    array-length v3, v0

    sub-int/2addr v2, v3

    array-length v3, v0

    invoke-static {v0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    :goto_0
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/a;->b()V

    .line 70
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/a;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 78
    :goto_1
    return-void

    .line 65
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/a;->a:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/a;->a:[B

    array-length v2, v2

    invoke-static {v0, v4, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/a;->b()V

    .line 76
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/a;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v5, p1}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_1
.end method

.method final a([B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 164
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/a;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    invoke-interface {v0, v1, v2, p1, v2}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 165
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 156
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/a;->a:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/a;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/a;->a:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/a;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 159
    return-void
.end method
