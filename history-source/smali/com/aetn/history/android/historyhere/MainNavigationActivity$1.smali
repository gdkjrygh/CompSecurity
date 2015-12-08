.class Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;
.super Ljava/lang/Object;
.source "MainNavigationActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/MainNavigationActivity;->handleDeeplink()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/MainNavigationActivity;Landroid/content/Intent;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .prologue
    .line 318
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 321
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->val$intent:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "handleDeeplink(): we have data from a standard deeplink: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->val$intent:Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->executeDeeplink(Ljava/lang/String;)V

    .line 332
    :goto_0
    return-void

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->val$intent:Landroid/content/Intent;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->val$intent:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->val$intent:Landroid/content/Intent;

    const-string v1, "DEEPLINK"

    .line 326
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 327
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "handleDeeplink():we have data from a notification deeplink: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->val$intent:Landroid/content/Intent;

    const-string v2, "DEEPLINK"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->executeDeeplink(Ljava/lang/String;)V

    goto :goto_0

    .line 330
    :cond_1
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "handleDeeplink(): nothing to handle"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
