.class Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;
.super Ljava/lang/Object;
.source "NotificationPlugin.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->alert(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;

.field final synthetic val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$negativeButton:Lorg/json/JSONObject;

.field final synthetic val$neutralButton:Lorg/json/JSONObject;

.field final synthetic val$positiveButton:Lorg/json/JSONObject;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;Lorg/json/JSONObject;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$neutralButton:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$message:Ljava/lang/String;

    iput-object p4, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$title:Ljava/lang/String;

    iput-object p5, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$positiveButton:Lorg/json/JSONObject;

    iput-object p6, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    iput-object p7, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$negativeButton:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    const/16 v10, 0x21

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 89
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$neutralButton:Lorg/json/JSONObject;

    if-eqz v8, :cond_5

    move v3, v6

    .line 91
    .local v3, "hasNeutralButton":Z
    :goto_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;

    iget-object v8, v8, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v8}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v1, v8}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 93
    .local v1, "dlg":Landroid/app/AlertDialog$Builder;
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$message:Ljava/lang/String;

    if-eqz v8, :cond_0

    .line 94
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$message:Ljava/lang/String;

    invoke-virtual {v1, v8}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 95
    :cond_0
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$title:Ljava/lang/String;

    if-eqz v8, :cond_1

    .line 97
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$title:Ljava/lang/String;

    const-string v9, "SM"

    invoke-virtual {v8, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    if-lez v8, :cond_6

    .line 99
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$title:Ljava/lang/String;

    const-string v9, "SM"

    invoke-virtual {v8, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 100
    .local v5, "serviceMarkStart":I
    if-ltz v5, :cond_1

    .line 101
    new-instance v4, Landroid/text/SpannableStringBuilder;

    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$title:Ljava/lang/String;

    invoke-direct {v4, v8}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 102
    .local v4, "sb":Landroid/text/SpannableStringBuilder;
    new-instance v8, Landroid/text/style/RelativeSizeSpan;

    const v9, 0x3f19999a    # 0.6f

    invoke-direct {v8, v9}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 v9, v5, 0x2

    invoke-virtual {v4, v8, v5, v9, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 104
    new-instance v8, Landroid/text/style/SuperscriptSpan;

    invoke-direct {v8}, Landroid/text/style/SuperscriptSpan;-><init>()V

    add-int/lit8 v9, v5, 0x2

    invoke-virtual {v4, v8, v5, v9, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 106
    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 113
    .end local v4    # "sb":Landroid/text/SpannableStringBuilder;
    .end local v5    # "serviceMarkStart":I
    :cond_1
    :goto_1
    invoke-virtual {v1, v6}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 119
    :try_start_0
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$positiveButton:Lorg/json/JSONObject;

    if-eqz v6, :cond_2

    .line 121
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$positiveButton:Lorg/json/JSONObject;

    const-string v8, "text"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$1;

    invoke-direct {v8, p0}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;)V

    invoke-virtual {v1, v6, v8}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 133
    :cond_2
    if-eqz v3, :cond_3

    .line 135
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$neutralButton:Lorg/json/JSONObject;

    const-string v8, "text"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$2;

    invoke-direct {v8, p0}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$2;-><init>(Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;)V

    invoke-virtual {v1, v6, v8}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 147
    :cond_3
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$negativeButton:Lorg/json/JSONObject;

    if-eqz v6, :cond_4

    .line 149
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$negativeButton:Lorg/json/JSONObject;

    const-string v8, "text"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v6

    new-instance v8, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$3;

    invoke-direct {v8, p0, v3}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$3;-><init>(Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;Z)V

    invoke-virtual {v1, v6, v8}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    :cond_4
    :goto_2
    new-instance v6, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$4;

    invoke-direct {v6, p0, v3}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$4;-><init>(Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;Z)V

    invoke-virtual {v1, v6}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 180
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    .line 181
    .local v0, "d":Landroid/app/AlertDialog;
    invoke-virtual {v0, v7}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 182
    # getter for: Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->dialogs:Ljava/util/List;
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->access$000()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    return-void

    .end local v0    # "d":Landroid/app/AlertDialog;
    .end local v1    # "dlg":Landroid/app/AlertDialog$Builder;
    .end local v3    # "hasNeutralButton":Z
    :cond_5
    move v3, v7

    .line 89
    goto/16 :goto_0

    .line 109
    .restart local v1    # "dlg":Landroid/app/AlertDialog$Builder;
    .restart local v3    # "hasNeutralButton":Z
    :cond_6
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$title:Ljava/lang/String;

    invoke-virtual {v1, v8}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    goto :goto_1

    .line 163
    :catch_0
    move-exception v2

    .line 164
    .local v2, "e":Lorg/json/JSONException;
    const-string v6, "NotificationPlugin"

    const-string v8, "problem getting button text"

    invoke-static {v6, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2
.end method
