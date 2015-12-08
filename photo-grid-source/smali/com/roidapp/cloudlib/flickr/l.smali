.class final Lcom/roidapp/cloudlib/flickr/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/l;->a:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 80
    packed-switch p3, :pswitch_data_0

    .line 88
    :goto_0
    return-void

    .line 82
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/l;->a:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;Z)V

    goto :goto_0

    .line 85
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/l;->a:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;Z)V

    goto :goto_0

    .line 80
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
