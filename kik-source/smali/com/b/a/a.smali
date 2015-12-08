.class public final Lcom/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/k;


# instance fields
.field public final a:Z

.field private final b:[B

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>([BIZ)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput v0, p0, Lcom/b/a/a;->e:I

    .line 59
    iput-object p1, p0, Lcom/b/a/a;->b:[B

    .line 60
    iput v0, p0, Lcom/b/a/a;->c:I

    .line 61
    add-int/lit8 v0, p2, 0x0

    iput v0, p0, Lcom/b/a/a;->d:I

    .line 62
    iput-boolean p3, p0, Lcom/b/a/a;->a:Z

    .line 63
    return-void
.end method

.method private b(I)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 150
    invoke-static {p1}, Lcom/b/a/y;->a(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 174
    invoke-static {}, Lcom/b/a/p;->g()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 153
    :pswitch_0
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    .line 172
    :goto_0
    return v0

    .line 156
    :pswitch_1
    iget v1, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/b/a/a;->c:I

    goto :goto_0

    .line 159
    :pswitch_2
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v1

    .line 160
    if-gez v1, :cond_0

    .line 161
    invoke-static {}, Lcom/b/a/p;->c()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 162
    :cond_0
    iget v2, p0, Lcom/b/a/a;->c:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/b/a/a;->c:I

    goto :goto_0

    .line 165
    :cond_1
    :pswitch_3
    iget v2, p0, Lcom/b/a/a;->c:I

    iget v3, p0, Lcom/b/a/a;->d:I

    if-ne v2, v3, :cond_3

    iput v1, p0, Lcom/b/a/a;->e:I

    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    invoke-direct {p0, v2}, Lcom/b/a/a;->b(I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 166
    :cond_2
    invoke-static {p1}, Lcom/b/a/y;->b(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lcom/b/a/y;->a(II)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/b/a/a;->a(I)V

    goto :goto_0

    .line 165
    :cond_3
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v2

    ushr-int/lit8 v3, v2, 0x3

    if-nez v3, :cond_4

    invoke-static {}, Lcom/b/a/p;->e()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_4
    iput v2, p0, Lcom/b/a/a;->e:I

    goto :goto_1

    :pswitch_4
    move v0, v1

    .line 169
    goto :goto_0

    .line 171
    :pswitch_5
    iget v1, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/b/a/a;->c:I

    goto :goto_0

    .line 150
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private i()I
    .locals 5

    .prologue
    .line 403
    iget-object v0, p0, Lcom/b/a/a;->b:[B

    iget v1, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/b/a/a;->c:I

    aget-byte v0, v0, v1

    .line 404
    if-ltz v0, :cond_1

    .line 446
    :cond_0
    :goto_0
    return v0

    .line 408
    :cond_1
    and-int/lit8 v0, v0, 0x7f

    .line 409
    iget-object v1, p0, Lcom/b/a/a;->b:[B

    iget v2, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/b/a/a;->c:I

    aget-byte v1, v1, v2

    if-ltz v1, :cond_2

    .line 411
    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    goto :goto_0

    .line 415
    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    .line 416
    iget-object v1, p0, Lcom/b/a/a;->b:[B

    iget v2, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/b/a/a;->c:I

    aget-byte v1, v1, v2

    if-ltz v1, :cond_3

    .line 418
    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    goto :goto_0

    .line 422
    :cond_3
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    .line 423
    iget-object v1, p0, Lcom/b/a/a;->b:[B

    iget v2, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/b/a/a;->c:I

    aget-byte v1, v1, v2

    if-ltz v1, :cond_4

    .line 425
    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    goto :goto_0

    .line 429
    :cond_4
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    .line 430
    iget-object v1, p0, Lcom/b/a/a;->b:[B

    iget v2, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/b/a/a;->c:I

    aget-byte v1, v1, v2

    shl-int/lit8 v2, v1, 0x1c

    or-int/2addr v0, v2

    .line 431
    if-gez v1, :cond_0

    .line 434
    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_5

    .line 436
    iget-object v2, p0, Lcom/b/a/a;->b:[B

    iget v3, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/b/a/a;->c:I

    aget-byte v2, v2, v3

    if-gez v2, :cond_0

    .line 434
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 441
    :cond_5
    invoke-static {}, Lcom/b/a/p;->d()Lcom/b/a/p;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 99
    iget v0, p0, Lcom/b/a/a;->e:I

    return v0
.end method

.method public final a(Lcom/b/a/u;)I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 201
    iget v1, p0, Lcom/b/a/a;->c:I

    iget v2, p0, Lcom/b/a/a;->d:I

    if-ne v1, v2, :cond_0

    .line 203
    iput v0, p0, Lcom/b/a/a;->e:I

    .line 229
    :goto_0
    return v0

    .line 207
    :cond_0
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v2

    .line 208
    ushr-int/lit8 v1, v2, 0x3

    .line 209
    if-nez v1, :cond_2

    .line 211
    iget-boolean v1, p0, Lcom/b/a/a;->a:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x7

    and-int/lit8 v2, v2, 0x7

    if-ne v1, v2, :cond_1

    .line 216
    iput v0, p0, Lcom/b/a/a;->e:I

    goto :goto_0

    .line 220
    :cond_1
    invoke-static {}, Lcom/b/a/p;->e()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 222
    :cond_2
    iget-boolean v3, p0, Lcom/b/a/a;->a:Z

    if-eqz v3, :cond_3

    const/4 v3, 0x4

    and-int/lit8 v4, v2, 0x7

    if-ne v3, v4, :cond_3

    .line 224
    iput v0, p0, Lcom/b/a/a;->e:I

    goto :goto_0

    .line 228
    :cond_3
    iput v2, p0, Lcom/b/a/a;->e:I

    move v0, v1

    .line 229
    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 361
    iget-boolean v0, p0, Lcom/b/a/a;->a:Z

    if-eqz v0, :cond_2

    .line 362
    if-nez p1, :cond_0

    invoke-interface {p2}, Lcom/b/a/u;->a()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    invoke-interface {p2, p0, p1}, Lcom/b/a/u;->a(Lcom/b/a/k;Ljava/lang/Object;)V

    invoke-interface {p2, p1}, Lcom/b/a/u;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/b/a/x;

    invoke-direct {v0, p1, p2}, Lcom/b/a/x;-><init>(Ljava/lang/Object;Lcom/b/a/u;)V

    throw v0

    :cond_1
    invoke-virtual {p0, v3}, Lcom/b/a/a;->a(I)V

    .line 383
    :goto_0
    return-object p1

    .line 364
    :cond_2
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v0

    .line 365
    if-gez v0, :cond_3

    .line 366
    invoke-static {}, Lcom/b/a/p;->c()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 369
    :cond_3
    iget v1, p0, Lcom/b/a/a;->d:I

    .line 371
    iget v2, p0, Lcom/b/a/a;->c:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/b/a/a;->d:I

    .line 373
    if-nez p1, :cond_4

    .line 374
    invoke-interface {p2}, Lcom/b/a/u;->a()Ljava/lang/Object;

    move-result-object p1

    .line 375
    :cond_4
    invoke-interface {p2, p0, p1}, Lcom/b/a/u;->a(Lcom/b/a/k;Ljava/lang/Object;)V

    .line 376
    invoke-interface {p2, p1}, Lcom/b/a/u;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 377
    new-instance v0, Lcom/b/a/x;

    invoke-direct {v0, p1, p2}, Lcom/b/a/x;-><init>(Ljava/lang/Object;Lcom/b/a/u;)V

    throw v0

    .line 378
    :cond_5
    invoke-virtual {p0, v3}, Lcom/b/a/a;->a(I)V

    .line 381
    iput v1, p0, Lcom/b/a/a;->d:I

    goto :goto_0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 136
    iget v0, p0, Lcom/b/a/a;->e:I

    if-eq v0, p1, :cond_0

    .line 138
    invoke-static {}, Lcom/b/a/p;->f()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 140
    :cond_0
    return-void
.end method

.method public final a(ILcom/b/a/u;)V
    .locals 1

    .prologue
    .line 196
    iget v0, p0, Lcom/b/a/a;->e:I

    invoke-direct {p0, v0}, Lcom/b/a/a;->b(I)Z

    .line 197
    return-void
.end method

.method public final b()J
    .locals 8

    .prologue
    .line 247
    iget-object v5, p0, Lcom/b/a/a;->b:[B

    iget v3, p0, Lcom/b/a/a;->c:I

    const/4 v2, 0x0

    const-wide/16 v0, 0x0

    :goto_0
    const/16 v4, 0x40

    if-ge v2, v4, :cond_1

    add-int/lit8 v4, v3, 0x1

    aget-byte v3, v5, v3

    and-int/lit8 v6, v3, 0x7f

    int-to-long v6, v6

    shl-long/2addr v6, v2

    or-long/2addr v0, v6

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    iput v4, p0, Lcom/b/a/a;->c:I

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    move v3, v4

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/b/a/p;->d()Lcom/b/a/p;

    move-result-object v0

    throw v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 259
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 3

    .prologue
    .line 277
    iget-object v0, p0, Lcom/b/a/a;->b:[B

    iget v1, p0, Lcom/b/a/a;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/b/a/a;->c:I

    aget-byte v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 283
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v0

    return v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 292
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v0

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 3

    .prologue
    .line 323
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v0

    .line 324
    if-gez v0, :cond_0

    .line 325
    invoke-static {}, Lcom/b/a/p;->c()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 327
    :cond_0
    iget v1, p0, Lcom/b/a/a;->c:I

    add-int/2addr v1, v0

    iget v2, p0, Lcom/b/a/a;->d:I

    if-le v1, v2, :cond_1

    .line 328
    invoke-static {}, Lcom/b/a/p;->b()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 330
    :cond_1
    iget v1, p0, Lcom/b/a/a;->c:I

    .line 332
    iget v2, p0, Lcom/b/a/a;->c:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/b/a/a;->c:I

    .line 334
    iget-object v2, p0, Lcom/b/a/a;->b:[B

    invoke-static {v2, v1, v0}, Lcom/b/a/w$a;->a([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lcom/b/a/b;
    .locals 5

    .prologue
    .line 339
    invoke-direct {p0}, Lcom/b/a/a;->i()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Lcom/b/a/p;->c()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_0
    iget v1, p0, Lcom/b/a/a;->c:I

    add-int/2addr v1, v0

    iget v2, p0, Lcom/b/a/a;->d:I

    if-le v1, v2, :cond_1

    invoke-static {}, Lcom/b/a/p;->b()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_1
    new-array v1, v0, [B

    iget-object v2, p0, Lcom/b/a/a;->b:[B

    iget v3, p0, Lcom/b/a/a;->c:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Lcom/b/a/a;->c:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/b/a/a;->c:I

    invoke-static {v1}, Lcom/b/a/b;->a([B)Lcom/b/a/b;

    move-result-object v0

    return-object v0
.end method
