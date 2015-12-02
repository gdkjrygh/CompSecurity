.class Lcom/facebook/orca/stickers/r;
.super Ljava/lang/Object;
.source "StickerPopup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/StickerPack;

.field final synthetic b:Lcom/facebook/orca/stickers/q;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/q;Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 0

    .prologue
    .line 281
    iput-object p1, p0, Lcom/facebook/orca/stickers/r;->b:Lcom/facebook/orca/stickers/q;

    iput-object p2, p0, Lcom/facebook/orca/stickers/r;->a:Lcom/facebook/orca/stickers/StickerPack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 284
    iget-object v0, p0, Lcom/facebook/orca/stickers/r;->b:Lcom/facebook/orca/stickers/q;

    iget-object v0, v0, Lcom/facebook/orca/stickers/q;->b:Lcom/facebook/orca/stickers/StickerPopup;

    iget-object v1, p0, Lcom/facebook/orca/stickers/r;->a:Lcom/facebook/orca/stickers/StickerPack;

    invoke-static {v0, v1}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/StickerPopup;Lcom/facebook/orca/stickers/StickerPack;)V

    .line 285
    return-void
.end method
