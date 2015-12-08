.class final Lcom/roidapp/cloudlib/dropbox/f;
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
    .line 130
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/f;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 133
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/f;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->g(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/ad;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/f;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->f(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ad;->b(I)Ljava/lang/String;

    move-result-object v0

    .line 134
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 135
    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/f;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->h(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 136
    const/4 v2, 0x0

    iput v2, v1, Landroid/os/Message;->what:I

    .line 137
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 138
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/f;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->h(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 140
    :cond_0
    return-void
.end method
