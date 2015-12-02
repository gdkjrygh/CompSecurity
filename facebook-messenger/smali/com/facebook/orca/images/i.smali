.class public Lcom/facebook/orca/images/i;
.super Landroid/widget/BaseAdapter;
.source "ImageSearchListAdapter.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/view/LayoutInflater;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/LayoutInflater;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/images/i;->c:Ljava/util/List;

    .line 31
    iput-object p1, p0, Lcom/facebook/orca/images/i;->a:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lcom/facebook/orca/images/i;->b:Landroid/view/LayoutInflater;

    .line 33
    return-void
.end method


# virtual methods
.method public a(I)Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/images/i;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    return-object v0
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/orca/images/i;->c:Ljava/util/List;

    .line 45
    invoke-virtual {p0}, Lcom/facebook/orca/images/i;->notifyDataSetInvalidated()V

    .line 46
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/images/i;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/facebook/orca/images/i;->a(I)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 53
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 58
    if-nez p2, :cond_0

    .line 59
    iget-object v0, p0, Lcom/facebook/orca/images/i;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_image_search_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    move-object p2, v0

    .line 65
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/images/i;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 66
    const-string v1, "Thumbnail"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 67
    const-string v1, "Url"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 72
    return-object p2

    .line 62
    :cond_0
    check-cast p2, Lcom/facebook/widget/images/UrlImage;

    goto :goto_0
.end method
