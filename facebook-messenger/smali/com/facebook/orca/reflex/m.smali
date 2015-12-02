.class Lcom/facebook/orca/reflex/m;
.super Ljava/lang/Object;
.source "ThreadListView.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/reflex/k;


# direct methods
.method constructor <init>(Lcom/facebook/orca/reflex/k;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/orca/reflex/m;->a:Lcom/facebook/orca/reflex/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 39
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/reflex/m;->a:Lcom/facebook/orca/reflex/k;

    invoke-static {v0}, Lcom/facebook/orca/reflex/k;->a(Lcom/facebook/orca/reflex/k;)Lcom/facebook/orca/threadlist/i;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/reflex/m;->a:Lcom/facebook/orca/reflex/k;

    invoke-static {v0}, Lcom/facebook/orca/reflex/k;->a(Lcom/facebook/orca/reflex/k;)Lcom/facebook/orca/threadlist/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/threadlist/i;->a(Landroid/widget/AbsListView;I)V

    .line 34
    return-void
.end method
