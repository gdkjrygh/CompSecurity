.class Lcom/facebook/orca/emoji/f;
.super Ljava/lang/Object;
.source "EmojiAttachmentPopup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/c;

.field final synthetic b:Z

.field final synthetic c:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Lcom/facebook/orca/emoji/c;Z)V
    .locals 0

    .prologue
    .line 603
    iput-object p1, p0, Lcom/facebook/orca/emoji/f;->c:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    iput-object p2, p0, Lcom/facebook/orca/emoji/f;->a:Lcom/facebook/orca/emoji/c;

    iput-boolean p3, p0, Lcom/facebook/orca/emoji/f;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 606
    iget-object v0, p0, Lcom/facebook/orca/emoji/f;->c:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    iget-object v1, p0, Lcom/facebook/orca/emoji/f;->a:Lcom/facebook/orca/emoji/c;

    iget-boolean v2, p0, Lcom/facebook/orca/emoji/f;->b:Z

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Lcom/facebook/orca/emoji/c;Z)V

    .line 607
    return-void
.end method
