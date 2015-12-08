.class public Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;
.super Lorg/spongycastle/crypto/PBEParametersGenerator;
.source "SourceFile"


# instance fields
.field private d:Lorg/spongycastle/crypto/Digest;

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/Digest;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Lorg/spongycastle/crypto/PBEParametersGenerator;-><init>()V

    .line 39
    iput-object p1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    .line 40
    invoke-interface {p1}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->e:I

    .line 43
    check-cast p1, Lorg/spongycastle/crypto/ExtendedDigest;

    invoke-interface {p1}, Lorg/spongycastle/crypto/ExtendedDigest;->d()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    .line 47
    return-void
.end method

.method private b(II)[B
    .locals 13

    .prologue
    .line 81
    iget v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    new-array v4, v0, [B

    .line 82
    new-array v5, p2, [B

    .line 84
    const/4 v0, 0x0

    :goto_0
    array-length v1, v4

    if-eq v0, v1, :cond_0

    .line 86
    int-to-byte v1, p1

    aput-byte v1, v4, v0

    .line 84
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b:[B

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b:[B

    array-length v0, v0

    if-eqz v0, :cond_2

    .line 93
    iget v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    iget-object v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b:[B

    array-length v1, v1

    iget v2, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    div-int/2addr v1, v2

    mul-int/2addr v0, v1

    new-array v1, v0, [B

    .line 95
    const/4 v0, 0x0

    :goto_1
    array-length v2, v1

    if-eq v0, v2, :cond_1

    .line 97
    iget-object v2, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b:[B

    array-length v3, v3

    rem-int v3, v0, v3

    aget-byte v2, v2, v3

    aput-byte v2, v1, v0

    .line 95
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 107
    :goto_2
    iget-object v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->a:[B

    if-eqz v1, :cond_4

    iget-object v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->a:[B

    array-length v1, v1

    if-eqz v1, :cond_4

    .line 109
    iget v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    iget-object v2, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->a:[B

    array-length v2, v2

    iget v3, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, -0x1

    iget v3, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    div-int/2addr v2, v3

    mul-int/2addr v1, v2

    new-array v2, v1, [B

    .line 111
    const/4 v1, 0x0

    :goto_3
    array-length v3, v2

    if-eq v1, v3, :cond_3

    .line 113
    iget-object v3, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->a:[B

    iget-object v6, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->a:[B

    array-length v6, v6

    rem-int v6, v1, v6

    aget-byte v3, v3, v6

    aput-byte v3, v2, v1

    .line 111
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 102
    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [B

    goto :goto_2

    :cond_3
    move-object v1, v2

    .line 121
    :goto_4
    array-length v2, v0

    array-length v3, v1

    add-int/2addr v2, v3

    new-array v6, v2, [B

    .line 123
    const/4 v2, 0x0

    const/4 v3, 0x0

    array-length v7, v0

    invoke-static {v0, v2, v6, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 124
    const/4 v2, 0x0

    array-length v0, v0

    array-length v3, v1

    invoke-static {v1, v2, v6, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    iget v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    new-array v7, v0, [B

    .line 127
    iget v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->e:I

    add-int/2addr v0, p2

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->e:I

    div-int v8, v0, v1

    .line 129
    const/4 v0, 0x1

    move v3, v0

    :goto_5
    if-gt v3, v8, :cond_a

    .line 131
    iget v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->e:I

    new-array v9, v0, [B

    .line 133
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    const/4 v1, 0x0

    array-length v2, v4

    invoke-interface {v0, v4, v1, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 134
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    const/4 v1, 0x0

    array-length v2, v6

    invoke-interface {v0, v6, v1, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 135
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    const/4 v1, 0x0

    invoke-interface {v0, v9, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 136
    const/4 v0, 0x1

    :goto_6
    iget v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->c:I

    if-ge v0, v1, :cond_5

    .line 138
    iget-object v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    const/4 v2, 0x0

    array-length v10, v9

    invoke-interface {v1, v9, v2, v10}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 139
    iget-object v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    const/4 v2, 0x0

    invoke-interface {v1, v9, v2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 136
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 118
    :cond_4
    const/4 v1, 0x0

    new-array v1, v1, [B

    goto :goto_4

    .line 142
    :cond_5
    const/4 v0, 0x0

    :goto_7
    array-length v1, v7

    if-eq v0, v1, :cond_6

    .line 144
    array-length v1, v9

    rem-int v1, v0, v1

    aget-byte v1, v9, v1

    aput-byte v1, v7, v0

    .line 142
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 147
    :cond_6
    const/4 v0, 0x0

    :goto_8
    array-length v1, v6

    iget v2, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    div-int/2addr v1, v2

    if-eq v0, v1, :cond_8

    .line 149
    iget v1, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->f:I

    mul-int v10, v0, v1

    array-length v1, v7

    add-int/lit8 v1, v1, -0x1

    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    array-length v2, v7

    add-int/2addr v2, v10

    add-int/lit8 v2, v2, -0x1

    aget-byte v2, v6, v2

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    array-length v2, v7

    add-int/2addr v2, v10

    add-int/lit8 v2, v2, -0x1

    int-to-byte v11, v1

    aput-byte v11, v6, v2

    ushr-int/lit8 v2, v1, 0x8

    array-length v1, v7

    add-int/lit8 v1, v1, -0x2

    :goto_9
    if-ltz v1, :cond_7

    aget-byte v11, v7, v1

    and-int/lit16 v11, v11, 0xff

    add-int v12, v10, v1

    aget-byte v12, v6, v12

    and-int/lit16 v12, v12, 0xff

    add-int/2addr v11, v12

    add-int/2addr v2, v11

    add-int v11, v10, v1

    int-to-byte v12, v2

    aput-byte v12, v6, v11

    ushr-int/lit8 v2, v2, 0x8

    add-int/lit8 v1, v1, -0x1

    goto :goto_9

    .line 147
    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 152
    :cond_8
    if-ne v3, v8, :cond_9

    .line 154
    const/4 v0, 0x0

    add-int/lit8 v1, v3, -0x1

    iget v2, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->e:I

    mul-int/2addr v1, v2

    array-length v2, v5

    add-int/lit8 v10, v3, -0x1

    iget v11, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->e:I

    mul-int/2addr v10, v11

    sub-int/2addr v2, v10

    invoke-static {v9, v0, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 129
    :goto_a
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_5

    .line 158
    :cond_9
    const/4 v0, 0x0

    add-int/lit8 v1, v3, -0x1

    iget v2, p0, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->e:I

    mul-int/2addr v1, v2

    array-length v2, v9

    invoke-static {v9, v0, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_a

    .line 162
    :cond_a
    return-object v5
.end method


# virtual methods
.method public final a(I)Lorg/spongycastle/crypto/CipherParameters;
    .locals 4

    .prologue
    .line 175
    div-int/lit8 v0, p1, 0x8

    .line 177
    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b(II)[B

    move-result-object v1

    .line 179
    new-instance v2, Lorg/spongycastle/crypto/params/KeyParameter;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    return-object v2
.end method

.method public final a(II)Lorg/spongycastle/crypto/CipherParameters;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 195
    div-int/lit8 v0, p1, 0x8

    .line 196
    div-int/lit8 v1, p2, 0x8

    .line 198
    const/4 v2, 0x1

    invoke-direct {p0, v2, v0}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b(II)[B

    move-result-object v2

    .line 200
    const/4 v3, 0x2

    invoke-direct {p0, v3, v1}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b(II)[B

    move-result-object v3

    .line 202
    new-instance v4, Lorg/spongycastle/crypto/params/ParametersWithIV;

    new-instance v5, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-direct {v5, v2, v6, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-direct {v4, v5, v3, v6, v1}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[BII)V

    return-object v4
.end method

.method public final b(I)Lorg/spongycastle/crypto/CipherParameters;
    .locals 4

    .prologue
    .line 215
    div-int/lit8 v0, p1, 0x8

    .line 217
    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;->b(II)[B

    move-result-object v1

    .line 219
    new-instance v2, Lorg/spongycastle/crypto/params/KeyParameter;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    return-object v2
.end method
