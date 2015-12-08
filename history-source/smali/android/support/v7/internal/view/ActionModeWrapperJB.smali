.class public Landroid/support/v7/internal/view/ActionModeWrapperJB;
.super Landroid/support/v7/internal/view/ActionModeWrapper;
.source "ActionModeWrapperJB.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/ActionModeWrapperJB$CallbackWrapper;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "frameworkActionMode"    # Landroid/view/ActionMode;

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapper;-><init>(Landroid/content/Context;Landroid/view/ActionMode;)V

    .line 29
    return-void
.end method


# virtual methods
.method public getTitleOptionalHint()Z
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapperJB;->mWrappedObject:Landroid/view/ActionMode;

    invoke-virtual {v0}, Landroid/view/ActionMode;->getTitleOptionalHint()Z

    move-result v0

    return v0
.end method

.method public isTitleOptional()Z
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapperJB;->mWrappedObject:Landroid/view/ActionMode;

    invoke-virtual {v0}, Landroid/view/ActionMode;->isTitleOptional()Z

    move-result v0

    return v0
.end method

.method public setTitleOptionalHint(Z)V
    .locals 1
    .param p1, "titleOptional"    # Z

    .prologue
    .line 38
    iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapperJB;->mWrappedObject:Landroid/view/ActionMode;

    invoke-virtual {v0, p1}, Landroid/view/ActionMode;->setTitleOptionalHint(Z)V

    .line 39
    return-void
.end method
