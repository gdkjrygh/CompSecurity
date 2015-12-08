.class public Lkik/android/chat/activity/IntroActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field protected a:Lkik/a/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private c:Landroid/app/ProgressDialog;

.field private d:Ljava/util/Timer;

.field private e:Lcom/kik/g/f;

.field private f:Ljava/util/TimerTask;

.field private g:Lcom/kik/g/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 29
    new-instance v0, Ljava/util/Timer;

    const-string v1, "TeardownFail"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/IntroActivity;->d:Ljava/util/Timer;

    .line 35
    new-instance v0, Lkik/android/chat/activity/g;

    invoke-direct {v0, p0}, Lkik/android/chat/activity/g;-><init>(Lkik/android/chat/activity/IntroActivity;)V

    iput-object v0, p0, Lkik/android/chat/activity/IntroActivity;->f:Ljava/util/TimerTask;

    .line 91
    new-instance v0, Lkik/android/chat/activity/h;

    invoke-direct {v0, p0}, Lkik/android/chat/activity/h;-><init>(Lkik/android/chat/activity/IntroActivity;)V

    iput-object v0, p0, Lkik/android/chat/activity/IntroActivity;->g:Lcom/kik/g/i;

    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/IntroActivity;)Lcom/kik/g/f;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/chat/activity/IntroActivity;->e:Lcom/kik/g/f;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 80
    iget-object v0, p0, Lkik/android/chat/activity/IntroActivity;->b:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    invoke-static {v0, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 88
    :goto_0
    invoke-virtual {p0}, Lkik/android/chat/activity/IntroActivity;->finish()V

    .line 89
    return-void

    .line 84
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lkik/android/chat/activity/KikWelcomeFragmentActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 85
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 86
    invoke-virtual {p0, v0}, Lkik/android/chat/activity/IntroActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/activity/IntroActivity;)Ljava/util/TimerTask;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/chat/activity/IntroActivity;->f:Ljava/util/TimerTask;

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/activity/IntroActivity;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/chat/activity/IntroActivity;->d:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/activity/IntroActivity;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/chat/activity/IntroActivity;->c:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic e(Lkik/android/chat/activity/IntroActivity;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lkik/android/chat/activity/IntroActivity;->a()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 47
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 48
    invoke-virtual {p0}, Lkik/android/chat/activity/IntroActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/a;

    invoke-interface {v0}, Lkik/android/chat/a;->a()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/activity/IntroActivity;)V

    .line 49
    invoke-virtual {p0}, Lkik/android/chat/activity/IntroActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/activity/IntroActivity;->isTaskRoot()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "android.intent.action.MAIN"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    .line 50
    invoke-virtual {p0}, Lkik/android/chat/activity/IntroActivity;->finish()V

    .line 59
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 49
    goto :goto_0

    .line 53
    :cond_1
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/activity/IntroActivity;->e:Lcom/kik/g/f;

    .line 54
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/activity/IntroActivity;->c:Landroid/app/ProgressDialog;

    .line 55
    iget-object v0, p0, Lkik/android/chat/activity/IntroActivity;->c:Landroid/app/ProgressDialog;

    const v2, 0x7f09027d

    invoke-virtual {p0, v2}, Lkik/android/chat/activity/IntroActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v0, p0, Lkik/android/chat/activity/IntroActivity;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 58
    invoke-direct {p0}, Lkik/android/chat/activity/IntroActivity;->a()V

    goto :goto_1
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 115
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 116
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 121
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 122
    return-void
.end method
