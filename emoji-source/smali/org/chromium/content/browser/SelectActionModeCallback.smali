.class public Lorg/chromium/content/browser/SelectActionModeCallback;
.super Ljava/lang/Object;
.source "SelectActionModeCallback.java"

# interfaces
.implements Landroid/view/ActionMode$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;
    }
.end annotation


# instance fields
.field private final mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

.field private final mContext:Landroid/content/Context;

.field private mEditable:Z

.field private final mIncognito:Z

.field private mIsPasswordType:Z


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;Z)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "actionHandler"    # Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;
    .param p3, "incognito"    # Z

    .prologue
    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mContext:Landroid/content/Context;

    .line 90
    iput-object p2, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    .line 91
    iput-boolean p3, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mIncognito:Z

    .line 92
    return-void
.end method

.method private canPaste()Z
    .locals 3

    .prologue
    .line 178
    invoke-virtual {p0}, Lorg/chromium/content/browser/SelectActionModeCallback;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "clipboard"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 180
    .local v0, "clipMgr":Landroid/content/ClipboardManager;
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v1

    return v1
.end method

.method private createActionMenu(Landroid/view/ActionMode;Landroid/view/Menu;)V
    .locals 2
    .param p1, "mode"    # Landroid/view/ActionMode;
    .param p2, "menu"    # Landroid/view/Menu;

    .prologue
    .line 123
    invoke-virtual {p1}, Landroid/view/ActionMode;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lorg/chromium/content/R$menu;->select_action_menu:I

    invoke-virtual {v0, v1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 124
    iget-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mEditable:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/chromium/content/browser/SelectActionModeCallback;->canPaste()Z

    move-result v0

    if-nez v0, :cond_1

    .line 125
    :cond_0
    sget v0, Lorg/chromium/content/R$id;->select_action_menu_paste:I

    invoke-interface {p2, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 128
    :cond_1
    iget-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mEditable:Z

    if-nez v0, :cond_2

    .line 129
    sget v0, Lorg/chromium/content/R$id;->select_action_menu_cut:I

    invoke-interface {p2, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 132
    :cond_2
    iget-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mEditable:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v0}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->isShareAvailable()Z

    move-result v0

    if-nez v0, :cond_4

    .line 133
    :cond_3
    sget v0, Lorg/chromium/content/R$id;->select_action_menu_share:I

    invoke-interface {p2, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 136
    :cond_4
    iget-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mEditable:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mIncognito:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v0}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->isWebSearchAvailable()Z

    move-result v0

    if-nez v0, :cond_6

    .line 137
    :cond_5
    sget v0, Lorg/chromium/content/R$id;->select_action_menu_web_search:I

    invoke-interface {p2, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 139
    :cond_6
    iget-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mIsPasswordType:Z

    if-eqz v0, :cond_7

    .line 140
    sget v0, Lorg/chromium/content/R$id;->select_action_menu_copy:I

    invoke-interface {p2, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 141
    sget v0, Lorg/chromium/content/R$id;->select_action_menu_cut:I

    invoke-interface {p2, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 143
    :cond_7
    return-void
.end method


# virtual methods
.method protected getContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 2
    .param p1, "mode"    # Landroid/view/ActionMode;
    .param p2, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 147
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    .line 149
    .local v0, "id":I
    sget v1, Lorg/chromium/content/R$id;->select_action_menu_select_all:I

    if-ne v0, v1, :cond_0

    .line 150
    iget-object v1, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v1}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->selectAll()V

    .line 169
    :goto_0
    const/4 v1, 0x1

    :goto_1
    return v1

    .line 151
    :cond_0
    sget v1, Lorg/chromium/content/R$id;->select_action_menu_cut:I

    if-ne v0, v1, :cond_1

    .line 152
    iget-object v1, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v1}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->cut()V

    .line 153
    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    goto :goto_0

    .line 154
    :cond_1
    sget v1, Lorg/chromium/content/R$id;->select_action_menu_copy:I

    if-ne v0, v1, :cond_2

    .line 155
    iget-object v1, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v1}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->copy()V

    .line 156
    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    goto :goto_0

    .line 157
    :cond_2
    sget v1, Lorg/chromium/content/R$id;->select_action_menu_paste:I

    if-ne v0, v1, :cond_3

    .line 158
    iget-object v1, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v1}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->paste()V

    .line 159
    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    goto :goto_0

    .line 160
    :cond_3
    sget v1, Lorg/chromium/content/R$id;->select_action_menu_share:I

    if-ne v0, v1, :cond_4

    .line 161
    iget-object v1, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v1}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->share()V

    .line 162
    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    goto :goto_0

    .line 163
    :cond_4
    sget v1, Lorg/chromium/content/R$id;->select_action_menu_web_search:I

    if-ne v0, v1, :cond_5

    .line 164
    iget-object v1, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v1}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->search()V

    .line 165
    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    goto :goto_0

    .line 167
    :cond_5
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 1
    .param p1, "mode"    # Landroid/view/ActionMode;
    .param p2, "menu"    # Landroid/view/Menu;

    .prologue
    const/4 v0, 0x0

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/ActionMode;->setTitle(Ljava/lang/CharSequence;)V

    .line 101
    invoke-virtual {p1, v0}, Landroid/view/ActionMode;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 102
    iget-object v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v0}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->isSelectionEditable()Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mEditable:Z

    .line 103
    iget-object v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v0}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->isSelectionPassword()Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mIsPasswordType:Z

    .line 104
    invoke-direct {p0, p1, p2}, Lorg/chromium/content/browser/SelectActionModeCallback;->createActionMenu(Landroid/view/ActionMode;Landroid/view/Menu;)V

    .line 105
    const/4 v0, 0x1

    return v0
.end method

.method public onDestroyActionMode(Landroid/view/ActionMode;)V
    .locals 1
    .param p1, "mode"    # Landroid/view/ActionMode;

    .prologue
    .line 174
    iget-object v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v0}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->onDestroyActionMode()V

    .line 175
    return-void
.end method

.method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 3
    .param p1, "mode"    # Landroid/view/ActionMode;
    .param p2, "menu"    # Landroid/view/Menu;

    .prologue
    .line 110
    iget-object v2, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v2}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->isSelectionEditable()Z

    move-result v0

    .line 111
    .local v0, "isEditableNow":Z
    iget-object v2, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mActionHandler:Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;

    invoke-interface {v2}, Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;->isSelectionPassword()Z

    move-result v1

    .line 112
    .local v1, "isPasswordNow":Z
    iget-boolean v2, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mEditable:Z

    if-ne v2, v0, :cond_0

    iget-boolean v2, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mIsPasswordType:Z

    if-eq v2, v1, :cond_1

    .line 113
    :cond_0
    iput-boolean v0, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mEditable:Z

    .line 114
    iput-boolean v1, p0, Lorg/chromium/content/browser/SelectActionModeCallback;->mIsPasswordType:Z

    .line 115
    invoke-interface {p2}, Landroid/view/Menu;->clear()V

    .line 116
    invoke-direct {p0, p1, p2}, Lorg/chromium/content/browser/SelectActionModeCallback;->createActionMenu(Landroid/view/ActionMode;Landroid/view/Menu;)V

    .line 117
    const/4 v2, 0x1

    .line 119
    :goto_0
    return v2

    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method
