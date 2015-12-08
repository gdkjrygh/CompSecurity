.class Lcom/ionic/keyboard/IonicKeyboard$1;
.super Ljava/lang/Object;
.source "IonicKeyboard.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ionic/keyboard/IonicKeyboard;->initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field previousHeightDiff:I

.field final synthetic this$0:Lcom/ionic/keyboard/IonicKeyboard;

.field final synthetic val$appView:Lorg/apache/cordova/CordovaWebView;

.field final synthetic val$density:F

.field final synthetic val$rootView:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/ionic/keyboard/IonicKeyboard;Landroid/view/View;FLorg/apache/cordova/CordovaWebView;)V
    .locals 1
    .param p1, "this$0"    # Lcom/ionic/keyboard/IonicKeyboard;

    .prologue
    .line 33
    iput-object p1, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->this$0:Lcom/ionic/keyboard/IonicKeyboard;

    iput-object p2, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$rootView:Landroid/view/View;

    iput p3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$density:F

    iput-object p4, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$appView:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->previousHeightDiff:I

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 7

    .prologue
    const/16 v6, 0x64

    .line 37
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 39
    .local v2, "r":Landroid/graphics/Rect;
    iget-object v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$rootView:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 41
    iget-object v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$rootView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    iget v4, v2, Landroid/graphics/Rect;->bottom:I

    iget v5, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v4, v5

    sub-int v0, v3, v4

    .line 42
    .local v0, "heightDiff":I
    int-to-float v3, v0

    iget v4, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$density:F

    div-float/2addr v3, v4

    float-to-int v1, v3

    .line 43
    .local v1, "pixelHeightDiff":I
    if-le v1, v6, :cond_1

    iget v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->previousHeightDiff:I

    if-eq v1, v3, :cond_1

    .line 44
    iget-object v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$appView:Lorg/apache/cordova/CordovaWebView;

    const-string v4, "cordova.plugins.Keyboard.isVisible = true"

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    .line 45
    iget-object v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$appView:Lorg/apache/cordova/CordovaWebView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "cordova.fireWindowEvent(\'native.keyboardshow\', { \'keyboardHeight\':"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "});"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    .line 48
    iget-object v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$appView:Lorg/apache/cordova/CordovaWebView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "cordova.fireWindowEvent(\'native.showkeyboard\', { \'keyboardHeight\':"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "});"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    .line 57
    :cond_0
    :goto_0
    iput v1, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->previousHeightDiff:I

    .line 58
    return-void

    .line 50
    :cond_1
    iget v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->previousHeightDiff:I

    if-eq v1, v3, :cond_0

    iget v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->previousHeightDiff:I

    sub-int/2addr v3, v1

    if-le v3, v6, :cond_0

    .line 51
    iget-object v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$appView:Lorg/apache/cordova/CordovaWebView;

    const-string v4, "cordova.plugins.Keyboard.isVisible = false"

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    .line 52
    iget-object v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$appView:Lorg/apache/cordova/CordovaWebView;

    const-string v4, "cordova.fireWindowEvent(\'native.keyboardhide\')"

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    .line 55
    iget-object v3, p0, Lcom/ionic/keyboard/IonicKeyboard$1;->val$appView:Lorg/apache/cordova/CordovaWebView;

    const-string v4, "cordova.fireWindowEvent(\'native.hidekeyboard\')"

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    goto :goto_0
.end method
