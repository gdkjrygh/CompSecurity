.class public Lcom/facebook/auth/login/PasswordCredentialsFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "PasswordCredentialsFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/auth/login/bj;


# instance fields
.field private a:Lcom/facebook/auth/b/d;

.field private c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private d:Lcom/facebook/auth/credentials/PasswordCredentials;

.field private e:Lcom/facebook/auth/login/v;

.field private f:Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    .line 42
    return-void
.end method

.method private T()V
    .locals 0

    .prologue
    .line 200
    invoke-direct {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->U()V

    .line 201
    return-void
.end method

.method private U()V
    .locals 2

    .prologue
    .line 238
    iget-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->e:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->b()V

    .line 239
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->d(Landroid/content/Intent;)V

    .line 240
    return-void
.end method

.method private V()V
    .locals 2

    .prologue
    .line 243
    new-instance v0, Lcom/facebook/base/fragment/e;

    const-class v1, Lcom/facebook/auth/login/LoginApprovalFragment;

    invoke-direct {v0, v1}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->a()Lcom/facebook/base/fragment/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->d:Lcom/facebook/auth/credentials/PasswordCredentials;

    invoke-virtual {v1}, Lcom/facebook/auth/credentials/PasswordCredentials;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/auth/login/LoginApprovalFragment;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    .line 247
    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->d(Landroid/content/Intent;)V

    .line 248
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 91
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 92
    const-string v1, "orca:authparam:phone"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v1, "orca:authparam:name"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v1, "orca:authparam:photourl"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    return-object v0
.end method

.method private a(ILjava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 204
    iget-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->f:Lcom/facebook/common/e/h;

    const-string v1, "MESSENGER_LOGIN_ERROR"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "login error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/common/e/m;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/facebook/common/e/n;->a(Ljava/lang/Throwable;)Lcom/facebook/common/e/n;

    move-result-object v1

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Lcom/facebook/common/e/n;->a(I)Lcom/facebook/common/e/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Lcom/facebook/common/e/m;)V

    .line 210
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/login/PasswordCredentialsFragment;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->T()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/login/PasswordCredentialsFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 213
    const/4 v0, 0x0

    .line 215
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v1, v2, :cond_2

    .line 216
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 217
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v0

    .line 218
    const/16 v1, 0x196

    if-ne v0, v1, :cond_0

    .line 220
    invoke-direct {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->V()V

    .line 235
    :goto_0
    return-void

    .line 222
    :cond_0
    const/16 v1, 0x190

    if-eq v0, v1, :cond_1

    const/16 v1, 0x191

    if-ne v0, v1, :cond_2

    .line 224
    :cond_1
    invoke-direct {p0, v0, p1}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a(ILjava/lang/Throwable;)V

    .line 225
    invoke-virtual {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/ui/d/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/d/a;

    .line 226
    sget v1, Lcom/facebook/o;->login_failed_message:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0

    .line 231
    :cond_2
    invoke-direct {p0, v0, p1}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a(ILjava/lang/Throwable;)V

    .line 233
    invoke-virtual {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/ui/d/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/d/a;

    .line 234
    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0
.end method


# virtual methods
.method public A()V
    .locals 1

    .prologue
    .line 154
    invoke-super {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->A()V

    .line 155
    iget-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 156
    invoke-direct {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->U()V

    .line 158
    :cond_0
    return-void
.end method

.method public Q()V
    .locals 2

    .prologue
    .line 173
    invoke-virtual {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    .line 174
    if-eqz v0, :cond_0

    .line 175
    const-string v1, "orca:authparam:phone"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 176
    const-string v1, "orca:authparam:name"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 177
    const-string v1, "orca:authparam:photourl"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 179
    :cond_0
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    .line 137
    const-class v0, Lcom/facebook/auth/login/bj;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 138
    check-cast v0, Lcom/facebook/auth/login/bi;

    .line 139
    invoke-virtual {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->k()Landroid/os/Bundle;

    move-result-object v2

    .line 140
    if-eqz v2, :cond_0

    const-string v3, "orca:authparam:phone"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 141
    const-string v3, "orca:authparam:phone"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "orca:authparam:name"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "orca:authparam:photourl"

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v3, v4, v2}, Lcom/facebook/auth/login/bi;->setUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :cond_0
    return-object v1
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 105
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 107
    invoke-virtual {p0}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 108
    const-class v0, Lcom/facebook/auth/login/v;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/v;

    iput-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->e:Lcom/facebook/auth/login/v;

    .line 109
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->f:Lcom/facebook/common/e/h;

    .line 110
    const-class v0, Lcom/facebook/auth/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/a;

    .line 111
    instance-of v1, v0, Lcom/facebook/auth/b/d;

    const-string v2, "Must use LoggedInUserSessionManager to use com.facebook.auth auth"

    invoke-static {v1, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 113
    check-cast v0, Lcom/facebook/auth/b/d;

    iput-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a:Lcom/facebook/auth/b/d;

    .line 115
    const-string v0, "authenticateOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 116
    iget-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/auth/login/bh;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/bh;-><init>(Lcom/facebook/auth/login/PasswordCredentialsFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 129
    if-eqz p1, :cond_0

    .line 130
    const-string v0, "passwordCredentials"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/credentials/PasswordCredentials;

    iput-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->d:Lcom/facebook/auth/credentials/PasswordCredentials;

    .line 132
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/auth/credentials/PasswordCredentials;Lcom/facebook/fbservice/ops/ab;)V
    .locals 3

    .prologue
    .line 184
    iget-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    :goto_0
    return-void

    .line 190
    :cond_0
    iput-object p1, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->d:Lcom/facebook/auth/credentials/PasswordCredentials;

    .line 192
    iget-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->h()V

    .line 193
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 194
    const-string v1, "passwordCredentials"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 195
    iget-object v1, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v1, p2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 196
    iget-object v1, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/auth/login/n;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public c(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 252
    invoke-virtual {p0, p1}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->d(Landroid/content/Intent;)V

    .line 253
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 148
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/os/Bundle;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->e:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->a()V

    .line 150
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 162
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->e(Landroid/os/Bundle;)V

    .line 163
    const-string v0, "passwordCredentials"

    iget-object v1, p0, Lcom/facebook/auth/login/PasswordCredentialsFragment;->d:Lcom/facebook/auth/credentials/PasswordCredentials;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 164
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 100
    sget-object v0, Lcom/facebook/analytics/f/a;->LOGIN_SCREEN_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
