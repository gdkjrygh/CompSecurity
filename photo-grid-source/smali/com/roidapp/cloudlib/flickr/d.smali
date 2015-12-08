.class final Lcom/roidapp/cloudlib/flickr/d;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/d;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .prologue
    .line 168
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/d;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/d;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 172
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 173
    return-void
.end method
