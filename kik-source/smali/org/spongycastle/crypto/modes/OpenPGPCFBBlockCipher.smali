.class public Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field private a:[B

.field private b:[B

.field private c:[B

.field private d:Lorg/spongycastle/crypto/BlockCipher;

.field private e:I

.field private f:I

.field private g:Z


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    .line 39
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    .line 40
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a:[B

    .line 41
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    .line 42
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    .line 43
    return-void
.end method

.method private a(BI)B
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    aget-byte v0, v0, p2

    xor-int/2addr v0, p1

    int-to-byte v0, v0

    return v0
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 7

    .prologue
    const/4 v5, 0x1

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 96
    iget-boolean v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->g:Z

    if-eqz v2, :cond_7

    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/2addr v2, p2

    array-length v3, p1

    if-le v2, v3, :cond_0

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/2addr v2, p4

    array-length v3, p3

    if-le v2, v3, :cond_1

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    iget v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-le v2, v3, :cond_2

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v3, v3, -0x2

    aget-byte v4, p1, p2

    iget v5, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v5, v5, -0x2

    invoke-direct {p0, v4, v5}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v4

    aput-byte v4, p3, p4

    aput-byte v4, v2, v3

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v4, p4, 0x1

    add-int/lit8 v5, p2, 0x1

    aget-byte v5, p1, v5

    iget v6, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v6, v6, -0x1

    invoke-direct {p0, v5, v6}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v5

    aput-byte v5, p3, v4

    aput-byte v5, v2, v3

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    invoke-interface {v2, v3, v1, v4, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    :goto_0
    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-ge v0, v1, :cond_4

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    add-int/lit8 v2, v0, -0x2

    add-int v3, p4, v0

    add-int v4, p2, v0

    aget-byte v4, p1, v4

    add-int/lit8 v5, v0, -0x2

    invoke-direct {p0, v4, v5}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v4

    aput-byte v4, p3, v3

    aput-byte v4, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    if-nez v2, :cond_5

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move v0, v1

    :goto_1
    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    add-int v2, p4, v0

    add-int v3, p2, v0

    aget-byte v3, p1, v3

    invoke-direct {p0, v3, v0}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v3

    aput-byte v3, p3, v2

    aput-byte v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    :cond_4
    :goto_2
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    :goto_3
    return v0

    :cond_5
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    iget v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    invoke-interface {v2, v3, v1, v4, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    aget-byte v2, p1, p2

    invoke-direct {p0, v2, v1}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v2

    aput-byte v2, p3, p4

    add-int/lit8 v2, p4, 0x1

    add-int/lit8 v3, p2, 0x1

    aget-byte v3, p1, v3

    invoke-direct {p0, v3, v5}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v3

    aput-byte v3, p3, v2

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v4, v4, -0x2

    invoke-static {v2, v0, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v3, v3, -0x2

    invoke-static {p3, p4, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    invoke-interface {v2, v3, v1, v4, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    :goto_4
    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-ge v0, v1, :cond_6

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    add-int/lit8 v2, v0, -0x2

    add-int v3, p4, v0

    add-int v4, p2, v0

    aget-byte v4, p1, v4

    add-int/lit8 v5, v0, -0x2

    invoke-direct {p0, v4, v5}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v4

    aput-byte v4, p3, v3

    aput-byte v4, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_6
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    goto :goto_2

    :cond_7
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/2addr v2, p2

    array-length v3, p1

    if-le v2, v3, :cond_8

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/2addr v2, p4

    array-length v3, p3

    if-le v2, v3, :cond_9

    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    iget v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-le v2, v3, :cond_a

    aget-byte v2, p1, p2

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v4, v4, -0x2

    aput-byte v2, v3, v4

    iget v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v3, v3, -0x2

    invoke-direct {p0, v2, v3}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v2

    aput-byte v2, p3, p4

    add-int/lit8 v2, p2, 0x1

    aget-byte v2, p1, v2

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v4, v4, -0x1

    aput-byte v2, v3, v4

    add-int/lit8 v3, p4, 0x1

    iget v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v4, v4, -0x1

    invoke-direct {p0, v2, v4}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v2

    aput-byte v2, p3, v3

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    invoke-interface {v2, v3, v1, v4, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    :goto_5
    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-ge v0, v1, :cond_c

    add-int v1, p2, v0

    aget-byte v1, p1, v1

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    add-int/lit8 v3, v0, -0x2

    aput-byte v1, v2, v3

    add-int v2, p4, v0

    add-int/lit8 v3, v0, -0x2

    invoke-direct {p0, v1, v3}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v1

    aput-byte v1, p3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_a
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    if-nez v2, :cond_d

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    :goto_6
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-ge v1, v0, :cond_b

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    add-int v2, p2, v1

    aget-byte v2, p1, v2

    aput-byte v2, v0, v1

    add-int v0, p2, v1

    aget-byte v0, p1, v0

    invoke-direct {p0, v0, v1}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v0

    aput-byte v0, p3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_b
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    :cond_c
    :goto_7
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    goto/16 :goto_3

    :cond_d
    iget v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    iget v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-ne v2, v3, :cond_c

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    invoke-interface {v2, v3, v1, v4, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    aget-byte v2, p1, p2

    add-int/lit8 v3, p2, 0x1

    aget-byte v3, p1, v3

    invoke-direct {p0, v2, v1}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v4

    aput-byte v4, p3, p4

    add-int/lit8 v4, p4, 0x1

    invoke-direct {p0, v3, v5}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v5

    aput-byte v5, p3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v6, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v6, v6, -0x2

    invoke-static {v4, v0, v5, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v5, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v5, v5, -0x2

    aput-byte v2, v4, v5

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/lit8 v4, v4, -0x1

    aput-byte v3, v2, v4

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c:[B

    invoke-interface {v2, v3, v1, v4, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    :goto_8
    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    if-ge v0, v1, :cond_e

    add-int v1, p2, v0

    aget-byte v1, p1, v1

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    add-int/lit8 v3, v0, -0x2

    aput-byte v1, v2, v3

    add-int v2, p4, v0

    add-int/lit8 v3, v0, -0x2

    invoke-direct {p0, v1, v3}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a(BI)B

    move-result v1

    aput-byte v1, p3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_e
    iget v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    iget v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->f:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    goto :goto_7
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/OpenPGPCFB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 2

    .prologue
    .line 128
    iput-boolean p1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->g:Z

    .line 130
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->c()V

    .line 132
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 133
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 105
    iput v3, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->e:I

    .line 107
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->a:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->b:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 109
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 110
    return-void
.end method
