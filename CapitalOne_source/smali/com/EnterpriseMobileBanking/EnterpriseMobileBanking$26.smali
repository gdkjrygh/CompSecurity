.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field final synthetic val$item:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V
    .locals 0

    .prologue
    .line 2055
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;->val$item:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 2060
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$900()Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2061
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$900()Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->setSelected(Z)V

    .line 2062
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Clearing lastItem"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2064
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;->val$item:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$902(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .line 2066
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;->val$item:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    if-eqz v0, :cond_1

    .line 2068
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Setting selected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;->val$item:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2069
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;->val$item:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->setSelected(Z)V

    .line 2071
    :cond_1
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1000()Landroid/widget/ArrayAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 2072
    return-void
.end method
