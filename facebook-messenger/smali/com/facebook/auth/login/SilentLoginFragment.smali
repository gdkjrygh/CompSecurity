.class public Lcom/facebook/auth/login/SilentLoginFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "SilentLoginFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private a:Lcom/facebook/auth/b/d;

.field private c:Lcom/facebook/auth/login/v;

.field private d:Lcom/facebook/fbservice/ops/BlueServiceFragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    return-void
.end method

.method private Q()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 108
    invoke-virtual {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->R()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 116
    :goto_0
    return v0

    .line 112
    :cond_0
    iget-object v1, p0, Lcom/facebook/auth/login/SilentLoginFragment;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v1}, Lcom/facebook/auth/b/d;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 113
    invoke-direct {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->U()V

    goto :goto_0

    .line 116
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private T()V
    .locals 3

    .prologue
    .line 120
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 121
    iget-object v1, p0, Lcom/facebook/auth/login/SilentLoginFragment;->d:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/auth/login/bb;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 122
    return-void
.end method

.method private U()V
    .locals 2

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->c:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->c()V

    .line 126
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/SilentLoginFragment;->d(Landroid/content/Intent;)V

    .line 127
    return-void
.end method

.method private V()V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->g()V

    .line 131
    invoke-virtual {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->P()V

    .line 132
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/login/SilentLoginFragment;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->U()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/auth/login/SilentLoginFragment;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->V()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .prologue
    .line 92
    invoke-super {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->A()V

    .line 94
    invoke-direct {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    :cond_0
    :goto_0
    return-void

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->d:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 100
    invoke-direct {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->T()V

    goto :goto_0

    .line 102
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->P()V

    goto :goto_0
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    const/4 v0, 0x0

    .line 79
    :goto_0
    return-object v0

    :cond_0
    const-class v0, Lcom/facebook/auth/login/c;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/auth/login/SilentLoginFragment;->a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 40
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 42
    invoke-virtual {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 43
    const-class v0, Lcom/facebook/auth/login/v;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/v;

    iput-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->c:Lcom/facebook/auth/login/v;

    .line 44
    const-class v0, Lcom/facebook/auth/b/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/d;

    iput-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->a:Lcom/facebook/auth/b/d;

    .line 46
    const-string v0, "loginOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->d:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 47
    iget-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->d:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/auth/login/bl;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/bl;-><init>(Lcom/facebook/auth/login/SilentLoginFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 65
    iget-object v0, p0, Lcom/facebook/auth/login/SilentLoginFragment;->b:Lcom/facebook/base/fragment/c;

    if-eqz v0, :cond_0

    .line 66
    invoke-direct {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->Q()Z

    .line 68
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 84
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/os/Bundle;)V

    .line 87
    invoke-direct {p0}, Lcom/facebook/auth/login/SilentLoginFragment;->Q()Z

    .line 88
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/facebook/analytics/f/a;->SILENT_LOGIN_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
