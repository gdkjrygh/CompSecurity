.class final Lcom/b/a/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/b/a/c/b;


# instance fields
.field private final b:[B

.field private volatile c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 85
    new-instance v0, Lcom/b/a/c/b;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/b/a/c/b;-><init>([B)V

    sput-object v0, Lcom/b/a/c/b;->a:Lcom/b/a/c/b;

    return-void
.end method

.method private constructor <init>([B)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    const/4 v0, 0x0

    iput v0, p0, Lcom/b/a/c/b;->c:I

    .line 53
    iput-object p1, p0, Lcom/b/a/c/b;->b:[B

    .line 54
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/b/a/c/b;
    .locals 3

    .prologue
    .line 137
    :try_start_0
    new-instance v0, Lcom/b/a/c/b;

    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/b/a/c/b;-><init>([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 138
    :catch_0
    move-exception v0

    .line 139
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "UTF-8 not supported."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a([BI)Lcom/b/a/c/b;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 92
    new-array v0, p1, [B

    .line 93
    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    new-instance v1, Lcom/b/a/c/b;

    invoke-direct {v1, v0}, Lcom/b/a/c/b;-><init>([B)V

    return-object v1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/b/a/c/b;->b:[B

    array-length v0, v0

    return v0
.end method

.method public final a([BIII)V
    .locals 1

    .prologue
    .line 195
    iget-object v0, p0, Lcom/b/a/c/b;->b:[B

    invoke-static {v0, p2, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 196
    return-void
.end method

.method public final b()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 310
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lcom/b/a/c/b;->b:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 254
    if-ne p1, p0, :cond_1

    .line 276
    :cond_0
    :goto_0
    return v0

    .line 258
    :cond_1
    instance-of v2, p1, Lcom/b/a/c/b;

    if-nez v2, :cond_2

    move v0, v1

    .line 259
    goto :goto_0

    .line 262
    :cond_2
    check-cast p1, Lcom/b/a/c/b;

    .line 263
    iget-object v2, p0, Lcom/b/a/c/b;->b:[B

    array-length v3, v2

    .line 264
    iget-object v2, p1, Lcom/b/a/c/b;->b:[B

    array-length v2, v2

    if-eq v3, v2, :cond_3

    move v0, v1

    .line 265
    goto :goto_0

    .line 268
    :cond_3
    iget-object v4, p0, Lcom/b/a/c/b;->b:[B

    .line 269
    iget-object v5, p1, Lcom/b/a/c/b;->b:[B

    move v2, v1

    .line 270
    :goto_1
    if-ge v2, v3, :cond_0

    .line 271
    aget-byte v6, v4, v2

    aget-byte v7, v5, v2

    if-eq v6, v7, :cond_4

    move v0, v1

    .line 272
    goto :goto_0

    .line 270
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public final hashCode()I
    .locals 5

    .prologue
    .line 283
    iget v0, p0, Lcom/b/a/c/b;->c:I

    .line 285
    if-nez v0, :cond_2

    .line 286
    iget-object v4, p0, Lcom/b/a/c/b;->b:[B

    .line 287
    iget-object v0, p0, Lcom/b/a/c/b;->b:[B

    array-length v2, v0

    .line 290
    const/4 v0, 0x0

    move v1, v0

    move v0, v2

    :goto_0
    if-ge v1, v2, :cond_0

    .line 291
    mul-int/lit8 v0, v0, 0x1f

    aget-byte v3, v4, v1

    add-int/2addr v3, v0

    .line 290
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v3

    goto :goto_0

    .line 293
    :cond_0
    if-nez v0, :cond_1

    .line 294
    const/4 v0, 0x1

    .line 297
    :cond_1
    iput v0, p0, Lcom/b/a/c/b;->c:I

    .line 300
    :cond_2
    return v0
.end method
