.class public Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;
.super Ljava/lang/Object;
.source "MenuItemSingleton.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;
    }
.end annotation


# static fields
.field private static _instance:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;


# instance fields
.field private items:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->_instance:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->items:Ljava/util/ArrayList;

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->listener:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;

    .line 17
    return-void
.end method

.method static synthetic access$000(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    .prologue
    .line 9
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->items:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$100(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;)Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    .prologue
    .line 9
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->listener:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;

    return-object v0
.end method

.method public static getInstance()Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->_instance:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    return-object v0
.end method


# virtual methods
.method public addMenuItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V
    .locals 1
    .param p1, "item"    # Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .prologue
    .line 24
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$1;

    invoke-direct {v0, p0, p1}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$1;-><init>(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 34
    return-void
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 41
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$2;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$2;-><init>(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;)V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 50
    return-void
.end method

.method public getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;",
            ">;"
        }
    .end annotation

    .prologue
    .line 37
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->items:Ljava/util/ArrayList;

    return-object v0
.end method

.method public registerListener(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;

    .prologue
    .line 53
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->listener:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;

    .line 54
    return-void
.end method
