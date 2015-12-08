.class Lcom/QRBS/activity/MyEncodeActivity$1;
.super Ljava/lang/Object;
.source "MyEncodeActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/MyEncodeActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/MyEncodeActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyEncodeActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 64
    iget-object v3, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    invoke-virtual {v3}, Lcom/QRBS/activity/MyEncodeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    iget-object v4, v4, Lcom/QRBS/activity/MyEncodeActivity;->bmp:Landroid/graphics/Bitmap;

    invoke-static {v3, v4}, Lcom/scannerfire/utils/EncodeUtils;->getImageUri(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/net/Uri;

    move-result-object v2

    .line 65
    .local v2, "u":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 66
    .local v1, "shareIntent":Landroid/content/Intent;
    const-string v3, "android.intent.action.SEND"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    if-eqz v2, :cond_0

    .line 68
    const-string v3, "android.intent.extra.STREAM"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 69
    :cond_0
    const-string v3, "android.intent.extra.SUBJECT"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Powered by "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    const v6, 0x7f0800b1

    invoke-virtual {v5, v6}, Lcom/QRBS/activity/MyEncodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " - http://goo.gl/pTAlm4"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 71
    const-string v3, "android.intent.extra.EMAIL"

    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    iget-object v4, v4, Lcom/QRBS/activity/MyEncodeActivity;->text:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    const-string v3, "android.intent.extra.TEXT"

    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    iget-object v4, v4, Lcom/QRBS/activity/MyEncodeActivity;->text:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    const-string v3, "image/jpeg"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    :try_start_0
    iget-object v3, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    const v5, 0x7f080112

    invoke-virtual {v4, v5}, Lcom/QRBS/activity/MyEncodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/QRBS/activity/MyEncodeActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    :goto_0
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 78
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    iget-object v3, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity$1;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    const v5, 0x7f080157

    invoke-virtual {v4, v5}, Lcom/QRBS/activity/MyEncodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0
.end method
