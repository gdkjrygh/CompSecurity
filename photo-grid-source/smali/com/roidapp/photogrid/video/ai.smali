.class final Lcom/roidapp/photogrid/video/ai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;I)V
    .locals 0

    .prologue
    .line 672
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ai;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iput p2, p0, Lcom/roidapp/photogrid/video/ai;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 679
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ai;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->k(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 680
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ai;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ai;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ad;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 682
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ai;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    .line 684
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.WIFI_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 686
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ai;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget v2, p0, Lcom/roidapp/photogrid/video/ai;->a:I

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->startActivityForResult(Landroid/content/Intent;I)V

    .line 687
    return-void
.end method
