.class final Lcom/roidapp/cloudlib/flickr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/c;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 99
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 100
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/c;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->setResult(I)V

    .line 101
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/c;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->finish()V

    .line 103
    :cond_0
    return v2
.end method
