.class public Lcom/facebook/orca/notify/j;
.super Lcom/facebook/orca/notify/a;
.source "InAppMessagingNotificationHandler.java"


# static fields
.field private static final a:I


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/config/a/a;

.field private final d:Lcom/facebook/orca/notify/s;

.field private final e:Lcom/facebook/orca/emoji/z;

.field private final f:Lcom/facebook/orca/threadview/do;

.field private final g:Lcom/facebook/orca/threads/r;

.field private final h:Ljava/util/concurrent/ExecutorService;

.field private final i:Ljava/util/concurrent/ExecutorService;

.field private final j:Lcom/facebook/common/v/f;

.field private final k:Lcom/facebook/i/a/a/f;

.field private final l:Landroid/content/ComponentName;

.field private final m:Lcom/facebook/b/a/b;

.field private n:Landroid/app/Activity;

.field private o:Lcom/facebook/orca/notify/v;

.field private p:Lcom/facebook/common/a/c;

.field private q:Lcom/facebook/orca/notify/ap;

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 55
    sget v0, Lcom/facebook/i;->titlebar:I

    sput v0, Lcom/facebook/orca/notify/j;->a:I

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/config/a/a;Lcom/facebook/orca/emoji/z;Lcom/facebook/orca/threadview/do;Lcom/facebook/orca/threads/r;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Lcom/facebook/common/v/f;Lcom/facebook/i/a/a/f;Landroid/content/ComponentName;Lcom/facebook/b/a/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/config/a/a;",
            "Lcom/facebook/orca/emoji/z;",
            "Lcom/facebook/orca/threadview/do;",
            "Lcom/facebook/orca/threads/r;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/concurrent/ExecutorService;",
            "Lcom/facebook/common/v/f;",
            "Lcom/facebook/i/a/a/f;",
            "Landroid/content/ComponentName;",
            "Lcom/facebook/b/a/b;",
            ")V"
        }
    .end annotation

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/facebook/orca/notify/a;-><init>()V

    .line 94
    iput-object p1, p0, Lcom/facebook/orca/notify/j;->b:Ljavax/inject/a;

    .line 95
    iput-object p2, p0, Lcom/facebook/orca/notify/j;->c:Lcom/facebook/config/a/a;

    .line 96
    iput-object p3, p0, Lcom/facebook/orca/notify/j;->e:Lcom/facebook/orca/emoji/z;

    .line 97
    iput-object p4, p0, Lcom/facebook/orca/notify/j;->f:Lcom/facebook/orca/threadview/do;

    .line 98
    iput-object p5, p0, Lcom/facebook/orca/notify/j;->g:Lcom/facebook/orca/threads/r;

    .line 99
    iput-object p6, p0, Lcom/facebook/orca/notify/j;->h:Ljava/util/concurrent/ExecutorService;

    .line 100
    iput-object p7, p0, Lcom/facebook/orca/notify/j;->i:Ljava/util/concurrent/ExecutorService;

    .line 101
    iput-object p8, p0, Lcom/facebook/orca/notify/j;->j:Lcom/facebook/common/v/f;

    .line 102
    iput-object p9, p0, Lcom/facebook/orca/notify/j;->k:Lcom/facebook/i/a/a/f;

    .line 103
    iput-object p10, p0, Lcom/facebook/orca/notify/j;->l:Landroid/content/ComponentName;

    .line 104
    iput-object p11, p0, Lcom/facebook/orca/notify/j;->m:Lcom/facebook/b/a/b;

    .line 105
    new-instance v0, Lcom/facebook/orca/notify/s;

    invoke-direct {v0, p0}, Lcom/facebook/orca/notify/s;-><init>(Lcom/facebook/orca/notify/j;)V

    iput-object v0, p0, Lcom/facebook/orca/notify/j;->d:Lcom/facebook/orca/notify/s;

    .line 106
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/j;Landroid/app/Activity;)Landroid/app/Activity;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/v;)Lcom/facebook/orca/notify/v;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    return-object p1
.end method

.method private a(Lcom/facebook/widget/OverlayLayout;)Lcom/facebook/orca/notify/v;
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 240
    new-instance v0, Lcom/facebook/orca/notify/v;

    iget-object v1, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    iget-object v2, p0, Lcom/facebook/orca/notify/j;->e:Lcom/facebook/orca/emoji/z;

    iget-object v3, p0, Lcom/facebook/orca/notify/j;->g:Lcom/facebook/orca/threads/r;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/notify/v;-><init>(Landroid/content/Context;Lcom/facebook/orca/emoji/z;Lcom/facebook/orca/threads/r;)V

    .line 242
    new-instance v1, Lcom/facebook/widget/k;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Lcom/facebook/widget/k;-><init>(II)V

    .line 245
    sget v2, Lcom/facebook/orca/notify/j;->a:I

    iput v2, v1, Lcom/facebook/widget/k;->b:I

    .line 246
    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/facebook/widget/k;->a:Z

    .line 247
    const/16 v2, 0x44

    iput v2, v1, Lcom/facebook/widget/k;->c:I

    .line 249
    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/v;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 250
    invoke-virtual {p1, v0}, Lcom/facebook/widget/OverlayLayout;->addView(Landroid/view/View;)V

    .line 252
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v1

    .line 254
    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/notify/v;->measure(II)V

    .line 258
    invoke-virtual {v0}, Lcom/facebook/orca/notify/v;->getMeasuredHeight()I

    move-result v1

    .line 259
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    neg-int v1, v1

    int-to-float v1, v1

    invoke-direct {v2, v4, v4, v1, v4}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 260
    const-wide/16 v3, 0x258

    invoke-virtual {v2, v3, v4}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 261
    invoke-virtual {v2, v5}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 262
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 263
    new-instance v1, Lcom/facebook/orca/notify/p;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/notify/p;-><init>(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/k;)V

    invoke-virtual {v2, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 264
    invoke-virtual {v0, v2}, Lcom/facebook/orca/notify/v;->startAnimation(Landroid/view/animation/Animation;)V

    .line 266
    new-instance v1, Lcom/facebook/orca/notify/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/notify/m;-><init>(Lcom/facebook/orca/notify/j;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/v;->setOnDismissListener(Landroid/view/View$OnClickListener;)V

    .line 272
    new-instance v1, Lcom/facebook/orca/notify/n;

    invoke-direct {v1, p0}, Lcom/facebook/orca/notify/n;-><init>(Lcom/facebook/orca/notify/j;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/v;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    return-object v0
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 364
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 365
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 366
    check-cast v0, Landroid/view/ViewGroup;

    .line 367
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 369
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/j;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/notify/j;->d()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/j;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/j;->a(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/r;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/r;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/j;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/j;->c(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/notify/r;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 338
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    if-nez v0, :cond_0

    .line 361
    :goto_0
    return-void

    .line 342
    :cond_0
    sget-object v0, Lcom/facebook/orca/notify/r;->SLIDE_OUT:Lcom/facebook/orca/notify/r;

    if-ne p1, v0, :cond_2

    .line 343
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/v;->getMeasuredHeight()I

    move-result v0

    .line 344
    new-instance v1, Landroid/view/animation/TranslateAnimation;

    neg-int v0, v0

    int-to-float v0, v0

    invoke-direct {v1, v2, v2, v2, v0}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 345
    const-wide/16 v2, 0x258

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 346
    invoke-virtual {v1, v5}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 347
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 348
    new-instance v0, Lcom/facebook/orca/notify/p;

    invoke-direct {v0, p0, v4}, Lcom/facebook/orca/notify/p;-><init>(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/k;)V

    invoke-virtual {v1, v0}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 349
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/v;->startAnimation(Landroid/view/animation/Animation;)V

    .line 359
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/j;->a(Landroid/view/View;)V

    .line 360
    iput-object v4, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    goto :goto_0

    .line 350
    :cond_2
    sget-object v0, Lcom/facebook/orca/notify/r;->FADE_OUT:Lcom/facebook/orca/notify/r;

    if-ne p1, v0, :cond_1

    .line 351
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 352
    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 353
    invoke-virtual {v0, v5}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 354
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 355
    new-instance v1, Lcom/facebook/orca/notify/p;

    invoke-direct {v1, p0, v4}, Lcom/facebook/orca/notify/p;-><init>(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/k;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 356
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/v;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/ap;)Z
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/j;->d(Lcom/facebook/orca/notify/ap;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/notify/j;Z)Z
    .locals 0

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/facebook/orca/notify/j;->r:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/ap;)Lcom/facebook/orca/notify/ap;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/orca/notify/j;->q:Lcom/facebook/orca/notify/ap;

    return-object p1
.end method

.method static synthetic b(Lcom/facebook/orca/notify/j;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/notify/j;->c()V

    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    if-nez v0, :cond_1

    .line 308
    :cond_0
    :goto_0
    return-void

    .line 286
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/v;->getMessage()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 287
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    .line 289
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    invoke-static {v0}, Lcom/facebook/analytics/i/c;->a(Landroid/content/Context;)Lcom/facebook/analytics/av;

    move-result-object v0

    const-string v2, "beeper_popup"

    invoke-interface {v0, v2}, Lcom/facebook/analytics/av;->a(Ljava/lang/String;)V

    .line 292
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    instance-of v0, v0, Lcom/facebook/orca/activity/c;

    if-eqz v0, :cond_2

    .line 293
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    check-cast v0, Lcom/facebook/orca/activity/c;

    new-instance v2, Lcom/facebook/orca/notify/o;

    invoke-direct {v2, p0, v1}, Lcom/facebook/orca/notify/o;-><init>(Lcom/facebook/orca/notify/j;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/facebook/orca/activity/c;->a(Lcom/facebook/orca/activity/d;)V

    goto :goto_0

    .line 306
    :cond_2
    invoke-direct {p0, v1}, Lcom/facebook/orca/notify/j;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private c(Lcom/facebook/orca/notify/ap;)V
    .locals 2

    .prologue
    .line 142
    new-instance v0, Lcom/facebook/orca/notify/k;

    invoke-direct {v0, p0, p1}, Lcom/facebook/orca/notify/k;-><init>(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/ap;)V

    .line 153
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->j:Lcom/facebook/common/v/f;

    invoke-virtual {v1}, Lcom/facebook/common/v/f;->c()V

    .line 155
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->i:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 156
    if-eqz v0, :cond_0

    .line 157
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->i()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    :cond_0
    :goto_0
    return-void

    .line 161
    :catch_0
    move-exception v0

    goto :goto_0

    .line 159
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/notify/j;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/notify/j;->e()V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/high16 v3, 0x4000000

    .line 311
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_0

    .line 312
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 313
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->l:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 314
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 315
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 317
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    const-class v2, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 319
    const-string v1, "thread_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 320
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 329
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/notify/j;->e()V

    .line 330
    return-void

    .line 322
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    const-class v2, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 324
    const-string v1, "thread_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 325
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 326
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/orca/notify/j;)Lcom/facebook/orca/notify/v;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    return-object v0
.end method

.method private d()V
    .locals 1

    .prologue
    .line 333
    sget-object v0, Lcom/facebook/orca/notify/r;->FADE_OUT:Lcom/facebook/orca/notify/r;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/r;)V

    .line 334
    invoke-direct {p0}, Lcom/facebook/orca/notify/j;->e()V

    .line 335
    return-void
.end method

.method private d(Lcom/facebook/orca/notify/ap;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 192
    iget-boolean v0, p0, Lcom/facebook/orca/notify/j;->r:Z

    if-eqz v0, :cond_0

    .line 193
    iput-object p1, p0, Lcom/facebook/orca/notify/j;->q:Lcom/facebook/orca/notify/ap;

    move v0, v2

    .line 236
    :goto_0
    return v0

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 198
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 200
    instance-of v4, v1, Lcom/facebook/widget/OverlayLayout;

    if-nez v4, :cond_4

    .line 202
    sget v4, Lcom/facebook/orca/notify/j;->a:I

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 203
    if-nez v0, :cond_1

    move v0, v3

    .line 204
    goto :goto_0

    .line 207
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 208
    if-eqz v0, :cond_4

    instance-of v4, v0, Lcom/facebook/widget/OverlayLayout;

    if-eqz v4, :cond_4

    .line 213
    :goto_1
    instance-of v1, v0, Lcom/facebook/widget/OverlayLayout;

    if-nez v1, :cond_2

    move v0, v3

    .line 215
    goto :goto_0

    .line 218
    :cond_2
    check-cast v0, Lcom/facebook/widget/OverlayLayout;

    .line 220
    iget-object v1, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    if-nez v1, :cond_3

    .line 221
    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/widget/OverlayLayout;)Lcom/facebook/orca/notify/v;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    .line 222
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/v;->setMessage(Lcom/facebook/messages/model/threads/Message;)V

    .line 228
    :goto_2
    new-instance v0, Lcom/facebook/common/a/c;

    new-instance v1, Lcom/facebook/orca/notify/l;

    invoke-direct {v1, p0}, Lcom/facebook/orca/notify/l;-><init>(Lcom/facebook/orca/notify/j;)V

    invoke-direct {v0, v1}, Lcom/facebook/common/a/c;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/facebook/orca/notify/j;->p:Lcom/facebook/common/a/c;

    .line 234
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    iget-object v1, p0, Lcom/facebook/orca/notify/j;->p:Lcom/facebook/common/a/c;

    const-wide/16 v3, 0x1388

    invoke-virtual {v0, v1, v3, v4}, Lcom/facebook/orca/notify/v;->postDelayed(Ljava/lang/Runnable;J)Z

    move v0, v2

    .line 236
    goto :goto_0

    .line 224
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->o:Lcom/facebook/orca/notify/v;

    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/v;->setMessage(Lcom/facebook/messages/model/threads/Message;)V

    .line 225
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->p:Lcom/facebook/common/a/c;

    invoke-virtual {v0}, Lcom/facebook/common/a/c;->a()V

    goto :goto_2

    :cond_4
    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic e(Lcom/facebook/orca/notify/j;)Lcom/facebook/orca/notify/ap;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->q:Lcom/facebook/orca/notify/ap;

    return-object v0
.end method

.method private e()V
    .locals 1

    .prologue
    .line 431
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->p:Lcom/facebook/common/a/c;

    if-eqz v0, :cond_0

    .line 432
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->p:Lcom/facebook/common/a/c;

    invoke-virtual {v0}, Lcom/facebook/common/a/c;->a()V

    .line 433
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/notify/j;->p:Lcom/facebook/common/a/c;

    .line 435
    :cond_0
    sget-object v0, Lcom/facebook/orca/notify/r;->NONE:Lcom/facebook/orca/notify/r;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/r;)V

    .line 436
    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/notify/j;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->h:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method


# virtual methods
.method public b()Lcom/facebook/orca/notify/s;
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->d:Lcom/facebook/orca/notify/s;

    return-object v0
.end method

.method protected b(Lcom/facebook/orca/notify/ap;)V
    .locals 3

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    :cond_0
    :goto_0
    return-void

    .line 113
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->m:Lcom/facebook/b/a/b;

    invoke-virtual {v0}, Lcom/facebook/b/a/b;->d()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 126
    const/4 v1, 0x0

    .line 128
    :try_start_0
    invoke-interface {v0}, Lcom/google/common/d/a/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    .line 135
    :goto_1
    if-eqz v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/facebook/orca/notify/j;->k:Lcom/facebook/i/a/a/f;

    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    invoke-interface {v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    :cond_2
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/j;->c(Lcom/facebook/orca/notify/ap;)V

    goto :goto_0

    .line 129
    :catch_0
    move-exception v0

    move v0, v1

    .line 133
    goto :goto_1

    .line 131
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_1
.end method

.method public b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 187
    :goto_0
    return v0

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->f:Lcom/facebook/orca/threadview/do;

    iget-object v2, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/do;->b(Landroid/app/Activity;)Z

    move-result v2

    .line 172
    if-nez v2, :cond_1

    .line 174
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    instance-of v0, v0, Lcom/facebook/orca/threadlist/s;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    check-cast v0, Lcom/facebook/orca/threadlist/s;

    invoke-interface {v0}, Lcom/facebook/orca/threadlist/s;->a()Lcom/facebook/orca/threadlist/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/t;->x()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    .line 176
    goto :goto_0

    .line 180
    :cond_1
    if-eqz v2, :cond_2

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/notify/j;->f:Lcom/facebook/orca/threadview/do;

    iget-object v2, p0, Lcom/facebook/orca/notify/j;->n:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/do;->a(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    .line 182
    invoke-static {v0, p1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 184
    goto :goto_0

    .line 187
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method
