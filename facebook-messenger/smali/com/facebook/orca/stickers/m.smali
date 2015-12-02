.class Lcom/facebook/orca/stickers/m;
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
.field final synthetic a:Lcom/facebook/orca/stickers/StickerPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerPopup;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/facebook/orca/stickers/m;->a:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 179
    invoke-static {}, Lcom/facebook/orca/stickers/StickerPopup;->U()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Sticker fetch succeeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 180
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->h()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    .line 181
    iget-object v1, p0, Lcom/facebook/orca/stickers/m;->a:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksResult;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/StickerPopup;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    .line 182
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 176
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/m;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 186
    invoke-static {}, Lcom/facebook/orca/stickers/StickerPopup;->U()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Sticker fetch failed"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/stickers/m;->a:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-static {v0}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/StickerPopup;)Lcom/facebook/orca/emoji/TabbedPageView;

    move-result-object v0

    sget v1, Lcom/facebook/o;->generic_error_message:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/emoji/TabbedPageView;->a(I)V

    .line 188
    return-void
.end method
