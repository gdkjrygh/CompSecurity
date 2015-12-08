.class public Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;
.super Landroid/support/v4/app/ListFragment;
.source "TourHomeListViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;,
        Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TourHomeListViewFragment"


# instance fields
.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private mContext:Landroid/content/Context;

.field private menuButton:Landroid/view/View;

.field private tourHomeListAdapter:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

.field private tourList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;-><init>()V

    .line 354
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$002(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 34
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->setData()V

    return-void
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private hideLoading()V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->hideMessageBox()V

    .line 91
    return-void
.end method

.method private isFavorite(Ljava/lang/String;)Z
    .locals 2
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .local v0, "sb":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    return v1
.end method

.method private setData()V
    .locals 4

    .prologue
    .line 154
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->mContext:Landroid/content/Context;

    const v2, 0x7f030057

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;Landroid/content/Context;ILjava/util/ArrayList;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourHomeListAdapter:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    .line 155
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourHomeListAdapter:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 156
    return-void
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 75
    const-string v0, "TourHomeListViewFragment"

    const-string v1, "setListeners"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->menuButton:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    return-void
.end method


# virtual methods
.method public loadCurrentData()V
    .locals 4

    .prologue
    .line 115
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getAllToursListWithPaddingRow()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;

    .line 116
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 117
    const-string v1, "TourHomeListViewFragment"

    const-string v2, "loadCurrentData() NEED TO TRY TO LOAD AGAIN"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 119
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d003a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->manageDetailNotLoaded(Ljava/lang/String;)V

    .line 120
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 121
    .local v0, "fm":Landroid/support/v4/app/FragmentManager;
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 122
    const-string v1, "TourHomeListViewFragment"

    const-string v2, "Fragment click - no network connection"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .end local v0    # "fm":Landroid/support/v4/app/FragmentManager;
    :goto_0
    return-void

    .line 124
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)V

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setOnAllToursDataLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;)V

    .line 145
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->loadAllToursList()V

    goto :goto_0

    .line 148
    :cond_1
    const-string v1, "TourHomeListViewFragment"

    const-string v2, "loadCurrentData() already loaded"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->setData()V

    goto :goto_0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 48
    const v1, 0x7f030055

    const/4 v2, 0x0

    invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 49
    .local v0, "view":Landroid/view/View;
    const v1, 0x7f0a008f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->menuButton:Landroid/view/View;

    .line 50
    return-object v0
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 66
    const-string v0, "TourHomeListViewFragment"

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-super {p0}, Landroid/support/v4/app/ListFragment;->onResume()V

    .line 68
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 56
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/ListFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 57
    const-string v0, "TourHomeListViewFragment"

    const-string v1, "onViewCreated"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 59
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->mContext:Landroid/content/Context;

    .line 60
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->setListeners()V

    .line 61
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->loadCurrentData()V

    .line 62
    return-void
.end method

.method public resetData()V
    .locals 2

    .prologue
    .line 98
    const-string v0, "TourHomeListViewFragment"

    const-string v1, "resetData() called"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourHomeListAdapter:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->notifyDataSetChanged()V

    .line 100
    return-void
.end method
