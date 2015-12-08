.class Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;
.super Landroid/webkit/WebView;
.source "AmpDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/localytics/android/AmpDialogFragment$AmpDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AmpWebView"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView$AmpWebViewClient;
    }
.end annotation


# instance fields
.field private mClient:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView$AmpWebViewClient;

.field final synthetic this$1:Lcom/localytics/android/AmpDialogFragment$AmpDialog;


# direct methods
.method public constructor <init>(Lcom/localytics/android/AmpDialogFragment$AmpDialog;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "attrs"    # Landroid/util/AttributeSet;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v6, -0x1

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 838
    iput-object p1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->this$1:Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    .line 839
    invoke-direct {p0, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 842
    invoke-static {}, Lcom/localytics/android/DatapointHelper;->getApiLevel()I

    move-result v2

    const/16 v3, 0x13

    if-lt v2, v3, :cond_0

    .line 844
    const/4 v2, 0x0

    invoke-virtual {p0, v4, v2}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 847
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 848
    .local v0, "params":Landroid/widget/LinearLayout$LayoutParams;
    const/16 v2, 0x11

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 849
    invoke-virtual {p0, v0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 851
    invoke-virtual {p0, v5}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->setBackgroundColor(I)V

    .line 852
    invoke-virtual {p0, v4}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->setInitialScale(I)V

    .line 853
    invoke-virtual {p0, v5}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->setHorizontalScrollBarEnabled(Z)V

    .line 854
    invoke-virtual {p0, v5}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->setVerticalScrollBarEnabled(Z)V

    .line 856
    new-instance v2, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView$AmpWebViewClient;

    iget-object v3, p1, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    invoke-virtual {v3}, Lcom/localytics/android/AmpDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView$AmpWebViewClient;-><init>(Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;Landroid/app/Activity;)V

    iput-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->mClient:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView$AmpWebViewClient;

    invoke-virtual {p0, v2}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 858
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    .line 859
    .local v1, "settings":Landroid/webkit/WebSettings;
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 860
    iget-object v2, p1, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    # getter for: Lcom/localytics/android/AmpDialogFragment;->mJavaScriptClient:Lcom/localytics/android/JavaScriptClient;
    invoke-static {v2}, Lcom/localytics/android/AmpDialogFragment;->access$500(Lcom/localytics/android/AmpDialogFragment;)Lcom/localytics/android/JavaScriptClient;

    move-result-object v2

    const-string v3, "localytics"

    invoke-virtual {p0, v2, v3}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 861
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 862
    return-void
.end method
