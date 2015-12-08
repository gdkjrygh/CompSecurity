.class public final Lcom/bumptech/glide/load/resource/bitmap/t;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field private volatile a:[B

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;[B)V
    .locals 2

    .prologue
    .line 70
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 62
    const/4 v0, -0x1

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    .line 71
    if-eqz p2, :cond_0

    array-length v0, p2

    if-nez v0, :cond_1

    .line 72
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "buffer is null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_1
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    .line 75
    return-void
.end method

.method private a(Ljava/io/InputStream;[B)I
    .locals 4

    .prologue
    const/4 v2, -0x1

    const/4 v3, 0x0

    .line 130
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    if-eq v0, v2, :cond_0

    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->c:I

    if-lt v0, v1, :cond_2

    .line 132
    :cond_0
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    .line 133
    if-lez v0, :cond_1

    .line 134
    iput v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    .line 135
    iput v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    .line 136
    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    .line 168
    :cond_1
    :goto_0
    return v0

    .line 145
    :cond_2
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    if-nez v0, :cond_5

    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->c:I

    array-length v1, p2

    if-le v0, v1, :cond_5

    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    array-length v1, p2

    if-ne v0, v1, :cond_5

    .line 147
    array-length v0, p2

    mul-int/lit8 v0, v0, 0x2

    .line 148
    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->c:I

    if-le v0, v1, :cond_3

    .line 149
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->c:I

    .line 151
    :cond_3
    const-string v1, "BufferedIs"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 154
    new-array v0, v0, [B

    .line 155
    array-length v1, p2

    invoke-static {p2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    move-object p2, v0

    .line 164
    :cond_4
    :goto_1
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    .line 165
    iput v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    iput v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    .line 166
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    array-length v1, p2

    iget v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v1, v2

    invoke-virtual {p1, p2, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    .line 167
    if-gtz v1, :cond_6

    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    :goto_2
    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    move v0, v1

    .line 168
    goto :goto_0

    .line 159
    :cond_5
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    if-lez v0, :cond_4

    .line 160
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    array-length v1, p2

    iget v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    sub-int/2addr v1, v2

    invoke-static {p2, v0, p2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 167
    :cond_6
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    add-int/2addr v0, v1

    goto :goto_2
.end method

.method private static b()Ljava/io/IOException;
    .locals 2

    .prologue
    .line 97
    new-instance v0, Ljava/io/IOException;

    const-string v1, "BufferedInputStream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 1

    .prologue
    .line 108
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    array-length v0, v0

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    monitor-exit p0

    return-void

    .line 108
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized available()I
    .locals 3

    .prologue
    .line 89
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->in:Ljava/io/InputStream;

    .line 90
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    if-eqz v1, :cond_0

    if-nez v0, :cond_1

    .line 91
    :cond_0
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/t;->b()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 93
    :cond_1
    :try_start_1
    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    add-int/2addr v0, v1

    monitor-exit p0

    return v0
.end method

.method public final close()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 120
    iput-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    .line 121
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->in:Ljava/io/InputStream;

    .line 122
    iput-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->in:Ljava/io/InputStream;

    .line 123
    if-eqz v0, :cond_0

    .line 124
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 126
    :cond_0
    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 1

    .prologue
    .line 190
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->c:I

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->c:I

    .line 191
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    monitor-exit p0

    return-void

    .line 190
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final markSupported()Z
    .locals 1

    .prologue
    .line 204
    const/4 v0, 0x1

    return v0
.end method

.method public final declared-synchronized read()I
    .locals 5

    .prologue
    const/4 v0, -0x1

    .line 222
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    .line 223
    iget-object v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->in:Ljava/io/InputStream;

    .line 224
    if-eqz v1, :cond_0

    if-nez v2, :cond_1

    .line 225
    :cond_0
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/t;->b()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 229
    :cond_1
    :try_start_1
    iget v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    iget v4, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    if-lt v3, v4, :cond_3

    invoke-direct {p0, v2, v1}, Lcom/bumptech/glide/load/resource/bitmap/t;->a(Ljava/io/InputStream;[B)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-ne v2, v0, :cond_3

    .line 245
    :cond_2
    :goto_0
    monitor-exit p0

    return v0

    .line 234
    :cond_3
    :try_start_2
    iget-object v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    if-eq v1, v2, :cond_4

    .line 235
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    .line 236
    if-nez v1, :cond_4

    .line 237
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/t;->b()Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 242
    :cond_4
    iget v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v2, v3

    if-lez v2, :cond_2

    .line 243
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    aget-byte v0, v1, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    and-int/lit16 v0, v0, 0xff

    goto :goto_0
.end method

.method public final declared-synchronized read([BII)I
    .locals 6

    .prologue
    const/4 v1, -0x1

    .line 271
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    .line 272
    if-nez v2, :cond_0

    .line 273
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/t;->b()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 276
    :cond_0
    if-nez p3, :cond_2

    .line 277
    const/4 p3, 0x0

    .line 329
    :cond_1
    :goto_0
    monitor-exit p0

    return p3

    .line 279
    :cond_2
    :try_start_1
    iget-object v4, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->in:Ljava/io/InputStream;

    .line 280
    if-nez v4, :cond_3

    .line 281
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/t;->b()Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 285
    :cond_3
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    iget v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    if-ge v0, v3, :cond_7

    .line 287
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v0, v3

    if-lt v0, p3, :cond_5

    move v0, p3

    .line 288
    :goto_1
    iget v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    invoke-static {v2, v3, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 289
    iget v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    add-int/2addr v3, v0

    iput v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    .line 290
    if-eq v0, p3, :cond_4

    invoke-virtual {v4}, Ljava/io/InputStream;->available()I

    move-result v3

    if-nez v3, :cond_6

    :cond_4
    move p3, v0

    .line 291
    goto :goto_0

    .line 287
    :cond_5
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v0, v3

    goto :goto_1

    .line 293
    :cond_6
    add-int/2addr p2, v0

    .line 294
    sub-int v3, p3, v0

    .line 303
    :goto_2
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    if-ne v0, v1, :cond_9

    array-length v0, v2

    if-lt v3, v0, :cond_9

    .line 304
    invoke-virtual {v4, p1, p2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 305
    if-ne v0, v1, :cond_d

    .line 306
    if-ne v3, p3, :cond_8

    move p3, v1

    goto :goto_0

    :cond_7
    move v3, p3

    .line 296
    goto :goto_2

    .line 306
    :cond_8
    sub-int/2addr p3, v3

    goto :goto_0

    .line 309
    :cond_9
    invoke-direct {p0, v4, v2}, Lcom/bumptech/glide/load/resource/bitmap/t;->a(Ljava/io/InputStream;[B)I

    move-result v0

    if-ne v0, v1, :cond_b

    .line 310
    if-ne v3, p3, :cond_a

    move p3, v1

    goto :goto_0

    :cond_a
    sub-int/2addr p3, v3

    goto :goto_0

    .line 313
    :cond_b
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    if-eq v2, v0, :cond_c

    .line 314
    iget-object v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    .line 315
    if-nez v2, :cond_c

    .line 316
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/t;->b()Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 320
    :cond_c
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v5, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v0, v5

    if-lt v0, v3, :cond_e

    move v0, v3

    .line 321
    :goto_3
    iget v5, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    invoke-static {v2, v5, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 322
    iget v5, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    add-int/2addr v5, v0

    iput v5, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    .line 324
    :cond_d
    sub-int/2addr v3, v0

    .line 325
    if-eqz v3, :cond_1

    .line 328
    invoke-virtual {v4}, Ljava/io/InputStream;->available()I

    move-result v5

    if-nez v5, :cond_f

    .line 329
    sub-int/2addr p3, v3

    goto :goto_0

    .line 320
    :cond_e
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v5, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-int/2addr v0, v5

    goto :goto_3

    .line 331
    :cond_f
    add-int/2addr p2, v0

    .line 332
    goto :goto_2
.end method

.method public final declared-synchronized reset()V
    .locals 2

    .prologue
    .line 346
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    if-nez v0, :cond_0

    .line 347
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 349
    :cond_0
    const/4 v0, -0x1

    :try_start_1
    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    if-ne v0, v1, :cond_1

    .line 350
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/u;

    const-string v1, "Mark has been invalidated"

    invoke-direct {v0, v1}, Lcom/bumptech/glide/load/resource/bitmap/u;-><init>(Ljava/lang/String;)V

    throw v0

    .line 352
    :cond_1
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 353
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized skip(J)J
    .locals 7

    .prologue
    const/4 v6, -0x1

    .line 370
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->a:[B

    .line 371
    iget-object v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->in:Ljava/io/InputStream;

    .line 372
    if-nez v2, :cond_0

    .line 373
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/t;->b()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 375
    :cond_0
    const-wide/16 v0, 0x1

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    .line 376
    const-wide/16 p1, 0x0

    .line 402
    :goto_0
    monitor-exit p0

    return-wide p1

    .line 378
    :cond_1
    if-nez v3, :cond_2

    .line 379
    :try_start_1
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/t;->b()Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 382
    :cond_2
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    cmp-long v0, v0, p1

    if-ltz v0, :cond_3

    .line 383
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    int-to-long v0, v0

    add-long/2addr v0, p1

    long-to-int v0, v0

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    goto :goto_0

    .line 386
    :cond_3
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    .line 387
    iget v4, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iput v4, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    .line 389
    iget v4, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->d:I

    if-eq v4, v6, :cond_6

    iget v4, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->c:I

    int-to-long v4, v4

    cmp-long v4, p1, v4

    if-gtz v4, :cond_6

    .line 390
    invoke-direct {p0, v3, v2}, Lcom/bumptech/glide/load/resource/bitmap/t;->a(Ljava/io/InputStream;[B)I

    move-result v2

    if-ne v2, v6, :cond_4

    move-wide p1, v0

    .line 391
    goto :goto_0

    .line 393
    :cond_4
    iget v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iget v3, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    sub-long v4, p1, v0

    cmp-long v2, v2, v4

    if-ltz v2, :cond_5

    .line 394
    iget v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    int-to-long v2, v2

    sub-long v0, p1, v0

    add-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    goto :goto_0

    .line 398
    :cond_5
    iget v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget v2, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    int-to-long v2, v2

    sub-long p1, v0, v2

    .line 399
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->b:I

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/t;->e:I

    goto :goto_0

    .line 402
    :cond_6
    sub-long v4, p1, v0

    invoke-virtual {v3, v4, v5}, Ljava/io/InputStream;->skip(J)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v2

    add-long p1, v0, v2

    goto :goto_0
.end method
