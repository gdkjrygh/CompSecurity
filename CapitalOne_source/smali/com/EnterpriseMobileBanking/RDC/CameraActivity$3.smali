.class Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;
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
    .line 204
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 208
    const-string v1, "CameraActivity"

    const-string v2, "mAutoFocusImage.onClick()"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # invokes: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->sendTimerReset()V
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$000(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    .line 211
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 212
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->hasAutoFocus:Z
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$300(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 214
    :try_start_0
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 215
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;

    move-result-object v1

    new-instance v2, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3$1;

    invoke-direct {v2, p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3$1;-><init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;)V

    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    :cond_0
    :goto_0
    return-void

    .line 224
    :catch_0
    move-exception v0

    .line 225
    .local v0, "e":Ljava/lang/Exception;
    const-string v1, "CameraActivity"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Auto focus exception caught: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
