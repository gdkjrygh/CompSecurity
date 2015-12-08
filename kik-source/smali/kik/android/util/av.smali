.class public final Lkik/android/util/av;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;I)I
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v0, 0x0

    .line 567
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    if-nez v1, :cond_1

    .line 578
    :cond_0
    :goto_0
    return v0

    .line 570
    :cond_1
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 571
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x10100ae

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 572
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    new-array v2, v4, [I

    aput p1, v2, v0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 573
    if-eqz v1, :cond_0

    .line 576
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 577
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 128
    if-nez p0, :cond_0

    .line 153
    :goto_0
    return-void

    .line 131
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 132
    new-instance v1, Lcom/kik/android/a/a;

    invoke-direct {v1, p0}, Lcom/kik/android/a/a;-><init>(Landroid/view/View;)V

    .line 133
    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a/a;->setDuration(J)V

    .line 134
    new-instance v2, Lkik/android/util/az;

    invoke-direct {v2, p0, v0}, Lkik/android/util/az;-><init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v2}, Lcom/kik/android/a/a;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 152
    invoke-virtual {p0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;I)V
    .locals 4

    .prologue
    const/4 v2, -0x1

    .line 86
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 87
    :cond_0
    :goto_0
    return-void

    .line 86
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    instance-of v0, v1, Lcom/kik/android/a/b;

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, Lcom/kik/android/a/b;

    invoke-virtual {v0}, Lcom/kik/android/a/b;->a()I

    move-result v0

    check-cast v1, Lcom/kik/android/a/b;

    invoke-virtual {v1}, Lcom/kik/android/a/b;->b()I

    move-result v1

    if-ne v0, p1, :cond_2

    if-eq v1, v2, :cond_0

    :cond_2
    new-instance v0, Lcom/kik/android/a/b;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-direct {v0, p0, v1, p1, v2}, Lcom/kik/android/a/b;-><init>(Landroid/view/View;III)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a/b;->setDuration(J)V

    new-instance v1, Lkik/android/util/ay;

    invoke-direct {v1, p0}, Lkik/android/util/ay;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/kik/android/a/b;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;II)V
    .locals 2

    .prologue
    .line 157
    const/16 v0, 0x12c

    const/4 v1, 0x0

    invoke-static {p0, p1, p2, v0, v1}, Lkik/android/util/av;->a(Landroid/view/View;IIILandroid/view/animation/Animation$AnimationListener;)V

    .line 158
    return-void
.end method

.method public static a(Landroid/view/View;IIILandroid/view/animation/Animation$AnimationListener;)V
    .locals 4

    .prologue
    .line 162
    if-nez p0, :cond_0

    .line 190
    :goto_0
    return-void

    .line 165
    :cond_0
    new-instance v0, Lcom/kik/android/a/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/kik/android/a/c;-><init>(Landroid/view/View;III)V

    .line 166
    int-to-long v2, p3

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a/c;->setDuration(J)V

    .line 167
    if-eqz p4, :cond_1

    .line 168
    new-instance v1, Lkik/android/util/ba;

    invoke-direct {v1, p4}, Lkik/android/util/ba;-><init>(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v0, v1}, Lcom/kik/android/a/c;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 189
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;IJLandroid/animation/Animator$AnimatorListener;)V
    .locals 4

    .prologue
    .line 322
    if-nez p0, :cond_0

    .line 335
    :goto_0
    return-void

    .line 326
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 328
    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 329
    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 330
    invoke-virtual {v0, p2, p3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 331
    if-eqz p4, :cond_1

    .line 332
    invoke-virtual {v0, p4}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 334
    :cond_1
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    .line 328
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static a(Landroid/view/View;ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 4

    .prologue
    .line 419
    if-nez p0, :cond_0

    .line 453
    :goto_0
    return-void

    .line 423
    :cond_0
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 424
    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 425
    new-instance v1, Lkik/android/util/aw;

    invoke-direct {v1, p2, p0}, Lkik/android/util/aw;-><init>(Landroid/view/animation/Animation$AnimationListener;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 452
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public static varargs a([Landroid/view/View;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    .line 339
    array-length v0, p0

    new-array v3, v0, [Landroid/animation/ObjectAnimator;

    move v0, v1

    .line 340
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_2

    .line 341
    aget-object v4, p0, v0

    .line 342
    if-eqz v4, :cond_0

    .line 343
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpl-float v2, v2, v7

    if-eqz v2, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    move-result v2

    .line 346
    :goto_1
    sget-object v5, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v6, 0x2

    new-array v6, v6, [F

    aput v2, v6, v1

    const/4 v2, 0x1

    aput v7, v6, v2

    invoke-static {v4, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    aput-object v2, v3, v0

    .line 347
    aget-object v2, v3, v0

    new-instance v4, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v4}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v4}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 340
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 343
    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 349
    :cond_2
    invoke-static {p0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 350
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 351
    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 352
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 353
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 354
    return-void
.end method

.method public static b(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 231
    if-nez p0, :cond_0

    .line 263
    :goto_0
    return-void

    .line 234
    :cond_0
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/high16 v4, -0x40800000    # -1.0f

    move v3, v1

    move v5, v1

    move v6, v2

    move v7, v1

    move v8, v2

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 238
    const-wide/16 v2, 0x190

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 239
    new-instance v1, Lkik/android/util/bb;

    invoke-direct {v1, p0, v0}, Lkik/android/util/bb;-><init>(Landroid/view/View;Landroid/view/animation/Animation;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 262
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public static b(Landroid/view/View;I)V
    .locals 4

    .prologue
    .line 390
    if-nez p0, :cond_0

    .line 415
    :goto_0
    return-void

    .line 394
    :cond_0
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 395
    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 396
    new-instance v1, Lkik/android/util/bd;

    invoke-direct {v1, p0}, Lkik/android/util/bd;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 414
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public static b(Landroid/view/View;ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 4

    .prologue
    .line 462
    if-nez p0, :cond_0

    .line 489
    :goto_0
    return-void

    .line 465
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 467
    new-instance v0, Lcom/kik/android/a/c;

    sget v1, Lcom/kik/android/a/c$a;->a:I

    const/16 v2, 0x33

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/kik/android/a/c;-><init>(Landroid/view/View;III)V

    .line 468
    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a/c;->setDuration(J)V

    .line 469
    new-instance v1, Lkik/android/util/ax;

    invoke-direct {v1, p0, p1, p2}, Lkik/android/util/ax;-><init>(Landroid/view/View;ILandroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v0, v1}, Lcom/kik/android/a/c;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 488
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public static varargs b([Landroid/view/View;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v7, 0x0

    .line 358
    array-length v0, p0

    new-array v3, v0, [Landroid/animation/ObjectAnimator;

    move v0, v1

    .line 359
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_2

    .line 360
    aget-object v4, p0, v0

    .line 361
    if-eqz v4, :cond_0

    .line 362
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpl-float v2, v2, v7

    if-eqz v2, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    move-result v2

    .line 365
    :goto_1
    sget-object v5, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v6, 0x2

    new-array v6, v6, [F

    aput v2, v6, v1

    const/4 v2, 0x1

    aput v7, v6, v2

    invoke-static {v4, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    aput-object v2, v3, v0

    .line 366
    aget-object v2, v3, v0

    new-instance v4, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v4}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v4}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 359
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 362
    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_1

    .line 368
    :cond_2
    invoke-static {p0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 369
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 370
    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 371
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 372
    new-instance v1, Lkik/android/util/bc;

    invoke-direct {v1, p0}, Lkik/android/util/bc;-><init>([Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 380
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 381
    return-void
.end method

.method public static c(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 385
    const/16 v0, 0x1f4

    invoke-static {p0, v0}, Lkik/android/util/av;->b(Landroid/view/View;I)V

    .line 386
    return-void
.end method
