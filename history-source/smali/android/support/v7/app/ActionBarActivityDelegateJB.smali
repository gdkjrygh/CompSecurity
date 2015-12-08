.class Landroid/support/v7/app/ActionBarActivityDelegateJB;
.super Landroid/support/v7/app/ActionBarActivityDelegateICS;
.source "ActionBarActivityDelegateJB.java"


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0
    .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;

    .prologue
    .line 27
    invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 28
    return-void
.end method


# virtual methods
.method createActionModeCallbackWrapper(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "callback"    # Landroid/support/v7/view/ActionMode$Callback;

    .prologue
    .line 38
    new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapperJB$CallbackWrapper;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapperJB$CallbackWrapper;-><init>(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)V

    return-object v0
.end method

.method createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "frameworkMode"    # Landroid/view/ActionMode;

    .prologue
    .line 43
    new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapperJB;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapperJB;-><init>(Landroid/content/Context;Landroid/view/ActionMode;)V

    return-object v0
.end method

.method public createSupportActionBar()Landroid/support/v7/app/ActionBar;
    .locals 3

    .prologue
    .line 32
    new-instance v0, Landroid/support/v7/app/ActionBarImplJB;

    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateJB;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateJB;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {v0, v1, v2}, Landroid/support/v7/app/ActionBarImplJB;-><init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;)V

    return-object v0
.end method
