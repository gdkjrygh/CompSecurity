.class final Lcom/roidapp/photogrid/video/ap;
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
    .line 278
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ap;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 282
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ap;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->setResult(ILandroid/content/Intent;)V

    .line 283
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ap;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->finish()V

    .line 284
    return-void
.end method
