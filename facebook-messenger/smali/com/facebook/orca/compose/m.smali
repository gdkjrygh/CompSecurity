.class Lcom/facebook/orca/compose/m;
.super Ljava/lang/Object;
.source "ComposeAttachmentContainer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/w;

.field final synthetic b:Lcom/facebook/orca/compose/l;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/l;Lcom/facebook/orca/photos/b/w;)V
    .locals 0

    .prologue
    .line 389
    iput-object p1, p0, Lcom/facebook/orca/compose/m;->b:Lcom/facebook/orca/compose/l;

    iput-object p2, p0, Lcom/facebook/orca/compose/m;->a:Lcom/facebook/orca/photos/b/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 392
    iget-object v0, p0, Lcom/facebook/orca/compose/m;->b:Lcom/facebook/orca/compose/l;

    iget-object v0, v0, Lcom/facebook/orca/compose/l;->a:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/a;

    .line 393
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/compose/m;->a:Lcom/facebook/orca/photos/b/w;

    iget-object v3, v3, Lcom/facebook/orca/photos/b/w;->a:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v3}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 397
    iget-object v2, p0, Lcom/facebook/orca/compose/m;->b:Lcom/facebook/orca/compose/l;

    iget-object v2, v2, Lcom/facebook/orca/compose/l;->a:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-static {v2}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v2, Lcom/facebook/i;->composer_attachment_item_image:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 399
    iget-object v2, p0, Lcom/facebook/orca/compose/m;->b:Lcom/facebook/orca/compose/l;

    iget-object v2, v2, Lcom/facebook/orca/compose/l;->a:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-static {v2}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->b(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)Lcom/facebook/orca/photos/b/ab;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/compose/m;->a:Lcom/facebook/orca/photos/b/w;

    invoke-virtual {v0}, Lcom/facebook/widget/images/UrlImage;->getUploadProgressBar()Landroid/widget/ProgressBar;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/widget/images/UrlImage;->getUploadProgressCoverView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v2, v3, v4, v0}, Lcom/facebook/orca/photos/b/ab;->a(Lcom/facebook/orca/photos/b/w;Landroid/widget/ProgressBar;Landroid/view/View;)V

    goto :goto_0

    .line 404
    :cond_1
    return-void
.end method
