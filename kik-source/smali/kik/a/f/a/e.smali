.class final Lkik/a/f/a/e;
.super Lkik/a/f/a/g;
.source "SourceFile"


# static fields
.field private static final f:Lorg/c/b;

.field private static final h:[B


# instance fields
.field a:I

.field b:[B

.field private final g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-string v0, "KikChallengeHC"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/f/a/e;->f:Lorg/c/b;

    .line 103
    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lkik/a/f/a/e;->h:[B

    return-void

    :array_0
    .array-data 1
        -0x80t
        0x40t
        0x20t
        0x10t
        0x8t
        0x4t
        0x2t
        0x1t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/a/f/a/e;-><init>(Ljava/lang/String;B)V

    .line 31
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;B)V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lkik/a/f/a/g;-><init>(Ljava/lang/String;)V

    .line 36
    const-wide/16 v0, 0x3a98

    iput-wide v0, p0, Lkik/a/f/a/e;->g:J

    .line 37
    return-void
.end method

.method private static a([B)I
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 107
    .line 108
    array-length v5, p0

    move v4, v2

    move v0, v2

    :goto_0
    if-ge v4, v5, :cond_1

    aget-byte v6, p0, v4

    .line 109
    sget-object v7, Lkik/a/f/a/e;->h:[B

    array-length v8, v7

    move v1, v2

    :goto_1
    if-ge v1, v8, :cond_0

    aget-byte v3, v7, v1

    .line 110
    and-int/2addr v3, v6

    if-nez v3, :cond_1

    .line 111
    add-int/lit8 v3, v0, 0x1

    .line 109
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v3

    goto :goto_1

    .line 108
    :cond_0
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_0

    .line 118
    :cond_1
    return v0
.end method


# virtual methods
.method public final a()V
    .locals 10

    .prologue
    .line 56
    :try_start_0
    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 63
    iget-object v0, p0, Lkik/a/f/a/e;->b:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 64
    iget-object v0, p0, Lkik/a/f/a/e;->b:[B

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 67
    invoke-virtual {v1}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v0

    new-array v3, v0, [B

    .line 70
    const/high16 v0, -0x80000000

    :goto_0
    const v6, 0x7fffffff

    if-ge v0, v6, :cond_2

    .line 72
    :try_start_1
    iget-boolean v6, p0, Lkik/a/f/a/e;->d:Z

    if-eqz v6, :cond_0

    .line 73
    new-instance v0, Lkik/a/f/a/a;

    invoke-direct {v0}, Lkik/a/f/a/a;-><init>()V

    throw v0
    :try_end_1
    .catch Ljava/security/DigestException; {:try_start_1 .. :try_end_1} :catch_0

    .line 92
    :catch_0
    move-exception v0

    new-instance v0, Lkik/a/f/a/f;

    const-string v1, "Digest failed"

    invoke-direct {v0, v1}, Lkik/a/f/a/f;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :catch_1
    move-exception v0

    .line 60
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 75
    :cond_0
    :try_start_2
    rem-int/lit16 v6, v0, 0x3e8

    if-nez v6, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v4

    iget-wide v8, p0, Lkik/a/f/a/e;->g:J

    cmp-long v6, v6, v8

    if-lez v6, :cond_1

    .line 76
    new-instance v0, Lkik/a/f/a/f;

    const-string v1, "Timed out"

    invoke-direct {v0, v1}, Lkik/a/f/a/f;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_1
    iget-object v6, p0, Lkik/a/f/a/e;->b:[B

    array-length v6, v6

    invoke-virtual {v2, v6, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 80
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/security/MessageDigest;->update([B)V

    .line 81
    const/4 v6, 0x0

    array-length v7, v3

    invoke-virtual {v1, v3, v6, v7}, Ljava/security/MessageDigest;->digest([BII)I

    .line 82
    invoke-virtual {v1, v3}, Ljava/security/MessageDigest;->update([B)V

    .line 83
    const/4 v6, 0x0

    array-length v7, v3

    invoke-virtual {v1, v3, v6, v7}, Ljava/security/MessageDigest;->digest([BII)I

    .line 85
    invoke-static {v3}, Lkik/a/f/a/e;->a([B)I

    move-result v6

    iget v7, p0, Lkik/a/f/a/e;->a:I

    if-lt v6, v7, :cond_3

    .line 86
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/a/e;->e:Ljava/lang/String;
    :try_end_2
    .catch Ljava/security/DigestException; {:try_start_2 .. :try_end_2} :catch_0

    .line 96
    :cond_2
    iget-object v0, p0, Lkik/a/f/a/e;->e:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 97
    new-instance v0, Lkik/a/f/a/f;

    const-string v1, "No solution"

    invoke-direct {v0, v1}, Lkik/a/f/a/f;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 100
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    return-void
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 48
    const-string v0, "n"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B

    move-result-object v1

    iput v0, p0, Lkik/a/f/a/e;->a:I

    iput-object v1, p0, Lkik/a/f/a/e;->b:[B

    .line 49
    return-void
.end method
