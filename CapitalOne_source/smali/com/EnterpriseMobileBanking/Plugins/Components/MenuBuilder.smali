.class public Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;
.super Landroid/widget/ArrayAdapter;
.source "MenuBuilder.java"


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


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/LayoutInflater;Ljava/util/List;)V
    .locals 1
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
    .line 17
    .local p3, "list":Ljava/util/List;, "Ljava/util/List<Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;>;"
    const v0, 0x1090003

    invoke-direct {p0, p1, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;->inflater:Landroid/view/LayoutInflater;

    .line 19
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;->inflater:Landroid/view/LayoutInflater;

    .line 21
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 24
    move-object v1, p2

    .line 26
    .local v1, "row":Landroid/view/View;
    const/4 v0, 0x0

    .line 28
    .local v0, "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    if-nez v1, :cond_0

    .line 30
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f030014

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 32
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;

    .end local v0    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;-><init>(Landroid/view/View;Landroid/content/Context;)V

    .line 33
    .restart local v0    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 41
    :goto_0
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    invoke-virtual {v0, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;->populate(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 43
    return-object v1

    .line 38
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;

    .restart local v0    # "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItemCache;
    goto :goto_0
.end method
