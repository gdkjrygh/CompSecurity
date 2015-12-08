.class public Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;
.super Landroid/widget/LinearLayout;
.source "NativeActionModeAwareLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;
    }
.end annotation


# instance fields
.field private mActionModeForChildListener:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method


# virtual methods
.method public setActionModeForChildListener(Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;)V
    .locals 0
    .param p1, "listener"    # Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;

    .prologue
    .line 37
    iput-object p1, p0, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;->mActionModeForChildListener:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;

    .line 38
    return-void
.end method

.method public startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 1
    .param p1, "originalView"    # Landroid/view/View;
    .param p2, "callback"    # Landroid/view/ActionMode$Callback;

    .prologue
    .line 42
    iget-object v0, p0, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;->mActionModeForChildListener:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;->mActionModeForChildListener:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;

    invoke-interface {v0, p2}, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;->onActionModeForChild(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p2

    .line 45
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object v0

    return-object v0
.end method
