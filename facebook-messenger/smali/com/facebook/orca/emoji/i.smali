.class Lcom/facebook/orca/emoji/i;
.super Ljava/lang/Object;
.source "EmojiAttachmentPopup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V
    .locals 0

    .prologue
    .line 273
    iput-object p1, p0, Lcom/facebook/orca/emoji/i;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 276
    iget-object v0, p0, Lcom/facebook/orca/emoji/i;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    iget-object v1, p0, Lcom/facebook/orca/emoji/i;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    iget-object v1, v1, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->emoji_back_container:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 277
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lcom/facebook/orca/emoji/i;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    iget-object v1, p0, Lcom/facebook/orca/emoji/i;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    iget-object v1, v1, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->ag:Landroid/view/View;

    sget v2, Lcom/facebook/i;->emoji_front_container:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 280
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 281
    return-void
.end method
