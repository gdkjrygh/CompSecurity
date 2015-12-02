.class public abstract Lcom/facebook/base/activity/o;
.super Lcom/google/android/maps/MapActivity;
.source "FbMapActivity.java"

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
    invoke-direct {p0}, Lcom/google/android/maps/MapActivity;-><init>()V

    .line 30
    new-instance v0, Lcom/facebook/base/i;

    invoke-direct {v0}, Lcom/facebook/base/i;-><init>()V

    iput-object v0, p0, Lcom/facebook/base/activity/o;->a:Lcom/facebook/base/i;

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
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/o;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 284
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/activity/o;->a:Lcom/facebook/base/i;

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
    iget-object v0, p0, Lcom/facebook/base/activity/o;->a:Lcom/facebook/base/i;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    return-void
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 2

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 134
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    const/4 v0, 0x1

    .line 138
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
    .line 183
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->finish()V

    .line 184
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 185
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->i(Landroid/app/Activity;)V

    goto :goto_0

    .line 187
    :cond_0
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/facebook/base/activity/o;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 289
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/maps/MapActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 290
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    .line 222
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 223
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->l(Landroid/app/Activity;)Z

    move-result v0

    .line 224
    if-eqz v0, :cond_0

    .line 229
    :goto_0
    return-void

    .line 228
    :cond_1
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onBackPressed()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 233
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 234
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 235
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;Landroid/content/res/Configuration;)V

    goto :goto_0

    .line 237
    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 191
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onContentChanged()V

    .line 192
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 193
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->j(Landroid/app/Activity;)V

    goto :goto_0

    .line 195
    :cond_0
    return-void
.end method

.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/base/activity/o;->b()Lcom/facebook/inject/t;

    move-result-object v0

    .line 41
    const-class v1, Lcom/facebook/base/activity/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    .line 42
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/o;->a(Landroid/os/Bundle;)V

    .line 45
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    invoke-virtual {p0}, Lcom/facebook/base/activity/o;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    :cond_1
    return-void

    .line 52
    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/base/activity/o;->b(Landroid/os/Bundle;)V

    .line 53
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    .line 199
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 200
    invoke-interface {v0, p0, p1}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;I)Landroid/app/Dialog;

    move-result-object v0

    .line 201
    if-eqz v0, :cond_0

    .line 205
    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 252
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 110
    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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

    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onDestroy()V

    throw v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onDestroy()V

    .line 116
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 162
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    .line 163
    if-eqz v0, :cond_0

    .line 164
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 167
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Lcom/google/android/maps/MapActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 173
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->b(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    .line 174
    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 178
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Lcom/google/android/maps/MapActivity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 268
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 90
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onPause()V

    .line 91
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onPostCreate(Landroid/os/Bundle;)V

    .line 67
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    .line 211
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 212
    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/base/activity/f;->a(Landroid/app/Activity;ILandroid/app/Dialog;)Z

    move-result v0

    .line 213
    if-eqz v0, :cond_0

    .line 218
    :goto_0
    return-void

    .line 217
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/google/android/maps/MapActivity;->onPrepareDialog(ILandroid/app/Dialog;)V

    goto :goto_0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 260
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 98
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onResume()V

    .line 101
    invoke-static {}, Lcom/facebook/base/activity/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/activity/o;->c:Ljava/lang/String;

    .line 102
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    .line 150
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/f;

    .line 151
    invoke-interface {v0, p0}, Lcom/facebook/base/activity/f;->k(Landroid/app/Activity;)Ljava/lang/Boolean;

    move-result-object v0

    .line 152
    if-eqz v0, :cond_0

    .line 153
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 156
    :goto_0
    return v0

    :cond_1
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onSearchRequested()Z

    move-result v0

    goto :goto_0
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 74
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onStart()V

    .line 75
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onStop()V

    .line 83
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onUserInteraction()V

    .line 121
    iget-object v0, p0, Lcom/facebook/base/activity/o;->b:Ljava/util/Set;

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
