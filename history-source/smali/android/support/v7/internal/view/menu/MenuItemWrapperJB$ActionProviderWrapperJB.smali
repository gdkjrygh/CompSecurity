.class Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;
.super Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
.source "MenuItemWrapperJB.java"

# interfaces
.implements Landroid/support/v4/view/ActionProvider$VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ActionProviderWrapperJB"
.end annotation


# instance fields
.field mListener:Landroid/view/ActionProvider$VisibilityListener;

.field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;Landroid/support/v4/view/ActionProvider;)V
    .locals 0
    .param p2, "inner"    # Landroid/support/v4/view/ActionProvider;

    .prologue
    .line 38
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;-><init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/support/v4/view/ActionProvider;)V

    .line 40
    return-void
.end method


# virtual methods
.method public isVisible()Z
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->isVisible()Z

    move-result v0

    return v0
.end method

.method public onActionProviderVisibilityChanged(Z)V
    .locals 1
    .param p1, "isVisible"    # Z

    .prologue
    .line 71
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mListener:Landroid/view/ActionProvider$VisibilityListener;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mListener:Landroid/view/ActionProvider$VisibilityListener;

    invoke-interface {v0, p1}, Landroid/view/ActionProvider$VisibilityListener;->onActionProviderVisibilityChanged(Z)V

    .line 74
    :cond_0
    return-void
.end method

.method public onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 1
    .param p1, "forItem"    # Landroid/view/MenuItem;

    .prologue
    .line 44
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public overridesItemVisibility()Z
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    return v0
.end method

.method public refreshVisibility()V
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->refreshVisibility()V

    .line 60
    return-void
.end method

.method public setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/view/ActionProvider$VisibilityListener;

    .prologue
    .line 65
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mListener:Landroid/view/ActionProvider$VisibilityListener;

    .line 66
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;

    if-eqz p1, :cond_0

    .end local p0    # "this":Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;
    :goto_0
    invoke-virtual {v0, p0}, Landroid/support/v4/view/ActionProvider;->setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V

    .line 67
    return-void

    .line 66
    .restart local p0    # "this":Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;
    :cond_0
    const/4 p0, 0x0

    goto :goto_0
.end method
