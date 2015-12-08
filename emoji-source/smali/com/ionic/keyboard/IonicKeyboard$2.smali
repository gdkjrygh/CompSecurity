.class Lcom/ionic/keyboard/IonicKeyboard$2;
.super Ljava/lang/Object;
.source "IonicKeyboard.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ionic/keyboard/IonicKeyboard;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ionic/keyboard/IonicKeyboard;

.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;


# direct methods
.method constructor <init>(Lcom/ionic/keyboard/IonicKeyboard;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .param p1, "this$0"    # Lcom/ionic/keyboard/IonicKeyboard;

    .prologue
    .line 66
    iput-object p1, p0, Lcom/ionic/keyboard/IonicKeyboard$2;->this$0:Lcom/ionic/keyboard/IonicKeyboard;

    iput-object p2, p0, Lcom/ionic/keyboard/IonicKeyboard$2;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 69
    iget-object v2, p0, Lcom/ionic/keyboard/IonicKeyboard$2;->this$0:Lcom/ionic/keyboard/IonicKeyboard;

    iget-object v2, v2, Lcom/ionic/keyboard/IonicKeyboard;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const-string v3, "input_method"

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 70
    .local v0, "inputManager":Landroid/view/inputmethod/InputMethodManager;
    iget-object v2, p0, Lcom/ionic/keyboard/IonicKeyboard$2;->this$0:Lcom/ionic/keyboard/IonicKeyboard;

    iget-object v2, v2, Lcom/ionic/keyboard/IonicKeyboard;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    .line 72
    .local v1, "v":Landroid/view/View;
    if-nez v1, :cond_0

    .line 73
    iget-object v2, p0, Lcom/ionic/keyboard/IonicKeyboard$2;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    const-string v3, "No current focus"

    invoke-virtual {v2, v3}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 75
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 76
    iget-object v2, p0, Lcom/ionic/keyboard/IonicKeyboard$2;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v2}, Lorg/apache/cordova/CallbackContext;->success()V

    .line 77
    return-void
.end method
