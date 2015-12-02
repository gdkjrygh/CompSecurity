.class Lcom/facebook/orca/emoji/m;
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
    .line 438
    iput-object p1, p0, Lcom/facebook/orca/emoji/m;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 441
    iget-object v0, p0, Lcom/facebook/orca/emoji/m;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    const-string v1, "audio_recorder_button"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Ljava/lang/String;)V

    .line 442
    iget-object v0, p0, Lcom/facebook/orca/emoji/m;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-static {v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->c(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)Lcom/facebook/orca/emoji/o;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/emoji/o;->b()V

    .line 443
    return-void
.end method
