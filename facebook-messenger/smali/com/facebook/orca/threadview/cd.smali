.class Lcom/facebook/orca/threadview/cd;
.super Ljava/lang/Object;
.source "ThreadViewImageAttachmentView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/attachments/ImageAttachmentData;

.field final synthetic b:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/attachments/ImageAttachmentData;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lcom/facebook/orca/threadview/cd;->b:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    iput-object p2, p0, Lcom/facebook/orca/threadview/cd;->a:Lcom/facebook/orca/attachments/ImageAttachmentData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 242
    iget-object v0, p0, Lcom/facebook/orca/threadview/cd;->b:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/cd;->a:Lcom/facebook/orca/attachments/ImageAttachmentData;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/attachments/ImageAttachmentData;)V

    .line 243
    return-void
.end method
