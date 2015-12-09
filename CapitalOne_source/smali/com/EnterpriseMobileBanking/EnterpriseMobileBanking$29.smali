.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$29;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onResume()V
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
    .line 2195
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$29;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 2201
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->setmAppWebViewDisplayBlocked(Z)V

    .line 2203
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$29;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$300(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->isAppHeaderDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2205
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$29;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$300(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setAppHeaderDisabled(Z)V

    .line 2207
    :cond_0
    return-void
.end method
