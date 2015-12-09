.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;
.super Ljava/lang/Object;
.source "LockPatternActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setupMenuList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V
    .locals 0

    .prologue
    .line 807
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 810
    .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getInstance()Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    move-result-object v4

    invoke-virtual {v4}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .line 812
    .local v1, "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    # getter for: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$500()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Option chosen was: \'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\'  \'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 814
    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 815
    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/EnterpriseMobileBanking/AppHelper;->handleNative(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 817
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 818
    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v4

    const-string v5, "javascript:"

    const-string v6, ""

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 827
    .local v2, "sendStr":Ljava/lang/String;
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const v5, 0x7f090106

    invoke-virtual {v4, v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 829
    const-string v4, "\'"

    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v3, v4, 0x1

    .line 830
    .local v3, "start":I
    const-string v4, "\'"

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 831
    .local v0, "hash":Ljava/lang/String;
    # getter for: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$500()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Hash: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 832
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v4

    invoke-virtual {v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppView()Landroid/webkit/WebView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 834
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const/4 v5, 0x0

    # invokes: Lcom/capitalone/mobile/banking/security/LockPatternActivity;->handleNavigationSideMenu(Landroid/view/View;)V
    invoke-static {v4, v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->access$200(Lcom/capitalone/mobile/banking/security/LockPatternActivity;Landroid/view/View;)V

    .line 848
    .end local v0    # "hash":Ljava/lang/String;
    .end local v2    # "sendStr":Ljava/lang/String;
    .end local v3    # "start":I
    :cond_0
    :goto_0
    return-void

    .line 839
    .restart local v2    # "sendStr":Ljava/lang/String;
    :cond_1
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    .line 840
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v4}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    .line 843
    .end local v2    # "sendStr":Ljava/lang/String;
    :cond_2
    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const v6, 0x7f090102

    invoke-virtual {v5, v6}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 844
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 846
    :cond_3
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v4}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    goto :goto_0
.end method
