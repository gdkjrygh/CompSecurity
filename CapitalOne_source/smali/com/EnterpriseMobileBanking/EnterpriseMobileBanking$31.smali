.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onReceivedError(ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field final synthetic val$errorUrl:Ljava/lang/String;

.field final synthetic val$me:Lorg/apache/cordova/DroidGap;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Lorg/apache/cordova/DroidGap;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 2300
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;->val$me:Lorg/apache/cordova/DroidGap;

    iput-object p3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;->val$errorUrl:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 2302
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;->val$me:Lorg/apache/cordova/DroidGap;

    invoke-virtual {v0}, Lorg/apache/cordova/DroidGap;->spinnerStop()V

    .line 2303
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1900(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lorg/apache/cordova/CordovaWebView;

    move-result-object v0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;->val$errorUrl:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/apache/cordova/CordovaWebView;->showWebPage(Ljava/lang/String;ZZLjava/util/HashMap;)V

    .line 2304
    return-void
.end method
