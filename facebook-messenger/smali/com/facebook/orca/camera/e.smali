.class Lcom/facebook/orca/camera/e;
.super Ljava/lang/Object;
.source "CropImage.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/camera/CropImage;


# direct methods
.method constructor <init>(Lcom/facebook/orca/camera/CropImage;)V
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lcom/facebook/orca/camera/e;->a:Lcom/facebook/orca/camera/CropImage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/orca/camera/e;->a:Lcom/facebook/orca/camera/CropImage;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/camera/CropImage;->setResult(I)V

    .line 159
    iget-object v0, p0, Lcom/facebook/orca/camera/e;->a:Lcom/facebook/orca/camera/CropImage;

    invoke-virtual {v0}, Lcom/facebook/orca/camera/CropImage;->finish()V

    .line 160
    return-void
.end method
