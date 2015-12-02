.class public Lcom/facebook/widget/e/a;
.super Lcom/facebook/widget/f;
.source "RecycleViewWrapper.java"


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/e/a;->a:Ljava/lang/Integer;

    .line 27
    iput v1, p0, Lcom/facebook/widget/e/a;->b:I

    .line 31
    return-void
.end method


# virtual methods
.method public getEligibleContentView()Landroid/view/View;
    .locals 6

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 50
    iget-object v0, p0, Lcom/facebook/widget/e/a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/e/a;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_1

    :cond_0
    move-object v0, v3

    .line 56
    :goto_0
    return-object v0

    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/widget/e/a;->getChildCount()I

    move-result v4

    .line 55
    if-gt v4, v1, :cond_2

    move v0, v1

    :goto_1
    const-string v5, "There can only be 1 wrapped child view at most!"

    invoke-static {v0, v5}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 56
    if-ne v4, v1, :cond_3

    invoke-virtual {p0, v2}, Lcom/facebook/widget/e/a;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_2
    move v0, v2

    .line 55
    goto :goto_1

    :cond_3
    move-object v0, v3

    .line 56
    goto :goto_0
.end method

.method public getPositionInListView()I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/facebook/widget/e/a;->b:I

    return v0
.end method

.method public getRecyleViewType()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/widget/e/a;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public setPositionInListView(I)V
    .locals 0

    .prologue
    .line 64
    iput p1, p0, Lcom/facebook/widget/e/a;->b:I

    .line 65
    return-void
.end method

.method public setRecycleViewType(Ljava/lang/Integer;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/widget/e/a;->a:Ljava/lang/Integer;

    .line 47
    return-void
.end method
