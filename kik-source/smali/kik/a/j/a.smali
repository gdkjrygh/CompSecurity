.class public final Lkik/a/j/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/x;


# instance fields
.field private a:Ljava/io/File;

.field private b:Ljava/io/File;

.field private c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lkik/a/j/a;->a:Ljava/io/File;

    .line 35
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    .line 37
    iget-object v0, p0, Lkik/a/j/a;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 38
    iget-object v0, p0, Lkik/a/j/a;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 42
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, ".updated"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/a/j/a;->b:Ljava/io/File;

    .line 44
    iget-object v0, p0, Lkik/a/j/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 45
    iget-object v0, p0, Lkik/a/j/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 47
    :cond_1
    return-void
.end method

.method static synthetic a(Lkik/a/j/a;)Ljava/io/File;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/a/j/a;->a:Ljava/io/File;

    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lkik/a/d/ab;
    .locals 1

    .prologue
    .line 25
    invoke-static {p0, p1, p2}, Lkik/a/j/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lkik/a/d/ab;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;)Lkik/a/d/ab;
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 25
    iget-object v0, p0, Lkik/a/j/a;->a:Ljava/io/File;

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    if-eqz v2, :cond_6

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkik/a/j/a;->a:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V

    throw v0

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_1
    if-nez p2, :cond_3

    move-object v0, p1

    :goto_2
    new-instance v4, Lkik/a/j/e;

    invoke-direct {v4, p0, v0}, Lkik/a/j/e;-><init>(Lkik/a/j/a;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    if-nez v1, :cond_5

    if-eqz v2, :cond_4

    const/4 v0, 0x0

    :goto_3
    return-object v0

    :cond_3
    move-object v0, p2

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V

    throw v0

    :cond_5
    aget-object v0, v0, v3

    invoke-static {p1, p2, v0}, Lkik/a/j/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lkik/a/d/ab;

    move-result-object v0

    goto :goto_3

    :cond_6
    move-object v1, v0

    goto :goto_1
.end method

.method static synthetic a(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;[B)Lkik/a/d/ab;
    .locals 5

    .prologue
    .line 25
    iget-object v0, p0, Lkik/a/j/a;->a:Ljava/io/File;

    if-eqz p2, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkik/a/j/a;->a:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    :cond_1
    if-nez p2, :cond_4

    move-object v1, p1

    :goto_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    if-nez p3, :cond_5

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    :cond_2
    invoke-static {p1, p2}, Lkik/a/j/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lkik/a/j/a;->b:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_3
    :goto_1
    if-nez p3, :cond_7

    new-instance v0, Lkik/a/d/ab;

    invoke-direct {v0, p1, p2}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-object v0

    :cond_4
    move-object v1, p2

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    :cond_6
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0, p3}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    goto :goto_1

    :cond_7
    new-instance v0, Lkik/a/d/ab;

    invoke-direct {v0, p1, p2, p3}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    goto :goto_2
.end method

.method static synthetic a(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 25
    iget-object v0, p0, Lkik/a/j/a;->a:Ljava/io/File;

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkik/a/j/a;->a:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    :cond_2
    if-nez p3, :cond_3

    if-nez p2, :cond_4

    :goto_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    :cond_3
    return-void

    :cond_4
    move-object p1, p2

    goto :goto_0
.end method

.method static synthetic b(Lkik/a/j/a;)Ljava/io/File;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/a/j/a;->b:Ljava/io/File;

    return-object v0
.end method

.method static synthetic b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-static {p0, p1}, Lkik/a/j/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lkik/a/d/ab;
    .locals 5

    .prologue
    .line 157
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V

    throw v0

    .line 161
    :cond_1
    const/4 v0, 0x0

    .line 162
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 163
    invoke-virtual {p2}, Ljava/io/File;->length()J

    move-result-wide v2

    long-to-int v2, v2

    .line 165
    if-eqz v2, :cond_3

    .line 166
    new-array v3, v2, [B

    .line 167
    const/4 v0, 0x0

    .line 170
    :goto_0
    if-ge v0, v2, :cond_2

    .line 171
    invoke-virtual {v1, v3}, Ljava/io/FileInputStream;->read([B)I

    move-result v4

    .line 173
    if-lez v4, :cond_2

    .line 174
    add-int/2addr v0, v4

    .line 178
    goto :goto_0

    .line 180
    :cond_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 182
    new-instance v0, Lkik/a/d/ab;

    invoke-direct {v0, p0, p1, v3}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    .line 185
    :cond_3
    return-object v0
.end method

.method static synthetic b(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 25
    iget-object v2, p0, Lkik/a/j/a;->a:Ljava/io/File;

    if-eqz p2, :cond_1

    move v3, v1

    :goto_0
    if-eqz v3, :cond_2

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lkik/a/j/a;->a:Ljava/io/File;

    invoke-direct {v2, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    :goto_1
    return v0

    :cond_1
    move v3, v0

    goto :goto_0

    :cond_2
    if-nez p2, :cond_3

    :goto_2
    new-instance v3, Lkik/a/j/b;

    invoke-direct {v3, p0, p1}, Lkik/a/j/b;-><init>(Lkik/a/j/a;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v2

    array-length v2, v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_1

    :cond_3
    move-object p1, p2

    goto :goto_2
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 79
    if-eqz p1, :cond_0

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 85
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final a()Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 346
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 348
    iget-object v1, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/a/j/h;

    invoke-direct {v2, p0, v0}, Lkik/a/j/h;-><init>(Lkik/a/j/a;Lcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 373
    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 292
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 294
    iget-object v1, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/a/j/g;

    invoke-direct {v2, p0, p1, v0}, Lkik/a/j/g;-><init>(Lkik/a/j/a;Ljava/lang/String;Lcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 340
    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 271
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 273
    iget-object v1, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/a/j/f;

    invoke-direct {v2, p0, p1, p2, v0}, Lkik/a/j/f;-><init>(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;Lcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 286
    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;[B)Lcom/kik/g/p;
    .locals 7

    .prologue
    .line 460
    new-instance v5, Lcom/kik/g/p;

    invoke-direct {v5}, Lcom/kik/g/p;-><init>()V

    .line 462
    iget-object v6, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lkik/a/j/k;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lkik/a/j/k;-><init>(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/g/p;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 490
    return-object v5
.end method

.method public final a(Ljava/util/List;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 379
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 381
    iget-object v1, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/a/j/i;

    invoke-direct {v2, p0, p1, v0}, Lkik/a/j/i;-><init>(Lkik/a/j/a;Ljava/util/List;Lcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 404
    return-object v0
.end method

.method public final b()Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 410
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 412
    iget-object v1, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/a/j/j;

    invoke-direct {v2, p0, v0}, Lkik/a/j/j;-><init>(Lkik/a/j/a;Lcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 454
    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 518
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 520
    iget-object v1, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/a/j/c;

    invoke-direct {v2, p0, p1, v0}, Lkik/a/j/c;-><init>(Lkik/a/j/a;Ljava/lang/String;Lcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 534
    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;[B)Lcom/kik/g/p;
    .locals 7

    .prologue
    .line 496
    new-instance v5, Lcom/kik/g/p;

    invoke-direct {v5}, Lcom/kik/g/p;-><init>()V

    .line 498
    iget-object v6, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lkik/a/j/l;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lkik/a/j/l;-><init>(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/g/p;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 512
    return-object v5
.end method

.method public final b(Ljava/util/List;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 540
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 542
    iget-object v1, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/a/j/d;

    invoke-direct {v2, p0, p1, v0}, Lkik/a/j/d;-><init>(Lkik/a/j/a;Ljava/util/List;Lcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 558
    return-object v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 564
    iget-object v0, p0, Lkik/a/j/a;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 565
    return-void
.end method
