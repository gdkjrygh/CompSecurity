.class final Lcom/roidapp/cloudlib/flickr/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/a;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/a;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.settings.WIFI_SETTINGS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 87
    return-void
.end method
