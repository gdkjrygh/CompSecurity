.class Lcom/facebook/orca/chatheads/dr;
.super Ljava/lang/Object;
.source "ChatThreadView.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 848
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;I)V
    .locals 2

    .prologue
    .line 876
    if-nez p2, :cond_0

    .line 877
    const/4 v0, 0x1

    .line 881
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1, v0}, Lcom/facebook/orca/chatheads/dh;->c(Lcom/facebook/orca/chatheads/dh;Z)V

    .line 882
    return-void

    .line 879
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->W()Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .prologue
    .line 868
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->g(Lcom/facebook/orca/chatheads/dh;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->i(Lcom/facebook/orca/chatheads/dh;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 869
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->f(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lcom/facebook/orca/chatheads/dr;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;I)V

    .line 871
    :cond_1
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 851
    if-nez p2, :cond_1

    .line 852
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0, v2}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;Z)Z

    .line 853
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/orca/chatheads/dh;Z)Z

    .line 854
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    .line 856
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/dh;->f(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/chatheads/dr;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;I)V

    .line 863
    :cond_0
    :goto_0
    return-void

    .line 858
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;Z)Z

    .line 859
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 860
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dr;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0, v2}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/orca/chatheads/dh;Z)Z

    goto :goto_0
.end method
