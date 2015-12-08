.class public Landroid/support/v7/internal/view/ActionModeWrapperJB$CallbackWrapper;
.super Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
.source "ActionModeWrapperJB.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/ActionModeWrapperJB;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallbackWrapper"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "supportCallback"    # Landroid/support/v7/view/ActionMode$Callback;

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;-><init>(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)V

    .line 53
    return-void
.end method


# virtual methods
.method protected createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mode"    # Landroid/view/ActionMode;

    .prologue
    .line 57
    new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapperJB;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapperJB;-><init>(Landroid/content/Context;Landroid/view/ActionMode;)V

    return-object v0
.end method
