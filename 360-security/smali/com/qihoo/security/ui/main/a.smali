.class public Lcom/qihoo/security/ui/main/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:J


# direct methods
.method public static a(J[Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)J
    .locals 10

    .prologue
    .line 342
    invoke-static {}, Lcom/qihoo/security/ui/main/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/qihoo/security/ui/main/a$3;

    invoke-direct {v1, p2, p3, p4}, Lcom/qihoo/security/ui/main/a$3;-><init>([Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 352
    const-wide/16 p0, 0x0

    .line 436
    :cond_0
    return-wide p0

    .line 354
    :cond_1
    const/4 v1, -0x1

    .line 355
    if-eqz p3, :cond_3

    array-length v0, p3

    if-lez v0, :cond_3

    const/4 v0, 0x1

    move v3, v0

    .line 356
    :goto_0
    if-eqz v3, :cond_5

    .line 357
    array-length v0, p3

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_e

    .line 358
    aget-object v2, p3, v0

    .line 359
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_4

    :goto_2
    move v2, v0

    .line 373
    :goto_3
    if-eqz p2, :cond_9

    .line 374
    new-instance v4, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v4}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 376
    const/4 v0, 0x0

    :goto_4
    array-length v1, p2

    if-ge v0, v1, :cond_9

    .line 377
    aget-object v5, p2, v0

    .line 378
    if-nez v5, :cond_7

    .line 376
    :cond_2
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 355
    :cond_3
    const/4 v0, 0x0

    move v3, v0

    goto :goto_0

    .line 357
    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 364
    :cond_5
    if-eqz p2, :cond_d

    .line 365
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_d

    .line 366
    aget-object v2, p2, v0

    .line 367
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_6

    move v2, v0

    .line 369
    goto :goto_3

    .line 365
    :cond_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    .line 381
    :cond_7
    invoke-virtual {v5}, Landroid/view/View;->clearAnimation()V

    .line 382
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_2

    .line 385
    const-string/jumbo v1, "alpha"

    const/4 v6, 0x2

    new-array v6, v6, [F

    fill-array-data v6, :array_0

    invoke-static {v5, v1, v6}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v6

    .line 386
    const-wide/16 v8, 0x12c

    invoke-virtual {v6, v8, v9}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 387
    invoke-virtual {v6, v4}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 388
    if-nez v3, :cond_8

    if-ne v0, v2, :cond_8

    const/4 v1, 0x1

    .line 389
    :goto_7
    new-instance v7, Lcom/qihoo/security/ui/main/a$1;

    invoke-direct {v7, v5, p4, v1}, Lcom/qihoo/security/ui/main/a$1;-><init>(Landroid/view/View;Lcom/nineoldandroids/a/b;Z)V

    invoke-virtual {v6, v7}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 398
    invoke-virtual {v6}, Lcom/nineoldandroids/a/k;->a()V

    goto :goto_5

    .line 388
    :cond_8
    const/4 v1, 0x0

    goto :goto_7

    .line 402
    :cond_9
    if-eqz p3, :cond_0

    .line 403
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 404
    const/4 v0, 0x0

    :goto_8
    array-length v1, p3

    if-ge v0, v1, :cond_0

    .line 405
    aget-object v4, p3, v0

    .line 406
    if-nez v4, :cond_a

    .line 404
    :goto_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 409
    :cond_a
    invoke-virtual {v4}, Landroid/view/View;->clearAnimation()V

    .line 410
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_b

    .line 411
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    goto :goto_9

    .line 414
    :cond_b
    const-string/jumbo v1, "alpha"

    const/4 v5, 0x2

    new-array v5, v5, [F

    fill-array-data v5, :array_1

    invoke-static {v4, v1, v5}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v5

    .line 415
    const-wide/16 v6, 0x12c

    invoke-virtual {v5, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 416
    const-wide/16 v6, 0x96

    add-long/2addr p0, v6

    invoke-virtual {v5, p0, p1}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 417
    invoke-virtual {v5, v3}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 418
    if-ne v0, v2, :cond_c

    const/4 v1, 0x1

    .line 419
    :goto_a
    new-instance v6, Lcom/qihoo/security/ui/main/a$2;

    invoke-direct {v6, v4, p4, v1}, Lcom/qihoo/security/ui/main/a$2;-><init>(Landroid/view/View;Lcom/nineoldandroids/a/b;Z)V

    invoke-virtual {v5, v6}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 432
    invoke-virtual {v5}, Lcom/nineoldandroids/a/k;->a()V

    goto :goto_9

    .line 418
    :cond_c
    const/4 v1, 0x0

    goto :goto_a

    :cond_d
    move v2, v1

    goto/16 :goto_3

    :cond_e
    move v0, v1

    goto/16 :goto_2

    .line 385
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 414
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static a([Landroid/view/View;[Landroid/view/View;)J
    .locals 3

    .prologue
    .line 313
    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, p0, p1, v2}, Lcom/qihoo/security/ui/main/a;->a(J[Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static a(JLandroid/view/View;Lcom/nineoldandroids/a/b;)V
    .locals 4

    .prologue
    .line 446
    const-string/jumbo v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p2, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 447
    const-wide/16 v2, 0x0

    cmp-long v1, p0, v2

    if-lez v1, :cond_1

    :goto_0
    invoke-virtual {v0, p0, p1}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 448
    if-eqz p3, :cond_0

    .line 449
    invoke-virtual {v0, p3}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 450
    :cond_0
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 451
    return-void

    .line 447
    :cond_1
    const-wide/16 p0, 0x190

    goto :goto_0

    .line 446
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static a(JLandroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/mainpage/a$a;)V
    .locals 10

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 469
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move v3, v1

    move v4, v2

    move v7, v5

    move v8, v6

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 471
    const-wide/16 v2, 0x0

    cmp-long v1, p0, v2

    if-lez v1, :cond_1

    :goto_0
    invoke-virtual {v0, p0, p1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 472
    invoke-virtual {v0, v5}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    .line 473
    if-eqz p3, :cond_0

    .line 474
    invoke-virtual {v0, p3}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 475
    :cond_0
    invoke-virtual {p2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 476
    return-void

    .line 471
    :cond_1
    const-wide/16 p0, 0x190

    goto :goto_0
.end method

.method public static a(Landroid/view/View;JLcom/nineoldandroids/a/b;)V
    .locals 7

    .prologue
    const/4 v6, 0x2

    .line 486
    const-string/jumbo v0, "scaleX"

    new-array v1, v6, [F

    fill-array-data v1, :array_0

    invoke-static {p0, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 487
    const-string/jumbo v1, "scaleY"

    new-array v2, v6, [F

    fill-array-data v2, :array_1

    invoke-static {p0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 488
    new-instance v2, Lcom/nineoldandroids/a/c;

    invoke-direct {v2}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 489
    const-wide/16 v4, 0x0

    cmp-long v3, p1, v4

    if-lez v3, :cond_1

    :goto_0
    invoke-virtual {v2, p1, p2}, Lcom/nineoldandroids/a/c;->c(J)Lcom/nineoldandroids/a/c;

    .line 490
    if-eqz p3, :cond_0

    .line 491
    invoke-virtual {v2, p3}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 492
    :cond_0
    new-array v3, v6, [Lcom/nineoldandroids/a/a;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/c;->a([Lcom/nineoldandroids/a/a;)V

    .line 493
    invoke-virtual {v2}, Lcom/nineoldandroids/a/c;->a()V

    .line 494
    return-void

    .line 489
    :cond_1
    const-wide/16 p1, 0x190

    goto :goto_0

    .line 486
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 487
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V
    .locals 4

    .prologue
    .line 507
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    .line 508
    const-string/jumbo v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p2, v1, v2

    const/4 v2, 0x1

    aput p3, v1, v2

    invoke-static {p0, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 509
    invoke-virtual {v0, p4, p5}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 510
    if-eqz p1, :cond_0

    .line 511
    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 513
    :cond_0
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 514
    return-void
.end method

.method public static declared-synchronized a()Z
    .locals 8

    .prologue
    .line 321
    const-class v1, Lcom/qihoo/security/ui/main/a;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 322
    sget-wide v4, Lcom/qihoo/security/ui/main/a;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long v4, v2, v4

    .line 323
    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    const-wide/16 v6, 0x1f4

    cmp-long v0, v4, v6

    if-gez v0, :cond_0

    .line 324
    const/4 v0, 0x1

    .line 327
    :goto_0
    monitor-exit v1

    return v0

    .line 326
    :cond_0
    :try_start_1
    sput-wide v2, Lcom/qihoo/security/ui/main/a;->a:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    const/4 v0, 0x0

    goto :goto_0

    .line 321
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static b(JLandroid/view/View;Lcom/nineoldandroids/a/b;)V
    .locals 4

    .prologue
    .line 454
    const-string/jumbo v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p2, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 455
    const-wide/16 v2, 0x0

    cmp-long v1, p0, v2

    if-lez v1, :cond_1

    :goto_0
    invoke-virtual {v0, p0, p1}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 456
    if-eqz p3, :cond_0

    .line 457
    invoke-virtual {v0, p3}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 458
    :cond_0
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 459
    return-void

    .line 455
    :cond_1
    const-wide/16 p0, 0x190

    goto :goto_0

    .line 454
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
