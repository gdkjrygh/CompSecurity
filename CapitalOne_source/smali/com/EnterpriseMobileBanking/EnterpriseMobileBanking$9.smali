.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$9;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


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
    .line 556
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$9;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 560
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CA"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 561
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$9;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f080026

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buryNavButton()V

    .line 562
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$9;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f0800ae

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 564
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$9;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->accRunner:Ljava/lang/Runnable;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$500(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 565
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->setupKeyboardListener()V

    .line 566
    return-void
.end method
