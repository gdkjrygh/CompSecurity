.class final Lcom/roidapp/photogrid/video/au;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 1155
    iput-object p1, p0, Lcom/roidapp/photogrid/video/au;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 1162
    iget-object v0, p0, Lcom/roidapp/photogrid/video/au;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 1163
    iget-object v0, p0, Lcom/roidapp/photogrid/video/au;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/q;->c()V

    .line 1164
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/au;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/au;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;I)V

    .line 1165
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1166
    return-void
.end method
