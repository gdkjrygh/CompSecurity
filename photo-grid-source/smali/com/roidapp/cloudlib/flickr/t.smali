.class final Lcom/roidapp/cloudlib/flickr/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/t;->a:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/t;->a:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->b(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    .line 98
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
