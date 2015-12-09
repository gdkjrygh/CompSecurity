.class final Lcom/EnterpriseMobileBanking/AppHelper$6;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 317
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v2

    .line 318
    .local v2, "webview":Landroid/webkit/WebView;
    if-eqz v2, :cond_0

    .line 320
    invoke-virtual {v2}, Landroid/webkit/WebView;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    .line 321
    .local v0, "focusedChild":Landroid/view/View;
    if-eqz v0, :cond_0

    const-string v3, "android.webkit.WebTextView"

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 322
    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->removeView(Landroid/view/View;)V

    .line 325
    .end local v0    # "focusedChild":Landroid/view/View;
    :cond_0
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v3

    const-string v4, "input_method"

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 326
    .local v1, "imm":Landroid/view/inputmethod/InputMethodManager;
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v3

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getCurrentFocus()Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_2

    .line 327
    if-eqz v2, :cond_1

    .line 329
    invoke-virtual {v2}, Landroid/webkit/WebView;->getRootView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual {v1, v3, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 334
    :cond_1
    :goto_0
    return-void

    .line 332
    :cond_2
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v3

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getCurrentFocus()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual {v1, v3, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto :goto_0
.end method
