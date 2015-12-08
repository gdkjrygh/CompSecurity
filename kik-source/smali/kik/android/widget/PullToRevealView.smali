.class public Lkik/android/widget/PullToRevealView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/PullToRevealView$b;,
        Lkik/android/widget/PullToRevealView$c;,
        Lkik/android/widget/PullToRevealView$a;
    }
.end annotation


# instance fields
.field private a:Landroid/view/animation/Interpolator;

.field private b:Lkik/android/widget/PullToRevealView$c;

.field private c:I

.field private d:Z

.field private e:I

.field private f:I

.field private g:Landroid/widget/ListView;

.field private h:Landroid/view/View;

.field private i:Lkik/android/widget/PullToRevealView$a;

.field private j:Z

.field private k:Landroid/support/v4/view/GestureDetectorCompat;

.field private l:Z

.field private m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/PullToRevealView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkik/android/widget/PullToRevealView;->setOrientation(I)V

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lkik/android/widget/PullToRevealView;->c:I

    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-direct {v0, p1, p0}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lkik/android/widget/PullToRevealView;->k:Landroid/support/v4/view/GestureDetectorCompat;

    .line 65
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)I
    .locals 9

    .prologue
    const/16 v8, 0x82

    const-wide/16 v4, 0x0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 163
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    .line 164
    iget v1, p0, Lkik/android/widget/PullToRevealView;->e:I

    sub-int v0, v1, v0

    .line 165
    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    if-nez v1, :cond_1

    move-wide v0, v4

    .line 166
    :cond_0
    :goto_0
    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    .line 167
    int-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 169
    return v0

    .line 165
    :cond_1
    int-to-double v6, v0

    int-to-double v0, v1

    div-double v0, v6, v0

    cmpg-double v4, v0, v4

    if-gez v4, :cond_0

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    div-double/2addr v0, v4

    cmpg-double v4, v0, v2

    if-gez v4, :cond_2

    move-wide v0, v2

    :cond_2
    sub-double v0, v2, v0

    mul-double v4, v0, v0

    mul-double/2addr v0, v4

    sub-double v0, v2, v0

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/widget/PullToRevealView;)Landroid/view/View;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->h:Landroid/view/View;

    return-object v0
.end method

.method private final a(IJJLkik/android/widget/PullToRevealView$b;)V
    .locals 8

    .prologue
    .line 399
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->b:Lkik/android/widget/PullToRevealView$c;

    if-eqz v0, :cond_0

    .line 400
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->b:Lkik/android/widget/PullToRevealView$c;

    invoke-virtual {v0}, Lkik/android/widget/PullToRevealView$c;->a()V

    .line 403
    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/PullToRevealView;->getScrollY()I

    move-result v2

    .line 405
    if-eq v2, p1, :cond_2

    .line 406
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->a:Landroid/view/animation/Interpolator;

    if-nez v0, :cond_1

    .line 408
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lkik/android/widget/PullToRevealView;->a:Landroid/view/animation/Interpolator;

    .line 410
    :cond_1
    new-instance v0, Lkik/android/widget/PullToRevealView$c;

    move-object v1, p0

    move v3, p1

    move-wide v4, p2

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/PullToRevealView$c;-><init>(Lkik/android/widget/PullToRevealView;IIJLkik/android/widget/PullToRevealView$b;)V

    iput-object v0, p0, Lkik/android/widget/PullToRevealView;->b:Lkik/android/widget/PullToRevealView$c;

    .line 412
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_3

    .line 413
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->b:Lkik/android/widget/PullToRevealView$c;

    invoke-virtual {p0, v0, p4, p5}, Lkik/android/widget/PullToRevealView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 419
    :cond_2
    :goto_0
    return-void

    .line 416
    :cond_3
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->b:Lkik/android/widget/PullToRevealView$c;

    invoke-virtual {p0, v0}, Lkik/android/widget/PullToRevealView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/widget/PullToRevealView;Lkik/android/widget/PullToRevealView$b;)V
    .locals 7

    .prologue
    .line 24
    const/4 v1, 0x0

    const-wide/16 v2, 0xc8

    const-wide/16 v4, 0x7d0

    move-object v0, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/PullToRevealView;->a(IJJLkik/android/widget/PullToRevealView$b;)V

    return-void
.end method

.method static synthetic b(Lkik/android/widget/PullToRevealView;)Z
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->l:Z

    return v0
.end method

.method static synthetic c(Lkik/android/widget/PullToRevealView;)Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->a:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public static f()I
    .locals 1

    .prologue
    .line 423
    const/16 v0, 0x82

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    return v0
.end method

.method private g()Z
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->g:Landroid/widget/ListView;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method private h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 428
    invoke-virtual {p0}, Lkik/android/widget/PullToRevealView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(F)V
    .locals 1

    .prologue
    .line 336
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    invoke-interface {v0, p1}, Lkik/android/widget/PullToRevealView$a;->a(F)V

    .line 339
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lkik/android/widget/PullToRevealView;->h:Landroid/view/View;

    .line 85
    return-void
.end method

.method public final a(Landroid/widget/ListView;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lkik/android/widget/PullToRevealView;->g:Landroid/widget/ListView;

    .line 80
    return-void
.end method

.method public final a(Lkik/android/widget/PullToRevealView$a;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    .line 75
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 69
    iget-boolean v0, p0, Lkik/android/widget/PullToRevealView;->j:Z

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 97
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->m:Z

    .line 98
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 123
    iget-boolean v0, p0, Lkik/android/widget/PullToRevealView;->j:Z

    if-nez v0, :cond_0

    .line 132
    :goto_0
    return-void

    .line 126
    :cond_0
    iput-boolean v1, p0, Lkik/android/widget/PullToRevealView;->j:Z

    .line 128
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    invoke-interface {v0}, Lkik/android/widget/PullToRevealView$a;->d()V

    .line 131
    :cond_1
    invoke-virtual {p0, v1, v1}, Lkik/android/widget/PullToRevealView;->scrollTo(II)V

    goto :goto_0
.end method

.method public final d()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 136
    iget-boolean v0, p0, Lkik/android/widget/PullToRevealView;->j:Z

    if-nez v0, :cond_0

    .line 153
    :goto_0
    return-void

    .line 140
    :cond_0
    iput-boolean v1, p0, Lkik/android/widget/PullToRevealView;->j:Z

    .line 142
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    if-eqz v0, :cond_1

    .line 143
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    invoke-interface {v0}, Lkik/android/widget/PullToRevealView$a;->d()V

    .line 146
    :cond_1
    const-wide/16 v2, 0xc8

    const-wide/16 v4, 0x0

    new-instance v6, Lkik/android/widget/de;

    invoke-direct {v6, p0}, Lkik/android/widget/de;-><init>(Lkik/android/widget/PullToRevealView;)V

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/PullToRevealView;->a(IJJLkik/android/widget/PullToRevealView$b;)V

    goto :goto_0
.end method

.method public final e()V
    .locals 7

    .prologue
    .line 201
    const/16 v0, 0x82

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    double-to-int v0, v0

    mul-int/lit8 v1, v0, -0x1

    .line 202
    const-wide/16 v2, 0xc8

    const-wide/16 v4, 0x3e8

    new-instance v6, Lkik/android/widget/df;

    invoke-direct {v6, p0}, Lkik/android/widget/df;-><init>(Lkik/android/widget/PullToRevealView;)V

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/PullToRevealView;->a(IJJLkik/android/widget/PullToRevealView$b;)V

    .line 220
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->l:Z

    .line 221
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 434
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 435
    if-eqz p1, :cond_0

    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 437
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/widget/PullToRevealView;->e:I

    .line 438
    iput-boolean v2, p0, Lkik/android/widget/PullToRevealView;->d:Z

    .line 439
    invoke-virtual {p0, v2, v2}, Lkik/android/widget/PullToRevealView;->scrollTo(II)V

    .line 441
    :cond_0
    return-void
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 231
    const/4 v0, 0x0

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 261
    iget-boolean v0, p0, Lkik/android/widget/PullToRevealView;->j:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/PullToRevealView;->getHeight()I

    move-result v0

    neg-int v0, v0

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    cmpg-float v0, p4, v0

    if-gez v0, :cond_0

    .line 262
    invoke-virtual {p0}, Lkik/android/widget/PullToRevealView;->d()V

    .line 264
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const/4 v7, -0x1

    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 344
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v1

    .line 345
    invoke-direct {p0}, Lkik/android/widget/PullToRevealView;->h()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lkik/android/widget/PullToRevealView;->m:Z

    if-eqz v2, :cond_1

    .line 392
    :cond_0
    :goto_0
    return v0

    .line 350
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 351
    iget v3, p0, Lkik/android/widget/PullToRevealView;->e:I

    sub-int/2addr v3, v2

    .line 352
    invoke-direct {p0, p1}, Lkik/android/widget/PullToRevealView;->a(Landroid/view/MotionEvent;)I

    move-result v4

    .line 353
    iget v5, p0, Lkik/android/widget/PullToRevealView;->f:I

    add-int/2addr v4, v5

    .line 355
    invoke-direct {p0}, Lkik/android/widget/PullToRevealView;->g()Z

    move-result v5

    if-nez v5, :cond_0

    .line 359
    if-nez v1, :cond_3

    .line 360
    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->d:Z

    .line 361
    iput v2, p0, Lkik/android/widget/PullToRevealView;->e:I

    .line 362
    invoke-virtual {p0}, Lkik/android/widget/PullToRevealView;->getScrollY()I

    move-result v0

    iput v0, p0, Lkik/android/widget/PullToRevealView;->f:I

    .line 392
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lkik/android/widget/PullToRevealView;->d:Z

    goto :goto_0

    .line 364
    :cond_3
    const/4 v2, 0x2

    if-ne v1, v2, :cond_8

    .line 365
    iget-boolean v1, p0, Lkik/android/widget/PullToRevealView;->l:Z

    if-eqz v1, :cond_5

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lkik/android/widget/PullToRevealView;->c:I

    if-le v1, v2, :cond_5

    .line 366
    iget-object v1, p0, Lkik/android/widget/PullToRevealView;->b:Lkik/android/widget/PullToRevealView$c;

    if-eqz v1, :cond_4

    .line 367
    iget-object v1, p0, Lkik/android/widget/PullToRevealView;->b:Lkik/android/widget/PullToRevealView$c;

    invoke-virtual {v1}, Lkik/android/widget/PullToRevealView$c;->a()V

    .line 368
    const/4 v1, 0x0

    iput-object v1, p0, Lkik/android/widget/PullToRevealView;->b:Lkik/android/widget/PullToRevealView$c;

    .line 370
    :cond_4
    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->l:Z

    .line 371
    iput-boolean v6, p0, Lkik/android/widget/PullToRevealView;->d:Z

    goto :goto_1

    .line 373
    :cond_5
    invoke-direct {p0}, Lkik/android/widget/PullToRevealView;->g()Z

    move-result v1

    if-nez v1, :cond_7

    .line 374
    if-lez v4, :cond_6

    .line 375
    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->d:Z

    .line 379
    :cond_6
    neg-int v0, v3

    iget v1, p0, Lkik/android/widget/PullToRevealView;->c:I

    if-le v0, v1, :cond_2

    iget v0, p0, Lkik/android/widget/PullToRevealView;->e:I

    if-eq v0, v7, :cond_2

    .line 380
    iput-boolean v6, p0, Lkik/android/widget/PullToRevealView;->d:Z

    goto :goto_1

    .line 384
    :cond_7
    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->d:Z

    goto :goto_1

    .line 387
    :cond_8
    if-eq v1, v6, :cond_9

    const/4 v2, 0x3

    if-ne v1, v2, :cond_2

    .line 388
    :cond_9
    iput v7, p0, Lkik/android/widget/PullToRevealView;->e:I

    .line 389
    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->d:Z

    goto :goto_1
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 256
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 249
    const/4 v0, 0x0

    return v0
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 238
    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 243
    const/4 v0, 0x0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .prologue
    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x82

    const/4 v0, 0x1

    const/4 v7, 0x0

    .line 270
    if-eqz p1, :cond_0

    iget-boolean v1, p0, Lkik/android/widget/PullToRevealView;->m:Z

    if-eqz v1, :cond_2

    :cond_0
    move v0, v7

    .line 331
    :cond_1
    :goto_0
    return v0

    .line 273
    :cond_2
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v1

    .line 275
    invoke-direct {p0, p1}, Lkik/android/widget/PullToRevealView;->a(Landroid/view/MotionEvent;)I

    move-result v2

    .line 276
    iget v3, p0, Lkik/android/widget/PullToRevealView;->f:I

    add-int/2addr v2, v3

    .line 278
    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    neg-int v3, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 279
    neg-int v3, v2

    int-to-float v3, v3

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v3, v8

    .line 281
    iget-boolean v8, p0, Lkik/android/widget/PullToRevealView;->j:Z

    if-eqz v8, :cond_3

    .line 285
    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->k:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 286
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 289
    :cond_3
    invoke-direct {p0}, Lkik/android/widget/PullToRevealView;->g()Z

    move-result v8

    if-eqz v8, :cond_4

    move v0, v7

    .line 290
    goto :goto_0

    .line 295
    :cond_4
    iget-boolean v8, p0, Lkik/android/widget/PullToRevealView;->d:Z

    if-eqz v8, :cond_1

    .line 299
    const/4 v8, 0x2

    if-ne v1, v8, :cond_6

    .line 300
    iget-boolean v1, p0, Lkik/android/widget/PullToRevealView;->d:Z

    if-eqz v1, :cond_5

    if-gtz v2, :cond_5

    .line 301
    invoke-virtual {p0, v3}, Lkik/android/widget/PullToRevealView;->a(F)V

    .line 302
    invoke-virtual {p0, v7, v2}, Lkik/android/widget/PullToRevealView;->scrollTo(II)V

    goto :goto_0

    .line 305
    :cond_5
    invoke-virtual {p0, v7, v7}, Lkik/android/widget/PullToRevealView;->scrollTo(II)V

    goto :goto_0

    .line 308
    :cond_6
    if-eq v1, v0, :cond_7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 309
    :cond_7
    iget-boolean v1, p0, Lkik/android/widget/PullToRevealView;->d:Z

    .line 310
    const/4 v2, -0x1

    iput v2, p0, Lkik/android/widget/PullToRevealView;->e:I

    .line 311
    iput-boolean v7, p0, Lkik/android/widget/PullToRevealView;->d:Z

    .line 313
    invoke-direct {p0}, Lkik/android/widget/PullToRevealView;->h()Z

    move-result v2

    if-nez v2, :cond_9

    .line 316
    invoke-virtual {p0, v7, v7}, Lkik/android/widget/PullToRevealView;->scrollTo(II)V

    :cond_8
    :goto_1
    move v0, v7

    .line 327
    goto :goto_0

    .line 320
    :cond_9
    if-eqz v1, :cond_b

    float-to-double v2, v3

    const-wide v8, 0x3fe6666666666666L    # 0.7

    cmpl-double v1, v2, v8

    if-lez v1, :cond_b

    .line 321
    iget-boolean v1, p0, Lkik/android/widget/PullToRevealView;->j:Z

    if-nez v1, :cond_8

    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView;->j:Z

    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->h:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lkik/android/widget/PullToRevealView;->i:Lkik/android/widget/PullToRevealView$a;

    invoke-interface {v0}, Lkik/android/widget/PullToRevealView$a;->c()V

    :cond_a
    invoke-virtual {p0}, Lkik/android/widget/PullToRevealView;->getHeight()I

    move-result v0

    neg-int v1, v0

    const-wide/16 v2, 0x12c

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/PullToRevealView;->a(IJJLkik/android/widget/PullToRevealView$b;)V

    goto :goto_1

    .line 323
    :cond_b
    iget-boolean v0, p0, Lkik/android/widget/PullToRevealView;->j:Z

    if-nez v0, :cond_8

    .line 324
    const-wide/16 v2, 0xc8

    move-object v0, p0

    move v1, v7

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/PullToRevealView;->a(IJJLkik/android/widget/PullToRevealView$b;)V

    goto :goto_1
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    .prologue
    .line 159
    return-void
.end method
