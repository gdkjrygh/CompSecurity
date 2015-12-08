.class public Lorg/spongycastle/crypto/engines/IndexGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;
    }
.end annotation


# instance fields
.field private a:[B

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

.field private h:I

.field private i:Z

.field private j:Lorg/spongycastle/crypto/Digest;

.field private k:I


# direct methods
.method constructor <init>([BLorg/spongycastle/crypto/params/NTRUEncryptionParameters;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->a:[B

    .line 33
    iget v0, p2, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->b:I

    .line 34
    iget v0, p2, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->s:I

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->c:I

    .line 35
    iget v0, p2, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->t:I

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->d:I

    .line 37
    iput v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->e:I

    .line 38
    iput v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->f:I

    .line 39
    iput v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    .line 40
    iget-object v0, p2, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->j:Lorg/spongycastle/crypto/Digest;

    .line 42
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->j:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->k:I

    .line 43
    iput-boolean v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->i:Z

    .line 44
    return-void
.end method

.method private a(Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;[B)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 104
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->j:Lorg/spongycastle/crypto/Digest;

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->a:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->a:[B

    array-length v2, v2

    invoke-interface {v0, v1, v3, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 106
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->j:Lorg/spongycastle/crypto/Digest;

    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    shr-int/lit8 v2, v1, 0x18

    int-to-byte v2, v2

    invoke-interface {v0, v2}, Lorg/spongycastle/crypto/Digest;->a(B)V

    shr-int/lit8 v2, v1, 0x10

    int-to-byte v2, v2

    invoke-interface {v0, v2}, Lorg/spongycastle/crypto/Digest;->a(B)V

    shr-int/lit8 v2, v1, 0x8

    int-to-byte v2, v2

    invoke-interface {v0, v2}, Lorg/spongycastle/crypto/Digest;->a(B)V

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 108
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->j:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p2, v3}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 110
    invoke-virtual {p1, p2}, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a([B)V

    .line 111
    return-void
.end method

.method static synthetic a([BI)[B
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 10
    new-array v0, p1, [B

    array-length v1, p0

    if-ge p1, v1, :cond_0

    :goto_0
    invoke-static {p0, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_0
    array-length p1, p0

    goto :goto_0
.end method


# virtual methods
.method final a()I
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 53
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->i:Z

    if-nez v0, :cond_1

    .line 55
    new-instance v0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

    invoke-direct {v0}, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->g:Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

    .line 56
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->j:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 57
    :goto_0
    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    iget v2, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->d:I

    if-ge v1, v2, :cond_0

    .line 59
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->g:Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/crypto/engines/IndexGenerator;->a(Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;[B)V

    .line 60
    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    goto :goto_0

    .line 62
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->d:I

    mul-int/lit8 v0, v0, 0x8

    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->k:I

    mul-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->e:I

    .line 63
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->e:I

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->f:I

    .line 64
    iput-boolean v6, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->i:Z

    .line 69
    :cond_1
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->e:I

    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->c:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->e:I

    .line 70
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->g:Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

    iget v2, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->f:I

    new-instance v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

    invoke-direct {v3}, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;-><init>()V

    add-int/lit8 v0, v2, 0x7

    div-int/lit8 v0, v0, 0x8

    iput v0, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    iget v0, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    new-array v0, v0, [B

    iput-object v0, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    const/4 v0, 0x0

    :goto_1
    iget v4, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    if-ge v0, v4, :cond_2

    iget-object v4, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    iget-object v5, v1, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    aget-byte v5, v5, v0

    aput-byte v5, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    rem-int/lit8 v0, v2, 0x8

    iput v0, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    iget v0, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    if-nez v0, :cond_4

    const/16 v0, 0x8

    iput v0, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    .line 71
    :goto_2
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->f:I

    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->c:I

    if-ge v0, v1, :cond_6

    .line 73
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->c:I

    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->f:I

    sub-int/2addr v0, v1

    .line 74
    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    iget v2, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->k:I

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, -0x1

    iget v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->k:I

    div-int/2addr v2, v4

    add-int/2addr v1, v2

    .line 75
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->j:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v2

    new-array v2, v2, [B

    .line 76
    :cond_3
    :goto_3
    iget v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    if-ge v4, v1, :cond_5

    .line 78
    invoke-direct {p0, v3, v2}, Lorg/spongycastle/crypto/engines/IndexGenerator;->a(Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;[B)V

    .line 79
    iget v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->h:I

    .line 80
    iget v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->k:I

    mul-int/lit8 v4, v4, 0x8

    if-le v0, v4, :cond_3

    .line 82
    iget v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->k:I

    mul-int/lit8 v4, v4, 0x8

    sub-int/2addr v0, v4

    goto :goto_3

    .line 70
    :cond_4
    iget v0, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    rsub-int/lit8 v0, v0, 0x20

    iget-object v1, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    iget v2, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    add-int/lit8 v2, v2, -0x1

    iget-object v4, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    iget v5, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    add-int/lit8 v5, v5, -0x1

    aget-byte v4, v4, v5

    shl-int/2addr v4, v0

    ushr-int v0, v4, v0

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    goto :goto_2

    .line 85
    :cond_5
    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->k:I

    mul-int/lit8 v1, v1, 0x8

    sub-int v0, v1, v0

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->f:I

    .line 86
    new-instance v0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

    invoke-direct {v0}, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->g:Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

    .line 87
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->g:Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;

    invoke-virtual {v0, v2}, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a([B)V

    .line 94
    :goto_4
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->c:I

    iget v1, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    add-int/lit8 v1, v1, -0x1

    mul-int/lit8 v1, v1, 0x8

    iget v2, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    add-int/2addr v1, v2

    sub-int v0, v1, v0

    div-int/lit8 v4, v0, 0x8

    rem-int/lit8 v0, v0, 0x8

    iget-object v1, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    aget-byte v1, v1, v4

    and-int/lit16 v1, v1, 0xff

    ushr-int/2addr v1, v0

    rsub-int/lit8 v2, v0, 0x8

    add-int/lit8 v0, v4, 0x1

    :goto_5
    iget v4, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    if-ge v0, v4, :cond_7

    iget-object v4, v3, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    aget-byte v4, v4, v0

    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v2

    or-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x8

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 91
    :cond_6
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->f:I

    iget v1, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->c:I

    sub-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->f:I

    goto :goto_4

    .line 95
    :cond_7
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->c:I

    shl-int v0, v6, v0

    iget v2, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->c:I

    shl-int v2, v6, v2

    iget v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->b:I

    rem-int/2addr v2, v3

    sub-int/2addr v0, v2

    if-ge v1, v0, :cond_1

    .line 97
    iget v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator;->b:I

    rem-int v0, v1, v0

    return v0
.end method
