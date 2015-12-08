.class public Lnet/coocent/android/xmlparser/GiftGridViewAdapter;
.super Landroid/widget/BaseAdapter;
.source "GiftGridViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private callback:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

.field private giftsArrayList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;"
        }
    .end annotation
.end field

.field private inflater:Landroid/view/LayoutInflater;

.field private loader:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/widget/GridView;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p3, "lvNetMusics"    # Landroid/widget/GridView;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;",
            "Landroid/widget/GridView;",
            ")V"
        }
    .end annotation

    .prologue
    .line 34
    .local p2, "giftList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 36
    invoke-virtual {p0, p2}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->setGiftsList(Ljava/util/ArrayList;)V

    .line 37
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 38
    new-instance v0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$1;

    invoke-direct {v0, p0, p3}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$1;-><init>(Lnet/coocent/android/xmlparser/GiftGridViewAdapter;Landroid/widget/GridView;)V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->callback:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

    .line 45
    new-instance v0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    invoke-direct {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;-><init>()V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->loader:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    .line 46
    return-void
.end method


# virtual methods
.method public changeData(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 49
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    invoke-virtual {p0, p1}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->setGiftsList(Ljava/util/ArrayList;)V

    .line 50
    invoke-virtual {p0}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->notifyDataSetChanged()V

    .line 51
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 58
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 62
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v5, 0x0

    .line 66
    const/4 v2, 0x0

    .line 67
    .local v2, "holder":Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;
    if-nez p2, :cond_0

    .line 68
    iget-object v3, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->inflater:Landroid/view/LayoutInflater;

    sget v4, Lnet/coocent/promotionsdk/R$layout;->grid_view_gift_item:I

    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 69
    new-instance v2, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;

    .end local v2    # "holder":Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;
    invoke-direct {v2, p0, v5}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;-><init>(Lnet/coocent/android/xmlparser/GiftGridViewAdapter;Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)V

    .line 71
    .restart local v2    # "holder":Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;
    sget v3, Lnet/coocent/promotionsdk/R$id;->iv_gift_icon:I

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 70
    invoke-static {v2, v3}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$1(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 73
    sget v3, Lnet/coocent/promotionsdk/R$id;->new_icon:I

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 72
    invoke-static {v2, v3}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$2(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 75
    sget v3, Lnet/coocent/promotionsdk/R$id;->tv_gift_title:I

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 74
    invoke-static {v2, v3}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$3(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 77
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 82
    :goto_0
    iget-object v3, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/coocent/android/xmlparser/GiftEntity;

    .line 83
    .local v1, "giftEntityTemp":Lnet/coocent/android/xmlparser/GiftEntity;
    # getter for: Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;
    invoke-static {v2}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$4(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v1}, Lnet/coocent/android/xmlparser/GiftEntity;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    # getter for: Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;
    invoke-static {v2}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$5(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v1}, Lnet/coocent/android/xmlparser/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 87
    iget-object v3, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->loader:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    iget-object v4, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->callback:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

    invoke-virtual {v3, v1, v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->loadImage(Lnet/coocent/android/xmlparser/GiftEntity;Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 88
    .local v0, "bm":Landroid/graphics/Bitmap;
    if-nez v0, :cond_1

    .line 89
    # getter for: Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;
    invoke-static {v2}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$5(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    sget v4, Lnet/coocent/promotionsdk/R$drawable;->gift_default_icon:I

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 92
    :goto_1
    invoke-virtual {v1}, Lnet/coocent/android/xmlparser/GiftEntity;->getPackagename()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/coocent/android/xmlparser/PromotionSDK;->isNew(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 93
    # getter for: Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->newIcon:Landroid/widget/ImageView;
    invoke-static {v2}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$6(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 96
    :goto_2
    return-object p2

    .line 79
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .end local v1    # "giftEntityTemp":Lnet/coocent/android/xmlparser/GiftEntity;
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    .end local v2    # "holder":Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;
    check-cast v2, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;

    .restart local v2    # "holder":Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;
    goto :goto_0

    .line 91
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v1    # "giftEntityTemp":Lnet/coocent/android/xmlparser/GiftEntity;
    :cond_1
    # getter for: Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;
    invoke-static {v2}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$5(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 95
    :cond_2
    # getter for: Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->newIcon:Landroid/widget/ImageView;
    invoke-static {v2}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;->access$6(Lnet/coocent/android/xmlparser/GiftGridViewAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2
.end method

.method public quit()V
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->loader:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    invoke-virtual {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->quit()V

    .line 25
    return-void
.end method

.method public setGiftsList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 28
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    if-eqz p1, :cond_0

    .line 29
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    .line 32
    :goto_0
    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    goto :goto_0
.end method
