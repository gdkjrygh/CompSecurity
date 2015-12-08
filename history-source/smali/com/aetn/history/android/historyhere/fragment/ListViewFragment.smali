.class public Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;
.super Landroid/support/v4/app/ListFragment;
.source "ListViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;,
        Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private mContext:Landroid/content/Context;

.field mFavoritesChangedListener:Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;

.field private mHeightOfListRow:I

.field private mListView:Landroid/widget/ListView;

.field private mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

.field private mRightMenu:Landroid/view/ViewGroup;

.field private mTourHeader:Landroid/view/ViewGroup;

.field private mapButton:Landroid/view/View;

.field private menuButton:Landroid/view/View;

.field private poiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private poiListAdapter:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

.field private searchButton:Landroid/view/View;

.field private suggestButton:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;-><init>()V

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    .line 71
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$1;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mFavoritesChangedListener:Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;

    .line 332
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    return-object v0
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;Landroid/view/View;)I
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;
    .param p1, "x1"    # Landroid/view/View;

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getTopPositionOfView(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method private getTopPositionOfView(Landroid/view/View;)I
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 326
    const/4 v1, 0x2

    new-array v0, v1, [I

    .line 327
    .local v0, "coords":[I
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 329
    const/4 v1, 0x1

    aget v1, v0, v1

    return v1
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    const-string v1, "setListeners"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mapButton:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$2;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->menuButton:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$3;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->searchButton:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$4;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$4;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->suggestButton:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$5;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$5;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    return-void
.end method


# virtual methods
.method public loadCurrentData()V
    .locals 8

    .prologue
    const/16 v7, 0x8

    .line 169
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    const-string v4, "loadCurrentData"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 171
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIListWithExtraRow()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiList:Ljava/util/ArrayList;

    .line 190
    :goto_0
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiList:Ljava/util/ArrayList;

    if-nez v3, :cond_0

    .line 191
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiList:Ljava/util/ArrayList;

    .line 194
    :cond_0
    new-instance v3, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mContext:Landroid/content/Context;

    const v5, 0x7f030038

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiList:Ljava/util/ArrayList;

    invoke-direct {v3, p0, v4, v5, v6}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;Landroid/content/Context;ILjava/util/ArrayList;)V

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiListAdapter:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    .line 195
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiListAdapter:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 196
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v3

    if-nez v3, :cond_1

    .line 197
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mRightMenu:Landroid/view/ViewGroup;

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 199
    :cond_1
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 200
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mTourHeader:Landroid/view/ViewGroup;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 204
    :goto_1
    return-void

    .line 172
    :cond_2
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeFavorites()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 174
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->hasFavorites(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 175
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentFavoritesListFromDB(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiList:Ljava/util/ArrayList;

    goto :goto_0

    .line 177
    :cond_3
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIListWithExtraRow()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiList:Ljava/util/ArrayList;

    goto :goto_0

    .line 180
    :cond_4
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourListWithExtraRow()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->poiList:Ljava/util/ArrayList;

    .line 181
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v1

    .line 183
    .local v1, "detail":Lcom/aetn/history/android/historyhere/model/POI;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mTourHeader:Landroid/view/ViewGroup;

    const v4, 0x7f0a00e5

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 184
    .local v2, "title":Landroid/widget/TextView;
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POI;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mTourHeader:Landroid/view/ViewGroup;

    const v4, 0x7f0a00e6

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 187
    .local v0, "city":Landroid/widget/TextView;
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POI;->getCityStateString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 202
    .end local v0    # "city":Landroid/widget/TextView;
    .end local v1    # "detail":Lcom/aetn/history/android/historyhere/model/POI;
    .end local v2    # "title":Landroid/widget/TextView;
    :cond_5
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mTourHeader:Landroid/view/ViewGroup;

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 57
    const v1, 0x7f03003a

    const/4 v2, 0x0

    invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 58
    .local v0, "view":Landroid/view/View;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    const-string v2, "onCreateView"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const v1, 0x7f0a008c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mapButton:Landroid/view/View;

    .line 60
    const v1, 0x7f0a008f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->menuButton:Landroid/view/View;

    .line 61
    const v1, 0x7f0a0077

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->searchButton:Landroid/view/View;

    .line 62
    const v1, 0x7f0a0090

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->suggestButton:Landroid/view/View;

    .line 63
    const v1, 0x7f0a00a0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mTourHeader:Landroid/view/ViewGroup;

    .line 64
    const v1, 0x7f0a0086

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mRightMenu:Landroid/view/ViewGroup;

    .line 65
    const v1, 0x102000a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mListView:Landroid/widget/ListView;

    .line 66
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mFavoritesChangedListener:Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setPreferencesChangedListener(Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;)V

    .line 67
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/16 v2, 0x72

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentPixels(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mHeightOfListRow:I

    .line 68
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 101
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    const-string v1, "onDestroy()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mFavoritesChangedListener:Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->removePreferencesChangedListener(Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;)V

    .line 103
    invoke-super {p0}, Landroid/support/v4/app/ListFragment;->onDestroy()V

    .line 105
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    const-string v1, "onPause()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    invoke-super {p0}, Landroid/support/v4/app/ListFragment;->onPause()V

    .line 111
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 115
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    invoke-super {p0}, Landroid/support/v4/app/ListFragment;->onResume()V

    .line 117
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->loadCurrentData()V

    .line 120
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 87
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/ListFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 88
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    const-string v1, "onViewCreated"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 90
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .line 91
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mContext:Landroid/content/Context;

    .line 92
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->setListeners()V

    .line 93
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mListView:top:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mListView:Landroid/widget/ListView;

    invoke-direct {p0, v2}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getTopPositionOfView(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    return-void
.end method
