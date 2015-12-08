.class Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;
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
    .line 180
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x8

    const/4 v4, 0x0

    .line 185
    const-string v0, "CameraActivity"

    const-string v1, "mRetakePictureAction.onClick()"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # invokes: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->sendTimerReset()V
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$000(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    .line 187
    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOuterRL:Landroid/widget/RelativeLayout;
    invoke-static {}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$600()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 188
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->surfaceView:Landroid/view/SurfaceView;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$700(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/view/SurfaceView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    .line 190
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # setter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressedImage:[B
    invoke-static {v0, v3}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$802(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;[B)[B

    .line 191
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mUseRetakeLayout:Landroid/widget/LinearLayout;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$900(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 192
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOverlayUseRetake:Landroid/view/View;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1000(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 193
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOverlayTake:Landroid/view/View;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1100(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$100(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mLabel:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1300(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->label:Ljava/lang/String;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    const-wide/16 v2, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->lastFocused:J
    invoke-static {v0, v2, v3}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$402(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;J)J

    .line 197
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$100(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 198
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 199
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # setter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z
    invoke-static {v0, v4}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1402(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;Z)Z

    .line 200
    return-void
.end method
