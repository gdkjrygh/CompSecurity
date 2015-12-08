.class Lorg/apache/cordova/dialogs/Notification$4;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/dialogs/Notification;->prompt(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/dialogs/Notification;

.field final synthetic val$buttonLabels:Lorg/json/JSONArray;

.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;

.field final synthetic val$cordova:Lorg/apache/cordova/CordovaInterface;

.field final synthetic val$defaultText:Ljava/lang/String;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/dialogs/Notification;Lorg/apache/cordova/CordovaInterface;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/dialogs/Notification;

    .prologue
    .line 276
    iput-object p1, p0, Lorg/apache/cordova/dialogs/Notification$4;->this$0:Lorg/apache/cordova/dialogs/Notification;

    iput-object p2, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    iput-object p3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$defaultText:Ljava/lang/String;

    iput-object p4, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$message:Ljava/lang/String;

    iput-object p5, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$title:Ljava/lang/String;

    iput-object p6, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$buttonLabels:Lorg/json/JSONArray;

    iput-object p7, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    .line 278
    new-instance v1, Landroid/widget/EditText;

    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 279
    .local v1, "promptInput":Landroid/widget/EditText;
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$defaultText:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 280
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->this$0:Lorg/apache/cordova/dialogs/Notification;

    iget-object v4, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    # invokes: Lorg/apache/cordova/dialogs/Notification;->createDialog(Lorg/apache/cordova/CordovaInterface;)Landroid/app/AlertDialog$Builder;
    invoke-static {v3, v4}, Lorg/apache/cordova/dialogs/Notification;->access$000(Lorg/apache/cordova/dialogs/Notification;Lorg/apache/cordova/CordovaInterface;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 281
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$message:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 282
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$title:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 283
    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 285
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 287
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 290
    .local v2, "result":Lorg/json/JSONObject;
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$buttonLabels:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 292
    :try_start_0
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$buttonLabels:Lorg/json/JSONArray;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lorg/apache/cordova/dialogs/Notification$4$1;

    invoke-direct {v4, p0, v2, v1}, Lorg/apache/cordova/dialogs/Notification$4$1;-><init>(Lorg/apache/cordova/dialogs/Notification$4;Lorg/json/JSONObject;Landroid/widget/EditText;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    .line 307
    :cond_0
    :goto_0
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$buttonLabels:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-le v3, v5, :cond_1

    .line 309
    :try_start_1
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$buttonLabels:Lorg/json/JSONArray;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lorg/apache/cordova/dialogs/Notification$4$2;

    invoke-direct {v4, p0, v2, v1}, Lorg/apache/cordova/dialogs/Notification$4$2;-><init>(Lorg/apache/cordova/dialogs/Notification$4;Lorg/json/JSONObject;Landroid/widget/EditText;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 324
    :cond_1
    :goto_1
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$buttonLabels:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-le v3, v6, :cond_2

    .line 326
    :try_start_2
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->val$buttonLabels:Lorg/json/JSONArray;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lorg/apache/cordova/dialogs/Notification$4$3;

    invoke-direct {v4, p0, v2, v1}, Lorg/apache/cordova/dialogs/Notification$4$3;-><init>(Lorg/apache/cordova/dialogs/Notification$4;Lorg/json/JSONObject;Landroid/widget/EditText;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 339
    :cond_2
    :goto_2
    new-instance v3, Lorg/apache/cordova/dialogs/Notification$4$4;

    invoke-direct {v3, p0, v2, v1}, Lorg/apache/cordova/dialogs/Notification$4$4;-><init>(Lorg/apache/cordova/dialogs/Notification$4;Lorg/json/JSONObject;Landroid/widget/EditText;)V

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 350
    iget-object v3, p0, Lorg/apache/cordova/dialogs/Notification$4;->this$0:Lorg/apache/cordova/dialogs/Notification;

    # invokes: Lorg/apache/cordova/dialogs/Notification;->changeTextDirection(Landroid/app/AlertDialog$Builder;)V
    invoke-static {v3, v0}, Lorg/apache/cordova/dialogs/Notification;->access$100(Lorg/apache/cordova/dialogs/Notification;Landroid/app/AlertDialog$Builder;)V

    .line 351
    return-void

    .line 337
    :catch_0
    move-exception v3

    goto :goto_2

    .line 320
    :catch_1
    move-exception v3

    goto :goto_1

    .line 303
    :catch_2
    move-exception v3

    goto :goto_0
.end method
