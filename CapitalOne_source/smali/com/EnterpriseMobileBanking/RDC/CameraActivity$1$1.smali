.class Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1$1;
.super Ljava/lang/Object;
.source "CameraActivity.java"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1$1;->this$1:Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 2
    .param p1, "success"    # Z
    .param p2, "camera"    # Landroid/hardware/Camera;

    .prologue
    const/4 v1, 0x0

    .line 170
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1$1;->this$1:Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->rawCallback:Landroid/hardware/Camera$PictureCallback;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$500(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera$PictureCallback;

    move-result-object v0

    invoke-virtual {p2, v1, v1, v0}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    .line 171
    return-void
.end method
