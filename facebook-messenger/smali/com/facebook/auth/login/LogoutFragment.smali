.class public Lcom/facebook/auth/login/LogoutFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "LogoutFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# static fields
.field public static a:Ljava/lang/String;


# instance fields
.field private c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private d:Lcom/facebook/fbservice/ops/ab;

.field private e:Lcom/facebook/auth/login/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-string v0, "delete_account_flag"

    sput-object v0, Lcom/facebook/auth/login/LogoutFragment;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    .line 35
    return-void
.end method

.method private T()V
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/auth/login/LogoutFragment;->e:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->d()V

    .line 99
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/LogoutFragment;->d(Landroid/content/Intent;)V

    .line 100
    return-void
.end method

.method private U()V
    .locals 0

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/facebook/auth/login/LogoutFragment;->b()Z

    .line 106
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/login/LogoutFragment;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/auth/login/LogoutFragment;->T()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/auth/login/LogoutFragment;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/auth/login/LogoutFragment;->U()V

    return-void
.end method


# virtual methods
.method public Q()V
    .locals 4

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/auth/login/LogoutFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    :goto_0
    return-void

    .line 84
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 85
    iget-object v1, p0, Lcom/facebook/auth/login/LogoutFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    iget-object v2, p0, Lcom/facebook/auth/login/LogoutFragment;->d:Lcom/facebook/fbservice/ops/ab;

    invoke-virtual {v1, v2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 87
    invoke-virtual {p0}, Lcom/facebook/auth/login/LogoutFragment;->l()Landroid/support/v4/app/i;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/i;->getIntent()Landroid/content/Intent;

    move-result-object v1

    sget-object v2, Lcom/facebook/auth/login/LogoutFragment;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 89
    iget-object v1, p0, Lcom/facebook/auth/login/LogoutFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/auth/login/n;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0

    .line 92
    :cond_1
    iget-object v1, p0, Lcom/facebook/auth/login/LogoutFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/auth/login/n;->c:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 56
    invoke-virtual {p0}, Lcom/facebook/auth/login/LogoutFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/login/v;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/v;

    iput-object v0, p0, Lcom/facebook/auth/login/LogoutFragment;->e:Lcom/facebook/auth/login/v;

    .line 58
    const-string v0, "authLogout"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/LogoutFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 59
    iget-object v0, p0, Lcom/facebook/auth/login/LogoutFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/auth/login/bf;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/bf;-><init>(Lcom/facebook/auth/login/LogoutFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 70
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 74
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/os/Bundle;)V

    .line 75
    invoke-virtual {p0}, Lcom/facebook/auth/login/LogoutFragment;->c()Lcom/facebook/auth/login/AuthStateMachineConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/login/AuthStateMachineConfig;->a()Lcom/facebook/auth/login/bg;

    move-result-object v0

    iget-object v0, v0, Lcom/facebook/auth/login/bg;->a:Lcom/facebook/fbservice/ops/ab;

    iput-object v0, p0, Lcom/facebook/auth/login/LogoutFragment;->d:Lcom/facebook/fbservice/ops/ab;

    .line 76
    invoke-virtual {p0}, Lcom/facebook/auth/login/LogoutFragment;->Q()V

    .line 77
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 49
    sget-object v0, Lcom/facebook/analytics/f/a;->ORCA_LOGOUT_ACTIVITY:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
