.class public Lorg/spongycastle/crypto/engines/RC564Engine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field private a:I

.field private b:[J

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/16 v0, 0xc

    iput v0, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->a:I

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    .line 54
    return-void
.end method

.method private static a(JJ)J
    .locals 6

    .prologue
    const-wide/16 v4, 0x3f

    .line 245
    and-long v0, p2, v4

    long-to-int v0, v0

    shl-long v0, p0, v0

    const-wide/16 v2, 0x40

    and-long/2addr v4, p2

    sub-long/2addr v2, v4

    long-to-int v2, v2

    ushr-long v2, p0, v2

    or-long/2addr v0, v2

    return-wide v0
.end method

.method private static a([BI)J
    .locals 6

    .prologue
    .line 267
    const-wide/16 v2, 0x0

    .line 269
    const/4 v0, 0x7

    :goto_0
    if-ltz v0, :cond_0

    .line 271
    const/16 v1, 0x8

    shl-long/2addr v2, v1

    add-int v1, v0, p1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    int-to-long v4, v1

    add-long/2addr v2, v4

    .line 269
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 274
    :cond_0
    return-wide v2
.end method

.method private static a(J[BI)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 282
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    .line 284
    add-int v1, v0, p3

    long-to-int v2, p0

    int-to-byte v2, v2

    aput-byte v2, p2, v1

    .line 285
    ushr-long/2addr p0, v3

    .line 282
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 287
    :cond_0
    return-void
.end method

.method private a([B)V
    .locals 12

    .prologue
    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 126
    array-length v0, p1

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    new-array v8, v0, [J

    move v0, v1

    .line 128
    :goto_0
    array-length v4, p1

    if-eq v0, v4, :cond_0

    .line 130
    div-int/lit8 v4, v0, 0x8

    aget-wide v6, v8, v4

    aget-byte v5, p1, v0

    and-int/lit16 v5, v5, 0xff

    int-to-long v10, v5

    rem-int/lit8 v5, v0, 0x8

    mul-int/lit8 v5, v5, 0x8

    shl-long/2addr v10, v5

    add-long/2addr v6, v10

    aput-wide v6, v8, v4

    .line 128
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 139
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->a:I

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    .line 141
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    const-wide v4, -0x481eae9d7512d595L    # -1.590398847350152E-39

    aput-wide v4, v0, v1

    .line 142
    const/4 v0, 0x1

    :goto_1
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    array-length v4, v4

    if-ge v0, v4, :cond_1

    .line 144
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    add-int/lit8 v6, v0, -0x1

    aget-wide v6, v5, v6

    const-wide v10, -0x61c8864680b583ebL

    add-long/2addr v6, v10

    aput-wide v6, v4, v0

    .line 142
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 154
    :cond_1
    array-length v0, v8

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    array-length v4, v4

    if-le v0, v4, :cond_2

    .line 156
    array-length v0, v8

    mul-int/lit8 v0, v0, 0x3

    :goto_2
    move-wide v4, v2

    move-wide v6, v2

    move v2, v1

    move v3, v1

    .line 166
    :goto_3
    if-ge v1, v0, :cond_3

    .line 168
    iget-object v9, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    iget-object v10, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    aget-wide v10, v10, v3

    add-long/2addr v6, v10

    add-long/2addr v6, v4

    const-wide/16 v10, 0x3

    invoke-static {v6, v7, v10, v11}, Lorg/spongycastle/crypto/engines/RC564Engine;->a(JJ)J

    move-result-wide v6

    aput-wide v6, v9, v3

    .line 169
    aget-wide v10, v8, v2

    add-long/2addr v10, v6

    add-long/2addr v10, v4

    add-long/2addr v4, v6

    invoke-static {v10, v11, v4, v5}, Lorg/spongycastle/crypto/engines/RC564Engine;->a(JJ)J

    move-result-wide v4

    aput-wide v4, v8, v2

    .line 170
    add-int/lit8 v3, v3, 0x1

    iget-object v9, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    array-length v9, v9

    rem-int/2addr v3, v9

    .line 171
    add-int/lit8 v2, v2, 0x1

    array-length v9, v8

    rem-int/2addr v2, v9

    .line 166
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 160
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x3

    goto :goto_2

    .line 173
    :cond_3
    return-void
.end method

.method private static b(JJ)J
    .locals 6

    .prologue
    const-wide/16 v4, 0x3f

    .line 260
    and-long v0, p2, v4

    long-to-int v0, v0

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x40

    and-long/2addr v4, p2

    sub-long/2addr v2, v4

    long-to-int v2, v2

    shl-long v2, p0, v2

    or-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 10

    .prologue
    const/16 v9, 0x10

    const/4 v8, 0x0

    const/4 v4, 0x1

    .line 98
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->c:Z

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/RC564Engine;->a([BI)J

    move-result-wide v0

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    aget-wide v2, v2, v8

    add-long/2addr v2, v0

    add-int/lit8 v0, p2, 0x8

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/RC564Engine;->a([BI)J

    move-result-wide v0

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    aget-wide v6, v5, v4

    add-long/2addr v0, v6

    :goto_0
    iget v5, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->a:I

    if-gt v4, v5, :cond_0

    xor-long/2addr v2, v0

    invoke-static {v2, v3, v0, v1}, Lorg/spongycastle/crypto/engines/RC564Engine;->a(JJ)J

    move-result-wide v2

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    mul-int/lit8 v6, v4, 0x2

    aget-wide v6, v5, v6

    add-long/2addr v2, v6

    xor-long/2addr v0, v2

    invoke-static {v0, v1, v2, v3}, Lorg/spongycastle/crypto/engines/RC564Engine;->a(JJ)J

    move-result-wide v0

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    mul-int/lit8 v6, v4, 0x2

    add-int/lit8 v6, v6, 0x1

    aget-wide v6, v5, v6

    add-long/2addr v0, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2, v3, p3, p4}, Lorg/spongycastle/crypto/engines/RC564Engine;->a(J[BI)V

    add-int/lit8 v2, p4, 0x8

    invoke-static {v0, v1, p3, v2}, Lorg/spongycastle/crypto/engines/RC564Engine;->a(J[BI)V

    :goto_1
    return v9

    :cond_1
    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/RC564Engine;->a([BI)J

    move-result-wide v2

    add-int/lit8 v0, p2, 0x8

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/RC564Engine;->a([BI)J

    move-result-wide v0

    iget v5, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->a:I

    :goto_2
    if-lez v5, :cond_2

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    mul-int/lit8 v7, v5, 0x2

    add-int/lit8 v7, v7, 0x1

    aget-wide v6, v6, v7

    sub-long/2addr v0, v6

    invoke-static {v0, v1, v2, v3}, Lorg/spongycastle/crypto/engines/RC564Engine;->b(JJ)J

    move-result-wide v0

    xor-long/2addr v0, v2

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    mul-int/lit8 v7, v5, 0x2

    aget-wide v6, v6, v7

    sub-long/2addr v2, v6

    invoke-static {v2, v3, v0, v1}, Lorg/spongycastle/crypto/engines/RC564Engine;->b(JJ)J

    move-result-wide v2

    xor-long/2addr v2, v0

    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    :cond_2
    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    aget-wide v6, v5, v8

    sub-long/2addr v2, v6

    invoke-static {v2, v3, p3, p4}, Lorg/spongycastle/crypto/engines/RC564Engine;->a(J[BI)V

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->b:[J

    aget-wide v2, v2, v4

    sub-long/2addr v0, v2

    add-int/lit8 v2, p4, 0x8

    invoke-static {v0, v1, p3, v2}, Lorg/spongycastle/crypto/engines/RC564Engine;->a(J[BI)V

    goto :goto_1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    const-string v0, "RC5-64"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 78
    instance-of v0, p2, Lorg/spongycastle/crypto/params/RC5Parameters;

    if-nez v0, :cond_0

    .line 80
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to RC564 init - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_0
    check-cast p2, Lorg/spongycastle/crypto/params/RC5Parameters;

    .line 85
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->c:Z

    .line 87
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/RC5Parameters;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/engines/RC564Engine;->a:I

    .line 89
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/RC5Parameters;->a()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/engines/RC564Engine;->a([B)V

    .line 90
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 63
    const/16 v0, 0x10

    return v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 104
    return-void
.end method
