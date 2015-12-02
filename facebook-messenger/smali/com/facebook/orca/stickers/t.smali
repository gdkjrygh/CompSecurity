.class Lcom/facebook/orca/stickers/t;
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
.field final synthetic a:Lcom/facebook/orca/stickers/Sticker;

.field final synthetic b:Lcom/facebook/orca/stickers/StickerPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerPopup;Lcom/facebook/orca/stickers/Sticker;)V
    .locals 0

    .prologue
    .line 369
    iput-object p1, p0, Lcom/facebook/orca/stickers/t;->b:Lcom/facebook/orca/stickers/StickerPopup;

    iput-object p2, p0, Lcom/facebook/orca/stickers/t;->a:Lcom/facebook/orca/stickers/Sticker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 372
    invoke-static {}, Lcom/facebook/orca/stickers/StickerPopup;->U()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sticker added to recent list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/stickers/t;->a:Lcom/facebook/orca/stickers/Sticker;

    invoke-virtual {v2}, Lcom/facebook/orca/stickers/Sticker;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 373
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 369
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/t;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 377
    invoke-static {}, Lcom/facebook/orca/stickers/StickerPopup;->U()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Failed to add sticker to recent list"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 378
    return-void
.end method
