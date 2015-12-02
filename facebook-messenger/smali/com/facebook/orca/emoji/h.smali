.class Lcom/facebook/orca/emoji/h;
.super Ljava/lang/Object;
.source "EmojiAttachmentPopup.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lcom/facebook/orca/emoji/h;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/facebook/orca/emoji/h;->a:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-static {v0, p2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/view/MotionEvent;)V

    .line 230
    const/4 v0, 0x0

    return v0
.end method
