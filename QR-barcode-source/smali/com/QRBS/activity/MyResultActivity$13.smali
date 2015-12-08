.class Lcom/QRBS/activity/MyResultActivity$13;
.super Ljava/lang/Object;
.source "MyResultActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/MyResultActivity;->buildButton(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/MyResultActivity;

.field private final synthetic val$text:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyResultActivity$13;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iput-object p2, p0, Lcom/QRBS/activity/MyResultActivity$13;->val$text:Ljava/lang/String;

    .line 396
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 398
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "http://www.google.com/m/products?q="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/QRBS/activity/MyResultActivity$13;->val$text:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 400
    .local v1, "s":Ljava/lang/String;
    :try_start_0
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity$13;->this$0:Lcom/QRBS/activity/MyResultActivity;

    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v2, v3}, Lcom/QRBS/activity/MyResultActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 405
    :goto_0
    return-void

    .line 402
    :catch_0
    move-exception v0

    .line 403
    .local v0, "ex":Landroid/content/ActivityNotFoundException;
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity$13;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iget-object v3, p0, Lcom/QRBS/activity/MyResultActivity$13;->this$0:Lcom/QRBS/activity/MyResultActivity;

    const v4, 0x7f080157

    invoke-virtual {v3, v4}, Lcom/QRBS/activity/MyResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0
.end method
