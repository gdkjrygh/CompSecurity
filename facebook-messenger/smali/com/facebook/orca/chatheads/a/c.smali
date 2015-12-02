.class public Lcom/facebook/orca/chatheads/a/c;
.super Lcom/facebook/orca/chatheads/a/b;
.source "SubMenuSherlockWrapper.java"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field private final a:Lcom/actionbarsherlock/a/d;

.field private b:Landroid/view/MenuItem;


# direct methods
.method public constructor <init>(Lcom/actionbarsherlock/a/d;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/a/b;-><init>(Lcom/actionbarsherlock/a/a;)V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->b:Landroid/view/MenuItem;

    .line 19
    iput-object p1, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    .line 20
    return-void
.end method


# virtual methods
.method public clearHeader()V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/d;->m()V

    .line 56
    return-void
.end method

.method public getItem()Landroid/view/MenuItem;
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->b:Landroid/view/MenuItem;

    if-nez v0, :cond_0

    .line 73
    new-instance v0, Lcom/facebook/orca/chatheads/a/a;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v1}, Lcom/actionbarsherlock/a/d;->q()Lcom/actionbarsherlock/a/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/a/a;-><init>(Lcom/actionbarsherlock/a/b;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->b:Landroid/view/MenuItem;

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->b:Landroid/view/MenuItem;

    return-object v0
.end method

.method public setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/d;->l(I)Lcom/actionbarsherlock/a/d;

    .line 38
    return-object p0
.end method

.method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/d;->c(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/a/d;

    .line 44
    return-object p0
.end method

.method public setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/d;->m(I)Lcom/actionbarsherlock/a/d;

    .line 26
    return-object p0
.end method

.method public setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/d;->d(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;

    .line 32
    return-object p0
.end method

.method public setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/d;->b(Landroid/view/View;)Lcom/actionbarsherlock/a/d;

    .line 50
    return-object p0
.end method

.method public setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/d;->k(I)Lcom/actionbarsherlock/a/d;

    .line 61
    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/c;->a:Lcom/actionbarsherlock/a/d;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/a/d;

    .line 67
    return-object p0
.end method
