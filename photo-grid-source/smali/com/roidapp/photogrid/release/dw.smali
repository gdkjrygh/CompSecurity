.class final Lcom/roidapp/photogrid/release/dw;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 219
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dw;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dw;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;)Landroid/util/SparseArray;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    sget v0, Lcom/roidapp/photogrid/release/ei;->k:I

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 227
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 232
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 237
    if-eqz p2, :cond_0

    .line 271
    :goto_0
    return-object p2

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dw;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/eh;

    .line 241
    if-nez v0, :cond_1

    move-object p2, v3

    .line 242
    goto :goto_0

    .line 244
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 246
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dw;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0300c2

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 247
    iget v1, v0, Lcom/roidapp/photogrid/release/eh;->a:I

    invoke-virtual {p2, v1}, Landroid/view/View;->setId(I)V

    .line 249
    const v1, 0x7f0d031b

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 250
    const v2, 0x7f0d031d

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 251
    const v5, 0x7f0d031c

    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 254
    iget v5, v0, Lcom/roidapp/photogrid/release/eh;->b:I

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 256
    iget-object v5, p0, Lcom/roidapp/photogrid/release/dw;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/dk;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    iget v6, v0, Lcom/roidapp/photogrid/release/eh;->c:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 257
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v6

    sget v7, Lcom/roidapp/photogrid/release/ei;->d:I

    add-int/lit8 v7, v7, -0x1

    if-ne v6, v7, :cond_2

    .line 258
    if-eqz v4, :cond_3

    array-length v4, v4

    const/4 v6, 0x2

    if-ge v4, v6, :cond_3

    .line 259
    const/16 v4, 0x32

    invoke-virtual {v5, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 260
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dw;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/dk;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f0c00c0

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 265
    :cond_2
    :goto_1
    invoke-virtual {v1, v3, v5, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 267
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/eh;->d:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 269
    const v0, 0x7f0205ff

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 262
    :cond_3
    const/16 v4, 0xff

    invoke-virtual {v5, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_1

    .line 267
    :cond_4
    const/16 v0, 0x8

    goto :goto_2
.end method
