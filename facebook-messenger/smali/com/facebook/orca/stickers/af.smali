.class Lcom/facebook/orca/stickers/af;
.super Ljava/lang/Object;
.source "StickerStoreFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/StickerPack;

.field final synthetic b:Z

.field final synthetic c:Lcom/facebook/orca/stickers/ae;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/ae;Lcom/facebook/orca/stickers/StickerPack;Z)V
    .locals 0

    .prologue
    .line 436
    iput-object p1, p0, Lcom/facebook/orca/stickers/af;->c:Lcom/facebook/orca/stickers/ae;

    iput-object p2, p0, Lcom/facebook/orca/stickers/af;->a:Lcom/facebook/orca/stickers/StickerPack;

    iput-boolean p3, p0, Lcom/facebook/orca/stickers/af;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 439
    iget-object v0, p0, Lcom/facebook/orca/stickers/af;->c:Lcom/facebook/orca/stickers/ae;

    iget-object v0, v0, Lcom/facebook/orca/stickers/ae;->a:Lcom/facebook/orca/stickers/StickerStoreFragment;

    iget-object v1, p0, Lcom/facebook/orca/stickers/af;->a:Lcom/facebook/orca/stickers/StickerPack;

    iget-boolean v2, p0, Lcom/facebook/orca/stickers/af;->b:Z

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/stickers/StickerStoreFragment;->a(Lcom/facebook/orca/stickers/StickerStoreFragment;Lcom/facebook/orca/stickers/StickerPack;Z)V

    .line 440
    return-void
.end method
