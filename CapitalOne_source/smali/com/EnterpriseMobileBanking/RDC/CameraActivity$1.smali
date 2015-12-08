.class Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;
.super Ljava/lang/Object;
.source "CameraActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/RDC/CameraActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v4, 0x0

    .line 161
    const-string v0, "CameraActivity"

    const-string v1, "mTakePictureAction.onClick():"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # invokes: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->sendTimerReset()V
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$000(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    .line 164
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$100(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 165
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->hasAutoFocus:Z
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$300(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->lastFocused:J
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$400(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 167
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;

    move-result-object v0

    new-instance v1, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1$1;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1$1;-><init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 175
    :cond_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;

    move-result-object v0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->rawCallback:Landroid/hardware/Camera$PictureCallback;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$500(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera$PictureCallback;

    move-result-object v1

    invoke-virtual {v0, v4, v4, v1}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    goto :goto_0
.end method
