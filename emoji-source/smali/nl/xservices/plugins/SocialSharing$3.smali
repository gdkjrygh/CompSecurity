.class Lnl/xservices/plugins/SocialSharing$3;
.super Lnl/xservices/plugins/SocialSharing$SocialSharingRunnable;
.source "SocialSharing.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnl/xservices/plugins/SocialSharing;->invokeSMSIntent(Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnl/xservices/plugins/SocialSharing;

.field final synthetic val$image:Ljava/lang/String;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$phonenumbers:Ljava/lang/String;

.field final synthetic val$plugin:Lnl/xservices/plugins/SocialSharing;

.field final synthetic val$subject:Ljava/lang/String;


# direct methods
.method constructor <init>(Lnl/xservices/plugins/SocialSharing;Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnl/xservices/plugins/SocialSharing;)V
    .locals 0
    .param p1, "this$0"    # Lnl/xservices/plugins/SocialSharing;
    .param p2, "cb"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 341
    iput-object p1, p0, Lnl/xservices/plugins/SocialSharing$3;->this$0:Lnl/xservices/plugins/SocialSharing;

    iput-object p3, p0, Lnl/xservices/plugins/SocialSharing$3;->val$phonenumbers:Ljava/lang/String;

    iput-object p4, p0, Lnl/xservices/plugins/SocialSharing$3;->val$message:Ljava/lang/String;

    iput-object p5, p0, Lnl/xservices/plugins/SocialSharing$3;->val$subject:Ljava/lang/String;

    iput-object p6, p0, Lnl/xservices/plugins/SocialSharing$3;->val$image:Ljava/lang/String;

    iput-object p7, p0, Lnl/xservices/plugins/SocialSharing$3;->val$plugin:Lnl/xservices/plugins/SocialSharing;

    invoke-direct {p0, p1, p2}, Lnl/xservices/plugins/SocialSharing$SocialSharingRunnable;-><init>(Lnl/xservices/plugins/SocialSharing;Lorg/apache/cordova/CallbackContext;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 345
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v0, v2, :cond_3

    .line 348
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.intent.action.SENDTO"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 349
    .local v1, "intent":Landroid/content/Intent;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "smsto:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$3;->val$phonenumbers:Ljava/lang/String;

    # invokes: Lnl/xservices/plugins/SocialSharing;->notEmpty(Ljava/lang/String;)Z
    invoke-static {v0}, Lnl/xservices/plugins/SocialSharing;->access$000(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$3;->val$phonenumbers:Ljava/lang/String;

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 357
    :cond_0
    :goto_1
    const-string v0, "sms_body"

    iget-object v2, p0, Lnl/xservices/plugins/SocialSharing$3;->val$message:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 358
    const-string v0, "sms_subject"

    iget-object v2, p0, Lnl/xservices/plugins/SocialSharing$3;->val$subject:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 361
    :try_start_0
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$3;->val$image:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, ""

    iget-object v2, p0, Lnl/xservices/plugins/SocialSharing$3;->val$image:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 362
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$3;->this$0:Lnl/xservices/plugins/SocialSharing;

    iget-object v2, p0, Lnl/xservices/plugins/SocialSharing$3;->this$0:Lnl/xservices/plugins/SocialSharing;

    # invokes: Lnl/xservices/plugins/SocialSharing;->getDownloadDir()Ljava/lang/String;
    invoke-static {v2}, Lnl/xservices/plugins/SocialSharing;->access$200(Lnl/xservices/plugins/SocialSharing;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$3;->val$image:Ljava/lang/String;

    iget-object v4, p0, Lnl/xservices/plugins/SocialSharing$3;->val$subject:Ljava/lang/String;

    const/4 v5, 0x0

    # invokes: Lnl/xservices/plugins/SocialSharing;->getFileUriAndSetType(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/net/Uri;
    invoke-static/range {v0 .. v5}, Lnl/xservices/plugins/SocialSharing;->access$300(Lnl/xservices/plugins/SocialSharing;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/net/Uri;

    move-result-object v7

    .line 363
    .local v7, "fileUri":Landroid/net/Uri;
    if-eqz v7, :cond_1

    .line 364
    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {v1, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 367
    .end local v7    # "fileUri":Landroid/net/Uri;
    :cond_1
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$3;->this$0:Lnl/xservices/plugins/SocialSharing;

    iget-object v0, v0, Lnl/xservices/plugins/SocialSharing;->cordova:Lorg/apache/cordova/CordovaInterface;

    iget-object v2, p0, Lnl/xservices/plugins/SocialSharing$3;->val$plugin:Lnl/xservices/plugins/SocialSharing;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lorg/apache/cordova/CordovaInterface;->startActivityForResult(Lorg/apache/cordova/CordovaPlugin;Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 371
    :goto_2
    return-void

    .line 349
    :cond_2
    const-string v0, ""

    goto :goto_0

    .line 351
    .end local v1    # "intent":Landroid/content/Intent;
    :cond_3
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 352
    .restart local v1    # "intent":Landroid/content/Intent;
    const-string v0, "vnd.android-dir/mms-sms"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 353
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$3;->val$phonenumbers:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 354
    const-string v0, "address"

    iget-object v2, p0, Lnl/xservices/plugins/SocialSharing$3;->val$phonenumbers:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 368
    :catch_0
    move-exception v6

    .line 369
    .local v6, "e":Ljava/lang/Exception;
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$3;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_2
.end method
