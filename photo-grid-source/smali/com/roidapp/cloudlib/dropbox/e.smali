.class final Lcom/roidapp/cloudlib/dropbox/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 109
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    invoke-static {}, Lcom/roidapp/cloudlib/common/c;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 112
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    sget v2, Lcom/roidapp/cloudlib/at;->ag:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0, p3}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;I)I

    .line 116
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->b(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/ad;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/dropbox/l;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/l;->a(Lcom/roidapp/cloudlib/dropbox/l;)Lcom/roidapp/cloudlib/dropbox/c;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/DropboxAPI$Entry;

    .line 117
    iget-boolean v1, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-eqz v1, :cond_2

    .line 118
    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    iget-object v0, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 120
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->c(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/af;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/af;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/af;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0, p3}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->b(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;I)I

    .line 122
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/e;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->e(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method
