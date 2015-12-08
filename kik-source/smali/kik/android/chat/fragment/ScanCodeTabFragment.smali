.class public Lkik/android/chat/fragment/ScanCodeTabFragment;
.super Lkik/android/chat/fragment/KikScopedDialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/ScanCodeTabFragment$a;,
        Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;,
        Lkik/android/chat/fragment/ScanCodeTabFragment$c;,
        Lkik/android/chat/fragment/ScanCodeTabFragment$b;
    }
.end annotation


# instance fields
.field _backButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e001d
    .end annotation
.end field

.field _backButtonImage:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0077
    .end annotation
.end field

.field _cameraIcon:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0139
    .end annotation
.end field

.field _codeIcon:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e013a
    .end annotation
.end field

.field _scanToggle:Landroid/widget/SeekBar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01d6
    .end annotation
.end field

.field _toggleHolder:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0138
    .end annotation
.end field

.field _topBar:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0089
    .end annotation
.end field

.field _viewPager:Lkik/android/widget/VelocityControlledViewPager;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0137
    .end annotation
.end field

.field a:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field b:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private c:I

.field private d:I

.field private e:Landroid/view/View;

.field private f:Lkik/android/chat/fragment/ScanCodeTabFragment$a;

.field private g:Landroid/support/v4/app/FragmentManager;

.field private h:Lkik/android/scan/fragment/ScanFragment;

.field private i:Lkik/android/chat/fragment/KikCodeFragment;

.field private j:Z

.field private k:Landroid/support/v4/app/FragmentPagerAdapter;

.field private l:Lkik/android/chat/fragment/ScanCodeTabFragment$b;

.field private m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

.field private final n:Lkik/android/scan/fragment/ScanFragment$b;

.field private final o:Lkik/android/chat/fragment/KikCodeFragment$b;

.field private final p:Lcom/kik/g/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 44
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;-><init>()V

    .line 74
    invoke-static {}, Lkik/android/util/u;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    iput v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->c:I

    .line 75
    invoke-static {}, Lkik/android/util/u;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->d:I

    .line 78
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->f:Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    .line 98
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    .line 100
    new-instance v0, Lkik/android/chat/fragment/qm;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/qm;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->n:Lkik/android/scan/fragment/ScanFragment$b;

    .line 125
    new-instance v0, Lkik/android/chat/fragment/qo;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/qo;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->o:Lkik/android/chat/fragment/KikCodeFragment$b;

    .line 133
    new-instance v0, Lkik/android/chat/fragment/qp;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/qp;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->p:Lcom/kik/g/i;

    .line 565
    return-void

    .line 74
    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private static a(Landroid/support/v4/app/FragmentManager;)V
    .locals 3

    .prologue
    .line 369
    if-nez p0, :cond_1

    .line 389
    :cond_0
    :goto_0
    return-void

    .line 373
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    .line 374
    if-eqz v0, :cond_0

    .line 375
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 379
    instance-of v2, v0, Lkik/android/scan/fragment/ScanFragment;

    if-nez v2, :cond_3

    instance-of v2, v0, Lkik/android/chat/fragment/KikCodeFragment;

    if-eqz v2, :cond_2

    .line 380
    :cond_3
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 385
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->d(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/ScanCodeTabFragment;)V
    .locals 1

    .prologue
    .line 44
    new-instance v0, Lkik/android/chat/fragment/qu;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/qu;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/ScanCodeTabFragment;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->g()V

    return-void
.end method

.method static synthetic c(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment$b;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->l:Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/ScanCodeTabFragment;)I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->d:I

    return v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/chat/fragment/KikCodeFragment;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    return-object v0
.end method

.method static synthetic f(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment$a;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->f:Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    return-object v0
.end method

.method static synthetic f()Z
    .locals 1

    .prologue
    .line 44
    invoke-static {}, Lkik/android/util/u;->d()Z

    move-result v0

    return v0
.end method

.method private g()V
    .locals 1

    .prologue
    .line 405
    new-instance v0, Lkik/android/chat/fragment/qv;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/qv;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->b(Ljava/lang/Runnable;)V

    .line 413
    return-void
.end method

.method static synthetic g(Lkik/android/chat/fragment/ScanCodeTabFragment;)Z
    .locals 1

    .prologue
    .line 44
    iget-boolean v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->j:Z

    return v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/scan/fragment/ScanFragment;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    return-object v0
.end method

.method static synthetic i(Lkik/android/chat/fragment/ScanCodeTabFragment;)V
    .locals 2

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_scanToggle:Landroid/widget/SeekBar;

    iget v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    const-string v0, "Toggle"

    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->a:Lcom/kik/android/a;

    invoke-static {v0, v1}, Lkik/android/util/by;->a(Ljava/lang/String;Lcom/kik/android/a;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;->a:Z

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    iget v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->c:I

    invoke-virtual {v0, v1}, Lkik/android/widget/VelocityControlledViewPager;->setCurrentItem(I)V

    return-void
.end method


# virtual methods
.method public final M()Z
    .locals 1

    .prologue
    .line 468
    const/4 v0, 0x1

    return v0
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 354
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lcom/kik/g/f;)V

    .line 355
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    invoke-virtual {v0}, Lkik/android/widget/VelocityControlledViewPager;->a()Lcom/kik/g/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 356
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    invoke-virtual {v0}, Lkik/android/widget/VelocityControlledViewPager;->a()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->p:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 358
    :cond_0
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/ScanCodeTabFragment$b;)V
    .locals 0

    .prologue
    .line 348
    iput-object p1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->l:Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    .line 349
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 488
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCodeFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 498
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    invoke-virtual {v0}, Lkik/android/scan/fragment/ScanFragment;->b()V

    .line 499
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->g()V

    .line 500
    invoke-virtual {p0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->G()V

    .line 501
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    if-eqz v0, :cond_1

    .line 502
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCodeFragment;->d()V

    .line 504
    :cond_1
    iput-boolean v2, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->j:Z

    .line 505
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_scanToggle:Landroid/widget/SeekBar;

    iget v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 506
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    if-eqz v0, :cond_2

    .line 507
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    iput-boolean v2, v0, Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;->b:Z

    .line 508
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    iput-boolean v2, v0, Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;->a:Z

    .line 510
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    invoke-virtual {v0}, Lkik/android/widget/VelocityControlledViewPager;->getCurrentItem()I

    move-result v0

    iget v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->c:I

    if-ne v0, v1, :cond_3

    .line 513
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    iget v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->c:I

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;->onPageSelected(I)V

    .line 518
    :goto_0
    return-void

    .line 516
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    iget v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->c:I

    invoke-virtual {v0, v1}, Lkik/android/widget/VelocityControlledViewPager;->setCurrentItem(I)V

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 524
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    if-eqz v0, :cond_0

    .line 525
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->b(Z)V

    .line 527
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 531
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_scanToggle:Landroid/widget/SeekBar;

    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_scanToggle:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getMax()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 532
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;->a:Z

    .line 533
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    iget v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->d:I

    invoke-virtual {v0, v1}, Lkik/android/widget/VelocityControlledViewPager;->setCurrentItem(I)V

    .line 534
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 543
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    invoke-virtual {v0}, Lkik/android/scan/fragment/ScanFragment;->a()V

    .line 544
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 231
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 232
    invoke-virtual {p0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    .line 233
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 238
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment;->c(I)V

    .line 239
    invoke-virtual {p0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 240
    iget-object v3, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->f:Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-virtual {v3, v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Landroid/os/Bundle;)V

    .line 241
    const v0, 0x7f03005d

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->e:Landroid/view/View;

    .line 243
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->e:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    new-instance v3, Landroid/view/View;

    invoke-virtual {p0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 253
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->e:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 255
    invoke-virtual {p0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->g:Landroid/support/v4/app/FragmentManager;

    .line 257
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_backButton:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 258
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_topBar:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 260
    invoke-virtual {p0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->N()I

    move-result v0

    .line 261
    if-lez v0, :cond_1

    .line 262
    iget-object v3, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_topBar:Landroid/view/View;

    invoke-static {v3}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Lkik/android/util/cv$b;->a(I)Lkik/android/util/cv$b;

    .line 264
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_backButtonImage:Landroid/widget/ImageView;

    const v3, 0x7f070011

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 266
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_scanToggle:Landroid/widget/SeekBar;

    new-instance v3, Lkik/android/chat/fragment/qq;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/qq;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    invoke-virtual {v0, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 294
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_cameraIcon:Landroid/widget/ImageView;

    new-instance v3, Lkik/android/chat/fragment/qr;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/qr;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 302
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_codeIcon:Landroid/widget/ImageView;

    new-instance v3, Lkik/android/chat/fragment/qs;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/qs;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 310
    new-instance v0, Lkik/android/chat/fragment/KikCodeFragment;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikCodeFragment;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    .line 311
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->f:Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 312
    new-instance v0, Lkik/android/chat/fragment/KikCodeFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikCodeFragment$a;-><init>()V

    .line 313
    iget-object v3, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->f:Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-virtual {v3}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/KikCodeFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikCodeFragment$a;

    .line 314
    iget-object v3, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCodeFragment$a;->i()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v3, v0}, Lkik/android/chat/fragment/KikCodeFragment;->setArguments(Landroid/os/Bundle;)V

    .line 316
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v3, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->o:Lkik/android/chat/fragment/KikCodeFragment$b;

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment$b;)V

    .line 318
    new-instance v0, Lkik/android/scan/fragment/ScanFragment;

    invoke-direct {v0}, Lkik/android/scan/fragment/ScanFragment;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    .line 319
    new-instance v3, Lkik/android/scan/fragment/ScanFragment$a;

    invoke-direct {v3}, Lkik/android/scan/fragment/ScanFragment$a;-><init>()V

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->f:Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a()Z

    move-result v0

    if-nez v0, :cond_6

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Lkik/android/scan/fragment/ScanFragment$a;->a(Z)Lkik/android/scan/fragment/ScanFragment$a;

    move-result-object v0

    .line 320
    iget-object v3, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    invoke-virtual {v0}, Lkik/android/scan/fragment/ScanFragment$a;->i()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v3, v0}, Lkik/android/scan/fragment/ScanFragment;->setArguments(Landroid/os/Bundle;)V

    .line 321
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    iget-object v3, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->n:Lkik/android/scan/fragment/ScanFragment$b;

    invoke-virtual {v0, v3}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment$b;)V

    .line 323
    invoke-static {}, Lkik/android/util/u;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 325
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_toggleHolder:Landroid/widget/LinearLayout;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 327
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->g:Landroid/support/v4/app/FragmentManager;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->a(Landroid/support/v4/app/FragmentManager;)V

    new-instance v0, Lkik/android/chat/fragment/qn;

    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->g:Landroid/support/v4/app/FragmentManager;

    invoke-direct {v0, p0, v1}, Lkik/android/chat/fragment/qn;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->k:Landroid/support/v4/app/FragmentPagerAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->k:Landroid/support/v4/app/FragmentPagerAdapter;

    invoke-virtual {v0, v1}, Lkik/android/widget/VelocityControlledViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    invoke-virtual {v0, v1}, Lkik/android/widget/VelocityControlledViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    iget v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->c:I

    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->f:Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    iget v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->d:I

    :cond_4
    iget-object v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    invoke-virtual {v1, v0}, Lkik/android/widget/VelocityControlledViewPager;->setCurrentItem(I)V

    if-nez v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->m:Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$CustomOnPageChangeListener;->onPageSelected(I)V

    .line 328
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->e:Landroid/view/View;

    return-object v0

    :cond_6
    move v0, v2

    .line 319
    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 474
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->c(I)V

    .line 475
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onDestroy()V

    .line 476
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 334
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 337
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_backButton:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/qt;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/qt;-><init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 344
    return-void
.end method

.method public final v()Z
    .locals 2

    .prologue
    .line 549
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    invoke-virtual {v0}, Lkik/android/widget/VelocityControlledViewPager;->getCurrentItem()I

    move-result v0

    iget v1, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->d:I

    if-ne v0, v1, :cond_0

    .line 550
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->i:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCodeFragment;->f()V

    .line 556
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->l:Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    if-eqz v0, :cond_1

    .line 557
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->l:Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    invoke-interface {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 558
    const/4 v0, 0x1

    .line 562
    :goto_1
    return v0

    .line 553
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment;->h:Lkik/android/scan/fragment/ScanFragment;

    invoke-virtual {v0}, Lkik/android/scan/fragment/ScanFragment;->c()V

    goto :goto_0

    .line 562
    :cond_1
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->v()Z

    move-result v0

    goto :goto_1
.end method
