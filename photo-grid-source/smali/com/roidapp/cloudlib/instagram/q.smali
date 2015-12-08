.class final Lcom/roidapp/cloudlib/instagram/q;
.super Lcom/roidapp/cloudlib/ah;
.source "SourceFile"


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/ah;-><init>(Landroid/content/Context;)V

    .line 42
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/q;->c:Ljava/lang/ref/WeakReference;

    .line 43
    return-void
.end method


# virtual methods
.method protected final a(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/q;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;

    .line 48
    if-nez v0, :cond_1

    .line 64
    :cond_0
    :goto_0
    return-void

    .line 50
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 52
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 63
    :goto_1
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/ah;->a(Landroid/os/Message;)V

    goto :goto_0

    .line 54
    :pswitch_0
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 57
    check-cast v1, Lcom/roidapp/cloudlib/instagram/r;

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->a(Lcom/roidapp/cloudlib/instagram/r;I)V

    goto :goto_1

    .line 52
    :pswitch_data_0
    .packed-switch 0x200
        :pswitch_0
    .end packed-switch
.end method
