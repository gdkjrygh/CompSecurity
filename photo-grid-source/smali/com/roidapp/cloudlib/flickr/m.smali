.class final Lcom/roidapp/cloudlib/flickr/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/m;->a:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/m;->a:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)V

    .line 114
    return-void
.end method
