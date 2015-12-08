.class final Lcom/roidapp/cloudlib/dropbox/h;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/h;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispatchMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 158
    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/h;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Ljava/lang/String;)V

    .line 159
    return-void
.end method
