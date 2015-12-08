.class Lnl/xservices/plugins/SocialSharing$1;
.super Lnl/xservices/plugins/SocialSharing$SocialSharingRunnable;
.source "SocialSharing.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnl/xservices/plugins/SocialSharing;->invokeEmailIntent(Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnl/xservices/plugins/SocialSharing;

.field final synthetic val$bcc:Lorg/json/JSONArray;

.field final synthetic val$cc:Lorg/json/JSONArray;

.field final synthetic val$files:Lorg/json/JSONArray;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$plugin:Lnl/xservices/plugins/SocialSharing;

.field final synthetic val$subject:Ljava/lang/String;

.field final synthetic val$to:Lorg/json/JSONArray;


# direct methods
.method constructor <init>(Lnl/xservices/plugins/SocialSharing;Lorg/apache/cordova/CallbackContext;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lnl/xservices/plugins/SocialSharing;)V
    .locals 0
    .param p1, "this$0"    # Lnl/xservices/plugins/SocialSharing;
    .param p2, "cb"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 109
    iput-object p1, p0, Lnl/xservices/plugins/SocialSharing$1;->this$0:Lnl/xservices/plugins/SocialSharing;

    iput-object p3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$message:Ljava/lang/String;

    iput-object p4, p0, Lnl/xservices/plugins/SocialSharing$1;->val$subject:Ljava/lang/String;

    iput-object p5, p0, Lnl/xservices/plugins/SocialSharing$1;->val$to:Lorg/json/JSONArray;

    iput-object p6, p0, Lnl/xservices/plugins/SocialSharing$1;->val$cc:Lorg/json/JSONArray;

    iput-object p7, p0, Lnl/xservices/plugins/SocialSharing$1;->val$bcc:Lorg/json/JSONArray;

    iput-object p8, p0, Lnl/xservices/plugins/SocialSharing$1;->val$files:Lorg/json/JSONArray;

    iput-object p9, p0, Lnl/xservices/plugins/SocialSharing$1;->val$plugin:Lnl/xservices/plugins/SocialSharing;

    invoke-direct {p0, p1, p2}, Lnl/xservices/plugins/SocialSharing$SocialSharingRunnable;-><init>(Lnl/xservices/plugins/SocialSharing;Lorg/apache/cordova/CallbackContext;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    .line 111
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND_MULTIPLE"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 112
    .local v1, "draft":Landroid/content/Intent;
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$message:Ljava/lang/String;

    # invokes: Lnl/xservices/plugins/SocialSharing;->notEmpty(Ljava/lang/String;)Z
    invoke-static {v0}, Lnl/xservices/plugins/SocialSharing;->access$000(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    const-string v0, ".*\\<[^>]+>.*"

    const/16 v3, 0x20

    invoke-static {v0, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v9

    .line 114
    .local v9, "htmlPattern":Ljava/util/regex/Pattern;
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$message:Ljava/lang/String;

    invoke-virtual {v9, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 115
    const-string v0, "android.intent.extra.TEXT"

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$message:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 116
    const-string v0, "text/html"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    .end local v9    # "htmlPattern":Ljava/util/regex/Pattern;
    :cond_0
    :goto_0
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$subject:Ljava/lang/String;

    # invokes: Lnl/xservices/plugins/SocialSharing;->notEmpty(Ljava/lang/String;)Z
    invoke-static {v0}, Lnl/xservices/plugins/SocialSharing;->access$000(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    const-string v0, "android.intent.extra.SUBJECT"

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$subject:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    :cond_1
    :try_start_0
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$to:Lorg/json/JSONArray;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$to:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 127
    const-string v0, "android.intent.extra.EMAIL"

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$to:Lorg/json/JSONArray;

    # invokes: Lnl/xservices/plugins/SocialSharing;->toStringArray(Lorg/json/JSONArray;)[Ljava/lang/String;
    invoke-static {v3}, Lnl/xservices/plugins/SocialSharing;->access$100(Lorg/json/JSONArray;)[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    :cond_2
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$cc:Lorg/json/JSONArray;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$cc:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 130
    const-string v0, "android.intent.extra.CC"

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$cc:Lorg/json/JSONArray;

    # invokes: Lnl/xservices/plugins/SocialSharing;->toStringArray(Lorg/json/JSONArray;)[Ljava/lang/String;
    invoke-static {v3}, Lnl/xservices/plugins/SocialSharing;->access$100(Lorg/json/JSONArray;)[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    :cond_3
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$bcc:Lorg/json/JSONArray;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$bcc:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 133
    const-string v0, "android.intent.extra.BCC"

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$bcc:Lorg/json/JSONArray;

    # invokes: Lnl/xservices/plugins/SocialSharing;->toStringArray(Lorg/json/JSONArray;)[Ljava/lang/String;
    invoke-static {v3}, Lnl/xservices/plugins/SocialSharing;->access$100(Lorg/json/JSONArray;)[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 135
    :cond_4
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$files:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_8

    .line 136
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .local v8, "fileUris":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/net/Uri;>;"
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->this$0:Lnl/xservices/plugins/SocialSharing;

    # invokes: Lnl/xservices/plugins/SocialSharing;->getDownloadDir()Ljava/lang/String;
    invoke-static {v0}, Lnl/xservices/plugins/SocialSharing;->access$200(Lnl/xservices/plugins/SocialSharing;)Ljava/lang/String;

    move-result-object v2

    .line 138
    .local v2, "dir":Ljava/lang/String;
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_1
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->val$files:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_7

    .line 139
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->this$0:Lnl/xservices/plugins/SocialSharing;

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$files:Lorg/json/JSONArray;

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lnl/xservices/plugins/SocialSharing$1;->val$subject:Ljava/lang/String;

    # invokes: Lnl/xservices/plugins/SocialSharing;->getFileUriAndSetType(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/net/Uri;
    invoke-static/range {v0 .. v5}, Lnl/xservices/plugins/SocialSharing;->access$300(Lnl/xservices/plugins/SocialSharing;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/net/Uri;

    move-result-object v7

    .line 140
    .local v7, "fileUri":Landroid/net/Uri;
    if-eqz v7, :cond_5

    .line 141
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 118
    .end local v2    # "dir":Ljava/lang/String;
    .end local v5    # "i":I
    .end local v7    # "fileUri":Landroid/net/Uri;
    .end local v8    # "fileUris":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/net/Uri;>;"
    .restart local v9    # "htmlPattern":Ljava/util/regex/Pattern;
    :cond_6
    const-string v0, "android.intent.extra.TEXT"

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$message:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 119
    const-string v0, "text/plain"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 144
    .end local v9    # "htmlPattern":Ljava/util/regex/Pattern;
    .restart local v2    # "dir":Ljava/lang/String;
    .restart local v5    # "i":I
    .restart local v8    # "fileUris":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/net/Uri;>;"
    :cond_7
    :try_start_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 145
    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {v1, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 152
    .end local v2    # "dir":Ljava/lang/String;
    .end local v5    # "i":I
    .end local v8    # "fileUris":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/net/Uri;>;"
    :cond_8
    :goto_2
    const-string v0, "application/octet-stream"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->this$0:Lnl/xservices/plugins/SocialSharing;

    iget-object v0, v0, Lnl/xservices/plugins/SocialSharing;->cordova:Lorg/apache/cordova/CordovaInterface;

    iget-object v3, p0, Lnl/xservices/plugins/SocialSharing$1;->val$plugin:Lnl/xservices/plugins/SocialSharing;

    const-string v4, "Choose Email App"

    invoke-static {v1, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v4

    const/4 v10, 0x2

    invoke-interface {v0, v3, v4, v10}, Lorg/apache/cordova/CordovaInterface;->startActivityForResult(Lorg/apache/cordova/CordovaPlugin;Landroid/content/Intent;I)V

    .line 154
    return-void

    .line 148
    :catch_0
    move-exception v6

    .line 149
    .local v6, "e":Ljava/lang/Exception;
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$1;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_2
.end method
