.class public final Lcom/c/b/ak$g;
.super Lcom/c/b/ak$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/ak$g$a;,
        Lcom/c/b/ak$g$b;
    }
.end annotation


# instance fields
.field private a:Lcom/c/b/i$o;

.field private final b:[Lcom/c/b/ak$a;

.field private final c:[Lcom/c/b/ak$d;

.field private final d:[Lcom/c/b/ak$k;

.field private final e:[Lcom/c/b/ak$f;

.field private final f:[Lcom/c/b/ak$g;

.field private final g:[Lcom/c/b/ak$g;

.field private final h:Lcom/c/b/ak$b;


# direct methods
.method private constructor <init>(Lcom/c/b/i$o;[Lcom/c/b/ak$g;Lcom/c/b/ak$b;)V
    .locals 8

    .prologue
    .line 437
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 438
    iput-object p3, p0, Lcom/c/b/ak$g;->h:Lcom/c/b/ak$b;

    .line 439
    iput-object p1, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    .line 440
    invoke-virtual {p2}, [Lcom/c/b/ak$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/b/ak$g;

    iput-object v0, p0, Lcom/c/b/ak$g;->f:[Lcom/c/b/ak$g;

    .line 441
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 443
    array-length v1, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v3, p2, v0

    .line 444
    iget-object v4, v3, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    invoke-virtual {v4}, Lcom/c/b/i$o;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 446
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 447
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-virtual {p1}, Lcom/c/b/i$o;->m()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 448
    invoke-virtual {p1, v1}, Lcom/c/b/i$o;->b(I)I

    move-result v0

    .line 449
    if-ltz v0, :cond_1

    invoke-virtual {p1}, Lcom/c/b/i$o;->l()I

    move-result v4

    if-lt v0, v4, :cond_2

    .line 450
    :cond_1
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Invalid public dependency index."

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$g;Ljava/lang/String;B)V

    throw v0

    .line 453
    :cond_2
    invoke-virtual {p1, v0}, Lcom/c/b/i$o;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 454
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$g;

    .line 455
    if-eqz v0, :cond_3

    .line 456
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 465
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/ak$g;

    iput-object v0, p0, Lcom/c/b/ak$g;->g:[Lcom/c/b/ak$g;

    .line 466
    iget-object v0, p0, Lcom/c/b/ak$g;->g:[Lcom/c/b/ak$g;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 468
    iget-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    invoke-virtual {v0}, Lcom/c/b/i$o;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0, p0}, Lcom/c/b/ak$b;->a(Ljava/lang/String;Lcom/c/b/ak$g;)V

    .line 470
    invoke-virtual {p1}, Lcom/c/b/i$o;->n()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/ak$a;

    iput-object v0, p0, Lcom/c/b/ak$g;->b:[Lcom/c/b/ak$a;

    .line 471
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1}, Lcom/c/b/i$o;->n()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 472
    iget-object v1, p0, Lcom/c/b/ak$g;->b:[Lcom/c/b/ak$a;

    new-instance v2, Lcom/c/b/ak$a;

    invoke-virtual {p1, v0}, Lcom/c/b/i$o;->c(I)Lcom/c/b/i$a;

    move-result-object v3

    invoke-direct {v2, v3, p0, v0}, Lcom/c/b/ak$a;-><init>(Lcom/c/b/i$a;Lcom/c/b/ak$g;I)V

    aput-object v2, v1, v0

    .line 471
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 476
    :cond_5
    invoke-virtual {p1}, Lcom/c/b/i$o;->o()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/ak$d;

    iput-object v0, p0, Lcom/c/b/ak$g;->c:[Lcom/c/b/ak$d;

    .line 477
    const/4 v4, 0x0

    :goto_3
    invoke-virtual {p1}, Lcom/c/b/i$o;->o()I

    move-result v0

    if-ge v4, v0, :cond_6

    .line 478
    iget-object v6, p0, Lcom/c/b/ak$g;->c:[Lcom/c/b/ak$d;

    new-instance v0, Lcom/c/b/ak$d;

    invoke-virtual {p1, v4}, Lcom/c/b/i$o;->d(I)Lcom/c/b/i$c;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lcom/c/b/ak$d;-><init>(Lcom/c/b/i$c;Lcom/c/b/ak$g;Lcom/c/b/ak$a;IB)V

    aput-object v0, v6, v4

    .line 477
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 481
    :cond_6
    invoke-virtual {p1}, Lcom/c/b/i$o;->p()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/ak$k;

    iput-object v0, p0, Lcom/c/b/ak$g;->d:[Lcom/c/b/ak$k;

    .line 482
    const/4 v0, 0x0

    :goto_4
    invoke-virtual {p1}, Lcom/c/b/i$o;->p()I

    move-result v1

    if-ge v0, v1, :cond_7

    .line 483
    iget-object v1, p0, Lcom/c/b/ak$g;->d:[Lcom/c/b/ak$k;

    new-instance v2, Lcom/c/b/ak$k;

    invoke-virtual {p1, v0}, Lcom/c/b/i$o;->e(I)Lcom/c/b/i$aa;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, p0, v0, v4}, Lcom/c/b/ak$k;-><init>(Lcom/c/b/i$aa;Lcom/c/b/ak$g;IB)V

    aput-object v2, v1, v0

    .line 482
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 486
    :cond_7
    invoke-virtual {p1}, Lcom/c/b/i$o;->q()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/ak$f;

    iput-object v0, p0, Lcom/c/b/ak$g;->e:[Lcom/c/b/ak$f;

    .line 487
    const/4 v4, 0x0

    :goto_5
    invoke-virtual {p1}, Lcom/c/b/i$o;->q()I

    move-result v0

    if-ge v4, v0, :cond_8

    .line 488
    iget-object v7, p0, Lcom/c/b/ak$g;->e:[Lcom/c/b/ak$f;

    new-instance v0, Lcom/c/b/ak$f;

    invoke-virtual {p1, v4}, Lcom/c/b/i$o;->f(I)Lcom/c/b/i$k;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/c/b/ak$f;-><init>(Lcom/c/b/i$k;Lcom/c/b/ak$g;Lcom/c/b/ak$a;IZB)V

    aput-object v0, v7, v4

    .line 487
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 491
    :cond_8
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/c/b/ak$a;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 497
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 498
    new-instance v0, Lcom/c/b/ak$b;

    new-array v1, v3, [Lcom/c/b/ak$g;

    invoke-direct {v0, v1}, Lcom/c/b/ak$b;-><init>([Lcom/c/b/ak$g;)V

    iput-object v0, p0, Lcom/c/b/ak$g;->h:Lcom/c/b/ak$b;

    .line 499
    invoke-static {}, Lcom/c/b/i$o;->B()Lcom/c/b/i$o$a;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/c/b/ak$a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".placeholder.proto"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/i$o$a;->a(Ljava/lang/String;)Lcom/c/b/i$o$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/c/b/i$o$a;->b(Ljava/lang/String;)Lcom/c/b/i$o$a;

    move-result-object v0

    invoke-virtual {p2}, Lcom/c/b/ak$a;->a()Lcom/c/b/i$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/i$o$a;->a(Lcom/c/b/i$a;)Lcom/c/b/i$o$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$o$a;->g()Lcom/c/b/i$o;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    .line 502
    new-array v0, v3, [Lcom/c/b/ak$g;

    iput-object v0, p0, Lcom/c/b/ak$g;->f:[Lcom/c/b/ak$g;

    .line 503
    new-array v0, v3, [Lcom/c/b/ak$g;

    iput-object v0, p0, Lcom/c/b/ak$g;->g:[Lcom/c/b/ak$g;

    .line 505
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/c/b/ak$a;

    aput-object p2, v0, v3

    iput-object v0, p0, Lcom/c/b/ak$g;->b:[Lcom/c/b/ak$a;

    .line 506
    new-array v0, v3, [Lcom/c/b/ak$d;

    iput-object v0, p0, Lcom/c/b/ak$g;->c:[Lcom/c/b/ak$d;

    .line 507
    new-array v0, v3, [Lcom/c/b/ak$k;

    iput-object v0, p0, Lcom/c/b/ak$g;->d:[Lcom/c/b/ak$k;

    .line 508
    new-array v0, v3, [Lcom/c/b/ak$f;

    iput-object v0, p0, Lcom/c/b/ak$g;->e:[Lcom/c/b/ak$f;

    .line 510
    iget-object v0, p0, Lcom/c/b/ak$g;->h:Lcom/c/b/ak$b;

    invoke-virtual {v0, p1, p0}, Lcom/c/b/ak$b;->a(Ljava/lang/String;Lcom/c/b/ak$g;)V

    .line 511
    iget-object v0, p0, Lcom/c/b/ak$g;->h:Lcom/c/b/ak$b;

    invoke-virtual {v0, p2}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$h;)V

    .line 512
    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/c/b/ak$g;->h:Lcom/c/b/ak$b;

    return-object v0
.end method

.method private static a(Lcom/c/b/i$o;[Lcom/c/b/ak$g;)Lcom/c/b/ak$g;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 287
    new-instance v1, Lcom/c/b/ak$b;

    invoke-direct {v1, p1}, Lcom/c/b/ak$b;-><init>([Lcom/c/b/ak$g;)V

    .line 289
    new-instance v2, Lcom/c/b/ak$g;

    invoke-direct {v2, p0, p1, v1}, Lcom/c/b/ak$g;-><init>(Lcom/c/b/i$o;[Lcom/c/b/ak$g;Lcom/c/b/ak$b;)V

    .line 291
    iget-object v3, v2, Lcom/c/b/ak$g;->b:[Lcom/c/b/ak$a;

    array-length v4, v3

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v5, v3, v1

    invoke-static {v5}, Lcom/c/b/ak$a;->a(Lcom/c/b/ak$a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v3, v2, Lcom/c/b/ak$g;->d:[Lcom/c/b/ak$k;

    array-length v4, v3

    move v1, v0

    :goto_1
    if-ge v1, v4, :cond_1

    aget-object v5, v3, v1

    invoke-static {v5}, Lcom/c/b/ak$k;->a(Lcom/c/b/ak$k;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, v2, Lcom/c/b/ak$g;->e:[Lcom/c/b/ak$f;

    array-length v3, v1

    :goto_2
    if-ge v0, v3, :cond_2

    aget-object v4, v1, v0

    invoke-static {v4}, Lcom/c/b/ak$f;->a(Lcom/c/b/ak$f;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 292
    :cond_2
    return-object v2
.end method

.method public static a(Lcom/c/b/ak$g;Lcom/c/b/ap;)V
    .locals 3

    .prologue
    .line 397
    iget-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    invoke-virtual {v0}, Lcom/c/b/i$o;->d()Lcom/c/b/f;

    move-result-object v0

    .line 400
    :try_start_0
    invoke-static {v0, p1}, Lcom/c/b/i$o;->a(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/i$o;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 405
    invoke-direct {p0, v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/i$o;)V

    .line 406
    return-void

    .line 401
    :catch_0
    move-exception v0

    .line 402
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Failed to parse protocol buffer descriptor for generated code."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private a(Lcom/c/b/i$o;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 540
    iput-object p1, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    move v0, v1

    .line 542
    :goto_0
    iget-object v2, p0, Lcom/c/b/ak$g;->b:[Lcom/c/b/ak$a;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 543
    iget-object v2, p0, Lcom/c/b/ak$g;->b:[Lcom/c/b/ak$a;

    aget-object v2, v2, v0

    invoke-virtual {p1, v0}, Lcom/c/b/i$o;->c(I)Lcom/c/b/i$a;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/c/b/ak$a;->a(Lcom/c/b/ak$a;Lcom/c/b/i$a;)V

    .line 542
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    .line 546
    :goto_1
    iget-object v2, p0, Lcom/c/b/ak$g;->c:[Lcom/c/b/ak$d;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 547
    iget-object v2, p0, Lcom/c/b/ak$g;->c:[Lcom/c/b/ak$d;

    aget-object v2, v2, v0

    invoke-virtual {p1, v0}, Lcom/c/b/i$o;->d(I)Lcom/c/b/i$c;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/c/b/ak$d;->a(Lcom/c/b/ak$d;Lcom/c/b/i$c;)V

    .line 546
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v1

    .line 550
    :goto_2
    iget-object v2, p0, Lcom/c/b/ak$g;->d:[Lcom/c/b/ak$k;

    array-length v2, v2

    if-ge v0, v2, :cond_2

    .line 551
    iget-object v2, p0, Lcom/c/b/ak$g;->d:[Lcom/c/b/ak$k;

    aget-object v2, v2, v0

    invoke-virtual {p1, v0}, Lcom/c/b/i$o;->e(I)Lcom/c/b/i$aa;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/c/b/ak$k;->a(Lcom/c/b/ak$k;Lcom/c/b/i$aa;)V

    .line 550
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 554
    :cond_2
    :goto_3
    iget-object v0, p0, Lcom/c/b/ak$g;->e:[Lcom/c/b/ak$f;

    array-length v0, v0

    if-ge v1, v0, :cond_3

    .line 555
    iget-object v0, p0, Lcom/c/b/ak$g;->e:[Lcom/c/b/ak$f;

    aget-object v0, v0, v1

    invoke-virtual {p1, v1}, Lcom/c/b/i$o;->f(I)Lcom/c/b/i$k;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/c/b/ak$f;->a(Lcom/c/b/ak$f;Lcom/c/b/i$k;)V

    .line 554
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 557
    :cond_3
    return-void
.end method

.method public static a([Ljava/lang/String;[Lcom/c/b/ak$g;Lcom/c/b/ak$g$a;)V
    .locals 5

    .prologue
    .line 315
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 317
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 321
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/c/b/au;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 325
    :try_start_0
    invoke-static {v0}, Lcom/c/b/i$o;->a([B)Lcom/c/b/i$o;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 335
    :try_start_1
    invoke-static {v0, p1}, Lcom/c/b/ak$g;->a(Lcom/c/b/i$o;[Lcom/c/b/ak$g;)Lcom/c/b/ak$g;
    :try_end_1
    .catch Lcom/c/b/ak$c; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 341
    invoke-interface {p2, v0}, Lcom/c/b/ak$g$a;->a(Lcom/c/b/ak$g;)Lcom/c/b/ap;

    .line 344
    return-void

    .line 326
    :catch_0
    move-exception v0

    .line 327
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Failed to parse protocol buffer descriptor for generated code."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 336
    :catch_1
    move-exception v1

    .line 337
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid embedded descriptor for \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/c/b/i$o;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "\"."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method


# virtual methods
.method public final a()Lcom/c/b/i$o;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    invoke-virtual {v0}, Lcom/c/b/i$o;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    invoke-virtual {v0}, Lcom/c/b/i$o;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/c/b/ak$g;
    .locals 0

    .prologue
    .line 82
    return-object p0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    invoke-virtual {v0}, Lcom/c/b/i$o;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/i$q;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    invoke-virtual {v0}, Lcom/c/b/i$o;->s()Lcom/c/b/i$q;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/c/b/ak$g;->b:[Lcom/c/b/ak$a;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/c/b/ak$g;->e:[Lcom/c/b/ak$f;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/c/b/ak$g;->g:[Lcom/c/b/ak$g;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lcom/c/b/ak$g$b;
    .locals 2

    .prologue
    .line 141
    sget-object v0, Lcom/c/b/ak$g$b;->c:Lcom/c/b/ak$g$b;

    invoke-static {v0}, Lcom/c/b/ak$g$b;->a(Lcom/c/b/ak$g$b;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/ak$g;->a:Lcom/c/b/i$o;

    invoke-virtual {v1}, Lcom/c/b/i$o;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    sget-object v0, Lcom/c/b/ak$g$b;->c:Lcom/c/b/ak$g$b;

    .line 144
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/c/b/ak$g$b;->b:Lcom/c/b/ak$g$b;

    goto :goto_0
.end method

.method final l()Z
    .locals 2

    .prologue
    .line 560
    invoke-virtual {p0}, Lcom/c/b/ak$g;->k()Lcom/c/b/ak$g$b;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$g$b;->c:Lcom/c/b/ak$g$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
