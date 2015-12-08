.class final Lcom/b/a/c/bu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/b/a/c/b;


# instance fields
.field private b:Landroid/app/ActivityManager$RunningAppProcessInfo;

.field private c:[Ljava/lang/Thread;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<[",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation
.end field

.field private e:[Ljava/lang/StackTraceElement;

.field private final f:Landroid/content/Context;

.field private final g:Lcom/b/a/c/b;

.field private final h:Lcom/b/a/c/b;

.field private final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-string v0, "0"

    invoke-static {v0}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v0

    sput-object v0, Lcom/b/a/c/bu;->a:Lcom/b/a/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/16 v0, 0x8

    iput v0, p0, Lcom/b/a/c/bu;->i:I

    .line 48
    iput-object p1, p0, Lcom/b/a/c/bu;->f:Landroid/content/Context;

    .line 49
    invoke-static {p3}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/c/bu;->g:Lcom/b/a/c/b;

    .line 50
    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/b/a/c/bu;->h:Lcom/b/a/c/b;

    .line 52
    return-void

    .line 50
    :cond_0
    const-string v0, "-"

    const-string v1, ""

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v0

    goto :goto_0
.end method

.method private a()I
    .locals 2

    .prologue
    .line 399
    const/4 v0, 0x1

    new-instance v1, La/a/a/a/a/b/j;

    invoke-direct {v1}, La/a/a/a/a/b/j;-><init>()V

    iget-object v1, p0, Lcom/b/a/c/bu;->f:Landroid/content/Context;

    invoke-static {v1}, La/a/a/a/a/b/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 402
    return v0
.end method

.method private static a(IIJJ)I
    .locals 2

    .prologue
    .line 560
    invoke-static {}, Lcom/b/a/c/f;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 561
    invoke-static {p0}, Lcom/b/a/c/f;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 562
    const/4 v1, 0x3

    invoke-static {v1}, Lcom/b/a/c/f;->b(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 563
    const/4 v1, 0x4

    invoke-static {v1, p1}, Lcom/b/a/c/f;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 564
    const/4 v1, 0x5

    invoke-static {v1, p2, p3}, Lcom/b/a/c/f;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 565
    const/4 v1, 0x6

    invoke-static {v1, p4, p5}, Lcom/b/a/c/f;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 567
    return v0
.end method

.method private static a(La/a/a/a/a/b/y;Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 417
    const/4 v0, 0x1

    iget v1, p0, La/a/a/a/a/b/y;->h:I

    invoke-static {v0, v1}, Lcom/b/a/c/f;->d(II)I

    move-result v0

    .line 418
    const/4 v1, 0x2

    invoke-static {p1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v1

    add-int/2addr v0, v1

    .line 420
    return v0
.end method

.method private static a(Ljava/lang/StackTraceElement;Z)I
    .locals 6

    .prologue
    const/4 v1, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 633
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 635
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v4, v0

    invoke-static {v3, v4, v5}, Lcom/b/a/c/f;->b(IJ)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 640
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v3

    add-int/2addr v0, v3

    .line 643
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 644
    const/4 v3, 0x3

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v3

    add-int/2addr v0, v3

    .line 648
    :cond_0
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v3

    if-lez v3, :cond_3

    .line 650
    const/4 v3, 0x4

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    int-to-long v4, v4

    invoke-static {v3, v4, v5}, Lcom/b/a/c/f;->b(IJ)I

    move-result v3

    add-int/2addr v0, v3

    move v3, v0

    .line 652
    :goto_1
    const/4 v4, 0x5

    if-eqz p1, :cond_2

    move v0, v1

    :goto_2
    invoke-static {v4, v0}, Lcom/b/a/c/f;->c(II)I

    move-result v0

    add-int/2addr v0, v3

    .line 654
    return v0

    .line 637
    :cond_1
    const-wide/16 v4, 0x0

    invoke-static {v3, v4, v5}, Lcom/b/a/c/f;->b(IJ)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    goto :goto_0

    :cond_2
    move v0, v2

    .line 652
    goto :goto_2

    :cond_3
    move v3, v0

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 549
    const/4 v0, 0x1

    invoke-static {p0}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v0

    .line 550
    const/4 v1, 0x2

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-static {p1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v1

    add-int/2addr v0, v1

    .line 552
    return v0
.end method

.method private a(Ljava/lang/Thread;Ljava/lang/Throwable;)I
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v2, 0x0

    const/4 v7, 0x1

    .line 521
    iget-object v0, p0, Lcom/b/a/c/bu;->e:[Ljava/lang/StackTraceElement;

    const/4 v1, 0x4

    invoke-static {p1, v0, v1, v7}, Lcom/b/a/c/bu;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)I

    move-result v0

    .line 522
    invoke-static {v7}, Lcom/b/a/c/f;->d(I)I

    move-result v1

    invoke-static {v0}, Lcom/b/a/c/f;->f(I)I

    move-result v3

    add-int/2addr v1, v3

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x0

    .line 525
    iget-object v1, p0, Lcom/b/a/c/bu;->c:[Ljava/lang/Thread;

    array-length v4, v1

    move v1, v2

    move v3, v0

    .line 526
    :goto_0
    if-ge v1, v4, :cond_0

    .line 527
    iget-object v0, p0, Lcom/b/a/c/bu;->c:[Ljava/lang/Thread;

    aget-object v5, v0, v1

    .line 528
    iget-object v0, p0, Lcom/b/a/c/bu;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/StackTraceElement;

    invoke-static {v5, v0, v2, v2}, Lcom/b/a/c/bu;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)I

    move-result v0

    .line 529
    invoke-static {v7}, Lcom/b/a/c/f;->d(I)I

    move-result v5

    invoke-static {v0}, Lcom/b/a/c/f;->f(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v0, v5

    add-int/2addr v3, v0

    .line 526
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 533
    :cond_0
    invoke-direct {p0, p2, v7}, Lcom/b/a/c/bu;->a(Ljava/lang/Throwable;I)I

    move-result v0

    .line 534
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/b/a/c/f;->d(I)I

    move-result v1

    invoke-static {v0}, Lcom/b/a/c/f;->f(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    add-int/2addr v0, v3

    .line 537
    invoke-static {}, Lcom/b/a/c/bu;->c()I

    move-result v1

    .line 538
    invoke-static {v8}, Lcom/b/a/c/f;->d(I)I

    move-result v2

    invoke-static {v1}, Lcom/b/a/c/f;->f(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 541
    invoke-direct {p0}, Lcom/b/a/c/bu;->b()I

    move-result v1

    .line 542
    invoke-static {v8}, Lcom/b/a/c/f;->d(I)I

    move-result v2

    invoke-static {v1}, Lcom/b/a/c/f;->f(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 545
    return v0
.end method

.method private a(Ljava/lang/Thread;Ljava/lang/Throwable;ILjava/util/Map;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "Ljava/lang/Throwable;",
            "I",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 494
    invoke-direct {p0, p1, p2}, Lcom/b/a/c/bu;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)I

    move-result v0

    .line 495
    const/4 v1, 0x1

    invoke-static {v1}, Lcom/b/a/c/f;->d(I)I

    move-result v1

    invoke-static {v0}, Lcom/b/a/c/f;->f(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x0

    .line 498
    if-eqz p4, :cond_0

    .line 499
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    .line 500
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/b/a/c/bu;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 502
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/b/a/c/f;->d(I)I

    move-result v1

    invoke-static {v0}, Lcom/b/a/c/f;->f(I)I

    move-result v4

    add-int/2addr v1, v4

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    move v2, v0

    .line 504
    goto :goto_0

    :cond_0
    move v2, v0

    .line 508
    :cond_1
    iget-object v0, p0, Lcom/b/a/c/bu;->b:Landroid/app/ActivityManager$RunningAppProcessInfo;

    if-eqz v0, :cond_2

    .line 509
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/b/a/c/bu;->b:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    invoke-static {v0}, Lcom/b/a/c/f;->b(I)I

    move-result v0

    add-int/2addr v2, v0

    .line 513
    :cond_2
    const/4 v0, 0x4

    invoke-static {v0, p3}, Lcom/b/a/c/f;->c(II)I

    move-result v0

    add-int/2addr v0, v2

    .line 515
    return v0
.end method

.method private static a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)I
    .locals 6

    .prologue
    .line 659
    const/4 v0, 0x1

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v0

    .line 660
    const/4 v1, 0x2

    invoke-static {v1, p2}, Lcom/b/a/c/f;->c(II)I

    move-result v1

    add-int/2addr v1, v0

    .line 662
    array-length v2, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p1, v0

    .line 663
    invoke-static {v3, p3}, Lcom/b/a/c/bu;->a(Ljava/lang/StackTraceElement;Z)I

    move-result v3

    .line 664
    const/4 v4, 0x3

    invoke-static {v4}, Lcom/b/a/c/f;->d(I)I

    move-result v4

    invoke-static {v3}, Lcom/b/a/c/f;->f(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v3, v4

    add-int/2addr v1, v3

    .line 662
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 668
    :cond_0
    return v1
.end method

.method private a(Ljava/lang/Throwable;I)I
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 580
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 584
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    .line 585
    if-eqz v2, :cond_0

    .line 586
    const/4 v3, 0x3

    invoke-static {v2}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v2

    add-int/2addr v0, v2

    .line 589
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v4

    array-length v5, v4

    move v2, v1

    :goto_0
    if-ge v2, v5, :cond_1

    aget-object v3, v4, v2

    .line 590
    invoke-static {v3, v8}, Lcom/b/a/c/bu;->a(Ljava/lang/StackTraceElement;Z)I

    move-result v3

    .line 591
    const/4 v6, 0x4

    invoke-static {v6}, Lcom/b/a/c/f;->d(I)I

    move-result v6

    invoke-static {v3}, Lcom/b/a/c/f;->f(I)I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v3, v6

    add-int/2addr v3, v0

    .line 589
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v0, v3

    goto :goto_0

    .line 597
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    .line 598
    if-eqz v2, :cond_2

    .line 599
    iget v3, p0, Lcom/b/a/c/bu;->i:I

    if-ge p2, v3, :cond_3

    .line 600
    add-int/lit8 v1, p2, 0x1

    invoke-direct {p0, v2, v1}, Lcom/b/a/c/bu;->a(Ljava/lang/Throwable;I)I

    move-result v1

    .line 602
    const/4 v2, 0x6

    invoke-static {v2}, Lcom/b/a/c/f;->d(I)I

    move-result v2

    invoke-static {v1}, Lcom/b/a/c/f;->f(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 617
    :cond_2
    :goto_1
    return v0

    .line 608
    :cond_3
    :goto_2
    if-eqz v2, :cond_4

    .line 609
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    .line 610
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 613
    :cond_4
    const/4 v2, 0x7

    invoke-static {v2, v1}, Lcom/b/a/c/f;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;)Lcom/b/a/c/b;
    .locals 1

    .prologue
    .line 672
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Lcom/b/a/c/f;ILjava/lang/StackTraceElement;Z)V
    .locals 6

    .prologue
    const/4 v0, 0x4

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 327
    invoke-virtual {p0, p1, v5}, Lcom/b/a/c/f;->e(II)V

    .line 328
    invoke-static {p2, p3}, Lcom/b/a/c/bu;->a(Ljava/lang/StackTraceElement;Z)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/b/a/c/f;->e(I)V

    .line 330
    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 333
    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p0, v4, v2, v3}, Lcom/b/a/c/f;->a(IJ)V

    .line 338
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v2

    invoke-virtual {p0, v5, v2}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 341
    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 342
    const/4 v2, 0x3

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 347
    :cond_0
    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v2

    if-lez v2, :cond_1

    .line 348
    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p0, v0, v2, v3}, Lcom/b/a/c/f;->a(IJ)V

    .line 354
    :cond_1
    const/4 v2, 0x5

    if-eqz p3, :cond_3

    :goto_1
    invoke-virtual {p0, v2, v0}, Lcom/b/a/c/f;->a(II)V

    .line 355
    return-void

    .line 335
    :cond_2
    const-wide/16 v2, 0x0

    invoke-virtual {p0, v4, v2, v3}, Lcom/b/a/c/f;->a(IJ)V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 354
    goto :goto_1
.end method

.method public static a(Lcom/b/a/c/f;Ljava/lang/String;ILjava/lang/String;IJJZLjava/util/Map;ILjava/lang/String;Ljava/lang/String;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/b/a/c/f;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "IJJZ",
            "Ljava/util/Map",
            "<",
            "La/a/a/a/a/b/y;",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 105
    invoke-static {p1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v5

    .line 106
    invoke-static {p3}, Lcom/b/a/c/bu;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v6

    .line 107
    invoke-static/range {p13 .. p13}, Lcom/b/a/c/bu;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v7

    .line 108
    invoke-static/range {p12 .. p12}, Lcom/b/a/c/bu;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v8

    .line 110
    const/16 v2, 0x9

    const/4 v3, 0x2

    invoke-virtual {p0, v2, v3}, Lcom/b/a/c/f;->e(II)V

    .line 2430
    const/4 v2, 0x1

    invoke-static {v2, v5}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v2

    add-int/lit8 v2, v2, 0x0

    .line 2431
    const/4 v3, 0x3

    invoke-static {v3, p2}, Lcom/b/a/c/f;->d(II)I

    move-result v3

    add-int/2addr v3, v2

    .line 2432
    if-nez v6, :cond_0

    const/4 v2, 0x0

    :goto_0
    add-int/2addr v2, v3

    .line 2433
    const/4 v3, 0x5

    invoke-static {v3, p4}, Lcom/b/a/c/f;->c(II)I

    move-result v3

    add-int/2addr v2, v3

    .line 2434
    const/4 v3, 0x6

    move-wide/from16 v0, p5

    invoke-static {v3, v0, v1}, Lcom/b/a/c/f;->b(IJ)I

    move-result v3

    add-int/2addr v2, v3

    .line 2435
    const/4 v3, 0x7

    move-wide/from16 v0, p7

    invoke-static {v3, v0, v1}, Lcom/b/a/c/f;->b(IJ)I

    move-result v3

    add-int/2addr v2, v3

    .line 2436
    const/16 v3, 0xa

    invoke-static {v3}, Lcom/b/a/c/f;->b(I)I

    move-result v3

    add-int/2addr v2, v3

    .line 2437
    if-eqz p10, :cond_1

    .line 2438
    invoke-interface/range {p10 .. p10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v4, v2

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Map$Entry;

    .line 2439
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/a/a/b/y;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/b/a/c/bu;->a(La/a/a/a/a/b/y;Ljava/lang/String;)I

    move-result v2

    .line 2440
    const/16 v3, 0xb

    invoke-static {v3}, Lcom/b/a/c/f;->d(I)I

    move-result v3

    invoke-static {v2}, Lcom/b/a/c/f;->f(I)I

    move-result v10

    add-int/2addr v3, v10

    add-int/2addr v2, v3

    add-int/2addr v2, v4

    move v4, v2

    .line 2442
    goto :goto_1

    .line 2432
    :cond_0
    const/4 v2, 0x4

    invoke-static {v2, v6}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v2

    goto :goto_0

    :cond_1
    move v4, v2

    .line 2444
    :cond_2
    const/16 v2, 0xc

    move/from16 v0, p11

    invoke-static {v2, v0}, Lcom/b/a/c/f;->c(II)I

    move-result v2

    add-int v3, v4, v2

    .line 2445
    if-nez v8, :cond_3

    const/4 v2, 0x0

    :goto_2
    add-int/2addr v3, v2

    .line 2446
    if-nez v7, :cond_4

    const/4 v2, 0x0

    :goto_3
    add-int/2addr v2, v3

    .line 112
    invoke-virtual {p0, v2}, Lcom/b/a/c/f;->e(I)V

    .line 116
    const/4 v2, 0x1

    invoke-virtual {p0, v2, v5}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 118
    const/4 v2, 0x3

    invoke-virtual {p0, v2, p2}, Lcom/b/a/c/f;->b(II)V

    .line 119
    const/4 v2, 0x4

    invoke-virtual {p0, v2, v6}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 120
    const/4 v2, 0x5

    invoke-virtual {p0, v2, p4}, Lcom/b/a/c/f;->a(II)V

    .line 121
    const/4 v2, 0x6

    move-wide/from16 v0, p5

    invoke-virtual {p0, v2, v0, v1}, Lcom/b/a/c/f;->a(IJ)V

    .line 122
    const/4 v2, 0x7

    move-wide/from16 v0, p7

    invoke-virtual {p0, v2, v0, v1}, Lcom/b/a/c/f;->a(IJ)V

    .line 123
    const/16 v2, 0xa

    move/from16 v0, p9

    invoke-virtual {p0, v2, v0}, Lcom/b/a/c/f;->a(IZ)V

    .line 125
    invoke-interface/range {p10 .. p10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/Map$Entry;

    .line 126
    const/16 v2, 0xb

    const/4 v3, 0x2

    invoke-virtual {p0, v2, v3}, Lcom/b/a/c/f;->e(II)V

    .line 127
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/a/a/b/y;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/b/a/c/bu;->a(La/a/a/a/a/b/y;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/b/a/c/f;->e(I)V

    .line 129
    const/4 v3, 0x1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/a/a/b/y;

    iget v2, v2, La/a/a/a/a/b/y;->h:I

    invoke-virtual {p0, v3, v2}, Lcom/b/a/c/f;->b(II)V

    .line 130
    const/4 v3, 0x2

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v2

    invoke-virtual {p0, v3, v2}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    goto :goto_4

    .line 2445
    :cond_3
    const/16 v2, 0xd

    invoke-static {v2, v8}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v2

    goto :goto_2

    .line 2446
    :cond_4
    const/16 v2, 0xe

    invoke-static {v2, v7}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v2

    goto :goto_3

    .line 132
    :cond_5
    const/16 v2, 0xc

    move/from16 v0, p11

    invoke-virtual {p0, v2, v0}, Lcom/b/a/c/f;->a(II)V

    .line 134
    if-eqz v8, :cond_6

    .line 135
    const/16 v2, 0xd

    invoke-virtual {p0, v2, v8}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 137
    :cond_6
    if-eqz v7, :cond_7

    .line 138
    const/16 v2, 0xe

    invoke-virtual {p0, v2, v7}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 140
    :cond_7
    return-void
.end method

.method public static a(Lcom/b/a/c/f;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    .prologue
    .line 56
    const/4 v0, 0x1

    invoke-static {p2}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 57
    const/4 v0, 0x2

    invoke-static {p1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 58
    const/4 v0, 0x3

    invoke-virtual {p0, v0, p3, p4}, Lcom/b/a/c/f;->a(IJ)V

    .line 59
    return-void
.end method

.method public static a(Lcom/b/a/c/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x1

    const/4 v5, 0x2

    .line 145
    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-static {p1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    .line 146
    invoke-static {p2}, Lcom/b/a/c/bu;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v2

    .line 147
    invoke-static {p3}, Lcom/b/a/c/bu;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v3

    .line 150
    invoke-static {v6, v1}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 151
    if-eqz p2, :cond_1

    .line 152
    invoke-static {v5, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v4

    add-int/2addr v0, v4

    .line 154
    :cond_1
    if-eqz p3, :cond_2

    .line 155
    invoke-static {v7, v3}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v4

    add-int/2addr v0, v4

    .line 158
    :cond_2
    const/4 v4, 0x6

    invoke-virtual {p0, v4, v5}, Lcom/b/a/c/f;->e(II)V

    .line 159
    invoke-virtual {p0, v0}, Lcom/b/a/c/f;->e(I)V

    .line 160
    invoke-virtual {p0, v6, v1}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 161
    if-eqz p2, :cond_3

    .line 162
    invoke-virtual {p0, v5, v2}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 164
    :cond_3
    if-eqz p3, :cond_4

    .line 165
    invoke-virtual {p0, v7, v3}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 167
    :cond_4
    return-void
.end method

.method private static a(Lcom/b/a/c/f;Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)V
    .locals 4

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 314
    invoke-virtual {p0, v1, v2}, Lcom/b/a/c/f;->e(II)V

    .line 315
    invoke-static {p1, p2, p3, p4}, Lcom/b/a/c/bu;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)I

    move-result v0

    .line 316
    invoke-virtual {p0, v0}, Lcom/b/a/c/f;->e(I)V

    .line 317
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 318
    invoke-virtual {p0, v2, p3}, Lcom/b/a/c/f;->a(II)V

    .line 320
    array-length v1, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p2, v0

    .line 321
    const/4 v3, 0x3

    invoke-static {p0, v3, v2, p4}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;ILjava/lang/StackTraceElement;Z)V

    .line 320
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 323
    :cond_0
    return-void
.end method

.method public static a(Lcom/b/a/c/f;Z)V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x1

    const/4 v5, 0x2

    const/4 v4, 0x3

    .line 88
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v0}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v0

    .line 89
    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-static {v1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    .line 91
    const/16 v2, 0x8

    invoke-virtual {p0, v2, v5}, Lcom/b/a/c/f;->e(II)V

    .line 2408
    invoke-static {v6, v4}, Lcom/b/a/c/f;->d(II)I

    move-result v2

    add-int/lit8 v2, v2, 0x0

    .line 2409
    invoke-static {v5, v0}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v3

    add-int/2addr v2, v3

    .line 2410
    invoke-static {v4, v1}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v3

    add-int/2addr v2, v3

    .line 2411
    invoke-static {v7}, Lcom/b/a/c/f;->b(I)I

    move-result v3

    add-int/2addr v2, v3

    .line 92
    invoke-virtual {p0, v2}, Lcom/b/a/c/f;->e(I)V

    .line 93
    invoke-virtual {p0, v6, v4}, Lcom/b/a/c/f;->b(II)V

    .line 94
    invoke-virtual {p0, v5, v0}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 95
    invoke-virtual {p0, v4, v1}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 96
    invoke-virtual {p0, v7, p1}, Lcom/b/a/c/f;->a(IZ)V

    .line 97
    return-void
.end method

.method private b()I
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 454
    const/4 v0, 0x1

    invoke-static {v0, v2, v3}, Lcom/b/a/c/f;->b(IJ)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 455
    const/4 v1, 0x2

    invoke-static {v1, v2, v3}, Lcom/b/a/c/f;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 456
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/b/a/c/bu;->g:Lcom/b/a/c/b;

    invoke-static {v1, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v1

    add-int/2addr v0, v1

    .line 457
    iget-object v1, p0, Lcom/b/a/c/bu;->h:Lcom/b/a/c/b;

    if-eqz v1, :cond_0

    .line 458
    const/4 v1, 0x4

    iget-object v2, p0, Lcom/b/a/c/bu;->h:Lcom/b/a/c/b;

    invoke-static {v1, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v1

    add-int/2addr v0, v1

    .line 461
    :cond_0
    return v0
.end method

.method private static c()I
    .locals 4

    .prologue
    .line 623
    const/4 v0, 0x1

    sget-object v1, Lcom/b/a/c/bu;->a:Lcom/b/a/c/b;

    invoke-static {v0, v1}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 624
    const/4 v1, 0x2

    sget-object v2, Lcom/b/a/c/bu;->a:Lcom/b/a/c/b;

    invoke-static {v1, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v1

    add-int/2addr v0, v1

    .line 625
    const/4 v1, 0x3

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/b/a/c/f;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 627
    return v0
.end method


# virtual methods
.method public final a(Lcom/b/a/c/f;JLjava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Thread;FIZIJJLandroid/app/ActivityManager$RunningAppProcessInfo;Ljava/util/List;[Ljava/lang/StackTraceElement;Lcom/b/a/c/aw;Ljava/util/Map;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/b/a/c/f;",
            "J",
            "Ljava/lang/Thread;",
            "Ljava/lang/Throwable;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Thread;",
            "FIZIJJ",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/StackTraceElement;",
            ">;[",
            "Ljava/lang/StackTraceElement;",
            "Lcom/b/a/c/aw;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 180
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/b/a/c/bu;->b:Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 181
    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/b/a/c/bu;->d:Ljava/util/List;

    .line 182
    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/b/a/c/bu;->e:[Ljava/lang/StackTraceElement;

    .line 183
    move-object/from16 v0, p7

    iput-object v0, p0, Lcom/b/a/c/bu;->c:[Ljava/lang/Thread;

    .line 185
    invoke-virtual/range {p19 .. p19}, Lcom/b/a/c/aw;->a()Lcom/b/a/c/b;

    move-result-object v10

    .line 187
    if-nez v10, :cond_0

    .line 188
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 192
    :cond_0
    invoke-virtual/range {p19 .. p19}, Lcom/b/a/c/aw;->b()V

    .line 194
    const/16 v4, 0xa

    const/4 v5, 0x2

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->e(II)V

    .line 2471
    const/4 v4, 0x1

    move-wide/from16 v0, p2

    invoke-static {v4, v0, v1}, Lcom/b/a/c/f;->b(IJ)I

    move-result v4

    add-int/lit8 v4, v4, 0x0

    .line 2472
    const/4 v5, 0x2

    invoke-static/range {p6 .. p6}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v5

    add-int/2addr v4, v5

    .line 2473
    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move/from16 v2, p11

    move-object/from16 v3, p20

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/b/a/c/bu;->a(Ljava/lang/Thread;Ljava/lang/Throwable;ILjava/util/Map;)I

    move-result v5

    .line 2474
    const/4 v6, 0x3

    invoke-static {v6}, Lcom/b/a/c/f;->d(I)I

    move-result v6

    invoke-static {v5}, Lcom/b/a/c/f;->f(I)I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v5, v6

    add-int v11, v4, v5

    move/from16 v4, p9

    move/from16 v5, p11

    move-wide/from16 v6, p12

    move-wide/from16 v8, p14

    .line 2476
    invoke-static/range {v4 .. v9}, Lcom/b/a/c/bu;->a(IIJJ)I

    move-result v4

    .line 2478
    const/4 v5, 0x5

    invoke-static {v5}, Lcom/b/a/c/f;->d(I)I

    move-result v5

    invoke-static {v4}, Lcom/b/a/c/f;->f(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    add-int/2addr v4, v11

    .line 2481
    if-eqz v10, :cond_1

    .line 2574
    const/4 v5, 0x1

    invoke-static {v5, v10}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v5

    .line 2483
    const/4 v6, 0x6

    invoke-static {v6}, Lcom/b/a/c/f;->d(I)I

    move-result v6

    invoke-static {v5}, Lcom/b/a/c/f;->f(I)I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    .line 195
    :cond_1
    invoke-virtual {p1, v4}, Lcom/b/a/c/f;->e(I)V

    .line 198
    const/4 v4, 0x1

    move-wide/from16 v0, p2

    invoke-virtual {p1, v4, v0, v1}, Lcom/b/a/c/f;->a(IJ)V

    .line 199
    const/4 v4, 0x2

    invoke-static/range {p6 .. p6}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v5

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 3210
    const/4 v4, 0x3

    const/4 v5, 0x2

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->e(II)V

    .line 3211
    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move/from16 v2, p11

    move-object/from16 v3, p20

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/b/a/c/bu;->a(Ljava/lang/Thread;Ljava/lang/Throwable;ILjava/util/Map;)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/b/a/c/f;->e(I)V

    .line 3231
    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->e(II)V

    .line 3232
    move-object/from16 v0, p4

    move-object/from16 v1, p5

    invoke-direct {p0, v0, v1}, Lcom/b/a/c/bu;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/b/a/c/f;->e(I)V

    .line 3234
    iget-object v4, p0, Lcom/b/a/c/bu;->e:[Ljava/lang/StackTraceElement;

    const/4 v5, 0x4

    const/4 v6, 0x1

    move-object/from16 v0, p4

    invoke-static {p1, v0, v4, v5, v6}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)V

    .line 3238
    iget-object v4, p0, Lcom/b/a/c/bu;->c:[Ljava/lang/Thread;

    array-length v6, v4

    .line 3239
    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v6, :cond_2

    .line 3240
    iget-object v4, p0, Lcom/b/a/c/bu;->c:[Ljava/lang/Thread;

    aget-object v7, v4, v5

    .line 3241
    iget-object v4, p0, Lcom/b/a/c/bu;->d:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/StackTraceElement;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {p1, v7, v4, v8, v9}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)V

    .line 3239
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    goto :goto_0

    .line 3244
    :cond_2
    const/4 v5, 0x1

    const/4 v4, 0x2

    move-object v6, p1

    move-object v7, p0

    .line 3280
    :goto_1
    const/4 v8, 0x2

    invoke-virtual {v6, v4, v8}, Lcom/b/a/c/f;->e(II)V

    .line 3281
    const/4 v4, 0x1

    move-object/from16 v0, p5

    invoke-direct {v7, v0, v4}, Lcom/b/a/c/bu;->a(Ljava/lang/Throwable;I)I

    move-result v4

    invoke-virtual {v6, v4}, Lcom/b/a/c/f;->e(I)V

    .line 3283
    const/4 v4, 0x1

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v8

    invoke-virtual {v6, v4, v8}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 3284
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v4

    .line 3285
    if-eqz v4, :cond_3

    .line 3286
    const/4 v8, 0x3

    invoke-static {v4}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v4

    invoke-virtual {v6, v8, v4}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 3289
    :cond_3
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v8

    array-length v9, v8

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v9, :cond_4

    aget-object v11, v8, v4

    .line 3290
    const/4 v12, 0x4

    const/4 v13, 0x1

    invoke-static {v6, v12, v11, v13}, Lcom/b/a/c/bu;->a(Lcom/b/a/c/f;ILjava/lang/StackTraceElement;Z)V

    .line 3289
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 3293
    :cond_4
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p5

    .line 3294
    if-eqz p5, :cond_7

    .line 3295
    iget v4, v7, Lcom/b/a/c/bu;->i:I

    if-ge v5, v4, :cond_5

    .line 3296
    add-int/lit8 v5, v5, 0x1

    const/4 v4, 0x6

    goto :goto_1

    .line 3300
    :cond_5
    const/4 v4, 0x0

    .line 3301
    :goto_3
    if-eqz p5, :cond_6

    .line 3302
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p5

    .line 3303
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 3305
    :cond_6
    const/4 v5, 0x7

    invoke-virtual {v6, v5, v4}, Lcom/b/a/c/f;->a(II)V

    .line 3246
    :cond_7
    const/4 v4, 0x3

    const/4 v5, 0x2

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->e(II)V

    .line 3247
    invoke-static {}, Lcom/b/a/c/bu;->c()I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/b/a/c/f;->e(I)V

    .line 3248
    const/4 v4, 0x1

    sget-object v5, Lcom/b/a/c/bu;->a:Lcom/b/a/c/b;

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 3249
    const/4 v4, 0x2

    sget-object v5, Lcom/b/a/c/bu;->a:Lcom/b/a/c/b;

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 3250
    const/4 v4, 0x3

    const-wide/16 v6, 0x0

    invoke-virtual {p1, v4, v6, v7}, Lcom/b/a/c/f;->a(IJ)V

    .line 3252
    const/4 v4, 0x4

    const/4 v5, 0x2

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->e(II)V

    .line 3253
    invoke-direct {p0}, Lcom/b/a/c/bu;->b()I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/b/a/c/f;->e(I)V

    .line 3254
    const/4 v4, 0x1

    const-wide/16 v6, 0x0

    invoke-virtual {p1, v4, v6, v7}, Lcom/b/a/c/f;->a(IJ)V

    .line 3255
    const/4 v4, 0x2

    const-wide/16 v6, 0x0

    invoke-virtual {p1, v4, v6, v7}, Lcom/b/a/c/f;->a(IJ)V

    .line 3256
    const/4 v4, 0x3

    iget-object v5, p0, Lcom/b/a/c/bu;->g:Lcom/b/a/c/b;

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 3257
    iget-object v4, p0, Lcom/b/a/c/bu;->h:Lcom/b/a/c/b;

    if-eqz v4, :cond_8

    .line 3258
    const/4 v4, 0x4

    iget-object v5, p0, Lcom/b/a/c/bu;->h:Lcom/b/a/c/b;

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 3215
    :cond_8
    if-eqz p20, :cond_a

    invoke-interface/range {p20 .. p20}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    .line 4266
    invoke-interface/range {p20 .. p20}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 4267
    const/4 v5, 0x2

    const/4 v6, 0x2

    invoke-virtual {p1, v5, v6}, Lcom/b/a/c/f;->e(II)V

    .line 4268
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v5, v6}, Lcom/b/a/c/bu;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p1, v5}, Lcom/b/a/c/f;->e(I)V

    .line 4271
    const/4 v6, 0x1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v5

    invoke-virtual {p1, v6, v5}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 4272
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 4273
    const/4 v5, 0x2

    if-nez v4, :cond_9

    const-string v4, ""

    :cond_9
    invoke-static {v4}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v4

    invoke-virtual {p1, v5, v4}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    goto :goto_4

    .line 3220
    :cond_a
    iget-object v4, p0, Lcom/b/a/c/bu;->b:Landroid/app/ActivityManager$RunningAppProcessInfo;

    if-eqz v4, :cond_b

    .line 3222
    const/4 v5, 0x3

    iget-object v4, p0, Lcom/b/a/c/bu;->b:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v4, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v6, 0x64

    if-eq v4, v6, :cond_d

    const/4 v4, 0x1

    :goto_5
    invoke-virtual {p1, v5, v4}, Lcom/b/a/c/f;->a(IZ)V

    .line 3226
    :cond_b
    const/4 v4, 0x4

    move/from16 v0, p11

    invoke-virtual {p1, v4, v0}, Lcom/b/a/c/f;->a(II)V

    .line 4361
    const/4 v4, 0x5

    const/4 v5, 0x2

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->e(II)V

    move/from16 v4, p9

    move/from16 v5, p11

    move-wide/from16 v6, p12

    move-wide/from16 v8, p14

    .line 4362
    invoke-static/range {v4 .. v9}, Lcom/b/a/c/bu;->a(IIJJ)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/b/a/c/f;->e(I)V

    .line 4364
    move/from16 v0, p8

    invoke-virtual {p1, v0}, Lcom/b/a/c/f;->a(F)V

    .line 4365
    move/from16 v0, p9

    invoke-virtual {p1, v0}, Lcom/b/a/c/f;->a(I)V

    .line 4366
    const/4 v4, 0x3

    move/from16 v0, p10

    invoke-virtual {p1, v4, v0}, Lcom/b/a/c/f;->a(IZ)V

    .line 4367
    const/4 v4, 0x4

    move/from16 v0, p11

    invoke-virtual {p1, v4, v0}, Lcom/b/a/c/f;->a(II)V

    .line 4368
    const/4 v4, 0x5

    move-wide/from16 v0, p12

    invoke-virtual {p1, v4, v0, v1}, Lcom/b/a/c/f;->a(IJ)V

    .line 4369
    const/4 v4, 0x6

    move-wide/from16 v0, p14

    invoke-virtual {p1, v4, v0, v1}, Lcom/b/a/c/f;->a(IJ)V

    .line 4373
    if-eqz v10, :cond_c

    .line 4374
    const/4 v4, 0x6

    const/4 v5, 0x2

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->e(II)V

    .line 4574
    const/4 v4, 0x1

    invoke-static {v4, v10}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v4

    .line 4375
    invoke-virtual {p1, v4}, Lcom/b/a/c/f;->e(I)V

    .line 4376
    const/4 v4, 0x1

    invoke-virtual {p1, v4, v10}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 205
    :cond_c
    return-void

    .line 3222
    :cond_d
    const/4 v4, 0x0

    goto :goto_5
.end method

.method public final a(Lcom/b/a/c/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8

    .prologue
    .line 64
    invoke-static {p2}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v0

    .line 65
    invoke-static {p3}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    .line 66
    invoke-static {p4}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v2

    .line 67
    invoke-static {p5}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v3

    .line 70
    const/4 v4, 0x7

    const/4 v5, 0x2

    invoke-virtual {p1, v4, v5}, Lcom/b/a/c/f;->e(II)V

    .line 1385
    const/4 v4, 0x1

    invoke-static {v4, v0}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v4

    add-int/lit8 v4, v4, 0x0

    .line 1386
    const/4 v5, 0x2

    invoke-static {v5, v1}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v5

    add-int/2addr v4, v5

    .line 1387
    const/4 v5, 0x3

    invoke-static {v5, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v5

    add-int/2addr v4, v5

    .line 1388
    invoke-direct {p0}, Lcom/b/a/c/bu;->a()I

    move-result v5

    .line 1389
    const/4 v6, 0x5

    invoke-static {v6}, Lcom/b/a/c/f;->d(I)I

    move-result v6

    invoke-static {v5}, Lcom/b/a/c/f;->f(I)I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    .line 1391
    const/4 v5, 0x6

    invoke-static {v5, v3}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v5

    add-int/2addr v4, v5

    .line 1392
    const/16 v5, 0xa

    invoke-static {v5, p6}, Lcom/b/a/c/f;->d(II)I

    move-result v5

    add-int/2addr v4, v5

    .line 71
    invoke-virtual {p1, v4}, Lcom/b/a/c/f;->e(I)V

    .line 73
    const/4 v4, 0x1

    invoke-virtual {p1, v4, v0}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 74
    const/4 v0, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 75
    const/4 v0, 0x3

    invoke-virtual {p1, v0, v2}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 78
    const/4 v0, 0x5

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/b/a/c/f;->e(II)V

    .line 79
    invoke-direct {p0}, Lcom/b/a/c/bu;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/b/a/c/f;->e(I)V

    .line 80
    new-instance v0, La/a/a/a/a/b/j;

    invoke-direct {v0}, La/a/a/a/a/b/j;-><init>()V

    iget-object v0, p0, Lcom/b/a/c/bu;->f:Landroid/content/Context;

    invoke-static {v0}, La/a/a/a/a/b/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2196
    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-virtual {p1, v1, v2}, Lcom/b/a/c/f;->e(II)V

    .line 2317
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 2318
    array-length v1, v0

    invoke-virtual {p1, v1}, Lcom/b/a/c/f;->e(I)V

    .line 2319
    invoke-virtual {p1, v0}, Lcom/b/a/c/f;->a([B)V

    .line 83
    const/4 v0, 0x6

    invoke-virtual {p1, v0, v3}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 84
    const/16 v0, 0xa

    invoke-virtual {p1, v0, p6}, Lcom/b/a/c/f;->b(II)V

    .line 85
    return-void
.end method
