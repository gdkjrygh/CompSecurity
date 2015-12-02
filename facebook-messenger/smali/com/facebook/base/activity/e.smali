.class Lcom/facebook/base/activity/e;
.super Ljava/lang/Object;
.source "DelegatingFbFragmentFrameworkActivity.java"

# interfaces
.implements Lcom/facebook/base/activity/n;


# instance fields
.field final synthetic a:Lcom/facebook/base/activity/d;


# direct methods
.method constructor <init>(Lcom/facebook/base/activity/d;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;I)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;)V

    .line 86
    return-void
.end method

.method public a(ILandroid/app/Dialog;)V
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1, p2}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;ILandroid/app/Dialog;)V

    .line 154
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/content/Intent;)V

    .line 90
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/content/res/Configuration;)V

    .line 162
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/os/Bundle;)V

    .line 74
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/support/v4/app/Fragment;)V

    .line 214
    return-void
.end method

.method public a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1, p2, p3}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 227
    return-void
.end method

.method public a(Lcom/facebook/common/d/e;)V
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Lcom/facebook/common/d/e;)V

    .line 182
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1, p2}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    return-void
.end method

.method public a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1, p2}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 174
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Z)V

    .line 222
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1, p2}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/Exception;)Z
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->a(Lcom/facebook/base/activity/d;Ljava/lang/Exception;)Z

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
    .line 169
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->b(Lcom/facebook/base/activity/d;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->b(Lcom/facebook/base/activity/d;)V

    .line 94
    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->b(Lcom/facebook/base/activity/d;Landroid/content/Intent;)V

    .line 259
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->b(Lcom/facebook/base/activity/d;Landroid/os/Bundle;)V

    .line 78
    return-void
.end method

.method public b(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1, p2}, Lcom/facebook/base/activity/d;->b(Lcom/facebook/base/activity/d;ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public b(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->b(Lcom/facebook/base/activity/d;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->b(Lcom/facebook/base/activity/d;Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->c(Lcom/facebook/base/activity/d;)V

    .line 102
    return-void
.end method

.method public c(I)V
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->c(Lcom/facebook/base/activity/d;I)V

    .line 243
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->c(Lcom/facebook/base/activity/d;Landroid/os/Bundle;)V

    .line 82
    return-void
.end method

.method public d(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->d(Lcom/facebook/base/activity/d;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->d(Lcom/facebook/base/activity/d;)V

    .line 106
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->d(Lcom/facebook/base/activity/d;Landroid/os/Bundle;)V

    .line 218
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->e(Lcom/facebook/base/activity/d;)V

    .line 110
    return-void
.end method

.method public e(I)V
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0, p1}, Lcom/facebook/base/activity/d;->e(Lcom/facebook/base/activity/d;I)V

    .line 263
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->f(Lcom/facebook/base/activity/d;)V

    .line 118
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->g(Lcom/facebook/base/activity/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->h(Lcom/facebook/base/activity/d;)Z

    move-result v0

    return v0
.end method

.method public i()V
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->i(Lcom/facebook/base/activity/d;)V

    .line 142
    return-void
.end method

.method public j()V
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->j(Lcom/facebook/base/activity/d;)V

    .line 146
    return-void
.end method

.method public k()V
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->k(Lcom/facebook/base/activity/d;)V

    .line 158
    return-void
.end method

.method public l()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->l(Lcom/facebook/base/activity/d;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public m()V
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->m(Lcom/facebook/base/activity/d;)V

    .line 206
    return-void
.end method

.method public n()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->n(Lcom/facebook/base/activity/d;)Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method public o()Landroid/view/Window;
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->o(Lcom/facebook/base/activity/d;)Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public p()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->p(Lcom/facebook/base/activity/d;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public q()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 254
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->q(Lcom/facebook/base/activity/d;)Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public r()Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->r(Lcom/facebook/base/activity/d;)Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public s()Z
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/facebook/base/activity/e;->a:Lcom/facebook/base/activity/d;

    invoke-static {v0}, Lcom/facebook/base/activity/d;->s(Lcom/facebook/base/activity/d;)Z

    move-result v0

    return v0
.end method
