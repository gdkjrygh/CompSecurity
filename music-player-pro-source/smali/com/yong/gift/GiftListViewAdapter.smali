.class public Lcom/yong/gift/GiftListViewAdapter;
.super Landroid/widget/BaseAdapter;
.source "GiftListViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yong/gift/GiftListViewAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private callback:Lcom/yong/gift/AsyncGiftImageLoader$Callback;

.field private giftsArrayList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/gift/GiftEntity;",
            ">;"
        }
    .end annotation
.end field

.field private inflater:Landroid/view/LayoutInflater;

.field private loader:Lcom/yong/gift/AsyncGiftImageLoader;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/widget/ListView;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p3, "lvNetMusics"    # Landroid/widget/ListView;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/gift/GiftEntity;",
            ">;",
            "Landroid/widget/ListView;",
            ")V"
        }
    .end annotation

    .prologue
    .line 35
    .local p2, "giftList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/gift/GiftEntity;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 37
    invoke-virtual {p0, p2}, Lcom/yong/gift/GiftListViewAdapter;->setGiftsList(Ljava/util/ArrayList;)V

    .line 38
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/yong/gift/GiftListViewAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 39
    new-instance v0, Lcom/yong/gift/GiftListViewAdapter$1;

    invoke-direct {v0, p0, p3}, Lcom/yong/gift/GiftListViewAdapter$1;-><init>(Lcom/yong/gift/GiftListViewAdapter;Landroid/widget/ListView;)V

    iput-object v0, p0, Lcom/yong/gift/GiftListViewAdapter;->callback:Lcom/yong/gift/AsyncGiftImageLoader$Callback;

    .line 46
    new-instance v0, Lcom/yong/gift/AsyncGiftImageLoader;

    invoke-direct {v0}, Lcom/yong/gift/AsyncGiftImageLoader;-><init>()V

    iput-object v0, p0, Lcom/yong/gift/GiftListViewAdapter;->loader:Lcom/yong/gift/AsyncGiftImageLoader;

    .line 47
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
            "Lcom/yong/gift/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 50
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/gift/GiftEntity;>;"
    invoke-virtual {p0, p1}, Lcom/yong/gift/GiftListViewAdapter;->setGiftsList(Ljava/util/ArrayList;)V

    .line 51
    invoke-virtual {p0}, Lcom/yong/gift/GiftListViewAdapter;->notifyDataSetChanged()V

    .line 52
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/yong/gift/GiftListViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 61
    iget-object v0, p0, Lcom/yong/gift/GiftListViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 66
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

    .line 71
    const/4 v2, 0x0

    .line 72
    .local v2, "holder":Lcom/yong/gift/GiftListViewAdapter$ViewHolder;
    if-nez p2, :cond_0

    .line 73
    iget-object v3, p0, Lcom/yong/gift/GiftListViewAdapter;->inflater:Landroid/view/LayoutInflater;

    const v4, 0x7f030011

    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 74
    new-instance v2, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;

    .end local v2    # "holder":Lcom/yong/gift/GiftListViewAdapter$ViewHolder;
    invoke-direct {v2, p0, v5}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;-><init>(Lcom/yong/gift/GiftListViewAdapter;Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)V

    .line 76
    .restart local v2    # "holder":Lcom/yong/gift/GiftListViewAdapter$ViewHolder;
    const v3, 0x7f0d004c

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 75
    invoke-static {v2, v3}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->access$1(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 78
    const v3, 0x7f0d004e

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 77
    invoke-static {v2, v3}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->access$2(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 80
    const v3, 0x7f0d0053

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 79
    invoke-static {v2, v3}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->access$3(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 81
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 86
    :goto_0
    iget-object v3, p0, Lcom/yong/gift/GiftListViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yong/gift/GiftEntity;

    .line 87
    .local v1, "giftEntityTemp":Lcom/yong/gift/GiftEntity;
    # getter for: Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;
    invoke-static {v2}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->access$4(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v1}, Lcom/yong/gift/GiftEntity;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    # getter for: Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;
    invoke-static {v2}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->access$5(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v1}, Lcom/yong/gift/GiftEntity;->getDetailed()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    # getter for: Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;
    invoke-static {v2}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->access$6(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v1}, Lcom/yong/gift/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 95
    iget-object v3, p0, Lcom/yong/gift/GiftListViewAdapter;->loader:Lcom/yong/gift/AsyncGiftImageLoader;

    iget-object v4, p0, Lcom/yong/gift/GiftListViewAdapter;->callback:Lcom/yong/gift/AsyncGiftImageLoader$Callback;

    invoke-virtual {v3, v1, v4}, Lcom/yong/gift/AsyncGiftImageLoader;->loadImage(Lcom/yong/gift/GiftEntity;Lcom/yong/gift/AsyncGiftImageLoader$Callback;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 96
    .local v0, "bm":Landroid/graphics/Bitmap;
    if-nez v0, :cond_1

    .line 97
    # getter for: Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;
    invoke-static {v2}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->access$6(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f020056

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 100
    :goto_1
    return-object p2

    .line 83
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .end local v1    # "giftEntityTemp":Lcom/yong/gift/GiftEntity;
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    .end local v2    # "holder":Lcom/yong/gift/GiftListViewAdapter$ViewHolder;
    check-cast v2, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;

    .restart local v2    # "holder":Lcom/yong/gift/GiftListViewAdapter$ViewHolder;
    goto :goto_0

    .line 99
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v1    # "giftEntityTemp":Lcom/yong/gift/GiftEntity;
    :cond_1
    # getter for: Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->ivIcon:Landroid/widget/ImageView;
    invoke-static {v2}, Lcom/yong/gift/GiftListViewAdapter$ViewHolder;->access$6(Lcom/yong/gift/GiftListViewAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1
.end method

.method public quit()V
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/yong/gift/GiftListViewAdapter;->loader:Lcom/yong/gift/AsyncGiftImageLoader;

    invoke-virtual {v0}, Lcom/yong/gift/AsyncGiftImageLoader;->quit()V

    .line 26
    return-void
.end method

.method public setGiftsList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/gift/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 29
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/gift/GiftEntity;>;"
    if-eqz p1, :cond_0

    .line 30
    iput-object p1, p0, Lcom/yong/gift/GiftListViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    .line 33
    :goto_0
    return-void

    .line 32
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/yong/gift/GiftListViewAdapter;->giftsArrayList:Ljava/util/ArrayList;

    goto :goto_0
.end method
