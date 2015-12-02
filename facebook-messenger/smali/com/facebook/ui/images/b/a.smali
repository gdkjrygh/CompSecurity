.class public Lcom/facebook/ui/images/b/a;
.super Ljava/lang/Object;
.source "DefaultFetchImageHandler.java"

# interfaces
.implements Lcom/facebook/ui/images/b/l;


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final c:Lcom/facebook/ui/images/cache/a;

.field private final d:Lcom/facebook/ui/images/b/aa;

.field private final e:Lcom/facebook/analytics/av;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/prefs/shared/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/ui/images/b/a;

    sput-object v0, Lcom/facebook/ui/images/b/a;->a:Ljava/lang/Class;

    .line 40
    const-string v0, "android_webp"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/ui/images/b/a;->b:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/ui/images/cache/a;Lcom/facebook/ui/images/b/aa;Lcom/facebook/analytics/av;Ljavax/inject/a;Lcom/facebook/prefs/shared/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/ui/images/cache/a;",
            "Lcom/facebook/ui/images/b/aa;",
            "Lcom/facebook/analytics/av;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/prefs/shared/d;",
            ")V"
        }
    .end annotation

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    .line 58
    iput-object p2, p0, Lcom/facebook/ui/images/b/a;->d:Lcom/facebook/ui/images/b/aa;

    .line 59
    iput-object p3, p0, Lcom/facebook/ui/images/b/a;->e:Lcom/facebook/analytics/av;

    .line 60
    iput-object p4, p0, Lcom/facebook/ui/images/b/a;->f:Ljavax/inject/a;

    .line 61
    iput-object p5, p0, Lcom/facebook/ui/images/b/a;->g:Lcom/facebook/prefs/shared/d;

    .line 62
    return-void
.end method

.method private a(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 4

    .prologue
    .line 376
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/a;->b(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 398
    :goto_0
    return-object p1

    .line 380
    :cond_0
    sget-object v0, Lcom/facebook/ui/images/b/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Original jpg URI : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 382
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 385
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".webp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 387
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 394
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    .line 396
    sget-object v0, Lcom/facebook/ui/images/b/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "New webp URI: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/r;
    .locals 12

    .prologue
    const-wide/16 v5, 0x0

    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 248
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->j()Lcom/facebook/ui/images/cache/d;

    move-result-object v8

    .line 249
    iget-object v1, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1, v8}, Lcom/facebook/ui/images/cache/a;->g(Lcom/facebook/ui/media/cache/l;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 250
    invoke-static {v8}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/images/b/u;->PREV_FAILURE_RETRY_BLOCKED:Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;

    move-result-object v0

    .line 362
    :cond_0
    :goto_0
    return-object v0

    .line 258
    :cond_1
    :try_start_0
    const-string v1, "Download image"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-result-object v4

    .line 260
    :try_start_1
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v1

    .line 262
    invoke-direct {p0, v1}, Lcom/facebook/ui/images/b/a;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v7

    .line 264
    iget-object v1, p0, Lcom/facebook/ui/images/b/a;->d:Lcom/facebook/ui/images/b/aa;

    invoke-virtual {v1, v7}, Lcom/facebook/ui/images/b/aa;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    .line 265
    :try_start_2
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->a()Lcom/facebook/ui/media/a/d;

    move-result-object v9

    sget-object v10, Lcom/facebook/ui/media/a/d;->UNSUPPORTED_URI:Lcom/facebook/ui/media/a/d;

    if-ne v9, v10, :cond_2

    .line 266
    sget-object v0, Lcom/facebook/ui/images/b/a;->a:Ljava/lang/Class;

    const-string v2, "Unsupported scheme: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v7, v3, v5

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    invoke-static {v8}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/u;->DOWNLOAD_PIPELINE_ERROR:Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    move-result-object v0

    .line 273
    :try_start_3
    invoke-virtual {v4}, Lcom/facebook/debug/d/e;->a()J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 361
    if-eqz v1, :cond_0

    .line 362
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->c()V

    goto :goto_0

    .line 273
    :cond_2
    :try_start_4
    invoke-virtual {v4}, Lcom/facebook/debug/d/e;->a()J

    .line 276
    invoke-direct {p0, p1, v1}, Lcom/facebook/ui/images/b/a;->a(Lcom/facebook/ui/images/b/m;Lcom/facebook/ui/media/a/c;)V

    .line 277
    const-string v4, "Insert into cache"

    invoke-static {v4}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result-object v9

    .line 279
    :try_start_5
    sget-object v4, Lcom/facebook/ui/images/b/b;->a:[I

    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->a()Lcom/facebook/ui/media/a/d;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/ui/media/a/d;->ordinal()I

    move-result v7

    aget v4, v4, v7

    packed-switch v4, :pswitch_data_0

    .line 351
    const-wide/16 v2, 0x4e20

    invoke-direct {p0, p1, v2, v3}, Lcom/facebook/ui/images/b/a;->a(Lcom/facebook/ui/images/b/m;J)V

    .line 352
    invoke-static {v8}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/u;->DOWNLOAD_PIPELINE_ERROR:Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-result-object v0

    .line 358
    :try_start_6
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 361
    if-eqz v1, :cond_0

    .line 362
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->c()V

    goto/16 :goto_0

    .line 273
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_7
    invoke-virtual {v4}, Lcom/facebook/debug/d/e;->a()J

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 361
    :catchall_1
    move-exception v0

    :goto_2
    if-eqz v1, :cond_3

    .line 362
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->c()V

    :cond_3
    throw v0

    .line 287
    :pswitch_0
    :try_start_8
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->g()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    const-string v7, "file"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v7, v0

    .line 291
    :goto_3
    if-nez v7, :cond_a

    .line 292
    iget-object v0, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->b()Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v0, v8, v3}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/io/InputStream;)Ljava/io/File;

    move-result-object v0

    .line 296
    :goto_4
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->d()J

    move-result-wide v3

    .line 297
    cmp-long v10, v3, v5

    if-ltz v10, :cond_5

    .line 302
    :goto_5
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->e()Z

    move-result v5

    if-nez v5, :cond_9

    .line 303
    if-eqz v7, :cond_7

    .line 304
    iget-object v0, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    new-instance v5, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8, v5}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/io/File;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 311
    :goto_6
    if-nez v2, :cond_8

    if-nez v0, :cond_8

    .line 312
    invoke-static {v8}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/u;->DOWNLOAD_PIPELINE_ERROR:Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/ui/images/b/t;->a(J)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-result-object v0

    .line 358
    :try_start_9
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 361
    if-eqz v1, :cond_0

    .line 362
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->c()V

    goto/16 :goto_0

    :cond_4
    move v7, v3

    .line 287
    goto :goto_3

    .line 297
    :cond_5
    if-eqz v0, :cond_6

    :try_start_a
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    goto :goto_5

    :cond_6
    move-wide v3, v5

    goto :goto_5

    .line 307
    :cond_7
    iget-object v0, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v0, v8}, Lcom/facebook/ui/images/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    goto :goto_6

    .line 318
    :cond_8
    invoke-static {v8}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/facebook/ui/images/b/t;->a(Ljava/io/File;)Lcom/facebook/ui/images/b/t;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/ui/images/b/t;->a(Landroid/graphics/Bitmap;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->DOWNLOADED:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/ui/images/b/t;->a(J)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    move-result-object v0

    .line 358
    :try_start_b
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 361
    if-eqz v1, :cond_0

    .line 362
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->c()V

    goto/16 :goto_0

    .line 325
    :catch_0
    move-exception v0

    .line 326
    :try_start_c
    sget-object v2, Lcom/facebook/ui/images/b/a;->a:Ljava/lang/Class;

    const-string v3, "Failed to insert into cache"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    invoke-static {v8}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/u;->DOWNLOAD_PIPELINE_ERROR:Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-result-object v0

    .line 358
    :try_start_d
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 361
    if-eqz v1, :cond_0

    .line 362
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->c()V

    goto/16 :goto_0

    .line 334
    :pswitch_1
    const-wide/32 v2, 0x493e0

    :try_start_e
    invoke-direct {p0, p1, v2, v3}, Lcom/facebook/ui/images/b/a;->a(Lcom/facebook/ui/images/b/m;J)V

    .line 335
    invoke-static {v8}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/u;->DOWNLOAD_PIPELINE_ERROR:Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    move-result-object v0

    .line 358
    :try_start_f
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 361
    if-eqz v1, :cond_0

    .line 362
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->c()V

    goto/16 :goto_0

    .line 341
    :pswitch_2
    const-wide/32 v2, 0x36ee80

    :try_start_10
    invoke-direct {p0, p1, v2, v3}, Lcom/facebook/ui/images/b/a;->a(Lcom/facebook/ui/images/b/m;J)V

    .line 342
    invoke-static {v8}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/u;->DOWNLOAD_NOT_FOUND:Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    move-result-object v0

    .line 358
    :try_start_11
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 361
    if-eqz v1, :cond_0

    .line 362
    invoke-virtual {v1}, Lcom/facebook/ui/media/a/c;->c()V

    goto/16 :goto_0

    .line 358
    :catchall_2
    move-exception v0

    :try_start_12
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 361
    :catchall_3
    move-exception v0

    move-object v1, v2

    goto/16 :goto_2

    .line 273
    :catchall_4
    move-exception v0

    goto/16 :goto_1

    :cond_9
    move-object v11, v0

    move-object v0, v2

    move-object v2, v11

    goto/16 :goto_6

    :cond_a
    move-object v0, v2

    goto/16 :goto_4

    .line 279
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/facebook/ui/images/b/m;Z)Lcom/facebook/ui/images/b/r;
    .locals 9

    .prologue
    .line 95
    const-string v0, "fetchImageAndDecode"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v2

    .line 99
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->i()Lcom/facebook/ui/images/cache/d;

    move-result-object v3

    .line 100
    iget-object v0, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v0, v3}, Lcom/facebook/ui/images/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 101
    if-eqz v0, :cond_1

    .line 103
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->b()Lcom/facebook/ui/images/base/b;

    move-result-object v1

    .line 104
    if-eqz v1, :cond_0

    .line 106
    const-string v4, "Running processor"

    invoke-static {v4}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v4

    .line 107
    sget-object v5, Lcom/facebook/ui/images/b/a;->a:Ljava/lang/Class;

    const-string v6, "Processing image"

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 108
    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/base/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 109
    invoke-virtual {v4}, Lcom/facebook/debug/d/e;->a()J

    .line 111
    :cond_0
    invoke-static {v3}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/b/t;->a(Landroid/graphics/Bitmap;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/images/b/v;->CACHE:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 168
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    :goto_0
    return-object v0

    .line 118
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->j()Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    .line 119
    iget-object v1, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 120
    if-nez v0, :cond_4

    .line 121
    if-eqz p2, :cond_2

    .line 124
    invoke-static {v3}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/images/b/v;->NOT_IN_CACHE_NOT_DOWNLOADED:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 168
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 129
    :cond_2
    :try_start_2
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/a;->a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/r;

    move-result-object v1

    .line 130
    invoke-virtual {v1}, Lcom/facebook/ui/images/b/r;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v8, v0

    move-object v0, v1

    move-object v1, v8

    .line 141
    :goto_1
    if-eqz v1, :cond_3

    .line 142
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->b()Lcom/facebook/ui/images/base/b;

    move-result-object v4

    .line 143
    if-eqz v4, :cond_3

    .line 144
    const-string v5, "Running processor"

    invoke-static {v5}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v5

    .line 145
    sget-object v6, Lcom/facebook/ui/images/b/a;->a:Ljava/lang/Class;

    const-string v7, "Processing image"

    invoke-static {v6, v7}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 146
    invoke-virtual {v4, v1}, Lcom/facebook/ui/images/base/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 147
    invoke-virtual {v5}, Lcom/facebook/debug/d/e;->a()J

    .line 150
    invoke-static {v3}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/facebook/ui/images/b/t;->a(Landroid/graphics/Bitmap;)Lcom/facebook/ui/images/b/t;

    move-result-object v5

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/r;->b()Lcom/facebook/ui/images/b/v;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v5

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/r;->d()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/facebook/ui/images/b/t;->a(J)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;

    move-result-object v0

    .line 157
    invoke-virtual {v4}, Lcom/facebook/ui/images/base/b;->a()Ljava/lang/String;

    move-result-object v4

    .line 158
    if-eqz v4, :cond_3

    sget-object v5, Lcom/facebook/ui/images/base/b;->d:Ljava/lang/String;

    if-eq v4, v5, :cond_3

    .line 159
    const-string v4, "Inserting processed image into cache"

    invoke-static {v4}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v4

    .line 160
    iget-object v5, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v5, v3, v1}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;)Ljava/io/File;

    .line 161
    invoke-virtual {v4}, Lcom/facebook/debug/d/e;->a()J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    :cond_3
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    goto/16 :goto_0

    .line 134
    :cond_4
    :try_start_3
    invoke-static {v3}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/b/t;->a(Landroid/graphics/Bitmap;)Lcom/facebook/ui/images/b/t;

    move-result-object v1

    sget-object v4, Lcom/facebook/ui/images/b/v;->UNDERLYING_IMAGE_IN_CACHE:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v1

    move-object v8, v0

    move-object v0, v1

    move-object v1, v8

    goto :goto_1

    .line 168
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    throw v0
.end method

.method private a(Lcom/facebook/ui/images/b/m;J)V
    .locals 2

    .prologue
    .line 231
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 232
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->j()Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    .line 233
    iget-object v1, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1, v0, p2, p3}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/media/cache/l;J)V

    .line 235
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/ui/images/b/m;Lcom/facebook/ui/media/a/c;)V
    .locals 3

    .prologue
    .line 455
    iget-object v0, p0, Lcom/facebook/ui/images/b/a;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http://maps.google.com/maps/api/staticmap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 465
    :cond_0
    :goto_0
    return-void

    .line 460
    :cond_1
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "counters"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "google_static_maps"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/ui/images/b/a;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "result"

    invoke-virtual {p2}, Lcom/facebook/ui/media/a/c;->a()Lcom/facebook/ui/media/a/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/media/a/d;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 464
    iget-object v1, p0, Lcom/facebook/ui/images/b/a;->e:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/ui/images/b/m;Z)Lcom/facebook/ui/images/b/r;
    .locals 4

    .prologue
    .line 188
    const-string v0, "fetchImageNoDecode"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 191
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->i()Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    .line 193
    iget-object v2, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v2, v0}, Lcom/facebook/ui/images/cache/a;->e(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v2

    .line 194
    if-eqz v2, :cond_0

    .line 196
    invoke-static {v0}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Ljava/io/File;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->CACHE:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 226
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    :goto_0
    return-object v0

    .line 203
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->j()Lcom/facebook/ui/images/cache/d;

    move-result-object v2

    .line 204
    iget-object v3, p0, Lcom/facebook/ui/images/b/a;->c:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v3, v2}, Lcom/facebook/ui/images/cache/a;->e(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v2

    .line 205
    if-eqz v2, :cond_1

    .line 207
    invoke-static {v0}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Ljava/io/File;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->UNDERLYING_IMAGE_IN_CACHE:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 226
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 214
    :cond_1
    if-eqz p2, :cond_2

    .line 217
    :try_start_2
    invoke-static {v0}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/images/b/v;->NOT_IN_CACHE_NOT_DOWNLOADED:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 226
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 222
    :cond_2
    :try_start_3
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/a;->a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/r;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    .line 226
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    throw v0
.end method

.method private b(Landroid/net/Uri;)Z
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 408
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 409
    const-string v2, "http"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "https"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 451
    :goto_0
    return v0

    .line 414
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 415
    if-eqz v0, :cond_1

    const-string v2, "photos"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "profile"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    move v0, v1

    .line 416
    goto :goto_0

    .line 420
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-ge v0, v2, :cond_3

    move v0, v1

    .line 421
    goto :goto_0

    .line 425
    :cond_3
    iget-object v0, p0, Lcom/facebook/ui/images/b/a;->g:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/ui/images/b/a;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v1

    .line 426
    goto :goto_0

    .line 428
    :cond_4
    sget-object v0, Lcom/facebook/ui/images/b/a;->a:Ljava/lang/Class;

    const-string v2, "webp pref enabled"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 431
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    .line 432
    const-string v2, ".jpg"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    move v0, v1

    .line 434
    goto :goto_0

    .line 437
    :cond_5
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    .line 440
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 441
    const-string v3, "v"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    .line 442
    goto :goto_0

    .line 445
    :cond_7
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 446
    const-string v3, "oh"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v1

    .line 447
    goto :goto_0

    .line 451
    :cond_9
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/ui/images/b/p;)Lcom/facebook/ui/images/b/r;
    .locals 4

    .prologue
    .line 66
    const-string v0, "fetchImage"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 68
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/p;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v2

    .line 69
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/p;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Lcom/facebook/ui/images/b/m;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 72
    :goto_0
    invoke-virtual {v2}, Lcom/facebook/ui/images/b/m;->e()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 73
    invoke-direct {p0, v2, v0}, Lcom/facebook/ui/images/b/a;->b(Lcom/facebook/ui/images/b/m;Z)Lcom/facebook/ui/images/b/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 78
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    :goto_1
    return-object v0

    .line 69
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 75
    :cond_2
    :try_start_1
    invoke-direct {p0, v2, v0}, Lcom/facebook/ui/images/b/a;->a(Lcom/facebook/ui/images/b/m;Z)Lcom/facebook/ui/images/b/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 78
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    throw v0
.end method
