.class Lcom/facebook/orca/emoji/d;
.super Landroid/os/Handler;
.source "EmojiAttachmentPopup.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/facebook/orca/emoji/d;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 173
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v2, :cond_0

    .line 174
    iget-object v0, p0, Lcom/facebook/orca/emoji/d;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    invoke-static {p0, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 176
    const-wide/16 v1, 0x64

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/orca/emoji/d;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 179
    :cond_0
    return-void
.end method
