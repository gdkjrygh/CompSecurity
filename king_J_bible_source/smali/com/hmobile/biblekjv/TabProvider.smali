.class public Lcom/hmobile/biblekjv/TabProvider;
.super Lcom/hmobile/tab/TabHostProvider;
.source "TabProvider.java"


# instance fields
.field private Bible:Lcom/hmobile/tab/Tab;

.field private BookMarks:Lcom/hmobile/tab/Tab;

.field private MostLikeShare:Lcom/hmobile/tab/Tab;

.field private Settings:Lcom/hmobile/tab/Tab;

.field private Today:Lcom/hmobile/tab/Tab;

.field private tabView:Lcom/hmobile/tab/TabView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "context"    # Landroid/app/Activity;

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/hmobile/tab/TabHostProvider;-><init>(Landroid/app/Activity;)V

    .line 21
    return-void
.end method


# virtual methods
.method public getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;
    .locals 8
    .param p1, "category"    # Ljava/lang/String;

    .prologue
    const v7, 0x7f020099

    const v6, 0x7f02006e

    const v5, 0x7f020065

    const v3, 0x7f020062

    const v4, 0x7f02000c

    .line 25
    new-instance v0, Lcom/hmobile/tab/TabView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/hmobile/tab/TabView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    .line 26
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    sget-object v1, Lcom/hmobile/tab/TabView$Orientation;->BOTTOM:Lcom/hmobile/tab/TabView$Orientation;

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->setOrientation(Lcom/hmobile/tab/TabView$Orientation;)V

    .line 27
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    const v1, 0x7f0200a3

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->setBackgroundID(I)V

    .line 28
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    const v1, 0x7f020097

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->setSeparatorID(I)V

    .line 30
    new-instance v0, Lcom/hmobile/tab/Tab;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-string v2, "Today"

    invoke-direct {v0, v1, v2}, Lcom/hmobile/tab/Tab;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Today:Lcom/hmobile/tab/Tab;

    .line 31
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Today:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v3}, Lcom/hmobile/tab/Tab;->setIcon(I)V

    .line 32
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Today:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v3}, Lcom/hmobile/tab/Tab;->setIconSelected(I)V

    .line 33
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Today:Lcom/hmobile/tab/Tab;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-class v3, Lcom/hmobile/biblekjv/TodayActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/Tab;->setIntent(Landroid/content/Intent;)V

    .line 35
    new-instance v0, Lcom/hmobile/tab/Tab;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-string v2, "MostLikeShare"

    invoke-direct {v0, v1, v2}, Lcom/hmobile/tab/Tab;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->MostLikeShare:Lcom/hmobile/tab/Tab;

    .line 36
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->MostLikeShare:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v6}, Lcom/hmobile/tab/Tab;->setIcon(I)V

    .line 37
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->MostLikeShare:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v6}, Lcom/hmobile/tab/Tab;->setIconSelected(I)V

    .line 39
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->MostLikeShare:Lcom/hmobile/tab/Tab;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-class v3, Lcom/hmobile/biblekjv/FavoritesActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/Tab;->setIntent(Landroid/content/Intent;)V

    .line 41
    new-instance v0, Lcom/hmobile/tab/Tab;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-string v2, "Bible"

    invoke-direct {v0, v1, v2}, Lcom/hmobile/tab/Tab;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Bible:Lcom/hmobile/tab/Tab;

    .line 42
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Bible:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v5}, Lcom/hmobile/tab/Tab;->setIcon(I)V

    .line 43
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Bible:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v5}, Lcom/hmobile/tab/Tab;->setIconSelected(I)V

    .line 44
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Bible:Lcom/hmobile/tab/Tab;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-class v3, Lcom/hmobile/biblekjv/SelectActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/Tab;->setIntent(Landroid/content/Intent;)V

    .line 46
    new-instance v0, Lcom/hmobile/tab/Tab;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-string v2, "Bookmarks"

    invoke-direct {v0, v1, v2}, Lcom/hmobile/tab/Tab;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->BookMarks:Lcom/hmobile/tab/Tab;

    .line 47
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->BookMarks:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v4}, Lcom/hmobile/tab/Tab;->setIcon(I)V

    .line 48
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->BookMarks:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v4}, Lcom/hmobile/tab/Tab;->setIconSelected(I)V

    .line 49
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->BookMarks:Lcom/hmobile/tab/Tab;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-class v3, Lcom/hmobile/biblekjv/BookMarkesActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/Tab;->setIntent(Landroid/content/Intent;)V

    .line 51
    new-instance v0, Lcom/hmobile/tab/Tab;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-string v2, "Settings"

    invoke-direct {v0, v1, v2}, Lcom/hmobile/tab/Tab;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Settings:Lcom/hmobile/tab/Tab;

    .line 52
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Settings:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v7}, Lcom/hmobile/tab/Tab;->setIcon(I)V

    .line 53
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Settings:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v7}, Lcom/hmobile/tab/Tab;->setIconSelected(I)V

    .line 54
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->Settings:Lcom/hmobile/tab/Tab;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/hmobile/biblekjv/TabProvider;->context:Landroid/app/Activity;

    const-class v3, Lcom/hmobile/biblekjv/SettingsActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/Tab;->setIntent(Landroid/content/Intent;)V

    .line 57
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->Today:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->addTab(Lcom/hmobile/tab/Tab;)V

    .line 58
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->MostLikeShare:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->addTab(Lcom/hmobile/tab/Tab;)V

    .line 59
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->Bible:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->addTab(Lcom/hmobile/tab/Tab;)V

    .line 60
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->BookMarks:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->addTab(Lcom/hmobile/tab/Tab;)V

    .line 61
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TabProvider;->Settings:Lcom/hmobile/tab/Tab;

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->addTab(Lcom/hmobile/tab/Tab;)V

    .line 63
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    const v1, 0x7f030033

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabView;->setCurrentView(I)V

    .line 64
    iget-object v0, p0, Lcom/hmobile/biblekjv/TabProvider;->tabView:Lcom/hmobile/tab/TabView;

    return-object v0
.end method
