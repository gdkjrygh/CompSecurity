.class Lcom/QRBS/activity/CreateEmail$1;
.super Ljava/lang/Object;
.source "CreateEmail.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateEmail;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateEmail;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateEmail;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateEmail$1;->this$0:Lcom/QRBS/activity/CreateEmail;

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 50
    iget-object v2, p0, Lcom/QRBS/activity/CreateEmail$1;->this$0:Lcom/QRBS/activity/CreateEmail;

    iget-object v2, v2, Lcom/QRBS/activity/CreateEmail;->text:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 51
    .local v1, "s":Ljava/lang/String;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    .line 52
    :cond_0
    iget-object v2, p0, Lcom/QRBS/activity/CreateEmail$1;->this$0:Lcom/QRBS/activity/CreateEmail;

    iget-object v3, p0, Lcom/QRBS/activity/CreateEmail$1;->this$0:Lcom/QRBS/activity/CreateEmail;

    const v4, 0x7f0800fd

    invoke-virtual {v3, v4}, Lcom/QRBS/activity/CreateEmail;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 59
    :goto_0
    return-void

    .line 56
    :cond_1
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v2, p0, Lcom/QRBS/activity/CreateEmail$1;->this$0:Lcom/QRBS/activity/CreateEmail;

    invoke-direct {v0, v2}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 57
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "mailto:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
