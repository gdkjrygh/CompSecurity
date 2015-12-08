.class Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;
.super Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
.source "MenuItemWrapperJB.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/view/MenuItem;)V
    .locals 1
    .param p1, "object"    # Landroid/view/MenuItem;

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;-><init>(Landroid/view/MenuItem;Z)V

    .line 27
    return-void
.end method


# virtual methods
.method createActionProviderWrapper(Landroid/support/v4/view/ActionProvider;)Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
    .locals 1
    .param p1, "provider"    # Landroid/support/v4/view/ActionProvider;

    .prologue
    .line 31
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;-><init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;Landroid/support/v4/view/ActionProvider;)V

    return-object v0
.end method
