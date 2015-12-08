.class Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;
.super Landroid/support/v7/internal/view/menu/MenuWrapperICS;
.source "SubMenuWrapperICS.java"

# interfaces
.implements Landroid/support/v4/internal/view/SupportSubMenu;


# direct methods
.method constructor <init>(Landroid/view/SubMenu;)V
    .locals 0
    .param p1, "subMenu"    # Landroid/view/SubMenu;

    .prologue
    .line 27
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;-><init>(Landroid/view/Menu;)V

    .line 28
    return-void
.end method


# virtual methods
.method public clearHeader()V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    .line 68
    return-void
.end method

.method public getItem()Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public getWrappedObject()Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    return-object v0
.end method

.method public bridge synthetic getWrappedObject()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->getWrappedObject()Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 1
    .param p1, "iconRes"    # I

    .prologue
    .line 49
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(I)Landroid/view/SubMenu;

    .line 50
    return-object p0
.end method

.method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    .line 56
    return-object p0
.end method

.method public setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 1
    .param p1, "titleRes"    # I

    .prologue
    .line 37
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(I)Landroid/view/SubMenu;

    .line 38
    return-object p0
.end method

.method public setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 43
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 44
    return-object p0
.end method

.method public setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 61
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;

    .line 62
    return-object p0
.end method

.method public setIcon(I)Landroid/view/SubMenu;
    .locals 1
    .param p1, "iconRes"    # I

    .prologue
    .line 72
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(I)Landroid/view/SubMenu;

    .line 73
    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 78
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/SubMenu;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    .line 79
    return-object p0
.end method
