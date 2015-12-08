.class Lorg/apache/cordova/inappbrowser/InAppBrowser$5$3;
.super Ljava/lang/Object;
.source "InAppBrowser.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/apache/cordova/inappbrowser/InAppBrowser$5;


# direct methods
.method constructor <init>(Lorg/apache/cordova/inappbrowser/InAppBrowser$5;)V
    .locals 0
    .param p1, "this$1"    # Lorg/apache/cordova/inappbrowser/InAppBrowser$5;

    .prologue
    .line 545
    iput-object p1, p0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$3;->this$1:Lorg/apache/cordova/inappbrowser/InAppBrowser$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p1, "v"    # Landroid/view/View;
    .param p2, "keyCode"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 548
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x42

    if-ne p2, v0, :cond_0

    .line 549
    iget-object v0, p0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$3;->this$1:Lorg/apache/cordova/inappbrowser/InAppBrowser$5;

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    iget-object v1, p0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$3;->this$1:Lorg/apache/cordova/inappbrowser/InAppBrowser$5;

    iget-object v1, v1, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    # invokes: Lorg/apache/cordova/inappbrowser/InAppBrowser;->navigate(Ljava/lang/String;)V
    invoke-static {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$600(Lorg/apache/cordova/inappbrowser/InAppBrowser;Ljava/lang/String;)V

    .line 550
    const/4 v0, 0x1

    .line 552
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
