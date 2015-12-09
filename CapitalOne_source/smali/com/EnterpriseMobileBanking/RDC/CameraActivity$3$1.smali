.class Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3$1;
.super Ljava/lang/Object;
.source "CameraActivity.java"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3$1;->this$1:Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 4
    .param p1, "success"    # Z
    .param p2, "camera"    # Landroid/hardware/Camera;

    .prologue
    .line 220
    const-string v0, "CameraActivity"

    const-string v1, "Autofocusing image."

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3$1;->this$1:Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    # setter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->lastFocused:J
    invoke-static {v0, v2, v3}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$402(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;J)J

    .line 222
    return-void
.end method
