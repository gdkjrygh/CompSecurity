.class Landroid/support/v7/app/ActionBarActivityDelegateICS;
.super Landroid/support/v7/app/ActionBarActivityDelegate;
.source "ActionBarActivityDelegateICS.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;
    }
.end annotation


# instance fields
.field mMenu:Landroid/view/Menu;


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0
    .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;

    .prologue
    .line 41
    invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegate;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 42
    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "lp"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 120
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superAddContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    return-void
.end method

.method createActionModeCallbackWrapper(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "callback"    # Landroid/support/v7/view/ActionMode$Callback;

    .prologue
    .line 241
    new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;-><init>(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)V

    return-object v0
.end method

.method createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "frameworkMode"    # Landroid/view/ActionMode;

    .prologue
    .line 246
    new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapper;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapper;-><init>(Landroid/content/Context;Landroid/view/ActionMode;)V

    return-object v0
.end method

.method public createSupportActionBar()Landroid/support/v7/app/ActionBar;
    .locals 3

    .prologue
    .line 46
    new-instance v0, Landroid/support/v7/app/ActionBarImplICS;

    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {v0, v1, v2}, Landroid/support/v7/app/ActionBarImplICS;-><init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;)V

    return-object v0
.end method

.method createWindowCallbackWrapper(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
    .locals 1
    .param p1, "cb"    # Landroid/view/Window$Callback;

    .prologue
    .line 88
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateICS;Landroid/view/Window$Callback;)V

    return-object v0
.end method

.method getHomeAsUpIndicatorAttrId()I
    .locals 1

    .prologue
    .line 236
    const v0, 0x101030b

    return v0
.end method

.method public onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 2
    .param p1, "mode"    # Landroid/view/ActionMode;

    .prologue
    .line 220
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->getActionBarThemedContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportActionModeFinished(Landroid/support/v7/view/ActionMode;)V

    .line 222
    return-void
.end method

.method public onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 2
    .param p1, "mode"    # Landroid/view/ActionMode;

    .prologue
    .line 195
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->getActionBarThemedContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportActionModeStarted(Landroid/support/v7/view/ActionMode;)V

    .line 197
    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    .prologue
    .line 231
    const/4 v0, 0x0

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 93
    return-void
.end method

.method public onContentChanged()V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V

    .line 127
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v3, 0x1

    .line 52
    const-string v1, "splitActionBarWhenNarrow"

    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->getUiOptionsFromMetadata()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 53
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Landroid/view/Window;->setUiOptions(II)V

    .line 57
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegate;->onCreate(Landroid/os/Bundle;)V

    .line 59
    iget-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mHasActionBar:Z

    if-eqz v1, :cond_1

    .line 62
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->requestWindowFeature(I)Z

    .line 64
    :cond_1
    iget-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mOverlayActionBar:Z

    if-eqz v1, :cond_2

    .line 65
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->requestWindowFeature(I)Z

    .line 83
    :cond_2
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 84
    .local v0, "w":Landroid/view/Window;
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createWindowCallbackWrapper(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 85
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 2
    .param p1, "featureId"    # I
    .param p2, "menu"    # Landroid/view/Menu;

    .prologue
    .line 142
    if-eqz p1, :cond_0

    const/16 v0, 0x8

    if-ne p1, v0, :cond_2

    .line 143
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;

    if-nez v0, :cond_1

    .line 144
    invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuWrapper(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;

    .line 146
    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/app/ActionBarActivity;->superOnCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    .line 148
    :goto_0
    return v0

    :cond_2
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1
    .param p1, "featureId"    # I

    .prologue
    .line 137
    const/4 v0, 0x0

    return-object v0
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1
    .param p1, "featureId"    # I
    .param p2, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 161
    if-nez p1, :cond_0

    .line 162
    invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuItemWrapper(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p2

    .line 164
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPostResume()V
    .locals 0

    .prologue
    .line 101
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 2
    .param p1, "featureId"    # I
    .param p2, "view"    # Landroid/view/View;
    .param p3, "menu"    # Landroid/view/Menu;

    .prologue
    .line 153
    if-eqz p1, :cond_0

    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    .line 154
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v7/app/ActionBarActivity;->superOnPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    .line 156
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/app/ActionBarActivity;->superOnPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 97
    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 170
    return-void
.end method

.method public setContentView(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 110
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(I)V

    .line 111
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 105
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(Landroid/view/View;)V

    .line 106
    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "lp"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 115
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 116
    return-void
.end method

.method setSupportProgress(I)V
    .locals 1
    .param p1, "progress"    # I

    .prologue
    .line 216
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->setProgress(I)V

    .line 217
    return-void
.end method

.method setSupportProgressBarIndeterminate(Z)V
    .locals 1
    .param p1, "indeterminate"    # Z

    .prologue
    .line 211
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->setProgressBarIndeterminate(Z)V

    .line 212
    return-void
.end method

.method setSupportProgressBarIndeterminateVisibility(Z)V
    .locals 1
    .param p1, "visible"    # Z

    .prologue
    .line 206
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->setProgressBarIndeterminateVisibility(Z)V

    .line 207
    return-void
.end method

.method setSupportProgressBarVisibility(Z)V
    .locals 1
    .param p1, "visible"    # Z

    .prologue
    .line 201
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->setProgressBarVisibility(Z)V

    .line 202
    return-void
.end method

.method public startSupportActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
    .locals 6
    .param p1, "callback"    # Landroid/support/v7/view/ActionMode$Callback;

    .prologue
    .line 174
    if-nez p1, :cond_0

    .line 175
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "ActionMode callback can not be null."

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 178
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->getActionBarThemedContext()Landroid/content/Context;

    move-result-object v0

    .line 180
    .local v0, "context":Landroid/content/Context;
    invoke-virtual {p0, v0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createActionModeCallbackWrapper(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;

    move-result-object v2

    .line 182
    .local v2, "wrappedCallback":Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
    const/4 v3, 0x0

    .line 184
    .local v3, "wrappedMode":Landroid/support/v7/internal/view/ActionModeWrapper;
    iget-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v4, v2}, Landroid/support/v7/app/ActionBarActivity;->startActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object v1

    .line 186
    .local v1, "frameworkMode":Landroid/view/ActionMode;
    if-eqz v1, :cond_1

    .line 187
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;

    move-result-object v3

    .line 188
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->setLastStartedActionMode(Landroid/support/v7/internal/view/ActionModeWrapper;)V

    .line 191
    :cond_1
    return-object v3
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 1

    .prologue
    .line 226
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;

    .line 227
    return-void
.end method

.method public supportRequestWindowFeature(I)Z
    .locals 1
    .param p1, "featureId"    # I

    .prologue
    .line 131
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->requestWindowFeature(I)Z

    move-result v0

    return v0
.end method
