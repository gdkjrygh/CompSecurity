.class Lcom/facebook/orca/stickers/ac;
.super Ljava/lang/Object;
.source "StickerStoreFragment.java"

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
.field final synthetic a:Lcom/facebook/orca/server/v;

.field final synthetic b:Lcom/facebook/orca/stickers/ag;

.field final synthetic c:Landroid/widget/ListView;

.field final synthetic d:Lcom/facebook/orca/stickers/StickerStoreFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerStoreFragment;Lcom/facebook/orca/server/v;Lcom/facebook/orca/stickers/ag;Landroid/widget/ListView;)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lcom/facebook/orca/stickers/ac;->d:Lcom/facebook/orca/stickers/StickerStoreFragment;

    iput-object p2, p0, Lcom/facebook/orca/stickers/ac;->a:Lcom/facebook/orca/server/v;

    iput-object p3, p0, Lcom/facebook/orca/stickers/ac;->b:Lcom/facebook/orca/stickers/ag;

    iput-object p4, p0, Lcom/facebook/orca/stickers/ac;->c:Landroid/widget/ListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 4

    .prologue
    .line 324
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->h()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v1

    .line 326
    iget-object v0, p0, Lcom/facebook/orca/stickers/ac;->a:Lcom/facebook/orca/server/v;

    sget-object v2, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    if-ne v0, v2, :cond_0

    .line 327
    iget-object v0, p0, Lcom/facebook/orca/stickers/ac;->d:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-static {v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(Lcom/facebook/orca/stickers/StickerStoreFragment;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 328
    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 329
    iget-object v3, p0, Lcom/facebook/orca/stickers/ac;->d:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-static {v3}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(Lcom/facebook/orca/stickers/StickerStoreFragment;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/stickers/ac;->b:Lcom/facebook/orca/stickers/ag;

    sget-object v2, Lcom/facebook/orca/stickers/ag;->FEATURED:Lcom/facebook/orca/stickers/ag;

    if-ne v0, v2, :cond_3

    .line 334
    new-instance v2, Lcom/google/common/a/et;

    invoke-direct {v2}, Lcom/google/common/a/et;-><init>()V

    .line 335
    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 336
    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->h()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 337
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 340
    :cond_2
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 342
    :goto_2
    iget-object v1, p0, Lcom/facebook/orca/stickers/ac;->d:Lcom/facebook/orca/stickers/StickerStoreFragment;

    iget-object v2, p0, Lcom/facebook/orca/stickers/ac;->c:Landroid/widget/ListView;

    invoke-static {v1, v2, v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/stickers/StickerStoreFragment;Landroid/widget/ListView;Ljava/util/List;)V

    .line 343
    return-void

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 321
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/ac;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 347
    invoke-static {}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Error loading pack list"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 348
    iget-object v0, p0, Lcom/facebook/orca/stickers/ac;->d:Lcom/facebook/orca/stickers/StickerStoreFragment;

    iget-object v1, p0, Lcom/facebook/orca/stickers/ac;->b:Lcom/facebook/orca/stickers/ag;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/stickers/ag;)V

    .line 349
    iget-object v0, p0, Lcom/facebook/orca/stickers/ac;->d:Lcom/facebook/orca/stickers/StickerStoreFragment;

    iget-object v1, p0, Lcom/facebook/orca/stickers/ac;->c:Landroid/widget/ListView;

    invoke-static {v0, v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/stickers/StickerStoreFragment;Landroid/widget/ListView;)V

    .line 350
    return-void
.end method
