.class Lcom/facebook/widget/refreshablelistview/a;
.super Ljava/lang/Object;
.source "RefreshableListViewContainer.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;


# direct methods
.method constructor <init>(Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/facebook/widget/refreshablelistview/a;->a:Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 106
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/a;->a:Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/widget/AbsListView;I)V

    .line 111
    return-void
.end method
