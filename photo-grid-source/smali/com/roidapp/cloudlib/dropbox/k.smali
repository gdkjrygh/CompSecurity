.class final Lcom/roidapp/cloudlib/dropbox/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V
    .locals 0

    .prologue
    .line 244
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/k;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 248
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/k;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->i(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/dropbox/client2/DropboxAPI;

    move-result-object v0

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->accountInfo()Lcom/dropbox/client2/DropboxAPI$Account;

    move-result-object v0

    iget-object v0, v0, Lcom/dropbox/client2/DropboxAPI$Account;->displayName:Ljava/lang/String;

    .line 249
    if-eqz v0, :cond_0

    .line 250
    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/k;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/dropbox/client2/exception/DropboxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    :cond_0
    :goto_0
    return-void

    .line 253
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/dropbox/client2/exception/DropboxException;->printStackTrace()V

    goto :goto_0
.end method
