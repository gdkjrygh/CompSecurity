.class public Lcom/facebook/base/activity/p;
.super Landroid/preference/PreferenceActivity;
.source "FbPreferenceActivity.java"

# interfaces
.implements Lcom/facebook/base/activity/h;
.implements Lcom/facebook/base/h;


# instance fields
.field private final a:Lcom/facebook/base/i;

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/activity/f;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    .line 30
    new-instance v0, Lcom/facebook/base/i;

    invoke-direct {v0}, Lcom/facebook/base/i;-><init>()V

    iput-object v0, p0, Lcom/facebook/base/activity/p;->a:Lcom/facebook/base/i;

    return-void
.end method


# virtual methods
.method protected a(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .prologue
    .line 243
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/p;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 284
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/activity/p;->a:Lcom/facebook/base/i;

    invoke-virtual {v0, p1}, Lcom/facebook/base/i;->a(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 59
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lcom/facebook/base/activity/p;->a:Lcom/facebook/base/i;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    return-void
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 133
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const/4 v0, 0x1

    .line 137
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 239
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 62
    return-void
.end method

.method public finish()V
    .locals 2

    .prologue
    .line 182
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->finish()V

    .line 183
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 184
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->i(Landroid/app/Activity;)V

    goto :goto_0

    .line 186
    :cond_0
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/base/activity/p;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 289
    invoke-super {p0, p1, p2, p3}, Landroid/preference/PreferenceActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 290
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 291
    invoke-interface {v0, p0, p1, p2, p3}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;IILandroid/content/Intent;)V

    goto :goto_0

    .line 293
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 222
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->l(Landroid/app/Activity;)Z

    move-result v0

    .line 223
    if-eqz v0, :cond_0

    .line 228
    :goto_0
    return-void

    .line 227
    :cond_1
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 232
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 233
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 234
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/content/res/Configuration;)V

    goto :goto_0

    .line 236
    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 190
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onContentChanged()V

    .line 191
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 192
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->j(Landroid/app/Activity;)V

    goto :goto_0

    .line 194
    :cond_0
    return-void
.end method

.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/base/activity/p;->b()Lcom/facebook/inject/t;

    move-result-object v0

    .line 41
    const-class v1, Lcom/facebook/base/activity/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    .line 42
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/p;->a(Landroid/os/Bundle;)V

    .line 45
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 46
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->f(Landroid/app/Activity;)V

    .line 47
    invoke-virtual {p0}, Lcom/facebook/base/activity/p;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    :cond_1
    return-void

    .line 52
    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/p;->b(Landroid/os/Bundle;)V

    .line 53
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 54
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->g(Landroid/app/Activity;)V

    goto :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 199
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;I)Landroid/app/Dialog;

    move-result-object v0

    .line 200
    if-eqz v0, :cond_0

    .line 204
    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 252
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 253
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/view/Menu;)V

    goto :goto_0

    .line 255
    :cond_0
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 110
    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 111
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->h(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    throw v0

    :cond_0
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    .line 116
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 161
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    .line 162
    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 166
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/preference/PreferenceActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 172
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->b(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    .line 173
    if-eqz v0, :cond_0

    .line 174
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 177
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/preference/PreferenceActivity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 268
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 269
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/view/MenuItem;)Z

    move-result v0

    .line 270
    if-eqz v0, :cond_0

    .line 271
    const/4 v0, 0x1

    .line 274
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 90
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onPause()V

    .line 91
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 92
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->c(Landroid/app/Activity;)V

    goto :goto_0

    .line 94
    :cond_0
    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 66
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onPostCreate(Landroid/os/Bundle;)V

    .line 67
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 68
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 70
    :cond_0
    return-void
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 2

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 211
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;ILandroid/app/Dialog;)Z

    move-result v0

    .line 212
    if-eqz v0, :cond_0

    .line 217
    :goto_0
    return-void

    .line 216
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/preference/PreferenceActivity;->onPrepareDialog(ILandroid/app/Dialog;)V

    goto :goto_0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 260
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 261
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/f;->b(Landroid/view/Menu;)V

    goto :goto_0

    .line 263
    :cond_0
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 98
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onResume()V

    .line 101
    invoke-static {}, Lcom/facebook/base/activity/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/activity/p;->c:Ljava/lang/String;

    .line 102
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 103
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->b(Landroid/app/Activity;)V

    goto :goto_0

    .line 105
    :cond_0
    return-void
.end method

.method public onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 128
    const/4 v0, 0x0

    return-object v0
.end method

.method public onSearchRequested()Z
    .locals 2

    .prologue
    .line 149
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 150
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->k(Landroid/app/Activity;)Ljava/lang/Boolean;

    move-result-object v0

    .line 151
    if-eqz v0, :cond_0

    .line 152
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 155
    :goto_0
    return v0

    :cond_1
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onSearchRequested()Z

    move-result v0

    goto :goto_0
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 74
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStart()V

    .line 75
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 76
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;)V

    goto :goto_0

    .line 78
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 82
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStop()V

    .line 83
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 84
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->d(Landroid/app/Activity;)V

    goto :goto_0

    .line 86
    :cond_0
    return-void
.end method

.method public onUserInteraction()V
    .locals 2

    .prologue
    .line 120
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onUserInteraction()V

    .line 121
    iget-object v0, p0, Lcom/facebook/base/activity/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 122
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->e(Landroid/app/Activity;)V

    goto :goto_0

    .line 124
    :cond_0
    return-void
.end method
