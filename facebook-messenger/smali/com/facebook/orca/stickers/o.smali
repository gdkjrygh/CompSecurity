.class Lcom/facebook/orca/stickers/o;
.super Ljava/lang/Object;
.source "StickerPopup.java"

# interfaces
.implements Lcom/facebook/orca/emoji/aq;


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/StickerPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/stickers/StickerPopup;)V
    .locals 0

    .prologue
    .line 230
    iput-object p1, p0, Lcom/facebook/orca/stickers/o;->a:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;I)Landroid/view/View;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/orca/stickers/o;->a:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/StickerPopup;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
