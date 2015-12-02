.class public Landroid/support/v7/app/ActionBarActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "360Security"

# interfaces
.implements Landroid/support/v4/app/af$a;
.implements Landroid/support/v7/app/ActionBar$a;


# instance fields
.field n:Landroid/support/v7/app/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 419
    invoke-static {p0}, Landroid/support/v4/app/l;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/support/v4/app/af;)V
    .locals 0

    .prologue
    .line 338
    invoke-virtual {p1, p0}, Landroid/support/v4/app/af;->a(Landroid/app/Activity;)Landroid/support/v4/app/af;

    .line 339
    return-void
.end method

.method public a(Landroid/support/v7/b/a;)V
    .locals 0

    .prologue
    .line 183
    return-void
.end method

.method a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 221
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->setContentView(Landroid/view/View;)V

    .line 222
    return-void
.end method

.method a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 225
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 226
    return-void
.end method

.method a(ILandroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 233
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method a(ILandroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 245
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method a(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 237
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public a(Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 436
    invoke-static {p0, p1}, Landroid/support/v4/app/l;->a(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method

.method protected a(Landroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/a;->a(Landroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method a_(I)V
    .locals 0

    .prologue
    .line 217
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->setContentView(I)V

    .line 218
    return-void
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/a;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 452
    invoke-static {p0, p1}, Landroid/support/v4/app/l;->b(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 453
    return-void
.end method

.method public b(Landroid/support/v4/app/af;)V
    .locals 0

    .prologue
    .line 357
    return-void
.end method

.method public b(Landroid/support/v7/b/a;)V
    .locals 0

    .prologue
    .line 192
    return-void
.end method

.method b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 229
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    return-void
.end method

.method b(Landroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 241
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->a(Landroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 170
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 171
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->c()V

    .line 173
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0}, Landroid/support/v7/app/a;->f()V

    .line 174
    return-void
.end method

.method public f()Landroid/support/v7/app/ActionBar;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0}, Landroid/support/v7/app/a;->b()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 2

    .prologue
    .line 383
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivity;->a()Landroid/content/Intent;

    move-result-object v0

    .line 385
    if-eqz v0, :cond_1

    .line 386
    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarActivity;->a(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 387
    invoke-static {p0}, Landroid/support/v4/app/af;->a(Landroid/content/Context;)Landroid/support/v4/app/af;

    move-result-object v0

    .line 388
    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarActivity;->a(Landroid/support/v4/app/af;)V

    .line 389
    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarActivity;->b(Landroid/support/v4/app/af;)V

    .line 390
    invoke-virtual {v0}, Landroid/support/v4/app/af;->a()V

    .line 393
    :try_start_0
    invoke-static {p0}, Landroid/support/v4/app/a;->a(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 404
    :goto_0
    const/4 v0, 0x1

    .line 406
    :goto_1
    return v0

    .line 394
    :catch_0
    move-exception v0

    .line 397
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivity;->finish()V

    goto :goto_0

    .line 402
    :cond_0
    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarActivity;->b(Landroid/content/Intent;)V

    goto :goto_0

    .line 406
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0}, Landroid/support/v7/app/a;->c()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 0

    .prologue
    .line 472
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0}, Landroid/support/v7/app/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onBackPressed()V

    .line 253
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 104
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 105
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a;->a(Landroid/content/res/Configuration;)V

    .line 106
    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    .prologue
    .line 464
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0}, Landroid/support/v7/app/a;->h()V

    .line 465
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 97
    invoke-static {p0}, Landroid/support/v7/app/a;->a(Landroid/support/v7/app/ActionBarActivity;)Landroid/support/v7/app/a;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    .line 98
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 99
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a;->a(Landroid/os/Bundle;)V

    .line 100
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/a;->a(ILandroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 122
    if-nez p1, :cond_0

    .line 123
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a;->b(I)Landroid/view/View;

    move-result-object v0

    .line 125
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 3

    .prologue
    .line 131
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/a;->a(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    const/4 v0, 0x1

    .line 140
    :goto_0
    return v0

    .line 135
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivity;->f()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    .line 136
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x102002c

    if-ne v1, v2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBar;->c()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    .line 138
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivity;->g()Z

    move-result v0

    goto :goto_0

    .line 140
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onPostResume()V
    .locals 1

    .prologue
    .line 116
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPostResume()V

    .line 117
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0}, Landroid/support/v7/app/a;->e()V

    .line 118
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/app/a;->a(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 110
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V

    .line 111
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0}, Landroid/support/v7/app/a;->d()V

    .line 112
    return-void
.end method

.method protected onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 1

    .prologue
    .line 145
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 146
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a;->a(Ljava/lang/CharSequence;)V

    .line 147
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a;->a(I)V

    .line 78
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a;->a(Landroid/view/View;)V

    .line 83
    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivity;->n:Landroid/support/v7/app/a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/a;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 88
    return-void
.end method
