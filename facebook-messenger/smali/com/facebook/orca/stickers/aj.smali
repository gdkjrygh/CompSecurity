.class Lcom/facebook/orca/stickers/aj;
.super Ljava/lang/Object;
.source "StickerStorePackFragment.java"

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
.field final synthetic a:Lcom/facebook/orca/stickers/StickerPack;

.field final synthetic b:Lcom/facebook/orca/stickers/StickerStorePackFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerStorePackFragment;Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lcom/facebook/orca/stickers/aj;->b:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    iput-object p2, p0, Lcom/facebook/orca/stickers/aj;->a:Lcom/facebook/orca/stickers/StickerPack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 150
    invoke-static {}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Successfully added sticker pack "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/stickers/aj;->a:Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v2}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/facebook/orca/stickers/aj;->b:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    const-string v1, "sticker_pack_downloaded"

    iget-object v2, p0, Lcom/facebook/orca/stickers/aj;->a:Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a(Ljava/lang/String;Lcom/facebook/orca/stickers/StickerPack;)V

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/stickers/aj;->b:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-static {v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->c(Lcom/facebook/orca/stickers/StickerStorePackFragment;)Landroid/widget/Button;

    move-result-object v0

    sget v1, Lcom/facebook/o;->sticker_store_downloaded:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 153
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 147
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/aj;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 157
    invoke-static {}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to add sticker pack "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/stickers/aj;->a:Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v2}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/stickers/aj;->b:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    const-string v1, "sticker_pack_download_error"

    iget-object v2, p0, Lcom/facebook/orca/stickers/aj;->a:Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a(Ljava/lang/String;Lcom/facebook/orca/stickers/StickerPack;)V

    .line 159
    iget-object v0, p0, Lcom/facebook/orca/stickers/aj;->b:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-static {v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->c(Lcom/facebook/orca/stickers/StickerStorePackFragment;)Landroid/widget/Button;

    move-result-object v0

    sget v1, Lcom/facebook/o;->sticker_store_download:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 160
    iget-object v0, p0, Lcom/facebook/orca/stickers/aj;->b:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-static {v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->c(Lcom/facebook/orca/stickers/StickerStorePackFragment;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/stickers/aj;->b:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->generic_error_message:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 166
    return-void
.end method
