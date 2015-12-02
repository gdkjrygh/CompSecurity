.class public Lcom/facebook/orca/threadview/ThreadViewActivity;
.super Lcom/facebook/base/activity/i;
.source "ThreadViewActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/b/a/f;
.implements Lcom/facebook/orca/activity/k;


# instance fields
.field private p:Lcom/facebook/orca/threadview/ThreadViewFragment;

.field private q:Lcom/facebook/orca/nux/ThreadTitleNuxView;

.field private r:Lcom/facebook/orca/nux/u;

.field private s:Lcom/facebook/analytics/av;

.field private t:Lcom/facebook/orca/common/ui/titlebar/a;

.field private u:Lcom/facebook/orca/d/m;

.field private v:Lcom/facebook/orca/d/af;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a_()Z
    .locals 1

    .prologue
    .line 198
    const/4 v0, 0x1

    return v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/16 v3, 0xff

    .line 59
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 61
    sget v0, Lcom/facebook/k;->orca_thread_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->setContentView(I)V

    .line 63
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 64
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->s:Lcom/facebook/analytics/av;

    .line 65
    const-class v0, Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->t:Lcom/facebook/orca/common/ui/titlebar/a;

    .line 66
    const-class v0, Lcom/facebook/orca/d/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/m;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->u:Lcom/facebook/orca/d/m;

    .line 67
    const-class v0, Lcom/facebook/orca/d/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/af;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->v:Lcom/facebook/orca/d/af;

    .line 70
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 71
    sget v0, Lcom/facebook/i;->thread_title_nux:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/ThreadTitleNuxView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->q:Lcom/facebook/orca/nux/ThreadTitleNuxView;

    .line 73
    const-class v0, Lcom/facebook/orca/nux/u;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/u;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->r:Lcom/facebook/orca/nux/u;

    .line 75
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Landroid/content/Intent;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->r:Lcom/facebook/orca/nux/u;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->q:Lcom/facebook/orca/nux/ThreadTitleNuxView;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/nux/u;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/orca/nux/ThreadTitleNuxView;)V

    .line 78
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    sget v2, Lcom/facebook/i;->thread_view_fragment:I

    invoke-virtual {v0, v2}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    .line 80
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/widget/titlebar/a;)V

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 83
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 84
    const-string v1, "from_notification"

    invoke-static {v0, v1, v4}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 89
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b()V

    .line 91
    :cond_0
    const-string v1, "focus_compose"

    invoke-static {v0, v1, v4}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 93
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->c()V

    .line 96
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;)Lcom/facebook/orca/compose/ai;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/compose/ai;)V

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->t:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Landroid/app/Activity;)V

    .line 102
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 104
    return-void
.end method

.method public c()Lcom/facebook/orca/common/ui/titlebar/a;
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->t:Lcom/facebook/orca/common/ui/titlebar/a;

    return-object v0
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 54
    sget-object v0, Lcom/facebook/analytics/f/a;->THREAD_VIEW_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public j()Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->O()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 159
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    :cond_0
    :goto_0
    return-void

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->t:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 168
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 188
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 189
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->t:Lcom/facebook/orca/common/ui/titlebar/a;

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->t:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->e()V

    .line 194
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    .line 114
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->s:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "android_button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "back"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/i;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 135
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onPause()V

    .line 136
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->u:Lcom/facebook/orca/d/m;

    invoke-virtual {v0}, Lcom/facebook/orca/d/m;->a()V

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->v:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 138
    return-void
.end method

.method protected onResume()V
    .locals 4

    .prologue
    .line 142
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    .line 143
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 145
    if-eqz v0, :cond_0

    .line 146
    const-string v1, "trigger"

    invoke-static {v0, v1}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 147
    if-eqz v0, :cond_0

    .line 148
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->s:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "show_module"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewActivity;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "trigger"

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 152
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Ljava/lang/String;)V

    .line 155
    :cond_0
    return-void
.end method

.method public onUserInteraction()V
    .locals 1

    .prologue
    .line 127
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onUserInteraction()V

    .line 128
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d()V

    .line 131
    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .prologue
    .line 108
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onWindowFocusChanged(Z)V

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewActivity;->p:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Z)V

    .line 110
    return-void
.end method
