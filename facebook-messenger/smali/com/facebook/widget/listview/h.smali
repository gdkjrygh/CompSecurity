.class public abstract Lcom/facebook/widget/listview/h;
.super Landroid/widget/BaseAdapter;
.source "FbBaseAdapter.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(ILandroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public abstract a(Ljava/lang/Object;Landroid/view/View;ILandroid/view/ViewGroup;)V
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Lcom/facebook/widget/listview/h;->getItemViewType(I)I

    move-result v1

    .line 21
    if-nez p2, :cond_0

    .line 22
    invoke-virtual {p0, v1, p3}, Lcom/facebook/widget/listview/h;->a(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 23
    if-eqz p2, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v2, "createView() shall not return null value!"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 25
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/widget/listview/h;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2, v1, p3}, Lcom/facebook/widget/listview/h;->a(Ljava/lang/Object;Landroid/view/View;ILandroid/view/ViewGroup;)V

    .line 26
    return-object p2

    .line 23
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
