.class public Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "DetailPhotoPagerAdapter.java"


# instance fields
.field private final TAG:Ljava/lang/String;

.field inflater:Landroid/view/LayoutInflater;

.field private mContext:Landroid/content/Context;

.field private mData:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/PhotoData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .param p1, "c"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/PhotoData;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 25
    .local p2, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/PhotoData;>;"
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 19
    const-string v0, "DetailPhotoPagerAdapter"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->TAG:Ljava/lang/String;

    .line 26
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->mContext:Landroid/content/Context;

    .line 27
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->mData:Ljava/util/ArrayList;

    .line 28
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1, "container"    # Landroid/view/ViewGroup;
    .param p2, "position"    # I
    .param p3, "object"    # Ljava/lang/Object;

    .prologue
    .line 66
    check-cast p3, Landroid/widget/RelativeLayout;

    .end local p3    # "object":Ljava/lang/Object;
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 67
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->mData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 7
    .param p1, "container"    # Landroid/view/ViewGroup;
    .param p2, "position"    # I

    .prologue
    const/4 v6, 0x0

    .line 42
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->mContext:Landroid/content/Context;

    const-string v5, "layout_inflater"

    .line 43
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/LayoutInflater;

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 44
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->inflater:Landroid/view/LayoutInflater;

    const v5, 0x7f03002d

    invoke-virtual {v4, v5, p1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 46
    .local v2, "itemView":Landroid/view/View;
    const v4, 0x7f0a007f

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/android/volley/toolbox/NetworkImageView;

    .line 47
    .local v3, "photo":Lcom/android/volley/toolbox/NetworkImageView;
    const v4, 0x7f0a0080

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;

    .line 49
    .local v0, "credit":Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->mData:Ljava/util/ArrayList;

    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/PhotoData;

    .line 51
    .local v1, "data":Lcom/aetn/history/android/historyhere/model/PhotoData;
    iget-object v4, v1, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoCredit:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 52
    iget-object v4, v1, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoCredit:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    invoke-virtual {v0, v6}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->setVisibility(I)V

    .line 57
    :goto_0
    iget-object v4, v1, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoURL:Ljava/lang/String;

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->mContext:Landroid/content/Context;

    invoke-static {v5}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getImageLoader()Lcom/android/volley/toolbox/ImageLoader;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V

    .line 59
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 60
    return-object v2

    .line 55
    :cond_0
    const/4 v4, 0x4

    invoke-virtual {v0, v4}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "view"    # Landroid/view/View;
    .param p2, "object"    # Ljava/lang/Object;

    .prologue
    .line 32
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
