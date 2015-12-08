.class final Lcom/google/zxing/client/android/history/HistoryItemAdapter;
.super Landroid/widget/ArrayAdapter;
.source "HistoryItemAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/google/zxing/client/android/history/HistoryItem;",
        ">;"
    }
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 37
    sget v0, Lcom/google/zxing/client/android/R$layout;->history_list_item:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 38
    iput-object p1, p0, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->activity:Landroid/app/Activity;

    .line 39
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9
    .param p1, "position"    # I
    .param p2, "view"    # Landroid/view/View;
    .param p3, "viewGroup"    # Landroid/view/ViewGroup;

    .prologue
    .line 44
    instance-of v7, p2, Landroid/widget/LinearLayout;

    if-eqz v7, :cond_0

    move-object v3, p2

    .line 45
    check-cast v3, Landroid/widget/LinearLayout;

    .line 51
    .local v3, "layout":Landroid/widget/LinearLayout;
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/zxing/client/android/history/HistoryItem;

    .line 52
    .local v2, "item":Lcom/google/zxing/client/android/history/HistoryItem;
    invoke-virtual {v2}, Lcom/google/zxing/client/android/history/HistoryItem;->getResult()Lcom/google/zxing/Result;

    move-result-object v5

    .line 56
    .local v5, "result":Lcom/google/zxing/Result;
    if-eqz v5, :cond_1

    .line 57
    invoke-virtual {v5}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v6

    .line 58
    .local v6, "title":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/google/zxing/client/android/history/HistoryItem;->getDisplayAndDetails()Ljava/lang/String;

    move-result-object v0

    .line 65
    .local v0, "detail":Ljava/lang/String;
    :goto_1
    sget v7, Lcom/google/zxing/client/android/R$id;->history_title:I

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    sget v7, Lcom/google/zxing/client/android/R$id;->history_detail:I

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    return-object v3

    .line 47
    .end local v0    # "detail":Ljava/lang/String;
    .end local v2    # "item":Lcom/google/zxing/client/android/history/HistoryItem;
    .end local v3    # "layout":Landroid/widget/LinearLayout;
    .end local v5    # "result":Lcom/google/zxing/Result;
    .end local v6    # "title":Ljava/lang/String;
    :cond_0
    iget-object v7, p0, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->activity:Landroid/app/Activity;

    invoke-static {v7}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 48
    .local v1, "factory":Landroid/view/LayoutInflater;
    sget v7, Lcom/google/zxing/client/android/R$layout;->history_list_item:I

    const/4 v8, 0x0

    invoke-virtual {v1, v7, p3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    .restart local v3    # "layout":Landroid/widget/LinearLayout;
    goto :goto_0

    .line 60
    .end local v1    # "factory":Landroid/view/LayoutInflater;
    .restart local v2    # "item":Lcom/google/zxing/client/android/history/HistoryItem;
    .restart local v5    # "result":Lcom/google/zxing/Result;
    :cond_1
    invoke-virtual {p0}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 61
    .local v4, "resources":Landroid/content/res/Resources;
    sget v7, Lcom/google/zxing/client/android/R$string;->history_empty:I

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 62
    .restart local v6    # "title":Ljava/lang/String;
    sget v7, Lcom/google/zxing/client/android/R$string;->history_empty_detail:I

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "detail":Ljava/lang/String;
    goto :goto_1
.end method
