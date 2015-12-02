.class public Lcom/facebook/orca/chatheads/a/a;
.super Ljava/lang/Object;
.source "MenuItemSherlockWrapper.java"

# interfaces
.implements Landroid/view/MenuItem;
.implements Lcom/actionbarsherlock/a/c;


# instance fields
.field private final a:Lcom/actionbarsherlock/a/b;

.field private b:Landroid/view/SubMenu;

.field private c:Landroid/view/MenuItem$OnMenuItemClickListener;


# direct methods
.method public constructor <init>(Lcom/actionbarsherlock/a/b;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->b:Landroid/view/SubMenu;

    .line 20
    iput-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->c:Landroid/view/MenuItem$OnMenuItemClickListener;

    .line 24
    if-nez p1, :cond_0

    .line 25
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Wrapped menu item cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    .line 28
    return-void
.end method


# virtual methods
.method public a(Lcom/actionbarsherlock/a/b;)Z
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->c:Landroid/view/MenuItem$OnMenuItemClickListener;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->c:Landroid/view/MenuItem$OnMenuItemClickListener;

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v0

    .line 200
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public collapseActionView()Z
    .locals 1

    .prologue
    .line 249
    const/4 v0, 0x0

    return v0
.end method

.method public expandActionView()Z
    .locals 1

    .prologue
    .line 244
    const/4 v0, 0x0

    return v0
.end method

.method public getActionProvider()Landroid/view/ActionProvider;
    .locals 1

    .prologue
    .line 239
    const/4 v0, 0x0

    return-object v0
.end method

.method public getActionView()Landroid/view/View;
    .locals 1

    .prologue
    .line 229
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlphabeticShortcut()C
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->h()C

    move-result v0

    return v0
.end method

.method public getGroupId()I
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->c()I

    move-result v0

    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->q()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->g()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->d()I

    move-result v0

    return v0
.end method

.method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->v()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    return-object v0
.end method

.method public getNumericShortcut()C
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->i()C

    move-result v0

    return v0
.end method

.method public getOrder()I
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->e()I

    move-result v0

    return v0
.end method

.method public getSubMenu()Landroid/view/SubMenu;
    .locals 2

    .prologue
    .line 181
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/a/a;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->b:Landroid/view/SubMenu;

    if-nez v0, :cond_0

    .line 182
    new-instance v0, Lcom/facebook/orca/chatheads/a/c;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v1}, Lcom/actionbarsherlock/a/b;->m()Lcom/actionbarsherlock/a/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/a/c;-><init>(Lcom/actionbarsherlock/a/d;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->b:Landroid/view/SubMenu;

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->b:Landroid/view/SubMenu;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->o()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->p()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hasSubMenu()Z
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->n()Z

    move-result v0

    return v0
.end method

.method public isActionViewExpanded()Z
    .locals 1

    .prologue
    .line 254
    const/4 v0, 0x0

    return v0
.end method

.method public isCheckable()Z
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->r()Z

    move-result v0

    return v0
.end method

.method public isChecked()Z
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->t()Z

    move-result v0

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->b()Z

    move-result v0

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/b;->u()Z

    move-result v0

    return v0
.end method

.method public setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 234
    const/4 v0, 0x0

    return-object v0
.end method

.method public setActionView(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 224
    const/4 v0, 0x0

    return-object v0
.end method

.method public setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 219
    const/4 v0, 0x0

    return-object v0
.end method

.method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->a(C)Lcom/actionbarsherlock/a/b;

    .line 122
    return-object p0
.end method

.method public setCheckable(Z)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->b(Z)Lcom/actionbarsherlock/a/b;

    .line 133
    return-object p0
.end method

.method public setChecked(Z)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->d(Z)Lcom/actionbarsherlock/a/b;

    .line 144
    return-object p0
.end method

.method public setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->a(Z)Lcom/actionbarsherlock/a/b;

    .line 166
    return-object p0
.end method

.method public setIcon(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->b(I)Lcom/actionbarsherlock/a/b;

    .line 83
    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->a(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/a/b;

    .line 77
    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->a(Landroid/content/Intent;)Lcom/actionbarsherlock/a/b;

    .line 94
    return-object p0
.end method

.method public setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->b(C)Lcom/actionbarsherlock/a/b;

    .line 111
    return-object p0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 260
    const/4 v0, 0x0

    return-object v0
.end method

.method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 189
    iput-object p1, p0, Lcom/facebook/orca/chatheads/a/a;->c:Landroid/view/MenuItem$OnMenuItemClickListener;

    .line 191
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p0}, Lcom/actionbarsherlock/a/b;->a(Lcom/actionbarsherlock/a/c;)Lcom/actionbarsherlock/a/b;

    .line 192
    return-object p0
.end method

.method public setShortcut(CC)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/a/b;->a(CC)Lcom/actionbarsherlock/a/b;

    .line 105
    return-object p0
.end method

.method public setShowAsAction(I)V
    .locals 0

    .prologue
    .line 210
    return-void
.end method

.method public setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 214
    const/4 v0, 0x0

    return-object v0
.end method

.method public setTitle(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->a(I)Lcom/actionbarsherlock/a/b;

    .line 55
    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->a(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    .line 49
    return-object p0
.end method

.method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->b(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    .line 66
    return-object p0
.end method

.method public setVisible(Z)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/a;->a:Lcom/actionbarsherlock/a/b;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/b;->g(Z)Lcom/actionbarsherlock/a/b;

    .line 155
    return-object p0
.end method
