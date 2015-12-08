.class public Lkik/android/scan/fragment/ScanFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/scan/fragment/ScanFragment$a;,
        Lkik/android/scan/fragment/ScanFragment$c;,
        Lkik/android/scan/fragment/ScanFragment$b;
    }
.end annotation


# instance fields
.field private final A:Ljava/util/List;

.field private final B:Lcom/kik/g/i;

.field private C:Lkik/android/c/b$b;

.field private D:Lkik/android/c/b$c;

.field protected _animationContainer:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01cf
    .end annotation
.end field

.field protected _callToActionTextView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01ce
    .end annotation
.end field

.field protected _cameraBlurView:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01cb
    .end annotation
.end field

.field protected _cameraErrorCover:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00be
    .end annotation
.end field

.field protected _errorImage:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01d2
    .end annotation
.end field

.field protected _errorRetryButton:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01d5
    .end annotation
.end field

.field protected _errorText:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01d4
    .end annotation
.end field

.field protected _errorTitle:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01d3
    .end annotation
.end field

.field protected _loadingContainer:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01d0
    .end annotation
.end field

.field protected _progress:Landroid/widget/ProgressBar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01d1
    .end annotation
.end field

.field protected _resultImageView:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01cc
    .end annotation
.end field

.field protected _scanContainer:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01ca
    .end annotation
.end field

.field protected _scanFinder:Lkik/android/scan/widget/ScannerViewFinder;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01cd
    .end annotation
.end field

.field a:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field b:Lkik/android/chat/b/d;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field c:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field d:Lkik/android/scan/d;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field e:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field f:Lkik/a/e/i;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private g:Lkik/android/scan/k;

.field private h:Lkik/android/c/b;

.field private i:Lkik/android/widget/a;

.field private j:I

.field private k:Landroid/hardware/Camera;

.field private l:Lkik/android/scan/fragment/ScanFragment$b;

.field private m:Z

.field private n:Z

.field private o:Lkik/android/scan/fragment/ScanFragment$c;

.field private final p:Ljava/lang/Object;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Lkik/android/scan/fragment/ScanFragment$a;

.field private x:Landroid/graphics/Point;

.field private y:I

.field private z:Lkik/android/scan/k$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 90
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 119
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    .line 123
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->m:Z

    .line 125
    iput-boolean v1, p0, Lkik/android/scan/fragment/ScanFragment;->n:Z

    .line 126
    new-instance v0, Lkik/android/scan/fragment/ScanFragment$c;

    invoke-direct {v0, p0}, Lkik/android/scan/fragment/ScanFragment$c;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->o:Lkik/android/scan/fragment/ScanFragment$c;

    .line 127
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->p:Ljava/lang/Object;

    .line 129
    iput-boolean v1, p0, Lkik/android/scan/fragment/ScanFragment;->r:Z

    .line 130
    iput-boolean v1, p0, Lkik/android/scan/fragment/ScanFragment;->s:Z

    .line 131
    new-instance v0, Lkik/android/scan/fragment/ScanFragment$a;

    invoke-direct {v0}, Lkik/android/scan/fragment/ScanFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->t:Lkik/android/scan/fragment/ScanFragment$a;

    .line 132
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->x:Landroid/graphics/Point;

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->A:Ljava/util/List;

    .line 138
    new-instance v0, Lkik/android/scan/fragment/a;

    invoke-direct {v0, p0}, Lkik/android/scan/fragment/a;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->B:Lcom/kik/g/i;

    .line 167
    new-instance v0, Lkik/android/scan/fragment/m;

    invoke-direct {v0, p0}, Lkik/android/scan/fragment/m;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->C:Lkik/android/c/b$b;

    .line 196
    new-instance v0, Lkik/android/scan/fragment/n;

    invoke-direct {v0, p0}, Lkik/android/scan/fragment/n;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->D:Lkik/android/c/b$c;

    .line 1044
    return-void
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;I)I
    .locals 0

    .prologue
    .line 90
    iput p1, p0, Lkik/android/scan/fragment/ScanFragment;->y:I

    return p1
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/Scanner$ScanResult;)Landroid/graphics/Point;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 90
    if-nez p1, :cond_0

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v0

    iget v3, p1, Lcom/kik/scan/Scanner$ScanResult;->y:I

    mul-int/2addr v0, v3

    int-to-float v0, v0

    const/high16 v3, 0x43f00000    # 480.0f

    div-float/2addr v0, v3

    sub-float/2addr v2, v0

    iget v0, p1, Lcom/kik/scan/Scanner$ScanResult;->x:I

    int-to-float v0, v0

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x44200000    # 640.0f

    div-float v1, v0, v1

    new-instance v0, Landroid/graphics/Point;

    float-to-int v2, v2

    float-to-int v1, v1

    invoke-direct {v0, v2, v1}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_0
.end method

.method private a(Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 979
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->A:Ljava/util/List;

    monitor-enter v1

    .line 980
    :try_start_0
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->A:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 981
    new-instance v0, Lkik/android/scan/fragment/l;

    invoke-direct {v0, p0, p1}, Lkik/android/scan/fragment/l;-><init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/g/p;)V

    invoke-virtual {p1, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 990
    monitor-exit v1

    .line 991
    return-object p1

    .line 990
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Lkik/a/d/n;Lkik/android/scan/a/c;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 391
    if-nez p1, :cond_0

    .line 392
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null group"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    .line 403
    :goto_0
    return-object v0

    .line 394
    :cond_0
    const-string v0, ""

    .line 395
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lkik/android/scan/a/c;->d()[B

    move-result-object v1

    if-eqz v1, :cond_1

    .line 397
    :try_start_0
    invoke-virtual {p2}, Lkik/android/scan/a/c;->d()[B

    move-result-object v1

    invoke-static {v1}, Lcom/kik/m/e;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 403
    :cond_1
    :goto_1
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->e:Lkik/a/e/l;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lkik/a/d/n;->a()Lkik/a/d/j;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3}, Lkik/a/e/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Lkik/a/d/n;Lkik/android/scan/a/c;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/a/d/n;Lkik/android/scan/a/c;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Lkik/android/scan/k$a;)Lkik/android/scan/k$a;
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lkik/android/scan/fragment/ScanFragment;->z:Lkik/android/scan/k$a;

    return-object p1
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;)Lkik/android/scan/k;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    return-object v0
.end method

.method private a(Landroid/hardware/Camera;)V
    .locals 3

    .prologue
    .line 774
    if-eqz p1, :cond_0

    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 778
    :cond_0
    if-eqz p1, :cond_1

    .line 779
    invoke-virtual {p1}, Landroid/hardware/Camera;->release()V

    .line 781
    :cond_1
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    if-nez v0, :cond_2

    .line 783
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->d()V

    .line 801
    :cond_2
    :goto_0
    return-void

    .line 787
    :cond_3
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->p:Ljava/lang/Object;

    monitor-enter v1

    .line 788
    :try_start_0
    iput-object p1, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    .line 790
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 794
    :try_start_1
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    if-eqz v0, :cond_4

    .line 795
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0, v2}, Lkik/android/c/b;->a(Landroid/hardware/Camera;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 801
    :cond_4
    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 799
    :catch_0
    move-exception v0

    :try_start_3
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->d()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method private a(Lcom/kik/scan/KikCode;)V
    .locals 2

    .prologue
    .line 420
    const-string v0, ""

    const v1, 0x7f09020a

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/scan/KikCode;Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    return-void
.end method

.method private a(Lcom/kik/scan/KikCode;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 425
    const v0, 0x7f090212

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->_errorRetryButton:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    .line 426
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_errorRetryButton:Landroid/widget/TextView;

    new-instance v1, Lkik/android/scan/fragment/t;

    invoke-direct {v1, p0, p1}, Lkik/android/scan/fragment/t;-><init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 434
    invoke-direct {p0, p2, p3}, Lkik/android/scan/fragment/ScanFragment;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    return-void
.end method

.method private a(Lkik/a/d/k;Lkik/android/scan/a/c;)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 483
    if-nez p1, :cond_0

    .line 547
    :goto_0
    return-void

    .line 486
    :cond_0
    new-instance v1, Lkik/android/scan/fragment/d;

    invoke-direct {v1, p0}, Lkik/android/scan/fragment/d;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    invoke-virtual {p0, v1}, Lkik/android/scan/fragment/ScanFragment;->b(Ljava/lang/Runnable;)V

    .line 499
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->a:Lcom/kik/android/a;

    const-string v2, "Code Resolved"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Group"

    invoke-virtual {p1}, Lkik/a/d/k;->t()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Blocked"

    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "In Roster"

    invoke-virtual {p1}, Lkik/a/d/k;->l()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 505
    iput-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->q:Z

    .line 507
    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 510
    new-instance v1, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/android/scan/a/c;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    .line 527
    :goto_1
    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->b()Lkik/android/chat/activity/k$b;

    move-result-object v0

    .line 529
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    new-instance v2, Lkik/android/scan/fragment/e;

    invoke-direct {v2, p0, v0}, Lkik/android/scan/fragment/e;-><init>(Lkik/android/scan/fragment/ScanFragment;Lkik/android/chat/activity/k$b;)V

    const-wide/16 v4, 0xc8

    invoke-virtual {v1, v2, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 514
    :cond_1
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->d:Lkik/android/scan/d;

    invoke-virtual {v1, p2, p1}, Lkik/android/scan/d;->a(Lkik/android/scan/a/c;Lkik/a/d/k;)V

    .line 515
    invoke-virtual {p1}, Lkik/a/d/k;->p()Z

    move-result v1

    if-nez v1, :cond_4

    .line 516
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lkik/a/d/k;->t()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->c:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    if-eqz p2, :cond_3

    const-string v4, "type"

    const-string v5, "scan"

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "nonce"

    invoke-virtual {p2}, Lkik/android/scan/a/c;->c()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lkik/android/scan/a/c;->a()[B

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v4, "bytes"

    invoke-virtual {p2}, Lkik/android/scan/a/c;->a()[B

    move-result-object v5

    invoke-static {v5}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p2}, Lkik/android/scan/a/c;->b()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    const-string v4, "data"

    invoke-virtual {p2}, Lkik/android/scan/a/c;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {v1, v2, v3}, Lkik/a/e/r;->a(Lkik/a/d/j;Ljava/util/HashMap;)Lcom/kik/g/p;

    .line 518
    :cond_4
    new-instance v1, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    instance-of v2, p1, Lkik/a/d/n;

    if-nez v2, :cond_5

    :goto_2
    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->d(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    goto/16 :goto_1

    :cond_5
    const/4 v0, 0x0

    goto :goto_2
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V
    .locals 2

    .prologue
    .line 90
    iget-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->s:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->s:Z

    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    invoke-virtual {v0}, Lkik/android/scan/k;->d()V

    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    :cond_2
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    new-instance v1, Lkik/android/scan/fragment/g;

    invoke-direct {v1, p0, p1}, Lkik/android/scan/fragment/g;-><init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2, p3}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/scan/KikCode;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lkik/android/scan/fragment/ScanFragment;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Lkik/a/d/k;Lkik/android/scan/a/c;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/a/d/k;Lkik/android/scan/a/c;)V

    return-void
.end method

.method static synthetic a(Lkik/android/scan/fragment/ScanFragment;Lkik/android/scan/a/b;)V
    .locals 4

    .prologue
    .line 90
    if-eqz p1, :cond_0

    instance-of v0, p1, Lkik/android/scan/a/a;

    if-eqz v0, :cond_0

    check-cast p1, Lkik/android/scan/a/a;

    invoke-virtual {p1}, Lkik/android/scan/a/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lkik/android/scan/a/a;->c()Lcom/kik/scan/RemoteKikCode;

    move-result-object v1

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->c:Lkik/a/e/r;

    invoke-interface {v2, v0}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lkik/a/d/k;->g()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {p1}, Lkik/android/scan/a/c;->a(Lkik/android/scan/a/a;)Lkik/android/scan/a/c;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/a/d/k;Lkik/android/scan/a/c;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->c:Lkik/a/e/r;

    invoke-interface {v2, v0}, Lkik/a/e/r;->d(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v2, Lkik/android/scan/fragment/p;

    invoke-direct {v2, p0, p1, v1}, Lkik/android/scan/fragment/p;-><init>(Lkik/android/scan/fragment/ScanFragment;Lkik/android/scan/a/a;Lcom/kik/scan/KikCode;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 458
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    new-instance v1, Lkik/android/scan/fragment/b;

    invoke-direct {v1, p0, p2, p1}, Lkik/android/scan/fragment/b;-><init>(Lkik/android/scan/fragment/ScanFragment;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 468
    return-void
.end method

.method static synthetic b(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/scan/KikCode;)V

    return-void
.end method

.method static synthetic b(Lkik/android/scan/fragment/ScanFragment;)Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->q:Z

    return v0
.end method

.method static synthetic c(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V
    .locals 3

    .prologue
    .line 90
    instance-of v0, p1, Lcom/kik/scan/RemoteKikCode;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/kik/scan/RemoteKikCode;

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->d:Lkik/android/scan/d;

    invoke-virtual {v1, v0}, Lkik/android/scan/d;->a(Lcom/kik/scan/RemoteKikCode;)Lcom/kik/g/p;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/scan/fragment/j;

    invoke-direct {v1, p0, p1}, Lkik/android/scan/fragment/j;-><init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :goto_0
    return-void

    :cond_0
    instance-of v0, p1, Lcom/kik/scan/GroupKikCode;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/kik/scan/GroupKikCode;

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->q:Z

    if-eqz v0, :cond_2

    :cond_1
    invoke-direct {p0, p1}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/scan/KikCode;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/kik/scan/GroupKikCode;->getInviteCode()[B

    move-result-object v0

    invoke-static {v0}, Lkik/a/f/f/i;->a([B)Lkik/a/f/f/i;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->S:Lkik/a/e/f;

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/g/p;)Lcom/kik/g/p;

    if-eqz v0, :cond_3

    new-instance v1, Lkik/android/scan/fragment/q;

    invoke-direct {v1, p0, p1}, Lkik/android/scan/fragment/q;-><init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/GroupKikCode;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    :cond_3
    invoke-direct {p0, p1}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/scan/KikCode;)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/kik/scan/UsernameKikCode;

    if-eqz v0, :cond_8

    check-cast p1, Lcom/kik/scan/UsernameKikCode;

    if-eqz p1, :cond_5

    iget-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->q:Z

    if-eqz v0, :cond_6

    :cond_5
    invoke-direct {p0, p1}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/scan/KikCode;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lcom/kik/scan/UsernameKikCode;->getUsername()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->c:Lkik/a/e/r;

    invoke-interface {v1, v0}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lkik/a/d/k;->g()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {p1}, Lkik/android/scan/a/c;->a(Lcom/kik/scan/UsernameKikCode;)Lkik/android/scan/a/c;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/a/d/k;Lkik/android/scan/a/c;)V

    goto :goto_0

    :cond_7
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->c:Lkik/a/e/r;

    invoke-interface {v1, v0}, Lkik/a/e/r;->d(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/scan/fragment/o;

    invoke-direct {v1, p0, p1}, Lkik/android/scan/fragment/o;-><init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/UsernameKikCode;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    :cond_8
    invoke-direct {p0, p1}, Lkik/android/scan/fragment/ScanFragment;->a(Lcom/kik/scan/KikCode;)V

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/scan/fragment/ScanFragment;)Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->r:Z

    return v0
.end method

.method private d()V
    .locals 1

    .prologue
    .line 472
    new-instance v0, Lkik/android/scan/fragment/c;

    invoke-direct {v0, p0}, Lkik/android/scan/fragment/c;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->b(Ljava/lang/Runnable;)V

    .line 479
    return-void
.end method

.method static synthetic d(Lkik/android/scan/fragment/ScanFragment;)Z
    .locals 1

    .prologue
    .line 90
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->r:Z

    return v0
.end method

.method static synthetic e(Lkik/android/scan/fragment/ScanFragment;)Landroid/graphics/Point;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->x:Landroid/graphics/Point;

    return-object v0
.end method

.method private e()Z
    .locals 1

    .prologue
    .line 658
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_scanContainer:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private f()V
    .locals 8

    .prologue
    .line 663
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 732
    :cond_0
    :goto_0
    return-void

    .line 666
    :cond_1
    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/u;->a(Landroid/app/Activity;)I

    move-result v0

    .line 667
    invoke-static {}, Lkik/android/scan/fragment/ScanFragment;->g()I

    move-result v1

    .line 669
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 673
    invoke-static {v0, v1}, Lkik/android/util/u;->a(II)I

    move-result v0

    .line 674
    iget v1, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    if-eq v1, v0, :cond_0

    .line 678
    iput v0, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    .line 679
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 680
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 682
    :cond_2
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    iget v1, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    invoke-virtual {v0, v1}, Lkik/android/scan/k;->a(I)V

    .line 683
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    iget v1, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 684
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 686
    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v1

    const-wide v4, 0x3ff5555555555555L    # 1.3333333333333333

    invoke-static {v0, v1, v4, v5}, Lkik/android/util/u;->b(Landroid/app/Activity;Ljava/util/List;D)Landroid/hardware/Camera$Size;

    move-result-object v3

    .line 689
    iget v0, v3, Landroid/hardware/Camera$Size;->width:I

    iget v1, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 692
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v0

    .line 693
    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget v4, v3, Landroid/hardware/Camera$Size;->width:I

    int-to-double v4, v4

    iget v6, v3, Landroid/hardware/Camera$Size;->height:I

    int-to-double v6, v6

    div-double/2addr v4, v6

    invoke-static {v1, v0, v4, v5}, Lkik/android/util/u;->a(Landroid/app/Activity;Ljava/util/List;D)Landroid/hardware/Camera$Size;

    move-result-object v0

    .line 695
    if-eqz v0, :cond_3

    .line 696
    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v1, v0}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    .line 704
    :cond_3
    iget v1, v3, Landroid/hardware/Camera$Size;->width:I

    .line 705
    iget v0, v3, Landroid/hardware/Camera$Size;->height:I

    .line 706
    iget v4, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    rem-int/lit16 v4, v4, 0xb4

    if-eqz v4, :cond_4

    .line 707
    iget v1, v3, Landroid/hardware/Camera$Size;->height:I

    .line 708
    iget v0, v3, Landroid/hardware/Camera$Size;->width:I

    .line 711
    :cond_4
    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->_scanContainer:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 712
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v4, v4

    int-to-float v1, v1

    div-float v1, v4, v1

    .line 713
    int-to-float v0, v0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 714
    iget v1, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 715
    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->i:Lkik/android/widget/a;

    if-eqz v3, :cond_5

    .line 716
    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->i:Lkik/android/widget/a;

    invoke-interface {v3, v1, v0}, Lkik/android/widget/a;->a(II)V

    .line 719
    :cond_5
    const/16 v0, 0x9

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 720
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/u;->b(Ljava/util/List;)[I

    move-result-object v0

    .line 721
    if-eqz v0, :cond_6

    .line 722
    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-virtual {v2, v1, v0}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    .line 727
    :cond_6
    :try_start_0
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 729
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->f(Ljava/lang/Throwable;)V

    goto/16 :goto_0
.end method

.method static synthetic f(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->d()V

    return-void
.end method

.method private static g()I
    .locals 2

    .prologue
    .line 763
    invoke-static {}, Lkik/android/util/u;->b()I

    move-result v0

    .line 765
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 766
    invoke-static {}, Lkik/android/util/u;->c()I

    move-result v0

    .line 769
    :cond_0
    return v0
.end method

.method static synthetic g(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 1

    .prologue
    .line 90
    new-instance v0, Lkik/android/scan/fragment/u;

    invoke-direct {v0, p0}, Lkik/android/scan/fragment/u;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method private h()V
    .locals 3

    .prologue
    .line 813
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    .line 814
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_cameraBlurView:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 815
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_cameraBlurView:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 816
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->_cameraBlurView:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 819
    :cond_0
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    .line 820
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->p:Ljava/lang/Object;

    monitor-enter v1

    .line 821
    :try_start_0
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    invoke-virtual {v0}, Lkik/android/c/b;->b()V

    .line 822
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 823
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    invoke-virtual {v0}, Lkik/android/scan/k;->c()V

    .line 824
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 825
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    .line 826
    monitor-exit v1

    .line 828
    :cond_1
    return-void

    .line 826
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic h(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 1

    .prologue
    .line 90
    new-instance v0, Lkik/android/scan/fragment/s;

    invoke-direct {v0, p0}, Lkik/android/scan/fragment/s;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic i(Lkik/android/scan/fragment/ScanFragment;)I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lkik/android/scan/fragment/ScanFragment;->y:I

    return v0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 887
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    if-eqz v0, :cond_0

    .line 888
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    invoke-virtual {v0}, Lkik/android/scan/k;->d()V

    .line 890
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    .line 891
    return-void
.end method

.method static synthetic j(Lkik/android/scan/fragment/ScanFragment;)Lkik/android/scan/fragment/ScanFragment$b;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->l:Lkik/android/scan/fragment/ScanFragment$b;

    return-object v0
.end method

.method private j()V
    .locals 3

    .prologue
    .line 910
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_resultImageView:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 911
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_resultImageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 912
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->_resultImageView:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 914
    :cond_0
    return-void
.end method

.method private k()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 924
    iget-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->n:Z

    if-nez v0, :cond_1

    .line 934
    :cond_0
    :goto_0
    return-void

    .line 927
    :cond_1
    iget-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->s:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 928
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->o:Lkik/android/scan/fragment/ScanFragment$c;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lkik/android/scan/fragment/ScanFragment$c;->removeMessages(I)V

    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->o:Lkik/android/scan/fragment/ScanFragment$c;

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v4, v2, v3}, Lkik/android/scan/fragment/ScanFragment$c;->sendEmptyMessageDelayed(IJ)Z

    .line 929
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->a:Lcom/kik/android/a;

    if-eqz v0, :cond_0

    .line 930
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->a:Lcom/kik/android/a;

    const-string v1, "Scan Started"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 931
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->a:Lcom/kik/android/a;

    const-string v1, "Scan Started"

    invoke-virtual {v0, v1, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;Z)Lcom/kik/android/a;

    goto :goto_0
.end method

.method static synthetic k(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->l:Lkik/android/scan/fragment/ScanFragment$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->l:Lkik/android/scan/fragment/ScanFragment$b;

    invoke-interface {v0}, Lkik/android/scan/fragment/ScanFragment$b;->a()V

    :cond_0
    return-void
.end method

.method private l()V
    .locals 3

    .prologue
    .line 959
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->A:Ljava/util/List;

    monitor-enter v1

    .line 960
    :try_start_0
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    .line 961
    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    goto :goto_0

    .line 964
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 963
    :cond_0
    :try_start_1
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 964
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method static synthetic l(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->k()V

    return-void
.end method

.method static synthetic m(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->j()V

    return-void
.end method

.method static synthetic n(Lkik/android/scan/fragment/ScanFragment;)Ljava/util/List;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->A:Ljava/util/List;

    return-object v0
.end method

.method static synthetic o(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-direct {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Landroid/hardware/Camera;)V

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lkik/android/scan/fragment/ScanFragment;->g()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->d()V

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lkik/android/util/u;->b(I)Landroid/hardware/Camera;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Landroid/hardware/Camera;)V

    goto :goto_0
.end method

.method static synthetic p(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    invoke-virtual {v0}, Lkik/android/scan/k;->e()V

    :cond_0
    return-void
.end method

.method static synthetic q(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->h()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 807
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->o:Lkik/android/scan/fragment/ScanFragment$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/scan/fragment/ScanFragment$c;->removeMessages(I)V

    .line 808
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->o:Lkik/android/scan/fragment/ScanFragment$c;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lkik/android/scan/fragment/ScanFragment$c;->sendEmptyMessage(I)Z

    .line 809
    return-void
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 207
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lcom/kik/g/f;)V

    .line 208
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    if-eqz v0, :cond_0

    .line 209
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    invoke-virtual {v0}, Lkik/android/scan/k;->b()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->B:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 211
    :cond_0
    return-void
.end method

.method public final a(Lkik/android/scan/fragment/ScanFragment$b;)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lkik/android/scan/fragment/ScanFragment;->l:Lkik/android/scan/fragment/ScanFragment$b;

    .line 251
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 856
    iput-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->s:Z

    .line 857
    iput-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->q:Z

    .line 858
    iput-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->r:Z

    .line 859
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/scan/fragment/ScanFragment;->j:I

    .line 860
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->z:Lkik/android/scan/k$a;

    .line 861
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->l:Lkik/android/scan/fragment/ScanFragment$b;

    if-eqz v0, :cond_0

    .line 862
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->l:Lkik/android/scan/fragment/ScanFragment$b;

    invoke-interface {v0}, Lkik/android/scan/fragment/ScanFragment$b;->b()V

    .line 866
    :cond_0
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->l()V

    .line 867
    new-instance v0, Lkik/android/scan/fragment/k;

    invoke-direct {v0, p0}, Lkik/android/scan/fragment/k;-><init>(Lkik/android/scan/fragment/ScanFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/scan/fragment/ScanFragment;->b(Ljava/lang/Runnable;)V

    .line 877
    return-void
.end method

.method public final b(Z)V
    .locals 1

    .prologue
    .line 840
    iput-boolean p1, p0, Lkik/android/scan/fragment/ScanFragment;->n:Z

    .line 841
    iget-boolean v0, p0, Lkik/android/scan/fragment/ScanFragment;->n:Z

    if-eqz v0, :cond_1

    .line 842
    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->isResumed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 845
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->k()V

    .line 852
    :cond_0
    :goto_0
    return-void

    .line 849
    :cond_1
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->i()V

    .line 850
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->l()V

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 945
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->a:Lcom/kik/android/a;

    if-eqz v0, :cond_0

    .line 946
    const-string v0, "Cancel"

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->a:Lcom/kik/android/a;

    invoke-static {v0, v1}, Lkik/android/util/by;->a(Ljava/lang/String;Lcom/kik/android/a;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 948
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 552
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 554
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->f()V

    .line 557
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    if-eqz v0, :cond_0

    .line 558
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Lkik/android/c/b;->a(Landroid/hardware/Camera;)V

    .line 560
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 216
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 217
    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/scan/fragment/ScanFragment;)V

    .line 218
    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 219
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->t:Lkik/android/scan/fragment/ScanFragment$a;

    invoke-virtual {v1, v0}, Lkik/android/scan/fragment/ScanFragment$a;->a(Landroid/os/Bundle;)V

    .line 220
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, -0x1

    .line 225
    const v0, 0x7f03008f

    invoke-virtual {p1, v0, p2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 226
    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 228
    const/16 v1, 0x10

    invoke-static {v1}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 229
    new-instance v1, Lkik/android/scan/ICSScanPreviewView;

    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/android/scan/ICSScanPreviewView;-><init>(Landroid/content/Context;)V

    .line 230
    iput-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->i:Lkik/android/widget/a;

    .line 231
    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->_scanContainer:Landroid/view/ViewGroup;

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 232
    new-instance v2, Lkik/android/c/e;

    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->D:Lkik/android/c/b$c;

    invoke-direct {v2, v1, v3}, Lkik/android/c/e;-><init>(Landroid/view/TextureView;Lkik/android/c/b$c;)V

    iput-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    .line 241
    :goto_0
    new-instance v1, Lkik/android/scan/k;

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->_cameraBlurView:Landroid/widget/ImageView;

    invoke-direct {v1, v2, v3}, Lkik/android/scan/k;-><init>(Lkik/android/c/b;Landroid/widget/ImageView;)V

    iput-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->g:Lkik/android/scan/k;

    .line 242
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->C:Lkik/android/c/b$b;

    invoke-virtual {v1, v2}, Lkik/android/c/b;->a(Lkik/android/c/b$b;)Lkik/android/c/b;

    .line 243
    const/4 v1, 0x5

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->_loadingContainer:Landroid/view/View;

    aput-object v2, v1, v5

    const/4 v2, 0x1

    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->_errorImage:Landroid/view/View;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->_errorRetryButton:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->_errorText:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->_errorTitle:Landroid/widget/TextView;

    aput-object v3, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 245
    return-object v0

    .line 235
    :cond_0
    new-instance v1, Lkik/android/scan/ScanPreviewView;

    invoke-virtual {p0}, Lkik/android/scan/fragment/ScanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/android/scan/ScanPreviewView;-><init>(Landroid/content/Context;)V

    .line 236
    iput-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->i:Lkik/android/widget/a;

    .line 237
    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->_scanContainer:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 238
    new-instance v2, Lkik/android/c/c;

    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->o:Lkik/android/scan/fragment/ScanFragment$c;

    iget-object v4, p0, Lkik/android/scan/fragment/ScanFragment;->D:Lkik/android/c/b$c;

    invoke-direct {v2, v1, v3, v4}, Lkik/android/c/c;-><init>(Landroid/view/SurfaceView;Landroid/os/Handler;Lkik/android/c/b$c;)V

    iput-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->h:Lkik/android/c/b;

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 953
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroy()V

    .line 954
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->l()V

    .line 955
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 833
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onPause()V

    .line 834
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->i()V

    .line 835
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->h()V

    .line 836
    return-void
.end method

.method public onResume()V
    .locals 5

    .prologue
    .line 896
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onResume()V

    .line 897
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->k()V

    .line 898
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->z:Lkik/android/scan/k$a;

    if-eqz v0, :cond_0

    .line 899
    iget-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->z:Lkik/android/scan/k$a;

    iget-object v0, v0, Lkik/android/scan/k$a;->a:[B

    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->z:Lkik/android/scan/k$a;

    iget v1, v1, Lkik/android/scan/k$a;->c:I

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->z:Lkik/android/scan/k$a;

    iget v2, v2, Lkik/android/scan/k$a;->d:I

    iget-object v3, p0, Lkik/android/scan/fragment/ScanFragment;->z:Lkik/android/scan/k$a;

    iget v3, v3, Lkik/android/scan/k$a;->e:I

    iget-object v4, p0, Lkik/android/scan/fragment/ScanFragment;->z:Lkik/android/scan/k$a;

    iget v4, v4, Lkik/android/scan/k$a;->f:I

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/util/u;->a([BIIII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 900
    iget-object v1, p0, Lkik/android/scan/fragment/ScanFragment;->_resultImageView:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 901
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/scan/fragment/ScanFragment;->_resultImageView:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 906
    :goto_0
    return-void

    .line 904
    :cond_0
    invoke-direct {p0}, Lkik/android/scan/fragment/ScanFragment;->j()V

    goto :goto_0
.end method
