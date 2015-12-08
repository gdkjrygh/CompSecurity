.class public Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"


# instance fields
.field protected a:Lkik/a/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private b:Z

.field private c:Lcom/kik/g/f;

.field private d:Lcom/kik/g/i;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->b:Z

    .line 31
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->c:Lcom/kik/g/f;

    .line 34
    new-instance v0, Lkik/android/chat/fragment/rh;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/rh;-><init>(Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;)V

    iput-object v0, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->d:Lcom/kik/g/i;

    return-void
.end method

.method private a()Landroid/support/v4/app/Fragment;
    .locals 2

    .prologue
    .line 67
    invoke-virtual {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0e0062

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 68
    return-object v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;)Lcom/kik/g/f;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->c:Lcom/kik/g/f;

    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 2

    .prologue
    .line 53
    invoke-direct {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 54
    instance-of v1, v0, Lcom/kik/h/a;

    if-eqz v1, :cond_0

    .line 55
    check-cast v0, Lcom/kik/h/a;

    invoke-interface {v0}, Lcom/kik/h/a;->v()Z

    move-result v0

    if-nez v0, :cond_1

    .line 56
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onBackPressed()V

    .line 62
    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 74
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 75
    invoke-virtual {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/a;

    invoke-interface {v0}, Lkik/android/chat/a;->a()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;)V

    .line 78
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->requestWindowFeature(I)Z

    .line 80
    const v0, 0x7f03000d

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->setContentView(I)V

    .line 82
    iget-object v0, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->c:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->a:Lkik/a/ab;

    invoke-interface {v1}, Lkik/a/ab;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->d:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 83
    iget-object v0, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->c:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->a:Lkik/a/ab;

    invoke-interface {v1}, Lkik/a/ab;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->d:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 85
    invoke-virtual {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "SimpleFragmentWrapperActivity.fragmentlaunchclass"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    const/4 v1, 0x0

    .line 89
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v1, v0

    .line 101
    :goto_0
    if-nez v1, :cond_0

    .line 102
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 91
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InstantiationException;->printStackTrace()V

    goto :goto_0

    .line 94
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    .line 97
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 105
    instance-of v0, v1, Lcom/kik/ui/fragment/FragmentBase;

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 106
    check-cast v0, Lcom/kik/ui/fragment/FragmentBase;

    invoke-virtual {v0}, Lcom/kik/ui/fragment/FragmentBase;->E()Lcom/kik/g/p;

    move-result-object v0

    .line 108
    new-instance v2, Lkik/android/chat/fragment/rj;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/rj;-><init>(Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 134
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v2, 0x7f0e0062

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 136
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 149
    invoke-direct {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 150
    iget-object v1, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->c:Lcom/kik/g/f;

    invoke-virtual {v1}, Lcom/kik/g/f;->a()V

    .line 152
    instance-of v1, v0, Lkik/android/chat/fragment/KikScopedDialogFragment;

    if-eqz v1, :cond_0

    .line 153
    check-cast v0, Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->ab()V

    .line 156
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V

    .line 157
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 162
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 163
    invoke-virtual {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->c(Landroid/app/Activity;)V

    .line 164
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 169
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 170
    invoke-virtual {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->d(Landroid/app/Activity;)V

    .line 171
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    .prologue
    .line 141
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onWindowFocusChanged(Z)V

    .line 142
    iput-boolean p1, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->b:Z

    .line 143
    invoke-direct {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/kik/h/d;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/kik/h/d;

    iget-boolean v1, p0, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->b:Z

    invoke-interface {v0, v1}, Lcom/kik/h/d;->a(Z)V

    .line 144
    :cond_0
    return-void
.end method
