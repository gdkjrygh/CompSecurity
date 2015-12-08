.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V
    .locals 0

    .prologue
    .line 1167
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1171
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1100(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lorg/apache/cordova/CordovaWebView;

    move-result-object v1

    invoke-virtual {v1}, Lorg/apache/cordova/CordovaWebView;->getRootView()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1172
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1173
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 1179
    :cond_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 1180
    .local v3, "jsonArr":Lorg/json/JSONArray;
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v2, 0x7f0900f9

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1181
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    .line 1182
    const/16 v1, 0x1e

    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1183
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1200(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lorg/apache/cordova/CordovaWebView;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;-><init>(Landroid/app/Activity;Landroid/view/View;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;Z)V

    .line 1185
    .local v0, "busy":Lcom/EnterpriseMobileBanking/Plugins/COFBusy;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->setBusy(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    .line 1186
    return-void
.end method
