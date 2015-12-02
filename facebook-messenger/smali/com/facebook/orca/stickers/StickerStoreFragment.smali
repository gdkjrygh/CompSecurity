.class public Lcom/facebook/orca/stickers/StickerStoreFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "StickerStoreFragment.java"

# interfaces
.implements Lcom/facebook/base/fragment/b;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private Z:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private aa:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private ab:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ac:Z

.field private ad:Lcom/facebook/orca/stickers/ag;

.field private b:Lcom/facebook/base/fragment/c;

.field private c:Lcom/facebook/fbservice/ops/k;

.field private d:Lcom/facebook/orca/stickers/h;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/FrameLayout;

.field private i:Lcom/facebook/widget/listview/EmptyListViewItem;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 55
    const-class v0, Lcom/facebook/orca/stickers/StickerStoreFragment;

    sput-object v0, Lcom/facebook/orca/stickers/StickerStoreFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 402
    return-void
.end method

.method private O()V
    .locals 4

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ad:Lcom/facebook/orca/stickers/ag;

    sget-object v1, Lcom/facebook/orca/stickers/ag;->OWNED:Lcom/facebook/orca/stickers/ag;

    if-ne v0, v1, :cond_0

    .line 244
    :goto_0
    return-void

    .line 236
    :cond_0
    const-string v0, "StickerStoreFragment gotoOwnedTab"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 238
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->P()Landroid/widget/ListView;

    move-result-object v1

    .line 239
    sget-object v2, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    sget-object v3, Lcom/facebook/orca/stickers/ag;->OWNED:Lcom/facebook/orca/stickers/ag;

    invoke-direct {p0, v2, v1, v3}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/server/v;Landroid/widget/ListView;Lcom/facebook/orca/stickers/ag;)V

    .line 241
    sget-object v1, Lcom/facebook/orca/stickers/ag;->OWNED:Lcom/facebook/orca/stickers/ag;

    invoke-direct {p0, v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->b(Lcom/facebook/orca/stickers/ag;)V

    .line 243
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0
.end method

.method private P()Landroid/widget/ListView;
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/high16 v8, 0x41200000    # 10.0f

    const v7, 0x106000d

    const/4 v6, 0x0

    const/4 v5, -0x1

    .line 255
    new-instance v0, Landroid/widget/ListView;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 256
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v5, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 259
    new-instance v1, Landroid/graphics/drawable/ClipDrawable;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->o()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/f;->publisher_vertical_divider:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    const/16 v3, 0x2648

    invoke-direct {v1, v2, v3, v9}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 263
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 264
    invoke-virtual {v0, v9}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 265
    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setHeaderDividersEnabled(Z)V

    .line 266
    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setFooterDividersEnabled(Z)V

    .line 267
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 268
    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setFadingEdgeLength(I)V

    .line 271
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v8}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {p0, v1, v7}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(II)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 274
    sget v1, Lcom/facebook/h;->sticker_store_bg_top:I

    invoke-direct {p0, v5, v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(II)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 277
    sget v1, Lcom/facebook/h;->sticker_store_bg_bottom:I

    invoke-direct {p0, v5, v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(II)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 280
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v8}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {p0, v1, v7}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(II)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 285
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 286
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 288
    invoke-direct {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Landroid/widget/ListView;)V

    .line 290
    return-object v0
.end method

.method private a(II)Landroid/view/View;
    .locals 3

    .prologue
    .line 297
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 298
    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, p1}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 301
    invoke-virtual {v0, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 302
    return-object v0
.end method

.method private a(Lcom/facebook/orca/server/v;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/ops/n;
    .locals 3

    .prologue
    .line 357
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksParams;

    invoke-direct {v0, p1, p2}, Lcom/facebook/orca/server/FetchStickerPacksParams;-><init>(Lcom/facebook/orca/server/v;Lcom/facebook/fbservice/service/s;)V

    .line 358
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 359
    const-string v2, "fetchStickerPacksParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 360
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->I:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/facebook/orca/stickers/StickerStoreFragment;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private a(Landroid/widget/ListView;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 376
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 377
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 378
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 379
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 380
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 381
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 382
    return-void
.end method

.method private a(Landroid/widget/ListView;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ListView;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 367
    const-string v0, "StickerStoreFragment loadListViewContent"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 369
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->b(Landroid/widget/ListView;)V

    .line 370
    new-instance v1, Lcom/facebook/orca/stickers/ae;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2, p2}, Lcom/facebook/orca/stickers/ae;-><init>(Lcom/facebook/orca/stickers/StickerStoreFragment;Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {p1, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 372
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 373
    return-void
.end method

.method private a(Lcom/facebook/orca/server/v;Landroid/widget/ListView;Lcom/facebook/orca/stickers/ag;)V
    .locals 2

    .prologue
    .line 312
    iget-boolean v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ac:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/orca/server/v;->STORE_PACKS:Lcom/facebook/orca/server/v;

    if-ne p1, v0, :cond_0

    .line 313
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    .line 314
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ac:Z

    .line 318
    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/server/v;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 321
    new-instance v1, Lcom/facebook/orca/stickers/ac;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/facebook/orca/stickers/ac;-><init>(Lcom/facebook/orca/stickers/StickerStoreFragment;Lcom/facebook/orca/server/v;Lcom/facebook/orca/stickers/ag;Landroid/widget/ListView;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 352
    return-void

    .line 316
    :cond_0
    sget-object v0, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/stickers/StickerPack;Z)V
    .locals 2

    .prologue
    .line 448
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->b:Lcom/facebook/base/fragment/c;

    if-eqz v0, :cond_0

    .line 449
    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/stickers/StickerPack;)V

    .line 450
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 451
    const-string v1, "stickerPack"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 452
    const-string v1, "isOwned"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 453
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->b:Lcom/facebook/base/fragment/c;

    invoke-interface {v1, p0, v0}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 455
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerStoreFragment;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->c()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerStoreFragment;Landroid/widget/ListView;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->c(Landroid/widget/ListView;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerStoreFragment;Landroid/widget/ListView;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Landroid/widget/ListView;Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerStoreFragment;Lcom/facebook/orca/stickers/StickerPack;Z)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/stickers/StickerPack;Z)V

    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ad:Lcom/facebook/orca/stickers/ag;

    .line 180
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ad:Lcom/facebook/orca/stickers/ag;

    .line 182
    sget-object v1, Lcom/facebook/orca/stickers/ad;->a:[I

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/ag;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 196
    sget-object v1, Lcom/facebook/orca/stickers/StickerStoreFragment;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown tab specified for reload: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 197
    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ad:Lcom/facebook/orca/stickers/ag;

    .line 199
    :goto_0
    return-void

    .line 184
    :pswitch_0
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->c()V

    goto :goto_0

    .line 188
    :pswitch_1
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d()V

    goto :goto_0

    .line 192
    :pswitch_2
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->O()V

    goto :goto_0

    .line 182
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b(Landroid/widget/ListView;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 385
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 386
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 387
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 388
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 389
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 390
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 391
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/stickers/StickerStoreFragment;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d()V

    return-void
.end method

.method private b(Lcom/facebook/orca/stickers/ag;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 247
    iput-object p1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ad:Lcom/facebook/orca/stickers/ag;

    .line 248
    iget-object v3, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->e:Landroid/widget/LinearLayout;

    sget-object v0, Lcom/facebook/orca/stickers/ag;->FEATURED:Lcom/facebook/orca/stickers/ag;

    if-ne p1, v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setSelected(Z)V

    .line 249
    iget-object v3, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->f:Landroid/widget/LinearLayout;

    sget-object v0, Lcom/facebook/orca/stickers/ag;->AVAILABLE:Lcom/facebook/orca/stickers/ag;

    if-ne p1, v0, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setSelected(Z)V

    .line 250
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->g:Landroid/widget/LinearLayout;

    sget-object v3, Lcom/facebook/orca/stickers/ag;->OWNED:Lcom/facebook/orca/stickers/ag;

    if-ne p1, v3, :cond_2

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setSelected(Z)V

    .line 251
    return-void

    :cond_0
    move v0, v2

    .line 248
    goto :goto_0

    :cond_1
    move v0, v2

    .line 249
    goto :goto_1

    :cond_2
    move v1, v2

    .line 250
    goto :goto_2
.end method

.method private c()V
    .locals 4

    .prologue
    .line 202
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ad:Lcom/facebook/orca/stickers/ag;

    sget-object v1, Lcom/facebook/orca/stickers/ag;->FEATURED:Lcom/facebook/orca/stickers/ag;

    if-ne v0, v1, :cond_0

    .line 214
    :goto_0
    return-void

    .line 206
    :cond_0
    const-string v0, "StickerStoreFragment gotoFeaturedTab"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 208
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->P()Landroid/widget/ListView;

    move-result-object v1

    .line 209
    sget-object v2, Lcom/facebook/orca/server/v;->STORE_PACKS:Lcom/facebook/orca/server/v;

    sget-object v3, Lcom/facebook/orca/stickers/ag;->FEATURED:Lcom/facebook/orca/stickers/ag;

    invoke-direct {p0, v2, v1, v3}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/server/v;Landroid/widget/ListView;Lcom/facebook/orca/stickers/ag;)V

    .line 211
    sget-object v1, Lcom/facebook/orca/stickers/ag;->FEATURED:Lcom/facebook/orca/stickers/ag;

    invoke-direct {p0, v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->b(Lcom/facebook/orca/stickers/ag;)V

    .line 213
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0
.end method

.method private c(Landroid/widget/ListView;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 394
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 395
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 396
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 397
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 398
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 399
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 400
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/stickers/StickerStoreFragment;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->O()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/stickers/StickerStoreFragment;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ab:Ljava/util/Set;

    return-object v0
.end method

.method private d()V
    .locals 4

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ad:Lcom/facebook/orca/stickers/ag;

    sget-object v1, Lcom/facebook/orca/stickers/ag;->AVAILABLE:Lcom/facebook/orca/stickers/ag;

    if-ne v0, v1, :cond_0

    .line 229
    :goto_0
    return-void

    .line 221
    :cond_0
    const-string v0, "StickerStoreFragment gotoAvailableTab"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 223
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->P()Landroid/widget/ListView;

    move-result-object v1

    .line 224
    sget-object v2, Lcom/facebook/orca/server/v;->STORE_PACKS:Lcom/facebook/orca/server/v;

    sget-object v3, Lcom/facebook/orca/stickers/ag;->AVAILABLE:Lcom/facebook/orca/stickers/ag;

    invoke-direct {p0, v2, v1, v3}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/server/v;Landroid/widget/ListView;Lcom/facebook/orca/stickers/ag;)V

    .line 226
    sget-object v1, Lcom/facebook/orca/stickers/ag;->AVAILABLE:Lcom/facebook/orca/stickers/ag;

    invoke-direct {p0, v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->b(Lcom/facebook/orca/stickers/ag;)V

    .line 228
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 90
    sget v0, Lcom/facebook/k;->orca_sticker_store_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 174
    iput-object p1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->b:Lcom/facebook/base/fragment/c;

    .line 175
    return-void
.end method

.method protected a(Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 3

    .prologue
    .line 465
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->d:Lcom/facebook/orca/stickers/h;

    const-string v1, "sticker_store"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/h;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 466
    const-string v1, "action"

    const-string v2, "sticker_pack_selected"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 467
    const-string v1, "sticker_pack"

    invoke-virtual {p1}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 468
    const-string v1, "store_tab"

    iget-object v2, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ad:Lcom/facebook/orca/stickers/ag;

    invoke-virtual {v2}, Lcom/facebook/orca/stickers/ag;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 469
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->d:Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/stickers/h;->a(Lcom/facebook/analytics/cb;)V

    .line 470
    return-void
.end method

.method protected a(Lcom/facebook/orca/stickers/ag;)V
    .locals 3

    .prologue
    .line 458
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->d:Lcom/facebook/orca/stickers/h;

    const-string v1, "sticker_store"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/h;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 459
    const-string v1, "action"

    const-string v2, "sticker_store_tab_load_error"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 460
    const-string v1, "store_tab"

    invoke-virtual {p1}, Lcom/facebook/orca/stickers/ag;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 461
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->d:Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/stickers/h;->a(Lcom/facebook/analytics/cb;)V

    .line 462
    return-void
.end method

.method public c(Z)V
    .locals 0

    .prologue
    .line 166
    if-nez p1, :cond_0

    .line 169
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->b()V

    .line 171
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const v2, 0x106000d

    .line 95
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 97
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 98
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->c:Lcom/facebook/fbservice/ops/k;

    .line 99
    const-class v0, Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/h;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->d:Lcom/facebook/orca/stickers/h;

    .line 101
    sget v0, Lcom/facebook/i;->featured_tab:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->e:Landroid/widget/LinearLayout;

    .line 102
    sget v0, Lcom/facebook/i;->available_tab:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->f:Landroid/widget/LinearLayout;

    .line 103
    sget v0, Lcom/facebook/i;->owned_tab:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->g:Landroid/widget/LinearLayout;

    .line 104
    sget v0, Lcom/facebook/i;->store_tab_content:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    .line 105
    sget v0, Lcom/facebook/i;->loading_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 106
    sget v0, Lcom/facebook/i;->empty_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 107
    sget v0, Lcom/facebook/i;->error_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->generic_loading:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(I)V

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->i:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setBackgroundColor(I)V

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->sticker_store_category_empty:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(I)V

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->Z:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setBackgroundColor(I)V

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->generic_error_message:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(I)V

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->aa:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setBackgroundColor(I)V

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->e:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/facebook/orca/stickers/y;

    invoke-direct {v1, p0}, Lcom/facebook/orca/stickers/y;-><init>(Lcom/facebook/orca/stickers/StickerStoreFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->f:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/facebook/orca/stickers/z;

    invoke-direct {v1, p0}, Lcom/facebook/orca/stickers/z;-><init>(Lcom/facebook/orca/stickers/StickerStoreFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->g:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/facebook/orca/stickers/aa;

    invoke-direct {v1, p0}, Lcom/facebook/orca/stickers/aa;-><init>(Lcom/facebook/orca/stickers/StickerStoreFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 139
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->P()Landroid/widget/ListView;

    .line 140
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreFragment;->ab:Ljava/util/Set;

    .line 141
    sget-object v0, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    sget-object v1, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/server/v;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 143
    new-instance v1, Lcom/facebook/orca/stickers/ab;

    invoke-direct {v1, p0}, Lcom/facebook/orca/stickers/ab;-><init>(Lcom/facebook/orca/stickers/StickerStoreFragment;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 162
    return-void
.end method
