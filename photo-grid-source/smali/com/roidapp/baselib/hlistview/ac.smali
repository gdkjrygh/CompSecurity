.class public final Lcom/roidapp/baselib/hlistview/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/hlistview/ab;


# instance fields
.field private a:Lcom/roidapp/baselib/hlistview/ab;

.field private b:Lcom/roidapp/baselib/hlistview/AbsHListView;


# virtual methods
.method public final a(Landroid/view/ActionMode;IJZ)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 65
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ac;->a:Lcom/roidapp/baselib/hlistview/ab;

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lcom/roidapp/baselib/hlistview/ab;->a(Landroid/view/ActionMode;IJZ)V

    .line 68
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    .line 1749
    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    .line 68
    if-nez v0, :cond_0

    .line 69
    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    .line 71
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->a:Lcom/roidapp/baselib/hlistview/ab;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->a:Lcom/roidapp/baselib/hlistview/ab;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/baselib/hlistview/ab;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public final onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 29
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ac;->a:Lcom/roidapp/baselib/hlistview/ab;

    invoke-interface {v1, p1, p2}, Lcom/roidapp/baselib/hlistview/ab;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ac;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setLongClickable(Z)V

    .line 31
    const/4 v0, 0x1

    .line 33
    :cond_0
    return v0
.end method

.method public final onDestroyActionMode(Landroid/view/ActionMode;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 51
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->a:Lcom/roidapp/baselib/hlistview/ab;

    invoke-interface {v0, p1}, Lcom/roidapp/baselib/hlistview/ab;->onDestroyActionMode(Landroid/view/ActionMode;)V

    .line 52
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a()V

    .line 56
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iput-boolean v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    .line 57
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->y()V

    .line 58
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->requestLayout()V

    .line 59
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setLongClickable(Z)V

    .line 60
    return-void
.end method

.method public final onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ac;->a:Lcom/roidapp/baselib/hlistview/ab;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/baselib/hlistview/ab;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method
