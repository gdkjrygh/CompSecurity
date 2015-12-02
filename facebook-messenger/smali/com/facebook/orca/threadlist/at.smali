.class Lcom/facebook/orca/threadlist/at;
.super Ljava/lang/Object;
.source "ThreadListFragment.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V
    .locals 0

    .prologue
    .line 348
    iput-object p1, p0, Lcom/facebook/orca/threadlist/at;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 351
    iget-object v0, p0, Lcom/facebook/orca/threadlist/at;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/analytics/av;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadlist/at;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/ThreadListFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Ljava/lang/String;)V

    .line 352
    if-nez p3, :cond_0

    .line 357
    :goto_0
    return-void

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/at;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    add-int/lit8 v1, p3, -0x1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/ThreadListFragment;I)V

    goto :goto_0
.end method
