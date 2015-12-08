.class public final Landroid/support/v7/internal/view/menu/MenuWrapperFactory;
.super Ljava/lang/Object;
.source "MenuWrapperFactory.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public static createMenuItemWrapper(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2
    .param p0, "frameworkMenuItem"    # Landroid/view/MenuItem;

    .prologue
    .line 41
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 42
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;-><init>(Landroid/view/MenuItem;)V

    move-object p0, v0

    .line 46
    .end local p0    # "frameworkMenuItem":Landroid/view/MenuItem;
    :cond_0
    :goto_0
    return-object p0

    .line 43
    .restart local p0    # "frameworkMenuItem":Landroid/view/MenuItem;
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 44
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;-><init>(Landroid/view/MenuItem;)V

    move-object p0, v0

    goto :goto_0
.end method

.method public static createMenuWrapper(Landroid/view/Menu;)Landroid/view/Menu;
    .locals 2
    .param p0, "frameworkMenu"    # Landroid/view/Menu;

    .prologue
    .line 34
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 35
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;-><init>(Landroid/view/Menu;)V

    move-object p0, v0

    .line 37
    .end local p0    # "frameworkMenu":Landroid/view/Menu;
    :cond_0
    return-object p0
.end method

.method public static createSupportMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 2
    .param p0, "frameworkMenuItem"    # Landroid/view/MenuItem;

    .prologue
    .line 66
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 67
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;-><init>(Landroid/view/MenuItem;)V

    .line 69
    :goto_0
    return-object v0

    .line 68
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    .line 69
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;-><init>(Landroid/view/MenuItem;)V

    goto :goto_0

    .line 71
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public static createSupportMenuWrapper(Landroid/view/Menu;)Landroid/support/v4/internal/view/SupportMenu;
    .locals 2
    .param p0, "frameworkMenu"    # Landroid/view/Menu;

    .prologue
    .line 50
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 51
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;-><init>(Landroid/view/Menu;)V

    return-object v0

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public static createSupportSubMenuWrapper(Landroid/view/SubMenu;)Landroid/support/v4/internal/view/SupportSubMenu;
    .locals 2
    .param p0, "frameworkSubMenu"    # Landroid/view/SubMenu;

    .prologue
    .line 58
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 59
    new-instance v0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;-><init>(Landroid/view/SubMenu;)V

    return-object v0

    .line 61
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
