.class public Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
.super Ljava/lang/Object;
.source "MenuItemCache.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "MenuItemCache"

.field private static imageMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static indicatorColor:I


# instance fields
.field private buttonLayout:Landroid/widget/LinearLayout;

.field private context:Landroid/content/Context;

.field private icon:Landroid/widget/ImageView;

.field private menuIndicator:Landroid/view/View;

.field private rightIcon:Landroid/widget/ImageView;

.field private text:Landroid/widget/TextView;

.field private title:Landroid/widget/TextView;

.field private titleLayout:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 31
    const/high16 v0, -0x80000000

    sput v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->indicatorColor:I

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    .line 40
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "accounts"

    const-string v2, "menuicon_bank"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "transfer"

    const-string v2, "menuicon_transfers"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "rdc"

    const-string v2, "menuicon_deposit"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "billpay"

    const-string v2, "menuicon_paybill"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "p2p"

    const-string v2, "menuicon_p2p"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "card"

    const-string v2, "menuicon_cards"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "contact"

    const-string v2, "menuicon_contact"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "estatements"

    const-string v2, "menuicon_statements"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "atm"

    const-string v2, "menuicon_atm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "bank"

    const-string v2, "menuicon_parthenon"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "brokerage"

    const-string v2, "menuicon_sharebuilder"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    const-string v1, "products"

    const-string v2, "menuicon_products"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    return-void
.end method

.method constructor <init>(Landroid/view/View;)V
    .locals 2
    .param p1, "row"    # Landroid/view/View;

    .prologue
    const/4 v0, 0x0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->icon:Landroid/widget/ImageView;

    .line 24
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->title:Landroid/widget/TextView;

    .line 25
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->text:Landroid/widget/TextView;

    .line 26
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->titleLayout:Landroid/widget/LinearLayout;

    .line 27
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->buttonLayout:Landroid/widget/LinearLayout;

    .line 28
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->menuIndicator:Landroid/view/View;

    .line 29
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->rightIcon:Landroid/widget/ImageView;

    .line 36
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->context:Landroid/content/Context;

    .line 56
    sget v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->indicatorColor:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070023

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    sput v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->indicatorColor:I

    .line 59
    :cond_0
    const v0, 0x7f0800aa

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->icon:Landroid/widget/ImageView;

    .line 60
    const v0, 0x7f0800a7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->title:Landroid/widget/TextView;

    .line 61
    const v0, 0x7f0800ab

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->text:Landroid/widget/TextView;

    .line 62
    const v0, 0x7f0800a6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->titleLayout:Landroid/widget/LinearLayout;

    .line 63
    const v0, 0x7f0800a8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->buttonLayout:Landroid/widget/LinearLayout;

    .line 64
    const v0, 0x7f0800a9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->menuIndicator:Landroid/view/View;

    .line 65
    const v0, 0x7f0800ac

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->rightIcon:Landroid/widget/ImageView;

    .line 66
    return-void
.end method

.method constructor <init>(Landroid/view/View;Landroid/content/Context;)V
    .locals 0
    .param p1, "row"    # Landroid/view/View;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 69
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;-><init>(Landroid/view/View;)V

    .line 70
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->context:Landroid/content/Context;

    .line 71
    return-void
.end method

.method private getResourceId(Ljava/lang/String;)I
    .locals 6
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 76
    const/4 v3, -0x1

    .line 77
    .local v3, "response":I
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".png"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 78
    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x4

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 80
    :cond_0
    sget-object v4, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    invoke-interface {v4, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 81
    sget-object v4, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->imageMap:Ljava/util/Map;

    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .end local p1    # "name":Ljava/lang/String;
    check-cast p1, Ljava/lang/String;

    .line 85
    .restart local p1    # "name":Ljava/lang/String;
    :cond_1
    :try_start_0
    const-class v2, Lcom/konylabs/capitalone/R$drawable;

    .line 86
    .local v2, "res":Ljava/lang/Class;, "Ljava/lang/Class<Lcom/konylabs/capitalone/R$drawable;>;"
    invoke-virtual {v2, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 87
    .local v1, "field":Ljava/lang/reflect/Field;
    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    .line 94
    .end local v1    # "field":Ljava/lang/reflect/Field;
    .end local v2    # "res":Ljava/lang/Class;, "Ljava/lang/Class<Lcom/konylabs/capitalone/R$drawable;>;"
    :goto_0
    return v3

    .line 88
    :catch_0
    move-exception v0

    .line 91
    .local v0, "e":Ljava/lang/Exception;
    const/4 v3, -0x1

    goto :goto_0
.end method


# virtual methods
.method populate(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V
    .locals 6
    .param p1, "item"    # Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .prologue
    const v5, 0x7f09012f

    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 98
    if-eqz p1, :cond_0

    .line 101
    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 102
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->title:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->titleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    .line 104
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->titleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 105
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->buttonLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 170
    :cond_0
    :goto_0
    return-void

    .line 109
    :cond_1
    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 116
    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Freeze"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 117
    const/4 v1, 0x1

    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->setIsFreezeCardFlow(Z)V

    .line 121
    :goto_1
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->menuIndicator:Landroid/view/View;

    sget v2, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->indicatorColor:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 123
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v1

    const v2, 0x7f080080

    if-ne v1, v2, :cond_2

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 124
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v1}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/capitalone/mobile/banking/session/SessionManager;->resetTimeout()V

    .line 127
    :cond_2
    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Deposit Checks"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    const-string v2, "terms"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 128
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setVisibility(I)V

    .line 134
    :cond_3
    :goto_2
    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getImage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->getResourceId(Ljava/lang/String;)I

    move-result v0

    .line 136
    .local v0, "imgId":I
    const/4 v1, -0x1

    if-le v0, v1, :cond_7

    .line 137
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->icon:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 142
    :goto_3
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->text:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->buttonLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_4

    .line 147
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->buttonLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 148
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->titleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 151
    :cond_4
    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->context:Landroid/content/Context;

    const v3, 0x7f09010a

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 153
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->rightIcon:Landroid/widget/ImageView;

    const v2, 0x7f0200ef

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 155
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->text:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->text:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->context:Landroid/content/Context;

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->context:Landroid/content/Context;

    const v4, 0x7f090130

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 119
    .end local v0    # "imgId":I
    :cond_5
    invoke-static {v3}, Lcom/EnterpriseMobileBanking/AppHelper;->setIsFreezeCardFlow(Z)V

    goto/16 :goto_1

    .line 131
    :cond_6
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->menuIndicator:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    goto/16 :goto_2

    .line 139
    .restart local v0    # "imgId":I
    :cond_7
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->icon:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_3

    .line 161
    :cond_8
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->rightIcon:Landroid/widget/ImageView;

    const v2, 0x7f0200eb

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 163
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->text:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->text:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->context:Landroid/content/Context;

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_0
.end method
