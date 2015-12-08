.class final Lcom/roidapp/cloudlib/flickr/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V
    .locals 0

    .prologue
    .line 184
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/e;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/e;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->finish()V

    .line 188
    return-void
.end method
