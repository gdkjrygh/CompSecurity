.class public Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;
.super Ljava/lang/Object;
.source "QuickNavJSI.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "QuickNavJSI"

.field private static preventClick:Ljava/lang/Boolean;


# instance fields
.field private buttons:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;",
            ">;"
        }
    .end annotation
.end field

.field private lastMenu:Ljava/lang/String;

.field private lastNav:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->preventClick:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 26
    .local p1, "buttons":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->buttons:Ljava/util/ArrayList;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->lastNav:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->lastMenu:Ljava/lang/String;

    .line 27
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->buttons:Ljava/util/ArrayList;

    .line 28
    return-void
.end method

.method static synthetic access$000(Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

    .prologue
    .line 15
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->buttons:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static preventClick()Z
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->preventClick:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public clearHighlight()V
    .locals 0

    .prologue
    .line 46
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->clearHighlight()V

    .line 47
    return-void
.end method

.method public clickButton(I)V
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 168
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI$1;

    invoke-direct {v0, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;I)V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 176
    return-void
.end method

.method public handleMenu(Ljava/lang/String;)V
    .locals 5
    .param p1, "mnuString"    # Ljava/lang/String;

    .prologue
    .line 134
    const-string v2, "QuickNavJSI"

    const-string v3, "THIS IS NOT THE METHOD YOU ARE LOOKING FOR"

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string v2, "QuickNavJSI"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HandleMenu: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    if-eqz p1, :cond_1

    :try_start_0
    const-string v2, "undefined"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 139
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->lastMenu:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 140
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 142
    .local v1, "mnuSettings":Lorg/json/JSONArray;
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 156
    :cond_0
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->lastMenu:Ljava/lang/String;

    .line 165
    .end local v1    # "mnuSettings":Lorg/json/JSONArray;
    :cond_1
    :goto_0
    return-void

    .line 158
    :cond_2
    const-string v2, "QuickNavJSI"

    const-string v3, "No updates needed for MENU"

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 162
    :catch_0
    move-exception v0

    .line 163
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "QuickNavJSI"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON Exception: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public handleNav(Ljava/lang/String;)V
    .locals 7
    .param p1, "navString"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    .line 85
    const-string v3, "QuickNavJSI"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HandleNav: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    if-eqz p1, :cond_5

    :try_start_0
    const-string v3, "undefined"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 89
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->lastNav:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 91
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 93
    .local v1, "navSettings":Lorg/json/JSONObject;
    const-string v3, "text"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 94
    .local v2, "text":Ljava/lang/String;
    if-eqz v2, :cond_3

    .line 95
    const-string v3, "home"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 96
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->hideMenuButton()V

    .line 106
    :goto_0
    const-string v3, "signout"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 107
    if-eqz v2, :cond_0

    .line 108
    const-string v3, "QuickNavJSI"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Signout: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    :cond_0
    const-string v3, "timeout"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    const-string v3, "QuickNavJSI"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Timeout: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :cond_1
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->lastNav:Ljava/lang/String;

    .line 131
    .end local v1    # "navSettings":Lorg/json/JSONObject;
    .end local v2    # "text":Ljava/lang/String;
    :goto_1
    return-void

    .line 98
    .restart local v1    # "navSettings":Lorg/json/JSONObject;
    .restart local v2    # "text":Ljava/lang/String;
    :cond_2
    const-string v3, "action"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->showBackButton(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 127
    .end local v1    # "navSettings":Lorg/json/JSONObject;
    .end local v2    # "text":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 128
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "QuickNavJSI"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p0, v6}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->hideBackButton(Z)V

    goto :goto_1

    .line 102
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v1    # "navSettings":Lorg/json/JSONObject;
    .restart local v2    # "text":Ljava/lang/String;
    :cond_3
    const/4 v3, 0x1

    :try_start_1
    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->hideBackButton(Z)V

    goto :goto_0

    .line 121
    .end local v1    # "navSettings":Lorg/json/JSONObject;
    .end local v2    # "text":Ljava/lang/String;
    :cond_4
    const-string v3, "QuickNavJSI"

    const-string v4, "No Updates Needed for NAV"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 124
    :cond_5
    const/4 v3, 0x1

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->hideBackButton(Z)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public hideBackButton(Z)V
    .locals 2
    .param p1, "authed"    # Z

    .prologue
    .line 79
    const-string v0, "QuickNavJSI"

    const-string v1, "Hiding Back Button!"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideBackButton()V

    .line 81
    return-void
.end method

.method public hideMenuButton()V
    .locals 0

    .prologue
    .line 42
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideMenu()V

    .line 43
    return-void
.end method

.method public highlightItem(Ljava/lang/String;)V
    .locals 6
    .param p1, "menuItemAction"    # Ljava/lang/String;

    .prologue
    .line 54
    const-string v3, "QuickNavJSI"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "menuItem: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    if-eqz p1, :cond_1

    .line 56
    const-string v3, "undefined"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "LogoutController"

    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 57
    const-string v3, "QuickNavJSI"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Need to highlight: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getMenuItems()Ljava/util/List;

    move-result-object v2

    .line 59
    .local v2, "menuItems":Ljava/util/List;, "Ljava/util/List<Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;>;"
    const-string v3, "gotoMenuPage(\'LoginController|index\');"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 60
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .line 61
    .local v1, "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    const-string v3, "QuickNavJSI"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Checking: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 63
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 70
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    .end local v2    # "menuItems":Ljava/util/List;, "Ljava/util/List<Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;>;"
    :cond_1
    return-void
.end method

.method public returnToHome()V
    .locals 2

    .prologue
    .line 183
    const-string v0, "QuickNavJSI"

    const-string v1, "in QuickNavJSI returnToHome"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->getInstance()Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->skipLanding()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->finish()V

    .line 191
    :goto_0
    return-void

    .line 189
    :cond_0
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->returnToHome()V

    goto :goto_0
.end method

.method public setHighlight(I)V
    .locals 0
    .param p1, "position"    # I

    .prologue
    .line 51
    return-void
.end method

.method public setPreventClick(Z)V
    .locals 1
    .param p1, "prevent"    # Z

    .prologue
    .line 31
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->preventClick:Ljava/lang/Boolean;

    .line 32
    if-nez p1, :cond_0

    .line 33
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->setTouchedAsPressed()V

    .line 35
    :cond_0
    return-void
.end method

.method public showBackButton(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;

    .prologue
    .line 73
    const-string v0, "QuickNavJSI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ShowNavButton: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showBackButton()V

    .line 75
    return-void
.end method
