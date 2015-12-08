.class Lcom/EnterpriseMobileBanking/RDC/CameraActivity$6;
.super Ljava/lang/Object;
.source "CameraActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->decodeByteArrayMemCheck([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
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
    .line 331
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$6;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 335
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$6;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->finish()V

    .line 336
    return-void
.end method
