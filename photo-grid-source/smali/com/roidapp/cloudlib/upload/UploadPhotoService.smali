.class public Lcom/roidapp/cloudlib/upload/UploadPhotoService;
.super Lcom/roidapp/cloudlib/upload/a;
.source "SourceFile"


# instance fields
.field private a:Landroid/app/NotificationManager;

.field private b:Landroid/support/v4/app/NotificationCompat$Builder;

.field private c:Lcom/roidapp/cloudlib/upload/c;

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 59
    const-string v0, "PhotoGridUploadPhotoService"

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/upload/a;-><init>(Ljava/lang/String;)V

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    .line 60
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/upload/a;-><init>(Ljava/lang/String;)V

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    .line 64
    return-void
.end method

.method private a()V
    .locals 5

    .prologue
    .line 404
    sget v0, Lcom/roidapp/cloudlib/at;->bf:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/upload/c;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/upload/c;->e()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/upload/c;->d()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 405
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/upload/c;->f()Z

    move-result v1

    if-nez v1, :cond_0

    .line 406
    sget v1, Lcom/roidapp/cloudlib/at;->bh:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 407
    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/upload/c;->d()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/upload/c;->c()I

    move-result v3

    if-ne v2, v3, :cond_1

    .line 408
    sget v2, Lcom/roidapp/cloudlib/aq;->t:I

    invoke-direct {p0, v1, v0, v2}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 413
    :cond_0
    :goto_0
    return-void

    .line 410
    :cond_1
    sget v2, Lcom/roidapp/cloudlib/aq;->v:I

    invoke-direct {p0, v1, v0, v2}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/upload/UploadPhotoService;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 39
    .line 1417
    sget v0, Lcom/roidapp/cloudlib/at;->bf:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/upload/c;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/upload/c;->e()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/upload/c;->d()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1418
    sget v1, Lcom/roidapp/cloudlib/at;->bg:I

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/upload/c;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1419
    const/4 v2, -0x1

    invoke-direct {p0, v1, v0, v2}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 346
    invoke-static {p0}, Lcom/roidapp/cloudlib/upload/w;->a(Landroid/content/Context;)V

    .line 348
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    if-nez v0, :cond_0

    .line 349
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-direct {v0, p0}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    .line 354
    :cond_0
    if-eq p3, v5, :cond_1

    .line 355
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0, p3}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 356
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->E:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 357
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 360
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 362
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 365
    invoke-static {p0, v3, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 371
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 372
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 373
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 375
    if-eq p3, v5, :cond_2

    .line 376
    sget v0, Lcom/roidapp/cloudlib/aq;->b:I

    if-eq p3, v0, :cond_3

    .line 377
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 378
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->setOngoing(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 379
    iput-boolean v4, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->e:Z

    .line 392
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a:Landroid/app/NotificationManager;

    const/16 v1, 0xd26

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v2}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 393
    return-void

    .line 382
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 383
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->b:Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {v0, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setOngoing(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 384
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->e:Z

    goto :goto_0
.end method


# virtual methods
.method protected final a(Landroid/content/Intent;)V
    .locals 11

    .prologue
    const/high16 v4, -0x80000000

    const/4 v0, 0x1

    const/4 v9, 0x0

    .line 280
    const-string v1, "service_name"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 281
    const-string v1, "image_path"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 282
    const-string v1, "message"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 283
    const-string v1, "image_format"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 284
    const-string v1, "ga_mode"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 285
    const-string v1, "current_index"

    invoke-virtual {p1, v1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    .line 286
    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    if-ne v1, v4, :cond_0

    .line 339
    :goto_0
    return-void

    .line 288
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v4, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    invoke-virtual {v1, v4}, Lcom/roidapp/cloudlib/upload/c;->b(I)Z

    move-result v1

    .line 289
    if-eqz v1, :cond_9

    .line 1397
    sget v1, Lcom/roidapp/cloudlib/at;->bf:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v8}, Lcom/roidapp/cloudlib/upload/c;->d()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v4, v9

    iget-object v8, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v8}, Lcom/roidapp/cloudlib/upload/c;->e()I

    move-result v8

    iget-object v10, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v10}, Lcom/roidapp/cloudlib/upload/c;->d()I

    move-result v10

    sub-int/2addr v8, v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v4, v0

    invoke-virtual {p0, v1, v4}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1398
    sget v4, Lcom/roidapp/cloudlib/at;->bg:I

    new-array v8, v0, [Ljava/lang/Object;

    iget-object v10, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v10}, Lcom/roidapp/cloudlib/upload/c;->c()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-virtual {p0, v4, v8}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1399
    sget v8, Lcom/roidapp/cloudlib/aq;->b:I

    invoke-direct {p0, v4, v1, v8}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 293
    if-eqz v6, :cond_3

    const-string v1, "video/"

    invoke-virtual {v6, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    move v4, v0

    .line 294
    :goto_1
    new-instance v8, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v8, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 295
    new-instance v0, Lcom/roidapp/cloudlib/upload/u;

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/roidapp/cloudlib/upload/u;-><init>(Lcom/roidapp/cloudlib/upload/UploadPhotoService;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V

    .line 312
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/v;->start()V

    .line 316
    if-eqz v4, :cond_4

    const-wide/16 v4, 0x4b0

    :goto_2
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v8, v4, v5, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v9

    .line 317
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "upload "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " finish, thread result="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 322
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "uploadTo"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " end, result="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v3, v0, Lcom/roidapp/cloudlib/upload/v;->j:Z

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 324
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/v;->interrupt()V

    .line 326
    iget-object v1, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 328
    new-instance v1, Ljava/io/File;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 331
    :cond_1
    if-nez v9, :cond_2

    .line 332
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v2, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 334
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a()V

    goto/16 :goto_0

    :cond_3
    move v4, v9

    .line 293
    goto :goto_1

    .line 316
    :cond_4
    const-wide/16 v4, 0x12c

    goto :goto_2

    .line 319
    :catch_0
    move-exception v1

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 322
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "uploadTo"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " end, result="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v3, v0, Lcom/roidapp/cloudlib/upload/v;->j:Z

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 324
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/v;->interrupt()V

    .line 326
    iget-object v1, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 328
    new-instance v1, Ljava/io/File;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 331
    :cond_5
    if-nez v9, :cond_6

    .line 332
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v2, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 334
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a()V

    goto/16 :goto_0

    .line 322
    :catchall_0
    move-exception v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "uploadTo"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " end, result="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, v0, Lcom/roidapp/cloudlib/upload/v;->j:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 324
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/v;->interrupt()V

    .line 326
    iget-object v3, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    if-eqz v3, :cond_7

    iget-object v3, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 328
    new-instance v2, Ljava/io/File;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/v;->i:Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 331
    :cond_7
    if-nez v9, :cond_8

    .line 332
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v2, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v3, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 334
    :cond_8
    invoke-direct {p0}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a()V

    throw v1

    .line 337
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Task["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "] has been removed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0
.end method

.method public final bridge synthetic a(Z)V
    .locals 0

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/upload/a;->a(Z)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "uploadToTwitter, taskid="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ",imgPath="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ",msg="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->b:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 258
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 264
    :goto_0
    if-ne v0, v1, :cond_0

    .line 265
    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v4, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v5, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 266
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v3

    const-string v4, "Cloud/Share/%s/Twitter/OK"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p3, v1, v2

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, p0, v1}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 268
    const-string v1, "Twitter"

    invoke-static {v1, p3}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    :cond_0
    return v0

    .line 260
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ltwitter4j/TwitterException;->printStackTrace()V

    .line 262
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    move v0, v2

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 9

    .prologue
    const/16 v3, 0x7530

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "uploadToFacebook, taskid="

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ",imgPath="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ",msg="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v4

    .line 113
    if-eqz v4, :cond_d

    invoke-virtual {v4}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v0

    if-nez v0, :cond_d

    .line 118
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "file://"

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 119
    new-instance v5, Lcom/roidapp/cloudlib/facebook/ak;

    invoke-direct {v5, p0, v0}, Lcom/roidapp/cloudlib/facebook/ak;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v6, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v7, Lcom/roidapp/cloudlib/upload/f;->b:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v6, v7}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 121
    invoke-virtual {v5}, Lcom/roidapp/cloudlib/facebook/ak;->a()Lcom/roidapp/baselib/c/x;

    move-result-object v0

    .line 122
    if-nez v0, :cond_2

    move v0, v1

    .line 123
    :goto_0
    if-nez p3, :cond_0

    if-eqz v0, :cond_9

    .line 124
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 125
    new-instance v5, Landroid/os/Bundle;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Landroid/os/Bundle;-><init>(I)V

    .line 126
    if-eqz p3, :cond_4

    .line 127
    const-string v6, "description"

    invoke-virtual {v5, v6, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    :goto_1
    const/high16 v6, 0x10000000

    invoke-static {v0, v6}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v6

    .line 133
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 135
    new-instance v6, Lcom/facebook/GraphRequest;

    if-eqz p3, :cond_5

    const-string v0, "me/videos"

    :goto_2
    sget-object v7, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    invoke-direct {v6, v4, v0, v5, v7}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 136
    new-instance v4, Lcom/facebook/GraphRequestBatch;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/GraphRequest;

    const/4 v5, 0x0

    aput-object v6, v0, v5

    invoke-direct {v4, v0}, Lcom/facebook/GraphRequestBatch;-><init>([Lcom/facebook/GraphRequest;)V

    .line 137
    if-eqz p3, :cond_6

    const v0, 0x1d4c0

    :goto_3
    invoke-virtual {v4, v0}, Lcom/facebook/GraphRequestBatch;->setTimeout(I)V

    .line 138
    invoke-static {v4}, Lcom/facebook/GraphRequest;->executeBatchAndWait(Lcom/facebook/GraphRequestBatch;)Ljava/util/List;

    move-result-object v0

    .line 139
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v1, :cond_7

    .line 140
    :cond_1
    const-string v0, "UploadPhotoService"

    const-string v1, "uploadToFacebook failed."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v3, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 199
    :goto_4
    return v2

    .line 122
    :cond_2
    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v5, 0x1e0

    if-ge v0, v5, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0

    .line 130
    :cond_4
    const-string v6, "caption"

    invoke-virtual {v5, v6, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 187
    :catch_0
    move-exception v0

    move-object v1, v0

    move v0, v2

    .line 188
    :goto_5
    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 189
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V

    :goto_6
    move v2, v0

    .line 199
    goto :goto_4

    .line 135
    :cond_5
    :try_start_1
    const-string v0, "me/photos"

    goto :goto_2

    :cond_6
    move v0, v3

    .line 137
    goto :goto_3

    .line 144
    :cond_7
    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphResponse;

    .line 145
    invoke-virtual {v0}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    .line 146
    if-nez v0, :cond_8

    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_1 .. :try_end_1} :catch_1

    .line 149
    :try_start_2
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v2, "Cloud/Share/%s/Facebook/OK"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p4, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 151
    const-string v0, "Facebook"

    invoke-static {v0, p4}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/facebook/FacebookException; {:try_start_2 .. :try_end_2} :catch_2

    move v0, v1

    goto :goto_6

    .line 153
    :cond_8
    :try_start_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v3, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    move v0, v2

    .line 155
    goto :goto_6

    .line 158
    :cond_9
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 159
    new-instance v3, Landroid/os/Bundle;

    const/4 v5, 0x2

    invoke-direct {v3, v5}, Landroid/os/Bundle;-><init>(I)V

    .line 160
    const-string v5, "caption"

    invoke-virtual {v3, v5, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const/high16 v5, 0x10000000

    invoke-static {v0, v5}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v5

    .line 162
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 164
    new-instance v0, Lcom/facebook/GraphRequest;

    const-string v5, "me/photos"

    sget-object v6, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    invoke-direct {v0, v4, v5, v3, v6}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 165
    new-instance v3, Lcom/facebook/GraphRequestBatch;

    const/4 v4, 0x1

    new-array v4, v4, [Lcom/facebook/GraphRequest;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-direct {v3, v4}, Lcom/facebook/GraphRequestBatch;-><init>([Lcom/facebook/GraphRequest;)V

    .line 166
    const/16 v0, 0x7530

    invoke-virtual {v3, v0}, Lcom/facebook/GraphRequestBatch;->setTimeout(I)V

    .line 167
    invoke-static {v3}, Lcom/facebook/GraphRequest;->executeBatchAndWait(Lcom/facebook/GraphRequestBatch;)Ljava/util/List;

    move-result-object v0

    .line 168
    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v1, :cond_b

    .line 169
    :cond_a
    const-string v0, "UploadPhotoService"

    const-string v1, "uploadToFacebook failed."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v3, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_4

    .line 190
    :catch_1
    move-exception v0

    move-object v1, v0

    move v0, v2

    .line 191
    :goto_7
    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 192
    invoke-virtual {v1}, Lcom/facebook/FacebookException;->printStackTrace()V

    goto/16 :goto_6

    .line 173
    :cond_b
    const/4 v3, 0x0

    :try_start_4
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphResponse;

    .line 174
    invoke-virtual {v0}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    .line 175
    if-nez v0, :cond_c

    .line 176
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v3, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v4, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_4 .. :try_end_4} :catch_1

    .line 178
    :try_start_5
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v2, "Cloud/Share/%s/Facebook/OK"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p4, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 180
    const-string v0, "Facebook"

    invoke-static {v0, p4}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lcom/facebook/FacebookException; {:try_start_5 .. :try_end_5} :catch_2

    move v0, v1

    goto/16 :goto_6

    .line 183
    :cond_c
    :try_start_6
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v3, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_6 .. :try_end_6} :catch_1

    move v0, v2

    .line 193
    goto/16 :goto_6

    .line 196
    :cond_d
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    iget v1, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->d:I

    sget-object v3, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/cloudlib/upload/c;->a(ILcom/roidapp/cloudlib/upload/f;)V

    .line 197
    const-string v0, "UploadPhotoService"

    const-string v1, "facebook session not open !"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    goto/16 :goto_6

    .line 190
    :catch_2
    move-exception v0

    move-object v8, v0

    move v0, v1

    move-object v1, v8

    goto :goto_7

    .line 187
    :catch_3
    move-exception v0

    move-object v8, v0

    move v0, v1

    move-object v1, v8

    goto/16 :goto_5
.end method

.method public bridge synthetic onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/upload/a;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 68
    invoke-super {p0}, Lcom/roidapp/cloudlib/upload/a;->onCreate()V

    .line 1039
    const/4 v0, 0x1

    invoke-super {p0, v0}, Lcom/roidapp/cloudlib/upload/a;->a(Z)V

    .line 75
    invoke-static {p0}, Lcom/roidapp/cloudlib/upload/c;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/upload/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    .line 76
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->c:Lcom/roidapp/cloudlib/upload/c;

    new-instance v1, Lcom/roidapp/cloudlib/upload/t;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/upload/t;-><init>(Lcom/roidapp/cloudlib/upload/UploadPhotoService;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/upload/c;->a(Lcom/roidapp/cloudlib/upload/d;)V

    .line 85
    const-string v0, "notification"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a:Landroid/app/NotificationManager;

    .line 87
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a:Landroid/app/NotificationManager;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a:Landroid/app/NotificationManager;

    const/16 v1, 0xd26

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 94
    :cond_0
    invoke-super {p0}, Lcom/roidapp/cloudlib/upload/a;->onDestroy()V

    .line 96
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 1

    .prologue
    .line 100
    invoke-static {p0, p1}, Lcom/roidapp/cloudlib/upload/w;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    invoke-virtual {p0, p2}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->stopSelf(I)V

    .line 105
    :goto_0
    return-void

    .line 104
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/upload/a;->onStart(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method public bridge synthetic onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/upload/a;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
