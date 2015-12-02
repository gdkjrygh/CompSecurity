.class Lcom/facebook/orca/stickers/ae;
.super Landroid/widget/ArrayAdapter;
.source "StickerStoreFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/facebook/orca/stickers/StickerPack;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/StickerStoreFragment;

.field private final b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/stickers/StickerStoreFragment;Landroid/content/Context;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 405
    iput-object p1, p0, Lcom/facebook/orca/stickers/ae;->a:Lcom/facebook/orca/stickers/StickerStoreFragment;

    .line 406
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 407
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 408
    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/ae;->add(Ljava/lang/Object;)V

    goto :goto_0

    .line 410
    :cond_0
    const-string v0, "layout_inflater"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/facebook/orca/stickers/ae;->b:Landroid/view/LayoutInflater;

    .line 411
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    .line 415
    iget-object v0, p0, Lcom/facebook/orca/stickers/ae;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_sticker_store_list_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 418
    sget v1, Lcom/facebook/i;->thumbnail:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/images/UrlImage;

    .line 419
    sget v2, Lcom/facebook/i;->name:I

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 420
    sget v3, Lcom/facebook/i;->price:I

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 421
    sget v4, Lcom/facebook/i;->status_icon:I

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 424
    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/ae;->getItem(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/stickers/StickerPack;

    .line 425
    invoke-virtual {v5}, Lcom/facebook/orca/stickers/StickerPack;->d()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 426
    invoke-virtual {v5}, Lcom/facebook/orca/stickers/StickerPack;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    sget v1, Lcom/facebook/o;->sticker_store_price_free:I

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(I)V

    .line 430
    iget-object v1, p0, Lcom/facebook/orca/stickers/ae;->a:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-static {v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(Lcom/facebook/orca/stickers/StickerStoreFragment;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v5}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    .line 431
    if-eqz v2, :cond_0

    sget v1, Lcom/facebook/h;->orca_stickers_store_pack_downloaded:I

    .line 434
    :goto_0
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 436
    new-instance v1, Lcom/facebook/orca/stickers/af;

    invoke-direct {v1, p0, v5, v2}, Lcom/facebook/orca/stickers/af;-><init>(Lcom/facebook/orca/stickers/ae;Lcom/facebook/orca/stickers/StickerPack;Z)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 443
    return-object v0

    .line 431
    :cond_0
    sget v1, Lcom/facebook/h;->orca_stickers_store_pack_download:I

    goto :goto_0
.end method
