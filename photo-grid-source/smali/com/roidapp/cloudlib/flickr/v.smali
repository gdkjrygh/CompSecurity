.class public final Lcom/roidapp/cloudlib/flickr/v;
.super Lcom/roidapp/cloudlib/ah;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/v;->c:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 53
    invoke-direct {p0, p2}, Lcom/roidapp/cloudlib/ah;-><init>(Landroid/content/Context;)V

    .line 54
    return-void
.end method


# virtual methods
.method protected final a(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 58
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2200

    if-ne v0, v1, :cond_1

    .line 59
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/v;->c:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/k;->a(Landroid/content/Context;)V

    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/v;->c:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    .line 67
    :cond_0
    :goto_0
    return-void

    .line 61
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2201

    if-ne v0, v1, :cond_0

    .line 62
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/v;->c:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/v;->c:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/v;->c:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
