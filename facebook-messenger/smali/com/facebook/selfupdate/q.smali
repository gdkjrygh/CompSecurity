.class public Lcom/facebook/selfupdate/q;
.super Ljava/lang/Object;
.source "SelfUpdateManager.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/base/a/d;

.field private final c:Lcom/facebook/common/time/a;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/config/b/a;

.field private final f:Lcom/facebook/selfupdate/o;

.field private final g:Landroid/app/DownloadManager;

.field private final h:Lcom/facebook/selfupdate/af;

.field private final i:Lcom/facebook/selfupdate/g;

.field private final j:Lcom/facebook/common/executors/a;

.field private final k:Lcom/facebook/selfupdate/i;

.field private final l:Lcom/facebook/common/f/d;

.field private final m:Lcom/facebook/common/f/f;

.field private n:Lcom/facebook/c/k;


# direct methods
.method public constructor <init>(Lcom/facebook/base/a/d;Lcom/facebook/config/b/a;Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/selfupdate/o;Landroid/app/DownloadManager;Lcom/facebook/selfupdate/af;Lcom/facebook/selfupdate/g;Lcom/facebook/common/executors/a;Lcom/facebook/selfupdate/i;Lcom/facebook/common/f/d;Lcom/facebook/common/f/f;)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Lcom/facebook/selfupdate/q;->b:Lcom/facebook/base/a/d;

    .line 75
    iput-object p2, p0, Lcom/facebook/selfupdate/q;->e:Lcom/facebook/config/b/a;

    .line 76
    iput-object p3, p0, Lcom/facebook/selfupdate/q;->a:Landroid/content/Context;

    .line 77
    iput-object p4, p0, Lcom/facebook/selfupdate/q;->c:Lcom/facebook/common/time/a;

    .line 78
    iput-object p5, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    .line 79
    iput-object p6, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    .line 80
    iput-object p7, p0, Lcom/facebook/selfupdate/q;->g:Landroid/app/DownloadManager;

    .line 81
    iput-object p8, p0, Lcom/facebook/selfupdate/q;->h:Lcom/facebook/selfupdate/af;

    .line 82
    iput-object p9, p0, Lcom/facebook/selfupdate/q;->i:Lcom/facebook/selfupdate/g;

    .line 83
    iput-object p10, p0, Lcom/facebook/selfupdate/q;->j:Lcom/facebook/common/executors/a;

    .line 84
    iput-object p11, p0, Lcom/facebook/selfupdate/q;->k:Lcom/facebook/selfupdate/i;

    .line 85
    iput-object p12, p0, Lcom/facebook/selfupdate/q;->l:Lcom/facebook/common/f/d;

    .line 86
    iput-object p13, p0, Lcom/facebook/selfupdate/q;->m:Lcom/facebook/common/f/f;

    .line 87
    return-void
.end method

.method static synthetic a(Lcom/facebook/selfupdate/q;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method private a(Ljava/lang/String;J)Ljava/io/File;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 352
    .line 353
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 354
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 355
    iget-object v2, p0, Lcom/facebook/selfupdate/q;->l:Lcom/facebook/common/f/d;

    invoke-virtual {v2, v1}, Lcom/facebook/common/f/d;->a(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 356
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->l:Lcom/facebook/common/f/d;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/common/f/d;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 385
    :cond_0
    :goto_0
    return-object v0

    .line 360
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->g:Landroid/app/DownloadManager;

    invoke-virtual {v1, p2, p3}, Landroid/app/DownloadManager;->openDownloadedFile(J)Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 364
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->l:Lcom/facebook/common/f/d;

    iget-object v2, p0, Lcom/facebook/selfupdate/q;->a:Landroid/content/Context;

    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v0, v3}, Lcom/facebook/common/f/d;->a(Landroid/content/Context;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 368
    if-eqz v0, :cond_0

    .line 374
    :try_start_1
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->g:Landroid/app/DownloadManager;

    const/4 v2, 0x1

    new-array v2, v2, [J

    const/4 v3, 0x0

    aput-wide p2, v2, v3

    invoke-virtual {v1, v2}, Landroid/app/DownloadManager;->remove([J)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 381
    :goto_1
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/selfupdate/j;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0

    .line 375
    :catch_0
    move-exception v1

    .line 376
    iget-object v2, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to remove download ID from DownloadManager after making a copy: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_1

    .line 361
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method private declared-synchronized a(J)V
    .locals 12

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 233
    monitor-enter p0

    .line 234
    :try_start_0
    new-instance v0, Landroid/app/DownloadManager$Query;

    invoke-direct {v0}, Landroid/app/DownloadManager$Query;-><init>()V

    .line 235
    const/4 v1, 0x1

    new-array v1, v1, [J

    const/4 v5, 0x0

    aput-wide p1, v1, v5

    invoke-virtual {v0, v1}, Landroid/app/DownloadManager$Query;->setFilterById([J)Landroid/app/DownloadManager$Query;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 238
    :try_start_1
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->g:Landroid/app/DownloadManager;

    invoke-virtual {v1, v0}, Landroid/app/DownloadManager;->query(Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-result-object v1

    .line 239
    if-eqz v1, :cond_0

    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_3

    .line 241
    :cond_0
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    const-string v2, "Empty DownloadManager cursor"

    invoke-virtual {v0, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 327
    :goto_0
    if-eqz v3, :cond_1

    .line 328
    :try_start_3
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->h:Lcom/facebook/selfupdate/af;

    invoke-virtual {v0}, Lcom/facebook/selfupdate/af;->f()V

    .line 330
    :cond_1
    if-eqz v1, :cond_2

    .line 331
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 334
    :cond_2
    monitor-exit p0

    return-void

    .line 243
    :cond_3
    :try_start_4
    const-string v0, "status"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 244
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 245
    const-string v5, "reason"

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    .line 246
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 247
    const-string v6, "local_uri"

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 248
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 249
    sparse-switch v0, :sswitch_data_0

    move v3, v4

    .line 322
    goto :goto_0

    .line 252
    :sswitch_0
    invoke-direct {p0, v6, p1, p2}, Lcom/facebook/selfupdate/q;->a(Ljava/lang/String;J)Ljava/io/File;

    move-result-object v0

    .line 253
    if-eqz v0, :cond_9

    .line 254
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v5

    .line 256
    :try_start_5
    iget-object v6, p0, Lcom/facebook/selfupdate/q;->l:Lcom/facebook/common/f/d;

    invoke-virtual {v6, v0}, Lcom/facebook/common/f/d;->a(Ljava/io/File;)Ljava/util/jar/JarFile;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v2

    move-object v0, v2

    .line 269
    :goto_1
    :try_start_6
    iget-object v2, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    sget-object v6, Lcom/facebook/selfupdate/p;->DOWNLOAD_SUCCESS_FILE_URI:Lcom/facebook/selfupdate/p;

    invoke-virtual {v2, p0, v6, v5}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;Ljava/lang/String;)V

    .line 273
    iget-object v2, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    sget-object v6, Lcom/facebook/selfupdate/j;->p:Lcom/facebook/prefs/shared/ae;

    const-string v7, "application/vnd.android.package-archive"

    invoke-interface {v2, v6, v7}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 276
    iget-object v6, p0, Lcom/facebook/selfupdate/q;->i:Lcom/facebook/selfupdate/g;

    invoke-virtual {v6, v0, v2}, Lcom/facebook/selfupdate/g;->a(Ljava/util/jar/JarFile;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object v6, p0, Lcom/facebook/selfupdate/q;->m:Lcom/facebook/common/f/f;

    sget-object v7, Lcom/facebook/common/f/g;->INTERNAL:Lcom/facebook/common/f/g;

    invoke-virtual {v6, v7}, Lcom/facebook/common/f/f;->a(Lcom/facebook/common/f/g;)J

    move-result-wide v6

    iget-object v8, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    sget-object v9, Lcom/facebook/selfupdate/j;->q:Lcom/facebook/prefs/shared/ae;

    const-wide/32 v10, 0x1e00000

    invoke-interface {v8, v9, v10, v11}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-ltz v6, :cond_8

    .line 281
    iget-object v6, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v6}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v6

    sget-object v7, Lcom/facebook/selfupdate/j;->h:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v6, v7, v5}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v6

    sget-object v7, Lcom/facebook/selfupdate/j;->n:Lcom/facebook/prefs/shared/ae;

    const/4 v8, 0x2

    invoke-interface {v6, v7, v8}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v6

    invoke-interface {v6}, Lcom/facebook/prefs/shared/e;->a()V

    .line 287
    const-string v6, "application/java-archive"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 289
    iget-object v2, p0, Lcom/facebook/selfupdate/q;->h:Lcom/facebook/selfupdate/af;

    invoke-virtual {v2}, Lcom/facebook/selfupdate/af;->d()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_2
    move v2, v4

    .line 298
    :goto_3
    if-eqz v0, :cond_4

    .line 300
    :try_start_7
    invoke-virtual {v0}, Ljava/util/jar/JarFile;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :cond_4
    :goto_4
    move v3, v2

    .line 305
    goto/16 :goto_0

    .line 257
    :catch_0
    move-exception v0

    .line 258
    :try_start_8
    iget-object v6, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failed to open JarFile: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v0}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v0, v2

    .line 268
    goto :goto_1

    .line 260
    :catch_1
    move-exception v0

    .line 266
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed to open JarFile by OOM: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V

    move-object v0, v2

    goto/16 :goto_1

    .line 292
    :cond_5
    iget-object v6, p0, Lcom/facebook/selfupdate/q;->h:Lcom/facebook/selfupdate/af;

    invoke-virtual {v6, v2}, Lcom/facebook/selfupdate/af;->b(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_2

    .line 327
    :catchall_0
    move-exception v0

    move v2, v3

    :goto_5
    if-eqz v2, :cond_6

    .line 328
    :try_start_9
    iget-object v2, p0, Lcom/facebook/selfupdate/q;->h:Lcom/facebook/selfupdate/af;

    invoke-virtual {v2}, Lcom/facebook/selfupdate/af;->f()V

    .line 330
    :cond_6
    if-eqz v1, :cond_7

    .line 331
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_7
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 233
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 296
    :cond_8
    :try_start_a
    iget-object v2, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    const-string v4, "Downloaded package is invalid or corrupt"

    invoke-virtual {v2, v4}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move v2, v3

    goto :goto_3

    .line 301
    :catch_2
    move-exception v0

    .line 302
    :try_start_b
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to close JarFile: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_4

    .line 327
    :catchall_2
    move-exception v0

    goto :goto_5

    .line 306
    :cond_9
    :try_start_c
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Download succeeded, but file the is missing: id= "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 314
    :sswitch_1
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Download failed: id= "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " reason="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto/16 :goto_0

    .line 327
    :catchall_3
    move-exception v0

    move-object v1, v2

    move v2, v3

    goto :goto_5

    .line 249
    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_0
        0x10 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic a(Lcom/facebook/selfupdate/q;J)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lcom/facebook/selfupdate/q;->a(J)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/selfupdate/q;)Lcom/facebook/common/executors/a;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->j:Lcom/facebook/common/executors/a;

    return-object v0
.end method

.method private b()V
    .locals 4

    .prologue
    .line 187
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->n:Lcom/facebook/c/k;

    if-nez v0, :cond_0

    .line 188
    new-instance v0, Lcom/facebook/selfupdate/s;

    invoke-direct {v0, p0}, Lcom/facebook/selfupdate/s;-><init>(Lcom/facebook/selfupdate/q;)V

    .line 208
    new-instance v1, Lcom/facebook/c/k;

    new-instance v2, Lcom/google/common/a/ew;

    invoke-direct {v2}, Lcom/google/common/a/ew;-><init>()V

    const-string v3, "android.intent.action.DOWNLOAD_COMPLETE"

    invoke-virtual {v2, v3, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    iput-object v1, p0, Lcom/facebook/selfupdate/q;->n:Lcom/facebook/c/k;

    .line 211
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/selfupdate/q;->n:Lcom/facebook/c/k;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.DOWNLOAD_COMPLETE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 214
    :cond_0
    return-void
.end method

.method private c()Z
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->k:Lcom/facebook/selfupdate/i;

    invoke-virtual {v0}, Lcom/facebook/selfupdate/i;->a()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 7

    .prologue
    const-wide/16 v3, -0x1

    const/4 v6, 0x0

    .line 94
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->SCHEDULE_SERVICE:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 95
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->b:Lcom/facebook/base/a/d;

    invoke-virtual {v0}, Lcom/facebook/base/a/d;->b()V

    .line 97
    invoke-direct {p0}, Lcom/facebook/selfupdate/q;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 98
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->SHOULD_SCHEDULE_SERVICE_FALSE:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 160
    :cond_0
    :goto_0
    return-void

    .line 103
    :cond_1
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->e:Lcom/facebook/config/b/a;

    invoke-interface {v0}, Lcom/facebook/config/b/a;->b()I

    move-result v0

    .line 104
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->n:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 107
    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    .line 108
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 110
    if-lt v0, v1, :cond_3

    .line 114
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    sget-object v2, Lcom/facebook/selfupdate/p;->PENDING_DOWNLOAD_OLD_VERSION:Lcom/facebook/selfupdate/p;

    invoke-virtual {v1, p0, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 115
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->h:Lcom/facebook/selfupdate/af;

    invoke-virtual {v1}, Lcom/facebook/selfupdate/af;->f()V

    .line 139
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->e:Lcom/facebook/config/b/a;

    invoke-interface {v1}, Lcom/facebook/config/b/a;->c()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 143
    invoke-direct {p0}, Lcom/facebook/selfupdate/q;->b()V

    .line 146
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/selfupdate/j;->b:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    .line 148
    iget-object v2, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/selfupdate/j;->c:Lcom/facebook/prefs/shared/ae;

    const-wide/32 v4, 0xa4cb80

    invoke-interface {v2, v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v2

    .line 151
    iget-object v4, p0, Lcom/facebook/selfupdate/q;->c:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    .line 152
    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v4, v5}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 158
    invoke-virtual {p0, v6}, Lcom/facebook/selfupdate/q;->a(Z)V

    goto :goto_0

    .line 117
    :cond_3
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->h:Lcom/facebook/selfupdate/af;

    invoke-virtual {v1}, Lcom/facebook/selfupdate/af;->b()V

    goto :goto_1

    .line 119
    :cond_4
    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 124
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v1

    .line 127
    cmp-long v3, v1, v3

    if-eqz v3, :cond_2

    .line 128
    iget-object v3, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    sget-object v4, Lcom/facebook/selfupdate/p;->PENDING_DOWNLOAD_COMPLETE:Lcom/facebook/selfupdate/p;

    invoke-virtual {v3, p0, v4}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 129
    iget-object v3, p0, Lcom/facebook/selfupdate/q;->j:Lcom/facebook/common/executors/a;

    const-string v4, "completeDownload"

    new-instance v5, Lcom/facebook/selfupdate/r;

    invoke-direct {v5, p0, v1, v2}, Lcom/facebook/selfupdate/r;-><init>(Lcom/facebook/selfupdate/q;J)V

    invoke-interface {v3, v4, v5}, Lcom/facebook/common/executors/a;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_1
.end method

.method public a(Z)V
    .locals 3

    .prologue
    .line 168
    if-eqz p1, :cond_0

    .line 169
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->FORCE_UPDATE_CHECK_NOW:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 173
    :goto_0
    invoke-direct {p0}, Lcom/facebook/selfupdate/q;->b()V

    .line 175
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/selfupdate/q;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/selfupdate/SelfUpdateFetchService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 176
    const-string v1, "force_update"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 177
    iget-object v1, p0, Lcom/facebook/selfupdate/q;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 178
    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/facebook/selfupdate/q;->f:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->UPDATE_CHECK_NOW:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    goto :goto_0
.end method
