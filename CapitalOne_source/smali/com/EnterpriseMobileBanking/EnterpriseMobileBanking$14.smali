.class final Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$14;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSelectedMenuItem(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$makeSelection:Z

.field final synthetic val$menuItemId:Ljava/lang/String;


# direct methods
.method constructor <init>(ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 957
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$14;->val$makeSelection:Z

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$14;->val$menuItemId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 959
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuItems:Ljava/util/List;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$800()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .line 960
    .local v2, "menuItem":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    move-object v1, v2

    .line 961
    .local v1, "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    iget-boolean v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$14;->val$makeSelection:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$14;->val$menuItemId:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 962
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Selecting menuItem with id = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 965
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$900()Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 967
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$900()Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->setSelected(Z)V

    .line 969
    :cond_0
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->setSelected(Z)V

    .line 970
    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$902(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    goto :goto_0

    .line 972
    :cond_1
    invoke-virtual {v1, v6}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->setSelected(Z)V

    goto :goto_0

    .line 975
    .end local v1    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    .end local v2    # "menuItem":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    :cond_2
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1000()Landroid/widget/ArrayAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 976
    return-void
.end method
