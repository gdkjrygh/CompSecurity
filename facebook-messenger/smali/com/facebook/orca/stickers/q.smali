.class Lcom/facebook/orca/stickers/q;
.super Ljava/lang/Object;
.source "StickerPopup.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:Lcom/facebook/orca/stickers/StickerPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerPopup;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 273
    iput-object p1, p0, Lcom/facebook/orca/stickers/q;->b:Lcom/facebook/orca/stickers/StickerPopup;

    iput-object p2, p0, Lcom/facebook/orca/stickers/q;->a:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 7

    .prologue
    .line 276
    invoke-static {}, Lcom/facebook/orca/stickers/StickerPopup;->U()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Sticker fetch succeeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 277
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->h()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    .line 278
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    .line 279
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 280
    iget-object v2, p0, Lcom/facebook/orca/stickers/q;->a:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->i()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 281
    new-instance v2, Lcom/facebook/orca/stickers/r;

    invoke-direct {v2, p0, v0}, Lcom/facebook/orca/stickers/r;-><init>(Lcom/facebook/orca/stickers/q;Lcom/facebook/orca/stickers/StickerPack;)V

    .line 287
    iget-object v3, p0, Lcom/facebook/orca/stickers/q;->b:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-static {v3}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/StickerPopup;)Lcom/facebook/orca/emoji/TabbedPageView;

    move-result-object v3

    new-instance v4, Lcom/facebook/orca/emoji/ao;

    sget v5, Lcom/facebook/h;->orca_emoji_category_people:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->f()Landroid/net/Uri;

    move-result-object v0

    sget v6, Lcom/facebook/h;->orca_stickers_promoted_tab_icon:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v4, v5, v0, v6, v2}, Lcom/facebook/orca/emoji/ao;-><init>(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/Integer;Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, v4}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Lcom/facebook/orca/emoji/ao;)V

    goto :goto_0

    .line 294
    :cond_1
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 273
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/q;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 298
    invoke-static {}, Lcom/facebook/orca/stickers/StickerPopup;->U()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Promoted sticker fetch failed"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 299
    return-void
.end method
