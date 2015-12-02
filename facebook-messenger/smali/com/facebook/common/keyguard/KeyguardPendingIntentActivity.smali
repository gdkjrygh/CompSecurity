.class public Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;
.super Lcom/facebook/base/activity/i;
.source "KeyguardPendingIntentActivity.java"

# interfaces
.implements Lcom/facebook/b/a/f;


# instance fields
.field private p:Landroid/app/KeyguardManager;

.field private q:Lcom/facebook/common/e/h;

.field private r:Lcom/facebook/analytics/av;

.field private s:Landroid/app/PendingIntent;

.field private t:Lcom/facebook/c/k;

.field private u:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->j()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->l()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->n()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->u:Landroid/os/Handler;

    return-object v0
.end method

.method private j()V
    .locals 3

    .prologue
    .line 120
    invoke-direct {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->m()V

    .line 122
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->p:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->q:Lcom/facebook/common/e/h;

    const-string v1, "KeyguardPendingIntentActivity_inKeyguardRestrictedInputMode"

    const-string v2, "Keyguard should not be enabled"

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->finish()V

    .line 133
    :goto_0
    return-void

    .line 132
    :cond_0
    invoke-direct {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->k()V

    goto :goto_0
.end method

.method private k()V
    .locals 3

    .prologue
    .line 136
    invoke-virtual {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 137
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 138
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    .line 139
    new-instance v2, Lcom/facebook/common/keyguard/b;

    invoke-direct {v2, p0, v0}, Lcom/facebook/common/keyguard/b;-><init>(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 147
    return-void
.end method

.method private l()V
    .locals 4

    .prologue
    .line 153
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->u:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/common/keyguard/c;

    invoke-direct {v1, p0}, Lcom/facebook/common/keyguard/c;-><init>(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 171
    return-void
.end method

.method private m()V
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->t:Lcom/facebook/c/k;

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->t:Lcom/facebook/c/k;

    invoke-virtual {p0, v0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 176
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->t:Lcom/facebook/c/k;

    .line 178
    :cond_0
    return-void
.end method

.method private n()V
    .locals 5

    .prologue
    .line 181
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->s:Landroid/app/PendingIntent;

    if-nez v0, :cond_0

    .line 193
    :goto_0
    return-void

    .line 185
    :cond_0
    :try_start_0
    const-class v0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;

    const-string v1, "Launching intent: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->s:Landroid/app/PendingIntent;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->s:Landroid/app/PendingIntent;

    .line 187
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->s:Landroid/app/PendingIntent;

    .line 188
    invoke-virtual {v0}, Landroid/app/PendingIntent;->send()V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 189
    :catch_0
    move-exception v0

    .line 190
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "keyguard_pi_cancelled"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 191
    iget-object v1, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->r:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method


# virtual methods
.method public a_()Z
    .locals 1

    .prologue
    .line 198
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 51
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 52
    invoke-virtual {p0, v0, v0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->overridePendingTransition(II)V

    .line 54
    invoke-virtual {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 55
    const-class v0, Landroid/app/KeyguardManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    iput-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->p:Landroid/app/KeyguardManager;

    .line 56
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->q:Lcom/facebook/common/e/h;

    .line 57
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->r:Lcom/facebook/analytics/av;

    .line 58
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->u:Landroid/os/Handler;

    .line 60
    invoke-virtual {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 62
    :try_start_0
    const-string v1, "pendingIntent"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->s:Landroid/app/PendingIntent;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :goto_0
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->s:Landroid/app/PendingIntent;

    if-nez v0, :cond_0

    .line 71
    invoke-virtual {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->finish()V

    .line 73
    :cond_0
    return-void

    .line 63
    :catch_0
    move-exception v0

    .line 64
    iget-object v1, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->q:Lcom/facebook/common/e/h;

    const-string v2, "KeyguardPendingIntentActivity_getParcelableExtra_exception"

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->finish()V

    goto :goto_0
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 101
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onPause()V

    .line 105
    invoke-direct {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->m()V

    .line 106
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 77
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    .line 80
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->p:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    invoke-direct {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->j()V

    .line 97
    :goto_0
    return-void

    .line 84
    :cond_0
    new-instance v0, Lcom/facebook/c/k;

    const-string v1, "android.intent.action.USER_PRESENT"

    new-instance v2, Lcom/facebook/common/keyguard/a;

    invoke-direct {v2, p0}, Lcom/facebook/common/keyguard/a;-><init>(Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;)V

    invoke-direct {v0, v1, v2}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    iput-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->t:Lcom/facebook/c/k;

    .line 95
    iget-object v0, p0, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->t:Lcom/facebook/c/k;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.USER_PRESENT"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_0
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 110
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStop()V

    .line 113
    invoke-virtual {p0}, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;->finish()V

    .line 114
    return-void
.end method
