.class Lcom/QRBS/activity/MyEncodeActivity$2$1;
.super Ljava/lang/Object;
.source "MyEncodeActivity.java"

# interfaces
.implements Lyuku/ambilwarna/AmbilWarnaDialog$OnAmbilWarnaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/MyEncodeActivity$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/QRBS/activity/MyEncodeActivity$2;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyEncodeActivity$2;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyEncodeActivity$2$1;->this$1:Lcom/QRBS/activity/MyEncodeActivity$2;

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Lyuku/ambilwarna/AmbilWarnaDialog;)V
    .locals 0
    .param p1, "dialog"    # Lyuku/ambilwarna/AmbilWarnaDialog;

    .prologue
    .line 101
    return-void
.end method

.method public onOk(Lyuku/ambilwarna/AmbilWarnaDialog;I)V
    .locals 6
    .param p1, "dialog"    # Lyuku/ambilwarna/AmbilWarnaDialog;
    .param p2, "color"    # I

    .prologue
    .line 92
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v2, p0, Lcom/QRBS/activity/MyEncodeActivity$2$1;->this$1:Lcom/QRBS/activity/MyEncodeActivity$2;

    # getter for: Lcom/QRBS/activity/MyEncodeActivity$2;->this$0:Lcom/QRBS/activity/MyEncodeActivity;
    invoke-static {v2}, Lcom/QRBS/activity/MyEncodeActivity$2;->access$0(Lcom/QRBS/activity/MyEncodeActivity$2;)Lcom/QRBS/activity/MyEncodeActivity;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 93
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v2, p0, Lcom/QRBS/activity/MyEncodeActivity$2$1;->this$1:Lcom/QRBS/activity/MyEncodeActivity$2;

    # getter for: Lcom/QRBS/activity/MyEncodeActivity$2;->this$0:Lcom/QRBS/activity/MyEncodeActivity;
    invoke-static {v2}, Lcom/QRBS/activity/MyEncodeActivity$2;->access$0(Lcom/QRBS/activity/MyEncodeActivity$2;)Lcom/QRBS/activity/MyEncodeActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/QRBS/activity/MyEncodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "parametro"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 94
    .local v1, "s":Ljava/lang/String;
    iget-object v2, p0, Lcom/QRBS/activity/MyEncodeActivity$2$1;->this$1:Lcom/QRBS/activity/MyEncodeActivity$2;

    # getter for: Lcom/QRBS/activity/MyEncodeActivity$2;->this$0:Lcom/QRBS/activity/MyEncodeActivity;
    invoke-static {v2}, Lcom/QRBS/activity/MyEncodeActivity$2;->access$0(Lcom/QRBS/activity/MyEncodeActivity$2;)Lcom/QRBS/activity/MyEncodeActivity;

    move-result-object v2

    iget-object v3, v2, Lcom/QRBS/activity/MyEncodeActivity;->image:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/QRBS/activity/MyEncodeActivity$2$1;->this$1:Lcom/QRBS/activity/MyEncodeActivity$2;

    # getter for: Lcom/QRBS/activity/MyEncodeActivity$2;->this$0:Lcom/QRBS/activity/MyEncodeActivity;
    invoke-static {v2}, Lcom/QRBS/activity/MyEncodeActivity$2;->access$0(Lcom/QRBS/activity/MyEncodeActivity$2;)Lcom/QRBS/activity/MyEncodeActivity;

    move-result-object v2

    iget-object v4, v2, Lcom/QRBS/activity/MyEncodeActivity;->bmp:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/QRBS/activity/MyEncodeActivity$2$1;->this$1:Lcom/QRBS/activity/MyEncodeActivity$2;

    # getter for: Lcom/QRBS/activity/MyEncodeActivity$2;->this$0:Lcom/QRBS/activity/MyEncodeActivity;
    invoke-static {v2}, Lcom/QRBS/activity/MyEncodeActivity$2;->access$0(Lcom/QRBS/activity/MyEncodeActivity$2;)Lcom/QRBS/activity/MyEncodeActivity;

    move-result-object v5

    move v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/scannerfire/utils/EncodeUtils;->changeColor(Ljava/lang/String;ILandroid/widget/ImageView;Landroid/graphics/Bitmap;Lcom/QRBS/activity/MyEncodeActivity;)V

    .line 96
    return-void
.end method
