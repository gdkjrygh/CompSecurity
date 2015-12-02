.class Lcom/facebook/orca/threadview/ce;
.super Lcom/facebook/ui/images/base/b;
.source "ThreadViewImageAttachmentView.java"


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/base/b;

.field final synthetic b:I

.field final synthetic c:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/ui/images/base/b;I)V
    .locals 0

    .prologue
    .line 638
    iput-object p1, p0, Lcom/facebook/orca/threadview/ce;->c:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    iput-object p2, p0, Lcom/facebook/orca/threadview/ce;->a:Lcom/facebook/ui/images/base/b;

    iput p3, p0, Lcom/facebook/orca/threadview/ce;->b:I

    invoke-direct {p0}, Lcom/facebook/ui/images/base/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 641
    iget-object v0, p0, Lcom/facebook/orca/threadview/ce;->a:Lcom/facebook/ui/images/base/b;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/images/base/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 642
    iget-object v1, p0, Lcom/facebook/orca/threadview/ce;->c:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lcom/facebook/orca/threadview/ce;->b:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 643
    iget-object v2, p0, Lcom/facebook/orca/threadview/ce;->c:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v2, v0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Landroid/graphics/Bitmap;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 644
    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 649
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tviatv_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ce;->a:Lcom/facebook/ui/images/base/b;

    invoke-virtual {v1}, Lcom/facebook/ui/images/base/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/orca/threadview/ce;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
