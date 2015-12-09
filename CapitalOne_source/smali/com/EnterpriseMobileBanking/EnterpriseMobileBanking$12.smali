.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setupHomePage()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field skipShow:Z

.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field final unauth:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V
    .locals 2

    .prologue
    .line 855
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 856
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f08007a

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->unauth:Landroid/view/View;

    .line 858
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->skipShow:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 863
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f0800a3

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 867
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->unauth:Landroid/view/View;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, p0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 899
    :goto_0
    return-void

    .line 869
    :cond_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->unauth:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->skipShow:Z

    if-nez v0, :cond_4

    .line 872
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->getInstance()Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->skipLanding()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 874
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->skipShow:Z

    .line 881
    :goto_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->unauth:Landroid/view/View;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, p0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 878
    :cond_3
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->unauth:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 879
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f08007e

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 885
    :cond_4
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->getInstance()Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->skipLanding()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 886
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v2, 0x7f08007f

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f080099

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleLob(Landroid/view/View;)V

    .line 894
    :goto_2
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setIntent(Landroid/content/Intent;)V

    goto :goto_0

    .line 887
    :cond_5
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 888
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # invokes: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleIntentUri()V
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$700(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    .line 889
    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->skipShow:Z

    goto :goto_2

    .line 891
    :cond_6
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;->unauth:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    goto :goto_2
.end method
