.class public Lcom/hmobile/biblekjv/FavoritesActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "FavoritesActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;,
        Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;
    }
.end annotation


# instance fields
.field private btnFavorite:Landroid/widget/Button;

.field favoriteAdapter:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

.field private isbookmark:Z

.field private lstFavorites:Landroid/widget/ListView;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field private tabView:Lcom/hmobile/tab/TabView;

.field private txtNoBookmark:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->isbookmark:Z

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->favoriteAdapter:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    .line 31
    return-void
.end method


# virtual methods
.method public LoadViewForFavorite()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 106
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->txtNoBookmark:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->lstFavorites:Landroid/widget/ListView;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 108
    invoke-static {}, Lcom/hmobile/model/FavoriteInfo;->getAllLocalFavorite()Ljava/util/ArrayList;

    move-result-object v0

    .line 109
    .local v0, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/FavoriteInfo;>;"
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 111
    new-instance v1, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    invoke-direct {v1, p0, v0}, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;-><init>(Lcom/hmobile/biblekjv/FavoritesActivity;Ljava/util/ArrayList;)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->favoriteAdapter:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    .line 112
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->lstFavorites:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->favoriteAdapter:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 118
    :goto_0
    return-void

    .line 114
    :cond_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->lstFavorites:Landroid/widget/ListView;

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setVisibility(I)V

    .line 115
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->txtNoBookmark:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 116
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->txtNoBookmark:Landroid/widget/TextView;

    const v2, 0x7f07005d

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method public getDate(J)Ljava/lang/String;
    .locals 3
    .param p1, "milliSeconds"    # J

    .prologue
    .line 315
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "MMM/dd"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 316
    .local v1, "formatter":Ljava/text/DateFormat;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 317
    .local v0, "calendar":Ljava/util/Calendar;
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 318
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 306
    iget-object v0, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->btnFavorite:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 307
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/FavoritesActivity;->LoadViewForFavorite()V

    .line 312
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v3, 0x1

    .line 47
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 48
    new-instance v0, Lcom/hmobile/biblekjv/TabProvider;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/TabProvider;-><init>(Landroid/app/Activity;)V

    .line 49
    .local v0, "tabProvider":Lcom/hmobile/tab/TabHostProvider;
    const-string v1, "main"

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabHostProvider;->getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->tabView:Lcom/hmobile/tab/TabView;

    .line 50
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->tabView:Lcom/hmobile/tab/TabView;

    const v2, 0x7f03001d

    invoke-virtual {v1, v2}, Lcom/hmobile/tab/TabView;->setCurrentView(I)V

    .line 51
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->tabView:Lcom/hmobile/tab/TabView;

    invoke-virtual {v1, v3}, Lcom/hmobile/tab/TabView;->render(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/FavoritesActivity;->setContentView(Landroid/view/View;)V

    .line 55
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 58
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    const v2, 0x7f070092

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/FavoritesActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 60
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v2, "/FavoritesActivity"

    invoke-virtual {v1, v2}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 62
    const v1, 0x7f0e009c

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/FavoritesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->lstFavorites:Landroid/widget/ListView;

    .line 64
    const v1, 0x7f0e009b

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/FavoritesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->btnFavorite:Landroid/widget/Button;

    .line 65
    const v1, 0x7f0e0062

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/FavoritesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->txtNoBookmark:Landroid/widget/TextView;

    .line 69
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->btnFavorite:Landroid/widget/Button;

    .line 70
    const v2, 0x7f0700b8

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/FavoritesActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 69
    invoke-virtual {p0, v1, v2}, Lcom/hmobile/biblekjv/FavoritesActivity;->setFontStyleRoboto(Landroid/widget/Button;Ljava/lang/String;)V

    .line 73
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->btnFavorite:Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity;->btnFavorite:Landroid/widget/Button;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 77
    sget-boolean v1, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v1, :cond_0

    .line 78
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/FavoritesActivity;->addAdView()V

    .line 82
    :goto_0
    return-void

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/FavoritesActivity;->hideAdView()V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 86
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onResume()V

    .line 87
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/FavoritesActivity;->LoadViewForFavorite()V

    .line 88
    return-void
.end method
