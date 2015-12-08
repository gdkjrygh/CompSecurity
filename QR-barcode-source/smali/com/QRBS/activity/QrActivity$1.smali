.class Lcom/QRBS/activity/QrActivity$1;
.super Ljava/lang/Object;
.source "QrActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/QrActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/QrActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/QrActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/QrActivity$1;->this$0:Lcom/QRBS/activity/QrActivity;

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 48
    iget-object v0, p0, Lcom/QRBS/activity/QrActivity$1;->this$0:Lcom/QRBS/activity/QrActivity;

    iget-boolean v0, v0, Lcom/QRBS/activity/QrActivity;->flashOn:Z

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/QRBS/activity/QrActivity$1;->this$0:Lcom/QRBS/activity/QrActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/QRBS/activity/QrActivity;->flashOn:Z

    .line 50
    iget-object v0, p0, Lcom/QRBS/activity/QrActivity$1;->this$0:Lcom/QRBS/activity/QrActivity;

    iget-object v0, v0, Lcom/QRBS/activity/QrActivity;->flash:Landroid/widget/ImageView;

    const v1, 0x7f0200cb

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 51
    iget-object v0, p0, Lcom/QRBS/activity/QrActivity$1;->this$0:Lcom/QRBS/activity/QrActivity;

    invoke-virtual {v0}, Lcom/QRBS/activity/QrActivity;->turnOn()V

    .line 64
    :goto_0
    return-void

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/QRBS/activity/QrActivity$1;->this$0:Lcom/QRBS/activity/QrActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/QRBS/activity/QrActivity;->flashOn:Z

    .line 56
    iget-object v0, p0, Lcom/QRBS/activity/QrActivity$1;->this$0:Lcom/QRBS/activity/QrActivity;

    iget-object v0, v0, Lcom/QRBS/activity/QrActivity;->flash:Landroid/widget/ImageView;

    const v1, 0x7f0200cc

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 57
    iget-object v0, p0, Lcom/QRBS/activity/QrActivity$1;->this$0:Lcom/QRBS/activity/QrActivity;

    invoke-virtual {v0}, Lcom/QRBS/activity/QrActivity;->turnOff()V

    goto :goto_0
.end method
