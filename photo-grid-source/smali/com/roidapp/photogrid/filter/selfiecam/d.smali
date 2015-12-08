.class final Lcom/roidapp/photogrid/filter/selfiecam/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/d;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 293
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/d;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->c(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;)V

    .line 294
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/d;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    const-class v2, Lcom/roidapp/photogrid/filter/selfiecam/SystemCameraActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 295
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/d;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->startActivity(Landroid/content/Intent;)V

    .line 296
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/d;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;->finish()V

    .line 297
    return-void
.end method
