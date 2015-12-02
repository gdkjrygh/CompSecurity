.class Lcom/facebook/orca/threadview/cc;
.super Ljava/lang/Object;
.source "ThreadViewImageAttachmentView.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/l;

.field final synthetic b:Lcom/facebook/orca/attachments/ImageAttachmentData;

.field final synthetic c:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/threadview/l;Lcom/facebook/orca/attachments/ImageAttachmentData;)V
    .locals 0

    .prologue
    .line 184
    iput-object p1, p0, Lcom/facebook/orca/threadview/cc;->c:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    iput-object p2, p0, Lcom/facebook/orca/threadview/cc;->a:Lcom/facebook/orca/threadview/l;

    iput-object p3, p0, Lcom/facebook/orca/threadview/cc;->b:Lcom/facebook/orca/attachments/ImageAttachmentData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lcom/facebook/orca/threadview/cc;->a:Lcom/facebook/orca/threadview/l;

    iget-object v1, p0, Lcom/facebook/orca/threadview/cc;->b:Lcom/facebook/orca/attachments/ImageAttachmentData;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/l;->a(Landroid/os/Parcelable;)V

    .line 188
    const/4 v0, 0x1

    return v0
.end method
