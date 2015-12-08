.class final Lcom/google/zxing/client/android/book/SearchBookContentsAdapter;
.super Landroid/widget/ArrayAdapter;
.source "SearchBookContentsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/google/zxing/client/android/book/SearchBookContentsResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/google/zxing/client/android/book/SearchBookContentsResult;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 37
    .local p2, "items":Ljava/util/List;, "Ljava/util/List<Lcom/google/zxing/client/android/book/SearchBookContentsResult;>;"
    sget v0, Lcom/google/zxing/client/android/R$layout;->search_book_contents_list_item:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    .line 38
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "position"    # I
    .param p2, "view"    # Landroid/view/View;
    .param p3, "viewGroup"    # Landroid/view/ViewGroup;

    .prologue
    .line 44
    if-nez p2, :cond_1

    .line 45
    invoke-virtual {p0}, Lcom/google/zxing/client/android/book/SearchBookContentsAdapter;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 47
    .local v0, "factory":Landroid/view/LayoutInflater;
    sget v3, Lcom/google/zxing/client/android/R$layout;->search_book_contents_list_item:I

    const/4 v4, 0x0

    .line 46
    invoke-virtual {v0, v3, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/zxing/client/android/book/SearchBookContentsListItem;

    .line 56
    .end local v0    # "factory":Landroid/view/LayoutInflater;
    .local v1, "listItem":Lcom/google/zxing/client/android/book/SearchBookContentsListItem;
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/zxing/client/android/book/SearchBookContentsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/zxing/client/android/book/SearchBookContentsResult;

    .line 57
    .local v2, "result":Lcom/google/zxing/client/android/book/SearchBookContentsResult;
    invoke-virtual {v1, v2}, Lcom/google/zxing/client/android/book/SearchBookContentsListItem;->set(Lcom/google/zxing/client/android/book/SearchBookContentsResult;)V

    move-object p2, v1

    .line 58
    .end local v1    # "listItem":Lcom/google/zxing/client/android/book/SearchBookContentsListItem;
    .end local v2    # "result":Lcom/google/zxing/client/android/book/SearchBookContentsResult;
    .end local p2    # "view":Landroid/view/View;
    :cond_0
    return-object p2

    .line 49
    .restart local p2    # "view":Landroid/view/View;
    :cond_1
    instance-of v3, p2, Lcom/google/zxing/client/android/book/SearchBookContentsListItem;

    if-eqz v3, :cond_0

    move-object v1, p2

    .line 50
    check-cast v1, Lcom/google/zxing/client/android/book/SearchBookContentsListItem;

    .line 51
    .restart local v1    # "listItem":Lcom/google/zxing/client/android/book/SearchBookContentsListItem;
    goto :goto_0
.end method
