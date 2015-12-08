.class public Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "DetailPagerAdapter.java"


# instance fields
.field private final TAG:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mCurrentData:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mCurrentFragment:Landroid/support/v4/app/Fragment;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Landroid/content/Context;)V
    .locals 1
    .param p1, "fm"    # Landroid/support/v4/app/FragmentManager;
    .param p2, "c"    # Landroid/content/Context;

    .prologue
    .line 22
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 16
    const-string v0, "DetailPagerAdapter"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->TAG:Ljava/lang/String;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->mCurrentData:Ljava/util/ArrayList;

    .line 23
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->mContext:Landroid/content/Context;

    .line 24
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->mCurrentData:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 36
    const/4 v0, 0x0

    .line 38
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->mCurrentData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public getCurrentFragment()Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->mCurrentFragment:Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 4
    .param p1, "pos"    # I

    .prologue
    .line 28
    const-string v1, "DetailPagerAdapter"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get Item():pos:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|count:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->getCount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->mCurrentData:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 30
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->newInstance(Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    move-result-object v1

    return-object v1
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .line 46
    const/4 v0, -0x2

    return v0
.end method

.method public resetData(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 51
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const-string v0, "DetailPagerAdapter"

    const-string v1, "resetData:"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->mCurrentData:Ljava/util/ArrayList;

    .line 53
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->notifyDataSetChanged()V

    .line 54
    return-void
.end method

.method public setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1
    .param p1, "container"    # Landroid/view/ViewGroup;
    .param p2, "position"    # I
    .param p3, "object"    # Ljava/lang/Object;

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->getCurrentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eq v0, p3, :cond_0

    move-object v0, p3

    .line 59
    check-cast v0, Landroid/support/v4/app/Fragment;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->mCurrentFragment:Landroid/support/v4/app/Fragment;

    .line 61
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentStatePagerAdapter;->setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 62
    return-void
.end method
