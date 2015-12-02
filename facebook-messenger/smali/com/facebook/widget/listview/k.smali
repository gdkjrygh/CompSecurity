.class public Lcom/facebook/widget/listview/k;
.super Ljava/lang/Object;
.source "ListScrollStateSnapshot.java"


# instance fields
.field private final a:Lcom/facebook/widget/listview/BetterListView;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Lcom/facebook/widget/listview/BetterListView;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    iput-object p1, p0, Lcom/facebook/widget/listview/k;->a:Lcom/facebook/widget/listview/BetterListView;

    .line 27
    invoke-virtual {p0}, Lcom/facebook/widget/listview/k;->a()V

    .line 28
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 31
    iget-object v0, p0, Lcom/facebook/widget/listview/k;->a:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    iget-object v1, p0, Lcom/facebook/widget/listview/k;->a:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/BetterListView;->getFirstVisiblePosition()I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/listview/k;->b:I

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/listview/k;->c:I

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    neg-int v0, v0

    iput v0, p0, Lcom/facebook/widget/listview/k;->d:I

    .line 42
    :goto_0
    return-void

    .line 38
    :cond_0
    iput v1, p0, Lcom/facebook/widget/listview/k;->b:I

    .line 39
    iput v1, p0, Lcom/facebook/widget/listview/k;->c:I

    .line 40
    iput v1, p0, Lcom/facebook/widget/listview/k;->d:I

    goto :goto_0
.end method

.method public a(Lcom/facebook/widget/listview/k;)V
    .locals 2

    .prologue
    .line 45
    iget-object v0, p1, Lcom/facebook/widget/listview/k;->a:Lcom/facebook/widget/listview/BetterListView;

    iget-object v1, p0, Lcom/facebook/widget/listview/k;->a:Lcom/facebook/widget/listview/BetterListView;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 46
    invoke-virtual {p1}, Lcom/facebook/widget/listview/k;->b()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/listview/k;->b:I

    .line 47
    invoke-virtual {p1}, Lcom/facebook/widget/listview/k;->c()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/listview/k;->c:I

    .line 48
    invoke-virtual {p1}, Lcom/facebook/widget/listview/k;->d()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/listview/k;->d:I

    .line 49
    return-void

    .line 45
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/facebook/widget/listview/k;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/facebook/widget/listview/k;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/facebook/widget/listview/k;->d:I

    return v0
.end method
