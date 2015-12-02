.class public Lcom/facebook/orca/stickers/StickerPopup;
.super Lcom/facebook/orca/emoji/ComposerPopup;
.source "StickerPopup.java"


# static fields
.field private static final ai:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private aj:Lcom/facebook/orca/stickers/u;

.field private ak:Lcom/facebook/orca/emoji/TabbedPageView;

.field private al:Lcom/facebook/orca/emoji/ag;

.field private am:Lcom/facebook/c/s;

.field private an:Lcom/facebook/orca/stickers/h;

.field private ao:Lcom/facebook/fbservice/ops/k;

.field private ap:Lcom/facebook/prefs/shared/d;

.field private aq:Ljava/lang/String;

.field private ar:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/facebook/orca/stickers/StickerPopup;

    sput-object v0, Lcom/facebook/orca/stickers/StickerPopup;->ai:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/orca/emoji/ComposerPopup;-><init>()V

    .line 54
    return-void
.end method

.method static synthetic U()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lcom/facebook/orca/stickers/StickerPopup;->ai:Ljava/lang/Class;

    return-object v0
.end method

.method private V()V
    .locals 4

    .prologue
    .line 166
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksParams;

    sget-object v1, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    const/4 v2, 0x1

    sget-object v3, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/server/FetchStickerPacksParams;-><init>(Lcom/facebook/orca/server/v;ZLcom/facebook/fbservice/service/s;)V

    .line 170
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 171
    const-string v2, "fetchStickerPacksParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 172
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ao:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->I:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 176
    new-instance v1, Lcom/facebook/orca/stickers/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/stickers/m;-><init>(Lcom/facebook/orca/stickers/StickerPopup;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 190
    return-void
.end method

.method private W()V
    .locals 3

    .prologue
    .line 306
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerPopup;->X()V

    .line 307
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->n()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/stickers/StickerStoreActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 308
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerPopup;->am:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 309
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->a()V

    .line 310
    return-void
.end method

.method private X()V
    .locals 3

    .prologue
    .line 397
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->T()Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 398
    const-string v1, "action"

    const-string v2, "sticker_store_opened"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 399
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerPopup;->an:Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/stickers/h;->a(Lcom/facebook/analytics/cb;)V

    .line 400
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerPopup;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Lcom/facebook/orca/stickers/StickerPopup;->ar:I

    return p1
.end method

.method private a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;I)Landroid/view/View;
    .locals 8

    .prologue
    .line 325
    instance-of v0, p2, Lcom/facebook/orca/stickers/Sticker;

    if-nez v0, :cond_0

    .line 326
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Expected an object of type Sticker"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 328
    :cond_0
    check-cast p2, Lcom/facebook/orca/stickers/Sticker;

    .line 330
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->al:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/ag;->d()I

    move-result v0

    .line 331
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerPopup;->al:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/ag;->e()I

    move-result v1

    .line 332
    iget-object v2, p0, Lcom/facebook/orca/stickers/StickerPopup;->al:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v2}, Lcom/facebook/orca/emoji/ag;->g()I

    move-result v2

    .line 333
    iget-object v3, p0, Lcom/facebook/orca/stickers/StickerPopup;->al:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v3}, Lcom/facebook/orca/emoji/ag;->i()I

    move-result v3

    .line 334
    iget-object v4, p0, Lcom/facebook/orca/stickers/StickerPopup;->al:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v4}, Lcom/facebook/orca/emoji/ag;->h()I

    move-result v4

    .line 335
    iget-object v5, p0, Lcom/facebook/orca/stickers/StickerPopup;->al:Lcom/facebook/orca/emoji/ag;

    invoke-virtual {v5}, Lcom/facebook/orca/emoji/ag;->j()I

    move-result v5

    .line 337
    new-instance v6, Lcom/facebook/widget/images/UrlImage;

    invoke-direct {v6, p1}, Lcom/facebook/widget/images/UrlImage;-><init>(Landroid/content/Context;)V

    .line 338
    invoke-virtual {p2}, Lcom/facebook/orca/stickers/Sticker;->b()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 339
    sget v7, Lcom/facebook/h;->orca_stickers_popup_placeholder:I

    invoke-virtual {v6, v7}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderResourceId(I)V

    .line 340
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v6, v7}, Lcom/facebook/widget/images/UrlImage;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 341
    sget-object v7, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v6, v7}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 342
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v7}, Lcom/facebook/widget/images/UrlImage;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 343
    invoke-virtual {v6, v2, v3, v4, v5}, Lcom/facebook/widget/images/UrlImage;->setPadding(IIII)V

    .line 344
    new-instance v0, Lcom/facebook/orca/stickers/s;

    invoke-direct {v0, p0, p2, p3, p4}, Lcom/facebook/orca/stickers/s;-><init>(Lcom/facebook/orca/stickers/StickerPopup;Lcom/facebook/orca/stickers/Sticker;Ljava/lang/String;I)V

    invoke-virtual {v6, v0}, Lcom/facebook/widget/images/UrlImage;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 350
    return-object v6
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerPopup;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;I)Landroid/view/View;
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/orca/stickers/StickerPopup;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerPopup;)Lcom/facebook/orca/emoji/TabbedPageView;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ak:Lcom/facebook/orca/emoji/TabbedPageView;

    return-object v0
.end method

.method public static a(IIIIZI)Lcom/facebook/orca/stickers/StickerPopup;
    .locals 3

    .prologue
    .line 86
    new-instance v0, Lcom/facebook/orca/stickers/StickerPopup;

    invoke-direct {v0}, Lcom/facebook/orca/stickers/StickerPopup;-><init>()V

    .line 87
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 88
    const-string v2, "x"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 89
    const-string v2, "y"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 90
    const-string v2, "gravity"

    invoke-virtual {v1, v2, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 91
    const-string v2, "height"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 92
    const-string v2, "width"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 93
    const-string v2, "showArrowAbove"

    invoke-virtual {v1, v2, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 94
    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/StickerPopup;->g(Landroid/os/Bundle;)V

    .line 95
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerPopup;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/facebook/orca/stickers/StickerPopup;->aq:Ljava/lang/String;

    return-object p1
.end method

.method private a(Lcom/facebook/orca/stickers/Sticker;)V
    .locals 3

    .prologue
    .line 363
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 364
    const-string v1, "sticker"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 365
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerPopup;->ao:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->K:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 369
    new-instance v1, Lcom/facebook/orca/stickers/t;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/stickers/t;-><init>(Lcom/facebook/orca/stickers/StickerPopup;Lcom/facebook/orca/stickers/Sticker;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 380
    return-void
.end method

.method private a(Lcom/facebook/orca/stickers/Sticker;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->aj:Lcom/facebook/orca/stickers/u;

    if-eqz v0, :cond_0

    .line 355
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/stickers/StickerPopup;->b(Lcom/facebook/orca/stickers/Sticker;Ljava/lang/String;I)V

    .line 356
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/Sticker;)V

    .line 357
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->aj:Lcom/facebook/orca/stickers/u;

    invoke-interface {v0, p1}, Lcom/facebook/orca/stickers/u;->a(Lcom/facebook/orca/stickers/Sticker;)V

    .line 359
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->a()V

    .line 360
    return-void
.end method

.method private a(Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 3

    .prologue
    .line 313
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/StickerPopup;->b(Lcom/facebook/orca/stickers/StickerPack;)V

    .line 314
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->n()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/stickers/StickerStoreActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 315
    const-string v1, "stickerPack"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 316
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerPopup;->am:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 317
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->a()V

    .line 318
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerPopup;Lcom/facebook/orca/stickers/Sticker;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/Sticker;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerPopup;Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/StickerPack;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerPopup;Lcom/google/common/a/es;Lcom/google/common/a/es;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    return-void
.end method

.method private a(Lcom/google/common/a/es;Lcom/google/common/a/es;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    .line 195
    const-string v0, "StickerPopup updateStickerPacks"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v9

    .line 198
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 199
    new-instance v0, Lcom/facebook/orca/emoji/ao;

    sget v2, Lcom/facebook/h;->orca_stickers_store_tab:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lcom/facebook/orca/stickers/n;

    invoke-direct {v3, p0}, Lcom/facebook/orca/stickers/n;-><init>(Lcom/facebook/orca/stickers/StickerPopup;)V

    invoke-direct {v0, v2, v3}, Lcom/facebook/orca/emoji/ao;-><init>(Ljava/lang/Integer;Landroid/view/View$OnClickListener;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 211
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 212
    invoke-virtual {p2}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    new-instance v0, Lcom/facebook/orca/emoji/am;

    const-string v3, "recentStickers"

    sget v4, Lcom/facebook/h;->orca_stickers_recent_tab:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v0, v3, v4, p2}, Lcom/facebook/orca/emoji/am;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    :cond_0
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 220
    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 221
    new-instance v4, Lcom/facebook/orca/emoji/am;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v5

    sget v7, Lcom/facebook/h;->orca_emoji_category_people:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->f()Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {v4, v5, v7, v8, v0}, Lcom/facebook/orca/emoji/am;-><init>(Ljava/lang/String;Ljava/lang/Integer;Landroid/net/Uri;Ljava/util/List;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 230
    :cond_1
    new-instance v4, Lcom/facebook/orca/stickers/o;

    invoke-direct {v4, p0}, Lcom/facebook/orca/stickers/o;-><init>(Lcom/facebook/orca/stickers/StickerPopup;)V

    .line 237
    new-instance v5, Lcom/facebook/orca/stickers/p;

    invoke-direct {v5, p0}, Lcom/facebook/orca/stickers/p;-><init>(Lcom/facebook/orca/stickers/StickerPopup;)V

    .line 249
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ap:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/stickers/v;->c:Lcom/facebook/prefs/shared/ae;

    const/4 v7, 0x0

    invoke-interface {v0, v3, v7}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 250
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ap:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/stickers/v;->d:Lcom/facebook/prefs/shared/ae;

    const/4 v8, 0x0

    invoke-interface {v0, v3, v8}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v8

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ak:Lcom/facebook/orca/emoji/TabbedPageView;

    iget-object v3, p0, Lcom/facebook/orca/stickers/StickerPopup;->al:Lcom/facebook/orca/emoji/ag;

    invoke-virtual/range {v0 .. v8}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Ljava/util/List;Ljava/util/List;Lcom/facebook/orca/emoji/ag;Lcom/facebook/orca/emoji/aq;Lcom/facebook/orca/emoji/an;ZLjava/lang/String;I)V

    .line 263
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksParams;

    sget-object v1, Lcom/facebook/orca/server/v;->STORE_PACKS:Lcom/facebook/orca/server/v;

    sget-object v2, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/orca/server/FetchStickerPacksParams;-><init>(Lcom/facebook/orca/server/v;ZLcom/facebook/fbservice/service/s;)V

    .line 267
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 268
    const-string v2, "fetchStickerPacksParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 269
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ao:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->I:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 273
    new-instance v1, Lcom/facebook/orca/stickers/q;

    invoke-direct {v1, p0, v10}, Lcom/facebook/orca/stickers/q;-><init>(Lcom/facebook/orca/stickers/StickerPopup;Ljava/util/Set;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 302
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J

    .line 303
    return-void
.end method

.method private b(Lcom/facebook/orca/stickers/Sticker;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 388
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->T()Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 389
    const-string v1, "action"

    const-string v2, "sticker_selected"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 390
    const-string v1, "sticker"

    invoke-virtual {p1}, Lcom/facebook/orca/stickers/Sticker;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 391
    const-string v1, "sticker_pack"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 392
    const-string v1, "page_num"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 393
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerPopup;->an:Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/stickers/h;->a(Lcom/facebook/analytics/cb;)V

    .line 394
    return-void
.end method

.method private b(Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 3

    .prologue
    .line 403
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->T()Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 404
    const-string v1, "action"

    const-string v2, "sticker_store_pack_opened"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 405
    const-string v1, "sticker_pack"

    invoke-virtual {p1}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 406
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerPopup;->an:Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/stickers/h;->a(Lcom/facebook/analytics/cb;)V

    .line 407
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/stickers/StickerPopup;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerPopup;->W()V

    return-void
.end method


# virtual methods
.method protected S()Ljava/lang/String;
    .locals 1

    .prologue
    .line 384
    const-string v0, "sticker_popup"

    return-object v0
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 126
    const-string v0, "StickerPopup onCreateView"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 128
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->Q()V

    .line 130
    const-string v0, "StickerPopup onCreateView layoutInflation"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 131
    sget v2, Lcom/facebook/k;->orca_sticker_popup:I

    const/4 v3, 0x0

    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/stickers/StickerPopup;->ag:Landroid/view/View;

    .line 132
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->tabbed_page_view:I

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/stickers/StickerPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/TabbedPageView;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ak:Lcom/facebook/orca/emoji/TabbedPageView;

    .line 135
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerPopup;->V()V

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ak:Lcom/facebook/orca/emoji/TabbedPageView;

    new-instance v2, Lcom/facebook/orca/stickers/l;

    invoke-direct {v2, p0}, Lcom/facebook/orca/stickers/l;-><init>(Lcom/facebook/orca/stickers/StickerPopup;)V

    invoke-virtual {v0, v2}, Lcom/facebook/orca/emoji/TabbedPageView;->setEllipsisClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->O()V

    .line 145
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->P()V

    .line 147
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ag:Landroid/view/View;

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 105
    invoke-super {p0, p1}, Lcom/facebook/orca/emoji/ComposerPopup;->a(Landroid/os/Bundle;)V

    .line 107
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 108
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->am:Lcom/facebook/c/s;

    .line 109
    const-class v0, Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/h;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->an:Lcom/facebook/orca/stickers/h;

    .line 110
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ao:Lcom/facebook/fbservice/ops/k;

    .line 111
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ap:Lcom/facebook/prefs/shared/d;

    .line 113
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPopup;->o()Landroid/content/res/Resources;

    move-result-object v0

    .line 114
    new-instance v1, Lcom/facebook/orca/emoji/ae;

    new-instance v2, Lcom/facebook/orca/stickers/g;

    invoke-direct {v2}, Lcom/facebook/orca/stickers/g;-><init>()V

    invoke-direct {v1, v0, v2}, Lcom/facebook/orca/emoji/ae;-><init>(Landroid/content/res/Resources;Lcom/facebook/orca/emoji/af;)V

    iget v2, p0, Lcom/facebook/orca/stickers/StickerPopup;->ac:I

    iget v3, p0, Lcom/facebook/orca/stickers/StickerPopup;->ab:I

    sget v4, Lcom/facebook/g;->emoji_category_height_dp:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sub-int v0, v3, v0

    iget v3, p0, Lcom/facebook/orca/stickers/StickerPopup;->af:I

    sub-int/2addr v0, v3

    iget-boolean v3, p0, Lcom/facebook/orca/stickers/StickerPopup;->ad:Z

    invoke-virtual {v1, v2, v0, v3}, Lcom/facebook/orca/emoji/ae;->a(IIZ)Lcom/facebook/orca/emoji/ag;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->al:Lcom/facebook/orca/emoji/ag;

    .line 119
    return-void
.end method

.method public a(Lcom/facebook/orca/stickers/u;)V
    .locals 0

    .prologue
    .line 99
    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/emoji/b;)V

    .line 100
    iput-object p1, p0, Lcom/facebook/orca/stickers/StickerPopup;->aj:Lcom/facebook/orca/stickers/u;

    .line 101
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    .line 154
    invoke-super {p0, p1}, Lcom/facebook/orca/emoji/ComposerPopup;->onDismiss(Landroid/content/DialogInterface;)V

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->aq:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPopup;->ap:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/stickers/v;->c:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/stickers/StickerPopup;->aq:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/stickers/v;->d:Lcom/facebook/prefs/shared/ae;

    iget v2, p0, Lcom/facebook/orca/stickers/StickerPopup;->ar:I

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 163
    :cond_0
    return-void
.end method
