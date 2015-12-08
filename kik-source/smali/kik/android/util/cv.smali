.class public final Lkik/android/util/cv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/cv$a;,
        Lkik/android/util/cv$c;,
        Lkik/android/util/cv$d;,
        Lkik/android/util/cv$b;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-string v0, "http://cdn.kik.com/cards/unsupported.html"

    sput-object v0, Lkik/android/util/cv;->a:Ljava/lang/String;

    return-void
.end method

.method private static a([II)I
    .locals 1

    .prologue
    .line 588
    if-eqz p0, :cond_0

    array-length v0, p0

    if-ge p1, v0, :cond_0

    if-gez p1, :cond_1

    .line 589
    :cond_0
    const/4 v0, 0x0

    .line 591
    :goto_0
    return v0

    :cond_1
    aget v0, p0, p1

    goto :goto_0
.end method

.method public static a(Landroid/view/View;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;Landroid/animation/Animator$AnimatorListener;JJ)Landroid/animation/Animator;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 706
    if-nez p0, :cond_0

    .line 707
    const/4 v0, 0x0

    .line 716
    :goto_0
    return-object v0

    .line 710
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    aput p1, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 711
    invoke-static {p0, p2}, Lkik/android/util/cv;->a(Landroid/view/View;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 712
    invoke-virtual {v0, p3}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 713
    invoke-virtual {v0, p6, p7}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 714
    invoke-virtual {v0, p4, p5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    goto :goto_0
.end method

.method private static a(Landroid/view/View;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 779
    new-instance v0, Lkik/android/util/cx;

    invoke-direct {v0, p0, p1}, Lkik/android/util/cx;-><init>(Landroid/view/View;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object v0
.end method

.method public static a(Landroid/view/View;ILandroid/animation/Animator$AnimatorListener;J)Landroid/animation/ValueAnimator;
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 755
    if-nez p0, :cond_0

    .line 767
    :goto_0
    return-object v0

    .line 759
    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    aput v3, v1, v2

    const/4 v2, 0x1

    aput p1, v1, v2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 760
    invoke-static {p0, v0}, Lkik/android/util/cv;->a(Landroid/view/View;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 761
    if-eqz p2, :cond_1

    .line 762
    invoke-virtual {v1, p2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 765
    :cond_1
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 766
    invoke-virtual {v1, p3, p4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-object v0, v1

    .line 767
    goto :goto_0
.end method

.method private static a(Lkik/a/d/o;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 317
    if-nez p0, :cond_1

    .line 332
    :cond_0
    :goto_0
    return-object v0

    .line 322
    :cond_1
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v1

    invoke-virtual {v1, p0}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v1

    .line 323
    if-eqz v1, :cond_0

    .line 325
    const/4 v2, 0x0

    :try_start_0
    array-length v3, v1

    invoke-static {v1, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Lkik/a/d/a/a;Landroid/content/Context;Ljava/lang/String;)Lkik/android/util/cv$c;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 255
    .line 260
    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    if-nez p2, :cond_1

    .line 306
    :cond_0
    :goto_0
    return-object v2

    .line 264
    :cond_1
    const-string v0, "android"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 265
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {p1, v0}, Lkik/android/util/DeviceUtils;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lkik/android/util/cv;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    move-object v1, v0

    .line 271
    :goto_1
    invoke-virtual {p0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 272
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    const-string v5, "android"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    const-string v5, "cards"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 273
    :cond_4
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->e()Ljava/lang/String;

    move-result-object v3

    move-object v4, v0

    move-object v0, v3

    .line 279
    :goto_2
    if-eqz v1, :cond_0

    .line 280
    const-string v3, "http://"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "https://"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 281
    :cond_5
    if-nez v0, :cond_9

    .line 282
    const v0, 0x7f0902e8

    new-array v3, v7, [Ljava/lang/Object;

    invoke-static {p0}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v6

    invoke-virtual {p1, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    move-object v0, v2

    .line 296
    :goto_3
    if-nez v0, :cond_6

    .line 297
    const-string v0, "icon"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cv;->a(Lkik/a/d/o;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 298
    if-nez v0, :cond_6

    .line 300
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0200b2

    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 304
    :cond_6
    new-instance v2, Lkik/android/util/cv$c;

    invoke-direct {v2, v1, v3, v0, v4}, Lkik/android/util/cv$c;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/kik/f/a/a/a;)V

    goto/16 :goto_0

    .line 285
    :cond_7
    const-string v0, "market://"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 287
    const v0, 0x7f0902b4

    new-array v2, v7, [Ljava/lang/Object;

    invoke-static {p0}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 288
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020208

    invoke-static {v2, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v2

    move-object v3, v0

    move-object v0, v2

    goto :goto_3

    .line 292
    :cond_8
    const v0, 0x7f0902e9

    new-array v3, v7, [Ljava/lang/Object;

    invoke-static {p0}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v6

    invoke-virtual {p1, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    move-object v0, v2

    goto :goto_3

    :cond_9
    move-object v3, v0

    move-object v0, v2

    goto :goto_3

    :cond_a
    move-object v4, v2

    move-object v0, v2

    goto/16 :goto_2

    :cond_b
    move-object v1, v2

    goto/16 :goto_1
.end method

.method public static a(Landroid/graphics/drawable/Drawable;I)V
    .locals 2

    .prologue
    .line 850
    instance-of v0, p0, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v0, :cond_0

    .line 851
    check-cast p0, Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 856
    :goto_0
    return-void

    .line 854
    :cond_0
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Trying to set gradient drawable color on a non-gradient drawable"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->e(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 108
    if-nez p0, :cond_1

    .line 117
    :cond_0
    :goto_0
    return-void

    .line 112
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 113
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const/4 v4, 0x3

    const/4 v7, 0x0

    move v6, v5

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 114
    invoke-virtual {p0, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 115
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;I)V
    .locals 2

    .prologue
    .line 192
    new-instance v0, Lkik/android/util/cv$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkik/android/util/cv$b;-><init>(Landroid/view/View;B)V

    invoke-virtual {v0, p1}, Lkik/android/util/cv$b;->a(I)Lkik/android/util/cv$b;

    .line 193
    return-void
.end method

.method public static a(Landroid/view/View;II)V
    .locals 4

    .prologue
    .line 421
    if-nez p0, :cond_0

    .line 425
    :goto_0
    return-void

    .line 424
    :cond_0
    invoke-static {p1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    invoke-static {p2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    const/16 v3, 0xa

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;Landroid/animation/Animator$AnimatorListener;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 686
    if-nez p0, :cond_0

    .line 701
    :goto_0
    return-void

    .line 690
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 691
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 692
    invoke-virtual {p0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 694
    new-instance v0, Lkik/android/util/cw;

    invoke-direct {v0, p0, p1, p2, p3}, Lkik/android/util/cw;-><init>(Landroid/view/View;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public static a(Landroid/view/View;Landroid/view/View;)V
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v5, 0x4

    const/4 v4, 0x2

    .line 550
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 576
    :cond_0
    :goto_0
    return-void

    .line 553
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_2

    .line 554
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 555
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to set relative layour params on a view not in a relative layout!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 559
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 560
    const/4 v1, 0x3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 562
    invoke-virtual {v0}, Landroid/widget/RelativeLayout$LayoutParams;->getRules()[I

    move-result-object v1

    .line 563
    invoke-static {v1, v4}, Lkik/android/util/cv;->a([II)I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v2, v3, :cond_3

    .line 565
    invoke-static {v0, v4}, Lkik/android/util/cv;->a(Landroid/widget/RelativeLayout$LayoutParams;I)V

    .line 567
    :cond_3
    invoke-static {v1, v5}, Lkik/android/util/cv;->a([II)I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v2, v3, :cond_4

    .line 569
    invoke-static {v0, v5}, Lkik/android/util/cv;->a(Landroid/widget/RelativeLayout$LayoutParams;I)V

    .line 571
    :cond_4
    invoke-static {v1, v6}, Lkik/android/util/cv;->a([II)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    if-ne v1, v2, :cond_5

    .line 573
    invoke-static {v0, v6}, Lkik/android/util/cv;->a(Landroid/widget/RelativeLayout$LayoutParams;I)V

    .line 575
    :cond_5
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method private static a(Landroid/widget/RelativeLayout$LayoutParams;I)V
    .locals 1

    .prologue
    .line 580
    if-eqz p0, :cond_0

    if-gez p1, :cond_1

    .line 584
    :cond_0
    :goto_0
    return-void

    .line 583
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    goto :goto_0
.end method

.method public static a(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 430
    if-nez p0, :cond_0

    .line 437
    :goto_0
    return-void

    .line 433
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    or-int/lit8 v0, v0, 0x8

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    goto :goto_0
.end method

.method public static a(Landroid/widget/TextView;I)V
    .locals 4

    .prologue
    const/16 v0, 0xff

    .line 473
    if-nez p0, :cond_1

    .line 489
    :cond_0
    :goto_0
    return-void

    .line 477
    :cond_1
    if-gez p1, :cond_3

    .line 478
    const/4 v1, 0x0

    .line 480
    :goto_1
    if-le v1, v0, :cond_2

    .line 483
    :goto_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 484
    if-eqz v1, :cond_0

    .line 485
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    .line 486
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    invoke-static {v0, v2, v3, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    .line 487
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_2

    :cond_3
    move v1, p1

    goto :goto_1
.end method

.method public static a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V
    .locals 4

    .prologue
    .line 458
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 462
    :cond_0
    :goto_0
    return-void

    .line 461
    :cond_1
    iget v0, p1, Lkik/android/util/cv$d;->a:F

    iget v1, p1, Lkik/android/util/cv$d;->b:F

    iget v2, p1, Lkik/android/util/cv$d;->c:F

    iget v3, p1, Lkik/android/util/cv$d;->d:I

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 804
    if-eqz p1, :cond_0

    .line 805
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 807
    :cond_0
    return-void
.end method

.method public static a(Landroid/view/View;Landroid/graphics/Bitmap;)Z
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 635
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    :cond_0
    move v0, v1

    .line 671
    :goto_0
    return v0

    .line 640
    :cond_1
    invoke-static {p1}, Lkik/android/util/r;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 641
    if-nez v4, :cond_2

    move v0, v1

    .line 642
    goto :goto_0

    .line 646
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 647
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 648
    if-nez v3, :cond_3

    .line 649
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/16 v5, 0x32

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 651
    :cond_3
    if-nez v0, :cond_4

    .line 652
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    const/16 v5, 0xa

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 656
    :cond_4
    invoke-static {v4, v3, v0, v6}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 661
    if-nez v0, :cond_5

    move v0, v1

    .line 662
    goto :goto_0

    .line 665
    :cond_5
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 666
    const/16 v0, 0x5a

    invoke-virtual {v3, v0}, Landroid/graphics/drawable/BitmapDrawable;->setAlpha(I)V

    .line 667
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 669
    new-instance v4, Landroid/graphics/drawable/LayerDrawable;

    new-array v5, v6, [Landroid/graphics/drawable/Drawable;

    aput-object v0, v5, v1

    aput-object v3, v5, v2

    invoke-direct {v4, v5}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 670
    invoke-virtual {p0, v4}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    move v0, v2

    .line 671
    goto :goto_0
.end method

.method public static varargs a([Landroid/view/View;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 126
    move v1, v0

    .line 130
    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_0

    aget-object v2, p0, v1

    .line 131
    if-eqz v2, :cond_1

    .line 132
    invoke-virtual {v2}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result v2

    if-nez v2, :cond_1

    .line 137
    const/4 v0, 0x1

    .line 141
    :cond_0
    return v0

    .line 130
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static b(Landroid/view/View;)Lkik/android/util/cv$b;
    .locals 2

    .prologue
    .line 197
    new-instance v0, Lkik/android/util/cv$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkik/android/util/cv$b;-><init>(Landroid/view/View;B)V

    return-object v0
.end method

.method public static b(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 534
    if-nez p0, :cond_1

    .line 544
    :cond_0
    :goto_0
    return-void

    .line 537
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 538
    if-eqz v0, :cond_0

    .line 541
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 543
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public static b(Landroid/view/View;Landroid/view/View;)V
    .locals 7

    .prologue
    const/16 v6, 0xc

    const/4 v5, 0x3

    const/4 v4, 0x2

    .line 596
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 623
    :cond_0
    :goto_0
    return-void

    .line 599
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_2

    .line 600
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 601
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to set relative layour params on a view not in a relative layout!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 605
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 606
    const/16 v1, 0x8

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 609
    invoke-virtual {v0}, Landroid/widget/RelativeLayout$LayoutParams;->getRules()[I

    move-result-object v1

    .line 610
    invoke-static {v1, v4}, Lkik/android/util/cv;->a([II)I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v2, v3, :cond_3

    .line 612
    invoke-static {v0, v4}, Lkik/android/util/cv;->a(Landroid/widget/RelativeLayout$LayoutParams;I)V

    .line 614
    :cond_3
    invoke-static {v1, v5}, Lkik/android/util/cv;->a([II)I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v2, v3, :cond_4

    .line 616
    invoke-static {v0, v5}, Lkik/android/util/cv;->a(Landroid/widget/RelativeLayout$LayoutParams;I)V

    .line 618
    :cond_4
    invoke-static {v1, v6}, Lkik/android/util/cv;->a([II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_5

    .line 620
    invoke-static {v0, v6}, Lkik/android/util/cv;->a(Landroid/widget/RelativeLayout$LayoutParams;I)V

    .line 622
    :cond_5
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public static b(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 447
    if-nez p0, :cond_1

    .line 454
    :cond_0
    :goto_0
    return-void

    .line 450
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 451
    if-eqz v0, :cond_0

    .line 452
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public static b(Landroid/widget/TextView;I)V
    .locals 4

    .prologue
    const/16 v0, 0xff

    .line 500
    if-nez p0, :cond_1

    .line 516
    :cond_0
    :goto_0
    return-void

    .line 504
    :cond_1
    if-gez p1, :cond_3

    .line 505
    const/4 v1, 0x0

    .line 507
    :goto_1
    if-le v1, v0, :cond_2

    .line 510
    :goto_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getLinkTextColors()Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 511
    if-eqz v1, :cond_0

    .line 512
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    .line 513
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    invoke-static {v0, v2, v3, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    .line 514
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setLinkTextColor(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_2

    :cond_3
    move v1, p1

    goto :goto_1
.end method

.method public static varargs b([Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 146
    if-nez p0, :cond_1

    .line 155
    :cond_0
    return-void

    .line 149
    :cond_1
    array-length v2, p0

    move v0, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 150
    if-eqz v3, :cond_2

    .line 151
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 149
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static varargs c([Landroid/view/View;)V
    .locals 4

    .prologue
    .line 159
    array-length v1, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v2, p0, v0

    .line 163
    if-eqz v2, :cond_0

    .line 164
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 162
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 168
    :cond_1
    return-void
.end method

.method public static c(Landroid/view/View;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 227
    if-nez p0, :cond_1

    .line 230
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static varargs d([Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 177
    move v0, v1

    :goto_0
    if-gtz v0, :cond_1

    aget-object v2, p0, v1

    .line 181
    if-eqz v2, :cond_0

    .line 182
    invoke-virtual {v2, v1}, Landroid/view/View;->setPressed(Z)V

    .line 186
    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 180
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 188
    :cond_1
    return-void
.end method

.method public static d(Landroid/view/View;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 240
    if-nez p0, :cond_1

    .line 243
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static varargs e([Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 207
    if-nez p0, :cond_1

    .line 218
    :cond_0
    return-void

    .line 210
    :cond_1
    array-length v2, p0

    move v0, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 211
    if-eqz v3, :cond_2

    .line 212
    invoke-virtual {v3, v1}, Landroid/view/View;->setPressed(Z)V

    .line 216
    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 210
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
