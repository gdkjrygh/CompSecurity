.class Lcom/facebook/orca/stickers/l;
.super Ljava/lang/Object;
.source "StickerPopup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/StickerPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerPopup;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lcom/facebook/orca/stickers/l;->a:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/orca/stickers/l;->a:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPopup;->a()V

    .line 141
    return-void
.end method
