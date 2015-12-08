.class public Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
.super Ljava/lang/Object;
.source "MenuItem.java"


# instance fields
.field private action:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private selected:Z

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "text"    # Ljava/lang/String;
    .param p4, "imageUrl"    # Ljava/lang/String;

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->id:Ljava/lang/String;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->action:Ljava/lang/String;

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->text:Ljava/lang/String;

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->imageUrl:Ljava/lang/String;

    .line 11
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->selected:Z

    .line 14
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->id:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->action:Ljava/lang/String;

    .line 16
    iput-object p3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->text:Ljava/lang/String;

    .line 17
    iput-object p4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->imageUrl:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 6
    .param p1, "value"    # Lorg/json/JSONObject;

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v4, ""

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->id:Ljava/lang/String;

    .line 8
    const-string v4, ""

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->action:Ljava/lang/String;

    .line 9
    const-string v4, ""

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->text:Ljava/lang/String;

    .line 10
    const/4 v4, 0x0

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->imageUrl:Ljava/lang/String;

    .line 11
    const/4 v4, 0x0

    iput-boolean v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->selected:Z

    .line 22
    :try_start_0
    const-string v4, "menuItem"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 23
    .local v3, "menuItem":Lorg/json/JSONObject;
    const-string v4, "MenuItemId"

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->id:Ljava/lang/String;

    .line 24
    const-string v4, "MenuItemName"

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->text:Ljava/lang/String;

    .line 25
    const-string v4, "Menu"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 27
    .local v2, "headerItem":Lorg/json/JSONObject;
    if-nez v2, :cond_0

    .line 28
    const-string v4, "MenuItemIconName"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->imageUrl:Ljava/lang/String;

    .line 29
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->imageUrl:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 31
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->imageUrl:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->imageUrl:Ljava/lang/String;

    .line 32
    const-string v4, "MenuItemAction"

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 34
    .local v0, "actionString":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v5, "{"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 35
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "navOverlay.menuClicked( "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ");"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->action:Ljava/lang/String;

    .line 46
    .end local v0    # "actionString":Ljava/lang/String;
    .end local v2    # "headerItem":Lorg/json/JSONObject;
    .end local v3    # "menuItem":Lorg/json/JSONObject;
    :cond_0
    :goto_0
    return-void

    .line 37
    .restart local v0    # "actionString":Ljava/lang/String;
    .restart local v2    # "headerItem":Lorg/json/JSONObject;
    .restart local v3    # "menuItem":Lorg/json/JSONObject;
    :cond_1
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->action:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 43
    .end local v0    # "actionString":Ljava/lang/String;
    .end local v2    # "headerItem":Lorg/json/JSONObject;
    .end local v3    # "menuItem":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 44
    .local v1, "e":Lorg/json/JSONException;
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->action:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->text:Ljava/lang/String;

    return-object v0
.end method

.method public isSelected()Z
    .locals 1

    .prologue
    .line 49
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->selected:Z

    return v0
.end method

.method public setSelected(Z)V
    .locals 0
    .param p1, "value"    # Z

    .prologue
    .line 73
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->selected:Z

    .line 74
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0
    .param p1, "newText"    # Ljava/lang/String;

    .prologue
    .line 65
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->text:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->text:Ljava/lang/String;

    return-object v0
.end method
