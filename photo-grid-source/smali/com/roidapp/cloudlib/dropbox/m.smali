.class final Lcom/roidapp/cloudlib/dropbox/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/dropbox/l;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/dropbox/l;)V
    .locals 0

    .prologue
    .line 434
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/m;->a:Lcom/roidapp/cloudlib/dropbox/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 438
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/m;->a:Lcom/roidapp/cloudlib/dropbox/l;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/m;->a:Lcom/roidapp/cloudlib/dropbox/l;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 439
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/m;->a:Lcom/roidapp/cloudlib/dropbox/l;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/m;->a:Lcom/roidapp/cloudlib/dropbox/l;

    iget-object v1, v1, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    sget v2, Lcom/roidapp/cloudlib/at;->T:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 441
    :cond_0
    return-void
.end method
