.class Lcom/facebook/widget/b/c;
.super Ljava/lang/Object;
.source "BetterViewOnScrollListener.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/b/b;


# direct methods
.method constructor <init>(Lcom/facebook/widget/b/b;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/facebook/widget/b/c;->a:Lcom/facebook/widget/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/widget/b/c;->a:Lcom/facebook/widget/b/b;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/facebook/widget/b/b;->a(Lcom/facebook/widget/b/b;Landroid/widget/AbsListView;III)V

    .line 36
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/widget/b/c;->a:Lcom/facebook/widget/b/b;

    invoke-static {v0, p1, p2}, Lcom/facebook/widget/b/b;->a(Lcom/facebook/widget/b/b;Landroid/widget/AbsListView;I)V

    .line 29
    return-void
.end method
