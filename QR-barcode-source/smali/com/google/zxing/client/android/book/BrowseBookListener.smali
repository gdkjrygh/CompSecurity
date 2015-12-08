.class final Lcom/google/zxing/client/android/book/BrowseBookListener;
.super Ljava/lang/Object;
.source "BrowseBookListener.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field private final activity:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/zxing/client/android/book/SearchBookContentsResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/zxing/client/android/book/SearchBookContentsActivity;Ljava/util/List;)V
    .locals 0
    .param p1, "activity"    # Lcom/google/zxing/client/android/book/SearchBookContentsActivity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/zxing/client/android/book/SearchBookContentsActivity;",
            "Ljava/util/List",
            "<",
            "Lcom/google/zxing/client/android/book/SearchBookContentsResult;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    .local p2, "items":Ljava/util/List;, "Ljava/util/List<Lcom/google/zxing/client/android/book/SearchBookContentsResult;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/google/zxing/client/android/book/BrowseBookListener;->activity:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

    .line 34
    iput-object p2, p0, Lcom/google/zxing/client/android/book/BrowseBookListener;->items:Ljava/util/List;

    .line 35
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 10
    .param p2, "v"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 39
    .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    const/4 v8, 0x1

    if-ge p3, v8, :cond_1

    .line 60
    :cond_0
    :goto_0
    return-void

    .line 43
    :cond_1
    add-int/lit8 v2, p3, -0x1

    .line 44
    .local v2, "itemOffset":I
    iget-object v8, p0, Lcom/google/zxing/client/android/book/BrowseBookListener;->items:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v2, v8, :cond_0

    .line 47
    iget-object v8, p0, Lcom/google/zxing/client/android/book/BrowseBookListener;->items:Ljava/util/List;

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/zxing/client/android/book/SearchBookContentsResult;

    invoke-virtual {v8}, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->getPageId()Ljava/lang/String;

    move-result-object v3

    .line 48
    .local v3, "pageId":Ljava/lang/String;
    invoke-static {}, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->getQuery()Ljava/lang/String;

    move-result-object v4

    .line 49
    .local v4, "query":Ljava/lang/String;
    iget-object v8, p0, Lcom/google/zxing/client/android/book/BrowseBookListener;->activity:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

    invoke-virtual {v8}, Lcom/google/zxing/client/android/book/SearchBookContentsActivity;->getISBN()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/google/zxing/client/android/LocaleManager;->isBookSearchUrl(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_0

    .line 50
    iget-object v8, p0, Lcom/google/zxing/client/android/book/BrowseBookListener;->activity:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

    invoke-virtual {v8}, Lcom/google/zxing/client/android/book/SearchBookContentsActivity;->getISBN()Ljava/lang/String;

    move-result-object v6

    .line 51
    .local v6, "uri":Ljava/lang/String;
    const/16 v8, 0x3d

    invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 52
    .local v0, "equals":I
    add-int/lit8 v8, v0, 0x1

    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 53
    .local v7, "volumeId":Ljava/lang/String;
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "http://books.google."

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    iget-object v9, p0, Lcom/google/zxing/client/android/book/BrowseBookListener;->activity:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

    invoke-static {v9}, Lcom/google/zxing/client/android/LocaleManager;->getBookSearchCountryTLD(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 55
    const-string v9, "/books?id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "&pg="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "&vq="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 53
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 56
    .local v5, "readBookURI":Ljava/lang/String;
    new-instance v1, Landroid/content/Intent;

    const-string v8, "android.intent.action.VIEW"

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    invoke-direct {v1, v8, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 57
    .local v1, "intent":Landroid/content/Intent;
    const/high16 v8, 0x80000

    invoke-virtual {v1, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 58
    iget-object v8, p0, Lcom/google/zxing/client/android/book/BrowseBookListener;->activity:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

    invoke-virtual {v8, v1}, Lcom/google/zxing/client/android/book/SearchBookContentsActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0
.end method
