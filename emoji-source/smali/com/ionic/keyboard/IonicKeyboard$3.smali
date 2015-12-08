.class Lcom/ionic/keyboard/IonicKeyboard$3;
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
    .line 82
    iput-object p1, p0, Lcom/ionic/keyboard/IonicKeyboard$3;->this$0:Lcom/ionic/keyboard/IonicKeyboard;

    iput-object p2, p0, Lcom/ionic/keyboard/IonicKeyboard$3;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 84
    iget-object v0, p0, Lcom/ionic/keyboard/IonicKeyboard$3;->this$0:Lcom/ionic/keyboard/IonicKeyboard;

    iget-object v0, v0, Lcom/ionic/keyboard/IonicKeyboard;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 85
    iget-object v0, p0, Lcom/ionic/keyboard/IonicKeyboard$3;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Lorg/apache/cordova/CallbackContext;->success()V

    .line 86
    return-void
.end method
