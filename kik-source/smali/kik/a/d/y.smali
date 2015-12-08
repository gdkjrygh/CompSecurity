.class public Lkik/a/d/y;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# static fields
.field private static a:[Ljava/security/MessageDigest;


# instance fields
.field private b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 21
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/security/MessageDigest;

    sput-object v0, Lkik/a/d/y;->a:[Ljava/security/MessageDigest;

    .line 24
    :try_start_0
    sget-object v0, Lkik/a/d/y;->a:[Ljava/security/MessageDigest;

    const/4 v1, 0x0

    const-string v2, "SHA-256"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    aput-object v2, v0, v1

    .line 25
    sget-object v0, Lkik/a/d/y;->a:[Ljava/security/MessageDigest;

    const/4 v1, 0x1

    const-string v2, "SHA-1"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    aput-object v2, v0, v1

    .line 26
    sget-object v0, Lkik/a/d/y;->a:[Ljava/security/MessageDigest;

    const/4 v1, 0x2

    const-string v2, "MD5"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    aput-object v2, v0, v1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :goto_0
    return-void

    .line 28
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 37
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    iput v0, p0, Lkik/a/d/y;->b:I

    .line 34
    iput v0, p0, Lkik/a/d/y;->c:I

    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 33
    iput v0, p0, Lkik/a/d/y;->b:I

    .line 34
    iput v0, p0, Lkik/a/d/y;->c:I

    .line 43
    return-void
.end method

.method private static a(I[B)I
    .locals 9

    .prologue
    .line 47
    sget-object v0, Lkik/a/d/y;->a:[Ljava/security/MessageDigest;

    aget-object v2, v0, p0

    .line 49
    const-wide/16 v0, 0x0

    .line 51
    if-eqz v2, :cond_0

    .line 52
    monitor-enter v2

    .line 53
    :try_start_0
    invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V

    .line 54
    invoke-virtual {v2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v3

    .line 55
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    const/4 v2, 0x0

    :goto_0
    array-length v4, v3

    if-ge v2, v4, :cond_0

    .line 60
    add-int/lit8 v4, v2, 0x3

    aget-byte v4, v3, v4

    int-to-long v4, v4

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    add-int/lit8 v6, v2, 0x2

    aget-byte v6, v3, v6

    int-to-long v6, v6

    const/16 v8, 0x10

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    add-int/lit8 v6, v2, 0x1

    aget-byte v6, v3, v6

    int-to-long v6, v6

    const/16 v8, 0x8

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    aget-byte v6, v3, v2

    int-to-long v6, v6

    or-long/2addr v4, v6

    xor-long/2addr v0, v4

    .line 59
    add-int/lit8 v2, v2, 0x4

    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 64
    :cond_0
    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method protected final a(I)V
    .locals 0

    .prologue
    .line 69
    iput p1, p0, Lkik/a/d/y;->b:I

    .line 70
    return-void
.end method

.method protected final b(I)V
    .locals 0

    .prologue
    .line 74
    iput p1, p0, Lkik/a/d/y;->c:I

    .line 75
    return-void
.end method

.method public hashCode()I
    .locals 12

    .prologue
    const/4 v11, 0x5

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v1, 0x0

    .line 80
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 81
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lkik/a/d/y;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v4

    .line 86
    invoke-static {v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 89
    invoke-static {v4}, Lorg/a/a/b/a;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    .line 91
    invoke-static {v5}, Lorg/a/a/b/a;->b([Ljava/lang/Object;)V

    .line 93
    array-length v6, v4

    move v0, v1

    :goto_0
    if-ge v0, v6, :cond_0

    aget-object v7, v4, v0

    .line 94
    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v8

    invoke-virtual {p0, v7}, Lkik/a/d/y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 93
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 97
    :cond_0
    array-length v4, v5

    move v0, v1

    :goto_1
    if-ge v0, v4, :cond_1

    aget-object v6, v5, v0

    .line 98
    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v7

    invoke-virtual {p0, v6}, Lkik/a/d/y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 97
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 102
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 105
    const/4 v3, 0x6

    new-array v3, v3, [I

    invoke-static {v1, v0}, Lkik/a/d/y;->a(I[B)I

    move-result v4

    aput v4, v3, v1

    invoke-static {v9, v0}, Lkik/a/d/y;->a(I[B)I

    move-result v4

    aput v4, v3, v9

    invoke-static {v10, v0}, Lkik/a/d/y;->a(I[B)I

    move-result v0

    aput v0, v3, v10

    const/4 v0, 0x3

    invoke-static {v1, v2}, Lkik/a/d/y;->a(I[B)I

    move-result v4

    aput v4, v3, v0

    const/4 v0, 0x4

    invoke-static {v9, v2}, Lkik/a/d/y;->a(I[B)I

    move-result v4

    aput v4, v3, v0

    invoke-static {v10, v2}, Lkik/a/d/y;->a(I[B)I

    move-result v0

    aput v0, v3, v11

    .line 115
    iget v0, p0, Lkik/a/d/y;->b:I

    aget v2, v3, v1

    iget v4, p0, Lkik/a/d/y;->c:I

    shl-int/2addr v2, v4

    xor-int/2addr v0, v2

    aget v2, v3, v11

    iget v4, p0, Lkik/a/d/y;->c:I

    mul-int/lit8 v4, v4, 0x2

    shl-int/2addr v2, v4

    xor-int/2addr v0, v2

    aget v2, v3, v9

    iget v4, p0, Lkik/a/d/y;->c:I

    shl-int/2addr v2, v4

    xor-int/2addr v0, v2

    aget v1, v3, v1

    xor-int/2addr v0, v1

    return v0
.end method
