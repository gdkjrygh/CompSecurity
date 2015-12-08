.class public Lcom/worklight/androidgap/plugin/WLOptionsMenu;
.super Ljava/lang/Object;
.source "WLOptionsMenu.java"


# instance fields
.field private activity:Lcom/worklight/androidgap/WLDroidGap;

.field private hasChanged:Z

.field private isEnabled:Z

.field private isInit:Z

.field private isVisible:Z

.field private itemIndexer:I

.field private items:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/worklight/androidgap/plugin/WLMenuItem;",
            ">;"
        }
    .end annotation
.end field

.field private skinName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/worklight/androidgap/WLDroidGap;)V
    .locals 2
    .param p1, "activity"    # Lcom/worklight/androidgap/WLDroidGap;

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isInit:Z

    .line 29
    iput-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isEnabled:Z

    .line 30
    iput-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isVisible:Z

    .line 31
    iput-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->hasChanged:Z

    .line 32
    iput v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->itemIndexer:I

    .line 33
    iput-object v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->skinName:Ljava/lang/String;

    .line 34
    iput-object v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->activity:Lcom/worklight/androidgap/WLDroidGap;

    .line 36
    iput-object v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    .line 40
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->activity:Lcom/worklight/androidgap/WLDroidGap;

    .line 41
    return-void
.end method

.method private getItemByJavaScriptId(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/WLMenuItem;
    .locals 4
    .param p1, "javascriptId"    # Ljava/lang/String;

    .prologue
    .line 149
    const/4 v0, 0x0

    .line 150
    .local v0, "item":Lcom/worklight/androidgap/plugin/WLMenuItem;
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 156
    :goto_0
    return-object v0

    .line 150
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/worklight/androidgap/plugin/WLMenuItem;

    .line 151
    .local v1, "tempItem":Lcom/worklight/androidgap/plugin/WLMenuItem;
    invoke-virtual {v1}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getJavaScriptId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 152
    move-object v0, v1

    .line 153
    goto :goto_0
.end method

.method private setChanged()V
    .locals 1

    .prologue
    .line 160
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->hasChanged:Z

    .line 161
    return-void
.end method


# virtual methods
.method public addItem(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/worklight/androidgap/plugin/WLMenuItem;
    .locals 7
    .param p1, "javascriptId"    # Ljava/lang/String;
    .param p2, "javascriptCallback"    # Ljava/lang/String;
    .param p3, "title"    # Ljava/lang/String;
    .param p4, "imagePath"    # Ljava/lang/String;
    .param p5, "isEnabled"    # Z

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->getItemByJavaScriptId(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/WLMenuItem;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Android menu item id \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' already exists."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    .line 61
    const/4 v0, 0x0

    .line 71
    :goto_0
    return-object v0

    .line 64
    :cond_0
    iget v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->itemIndexer:I

    .line 65
    .local v1, "id":I
    iget v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->itemIndexer:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->itemIndexer:I

    .line 67
    new-instance v0, Lcom/worklight/androidgap/plugin/WLMenuItem;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/worklight/androidgap/plugin/WLMenuItem;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 68
    .local v0, "b":Lcom/worklight/androidgap/plugin/WLMenuItem;
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->setChanged()V

    goto :goto_0
.end method

.method public getItem(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/WLMenuItem;
    .locals 3
    .param p1, "javascriptId"    # Ljava/lang/String;

    .prologue
    .line 122
    invoke-direct {p0, p1}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->getItemByJavaScriptId(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/WLMenuItem;

    move-result-object v0

    .line 123
    .local v0, "btn":Lcom/worklight/androidgap/plugin/WLMenuItem;
    if-nez v0, :cond_0

    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Android menu item id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " doesn\'t exist"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    .line 126
    :cond_0
    return-object v0
.end method

.method public getItemById(I)Lcom/worklight/androidgap/plugin/WLMenuItem;
    .locals 3
    .param p1, "id"    # I

    .prologue
    .line 117
    iget-object v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/worklight/androidgap/plugin/WLMenuItem;

    .line 118
    .local v0, "btn":Lcom/worklight/androidgap/plugin/WLMenuItem;
    return-object v0
.end method

.method public getItems()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/worklight/androidgap/plugin/WLMenuItem;",
            ">;"
        }
    .end annotation

    .prologue
    .line 106
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 107
    .local v0, "buttonList":Ljava/util/List;, "Ljava/util/List<Lcom/worklight/androidgap/plugin/WLMenuItem;>;"
    new-instance v1, Lcom/worklight/androidgap/plugin/WLOptionsMenu$1;

    invoke-direct {v1, p0}, Lcom/worklight/androidgap/plugin/WLOptionsMenu$1;-><init>(Lcom/worklight/androidgap/plugin/WLOptionsMenu;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 113
    return-object v0
.end method

.method public getSkinName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->skinName:Ljava/lang/String;

    return-object v0
.end method

.method public hasChanged()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 130
    iget-boolean v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->hasChanged:Z

    if-eqz v2, :cond_0

    .line 138
    :goto_0
    return v1

    .line 133
    :cond_0
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 138
    const/4 v1, 0x0

    goto :goto_0

    .line 133
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/worklight/androidgap/plugin/WLMenuItem;

    .line 134
    .local v0, "b":Lcom/worklight/androidgap/plugin/WLMenuItem;
    invoke-virtual {v0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->hasChanged()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0
.end method

.method public init()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 44
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->activity:Lcom/worklight/androidgap/WLDroidGap;

    const-string v1, "wlSkinName"

    invoke-static {v0, v1}, Lcom/worklight/common/WLUtils;->readWLPref(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->skinName:Ljava/lang/String;

    .line 45
    iput-boolean v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isVisible:Z

    .line 46
    iput-boolean v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isEnabled:Z

    .line 47
    iput-boolean v3, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->hasChanged:Z

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    .line 49
    iput v3, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->itemIndexer:I

    .line 50
    iput-boolean v2, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isInit:Z

    .line 51
    return-void
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isEnabled:Z

    return v0
.end method

.method public isInit()Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isInit:Z

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .prologue
    .line 102
    iget-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isVisible:Z

    return v0
.end method

.method public removeItem(Ljava/lang/String;)V
    .locals 3
    .param p1, "javascriptId"    # Ljava/lang/String;

    .prologue
    .line 75
    invoke-virtual {p0, p1}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->getItem(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/WLMenuItem;

    move-result-object v0

    .line 76
    .local v0, "btn":Lcom/worklight/androidgap/plugin/WLMenuItem;
    if-eqz v0, :cond_0

    .line 77
    iget-object v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->setChanged()V

    .line 80
    :cond_0
    return-void
.end method

.method public removeItems()V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 84
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->setChanged()V

    .line 85
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0
    .param p1, "isEnabled"    # Z

    .prologue
    .line 88
    iput-boolean p1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isEnabled:Z

    .line 89
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->setChanged()V

    .line 90
    return-void
.end method

.method public setVisible(Z)V
    .locals 0
    .param p1, "isVisible"    # Z

    .prologue
    .line 97
    iput-boolean p1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isVisible:Z

    .line 98
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->setChanged()V

    .line 99
    return-void
.end method

.method public unsetChanged()V
    .locals 3

    .prologue
    .line 142
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->hasChanged:Z

    .line 143
    iget-object v1, p0, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->items:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 146
    return-void

    .line 143
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/worklight/androidgap/plugin/WLMenuItem;

    .line 144
    .local v0, "b":Lcom/worklight/androidgap/plugin/WLMenuItem;
    invoke-virtual {v0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->unsetChanged()V

    goto :goto_0
.end method
