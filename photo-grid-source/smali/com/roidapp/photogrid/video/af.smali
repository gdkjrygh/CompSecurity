.class final Lcom/roidapp/photogrid/video/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 635
    iput-object p1, p0, Lcom/roidapp/photogrid/video/af;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 639
    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 640
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 642
    iget-object v0, p0, Lcom/roidapp/photogrid/video/af;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/af;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ad;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 644
    iget-object v0, p0, Lcom/roidapp/photogrid/video/af;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    .line 646
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/af;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->k(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 647
    iget-object v0, p0, Lcom/roidapp/photogrid/video/af;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->r(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 648
    iget-object v0, p0, Lcom/roidapp/photogrid/video/af;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->q(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 650
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/af;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->v(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 653
    :cond_2
    return v2
.end method
