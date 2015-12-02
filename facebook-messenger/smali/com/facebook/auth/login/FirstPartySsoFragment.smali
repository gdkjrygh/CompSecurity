.class public Lcom/facebook/auth/login/FirstPartySsoFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "FirstPartySsoFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/auth/login/ac;


# instance fields
.field private a:Lcom/facebook/auth/b/d;

.field private c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private d:Lcom/facebook/auth/credentials/b;

.field private e:Lcom/facebook/auth/login/bm;

.field private f:Lcom/facebook/auth/login/v;

.field private g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/auth/login/ab;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    .line 44
    return-void
.end method

.method private T()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 154
    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->R()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 171
    :goto_0
    return v0

    .line 158
    :cond_0
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v1}, Lcom/facebook/auth/b/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 159
    invoke-direct {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->V()V

    goto :goto_0

    .line 162
    :cond_1
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->e:Lcom/facebook/auth/login/bm;

    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/auth/login/bm;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 163
    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->Q()V

    goto :goto_0

    .line 166
    :cond_2
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->e:Lcom/facebook/auth/login/bm;

    invoke-virtual {v1}, Lcom/facebook/auth/login/bm;->a()Lcom/facebook/auth/credentials/b;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->d:Lcom/facebook/auth/credentials/b;

    .line 167
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->d:Lcom/facebook/auth/credentials/b;

    if-nez v1, :cond_3

    .line 168
    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->Q()V

    goto :goto_0

    .line 171
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private U()V
    .locals 0

    .prologue
    .line 175
    invoke-direct {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->V()V

    .line 176
    return-void
.end method

.method private V()V
    .locals 2

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->f:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->b()V

    .line 194
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->d(Landroid/content/Intent;)V

    .line 195
    return-void
.end method

.method private W()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->e:Lcom/facebook/auth/login/bm;

    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->l()Landroid/support/v4/app/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/bm;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.EXIT_TO_WILDFIRE_REGISTRATION"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 215
    :goto_0
    return-object v0

    .line 208
    :cond_0
    new-instance v0, Lcom/facebook/base/fragment/e;

    const-class v1, Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-direct {v0, v1}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    .line 211
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->e:Lcom/facebook/auth/login/bm;

    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/auth/login/bm;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 212
    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->a()Lcom/facebook/base/fragment/e;

    .line 215
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/auth/login/FirstPartySsoFragment;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->U()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/login/FirstPartySsoFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/FirstPartySsoFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 6

    .prologue
    .line 180
    invoke-direct {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->W()Landroid/content/Intent;

    move-result-object v0

    .line 181
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->d:Lcom/facebook/auth/credentials/b;

    if-eqz v1, :cond_0

    .line 182
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->d:Lcom/facebook/auth/credentials/b;

    invoke-virtual {v1}, Lcom/facebook/auth/credentials/b;->a()Ljava/lang/String;

    move-result-object v1

    .line 183
    iget-object v2, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->d:Lcom/facebook/auth/credentials/b;

    invoke-virtual {v2}, Lcom/facebook/auth/credentials/b;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "https://graph.facebook.com/%s/picture?type=large"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 187
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 189
    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->d(Landroid/content/Intent;)V

    .line 190
    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .prologue
    .line 130
    invoke-super {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->A()V

    .line 131
    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->f:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->a()V

    .line 132
    invoke-direct {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->T()Z

    .line 133
    return-void
.end method

.method public Q()V
    .locals 1

    .prologue
    .line 199
    invoke-direct {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->W()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->d(Landroid/content/Intent;)V

    .line 200
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    const/4 v1, 0x0

    .line 112
    :goto_0
    return-object v1

    .line 109
    :cond_0
    const-class v0, Lcom/facebook/auth/login/ac;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/auth/login/FirstPartySsoFragment;->a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 110
    check-cast v0, Lcom/facebook/auth/login/ab;

    iput-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->h:Lcom/facebook/auth/login/ab;

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 67
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 69
    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 70
    const-class v0, Lcom/facebook/auth/login/bm;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/bm;

    iput-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->e:Lcom/facebook/auth/login/bm;

    .line 71
    const-class v0, Lcom/facebook/auth/login/v;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/v;

    iput-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->f:Lcom/facebook/auth/login/v;

    .line 72
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/auth/annotations/IsWildfireRegEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->g:Ljavax/inject/a;

    .line 73
    const-class v0, Lcom/facebook/auth/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/a;

    .line 74
    instance-of v1, v0, Lcom/facebook/auth/b/d;

    const-string v2, "Must use LoggedInUserSessionManager to use com.facebook.auth auth"

    invoke-static {v1, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 76
    check-cast v0, Lcom/facebook/auth/b/d;

    iput-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->a:Lcom/facebook/auth/b/d;

    .line 78
    const-string v0, "authenticateOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 79
    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/auth/login/aa;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/aa;-><init>(Lcom/facebook/auth/login/FirstPartySsoFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 95
    invoke-virtual {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->c()Lcom/facebook/auth/login/AuthStateMachineConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->b:Lcom/facebook/base/fragment/c;

    if-eqz v0, :cond_0

    .line 96
    invoke-direct {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->T()Z

    .line 98
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/fbservice/ops/ab;)V
    .locals 3

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    :goto_0
    return-void

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->h()V

    .line 147
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 148
    const-string v1, "accessToken"

    iget-object v2, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->d:Lcom/facebook/auth/credentials/b;

    invoke-virtual {v2}, Lcom/facebook/auth/credentials/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v1, p1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 150
    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->c:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/auth/login/n;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 117
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/os/Bundle;)V

    .line 120
    invoke-direct {p0}, Lcom/facebook/auth/login/FirstPartySsoFragment;->T()Z

    .line 123
    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->d:Lcom/facebook/auth/credentials/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->h:Lcom/facebook/auth/login/ab;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->h:Lcom/facebook/auth/login/ab;

    iget-object v1, p0, Lcom/facebook/auth/login/FirstPartySsoFragment;->d:Lcom/facebook/auth/credentials/b;

    invoke-interface {v0, v1}, Lcom/facebook/auth/login/ab;->setSsoSessionInfo(Lcom/facebook/auth/credentials/b;)V

    .line 126
    :cond_0
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/facebook/analytics/f/a;->FIRST_PARTY_SSO_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
