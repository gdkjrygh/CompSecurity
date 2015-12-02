.class public Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;
.super Lcom/qihoo/security/app/BaseSimpleActivity;
.source "360Security"


# instance fields
.field private final a:Lcom/qihoo/security/locale/d;

.field private b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private d:Landroid/widget/ImageView;

.field private e:Lcom/qihoo/security/locale/widget/LocaleButton;

.field private f:I

.field private g:Landroid/view/View;

.field private h:Landroid/content/Context;

.field private i:Landroid/os/Handler;

.field private j:Ljava/lang/Runnable;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;-><init>()V

    .line 31
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->a:Lcom/qihoo/security/locale/d;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->f:I

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->h:Landroid/content/Context;

    return-object v0
.end method

.method private a(Landroid/app/Activity;Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    .line 117
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 118
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    .line 119
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledWindowTouchSlop()I

    move-result v2

    .line 120
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    .line 121
    neg-int v4, v2

    if-lt v0, v4, :cond_0

    neg-int v4, v2

    if-lt v1, v4, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v4, v2

    if-gt v0, v4, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/2addr v0, v2

    if-le v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)I
    .locals 2

    .prologue
    .line 29
    iget v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->f:I

    return v0
.end method

.method private b()V
    .locals 4

    .prologue
    .line 72
    const v0, 0x7f0b0066

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->g:Landroid/view/View;

    .line 73
    const v0, 0x7f0b0067

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 74
    const v0, 0x7f0b0068

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 75
    const v0, 0x7f0b0069

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->d:Landroid/widget/ImageView;

    .line 76
    const v0, 0x7f0b006a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleButton;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->e:Lcom/qihoo/security/locale/widget/LocaleButton;

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 78
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->h:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->h:Landroid/content/Context;

    const/high16 v3, 0x42700000    # 60.0f

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 79
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->g:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->e:Lcom/qihoo/security/locale/widget/LocaleButton;

    new-instance v1, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;-><init>(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->f:I

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->a:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->e:Lcom/qihoo/security/locale/widget/LocaleButton;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->k:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 113
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/b;->c()V

    .line 114
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 46
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->requestWindowFeature(I)Z

    .line 47
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseSimpleActivity;->onCreate(Landroid/os/Bundle;)V

    .line 48
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "pkg_name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->k:Ljava/lang/String;

    .line 52
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->h:Landroid/content/Context;

    .line 53
    const v0, 0x7f03001b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->setContentView(I)V

    .line 54
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->b()V

    .line 55
    const/16 v0, 0x2b5d

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 56
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->i:Landroid/os/Handler;

    .line 57
    new-instance v0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$1;-><init>(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->j:Ljava/lang/Runnable;

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->j:Ljava/lang/Runnable;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 69
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 136
    invoke-super {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;->onDestroy()V

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 138
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 127
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p0, p1}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->a(Landroid/app/Activity;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->finish()V

    .line 129
    const/4 v0, 0x1

    .line 131
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
