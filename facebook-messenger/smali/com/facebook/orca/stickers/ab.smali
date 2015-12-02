.class Lcom/facebook/orca/stickers/ab;
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
.field final synthetic a:Lcom/facebook/orca/stickers/StickerStoreFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerStoreFragment;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/orca/stickers/ab;->a:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 146
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->h()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    .line 148
    iget-object v1, p0, Lcom/facebook/orca/stickers/ab;->a:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-static {v1}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(Lcom/facebook/orca/stickers/StickerStoreFragment;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 149
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 150
    iget-object v2, p0, Lcom/facebook/orca/stickers/ab;->a:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-static {v2}, Lcom/facebook/orca/stickers/StickerStoreFragment;->d(Lcom/facebook/orca/stickers/StickerStoreFragment;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/stickers/ab;->a:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-static {v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/stickers/StickerStoreFragment;)V

    .line 153
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 143
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/ab;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 158
    invoke-static {}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Error loading pack list"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 159
    iget-object v0, p0, Lcom/facebook/orca/stickers/ab;->a:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-static {v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/stickers/StickerStoreFragment;)V

    .line 160
    return-void
.end method
