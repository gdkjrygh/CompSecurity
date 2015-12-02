.class Lcom/facebook/orca/stickers/ai;
.super Ljava/lang/Object;
.source "StickerStorePackFragment.java"

# interfaces
.implements Lcom/facebook/widget/images/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/StickerStorePackFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerStorePackFragment;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/orca/stickers/ai;->a:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/orca/stickers/ai;->a:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-static {v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->b(Lcom/facebook/orca/stickers/StickerStorePackFragment;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 133
    return-void
.end method
