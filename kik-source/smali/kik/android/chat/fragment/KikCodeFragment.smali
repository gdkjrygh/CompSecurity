.class public Lkik/android/chat/fragment/KikCodeFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikCodeFragment$a;,
        Lkik/android/chat/fragment/KikCodeFragment$b;,
        Lkik/android/chat/fragment/KikCodeFragment$c;
    }
.end annotation


# instance fields
.field _codeContainer:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00f9
    .end annotation
.end field

.field _codeInfo:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00fe
    .end annotation
.end field

.field _drawArea:Lkik/android/widget/KikFinderCodeImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00fb
    .end annotation
.end field

.field _errorHolder:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0100
    .end annotation
.end field

.field _fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00fa
    .end annotation
.end field

.field _nameText:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0032
    .end annotation
.end field

.field _profilePic:Lcom/kik/cache/ContactImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0030
    .end annotation
.end field

.field _retryImage:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00fd
    .end annotation
.end field

.field _scanText:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00ff
    .end annotation
.end field

.field _spinner:Landroid/widget/ProgressBar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00fc
    .end annotation
.end field

.field _tellAFriendImage:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00f8
    .end annotation
.end field

.field _usernameText:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0033
    .end annotation
.end field

.field _wipeContainer:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0101
    .end annotation
.end field

.field a:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field b:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lkik/android/chat/b/d;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lkik/android/scan/d;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected i:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private j:Landroid/view/View;

.field private k:Lcom/kik/scan/KikCode;

.field private l:Z

.field private m:I

.field private n:Lcom/kik/g/p;

.field private o:Z

.field private p:Lkik/android/chat/fragment/KikCodeFragment$b;

.field private q:Z

.field private final r:Lkik/android/util/cs;

.field private final s:Lkik/android/chat/fragment/KikCodeFragment$a;

.field private t:Lkik/a/d/n;

.field private final x:Landroid/view/View$OnTouchListener;

.field private final y:Lkik/android/chat/fragment/KikCodeFragment$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 72
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 79
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->l:Z

    .line 80
    iput v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->m:I

    .line 82
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->o:Z

    .line 86
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->q:Z

    .line 112
    new-instance v0, Lkik/android/util/cs;

    invoke-direct {v0}, Lkik/android/util/cs;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->r:Lkik/android/util/cs;

    .line 114
    new-instance v0, Lkik/android/chat/fragment/KikCodeFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikCodeFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->s:Lkik/android/chat/fragment/KikCodeFragment$a;

    .line 117
    new-instance v0, Lkik/android/chat/fragment/id;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/id;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->x:Landroid/view/View$OnTouchListener;

    .line 147
    new-instance v0, Lkik/android/chat/fragment/ir;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ir;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->y:Lkik/android/chat/fragment/KikCodeFragment$c;

    .line 789
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikCodeFragment;Lcom/kik/scan/KikCode;)Lcom/kik/scan/KikCode;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lkik/android/chat/fragment/KikCodeFragment;->k:Lcom/kik/scan/KikCode;

    return-object p1
.end method

.method private a(Lcom/kik/scan/KikCode;)V
    .locals 1

    .prologue
    .line 274
    iput-object p1, p0, Lkik/android/chat/fragment/KikCodeFragment;->k:Lcom/kik/scan/KikCode;

    .line 275
    new-instance v0, Lkik/android/chat/fragment/it;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/it;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment;->b(Ljava/lang/Runnable;)V

    .line 283
    return-void
.end method

.method private a(Lkik/a/d/n;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 347
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_profilePic:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->a:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/KikCodeFragment;->d:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/KikCodeFragment;->f:Lcom/kik/android/a;

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 348
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_profilePic:Lcom/kik/cache/ContactImageView;

    new-instance v1, Lkik/android/chat/fragment/ix;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/ix;-><init>(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 360
    invoke-virtual {p1}, Lkik/a/d/n;->c()Ljava/lang/String;

    move-result-object v0

    .line 362
    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 363
    invoke-virtual {p1}, Lkik/a/d/n;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 364
    invoke-virtual {p1}, Lkik/a/d/n;->J()Ljava/lang/String;

    move-result-object v0

    .line 370
    :cond_0
    :goto_0
    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->_usernameText:Landroid/widget/TextView;

    aput-object v2, v1, v3

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 371
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_nameText:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    .line 372
    return-void

    .line 367
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->d:Lkik/a/e/r;

    invoke-static {v0, v1}, Lkik/android/util/cq;->a(Ljava/util/List;Lkik/a/e/r;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikCodeFragment;Landroid/view/MotionEvent;)V
    .locals 7

    .prologue
    const/high16 v6, 0x40a00000    # 5.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v4, -0x40800000    # -1.0f

    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0}, Lkik/android/widget/KikFinderCodeImageView;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    sub-float v0, v1, v0

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v2}, Lkik/android/widget/KikFinderCodeImageView;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    div-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v0, v5}, Ljava/lang/Math;->min(FF)F

    move-result v0

    neg-float v0, v0

    mul-float/2addr v0, v6

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v2}, Lkik/android/widget/KikFinderCodeImageView;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    mul-float/2addr v0, v4

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v1}, Lkik/android/widget/KikFinderCodeImageView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float v1, v2, v1

    iget-object v3, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v3}, Lkik/android/widget/KikFinderCodeImageView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    div-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    move-result v1

    mul-float/2addr v1, v6

    iget-object v3, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v3}, Lkik/android/widget/KikFinderCodeImageView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    mul-float/2addr v1, v4

    :cond_1
    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v2, v0}, Lkik/android/widget/KikFinderCodeImageView;->setRotationX(F)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0, v1}, Lkik/android/widget/KikFinderCodeImageView;->setRotationY(F)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikCodeFragment;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    if-eqz v0, :cond_0

    new-instance v0, Lkik/android/chat/fragment/iw;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/iw;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment;->b(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    new-instance v1, Lkik/android/chat/fragment/iv;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/iv;-><init>(Lkik/android/chat/fragment/KikCodeFragment;Ljava/lang/String;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/widget/KikFinderCodeImageView;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/a/d/n;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikCodeFragment;Lkik/android/chat/fragment/KikCodeFragment$c;)V
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    new-instance v1, Lkik/android/chat/fragment/in;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/in;-><init>(Lkik/android/chat/fragment/KikCodeFragment;Lkik/android/chat/fragment/KikCodeFragment$c;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikCodeBackgroundImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance v0, Lkik/android/chat/fragment/io;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/io;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikCodeFragment;)Z
    .locals 1

    .prologue
    .line 72
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->l:Z

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/android/util/cs;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->r:Lkik/android/util/cs;

    return-object v0
.end method

.method private b(Lkik/a/d/n;)V
    .locals 3

    .prologue
    .line 376
    const v0, 0x7f090123

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    .line 377
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_scanText:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    .line 378
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0}, Lkik/android/widget/KikFinderCodeImageView;->clearAnimation()V

    .line 380
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/a/d/n;)V

    .line 382
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikCodeFragment;->U()Lcom/kik/g/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->i:Lkik/a/e/l;

    invoke-interface {v1}, Lkik/a/e/l;->e()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/iy;

    invoke-direct {v2, p0, p1}, Lkik/android/chat/fragment/iy;-><init>(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V

    invoke-static {p0, v2}, Lcom/kik/sdkutils/a;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/i;)Lcom/kik/g/i;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 397
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lcom/kik/scan/KikCode;)V

    .line 399
    invoke-virtual {p1}, Lkik/a/d/n;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/f/f/j;->a(Ljava/lang/String;)Lkik/a/f/f/j;

    move-result-object v0

    .line 400
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->S:Lkik/a/e/f;

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 401
    if-eqz v0, :cond_0

    .line 402
    new-instance v1, Lkik/android/chat/fragment/ie;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/ie;-><init>(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 424
    :cond_0
    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikCodeFragment;Lcom/kik/scan/KikCode;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lcom/kik/scan/KikCode;)V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikCodeFragment;->b(Lkik/a/d/n;)V

    return-void
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 2

    .prologue
    const v1, 0x3f7ae148    # 0.98f

    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0, v1}, Lkik/android/widget/KikFinderCodeImageView;->setScaleX(F)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0, v1}, Lkik/android/widget/KikFinderCodeImageView;->setScaleY(F)V

    return-void
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikCodeFragment;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->l:Z

    return v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikCodeFragment;)Z
    .locals 1

    .prologue
    .line 72
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->o:Z

    return v0
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikCodeFragment;)I
    .locals 2

    .prologue
    .line 72
    iget v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->m:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->m:I

    return v0
.end method

.method public static g()I
    .locals 1

    .prologue
    .line 675
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->j()V

    return-void
.end method

.method private h()V
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->h:Lkik/android/scan/d;

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->h:Lkik/android/scan/d;

    invoke-virtual {v0}, Lkik/android/scan/d;->a()V

    .line 234
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->h:Lkik/android/scan/d;

    invoke-virtual {v0}, Lkik/android/scan/d;->b()Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->n:Lcom/kik/g/p;

    .line 236
    :cond_0
    return-void
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->h()V

    return-void
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikCodeFragment;)Lcom/kik/scan/KikCode;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->k:Lcom/kik/scan/KikCode;

    return-object v0
.end method

.method private i()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 252
    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->k()V

    .line 253
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->t:Lkik/a/d/n;

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->t:Lkik/a/d/n;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment;->b(Lkik/a/d/n;)V

    .line 259
    :goto_0
    return-void

    .line 257
    :cond_0
    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lcom/kik/scan/KikCode;)V

    const v0, 0x7f090216

    new-array v1, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->e:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->d:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/KikCodeFragment;->a(I)V

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_profilePic:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->e:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikCodeFragment;->a:Lcom/kik/cache/ad;

    invoke-virtual {v1, v2, v3}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/aa;Lcom/kik/cache/ad;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->e:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->e:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->_nameText:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lkik/android/util/cv;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->e:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->_usernameText:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lkik/android/util/cv;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_scanText:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_profilePic:Lcom/kik/cache/ContactImageView;

    new-instance v1, Lkik/android/chat/fragment/ig;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ig;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0
.end method

.method static synthetic j(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/a/d/n;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->t:Lkik/a/d/n;

    return-object v0
.end method

.method private j()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 477
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->k:Lcom/kik/scan/KikCode;

    invoke-static {v0}, Lkik/android/chat/b/a;->b(Lcom/kik/scan/KikCode;)I

    move-result v2

    .line 478
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->k:Lcom/kik/scan/KikCode;

    if-nez v0, :cond_1

    .line 479
    invoke-static {}, Lkik/android/chat/b/a;->a()I

    move-result v0

    .line 480
    new-array v1, v5, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->_spinner:Landroid/widget/ProgressBar;

    aput-object v2, v1, v4

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 481
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lkik/android/widget/KikCodeBackgroundImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    move v1, v0

    .line 512
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Lkik/android/scan/widget/a;

    if-eqz v0, :cond_3

    .line 513
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lkik/android/scan/widget/a;

    .line 514
    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->r:Lkik/android/util/cs;

    invoke-virtual {v2}, Lkik/android/util/cs;->a()Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/scan/widget/a;->a(ILandroid/graphics/Point;)V

    .line 521
    :cond_0
    :goto_1
    return-void

    .line 484
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->k:Lcom/kik/scan/KikCode;

    const-string v1, ""

    instance-of v3, v0, Lcom/kik/scan/UsernameKikCode;

    if-eqz v3, :cond_4

    check-cast v0, Lcom/kik/scan/UsernameKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/UsernameKikCode;->getUsername()Ljava/lang/String;

    move-result-object v0

    .line 485
    :goto_2
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_usernameText:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    .line 486
    new-array v0, v5, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_spinner:Landroid/widget/ProgressBar;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 488
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 489
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/ih;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ih;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    const-wide/16 v4, 0x12c

    invoke-virtual {v0, v1, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 509
    :goto_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->x:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Lkik/android/widget/KikFinderCodeImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    move v1, v2

    goto :goto_0

    .line 507
    :cond_2
    new-array v0, v5, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_tellAFriendImage:Landroid/widget/ImageView;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_3

    .line 517
    :cond_3
    new-instance v0, Lkik/android/scan/widget/a;

    invoke-direct {v0, v1}, Lkik/android/scan/widget/a;-><init>(I)V

    .line 518
    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 519
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    new-instance v2, Lkik/android/chat/fragment/ij;

    invoke-direct {v2, p0, v1}, Lkik/android/chat/fragment/ij;-><init>(Lkik/android/chat/fragment/KikCodeFragment;I)V

    const-wide/16 v4, 0xc8

    invoke-virtual {v0, v2, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_2
.end method

.method static synthetic k(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/android/chat/fragment/KikCodeFragment$b;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->p:Lkik/android/chat/fragment/KikCodeFragment$b;

    return-object v0
.end method

.method private k()V
    .locals 1

    .prologue
    .line 756
    new-instance v0, Lkik/android/chat/fragment/ip;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ip;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment;->b(Ljava/lang/Runnable;)V

    .line 774
    return-void
.end method

.method static synthetic l(Lkik/android/chat/fragment/KikCodeFragment;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->q:Z

    return v0
.end method

.method static synthetic m(Lkik/android/chat/fragment/KikCodeFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    return-object v0
.end method

.method static synthetic n(Lkik/android/chat/fragment/KikCodeFragment;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->x:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method static synthetic o(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/android/chat/fragment/KikCodeFragment$c;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->y:Lkik/android/chat/fragment/KikCodeFragment$c;

    return-object v0
.end method

.method static synthetic p(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 3

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/KikCodeBackgroundImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->k()V

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->_spinner:Landroid/widget/ProgressBar;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final M()Z
    .locals 1

    .prologue
    .line 572
    const/4 v0, 0x1

    return v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 246
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikCodeFragment;->c()V

    .line 247
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->o:Z

    .line 248
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 680
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->n:Lcom/kik/g/p;

    new-instance v1, Lkik/android/chat/fragment/il;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/il;-><init>(Lkik/android/chat/fragment/KikCodeFragment;I)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 717
    return-void
.end method

.method protected final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 613
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>()V

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090193

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/ik;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/ik;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 620
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 621
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikCodeFragment$b;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lkik/android/chat/fragment/KikCodeFragment;->p:Lkik/android/chat/fragment/KikCodeFragment$b;

    .line 288
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 269
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->o:Z

    .line 270
    return-void
.end method

.method protected final b(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 293
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->b(Lcom/kik/g/f;)V

    .line 294
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->h:Lkik/android/scan/d;

    invoke-virtual {v0}, Lkik/android/scan/d;->c()Lcom/kik/g/e;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/iu;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/iu;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 304
    return-void
.end method

.method public final c()V
    .locals 10

    .prologue
    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v5, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 625
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->l:Z

    if-eqz v0, :cond_0

    .line 626
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 627
    iput-boolean v6, p0, Lkik/android/chat/fragment/KikCodeFragment;->l:Z

    .line 629
    :cond_0
    return-void

    .line 626
    :cond_1
    const/4 v1, 0x4

    new-array v1, v1, [Landroid/animation/PropertyValuesHolder;

    sget-object v2, Landroid/view/View;->ROTATION_X:Landroid/util/Property;

    new-array v3, v5, [F

    iget-object v4, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v4}, Lkik/android/widget/KikFinderCodeImageView;->getRotationX()F

    move-result v4

    aput v4, v3, v6

    aput v8, v3, v7

    invoke-static {v2, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    aput-object v2, v1, v6

    sget-object v2, Landroid/view/View;->ROTATION_Y:Landroid/util/Property;

    new-array v3, v5, [F

    iget-object v4, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v4}, Lkik/android/widget/KikFinderCodeImageView;->getRotationY()F

    move-result v4

    aput v4, v3, v6

    aput v8, v3, v7

    invoke-static {v2, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    aput-object v2, v1, v7

    sget-object v2, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    new-array v3, v5, [F

    iget-object v4, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v4}, Lkik/android/widget/KikFinderCodeImageView;->getScaleX()F

    move-result v4

    aput v4, v3, v6

    aput v9, v3, v7

    invoke-static {v2, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    aput-object v2, v1, v5

    const/4 v2, 0x3

    sget-object v3, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    new-array v4, v5, [F

    iget-object v5, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v5}, Lkik/android/widget/KikFinderCodeImageView;->getScaleY()F

    move-result v5

    aput v5, v4, v6

    aput v9, v4, v7

    invoke-static {v3, v4}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-direct {v1, v2}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    goto :goto_0
.end method

.method public final d()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 643
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    if-eqz v0, :cond_0

    iput v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->m:I

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0}, Lkik/android/widget/KikFinderCodeImageView;->c()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0}, Lkik/android/widget/KikFinderCodeImageView;->d()Lcom/kik/scan/KikCode;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->k:Lcom/kik/scan/KikCode;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->j()V

    .line 644
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_wipeContainer:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_wipeContainer:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_wipeContainer:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 645
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->h()V

    .line 646
    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->i()V

    .line 647
    return-void
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 651
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->q:Z

    return v0
.end method

.method public final f()V
    .locals 4

    .prologue
    .line 664
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->f:Lcom/kik/android/a;

    if-eqz v0, :cond_0

    .line 665
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->f:Lcom/kik/android/a;

    const-string v1, "Code View Closed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    .line 666
    const-string v1, "Colour"

    iget-object v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->k:Lcom/kik/scan/KikCode;

    invoke-static {v2}, Lkik/android/chat/b/a;->a(Lcom/kik/scan/KikCode;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    .line 667
    const-string v1, "Colour Change Count"

    iget v2, p0, Lkik/android/chat/fragment/KikCodeFragment;->m:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    .line 668
    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 670
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->m:I

    .line 671
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 159
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikCodeFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikCodeFragment;)V

    .line 160
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 162
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikCodeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 163
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->s:Lkik/android/chat/fragment/KikCodeFragment$a;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikCodeFragment$a;->a(Landroid/os/Bundle;)V

    .line 164
    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->h()V

    .line 165
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 170
    const v0, 0x7f030045

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    .line 171
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 173
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->s:Lkik/android/chat/fragment/KikCodeFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCodeFragment$a;->a()Ljava/lang/String;

    move-result-object v0

    .line 174
    if-eqz v0, :cond_0

    .line 175
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->i:Lkik/a/e/l;

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->t:Lkik/a/d/n;

    .line 178
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikCodeFragment;->i()V

    .line 180
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikCodeFragment;->N()I

    move-result v0

    .line 181
    if-lez v0, :cond_1

    .line 183
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_tellAFriendImage:Landroid/widget/ImageView;

    invoke-static {v1}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/util/cv$b;->a(I)Lkik/android/util/cv$b;

    .line 184
    iget-object v1, p0, Lkik/android/chat/fragment/KikCodeFragment;->_codeContainer:Landroid/view/ViewGroup;

    invoke-static {v1}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/util/cv$b;->a(I)Lkik/android/util/cv$b;

    .line 187
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_tellAFriendImage:Landroid/widget/ImageView;

    new-instance v1, Lkik/android/chat/fragment/is;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/is;-><init>(Lkik/android/chat/fragment/KikCodeFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->j:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 471
    iget-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->h:Lkik/android/scan/d;

    invoke-virtual {v0}, Lkik/android/scan/d;->a()V

    .line 472
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroy()V

    .line 473
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 464
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->o:Z

    .line 465
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onPause()V

    .line 466
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 225
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikCodeFragment;->a()V

    .line 226
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onResume()V

    .line 227
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->q:Z

    .line 228
    return-void
.end method
