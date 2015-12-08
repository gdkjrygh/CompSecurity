.class public Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
.super Ljava/lang/Object;
.source "MenuWrapper.java"

# interfaces
.implements Lcom/actionbarsherlock/view/Menu;


# instance fields
.field private final mNativeMap:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/MenuItem;",
            "Lcom/actionbarsherlock/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field private final mNativeMenu:Landroid/view/Menu;


# direct methods
.method public constructor <init>(Landroid/view/Menu;)V
    .locals 1
    .param p1, "nativeMenu"    # Landroid/view/Menu;

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    .line 19
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    .line 20
    return-void
.end method

.method private addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
    .locals 2
    .param p1, "nativeItem"    # Landroid/view/MenuItem;

    .prologue
    .line 27
    new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;

    invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;-><init>(Landroid/view/MenuItem;)V

    .line 28
    .local v0, "item":Lcom/actionbarsherlock/view/MenuItem;
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    return-object v0
.end method

.method private addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;
    .locals 4
    .param p1, "nativeSubMenu"    # Landroid/view/SubMenu;

    .prologue
    .line 53
    new-instance v2, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;

    invoke-direct {v2, p1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;-><init>(Landroid/view/SubMenu;)V

    .line 54
    .local v2, "subMenu":Lcom/actionbarsherlock/view/SubMenu;
    invoke-interface {p1}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    .line 55
    .local v1, "nativeItem":Landroid/view/MenuItem;
    invoke-interface {v2}, Lcom/actionbarsherlock/view/SubMenu;->getItem()Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 56
    .local v0, "item":Lcom/actionbarsherlock/view/MenuItem;
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    return-object v2
.end method


# virtual methods
.method public add(I)Lcom/actionbarsherlock/view/MenuItem;
    .locals 1
    .param p1, "titleRes"    # I

    .prologue
    .line 39
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->add(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIII)Lcom/actionbarsherlock/view/MenuItem;
    .locals 1
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "titleRes"    # I

    .prologue
    .line 49
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
    .locals 1
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 44
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Lcom/actionbarsherlock/view/MenuItem;)I
    .locals 23
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "caller"    # Landroid/content/ComponentName;
    .param p5, "specifics"    # [Landroid/content/Intent;
    .param p6, "intent"    # Landroid/content/Intent;
    .param p7, "flags"    # I
    .param p8, "outSpecificItems"    # [Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 83
    if-eqz p8, :cond_1

    .line 84
    move-object/from16 v0, p8

    array-length v2, v0

    new-array v10, v2, [Landroid/view/MenuItem;

    .line 85
    .local v10, "nativeOutItems":[Landroid/view/MenuItem;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-interface/range {v2 .. v10}, Landroid/view/Menu;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I

    move-result v22

    .line 86
    .local v22, "result":I
    const/16 v20, 0x0

    .local v20, "i":I
    move-object/from16 v0, p8

    array-length v0, v0

    move/from16 v21, v0

    .local v21, "length":I
    :goto_0
    move/from16 v0, v20

    move/from16 v1, v21

    if-lt v0, v1, :cond_0

    .line 92
    .end local v10    # "nativeOutItems":[Landroid/view/MenuItem;
    .end local v20    # "i":I
    .end local v21    # "length":I
    :goto_1
    return v22

    .line 87
    .restart local v10    # "nativeOutItems":[Landroid/view/MenuItem;
    .restart local v20    # "i":I
    .restart local v21    # "length":I
    :cond_0
    new-instance v2, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;

    aget-object v3, v10, v20

    invoke-direct {v2, v3}, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;-><init>(Landroid/view/MenuItem;)V

    aput-object v2, p8, v20

    .line 86
    add-int/lit8 v20, v20, 0x1

    goto :goto_0

    .line 90
    .end local v10    # "nativeOutItems":[Landroid/view/MenuItem;
    .end local v20    # "i":I
    .end local v21    # "length":I
    .end local v22    # "result":I
    :cond_1
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    const/16 v19, 0x0

    move/from16 v12, p1

    move/from16 v13, p2

    move/from16 v14, p3

    move-object/from16 v15, p4

    move-object/from16 v16, p5

    move-object/from16 v17, p6

    move/from16 v18, p7

    invoke-interface/range {v11 .. v19}, Landroid/view/Menu;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I

    move-result v22

    .restart local v22    # "result":I
    goto :goto_1
.end method

.method public addSubMenu(I)Lcom/actionbarsherlock/view/SubMenu;
    .locals 1
    .param p1, "titleRes"    # I

    .prologue
    .line 67
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(I)Landroid/view/SubMenu;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIII)Lcom/actionbarsherlock/view/SubMenu;
    .locals 1
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "titleRes"    # I

    .prologue
    .line 77
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
    .locals 1
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 72
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 62
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 115
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 116
    return-void
.end method

.method public close()V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->close()V

    .line 185
    return-void
.end method

.method public findItem(I)Lcom/actionbarsherlock/view/MenuItem;
    .locals 2
    .param p1, "id"    # I

    .prologue
    .line 154
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v1, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 155
    .local v0, "nativeItem":Landroid/view/MenuItem;
    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->findItem(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    return-object v1
.end method

.method public findItem(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
    .locals 2
    .param p1, "nativeItem"    # Landroid/view/MenuItem;

    .prologue
    .line 159
    if-nez p1, :cond_1

    .line 160
    const/4 v0, 0x0

    .line 168
    :cond_0
    :goto_0
    return-object v0

    .line 163
    :cond_1
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/view/MenuItem;

    .line 164
    .local v0, "wrapped":Lcom/actionbarsherlock/view/MenuItem;
    if-nez v0, :cond_0

    .line 168
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    goto :goto_0
.end method

.method public getItem(I)Lcom/actionbarsherlock/view/MenuItem;
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 178
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v1, p1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 179
    .local v0, "nativeItem":Landroid/view/MenuItem;
    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->findItem(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    return-object v1
.end method

.method public hasVisibleItems()Z
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 4

    .prologue
    .line 119
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 130
    :goto_0
    return-void

    .line 121
    :cond_0
    new-instance v2, Ljava/util/WeakHashMap;

    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Ljava/util/WeakHashMap;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 123
    .local v2, "menuMapCopy":Ljava/util/WeakHashMap;, "Ljava/util/WeakHashMap<Landroid/view/MenuItem;Lcom/actionbarsherlock/view/MenuItem;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v3}, Landroid/view/Menu;->size()I

    move-result v3

    if-lt v0, v3, :cond_1

    .line 128
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Ljava/util/WeakHashMap;->clear()V

    .line 129
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->putAll(Ljava/util/Map;)V

    goto :goto_0

    .line 124
    :cond_1
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v3, v0}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 125
    .local v1, "item":Landroid/view/MenuItem;
    iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/actionbarsherlock/view/MenuItem;

    invoke-virtual {v2, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public isShortcutKey(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 194
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->isShortcutKey(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public performIdentifierAction(II)Z
    .locals 1
    .param p1, "id"    # I
    .param p2, "flags"    # I

    .prologue
    .line 199
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->performIdentifierAction(II)Z

    move-result v0

    return v0
.end method

.method public performShortcut(ILandroid/view/KeyEvent;I)Z
    .locals 1
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;
    .param p3, "flags"    # I

    .prologue
    .line 189
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v0

    return v0
.end method

.method public removeGroup(I)V
    .locals 3
    .param p1, "groupId"    # I

    .prologue
    .line 103
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v2}, Landroid/view/Menu;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 109
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v2, p1}, Landroid/view/Menu;->removeGroup(I)V

    .line 110
    return-void

    .line 104
    :cond_0
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v2, v0}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 105
    .local v1, "item":Landroid/view/MenuItem;
    invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v2

    if-ne v2, p1, :cond_1

    .line 106
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public removeItem(I)V
    .locals 2
    .param p1, "id"    # I

    .prologue
    .line 97
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v1, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->removeItem(I)V

    .line 99
    return-void
.end method

.method public setGroupCheckable(IZZ)V
    .locals 1
    .param p1, "group"    # I
    .param p2, "checkable"    # Z
    .param p3, "exclusive"    # Z

    .prologue
    .line 134
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    .line 135
    return-void
.end method

.method public setGroupEnabled(IZ)V
    .locals 1
    .param p1, "group"    # I
    .param p2, "enabled"    # Z

    .prologue
    .line 144
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupEnabled(IZ)V

    .line 145
    return-void
.end method

.method public setGroupVisible(IZ)V
    .locals 1
    .param p1, "group"    # I
    .param p2, "visible"    # Z

    .prologue
    .line 139
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 140
    return-void
.end method

.method public setQwertyMode(Z)V
    .locals 1
    .param p1, "isQwerty"    # Z

    .prologue
    .line 204
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 205
    return-void
.end method

.method public size()I
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->size()I

    move-result v0

    return v0
.end method

.method public unwrap()Landroid/view/Menu;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;

    return-object v0
.end method
