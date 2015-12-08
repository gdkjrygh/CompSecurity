.class public Lcom/roidapp/cloudlib/sns/upload/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/cloudlib/sns/upload/e;


# instance fields
.field private b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/i;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/i;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/roidapp/cloudlib/sns/upload/i;

.field private e:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/j;",
            ">;"
        }
    .end annotation
.end field

.field private f:Landroid/os/Handler;

.field private g:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/String;

.field private i:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 3

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 87
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 88
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    .line 89
    new-instance v0, Lcom/roidapp/cloudlib/sns/upload/f;

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Application;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/sns/upload/f;-><init>(Lcom/roidapp/cloudlib/sns/upload/e;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    .line 111
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->g:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 112
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Application;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "upload"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 113
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 114
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->h:Ljava/lang/String;

    .line 115
    new-instance v0, Lcom/roidapp/cloudlib/sns/upload/g;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/upload/g;-><init>(Lcom/roidapp/cloudlib/sns/upload/e;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->i:Ljava/util/Comparator;

    .line 1187
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    const-class v2, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1188
    const-string v1, "loadCache"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1189
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 123
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
    .locals 5

    .prologue
    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 137
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 138
    const-string v3, "upload_path"

    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 139
    const-string v3, "upload_tag"

    invoke-virtual {v2, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 140
    const-string v3, "upload_comment"

    invoke-virtual {v2, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    const-string v3, "upload_id"

    invoke-virtual {v2, v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 143
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    const/4 v4, 0x3

    invoke-virtual {v3, v4, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 145
    return-wide v0
.end method

.method public static a()Lcom/roidapp/cloudlib/sns/upload/e;
    .locals 2

    .prologue
    .line 67
    sget-object v0, Lcom/roidapp/cloudlib/sns/upload/e;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    if-nez v0, :cond_1

    .line 68
    const-class v1, Lcom/roidapp/cloudlib/sns/upload/e;

    monitor-enter v1

    .line 69
    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/upload/e;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lcom/roidapp/cloudlib/sns/upload/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/upload/e;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/sns/upload/e;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    .line 71
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/sns/upload/e;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    return-object v0

    .line 71
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(JI)V
    .locals 5

    .prologue
    .line 386
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    if-eqz v0, :cond_2

    .line 387
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 389
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 390
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 391
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/j;

    .line 392
    if-eqz v0, :cond_0

    .line 393
    invoke-interface {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/upload/j;->a(JI)V

    goto :goto_0

    .line 396
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v1, v2, p3, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 399
    :cond_2
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 4

    .prologue
    .line 155
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 156
    const-string v1, "upload_path"

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 157
    const-string v1, "upload_tag"

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/upload/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    const-string v1, "upload_comment"

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/upload/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    const-string v1, "upload_id"

    iget-wide v2, p1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 161
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 162
    return-void
.end method

.method public static a(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/16 v2, 0x96

    .line 165
    if-eqz p0, :cond_0

    .line 166
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/h;->b(Landroid/content/Context;)Lcom/bumptech/glide/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->b:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/d;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 174
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/upload/e;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->h()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/upload/e;JI)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/upload/e;->a(JI)V

    return-void
.end method

.method static a(Landroid/content/Intent;)Z
    .locals 2

    .prologue
    .line 193
    const-string v0, "loadCache"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/upload/e;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->i()V

    return-void
.end method

.method private c(J)V
    .locals 3

    .prologue
    .line 409
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->g:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 411
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->j()V

    .line 414
    :goto_0
    return-void

    .line 413
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->h:Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/upload/e;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->j()V

    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    .line 354
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    if-eqz v0, :cond_2

    .line 355
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 357
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 358
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 359
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/j;

    .line 360
    if-eqz v0, :cond_0

    .line 361
    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/upload/j;->a()V

    goto :goto_0

    .line 364
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 367
    :cond_2
    return-void
.end method

.method private i()V
    .locals 2

    .prologue
    .line 370
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    if-eqz v0, :cond_2

    .line 371
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 373
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 374
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 375
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/j;

    .line 376
    if-eqz v0, :cond_0

    .line 377
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->d()Z

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/upload/j;->b()V

    goto :goto_0

    .line 380
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 383
    :cond_2
    return-void
.end method

.method private j()V
    .locals 4

    .prologue
    .line 464
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 467
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->g:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 469
    instance-of v1, v0, Lcom/roidapp/cloudlib/sns/upload/i;

    if-eqz v1, :cond_1

    .line 472
    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 473
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 474
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 475
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 476
    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 477
    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 478
    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 479
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/upload/e;->h:Ljava/lang/String;

    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "UTF-8"

    invoke-static {v0, v2, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    goto :goto_0

    .line 481
    :cond_1
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 484
    check-cast v0, Ljava/lang/Long;

    .line 485
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/upload/e;->h:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0

    .line 492
    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/c/t;->b()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/upload/h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/roidapp/cloudlib/sns/upload/h;-><init>(Lcom/roidapp/cloudlib/sns/upload/e;B)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 494
    :cond_3
    return-void
.end method


# virtual methods
.method public final a(J)Lcom/roidapp/cloudlib/sns/upload/i;
    .locals 5

    .prologue
    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 226
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    cmp-long v2, v2, p1

    if-nez v2, :cond_0

    .line 238
    :goto_0
    return-object v0

    .line 229
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    if-eqz v0, :cond_2

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    const/4 v1, 0x1

    iput-byte v1, v0, Lcom/roidapp/cloudlib/sns/upload/i;->f:B

    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_2

    .line 232
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    goto :goto_0

    .line 234
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 235
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    cmp-long v2, v2, p1

    if-nez v2, :cond_3

    goto :goto_0

    .line 238
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final a(I)V
    .locals 2

    .prologue
    .line 319
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    if-eqz v0, :cond_0

    .line 320
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    iput p1, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    .line 321
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(JI)V

    .line 323
    :cond_0
    return-void
.end method

.method final a(Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->h()V

    .line 305
    :cond_0
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/upload/j;)V
    .locals 1

    .prologue
    .line 126
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 128
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 275
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_1

    .line 276
    const/4 v0, 0x0

    .line 277
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 278
    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 279
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 280
    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c(J)V

    .line 281
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    .line 283
    goto :goto_0

    .line 284
    :cond_0
    if-eqz v1, :cond_1

    .line 285
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->i()V

    .line 287
    :cond_1
    return-void

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final b(J)V
    .locals 7

    .prologue
    .line 260
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_1

    .line 261
    const/4 v0, 0x0

    .line 262
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 263
    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    cmp-long v3, v4, p1

    if-nez v3, :cond_2

    .line 264
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 265
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/upload/e;->c(J)V

    .line 266
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    .line 268
    goto :goto_0

    .line 269
    :cond_0
    if-eqz v1, :cond_1

    .line 270
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->i()V

    .line 272
    :cond_1
    return-void

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method final b(Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 1

    .prologue
    .line 308
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->h()V

    .line 311
    :cond_0
    return-void
.end method

.method public final b(Lcom/roidapp/cloudlib/sns/upload/j;)V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 132
    return-void
.end method

.method public final c()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/i;",
            ">;"
        }
    .end annotation

    .prologue
    .line 243
    new-instance v1, Ljava/util/TreeSet;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->i:Ljava/util/Comparator;

    invoke-direct {v1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 244
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 245
    const/4 v3, 0x0

    iput-byte v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->f:B

    .line 246
    invoke-virtual {v1, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    if-eqz v0, :cond_1

    .line 249
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    const/4 v2, 0x1

    iput-byte v2, v0, Lcom/roidapp/cloudlib/sns/upload/i;->f:B

    .line 250
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-virtual {v1, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 252
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 253
    const/4 v3, 0x2

    iput-byte v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->f:B

    .line 254
    invoke-virtual {v1, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 256
    :cond_2
    return-object v1
.end method

.method final c(Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 1

    .prologue
    .line 314
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    .line 315
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/upload/e;->a(I)V

    .line 316
    return-void
.end method

.method final d(Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 1

    .prologue
    .line 403
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->g:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 404
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->j()V

    .line 405
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final e()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 329
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    if-eqz v0, :cond_1

    .line 330
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 331
    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    .line 332
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->i()V

    .line 334
    :cond_0
    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    .line 336
    :cond_1
    return-void
.end method

.method final f()V
    .locals 3

    .prologue
    const/16 v2, 0x64

    .line 342
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    if-eqz v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c(J)V

    .line 344
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    if-eq v0, v2, :cond_0

    .line 345
    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/sns/upload/e;->a(I)V

    .line 348
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->d:Lcom/roidapp/cloudlib/sns/upload/i;

    .line 349
    return-void
.end method

.method final g()V
    .locals 10

    .prologue
    .line 417
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->f:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 419
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/e;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 420
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 421
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    .line 422
    if-eqz v0, :cond_2

    .line 423
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 425
    new-instance v1, Ljava/util/TreeSet;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/upload/e;->i:Ljava/util/Comparator;

    invoke-direct {v1, v2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 426
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 428
    const-string v3, "UTF-8"

    invoke-static {v0, v3}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 429
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 430
    if-eqz v3, :cond_0

    .line 432
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 433
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 434
    const/4 v5, 0x4

    if-ne v3, v5, :cond_0

    .line 436
    new-instance v3, Lcom/roidapp/cloudlib/sns/upload/i;

    const/4 v5, 0x0

    invoke-direct {v3, p0, v5}, Lcom/roidapp/cloudlib/sns/upload/i;-><init>(Lcom/roidapp/cloudlib/sns/upload/e;B)V

    .line 437
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    iput-wide v6, v3, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    .line 438
    iget-wide v6, v3, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    cmp-long v0, v6, v8

    if-nez v0, :cond_0

    .line 442
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    .line 443
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/cloudlib/sns/upload/i;->c:Ljava/lang/String;

    .line 444
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/cloudlib/sns/upload/i;->b:Ljava/lang/String;

    .line 446
    invoke-virtual {v1, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 450
    :catch_0
    move-exception v0

    goto :goto_0

    .line 455
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/e;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 456
    invoke-virtual {v1}, Ljava/util/TreeSet;->clear()V

    .line 457
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/upload/e;->i()V

    .line 461
    :cond_2
    return-void

    :catch_1
    move-exception v0

    goto :goto_0
.end method
