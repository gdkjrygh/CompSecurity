.class public Lcom/facebook/orca/auth/StartScreenActivity;
.super Lcom/facebook/base/activity/i;
.source "StartScreenActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# annotations
.annotation runtime Lcom/facebook/base/activity/AuthNotRequired;
.end annotation


# instance fields
.field private p:Lcom/facebook/auth/login/AuthNavigationController;

.field private q:Ljava/lang/Class;

.field private r:Lcom/facebook/auth/login/AuthStateMachineConfig;

.field private s:Lcom/facebook/orca/activity/m;

.field private t:Lcom/facebook/push/PushInitializer;

.field private u:Lcom/facebook/backgroundtasks/e;

.field private v:Lcom/facebook/auth/login/am;

.field private w:Lcom/facebook/analytics/av;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/auth/StartScreenActivity;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/orca/auth/StartScreenActivity;->b(Landroid/content/Intent;)V

    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/Class;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 267
    .line 268
    if-eqz p1, :cond_0

    .line 270
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 276
    :cond_0
    :goto_0
    return-object v0

    .line 271
    :catch_0
    move-exception v1

    .line 272
    const-string v1, "orca:StartScreenActivity"

    const-string v2, "Cannot find class %s. Returning null."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private b(Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 219
    const-string v0, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 227
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->v:Lcom/facebook/auth/login/am;

    invoke-virtual {v0}, Lcom/facebook/auth/login/am;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->t:Lcom/facebook/push/PushInitializer;

    invoke-virtual {v0}, Lcom/facebook/push/PushInitializer;->i()V

    .line 231
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->v:Lcom/facebook/auth/login/am;

    invoke-virtual {v0}, Lcom/facebook/auth/login/am;->b()V

    .line 232
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->w:Lcom/facebook/analytics/av;

    invoke-interface {v0, v4}, Lcom/facebook/analytics/av;->a(Ljava/util/Map;)V

    .line 236
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->u:Lcom/facebook/backgroundtasks/e;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/e;->b()V

    .line 238
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->w:Lcom/facebook/analytics/av;

    invoke-interface {v0}, Lcom/facebook/analytics/av;->c()V

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->s:Lcom/facebook/orca/activity/m;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/m;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.fragment.FRAGMENT_ACTION"

    const-class v3, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;

    invoke-direct {v1, v2, v4, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/AuthNavigationController;->b(Landroid/content/Intent;)V

    .line 264
    :goto_0
    return-void

    .line 245
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->s:Lcom/facebook/orca/activity/m;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/activity/m;->m(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/auth/StartScreenActivity;->startActivity(Landroid/content/Intent;)V

    .line 246
    invoke-virtual {p0, v2, v2}, Lcom/facebook/orca/auth/StartScreenActivity;->overridePendingTransition(II)V

    .line 247
    invoke-virtual {p0}, Lcom/facebook/orca/auth/StartScreenActivity;->finish()V

    goto :goto_0

    .line 249
    :cond_2
    const-string v0, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 250
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.fragment.FRAGMENT_ACTION"

    const-class v3, Lcom/facebook/auth/login/FirstPartySsoFragment;

    invoke-direct {v1, v2, v4, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/AuthNavigationController;->b(Landroid/content/Intent;)V

    .line 252
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->w:Lcom/facebook/analytics/av;

    invoke-interface {v0}, Lcom/facebook/analytics/av;->b()V

    goto :goto_0

    .line 253
    :cond_3
    const-string v0, "com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 256
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.fragment.FRAGMENT_ACTION"

    const-class v3, Lcom/facebook/auth/login/SilentLoginFragment;

    invoke-direct {v1, v2, v4, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/AuthNavigationController;->b(Landroid/content/Intent;)V

    goto :goto_0

    .line 258
    :cond_4
    const-string v0, "com.facebook.orca.login.AuthStateMachineMonitor.EXIT_TO_WILDFIRE_REGISTRATION"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 259
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.fragment.FRAGMENT_ACTION"

    const-class v3, Lcom/facebook/orca/login/WildfireRegStartFragment;

    invoke-direct {v1, v2, v4, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/AuthNavigationController;->b(Landroid/content/Intent;)V

    goto :goto_0

    .line 262
    :cond_5
    invoke-virtual {p0, p1}, Lcom/facebook/orca/auth/StartScreenActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 81
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/support/v4/app/Fragment;)V

    .line 86
    instance-of v0, p1, Lcom/facebook/base/fragment/NavigableFragmentController;

    if-eqz v0, :cond_0

    .line 87
    check-cast p1, Lcom/facebook/base/fragment/NavigableFragmentController;

    new-instance v0, Lcom/facebook/orca/auth/d;

    invoke-direct {v0, p0}, Lcom/facebook/orca/auth/d;-><init>(Lcom/facebook/orca/auth/StartScreenActivity;)V

    invoke-virtual {p1, v0}, Lcom/facebook/base/fragment/NavigableFragmentController;->a(Lcom/facebook/base/fragment/c;)V

    .line 95
    :cond_0
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 11

    .prologue
    const/4 v6, 0x0

    const/4 v0, 0x0

    .line 99
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 101
    invoke-virtual {p0}, Lcom/facebook/orca/auth/StartScreenActivity;->i()Lcom/facebook/inject/t;

    move-result-object v2

    .line 102
    const-class v1, Lcom/facebook/orca/activity/m;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/activity/m;

    iput-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->s:Lcom/facebook/orca/activity/m;

    .line 103
    const-class v1, Lcom/facebook/push/PushInitializer;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/push/PushInitializer;

    iput-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->t:Lcom/facebook/push/PushInitializer;

    .line 104
    const-class v1, Lcom/facebook/backgroundtasks/e;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/backgroundtasks/e;

    iput-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->u:Lcom/facebook/backgroundtasks/e;

    .line 105
    const-class v1, Lcom/facebook/auth/login/am;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/login/am;

    iput-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->v:Lcom/facebook/auth/login/am;

    .line 106
    const-class v1, Lcom/facebook/analytics/av;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/av;

    iput-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->w:Lcom/facebook/analytics/av;

    .line 108
    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/facebook/auth/b/b;

    .line 110
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v1, v3, :cond_0

    .line 111
    const-class v1, Lcom/facebook/selfupdate/q;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/selfupdate/q;

    .line 112
    invoke-virtual {v1}, Lcom/facebook/selfupdate/q;->a()V

    .line 116
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/auth/StartScreenActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 117
    iput-object v6, p0, Lcom/facebook/orca/auth/StartScreenActivity;->q:Ljava/lang/Class;

    .line 118
    if-eqz v1, :cond_1

    .line 119
    iget-object v2, p0, Lcom/facebook/orca/auth/StartScreenActivity;->s:Lcom/facebook/orca/activity/m;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/activity/m;->a(Landroid/content/Intent;)V

    .line 120
    const-string v2, "orca:loginparam:LoginFragmentState"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/orca/auth/StartScreenActivity;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/auth/StartScreenActivity;->q:Ljava/lang/Class;

    .line 121
    const-string v2, "orca:loginparam:LoginFragmentState"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 124
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->s:Lcom/facebook/orca/activity/m;

    invoke-virtual {v1}, Lcom/facebook/orca/activity/m;->a()Z

    move-result v1

    if-nez v1, :cond_2

    .line 128
    if-nez p1, :cond_2

    iget-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->q:Ljava/lang/Class;

    if-nez v1, :cond_2

    invoke-interface {v10}, Lcom/facebook/auth/b/b;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v10}, Lcom/facebook/auth/b/b;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 132
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/facebook/orca/auth/StartScreenActivity;->b(Landroid/content/Intent;)V

    .line 173
    :goto_0
    return-void

    .line 139
    :cond_2
    if-eqz p1, :cond_3

    .line 140
    const-string v0, "authStateMachineConfig"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;

    .line 142
    new-instance v1, Lcom/facebook/auth/login/AuthStateMachineConfig;

    new-instance v2, Lcom/facebook/auth/login/bg;

    new-instance v3, Lcom/facebook/fbservice/ops/aa;

    sget v4, Lcom/facebook/o;->logging_out_progress:I

    invoke-direct {v3, p0, v4}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-direct {v2, v3}, Lcom/facebook/auth/login/bg;-><init>(Lcom/facebook/fbservice/ops/ab;)V

    invoke-direct {v1, v0, v2}, Lcom/facebook/auth/login/AuthStateMachineConfig;-><init>(Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;Lcom/facebook/auth/login/bg;)V

    iput-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->r:Lcom/facebook/auth/login/AuthStateMachineConfig;

    .line 169
    :goto_1
    sget v0, Lcom/facebook/k;->new_start_screen:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/auth/StartScreenActivity;->setContentView(I)V

    .line 170
    invoke-virtual {p0}, Lcom/facebook/orca/auth/StartScreenActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    sget v1, Lcom/facebook/i;->login_fragment_controller:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/AuthNavigationController;

    iput-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    .line 172
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    iget-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->r:Lcom/facebook/auth/login/AuthStateMachineConfig;

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/AuthNavigationController;->a(Lcom/facebook/auth/login/AuthStateMachineConfig;)V

    goto :goto_0

    .line 149
    :cond_3
    sget v1, Lcom/facebook/h;->bolt:I

    sget v2, Lcom/facebook/h;->messenger:I

    sget-object v5, Lcom/facebook/auth/login/l;->LOGO_SLIDE:Lcom/facebook/auth/login/l;

    move v3, v0

    move v4, v0

    invoke-static/range {v0 .. v6}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->createParameterBundle(IIIIILcom/facebook/auth/login/l;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 155
    invoke-static {v0}, Lcom/facebook/orca/login/OrcaSilentLoginViewGroup;->createParameterBundle(I)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->createParameterBundle(I)Landroid/os/Bundle;

    move-result-object v4

    sget v0, Lcom/facebook/h;->bolt:I

    sget v3, Lcom/facebook/h;->messenger:I

    invoke-static {v0, v3}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->createParameterBundle(II)Landroid/os/Bundle;

    move-result-object v5

    sget v0, Lcom/facebook/h;->bolt:I

    sget v3, Lcom/facebook/h;->messenger:I

    invoke-static {v0, v3}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->createParameterBundle(II)Landroid/os/Bundle;

    move-result-object v6

    sget v0, Lcom/facebook/h;->bolt:I

    sget v3, Lcom/facebook/h;->messenger:I

    invoke-static {v0, v3}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->createParameterBundle(II)Landroid/os/Bundle;

    move-result-object v7

    sget v0, Lcom/facebook/h;->bolt:I

    sget v3, Lcom/facebook/h;->messenger:I

    invoke-static {v0, v3}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->createParameterBundle(II)Landroid/os/Bundle;

    move-result-object v8

    new-instance v9, Lcom/facebook/fbservice/ops/aa;

    sget v0, Lcom/facebook/o;->logging_out_progress:I

    invoke-direct {v9, p0, v0}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    move-object v0, v10

    move-object v3, v1

    invoke-static/range {v0 .. v9}, Lcom/facebook/orca/login/a;->a(Lcom/facebook/auth/b/a;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/auth/login/AuthStateMachineConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->r:Lcom/facebook/auth/login/AuthStateMachineConfig;

    goto :goto_1
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 76
    sget-object v0, Lcom/facebook/analytics/f/a;->START_SCREEN_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    .prologue
    .line 68
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onAttachedToWindow()V

    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/auth/StartScreenActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 71
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 72
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    invoke-virtual {v0}, Lcom/facebook/auth/login/AuthNavigationController;->q()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onBackPressed()V

    .line 203
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 207
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 208
    const-string v0, "authStateMachineConfig"

    iget-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->r:Lcom/facebook/auth/login/AuthStateMachineConfig;

    invoke-virtual {v1}, Lcom/facebook/auth/login/AuthStateMachineConfig;->b()Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 210
    return-void
.end method

.method public onStart()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 177
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStart()V

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->q:Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 182
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.facebook.fragment.FRAGMENT_ACTION"

    iget-object v3, p0, Lcom/facebook/orca/auth/StartScreenActivity;->q:Ljava/lang/Class;

    invoke-direct {v0, v2, v1, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    .line 183
    iput-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->q:Ljava/lang/Class;

    .line 189
    :goto_0
    if-eqz v0, :cond_0

    .line 190
    iget-object v1, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    invoke-virtual {v1, v0}, Lcom/facebook/auth/login/AuthNavigationController;->b(Landroid/content/Intent;)V

    .line 192
    :cond_0
    return-void

    .line 184
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/auth/StartScreenActivity;->p:Lcom/facebook/auth/login/AuthNavigationController;

    invoke-virtual {v0}, Lcom/facebook/auth/login/AuthNavigationController;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 185
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.facebook.fragment.FRAGMENT_ACTION"

    const-class v3, Lcom/facebook/auth/login/FirstPartySsoFragment;

    invoke-direct {v0, v2, v1, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method
