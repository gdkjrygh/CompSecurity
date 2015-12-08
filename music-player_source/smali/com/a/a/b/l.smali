.class final Lcom/a/a/b/l;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/d;
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/a/a/b/e/a;

.field final c:Lcom/a/a/b/d;

.field final d:Lcom/a/a/b/f/a;

.field final e:Lcom/a/a/b/f/b;

.field private final f:Lcom/a/a/b/i;

.field private final g:Lcom/a/a/b/k;

.field private final h:Landroid/os/Handler;

.field private final i:Lcom/a/a/b/g;

.field private final j:Lcom/a/a/b/d/c;

.field private final k:Lcom/a/a/b/d/c;

.field private final l:Lcom/a/a/b/d/c;

.field private final m:Lcom/a/a/b/b/d;

.field private final n:Z

.field private final o:Ljava/lang/String;

.field private final p:Lcom/a/a/b/a/f;

.field private q:Lcom/a/a/b/a/g;


# direct methods
.method public constructor <init>(Lcom/a/a/b/i;Lcom/a/a/b/k;Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/a/a/b/a/g;->a:Lcom/a/a/b/a/g;

    iput-object v0, p0, Lcom/a/a/b/l;->q:Lcom/a/a/b/a/g;

    iput-object p1, p0, Lcom/a/a/b/l;->f:Lcom/a/a/b/i;

    iput-object p2, p0, Lcom/a/a/b/l;->g:Lcom/a/a/b/k;

    iput-object p3, p0, Lcom/a/a/b/l;->h:Landroid/os/Handler;

    iget-object v0, p1, Lcom/a/a/b/i;->a:Lcom/a/a/b/g;

    iput-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->r:Lcom/a/a/b/d/c;

    iput-object v0, p0, Lcom/a/a/b/l;->j:Lcom/a/a/b/d/c;

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->w:Lcom/a/a/b/d/c;

    iput-object v0, p0, Lcom/a/a/b/l;->k:Lcom/a/a/b/d/c;

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->x:Lcom/a/a/b/d/c;

    iput-object v0, p0, Lcom/a/a/b/l;->l:Lcom/a/a/b/d/c;

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->s:Lcom/a/a/b/b/d;

    iput-object v0, p0, Lcom/a/a/b/l;->m:Lcom/a/a/b/b/d;

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-boolean v0, v0, Lcom/a/a/b/g;->u:Z

    iput-boolean v0, p0, Lcom/a/a/b/l;->n:Z

    iget-object v0, p2, Lcom/a/a/b/k;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/b/l;->a:Ljava/lang/String;

    iget-object v0, p2, Lcom/a/a/b/k;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    iget-object v0, p2, Lcom/a/a/b/k;->c:Lcom/a/a/b/e/a;

    iput-object v0, p0, Lcom/a/a/b/l;->b:Lcom/a/a/b/e/a;

    iget-object v0, p2, Lcom/a/a/b/k;->d:Lcom/a/a/b/a/f;

    iput-object v0, p0, Lcom/a/a/b/l;->p:Lcom/a/a/b/a/f;

    iget-object v0, p2, Lcom/a/a/b/k;->e:Lcom/a/a/b/d;

    iput-object v0, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    iget-object v0, p2, Lcom/a/a/b/k;->f:Lcom/a/a/b/f/a;

    iput-object v0, p0, Lcom/a/a/b/l;->d:Lcom/a/a/b/f/a;

    iget-object v0, p2, Lcom/a/a/b/k;->g:Lcom/a/a/b/f/b;

    iput-object v0, p0, Lcom/a/a/b/l;->e:Lcom/a/a/b/f/b;

    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    iget-object v0, p0, Lcom/a/a/b/l;->b:Lcom/a/a/b/e/a;

    invoke-interface {v0}, Lcom/a/a/b/e/a;->c()Lcom/a/a/b/a/i;

    move-result-object v4

    new-instance v0, Lcom/a/a/b/b/e;

    iget-object v1, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    iget-object v3, p0, Lcom/a/a/b/l;->p:Lcom/a/a/b/a/f;

    invoke-direct {p0}, Lcom/a/a/b/l;->d()Lcom/a/a/b/d/c;

    move-result-object v5

    iget-object v6, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lcom/a/a/b/b/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/a/a/b/a/f;Lcom/a/a/b/a/i;Lcom/a/a/b/d/c;Lcom/a/a/b/d;)V

    iget-object v1, p0, Lcom/a/a/b/l;->m:Lcom/a/a/b/b/d;

    invoke-interface {v1, v0}, Lcom/a/a/b/b/d;->a(Lcom/a/a/b/b/e;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/a/a/b/l;)Lcom/a/a/b/g;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    return-object v0
.end method

.method private a(Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v0}, Lcom/a/a/b/d;->s()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/a/a/b/l;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/a/a/b/l;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/a/a/b/n;

    invoke-direct {v0, p0, p1, p2}, Lcom/a/a/b/n;-><init>(Lcom/a/a/b/l;Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/a/a/b/l;->h:Landroid/os/Handler;

    invoke-static {v0, v1, v2}, Lcom/a/a/b/l;->a(Ljava/lang/Runnable;ZLandroid/os/Handler;)V

    goto :goto_0
.end method

.method static a(Ljava/lang/Runnable;ZLandroid/os/Handler;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void

    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_1
    invoke-virtual {p2, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method private a()Z
    .locals 6

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/a/a/b/l;->f:Lcom/a/a/b/i;

    invoke-virtual {v1}, Lcom/a/a/b/i;->a()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/a/a/b/l;->f:Lcom/a/a/b/i;

    invoke-virtual {v2}, Lcom/a/a/b/i;->b()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "ImageLoader is paused. Waiting...  [%s]"

    invoke-direct {p0, v1}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/a/a/b/l;->f:Lcom/a/a/b/i;

    invoke-virtual {v1}, Lcom/a/a/b/i;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v0, ".. Resume loading [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    :cond_0
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    invoke-direct {p0}, Lcom/a/a/b/l;->f()Z

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v1

    :try_start_3
    const-string v1, "Task was interrupted [%s]"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-static {v1, v3}, Lcom/a/a/c/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method private a(Ljava/io/File;)Z
    .locals 5

    const-string v0, "Cache image on disc [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/a/a/b/l;->b(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    :try_start_1
    iget-object v1, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget v1, v1, Lcom/a/a/b/g;->d:I

    iget-object v2, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget v2, v2, Lcom/a/a/b/g;->e:I

    if-gtz v1, :cond_0

    if-lez v2, :cond_1

    :cond_0
    const-string v3, "Resize image in disc cache [%s]"

    invoke-direct {p0, v3}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    invoke-direct {p0, p1, v1, v2}, Lcom/a/a/b/l;->a(Ljava/io/File;II)Z

    move-result v0

    :cond_1
    iget-object v1, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v1, v1, Lcom/a/a/b/g;->q:Lcom/a/a/a/a/b;

    iget-object v2, p0, Lcom/a/a/b/l;->a:Ljava/lang/String;

    invoke-interface {v1, p1}, Lcom/a/a/a/a/b;->a(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_0
    return v0

    :catch_0
    move-exception v0

    move-object v4, v0

    move v0, v1

    move-object v1, v4

    :goto_1
    invoke-static {v1}, Lcom/a/a/c/e;->a(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method private a(Ljava/io/File;II)Z
    .locals 8

    const/4 v7, 0x1

    new-instance v3, Lcom/a/a/b/a/f;

    invoke-direct {v3, p2, p3}, Lcom/a/a/b/a/f;-><init>(II)V

    new-instance v0, Lcom/a/a/b/e;

    invoke-direct {v0}, Lcom/a/a/b/e;-><init>()V

    iget-object v1, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->a(Lcom/a/a/b/d;)Lcom/a/a/b/e;

    move-result-object v0

    sget-object v1, Lcom/a/a/b/a/e;->c:Lcom/a/a/b/a/e;

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->a(Lcom/a/a/b/a/e;)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->d()Lcom/a/a/b/d;

    move-result-object v6

    new-instance v0, Lcom/a/a/b/b/e;

    iget-object v1, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    sget-object v2, Lcom/a/a/b/d/d;->c:Lcom/a/a/b/d/d;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/a/a/b/d/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lcom/a/a/b/a/i;->a:Lcom/a/a/b/a/i;

    invoke-direct {p0}, Lcom/a/a/b/l;->d()Lcom/a/a/b/d/c;

    move-result-object v5

    invoke-direct/range {v0 .. v6}, Lcom/a/a/b/b/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/a/a/b/a/f;Lcom/a/a/b/a/i;Lcom/a/a/b/d/c;Lcom/a/a/b/d;)V

    iget-object v1, p0, Lcom/a/a/b/l;->m:Lcom/a/a/b/b/d;

    invoke-interface {v1, v0}, Lcom/a/a/b/b/d;->a(Lcom/a/a/b/b/e;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v1, v1, Lcom/a/a/b/g;->h:Lcom/a/a/b/g/a;

    if-eqz v1, :cond_0

    const-string v0, "Process image before cache on disc [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->h:Lcom/a/a/b/g/a;

    invoke-interface {v0}, Lcom/a/a/b/g/a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, "Bitmap processor for disc cache returned null [%s]"

    new-array v2, v7, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/a/a/c/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    if-eqz v0, :cond_1

    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const v3, 0x8000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    :try_start_0
    iget-object v2, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v2, v2, Lcom/a/a/b/g;->f:Landroid/graphics/Bitmap$CompressFormat;

    iget-object v3, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget v3, v3, Lcom/a/a/b/g;->g:I

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, Lcom/a/a/c/c;->a(Ljava/io/Closeable;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    return v7

    :catchall_0
    move-exception v0

    invoke-static {v1}, Lcom/a/a/c/c;->a(Ljava/io/Closeable;)V

    throw v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    iget-boolean v0, p0, Lcom/a/a/b/l;->n:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Lcom/a/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private b()Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v2}, Lcom/a/a/b/d;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Delay %d ms before loading...  [%s]"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v4}, Lcom/a/a/b/d;->l()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v4, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    aput-object v4, v3, v0

    iget-boolean v4, p0, Lcom/a/a/b/l;->n:Z

    if-eqz v4, :cond_0

    invoke-static {v2, v3}, Lcom/a/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v2}, Lcom/a/a/b/d;->l()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {p0}, Lcom/a/a/b/l;->f()Z

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v2

    const-string v2, "Task was interrupted [%s]"

    new-array v3, v0, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    aput-object v4, v3, v1

    invoke-static {v2, v3}, Lcom/a/a/c/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method private b(Ljava/io/File;)Z
    .locals 4

    invoke-direct {p0}, Lcom/a/a/b/l;->d()Lcom/a/a/b/d/c;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/b/l;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v2}, Lcom/a/a/b/d;->n()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/a/a/b/d/c;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v1

    :try_start_0
    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const v3, 0x8000

    invoke-direct {v0, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v1, v0, p0}, Lcom/a/a/c/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;Lcom/a/a/c/d;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    :try_start_2
    invoke-static {v0}, Lcom/a/a/c/c;->a(Ljava/io/Closeable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v1}, Lcom/a/a/c/c;->a(Ljava/io/Closeable;)V

    return v2

    :catchall_0
    move-exception v2

    :try_start_3
    invoke-static {v0}, Lcom/a/a/c/c;->a(Ljava/io/Closeable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1}, Lcom/a/a/c/c;->a(Ljava/io/Closeable;)V

    throw v0
.end method

.method private c()Landroid/graphics/Bitmap;
    .locals 6

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->q:Lcom/a/a/a/a/b;

    iget-object v1, p0, Lcom/a/a/b/l;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/a/a/a/a/b;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->v:Lcom/a/a/a/a/b;

    iget-object v1, p0, Lcom/a/a/b/l;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/a/a/a/a/b;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    :try_start_0
    sget-object v1, Lcom/a/a/b/d/d;->c:Lcom/a/a/b/d/d;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/a/a/b/d/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "Load image from disc cache [%s]"

    invoke-direct {p0, v1}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    sget-object v1, Lcom/a/a/b/a/g;->b:Lcom/a/a/b/a/g;

    iput-object v1, p0, Lcom/a/a/b/l;->q:Lcom/a/a/b/a/g;

    invoke-direct {p0}, Lcom/a/a/b/l;->e()V

    invoke-direct {p0, v3}, Lcom/a/a/b/l;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/a/a/b/p; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_2

    :try_start_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    if-gtz v4, :cond_4

    :cond_2
    const-string v4, "Load image from network [%s]"

    invoke-direct {p0, v4}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    sget-object v4, Lcom/a/a/b/a/g;->a:Lcom/a/a/b/a/g;

    iput-object v4, p0, Lcom/a/a/b/l;->q:Lcom/a/a/b/a/g;

    iget-object v4, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v4}, Lcom/a/a/b/d;->i()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->a(Ljava/io/File;)Z

    move-result v4

    if-eqz v4, :cond_5

    :goto_1
    invoke-direct {p0}, Lcom/a/a/b/l;->e()V

    invoke-direct {p0, v3}, Lcom/a/a/b/l;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-lez v3, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-gtz v3, :cond_4

    :cond_3
    sget-object v3, Lcom/a/a/b/a/c;->b:Lcom/a/a/b/a/c;

    const/4 v4, 0x0

    invoke-direct {p0, v3, v4}, Lcom/a/a/b/l;->a(Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V

    :cond_4
    move-object v0, v1

    :goto_2
    return-object v0

    :cond_5
    iget-object v3, p0, Lcom/a/a/b/l;->a:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Lcom/a/a/b/p; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_5

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v0, v2

    :goto_3
    sget-object v1, Lcom/a/a/b/a/c;->c:Lcom/a/a/b/a/c;

    invoke-direct {p0, v1, v2}, Lcom/a/a/b/l;->a(Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_1
    move-exception v0

    throw v0

    :catch_2
    move-exception v1

    move-object v5, v1

    move-object v1, v2

    move-object v2, v5

    :goto_4
    invoke-static {v2}, Lcom/a/a/c/e;->a(Ljava/lang/Throwable;)V

    sget-object v3, Lcom/a/a/b/a/c;->a:Lcom/a/a/b/a/c;

    invoke-direct {p0, v3, v2}, Lcom/a/a/b/l;->a(Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_6
    move-object v0, v1

    goto :goto_2

    :catch_3
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    :goto_5
    invoke-static {v1}, Lcom/a/a/c/e;->a(Ljava/lang/Throwable;)V

    sget-object v2, Lcom/a/a/b/a/c;->d:Lcom/a/a/b/a/c;

    invoke-direct {p0, v2, v1}, Lcom/a/a/b/l;->a(Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_4
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    :goto_6
    invoke-static {v1}, Lcom/a/a/c/e;->a(Ljava/lang/Throwable;)V

    sget-object v2, Lcom/a/a/b/a/c;->e:Lcom/a/a/b/a/c;

    invoke-direct {p0, v2, v1}, Lcom/a/a/b/l;->a(Lcom/a/a/b/a/c;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_5
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_6

    :catch_6
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_5

    :catch_7
    move-exception v2

    goto :goto_4

    :catch_8
    move-exception v0

    move-object v0, v1

    goto :goto_3

    :cond_7
    move-object v1, v2

    goto/16 :goto_0
.end method

.method private d()Lcom/a/a/b/d/c;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/l;->f:Lcom/a/a/b/i;

    invoke-virtual {v0}, Lcom/a/a/b/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/b/l;->k:Lcom/a/a/b/d/c;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/a/a/b/l;->f:Lcom/a/a/b/i;

    invoke-virtual {v0}, Lcom/a/a/b/i;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/a/a/b/l;->l:Lcom/a/a/b/d/c;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/a/a/b/l;->j:Lcom/a/a/b/d/c;

    goto :goto_0
.end method

.method private e()V
    .locals 1

    invoke-direct {p0}, Lcom/a/a/b/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/a/a/b/p;

    invoke-direct {v0, p0}, Lcom/a/a/b/p;-><init>(Lcom/a/a/b/l;)V

    throw v0

    :cond_0
    invoke-direct {p0}, Lcom/a/a/b/l;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/a/a/b/p;

    invoke-direct {v0, p0}, Lcom/a/a/b/p;-><init>(Lcom/a/a/b/l;)V

    throw v0

    :cond_1
    return-void
.end method

.method private f()Z
    .locals 1

    invoke-direct {p0}, Lcom/a/a/b/l;->g()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/a/a/b/l;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()Z
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/l;->b:Lcom/a/a/b/e/a;

    invoke-interface {v0}, Lcom/a/a/b/e/a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ImageAware was collected by GC. Task is cancelled. [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private h()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/a/a/b/l;->f:Lcom/a/a/b/i;

    iget-object v3, p0, Lcom/a/a/b/l;->b:Lcom/a/a/b/e/a;

    invoke-virtual {v2, v3}, Lcom/a/a/b/i;->a(Lcom/a/a/b/e/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v2, v0

    :goto_0
    if-eqz v2, :cond_1

    const-string v1, "ImageAware is reused for another image. Task is cancelled. [%s]"

    invoke-direct {p0, v1}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    :goto_1
    return v0

    :cond_0
    move v2, v1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method private i()V
    .locals 1

    invoke-direct {p0}, Lcom/a/a/b/l;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/a/a/b/p;

    invoke-direct {v0, p0}, Lcom/a/a/b/p;-><init>(Lcom/a/a/b/l;)V

    throw v0

    :cond_0
    return-void
.end method

.method private j()Z
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Task was interrupted [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(II)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/a/a/b/l;->e:Lcom/a/a/b/f/b;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v2}, Lcom/a/a/b/d;->s()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0}, Lcom/a/a/b/l;->j()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0}, Lcom/a/a/b/l;->f()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_0
    move v2, v0

    :goto_0
    if-eqz v2, :cond_2

    :cond_1
    move v0, v1

    :cond_2
    return v0

    :cond_3
    new-instance v2, Lcom/a/a/b/m;

    invoke-direct {v2, p0, p1, p2}, Lcom/a/a/b/m;-><init>(Lcom/a/a/b/l;II)V

    iget-object v3, p0, Lcom/a/a/b/l;->h:Landroid/os/Handler;

    invoke-static {v2, v0, v3}, Lcom/a/a/b/l;->a(Ljava/lang/Runnable;ZLandroid/os/Handler;)V

    move v2, v1

    goto :goto_0
.end method

.method public final run()V
    .locals 6

    invoke-direct {p0}, Lcom/a/a/b/l;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/a/a/b/l;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/a/a/b/l;->g:Lcom/a/a/b/k;

    iget-object v1, v0, Lcom/a/a/b/k;->h:Ljava/util/concurrent/locks/ReentrantLock;

    const-string v0, "Start display image task [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->isLocked()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Image already is loading. Waiting... [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-direct {p0}, Lcom/a/a/b/l;->e()V

    iget-object v0, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->p:Lcom/a/a/a/b/a;

    iget-object v2, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/a/a/a/b/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-nez v0, :cond_7

    invoke-direct {p0}, Lcom/a/a/b/l;->c()Landroid/graphics/Bitmap;
    :try_end_0
    .catch Lcom/a/a/b/p; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :cond_3
    :try_start_1
    invoke-direct {p0}, Lcom/a/a/b/l;->e()V

    invoke-direct {p0}, Lcom/a/a/b/l;->i()V

    iget-object v2, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v2}, Lcom/a/a/b/d;->d()Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v0, "PreProcess image before caching in memory [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v0}, Lcom/a/a/b/d;->o()Lcom/a/a/b/g/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/a/a/b/g/a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v2, "Pre-processor returned null [%s]"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/a/a/c/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    if-eqz v0, :cond_5

    iget-object v2, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v2}, Lcom/a/a/b/d;->h()Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, "Cache image in memory [%s]"

    invoke-direct {p0, v2}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/a/a/b/l;->i:Lcom/a/a/b/g;

    iget-object v2, v2, Lcom/a/a/b/g;->p:Lcom/a/a/a/b/a;

    iget-object v3, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Lcom/a/a/a/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_5
    :goto_1
    if-eqz v0, :cond_6

    iget-object v2, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v2}, Lcom/a/a/b/d;->e()Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v0, "PostProcess image before displaying [%s]"

    invoke-direct {p0, v0}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v0}, Lcom/a/a/b/d;->p()Lcom/a/a/b/g/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/a/a/b/g/a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_6

    const-string v2, "Post-processor returned null [%s]"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/a/a/b/l;->o:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/a/a/c/e;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    invoke-direct {p0}, Lcom/a/a/b/l;->e()V

    invoke-direct {p0}, Lcom/a/a/b/l;->i()V
    :try_end_1
    .catch Lcom/a/a/b/p; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    new-instance v1, Lcom/a/a/b/c;

    iget-object v2, p0, Lcom/a/a/b/l;->g:Lcom/a/a/b/k;

    iget-object v3, p0, Lcom/a/a/b/l;->f:Lcom/a/a/b/i;

    iget-object v4, p0, Lcom/a/a/b/l;->q:Lcom/a/a/b/a/g;

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/a/a/b/c;-><init>(Landroid/graphics/Bitmap;Lcom/a/a/b/k;Lcom/a/a/b/i;Lcom/a/a/b/a/g;)V

    iget-boolean v0, p0, Lcom/a/a/b/l;->n:Z

    invoke-virtual {v1, v0}, Lcom/a/a/b/c;->a(Z)V

    iget-object v0, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v0}, Lcom/a/a/b/d;->s()Z

    move-result v0

    iget-object v2, p0, Lcom/a/a/b/l;->h:Landroid/os/Handler;

    invoke-static {v1, v0, v2}, Lcom/a/a/b/l;->a(Ljava/lang/Runnable;ZLandroid/os/Handler;)V

    goto/16 :goto_0

    :cond_7
    :try_start_2
    sget-object v2, Lcom/a/a/b/a/g;->c:Lcom/a/a/b/a/g;

    iput-object v2, p0, Lcom/a/a/b/l;->q:Lcom/a/a/b/a/g;

    const-string v2, "...Get cached bitmap from memory after waiting. [%s]"

    invoke-direct {p0, v2}, Lcom/a/a/b/l;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/a/a/b/p; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_3
    iget-object v0, p0, Lcom/a/a/b/l;->c:Lcom/a/a/b/d;

    invoke-virtual {v0}, Lcom/a/a/b/d;->s()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-direct {p0}, Lcom/a/a/b/l;->j()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    :goto_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto/16 :goto_0

    :cond_9
    :try_start_4
    new-instance v0, Lcom/a/a/b/o;

    invoke-direct {v0, p0}, Lcom/a/a/b/o;-><init>(Lcom/a/a/b/l;)V

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/a/a/b/l;->h:Landroid/os/Handler;

    invoke-static {v0, v2, v3}, Lcom/a/a/b/l;->a(Ljava/lang/Runnable;ZLandroid/os/Handler;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method
