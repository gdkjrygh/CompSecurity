.class Lcom/facebook/orca/stickers/s;
.super Ljava/lang/Object;
.source "StickerPopup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/Sticker;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Lcom/facebook/orca/stickers/StickerPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerPopup;Lcom/facebook/orca/stickers/Sticker;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 344
    iput-object p1, p0, Lcom/facebook/orca/stickers/s;->d:Lcom/facebook/orca/stickers/StickerPopup;

    iput-object p2, p0, Lcom/facebook/orca/stickers/s;->a:Lcom/facebook/orca/stickers/Sticker;

    iput-object p3, p0, Lcom/facebook/orca/stickers/s;->b:Ljava/lang/String;

    iput p4, p0, Lcom/facebook/orca/stickers/s;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 347
    iget-object v0, p0, Lcom/facebook/orca/stickers/s;->d:Lcom/facebook/orca/stickers/StickerPopup;

    iget-object v1, p0, Lcom/facebook/orca/stickers/s;->a:Lcom/facebook/orca/stickers/Sticker;

    iget-object v2, p0, Lcom/facebook/orca/stickers/s;->b:Ljava/lang/String;

    iget v3, p0, Lcom/facebook/orca/stickers/s;->c:I

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/StickerPopup;Lcom/facebook/orca/stickers/Sticker;Ljava/lang/String;I)V

    .line 348
    return-void
.end method
