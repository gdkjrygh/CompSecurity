.class public final Lnet/jarlehansen/protobuf/javame/original/input/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:[B

.field private b:I

.field private c:I

.field private d:I

.field private e:Ljava/io/InputStream;

.field private f:I

.field private g:I

.field private h:I

.field private i:I


# direct methods
.method private constructor <init>([BII)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 385
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 364
    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->c:I

    .line 367
    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->f:I

    .line 374
    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    .line 377
    const v0, 0x7fffffff

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->h:I

    .line 380
    const/high16 v0, 0x4000000

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->i:I

    .line 386
    iput-object p1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    .line 387
    add-int v0, p2, p3

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    .line 388
    iput p2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 389
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->e:Ljava/io/InputStream;

    .line 390
    return-void
.end method

.method public static a([B)Lnet/jarlehansen/protobuf/javame/original/input/a;
    .locals 3

    .prologue
    .line 65
    new-instance v0, Lnet/jarlehansen/protobuf/javame/original/input/a;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, p0, v1, v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;-><init>([BII)V

    return-object v0
.end method

.method private a(Z)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 419
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    if-ge v0, v3, :cond_0

    .line 420
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "refillBuffer() called when buffer wasn\'t empty."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 423
    :cond_0
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    add-int/2addr v0, v3

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->h:I

    if-ne v0, v3, :cond_2

    .line 425
    if-eqz p1, :cond_1

    .line 426
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->a()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    :cond_1
    move v0, v2

    .line 449
    :goto_0
    return v0

    .line 432
    :cond_2
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    add-int/2addr v0, v3

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    .line 434
    iput v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 435
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->e:Ljava/io/InputStream;

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    .line 436
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    if-ne v0, v1, :cond_5

    .line 437
    iput v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    .line 438
    if-eqz p1, :cond_4

    .line 439
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->a()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 435
    :cond_3
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->e:Ljava/io/InputStream;

    iget-object v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v0

    goto :goto_1

    :cond_4
    move v0, v2

    .line 441
    goto :goto_0

    .line 444
    :cond_5
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->m()V

    .line 445
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    add-int/2addr v0, v1

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->c:I

    add-int/2addr v0, v1

    .line 446
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->i:I

    if-gt v0, v1, :cond_6

    if-gez v0, :cond_7

    .line 447
    :cond_6
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->e()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 449
    :cond_7
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private b(I)[I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v3, 0x0

    .line 241
    invoke-direct {p0, p1}, Lnet/jarlehansen/protobuf/javame/original/input/a;->c(I)B

    move-result v1

    .line 242
    add-int/lit8 v2, p1, 0x1

    .line 243
    if-ltz v1, :cond_0

    .line 244
    new-array v0, v6, [I

    aput v1, v0, v3

    aput v2, v0, v5

    .line 277
    :goto_0
    return-object v0

    .line 246
    :cond_0
    and-int/lit8 v0, v1, 0x7f

    .line 247
    invoke-direct {p0, v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;->c(I)B

    move-result v4

    if-ltz v4, :cond_2

    .line 248
    add-int/lit8 v1, v2, 0x1

    .line 249
    shl-int/lit8 v2, v4, 0x7

    or-int/2addr v0, v2

    .line 277
    :cond_1
    :goto_1
    new-array v2, v6, [I

    aput v0, v2, v3

    aput v1, v2, v5

    move-object v0, v2

    goto :goto_0

    .line 251
    :cond_2
    and-int/lit8 v1, v4, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    .line 252
    invoke-direct {p0, v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;->c(I)B

    move-result v4

    if-ltz v4, :cond_3

    .line 253
    add-int/lit8 v1, v2, 0x1

    .line 254
    shl-int/lit8 v2, v4, 0xe

    or-int/2addr v0, v2

    goto :goto_1

    .line 256
    :cond_3
    and-int/lit8 v1, v4, 0x7f

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    .line 257
    invoke-direct {p0, v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;->c(I)B

    move-result v4

    if-ltz v4, :cond_4

    .line 258
    add-int/lit8 v1, v2, 0x1

    .line 259
    shl-int/lit8 v2, v4, 0x15

    or-int/2addr v0, v2

    goto :goto_1

    .line 261
    :cond_4
    and-int/lit8 v1, v4, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    .line 262
    invoke-direct {p0, v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;->c(I)B

    move-result v4

    shl-int/lit8 v1, v4, 0x1c

    or-int/2addr v0, v1

    .line 263
    add-int/lit8 v1, v2, 0x1

    .line 264
    if-gez v4, :cond_1

    move v0, v3

    .line 266
    :goto_2
    const/4 v2, 0x5

    if-ge v0, v2, :cond_6

    .line 267
    invoke-direct {p0, v1}, Lnet/jarlehansen/protobuf/javame/original/input/a;->c(I)B

    move-result v2

    if-ltz v2, :cond_5

    .line 268
    add-int/lit8 v1, v1, 0x1

    .line 269
    new-array v0, v6, [I

    aput v4, v0, v3

    aput v1, v0, v5

    goto :goto_0

    .line 266
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 272
    :cond_6
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->c()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
.end method

.method private c(I)B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 281
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    aget-byte v0, v0, p1

    return v0
.end method

.method private d(I)[B
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v10, 0x800

    const/4 v5, 0x1

    const/4 v3, -0x1

    const/4 v1, 0x0

    .line 473
    if-gez p1, :cond_0

    .line 474
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->b()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 477
    :cond_0
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/2addr v0, v2

    add-int/2addr v0, p1

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->h:I

    if-le v0, v2, :cond_1

    .line 479
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->h:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    sub-int/2addr v0, v1

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->e(I)V

    .line 481
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->a()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 484
    :cond_1
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    sub-int/2addr v0, v2

    if-gt p1, v0, :cond_2

    .line 486
    new-array v0, p1, [B

    .line 487
    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    invoke-static {v2, v3, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 488
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/2addr v1, p1

    iput v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 581
    :goto_0
    return-object v0

    .line 490
    :cond_2
    if-ge p1, v10, :cond_4

    .line 497
    new-array v2, p1, [B

    .line 498
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    sub-int/2addr v0, v3

    .line 499
    iget-object v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    iget v4, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    invoke-static {v3, v4, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 500
    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iput v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 507
    invoke-direct {p0, v5}, Lnet/jarlehansen/protobuf/javame/original/input/a;->a(Z)Z

    .line 509
    :goto_1
    sub-int v3, p1, v0

    iget v4, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    if-le v3, v4, :cond_3

    .line 510
    iget-object v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    iget v4, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    invoke-static {v3, v1, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 511
    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    add-int/2addr v0, v3

    .line 512
    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iput v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 513
    invoke-direct {p0, v5}, Lnet/jarlehansen/protobuf/javame/original/input/a;->a(Z)Z

    goto :goto_1

    .line 516
    :cond_3
    iget-object v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    sub-int v4, p1, v0

    invoke-static {v3, v1, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 517
    sub-int v0, p1, v0

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    move-object v0, v2

    .line 519
    goto :goto_0

    .line 538
    :cond_4
    iget v5, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 539
    iget v6, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    .line 542
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    add-int/2addr v0, v2

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    .line 543
    iput v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 544
    iput v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    .line 547
    sub-int v0, v6, v5

    sub-int v0, p1, v0

    .line 548
    new-instance v7, Ljava/util/Vector;

    invoke-direct {v7}, Ljava/util/Vector;-><init>()V

    move v4, v0

    .line 550
    :goto_2
    if-lez v4, :cond_8

    .line 551
    invoke-static {v4, v10}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v8, v0, [B

    move v0, v1

    .line 553
    :goto_3
    array-length v2, v8

    if-ge v0, v2, :cond_7

    .line 554
    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->e:Ljava/io/InputStream;

    if-nez v2, :cond_5

    move v2, v3

    .line 555
    :goto_4
    if-ne v2, v3, :cond_6

    .line 556
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->a()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 554
    :cond_5
    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->e:Ljava/io/InputStream;

    array-length v9, v8

    sub-int/2addr v9, v0

    invoke-virtual {v2, v8, v0, v9}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    goto :goto_4

    .line 558
    :cond_6
    iget v9, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    add-int/2addr v9, v2

    iput v9, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    .line 559
    add-int/2addr v0, v2

    .line 560
    goto :goto_3

    .line 561
    :cond_7
    array-length v0, v8

    sub-int v0, v4, v0

    .line 563
    invoke-virtual {v7, v8}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    move v4, v0

    .line 564
    goto :goto_2

    .line 567
    :cond_8
    new-array v4, p1, [B

    .line 570
    sub-int v0, v6, v5

    .line 571
    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    invoke-static {v2, v5, v4, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v2, v1

    move v3, v0

    .line 574
    :goto_5
    invoke-virtual {v7}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v2, v0, :cond_9

    .line 575
    invoke-virtual {v7, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    .line 576
    array-length v5, v0

    invoke-static {v0, v1, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 577
    array-length v0, v0

    add-int/2addr v3, v0

    .line 574
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    :cond_9
    move-object v0, v4

    .line 581
    goto/16 :goto_0
.end method

.method private e(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 592
    if-gez p1, :cond_0

    .line 593
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->b()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 596
    :cond_0
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->h:I

    if-le v0, v1, :cond_1

    .line 598
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->h:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    sub-int/2addr v0, v1

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->e(I)V

    .line 600
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->a()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 603
    :cond_1
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_3

    .line 605
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/2addr v0, p1

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 624
    :cond_2
    return-void

    .line 609
    :cond_3
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    sub-int/2addr v0, v1

    .line 610
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    add-int/2addr v1, v0

    iput v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    .line 611
    iput v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 612
    iput v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    move v1, v0

    .line 615
    :goto_0
    if-ge v1, p1, :cond_2

    .line 616
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->e:Ljava/io/InputStream;

    if-nez v0, :cond_4

    const/4 v0, -0x1

    .line 617
    :goto_1
    if-gtz v0, :cond_5

    .line 618
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->a()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 616
    :cond_4
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->e:Ljava/io/InputStream;

    sub-int v2, p1, v1

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    long-to-int v0, v2

    goto :goto_1

    .line 620
    :cond_5
    add-int/2addr v1, v0

    .line 621
    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    add-int/2addr v0, v2

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    goto :goto_0
.end method

.method private l()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 290
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v0

    .line 291
    if-ltz v0, :cond_1

    .line 319
    :cond_0
    :goto_0
    return v0

    .line 294
    :cond_1
    and-int/lit8 v0, v0, 0x7f

    .line 295
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v1

    if-ltz v1, :cond_2

    .line 296
    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    goto :goto_0

    .line 298
    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    .line 299
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v1

    if-ltz v1, :cond_3

    .line 300
    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    goto :goto_0

    .line 302
    :cond_3
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    .line 303
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v1

    if-ltz v1, :cond_4

    .line 304
    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    goto :goto_0

    .line 306
    :cond_4
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    .line 307
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v1

    shl-int/lit8 v2, v1, 0x1c

    or-int/2addr v0, v2

    .line 308
    if-gez v1, :cond_0

    .line 310
    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_5

    .line 311
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v2

    if-gez v2, :cond_0

    .line 310
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 314
    :cond_5
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->c()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
.end method

.method private m()V
    .locals 2

    .prologue
    .line 400
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->c:I

    add-int/2addr v0, v1

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    .line 401
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->g:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    add-int/2addr v0, v1

    .line 402
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->h:I

    if-le v0, v1, :cond_0

    .line 404
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->h:I

    sub-int/2addr v0, v1

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->c:I

    .line 405
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->c:I

    sub-int/2addr v0, v1

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    .line 409
    :goto_0
    return-void

    .line 407
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->c:I

    goto :goto_0
.end method

.method private n()B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 460
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    if-ne v0, v1, :cond_0

    .line 461
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->a(Z)Z

    .line 463
    :cond_0
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    aget-byte v0, v0, v1

    return v0
.end method


# virtual methods
.method public a()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 77
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    if-ne v1, v2, :cond_0

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->a(Z)Z

    move-result v1

    if-nez v1, :cond_0

    .line 78
    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->f:I

    .line 88
    :goto_0
    return v0

    .line 82
    :cond_0
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->l()I

    move-result v0

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->f:I

    .line 83
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->f:I

    if-nez v0, :cond_1

    .line 85
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->d()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 88
    :cond_1
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->f:I

    goto :goto_0
.end method

.method public a(I)Ljava/util/Vector;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 131
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 132
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->l()I

    move-result v0

    .line 133
    new-array v1, v0, [B

    .line 134
    iget-object v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    iget v4, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    invoke-static {v3, v4, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 136
    invoke-virtual {v2, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 137
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 138
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 139
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    if-ne v1, v3, :cond_0

    move-object v0, v2

    .line 162
    :goto_0
    return-object v0

    .line 143
    :cond_0
    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->b(I)[I

    move-result-object v1

    .line 144
    aget v0, v1, v5

    .line 145
    :goto_1
    invoke-static {v0}, Lnet/jarlehansen/protobuf/javame/original/a;->b(I)I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 147
    const/4 v0, 0x1

    aget v0, v1, v0

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 148
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->l()I

    move-result v0

    .line 149
    new-array v1, v0, [B

    .line 150
    iget-object v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    iget v4, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    invoke-static {v3, v4, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 152
    invoke-virtual {v2, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 153
    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 154
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    if-ne v0, v1, :cond_2

    :cond_1
    move-object v0, v2

    .line 162
    goto :goto_0

    .line 158
    :cond_2
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 159
    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->b(I)[I

    move-result-object v1

    .line 160
    aget v0, v1, v5

    goto :goto_1
.end method

.method public b()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 95
    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public c()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 100
    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->j()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public d()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 105
    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public e()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 110
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->l()I

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 115
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->l()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 167
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->l()I

    move-result v1

    .line 168
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    sub-int/2addr v0, v2

    if-ge v1, v0, :cond_0

    if-lez v1, :cond_0

    .line 171
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    const-string/jumbo v4, "UTF-8"

    invoke-direct {v0, v2, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 172
    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/2addr v1, v2

    iput v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 176
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {p0, v1}, Lnet/jarlehansen/protobuf/javame/original/input/a;->d(I)[B

    move-result-object v1

    const-string/jumbo v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_0
.end method

.method public h()Lnet/jarlehansen/protobuf/javame/b;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 182
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->l()I

    move-result v1

    .line 183
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->b:I

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    sub-int/2addr v0, v2

    if-ge v1, v0, :cond_0

    if-lez v1, :cond_0

    .line 186
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->a:[B

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    invoke-static {v0, v2, v1}, Lnet/jarlehansen/protobuf/javame/b;->a([BII)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    .line 187
    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    add-int/2addr v1, v2

    iput v1, p0, Lnet/jarlehansen/protobuf/javame/original/input/a;->d:I

    .line 191
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, v1}, Lnet/jarlehansen/protobuf/javame/original/input/a;->d(I)[B

    move-result-object v0

    invoke-static {v0}, Lnet/jarlehansen/protobuf/javame/b;->a([B)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    goto :goto_0
.end method

.method public i()J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 324
    const/4 v2, 0x0

    .line 325
    const-wide/16 v0, 0x0

    .line 326
    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_1

    .line 327
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v3

    .line 328
    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    .line 329
    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    .line 330
    return-wide v0

    .line 331
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 332
    goto :goto_0

    .line 333
    :cond_1
    invoke-static {}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;->c()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
.end method

.method j()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 338
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v0

    .line 339
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v1

    .line 340
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v2

    .line 341
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v3

    .line 342
    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method k()J
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v12, 0xff

    .line 347
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v0

    .line 348
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v1

    .line 349
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v2

    .line 350
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v3

    .line 351
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v4

    .line 352
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v5

    .line 353
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v6

    .line 354
    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->n()B

    move-result v7

    .line 355
    int-to-long v8, v0

    and-long/2addr v8, v12

    int-to-long v0, v1

    and-long/2addr v0, v12

    const/16 v10, 0x8

    shl-long/2addr v0, v10

    or-long/2addr v0, v8

    int-to-long v8, v2

    and-long/2addr v8, v12

    const/16 v2, 0x10

    shl-long/2addr v8, v2

    or-long/2addr v0, v8

    int-to-long v2, v3

    and-long/2addr v2, v12

    const/16 v8, 0x18

    shl-long/2addr v2, v8

    or-long/2addr v0, v2

    int-to-long v2, v4

    and-long/2addr v2, v12

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v5

    and-long/2addr v2, v12

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v6

    and-long/2addr v2, v12

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v7

    and-long/2addr v2, v12

    const/16 v4, 0x38

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method
