.class Lcom/facebook/orca/emoji/n;
.super Ljava/lang/Object;
.source "EmojiAttachmentPopup.java"

# interfaces
.implements Lcom/facebook/orca/emoji/aq;


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V
    .locals 0

    .prologue
    .line 534
    iput-object p1, p0, Lcom/facebook/orca/emoji/n;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;I)Landroid/view/View;
    .locals 2

    .prologue
    .line 537
    iget-object v0, p0, Lcom/facebook/orca/emoji/n;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/content/Context;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
