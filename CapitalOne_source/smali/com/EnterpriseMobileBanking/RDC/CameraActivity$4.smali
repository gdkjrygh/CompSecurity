.class Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;
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
    .line 244
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 247
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 248
    .local v0, "imageIntent":Landroid/content/Intent;
    const-string v1, "RDCImage"

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressedImage:[B
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$800(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 249
    const-string v1, "callbackId"

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->callBackId:Ljava/lang/String;
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1500(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 250
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->setResult(ILandroid/content/Intent;)V

    .line 252
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    const/4 v2, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressedImage:[B
    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$802(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;[B)[B

    .line 253
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    const/4 v2, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z
    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1402(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;Z)Z

    .line 254
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->finish()V

    .line 255
    return-void
.end method
