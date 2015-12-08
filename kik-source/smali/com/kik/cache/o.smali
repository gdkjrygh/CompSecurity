.class public final Lcom/kik/cache/o;
.super Lcom/kik/cache/y;
.source "SourceFile"


# instance fields
.field private final f:[B

.field private g:Z

.field private h:Lkik/a/z;

.field private i:Lcom/kik/android/a;

.field private j:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lkik/a/d/a/a;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;ZLkik/a/z;[BLcom/kik/android/a;)V
    .locals 9

    .prologue
    .line 70
    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/kik/cache/y;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 28
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/kik/cache/o;->g:Z

    .line 71
    iput-boolean p6, p0, Lcom/kik/cache/o;->g:Z

    .line 72
    move-object/from16 v0, p7

    iput-object v0, p0, Lcom/kik/cache/o;->h:Lkik/a/z;

    .line 73
    move-object/from16 v0, p8

    iput-object v0, p0, Lcom/kik/cache/o;->f:[B

    .line 74
    move-object/from16 v0, p9

    iput-object v0, p0, Lcom/kik/cache/o;->i:Lcom/kik/android/a;

    .line 75
    if-eqz p1, :cond_0

    .line 76
    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/cache/o;->j:Ljava/lang/String;

    .line 78
    :cond_0
    return-void
.end method

.method public static a(Lkik/a/d/a/a;Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZLkik/a/z;[BLcom/kik/android/a;)Lcom/kik/cache/o;
    .locals 10

    .prologue
    .line 60
    if-nez p1, :cond_0

    .line 62
    const/4 v0, 0x0

    .line 64
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/cache/o;

    sget-object v4, Lcom/kik/cache/o;->a:Landroid/graphics/Bitmap$Config;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lcom/kik/cache/o;-><init>(Lkik/a/d/a/a;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;ZLkik/a/z;[BLcom/kik/android/a;)V

    goto :goto_0
.end method

.method public static a(Lkik/a/d/a/a;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/z;)Lcom/kik/cache/z;
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 36
    invoke-virtual {p0}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v1

    .line 39
    if-eqz v1, :cond_0

    const-string v0, "video"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v0, v5

    .line 54
    :goto_0
    return-object v0

    .line 44
    :cond_1
    invoke-interface {p3}, Lkik/a/f/k;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 45
    sget-object v2, Lcom/kik/cache/o;->e:Lcom/android/volley/r$b;

    sget-object v3, Lcom/kik/cache/o;->d:Lcom/android/volley/r$a;

    const/4 v4, 0x1

    move-object v0, p0

    move-object v5, p4

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v0 .. v7}, Lcom/kik/cache/o;->a(Lkik/a/d/a/a;Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZLkik/a/z;[BLcom/kik/android/a;)Lcom/kik/cache/o;

    move-result-object v0

    goto :goto_0

    .line 47
    :cond_2
    invoke-static {v1}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 48
    sget-object v0, Lcom/kik/cache/o;->e:Lcom/android/volley/r$b;

    sget-object v2, Lcom/kik/cache/o;->d:Lcom/android/volley/r$a;

    invoke-static {v1, v0, v2}, Lcom/kik/cache/a;->a(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)Lcom/kik/cache/a;

    move-result-object v0

    goto :goto_0

    .line 51
    :cond_3
    sget-object v2, Lcom/kik/cache/o;->e:Lcom/android/volley/r$b;

    sget-object v3, Lcom/kik/cache/o;->d:Lcom/android/volley/r$a;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v0 .. v7}, Lcom/kik/cache/o;->a(Lkik/a/d/a/a;Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZLkik/a/z;[BLcom/kik/android/a;)Lcom/kik/cache/o;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 153
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 154
    :cond_0
    const/4 v0, 0x0

    .line 156
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 148
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final a(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 12

    .prologue
    const/4 v1, 0x0

    const-wide v10, 0x408f400000000000L    # 1000.0

    .line 99
    iget-object v0, p0, Lcom/kik/cache/o;->f:[B

    if-eqz v0, :cond_1

    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 102
    :try_start_0
    iget-object v0, p1, Lcom/android/volley/k;->b:[B

    iget-object v1, p0, Lcom/kik/cache/o;->f:[B

    const/16 v4, 0x10

    new-array v4, v4, [B

    invoke-static {v0, v1, v4}, Lkik/a/h/h;->b([B[B[B)[B

    move-result-object v1

    .line 107
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 109
    new-instance v0, Lcom/android/volley/k;

    iget v6, p1, Lcom/android/volley/k;->a:I

    iget-object v7, p1, Lcom/android/volley/k;->c:Ljava/util/Map;

    iget-boolean v8, p1, Lcom/android/volley/k;->d:Z

    invoke-direct {v0, v6, v1, v7, v8}, Lcom/android/volley/k;-><init>(I[BLjava/util/Map;Z)V

    .line 111
    if-eqz v1, :cond_0

    move-object p1, v0

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/kik/cache/o;->i:Lcom/kik/android/a;

    const-string v1, "Content Downloaded"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Encrypted"

    const/4 v6, 0x1

    invoke-virtual {v0, v1, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Decryption Time"

    long-to-double v4, v4

    div-double/2addr v4, v10

    invoke-virtual {v0, v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Content Size"

    iget-object v4, p1, Lcom/android/volley/k;->b:[B

    array-length v4, v4

    int-to-long v4, v4

    invoke-virtual {v0, v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "App ID"

    iget-object v4, p0, Lcom/kik/cache/o;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V
    :try_end_0
    .catch Lorg/bouncycastle/crypto/RuntimeCryptoException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 143
    :goto_0
    invoke-super {p0, p1}, Lcom/kik/cache/y;->a(Lcom/android/volley/k;)Lcom/android/volley/r;

    move-result-object v0

    return-object v0

    .line 124
    :catch_0
    move-exception v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    .line 126
    iget-object v2, p0, Lcom/kik/cache/o;->i:Lcom/kik/android/a;

    const-string v3, "Content Decryption Failure"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Decryption Time"

    long-to-double v0, v0

    div-double/2addr v0, v10

    invoke-virtual {v2, v3, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    .line 130
    :catch_1
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 135
    :cond_1
    iget-object v0, p1, Lcom/android/volley/k;->b:[B

    if-nez v0, :cond_2

    move v0, v1

    .line 136
    :goto_1
    iget-object v2, p0, Lcom/kik/cache/o;->i:Lcom/kik/android/a;

    const-string v3, "Content Downloaded"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Is Encrypted"

    invoke-virtual {v2, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Content Size"

    int-to-long v4, v0

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "App ID"

    iget-object v2, p0, Lcom/kik/cache/o;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    .line 135
    :cond_2
    iget-object v0, p1, Lcom/android/volley/k;->b:[B

    array-length v0, v0

    goto :goto_1
.end method

.method public final a(II)Ljava/lang/String;
    .locals 3

    .prologue
    .line 170
    invoke-virtual {p0}, Lcom/kik/cache/o;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    invoke-static {v0}, Lcom/kik/cache/o;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#W"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "#H"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#!#ContentImageRequest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 172
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/kik/cache/o;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    invoke-static {v0}, Lcom/kik/cache/o;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ljava/util/Map;
    .locals 3

    .prologue
    .line 83
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 84
    iget-boolean v1, p0, Lcom/kik/cache/o;->g:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kik/cache/o;->h:Lkik/a/z;

    if-eqz v1, :cond_0

    .line 85
    const-string v1, "x-kik-jid"

    iget-object v2, p0, Lcom/kik/cache/o;->h:Lkik/a/z;

    invoke-virtual {v2}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const-string v1, "x-kik-password"

    iget-object v2, p0, Lcom/kik/cache/o;->h:Lkik/a/z;

    invoke-virtual {v2}, Lkik/a/z;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    :cond_0
    return-object v0
.end method

.method public final u()Lkik/a/d/a/a;
    .locals 1

    .prologue
    .line 183
    invoke-virtual {p0}, Lcom/kik/cache/o;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    return-object v0
.end method
