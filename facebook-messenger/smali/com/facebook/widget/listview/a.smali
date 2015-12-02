.class Lcom/facebook/widget/listview/a;
.super Ljava/lang/Object;
.source "BetterListView.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/listview/BetterListView;


# direct methods
.method constructor <init>(Lcom/facebook/widget/listview/BetterListView;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/widget/listview/a;->a:Lcom/facebook/widget/listview/BetterListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 96
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/widget/listview/a;->a:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, p2}, Lcom/facebook/widget/listview/BetterListView;->c(I)V

    .line 91
    return-void
.end method
