.class public Lcom/facebook/orca/chatheads/a/b;
.super Ljava/lang/Object;
.source "MenuSherlockWrapper.java"

# interfaces
.implements Landroid/view/Menu;


# instance fields
.field private final a:Lcom/actionbarsherlock/a/a;

.field private final b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Lcom/actionbarsherlock/a/b;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/actionbarsherlock/a/a;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->b:Ljava/util/WeakHashMap;

    .line 24
    iput-object p1, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    .line 25
    return-void
.end method

.method private a(Lcom/actionbarsherlock/a/d;)Landroid/view/SubMenu;
    .locals 4

    .prologue
    .line 58
    new-instance v0, Lcom/facebook/orca/chatheads/a/c;

    invoke-direct {v0, p1}, Lcom/facebook/orca/chatheads/a/c;-><init>(Lcom/actionbarsherlock/a/d;)V

    .line 59
    invoke-interface {p1}, Lcom/actionbarsherlock/a/d;->q()Lcom/actionbarsherlock/a/b;

    move-result-object v1

    .line 60
    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    .line 61
    iget-object v3, p0, Lcom/facebook/orca/chatheads/a/b;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    return-object v0
.end method

.method private b(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;
    .locals 2

    .prologue
    .line 32
    new-instance v0, Lcom/facebook/orca/chatheads/a/a;

    invoke-direct {v0, p1}, Lcom/facebook/orca/chatheads/a/a;-><init>(Lcom/actionbarsherlock/a/b;)V

    .line 33
    iget-object v1, p0, Lcom/facebook/orca/chatheads/a/b;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    return-object v0
.end method


# virtual methods
.method public a(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 143
    if-nez p1, :cond_1

    .line 144
    const/4 v0, 0x0

    .line 152
    :cond_0
    :goto_0
    return-object v0

    .line 147
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    .line 148
    if-nez v0, :cond_0

    .line 152
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/a/b;->b(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;

    move-result-object v0

    goto :goto_0
.end method

.method public add(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->a(I)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->b(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIII)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/actionbarsherlock/a/a;->a(IIII)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->b(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/actionbarsherlock/a/a;->a(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->b(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->a(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->b(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
    .locals 10

    .prologue
    .line 88
    if-eqz p8, :cond_0

    .line 89
    move-object/from16 v0, p8

    array-length v1, v0

    new-array v9, v1, [Lcom/actionbarsherlock/a/b;

    .line 90
    iget-object v1, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-interface/range {v1 .. v9}, Lcom/actionbarsherlock/a/a;->a(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Lcom/actionbarsherlock/a/b;)I

    move-result v1

    .line 91
    const/4 v2, 0x0

    move-object/from16 v0, p8

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_1

    .line 92
    new-instance v4, Lcom/facebook/orca/chatheads/a/a;

    aget-object v5, v9, v2

    invoke-direct {v4, v5}, Lcom/facebook/orca/chatheads/a/a;-><init>(Lcom/actionbarsherlock/a/b;)V

    aput-object v4, p8, v2

    .line 91
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 95
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    const/4 v9, 0x0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-interface/range {v1 .. v9}, Lcom/actionbarsherlock/a/a;->a(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Lcom/actionbarsherlock/a/b;)I

    move-result v1

    .line 97
    :cond_1
    return v1
.end method

.method public addSubMenu(I)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->b(I)Lcom/actionbarsherlock/a/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->a(Lcom/actionbarsherlock/a/d;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIII)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/actionbarsherlock/a/a;->b(IIII)Lcom/actionbarsherlock/a/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->a(Lcom/actionbarsherlock/a/d;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/actionbarsherlock/a/a;->b(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->a(Lcom/actionbarsherlock/a/d;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->b(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->a(Lcom/actionbarsherlock/a/d;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/a;->a()V

    .line 114
    return-void
.end method

.method public close()V
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/a;->h()V

    .line 169
    return-void
.end method

.method public findItem(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->e(I)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    .line 139
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->a(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->h(I)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    .line 163
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/a/b;->a(Lcom/actionbarsherlock/a/b;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public hasVisibleItems()Z
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/a;->b()Z

    move-result v0

    return v0
.end method

.method public isShortcutKey(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/a/a;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public performIdentifierAction(II)Z
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/a/a;->b(II)Z

    move-result v0

    return v0
.end method

.method public performShortcut(ILandroid/view/KeyEvent;I)Z
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/actionbarsherlock/a/a;->a(ILandroid/view/KeyEvent;I)Z

    move-result v0

    return v0
.end method

.method public removeGroup(I)V
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->d(I)V

    .line 108
    return-void
.end method

.method public removeItem(I)V
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->c(I)V

    .line 103
    return-void
.end method

.method public setGroupCheckable(IZZ)V
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/actionbarsherlock/a/a;->a(IZZ)V

    .line 119
    return-void
.end method

.method public setGroupEnabled(IZ)V
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/a/a;->b(IZ)V

    .line 129
    return-void
.end method

.method public setGroupVisible(IZ)V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/a/a;->a(IZ)V

    .line 124
    return-void
.end method

.method public setQwertyMode(Z)V
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/a;->a(Z)V

    .line 189
    return-void
.end method

.method public size()I
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/orca/chatheads/a/b;->a:Lcom/actionbarsherlock/a/a;

    invoke-interface {v0}, Lcom/actionbarsherlock/a/a;->c()I

    move-result v0

    return v0
.end method
