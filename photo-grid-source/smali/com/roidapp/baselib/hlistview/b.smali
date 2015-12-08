.class final Lcom/roidapp/baselib/hlistview/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AbsHListView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 0

    .prologue
    .line 4521
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 4525
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->y:Z

    if-eqz v0, :cond_1

    .line 4526
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->z:Z

    iput-boolean v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->y:Z

    .line 4527
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->m(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    .line 4528
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPersistentDrawingCache()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 4529
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->n(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    .line 4531
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isAlwaysDrawnWithCacheEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4532
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/b;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 4535
    :cond_1
    return-void
.end method
