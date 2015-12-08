.class final Lcom/roidapp/baselib/hlistview/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/roidapp/baselib/hlistview/k;

.field final synthetic c:Lcom/roidapp/baselib/hlistview/AbsHListView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;Lcom/roidapp/baselib/hlistview/k;)V
    .locals 0

    .prologue
    .line 3188
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/a;->c:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iput-object p2, p0, Lcom/roidapp/baselib/hlistview/a;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/roidapp/baselib/hlistview/a;->b:Lcom/roidapp/baselib/hlistview/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 3192
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/a;->c:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, -0x1

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3193
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/a;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 3194
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/a;->c:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 3195
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/a;->c:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-nez v0, :cond_0

    .line 3196
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/a;->b:Lcom/roidapp/baselib/hlistview/k;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/k;->run()V

    .line 3198
    :cond_0
    return-void
.end method
