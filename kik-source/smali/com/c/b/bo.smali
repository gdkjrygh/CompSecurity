.class final Lcom/c/b/bo;
.super Lcom/c/b/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/bo$c;,
        Lcom/c/b/bo$b;,
        Lcom/c/b/bo$a;
    }
.end annotation


# static fields
.field private static final c:[I


# instance fields
.field private final d:I

.field private final e:Lcom/c/b/f;

.field private final f:Lcom/c/b/f;

.field private final g:I

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 91
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move v1, v0

    .line 99
    :goto_0
    if-lez v0, :cond_0

    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    add-int/2addr v1, v0

    move v4, v1

    move v1, v0

    move v0, v4

    .line 104
    goto :goto_0

    .line 108
    :cond_0
    const v0, 0x7fffffff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    sput-object v0, Lcom/c/b/bo;->c:[I

    .line 110
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    sget-object v0, Lcom/c/b/bo;->c:[I

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 112
    sget-object v3, Lcom/c/b/bo;->c:[I

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v3, v1

    .line 110
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 114
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/c/b/bo;)Lcom/c/b/f;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/bo;)Lcom/c/b/f;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    return-object v0
.end method


# virtual methods
.method public final a(I)B
    .locals 3

    .prologue
    .line 251
    if-gez p1, :cond_0

    .line 252
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Index < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 254
    :cond_0
    iget v0, p0, Lcom/c/b/bo;->d:I

    if-le p1, v0, :cond_1

    .line 255
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Index > length: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/c/b/bo;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 261
    :cond_1
    iget v0, p0, Lcom/c/b/bo;->g:I

    if-ge p1, v0, :cond_2

    .line 262
    iget-object v0, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v0, p1}, Lcom/c/b/f;->a(I)B

    move-result v0

    .line 266
    :goto_0
    return v0

    .line 264
    :cond_2
    iget-object v0, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    iget v1, p0, Lcom/c/b/bo;->g:I

    sub-int v1, p1, v1

    invoke-virtual {v0, v1}, Lcom/c/b/f;->a(I)B

    move-result v0

    goto :goto_0
.end method

.method public final a()I
    .locals 1

    .prologue
    .line 271
    iget v0, p0, Lcom/c/b/bo;->d:I

    return v0
.end method

.method protected final a(III)I
    .locals 4

    .prologue
    .line 437
    add-int v0, p2, p3

    .line 438
    iget v1, p0, Lcom/c/b/bo;->g:I

    if-gt v0, v1, :cond_0

    .line 439
    iget-object v0, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v0, p1, p2, p3}, Lcom/c/b/f;->a(III)I

    move-result v0

    .line 445
    :goto_0
    return v0

    .line 440
    :cond_0
    iget v0, p0, Lcom/c/b/bo;->g:I

    if-lt p2, v0, :cond_1

    .line 441
    iget-object v0, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    iget v1, p0, Lcom/c/b/bo;->g:I

    sub-int v1, p2, v1

    invoke-virtual {v0, p1, v1, p3}, Lcom/c/b/f;->a(III)I

    move-result v0

    goto :goto_0

    .line 443
    :cond_1
    iget v0, p0, Lcom/c/b/bo;->g:I

    sub-int/2addr v0, p2

    .line 444
    iget-object v1, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v1, p1, p2, v0}, Lcom/c/b/f;->a(III)I

    move-result v1

    .line 445
    iget-object v2, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    const/4 v3, 0x0

    sub-int v0, p3, v0

    invoke-virtual {v2, v1, v3, v0}, Lcom/c/b/f;->a(III)I

    move-result v0

    goto :goto_0
.end method

.method protected final a(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 422
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/c/b/bo;->e()[B

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method final a(Ljava/io/OutputStream;II)V
    .locals 3

    .prologue
    .line 409
    add-int v0, p2, p3

    iget v1, p0, Lcom/c/b/bo;->g:I

    if-gt v0, v1, :cond_0

    .line 410
    iget-object v0, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v0, p1, p2, p3}, Lcom/c/b/f;->a(Ljava/io/OutputStream;II)V

    .line 418
    :goto_0
    return-void

    .line 411
    :cond_0
    iget v0, p0, Lcom/c/b/bo;->g:I

    if-lt p2, v0, :cond_1

    .line 412
    iget-object v0, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    iget v1, p0, Lcom/c/b/bo;->g:I

    sub-int v1, p2, v1

    invoke-virtual {v0, p1, v1, p3}, Lcom/c/b/f;->a(Ljava/io/OutputStream;II)V

    goto :goto_0

    .line 414
    :cond_1
    iget v0, p0, Lcom/c/b/bo;->g:I

    sub-int/2addr v0, p2

    .line 415
    iget-object v1, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v1, p1, p2, v0}, Lcom/c/b/f;->a(Ljava/io/OutputStream;II)V

    .line 416
    iget-object v1, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    const/4 v2, 0x0

    sub-int v0, p3, v0

    invoke-virtual {v1, p1, v2, v0}, Lcom/c/b/f;->a(Ljava/io/OutputStream;II)V

    goto :goto_0
.end method

.method protected final a([BIII)V
    .locals 4

    .prologue
    .line 362
    add-int v0, p2, p4

    iget v1, p0, Lcom/c/b/bo;->g:I

    if-gt v0, v1, :cond_0

    .line 363
    iget-object v0, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/c/b/f;->a([BIII)V

    .line 373
    :goto_0
    return-void

    .line 364
    :cond_0
    iget v0, p0, Lcom/c/b/bo;->g:I

    if-lt p2, v0, :cond_1

    .line 365
    iget-object v0, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    iget v1, p0, Lcom/c/b/bo;->g:I

    sub-int v1, p2, v1

    invoke-virtual {v0, p1, v1, p3, p4}, Lcom/c/b/f;->a([BIII)V

    goto :goto_0

    .line 368
    :cond_1
    iget v0, p0, Lcom/c/b/bo;->g:I

    sub-int/2addr v0, p2

    .line 369
    iget-object v1, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v1, p1, p2, p3, v0}, Lcom/c/b/f;->a([BIII)V

    .line 370
    iget-object v1, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    const/4 v2, 0x0

    add-int v3, p3, v0

    sub-int v0, p4, v0

    invoke-virtual {v1, p1, v2, v3, v0}, Lcom/c/b/f;->a([BIII)V

    goto :goto_0
.end method

.method protected final b(III)I
    .locals 4

    .prologue
    .line 568
    add-int v0, p2, p3

    .line 569
    iget v1, p0, Lcom/c/b/bo;->g:I

    if-gt v0, v1, :cond_0

    .line 570
    iget-object v0, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v0, p1, p2, p3}, Lcom/c/b/f;->b(III)I

    move-result v0

    .line 576
    :goto_0
    return v0

    .line 571
    :cond_0
    iget v0, p0, Lcom/c/b/bo;->g:I

    if-lt p2, v0, :cond_1

    .line 572
    iget-object v0, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    iget v1, p0, Lcom/c/b/bo;->g:I

    sub-int v1, p2, v1

    invoke-virtual {v0, p1, v1, p3}, Lcom/c/b/f;->b(III)I

    move-result v0

    goto :goto_0

    .line 574
    :cond_1
    iget v0, p0, Lcom/c/b/bo;->g:I

    sub-int/2addr v0, p2

    .line 575
    iget-object v1, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    invoke-virtual {v1, p1, p2, v0}, Lcom/c/b/f;->b(III)I

    move-result v1

    .line 576
    iget-object v2, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    const/4 v3, 0x0

    sub-int v0, p3, v0

    invoke-virtual {v2, v1, v3, v0}, Lcom/c/b/f;->b(III)I

    move-result v0

    goto :goto_0
.end method

.method public final c()Lcom/c/b/f$a;
    .locals 2

    .prologue
    .line 794
    new-instance v0, Lcom/c/b/bo$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/b/bo$b;-><init>(Lcom/c/b/bo;B)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 13

    .prologue
    const/4 v7, 0x1

    const/4 v2, 0x0

    .line 454
    if-ne p1, p0, :cond_1

    move v2, v7

    .line 481
    :cond_0
    :goto_0
    return v2

    .line 457
    :cond_1
    instance-of v0, p1, Lcom/c/b/f;

    if-eqz v0, :cond_0

    .line 461
    check-cast p1, Lcom/c/b/f;

    .line 462
    iget v0, p0, Lcom/c/b/bo;->d:I

    invoke-virtual {p1}, Lcom/c/b/f;->a()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 465
    iget v0, p0, Lcom/c/b/bo;->d:I

    if-nez v0, :cond_2

    move v2, v7

    .line 466
    goto :goto_0

    .line 474
    :cond_2
    iget v0, p0, Lcom/c/b/bo;->h:I

    if-eqz v0, :cond_3

    .line 475
    invoke-virtual {p1}, Lcom/c/b/f;->i()I

    move-result v0

    .line 476
    if-eqz v0, :cond_3

    iget v1, p0, Lcom/c/b/bo;->h:I

    if-ne v1, v0, :cond_0

    .line 481
    :cond_3
    new-instance v8, Lcom/c/b/bo$a;

    invoke-direct {v8, p0, v2}, Lcom/c/b/bo$a;-><init>(Lcom/c/b/f;B)V

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ba;

    new-instance v9, Lcom/c/b/bo$a;

    invoke-direct {v9, p1, v2}, Lcom/c/b/bo$a;-><init>(Lcom/c/b/f;B)V

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ba;

    move-object v3, v1

    move v4, v2

    move-object v5, v0

    move v6, v2

    move v0, v2

    :goto_1
    invoke-virtual {v5}, Lcom/c/b/ba;->a()I

    move-result v1

    sub-int v10, v1, v6

    invoke-virtual {v3}, Lcom/c/b/ba;->a()I

    move-result v1

    sub-int v11, v1, v4

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v12

    if-nez v6, :cond_4

    invoke-virtual {v5, v3, v4, v12}, Lcom/c/b/ba;->a(Lcom/c/b/ba;II)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_0

    add-int v1, v0, v12

    iget v0, p0, Lcom/c/b/bo;->d:I

    if-lt v1, v0, :cond_6

    iget v0, p0, Lcom/c/b/bo;->d:I

    if-ne v1, v0, :cond_5

    move v2, v7

    goto :goto_0

    :cond_4
    invoke-virtual {v3, v5, v6, v12}, Lcom/c/b/ba;->a(Lcom/c/b/ba;II)Z

    move-result v1

    goto :goto_2

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_6
    if-ne v12, v10, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ba;

    move-object v5, v0

    move v6, v2

    :goto_3
    if-ne v12, v11, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ba;

    move-object v3, v0

    move v4, v2

    move v0, v1

    goto :goto_1

    :cond_7
    add-int/2addr v6, v12

    goto :goto_3

    :cond_8
    add-int v0, v4, v12

    move v4, v0

    move v0, v1

    goto :goto_1
.end method

.method public final g()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 430
    iget-object v1, p0, Lcom/c/b/bo;->e:Lcom/c/b/f;

    iget v2, p0, Lcom/c/b/bo;->g:I

    invoke-virtual {v1, v0, v0, v2}, Lcom/c/b/f;->a(III)I

    move-result v1

    .line 431
    iget-object v2, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    iget-object v3, p0, Lcom/c/b/bo;->f:Lcom/c/b/f;

    invoke-virtual {v3}, Lcom/c/b/f;->a()I

    move-result v3

    invoke-virtual {v2, v1, v0, v3}, Lcom/c/b/f;->a(III)I

    move-result v1

    .line 432
    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final h()Lcom/c/b/g;
    .locals 1

    .prologue
    .line 585
    new-instance v0, Lcom/c/b/bo$c;

    invoke-direct {v0, p0}, Lcom/c/b/bo$c;-><init>(Lcom/c/b/bo;)V

    invoke-static {v0}, Lcom/c/b/g;->a(Ljava/io/InputStream;)Lcom/c/b/g;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .prologue
    .line 548
    iget v0, p0, Lcom/c/b/bo;->h:I

    .line 550
    if-nez v0, :cond_1

    .line 551
    iget v0, p0, Lcom/c/b/bo;->d:I

    .line 552
    const/4 v1, 0x0

    iget v2, p0, Lcom/c/b/bo;->d:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/c/b/bo;->b(III)I

    move-result v0

    .line 553
    if-nez v0, :cond_0

    .line 554
    const/4 v0, 0x1

    .line 556
    :cond_0
    iput v0, p0, Lcom/c/b/bo;->h:I

    .line 558
    :cond_1
    return v0
.end method

.method protected final i()I
    .locals 1

    .prologue
    .line 563
    iget v0, p0, Lcom/c/b/bo;->h:I

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/c/b/bo;->c()Lcom/c/b/f$a;

    move-result-object v0

    return-object v0
.end method
