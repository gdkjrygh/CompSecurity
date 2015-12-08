.class final Lkik/a/j/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/a/j/a;


# direct methods
.method constructor <init>(Lkik/a/j/a;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 412
    iput-object p1, p0, Lkik/a/j/j;->b:Lkik/a/j/a;

    iput-object p2, p0, Lkik/a/j/j;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 416
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 419
    iget-object v1, p0, Lkik/a/j/j;->b:Lkik/a/j/a;

    invoke-static {v1}, Lkik/a/j/a;->b(Lkik/a/j/a;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v5

    .line 421
    if-eqz v5, :cond_2

    .line 423
    array-length v6, v5

    move v3, v0

    :goto_0
    if-ge v3, v6, :cond_2

    aget-object v0, v5, v3

    .line 424
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x5f

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :cond_0
    const/16 v0, 0x2e

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    const/4 v0, 0x0

    if-ltz v7, :cond_3

    const/4 v0, 0x0

    invoke-virtual {v2, v0, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v7, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v1, v2, v7

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 425
    const/4 v0, 0x0

    aget-object v0, v2, v0

    .line 426
    const/4 v1, 0x1

    aget-object v1, v2, v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 429
    :try_start_1
    iget-object v2, p0, Lkik/a/j/j;->b:Lkik/a/j/a;

    invoke-static {v2, v0, v1}, Lkik/a/j/a;->a(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;)Lkik/a/d/ab;

    move-result-object v2

    .line 431
    if-eqz v2, :cond_1

    .line 433
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 423
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 436
    :cond_1
    new-instance v2, Ljava/io/FileNotFoundException;

    invoke-direct {v2}, Ljava/io/FileNotFoundException;-><init>()V

    throw v2
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 441
    :catch_0
    move-exception v2

    :try_start_2
    new-instance v2, Lkik/a/d/ab;

    invoke-direct {v2, v0, v1}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 448
    :catch_1
    move-exception v0

    .line 449
    iget-object v1, p0, Lkik/a/j/j;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 451
    :goto_3
    return-void

    .line 446
    :cond_2
    :try_start_3
    iget-object v0, p0, Lkik/a/j/j;->a:Lcom/kik/g/p;

    invoke-virtual {v0, v4}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :cond_3
    move-object v1, v2

    goto :goto_1
.end method
