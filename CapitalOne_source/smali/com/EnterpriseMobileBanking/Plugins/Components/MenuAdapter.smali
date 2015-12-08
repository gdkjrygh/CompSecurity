.class public Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;
.super Landroid/widget/ArrayAdapter;
.source "MenuAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;",
        ">;"
    }
.end annotation


# instance fields
.field private inflater:Landroid/view/LayoutInflater;

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/LayoutInflater;Ljava/util/List;)V
    .locals 2
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/LayoutInflater;",
            "Ljava/util/List",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p3, "list":Ljava/util/List;, "Ljava/util/List<Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;>;"
    const/4 v1, 0x0

    .line 18
    const v0, 0x1090003

    invoke-direct {p0, p1, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 14
    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;->list:Ljava/util/List;

    .line 15
    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 20
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 22
    iput-object p3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;->list:Ljava/util/List;

    .line 24
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 27
    move-object v1, p2

    .line 30
    .local v1, "row":Landroid/view/View;
    const/4 v0, 0x0

    .line 32
    .local v0, "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    if-nez v1, :cond_0

    .line 34
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f030014

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 36
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;

    .end local v0    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    invoke-direct {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;-><init>(Landroid/view/View;)V

    .line 37
    .restart local v0    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 45
    :goto_0
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;->list:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    invoke-virtual {v0, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->populate(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 47
    return-object v1

    .line 42
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;

    .restart local v0    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    goto :goto_0
.end method
