.class public Lcom/facebook/auth/login/LoginApprovalFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "LoginApprovalFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/auth/login/ao;


# instance fields
.field private a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private c:Ljava/lang/String;

.field private d:Lcom/facebook/auth/login/v;

.field private e:Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    return-void
.end method

.method private Q()V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/auth/login/LoginApprovalFragment;->T()V

    .line 107
    return-void
.end method

.method private T()V
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->d:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->b()V

    .line 129
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/LoginApprovalFragment;->d(Landroid/content/Intent;)V

    .line 130
    return-void
.end method

.method public static a(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 54
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 55
    const-string v1, "orca:authparam:email"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/auth/login/LoginApprovalFragment;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/auth/login/LoginApprovalFragment;->Q()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/login/LoginApprovalFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/LoginApprovalFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 5

    .prologue
    .line 110
    const/4 v0, 0x0

    .line 112
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v1, v2, :cond_0

    .line 113
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 114
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v0

    .line 117
    :cond_0
    iget-object v1, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->e:Lcom/facebook/common/e/h;

    const-string v2, "MESSENGER_LOGIN_ERROR"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "login approval error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/common/e/m;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/common/e/n;->a(Ljava/lang/Throwable;)Lcom/facebook/common/e/n;

    move-result-object v0

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2}, Lcom/facebook/common/e/n;->a(I)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/common/e/h;->a(Lcom/facebook/common/e/m;)V

    .line 123
    invoke-virtual {p0}, Lcom/facebook/auth/login/LoginApprovalFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/ui/d/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/d/a;

    .line 124
    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 125
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 90
    const-class v0, Lcom/facebook/auth/login/ao;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/auth/login/LoginApprovalFragment;->a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 66
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 68
    invoke-virtual {p0}, Lcom/facebook/auth/login/LoginApprovalFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/login/v;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/v;

    iput-object v0, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->d:Lcom/facebook/auth/login/v;

    .line 69
    invoke-virtual {p0}, Lcom/facebook/auth/login/LoginApprovalFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->e:Lcom/facebook/common/e/h;

    .line 71
    const-string v0, "authenticateOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 72
    iget-object v0, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/auth/login/an;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/an;-><init>(Lcom/facebook/auth/login/LoginApprovalFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 84
    invoke-virtual {p0}, Lcom/facebook/auth/login/LoginApprovalFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:email"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->c:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/facebook/fbservice/ops/ab;)V
    .locals 3

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    :goto_0
    return-void

    .line 98
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 99
    new-instance v1, Lcom/facebook/auth/credentials/PasswordCredentials;

    iget-object v2, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->c:Ljava/lang/String;

    invoke-direct {v1, v2, p1}, Lcom/facebook/auth/credentials/PasswordCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v2, "passwordCredentials"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 101
    iget-object v1, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v1, p2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 102
    iget-object v1, p0, Lcom/facebook/auth/login/LoginApprovalFragment;->a:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/auth/login/n;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lcom/facebook/analytics/f/a;->LOGIN_APPROVAL_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
