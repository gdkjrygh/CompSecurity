.class Lcom/facebook/orca/threadview/ch;
.super Ljava/lang/Object;
.source "ThreadViewImageAttachmentView.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/w;

.field final synthetic b:Lcom/facebook/orca/threadview/cg;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/cg;Lcom/facebook/orca/photos/b/w;)V
    .locals 0

    .prologue
    .line 736
    iput-object p1, p0, Lcom/facebook/orca/threadview/ch;->b:Lcom/facebook/orca/threadview/cg;

    iput-object p2, p0, Lcom/facebook/orca/threadview/ch;->a:Lcom/facebook/orca/photos/b/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 739
    const/4 v0, 0x0

    .line 740
    iget-object v1, p0, Lcom/facebook/orca/threadview/ch;->b:Lcom/facebook/orca/threadview/cg;

    iget-object v1, v1, Lcom/facebook/orca/threadview/cg;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->c(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)Lcom/google/common/a/es;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ch;->b:Lcom/facebook/orca/threadview/cg;

    iget-object v1, v1, Lcom/facebook/orca/threadview/cg;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->c(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 761
    :cond_0
    return-void

    .line 744
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/ch;->b:Lcom/facebook/orca/threadview/cg;

    iget-object v1, v1, Lcom/facebook/orca/threadview/cg;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->c(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 745
    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->b()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    const-string v4, "file"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 746
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 747
    goto :goto_0

    .line 749
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->b()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 750
    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 751
    iget-object v0, p0, Lcom/facebook/orca/threadview/ch;->b:Lcom/facebook/orca/threadview/cg;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cg;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 752
    add-int/lit8 v1, v1, 0x1

    .line 753
    iget-object v4, p0, Lcom/facebook/orca/threadview/ch;->a:Lcom/facebook/orca/photos/b/w;

    iget-object v4, v4, Lcom/facebook/orca/photos/b/w;->a:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v4}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 756
    iget-object v3, p0, Lcom/facebook/orca/threadview/ch;->b:Lcom/facebook/orca/threadview/cg;

    iget-object v3, v3, Lcom/facebook/orca/threadview/cg;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->d(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)Lcom/facebook/orca/photos/b/ab;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/orca/threadview/ch;->a:Lcom/facebook/orca/photos/b/w;

    invoke-virtual {v0}, Lcom/facebook/widget/images/UrlImage;->getUploadProgressBar()Landroid/widget/ProgressBar;

    move-result-object v5

    invoke-virtual {v0}, Lcom/facebook/widget/images/UrlImage;->getUploadProgressCoverView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v4, v5, v0}, Lcom/facebook/orca/photos/b/ab;->a(Lcom/facebook/orca/photos/b/w;Landroid/widget/ProgressBar;Landroid/view/View;)V

    goto :goto_0
.end method
