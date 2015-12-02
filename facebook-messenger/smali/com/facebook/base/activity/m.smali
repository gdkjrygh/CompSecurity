.class Lcom/facebook/base/activity/m;
.super Ljava/lang/Object;
.source "FbFragmentActivityDelegate.java"

# interfaces
.implements Lcom/facebook/base/activity/n;


# instance fields
.field final synthetic a:Lcom/facebook/base/activity/l;


# direct methods
.method constructor <init>(Lcom/facebook/base/activity/l;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(I)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 244
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->e_()V

    .line 129
    return-void
.end method

.method public a(ILandroid/app/Dialog;)V
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/activity/l;->a(ILandroid/app/Dialog;)V

    .line 197
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/content/Intent;)V

    .line 133
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/content/res/Configuration;)V

    .line 205
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/os/Bundle;)V

    .line 117
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/support/v4/app/Fragment;)V

    .line 257
    return-void
.end method

.method public a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 269
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/base/activity/l;->a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 270
    return-void
.end method

.method public a(Lcom/facebook/common/d/e;)V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Lcom/facebook/common/d/e;)V

    .line 225
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/activity/l;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 241
    return-void
.end method

.method public a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/activity/l;->a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 217
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Z)V

    .line 265
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/activity/l;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 277
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->a(Ljava/lang/Exception;)Z

    move-result v0

    return v0
.end method

.method public b(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .prologue
    .line 212
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->b(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->d()V

    .line 137
    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->b(Landroid/content/Intent;)V

    .line 302
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->b(Landroid/os/Bundle;)V

    .line 121
    return-void
.end method

.method public b(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/activity/l;->b(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public b(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->b(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->b(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->e()V

    .line 145
    return-void
.end method

.method public c(I)V
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->c(I)V

    .line 286
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->c(Landroid/os/Bundle;)V

    .line 125
    return-void
.end method

.method public d(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->f()V

    .line 149
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 260
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->d(Landroid/os/Bundle;)V

    .line 261
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->g()V

    .line 153
    return-void
.end method

.method public e(I)V
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0, p1}, Lcom/facebook/base/activity/l;->e(I)V

    .line 306
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->h()V

    .line 161
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->j()Z

    move-result v0

    return v0
.end method

.method public i()V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->k()V

    .line 185
    return-void
.end method

.method public j()V
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->l()V

    .line 189
    return-void
.end method

.method public k()V
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->m()V

    .line 201
    return-void
.end method

.method public l()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->n()Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public m()V
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->o()V

    .line 249
    return-void
.end method

.method public n()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->p()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method public o()Landroid/view/Window;
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->q()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public p()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->r()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public q()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->s()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public r()Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->t()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public s()Z
    .locals 1

    .prologue
    .line 313
    iget-object v0, p0, Lcom/facebook/base/activity/m;->a:Lcom/facebook/base/activity/l;

    invoke-virtual {v0}, Lcom/facebook/base/activity/l;->u()Z

    move-result v0

    return v0
.end method
