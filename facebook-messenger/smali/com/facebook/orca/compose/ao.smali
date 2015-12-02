.class public Lcom/facebook/orca/compose/ao;
.super Ljava/lang/Object;
.source "ComposeFragmentAttachmentForOrca.java"

# interfaces
.implements Lcom/facebook/orca/compose/aq;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/facebook/c/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/c/s;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/orca/compose/ao;->a:Landroid/content/Context;

    .line 27
    iput-object p2, p0, Lcom/facebook/orca/compose/ao;->b:Lcom/facebook/c/s;

    .line 28
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/view/LayoutInflater;)V
    .locals 0

    .prologue
    .line 41
    invoke-virtual {p1, p2}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/LayoutInflater;)V

    .line 42
    return-void
.end method

.method public a(Lcom/facebook/orca/photos/picking/PickMediaOperation;Lcom/facebook/orca/photos/picking/PickMediaParams;)V
    .locals 3

    .prologue
    .line 33
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 34
    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    iget-object v1, p0, Lcom/facebook/orca/compose/ao;->b:Lcom/facebook/c/s;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, p1}, Lcom/facebook/c/s;->a(Landroid/content/Intent;ILandroid/support/v4/app/Fragment;)V

    .line 37
    return-void
.end method

.method public a(Lcom/facebook/orca/photos/picking/PickMediaOperation;Ljava/util/List;Lcom/facebook/ui/media/attachments/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/photos/picking/PickMediaOperation;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;",
            "Lcom/facebook/ui/media/attachments/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 55
    return-void
.end method

.method public b(Lcom/facebook/orca/emoji/EmojiAttachmentPopup;Landroid/view/LayoutInflater;)V
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lcom/facebook/orca/photos/picking/b;->GALLERY:Lcom/facebook/orca/photos/picking/b;

    invoke-virtual {p1, p2, v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Landroid/view/LayoutInflater;Lcom/facebook/orca/photos/picking/b;)V

    .line 47
    return-void
.end method
