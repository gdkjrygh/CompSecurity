.class Lcom/hmobile/biblekjv/BaseActivity$5;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Lcom/facebook/widget/WebDialog$OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->publishFeedDialog(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 406
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V
    .locals 6
    .param p1, "values"    # Landroid/os/Bundle;
    .param p2, "error"    # Lcom/facebook/FacebookException;

    .prologue
    const/4 v5, 0x0

    .line 411
    if-nez p2, :cond_2

    .line 415
    const-string v2, "post_id"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 416
    .local v1, "postId":Ljava/lang/String;
    if-eqz v1, :cond_1

    .line 417
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 418
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 419
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Posted story, id: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 418
    invoke-static {v2, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 420
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 427
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget-boolean v2, v2, Lcom/hmobile/biblekjv/BaseActivity;->is_finished:Z

    if-eqz v2, :cond_0

    .line 428
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    .line 429
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 431
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v3}, Lcom/hmobile/biblekjv/BaseActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    .line 432
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 430
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 433
    .local v0, "i":Landroid/content/Intent;
    const/high16 v2, 0x4000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 434
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2, v0}, Lcom/hmobile/biblekjv/BaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 435
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->finish()V

    .line 473
    .end local v0    # "i":Landroid/content/Intent;
    .end local v1    # "postId":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 448
    .restart local v1    # "postId":Ljava/lang/String;
    :cond_1
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 451
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 452
    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 453
    const-string v3, "Publish cancelled"

    .line 450
    invoke-static {v2, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 454
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 455
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->finish()V

    goto :goto_0

    .line 457
    .end local v1    # "postId":Ljava/lang/String;
    :cond_2
    instance-of v2, p2, Lcom/facebook/FacebookOperationCanceledException;

    if-eqz v2, :cond_3

    .line 459
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 461
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 462
    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 463
    const-string v3, "Publish cancelled"

    .line 460
    invoke-static {v2, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 464
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 466
    :cond_3
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 468
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$5;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 469
    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 470
    const-string v3, "Error posting story"

    .line 467
    invoke-static {v2, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 471
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
