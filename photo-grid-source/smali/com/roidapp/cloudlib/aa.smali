.class final Lcom/roidapp/cloudlib/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 407
    iput-object p1, p0, Lcom/roidapp/cloudlib/aa;->b:Lcom/roidapp/cloudlib/t;

    iput-object p2, p0, Lcom/roidapp/cloudlib/aa;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 411
    const-string v0, "BaseFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cancel download "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/aa;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 412
    iget-object v0, p0, Lcom/roidapp/cloudlib/aa;->b:Lcom/roidapp/cloudlib/t;

    invoke-static {v0}, Lcom/roidapp/cloudlib/t;->a(Lcom/roidapp/cloudlib/t;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/b/k;->a(Landroid/widget/ImageView;)V

    .line 413
    iget-object v0, p0, Lcom/roidapp/cloudlib/aa;->b:Lcom/roidapp/cloudlib/t;

    invoke-static {v0}, Lcom/roidapp/cloudlib/t;->a(Lcom/roidapp/cloudlib/t;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 414
    iget-object v0, p0, Lcom/roidapp/cloudlib/aa;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 415
    return-void
.end method
