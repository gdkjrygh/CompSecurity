.class public Lcom/arist/Adapter/SkinAdapter;
.super Landroid/widget/BaseAdapter;
.source "SkinAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/Adapter/SkinAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private inflater:Landroid/view/LayoutInflater;

.field private skins:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Skin;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Skin;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 25
    .local p2, "skins":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Skin;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/arist/Adapter/SkinAdapter;->context:Landroid/content/Context;

    .line 27
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Adapter/SkinAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 28
    if-eqz p2, :cond_0

    .line 29
    iput-object p2, p0, Lcom/arist/Adapter/SkinAdapter;->skins:Ljava/util/ArrayList;

    .line 32
    :goto_0
    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/Adapter/SkinAdapter;->skins:Ljava/util/ArrayList;

    goto :goto_0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/arist/Adapter/SkinAdapter;->skins:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 41
    iget-object v0, p0, Lcom/arist/Adapter/SkinAdapter;->skins:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 46
    iget-object v0, p0, Lcom/arist/Adapter/SkinAdapter;->skins:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/Skin;

    invoke-virtual {v0}, Lcom/arist/entity/Skin;->getResId()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 51
    const/4 v1, 0x0

    .line 52
    .local v1, "holder":Lcom/arist/Adapter/SkinAdapter$ViewHolder;
    if-nez p2, :cond_0

    .line 53
    iget-object v2, p0, Lcom/arist/Adapter/SkinAdapter;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f03000c

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 55
    new-instance v1, Lcom/arist/Adapter/SkinAdapter$ViewHolder;

    .end local v1    # "holder":Lcom/arist/Adapter/SkinAdapter$ViewHolder;
    invoke-direct {v1, p0}, Lcom/arist/Adapter/SkinAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/SkinAdapter;)V

    .line 56
    .restart local v1    # "holder":Lcom/arist/Adapter/SkinAdapter$ViewHolder;
    const v2, 0x7f0d0044

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-static {v1, v2}, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->access$0(Lcom/arist/Adapter/SkinAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 58
    const v2, 0x7f0d0045

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 57
    invoke-static {v1, v2}, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->access$1(Lcom/arist/Adapter/SkinAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 60
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 64
    :goto_0
    iget-object v2, p0, Lcom/arist/Adapter/SkinAdapter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 65
    iget-object v2, p0, Lcom/arist/Adapter/SkinAdapter;->skins:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/arist/entity/Skin;

    invoke-virtual {v2}, Lcom/arist/entity/Skin;->getResId()I

    move-result v2

    const/16 v4, 0x64

    const/16 v5, 0xa0

    .line 64
    invoke-static {v3, v2, v4, v5}, Lcom/arist/util/BitmapService;->getBitmap(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 66
    .local v0, "bmp":Landroid/graphics/Bitmap;
    # getter for: Lcom/arist/Adapter/SkinAdapter$ViewHolder;->iv:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->access$2(Lcom/arist/Adapter/SkinAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 68
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getWallpaperId()I

    move-result v3

    iget-object v2, p0, Lcom/arist/Adapter/SkinAdapter;->skins:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/arist/entity/Skin;

    invoke-virtual {v2}, Lcom/arist/entity/Skin;->getResId()I

    move-result v2

    if-ne v3, v2, :cond_1

    .line 69
    # getter for: Lcom/arist/Adapter/SkinAdapter$ViewHolder;->ivSkinChecked:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->access$3(Lcom/arist/Adapter/SkinAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 74
    :goto_1
    return-object p2

    .line 62
    .end local v0    # "bmp":Landroid/graphics/Bitmap;
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "holder":Lcom/arist/Adapter/SkinAdapter$ViewHolder;
    check-cast v1, Lcom/arist/Adapter/SkinAdapter$ViewHolder;

    .restart local v1    # "holder":Lcom/arist/Adapter/SkinAdapter$ViewHolder;
    goto :goto_0

    .line 71
    .restart local v0    # "bmp":Landroid/graphics/Bitmap;
    :cond_1
    # getter for: Lcom/arist/Adapter/SkinAdapter$ViewHolder;->ivSkinChecked:Landroid/widget/ImageView;
    invoke-static {v1}, Lcom/arist/Adapter/SkinAdapter$ViewHolder;->access$3(Lcom/arist/Adapter/SkinAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method
