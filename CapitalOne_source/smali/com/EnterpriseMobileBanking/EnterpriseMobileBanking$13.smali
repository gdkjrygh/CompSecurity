.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setupMenuList()V
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
    .line 913
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
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
    .line 917
    .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuItems:Ljava/util/List;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$800()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .line 919
    .local v0, "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MenuList - Found: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " -- with Action: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 922
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 923
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v3, 0x7f0800a2

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 925
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->handleNative(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 927
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MORE AFTER handleNative"

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 928
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    invoke-static {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$300(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v3

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavButton()Landroid/widget/ImageButton;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNavigation(Landroid/view/View;)V

    .line 929
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 930
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javascript:"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 931
    .local v1, "sendStr":Ljava/lang/String;
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sending: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 932
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    .line 935
    .end local v1    # "sendStr":Ljava/lang/String;
    :cond_0
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v4, 0x7f090102

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 936
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 940
    :cond_1
    return-void
.end method
