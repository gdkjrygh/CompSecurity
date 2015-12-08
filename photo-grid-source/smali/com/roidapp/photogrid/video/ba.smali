.class final Lcom/roidapp/photogrid/video/ba;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 306
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ba;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 314
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ba;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z

    .line 315
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ba;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 316
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ba;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->m(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ba;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const/16 v1, 0x5001

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;IZ)V

    .line 318
    return-void
.end method
