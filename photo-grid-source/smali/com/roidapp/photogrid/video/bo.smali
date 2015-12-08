.class final Lcom/roidapp/photogrid/video/bo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/VideoPictureEditActivity;Landroid/app/Dialog;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bo;->b:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/video/bo;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bo;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bo;->b:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->a(Lcom/roidapp/photogrid/video/VideoPictureEditActivity;)V

    .line 138
    return-void
.end method
