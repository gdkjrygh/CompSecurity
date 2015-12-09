.class final Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$16;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->addMenuItem(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$value:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .prologue
    .line 1034
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$16;->val$value:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1037
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$16;->val$value:Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;-><init>(Lorg/json/JSONObject;)V

    .line 1039
    .local v0, "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getInstance()Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->addMenuItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 1041
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1000()Landroid/widget/ArrayAdapter;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 1042
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getImage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getImage()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090103

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0900fd

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1045
    :cond_0
    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$902(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .line 1046
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->setSelected(Z)V

    .line 1048
    :cond_1
    return-void
.end method
