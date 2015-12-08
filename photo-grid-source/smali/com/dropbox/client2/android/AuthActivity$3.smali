.class Lcom/dropbox/client2/android/AuthActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/dropbox/client2/android/AuthActivity;

.field final synthetic val$officialAuthIntent:Landroid/content/Intent;

.field final synthetic val$state:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/dropbox/client2/android/AuthActivity;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 429
    iput-object p1, p0, Lcom/dropbox/client2/android/AuthActivity$3;->this$0:Lcom/dropbox/client2/android/AuthActivity;

    iput-object p2, p0, Lcom/dropbox/client2/android/AuthActivity$3;->val$officialAuthIntent:Landroid/content/Intent;

    iput-object p3, p0, Lcom/dropbox/client2/android/AuthActivity$3;->val$state:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 432
    # getter for: Lcom/dropbox/client2/android/AuthActivity;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/dropbox/client2/android/AuthActivity;->access$000()Ljava/lang/String;

    .line 435
    :try_start_0
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity$3;->this$0:Lcom/dropbox/client2/android/AuthActivity;

    iget-object v1, p0, Lcom/dropbox/client2/android/AuthActivity$3;->val$officialAuthIntent:Landroid/content/Intent;

    # invokes: Lcom/dropbox/client2/android/AuthActivity;->hasDropboxApp(Landroid/content/Intent;)Z
    invoke-static {v0, v1}, Lcom/dropbox/client2/android/AuthActivity;->access$100(Lcom/dropbox/client2/android/AuthActivity;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity$3;->this$0:Lcom/dropbox/client2/android/AuthActivity;

    iget-object v1, p0, Lcom/dropbox/client2/android/AuthActivity$3;->val$officialAuthIntent:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/dropbox/client2/android/AuthActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 447
    :goto_0
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity$3;->this$0:Lcom/dropbox/client2/android/AuthActivity;

    iget-object v1, p0, Lcom/dropbox/client2/android/AuthActivity$3;->val$state:Ljava/lang/String;

    # setter for: Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;
    invoke-static {v0, v1}, Lcom/dropbox/client2/android/AuthActivity;->access$302(Lcom/dropbox/client2/android/AuthActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 448
    :goto_1
    return-void

    .line 438
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity$3;->this$0:Lcom/dropbox/client2/android/AuthActivity;

    iget-object v1, p0, Lcom/dropbox/client2/android/AuthActivity$3;->val$state:Ljava/lang/String;

    # invokes: Lcom/dropbox/client2/android/AuthActivity;->startWebAuth(Ljava/lang/String;)V
    invoke-static {v0, v1}, Lcom/dropbox/client2/android/AuthActivity;->access$200(Lcom/dropbox/client2/android/AuthActivity;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 440
    :catch_0
    move-exception v0

    .line 441
    # getter for: Lcom/dropbox/client2/android/AuthActivity;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/dropbox/client2/android/AuthActivity;->access$000()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Could not launch intent. User may have restricted profile"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 442
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity$3;->this$0:Lcom/dropbox/client2/android/AuthActivity;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AuthActivity;->finish()V

    goto :goto_1
.end method
