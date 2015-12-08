.class Landroid/support/v7/internal/view/menu/MenuWrapperICS;
.super Landroid/support/v7/internal/view/menu/BaseMenuWrapper;
.source "MenuWrapperICS.java"

# interfaces
.implements Landroid/support/v4/internal/view/SupportMenu;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/internal/view/menu/BaseMenuWrapper",
        "<",
        "Landroid/view/Menu;",
        ">;",
        "Landroid/support/v4/internal/view/SupportMenu;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/view/Menu;)V
    .locals 0
    .param p1, "object"    # Landroid/view/Menu;

    .prologue
    .line 30
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;-><init>(Ljava/lang/Object;)V

    .line 31
    return-void
.end method


# virtual methods
.method public add(I)Landroid/view/MenuItem;
    .locals 1
    .param p1, "titleRes"    # I

    .prologue
    .line 40
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->add(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIII)Landroid/view/MenuItem;
    .locals 1
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "titleRes"    # I

    .prologue
    .line 50
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 45
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 35
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
    .locals 13
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "caller"    # Landroid/content/ComponentName;
    .param p5, "specifics"    # [Landroid/content/Intent;
    .param p6, "intent"    # Landroid/content/Intent;
    .param p7, "flags"    # I
    .param p8, "outSpecificItems"    # [Landroid/view/MenuItem;

    .prologue
    .line 77
    const/4 v9, 0x0

    .line 78
    .local v9, "items":[Landroid/view/MenuItem;
    if-eqz p8, :cond_0

    .line 79
    move-object/from16 v0, p8

    array-length v1, v0

    new-array v9, v1, [Landroid/view/MenuItem;

    .line 82
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v1, Landroid/view/Menu;

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-interface/range {v1 .. v9}, Landroid/view/Menu;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I

    move-result v11

    .line 85
    .local v11, "result":I
    if-eqz v9, :cond_1

    .line 86
    const/4 v10, 0x0

    .local v10, "i":I
    array-length v12, v9

    .local v12, "z":I
    :goto_0
    if-ge v10, v12, :cond_1

    .line 87
    aget-object v1, v9, v10

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v1

    aput-object v1, p8, v10

    .line 86
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 91
    .end local v10    # "i":I
    .end local v12    # "z":I
    :cond_1
    return v11
.end method

.method public addSubMenu(I)Landroid/view/SubMenu;
    .locals 1
    .param p1, "titleRes"    # I

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(I)Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIII)Landroid/view/SubMenu;
    .locals 1
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "titleRes"    # I

    .prologue
    .line 70
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1
    .param p1, "groupId"    # I
    .param p2, "itemId"    # I
    .param p3, "order"    # I
    .param p4, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 65
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 108
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->internalClear()V

    .line 109
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 110
    return-void
.end method

.method public close()V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->close()V

    .line 150
    return-void
.end method

.method public findItem(I)Landroid/view/MenuItem;
    .locals 1
    .param p1, "id"    # I

    .prologue
    .line 134
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Landroid/view/MenuItem;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 144
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public hasVisibleItems()Z
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v0

    return v0
.end method

.method public isShortcutKey(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 159
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->isShortcutKey(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public performIdentifierAction(II)Z
    .locals 1
    .param p1, "id"    # I
    .param p2, "flags"    # I

    .prologue
    .line 164
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

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
    .line 154
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v0

    return v0
.end method

.method public removeGroup(I)V
    .locals 1
    .param p1, "groupId"    # I

    .prologue
    .line 102
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->internalRemoveGroup(I)V

    .line 103
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->removeGroup(I)V

    .line 104
    return-void
.end method

.method public removeItem(I)V
    .locals 1
    .param p1, "id"    # I

    .prologue
    .line 96
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->internalRemoveItem(I)V

    .line 97
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->removeItem(I)V

    .line 98
    return-void
.end method

.method public setGroupCheckable(IZZ)V
    .locals 1
    .param p1, "group"    # I
    .param p2, "checkable"    # Z
    .param p3, "exclusive"    # Z

    .prologue
    .line 114
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    .line 115
    return-void
.end method

.method public setGroupEnabled(IZ)V
    .locals 1
    .param p1, "group"    # I
    .param p2, "enabled"    # Z

    .prologue
    .line 124
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupEnabled(IZ)V

    .line 125
    return-void
.end method

.method public setGroupVisible(IZ)V
    .locals 1
    .param p1, "group"    # I
    .param p2, "visible"    # Z

    .prologue
    .line 119
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 120
    return-void
.end method

.method public setQwertyMode(Z)V
    .locals 1
    .param p1, "isQwerty"    # Z

    .prologue
    .line 169
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 170
    return-void
.end method

.method public size()I
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->size()I

    move-result v0

    return v0
.end method
