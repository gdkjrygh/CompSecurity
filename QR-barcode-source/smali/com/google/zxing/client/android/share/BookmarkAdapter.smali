.class final Lcom/google/zxing/client/android/share/BookmarkAdapter;
.super Landroid/widget/BaseAdapter;
.source "BookmarkAdapter.java"


# instance fields
.field private final context:Landroid/content/Context;

.field private final cursor:Landroid/database/Cursor;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "cursor"    # Landroid/database/Cursor;

    .prologue
    .line 42
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/google/zxing/client/android/share/BookmarkAdapter;->context:Landroid/content/Context;

    .line 44
    iput-object p2, p0, Lcom/google/zxing/client/android/share/BookmarkAdapter;->cursor:Landroid/database/Cursor;

    .line 45
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/google/zxing/client/android/share/BookmarkAdapter;->cursor:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 55
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 60
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "index"    # I
    .param p2, "view"    # Landroid/view/View;
    .param p3, "viewGroup"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v5, 0x0

    .line 66
    instance-of v4, p2, Landroid/widget/LinearLayout;

    if-eqz v4, :cond_1

    move-object v1, p2

    .line 67
    check-cast v1, Landroid/widget/LinearLayout;

    .line 73
    .local v1, "layout":Landroid/widget/LinearLayout;
    :goto_0
    iget-object v4, p0, Lcom/google/zxing/client/android/share/BookmarkAdapter;->cursor:Landroid/database/Cursor;

    invoke-interface {v4}, Landroid/database/Cursor;->isClosed()Z

    move-result v4

    if-nez v4, :cond_0

    .line 74
    iget-object v4, p0, Lcom/google/zxing/client/android/share/BookmarkAdapter;->cursor:Landroid/database/Cursor;

    invoke-interface {v4, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 75
    iget-object v4, p0, Lcom/google/zxing/client/android/share/BookmarkAdapter;->cursor:Landroid/database/Cursor;

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 76
    .local v2, "title":Ljava/lang/String;
    sget v4, Lcom/google/zxing/client/android/R$id;->bookmark_title:I

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    iget-object v4, p0, Lcom/google/zxing/client/android/share/BookmarkAdapter;->cursor:Landroid/database/Cursor;

    const/4 v5, 0x1

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 78
    .local v3, "url":Ljava/lang/String;
    sget v4, Lcom/google/zxing/client/android/R$id;->bookmark_url:I

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .end local v2    # "title":Ljava/lang/String;
    .end local v3    # "url":Ljava/lang/String;
    :cond_0
    return-object v1

    .line 69
    .end local v1    # "layout":Landroid/widget/LinearLayout;
    :cond_1
    iget-object v4, p0, Lcom/google/zxing/client/android/share/BookmarkAdapter;->context:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 70
    .local v0, "factory":Landroid/view/LayoutInflater;
    sget v4, Lcom/google/zxing/client/android/R$layout;->bookmark_picker_list_item:I

    invoke-virtual {v0, v4, p3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .restart local v1    # "layout":Landroid/widget/LinearLayout;
    goto :goto_0
.end method
