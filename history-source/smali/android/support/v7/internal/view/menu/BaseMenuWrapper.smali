.class abstract Landroid/support/v7/internal/view/menu/BaseMenuWrapper;
.super Landroid/support/v7/internal/view/menu/BaseWrapper;
.source "BaseMenuWrapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v7/internal/view/menu/BaseWrapper",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private mMenuItems:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Landroid/view/MenuItem;",
            "Landroid/support/v4/internal/view/SupportMenuItem;",
            ">;"
        }
    .end annotation
.end field

.field private mSubMenus:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Landroid/view/SubMenu;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 33
    .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
    .local p1, "object":Ljava/lang/Object;, "TT;"
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/BaseWrapper;-><init>(Ljava/lang/Object;)V

    .line 34
    return-void
.end method


# virtual methods
.method final getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 2
    .param p1, "frameworkItem"    # Landroid/view/MenuItem;

    .prologue
    .line 37
    .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
    if-eqz p1, :cond_2

    .line 39
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    if-nez v1, :cond_0

    .line 40
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    .line 43
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/internal/view/SupportMenuItem;

    .line 45
    .local v0, "compatItem":Landroid/support/v4/internal/view/SupportMenuItem;
    if-nez v0, :cond_1

    .line 46
    invoke-static {p1}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createSupportMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    .line 47
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .end local v0    # "compatItem":Landroid/support/v4/internal/view/SupportMenuItem;
    :cond_1
    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2
    .param p1, "frameworkSubMenu"    # Landroid/view/SubMenu;

    .prologue
    .line 56
    .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
    if-eqz p1, :cond_2

    .line 58
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;

    if-nez v1, :cond_0

    .line 59
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;

    .line 62
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    .line 64
    .local v0, "compatSubMenu":Landroid/view/SubMenu;
    if-nez v0, :cond_1

    .line 65
    invoke-static {p1}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createSupportSubMenuWrapper(Landroid/view/SubMenu;)Landroid/support/v4/internal/view/SupportSubMenu;

    move-result-object v0

    .line 66
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .end local v0    # "compatSubMenu":Landroid/view/SubMenu;
    :cond_1
    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final internalClear()V
    .locals 1

    .prologue
    .line 75
    .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 78
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 81
    :cond_1
    return-void
.end method

.method final internalRemoveGroup(I)V
    .locals 3
    .param p1, "groupId"    # I

    .prologue
    .line 84
    .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    if-nez v2, :cond_1

    .line 97
    :cond_0
    return-void

    .line 88
    :cond_1
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 91
    .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Landroid/view/MenuItem;>;"
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 92
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/MenuItem;

    .line 93
    .local v1, "menuItem":Landroid/view/MenuItem;
    invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v2

    if-ne p1, v2, :cond_2

    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0
.end method

.method final internalRemoveItem(I)V
    .locals 3
    .param p1, "id"    # I

    .prologue
    .line 100
    .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    if-nez v2, :cond_1

    .line 114
    :cond_0
    :goto_0
    return-void

    .line 104
    :cond_1
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 107
    .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Landroid/view/MenuItem;>;"
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/MenuItem;

    .line 109
    .local v1, "menuItem":Landroid/view/MenuItem;
    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    if-ne p1, v2, :cond_2

    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0
.end method
