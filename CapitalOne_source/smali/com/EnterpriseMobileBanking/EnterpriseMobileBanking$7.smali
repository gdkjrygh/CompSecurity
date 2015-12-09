.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$7;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->finishOnCreate()V
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
    .line 497
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$7;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 500
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isCanadianApp()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 502
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 504
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$7;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const-string v1, "window.location.hash=\'www/cards/accounts\';"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    .line 515
    :goto_0
    return-void

    .line 508
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$7;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const-string v1, "window.location.hash=\'www/cards/login\';"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    goto :goto_0

    .line 513
    :cond_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$7;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->returnToHome(Landroid/view/View;)V

    goto :goto_0
.end method
