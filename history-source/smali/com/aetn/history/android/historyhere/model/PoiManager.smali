.class public Lcom/aetn/history/android/historyhere/model/PoiManager;
.super Ljava/lang/Object;
.source "PoiManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDataChangedListener;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataUpdatedListener;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;,
        Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;
    }
.end annotation


# static fields
.field private static final KEY_RESULTS_OK:Ljava/lang/String; = "OK"

.field private static mContext:Landroid/content/Context;

.field private static mInstance:Lcom/aetn/history/android/historyhere/model/PoiManager;


# instance fields
.field private final TAG:Ljava/lang/String;

.field private mAllToursDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;

.field private mAllToursList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mCurrentFavoritePoiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mCurrentPOIDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private mCurrentPoiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mCurrentTourDetailPoi:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private mCurrentTourPoiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mDataChangedListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDataChangedListener;",
            ">;"
        }
    .end annotation
.end field

.field private mDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

.field private mInitialDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;

.field private mLatestPoiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mLimitedDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;

.field private mLimitedDataUpdatedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataUpdatedListener;

.field private mOnUnclusteredMapMarkersListener:Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;

.field private mServiceHost:Ljava/lang/String;

.field private mTourDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;

.field private mUnclusteredClusteredPoiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mUnclusteredMapMarkersString:Ljava/lang/String;

.field private mUnclusteredPois:Ljava/util/ArrayList;
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
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    .line 54
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    .line 99
    sput-object p1, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredClusteredPoiList:Ljava/util/ArrayList;

    .line 102
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/model/Configuration;->poiServiceHost:Ljava/lang/String;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mServiceHost:Ljava/lang/String;

    .line 103
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$002(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 31
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mLatestPoiList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1002(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 31
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$102(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 31
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mLatestPoiList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyAllToursLoadedListeners()V

    return-void
.end method

.method static synthetic access$1200(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyTourDetailFailedListener()V

    return-void
.end method

.method static synthetic access$1302(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 31
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentTourPoiList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$1400(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyTourDetailLoadedListeners()V

    return-void
.end method

.method static synthetic access$1500(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyDetailFailedListener()V

    return-void
.end method

.method static synthetic access$1600(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyDetailLoadedListener()V

    return-void
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300()Landroid/content/Context;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyListeners()V

    return-void
.end method

.method static synthetic access$500(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Ljava/io/InputStream;

    .prologue
    .line 31
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getStringFromInputStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$600(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyInitialDataListener()V

    return-void
.end method

.method static synthetic access$700(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyLimitedDataLoadedListener(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic access$800(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyLimitedDataUpdatedListener()V

    return-void
.end method

.method static synthetic access$900(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyAllToursLoadFailedListener()V

    return-void
.end method

.method public static addFavorite(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 890
    invoke-static {p0, p1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->addFavorite(Landroid/content/Context;Ljava/lang/String;)V

    .line 891
    return-void
.end method

.method public static getFavorites(Landroid/content/Context;)[Ljava/lang/String;
    .locals 1
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 898
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getFavorites(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 106
    const-class v1, Lcom/aetn/history/android/historyhere/model/PoiManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mInstance:Lcom/aetn/history/android/historyhere/model/PoiManager;

    if-nez v0, :cond_0

    .line 107
    new-instance v0, Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mInstance:Lcom/aetn/history/android/historyhere/model/PoiManager;

    .line 109
    :cond_0
    sput-object p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    .line 110
    sget-object v0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mInstance:Lcom/aetn/history/android/historyhere/model/PoiManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 106
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static getStringFromInputStream(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6
    .param p0, "is"    # Ljava/io/InputStream;

    .prologue
    .line 732
    const/4 v0, 0x0

    .line 733
    .local v0, "br":Ljava/io/BufferedReader;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 738
    .local v4, "sb":Ljava/lang/StringBuilder;
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 739
    .end local v0    # "br":Ljava/io/BufferedReader;
    .local v1, "br":Ljava/io/BufferedReader;
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    .local v3, "line":Ljava/lang/String;
    if-eqz v3, :cond_1

    .line 740
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 743
    .end local v3    # "line":Ljava/lang/String;
    :catch_0
    move-exception v2

    move-object v0, v1

    .line 744
    .end local v1    # "br":Ljava/io/BufferedReader;
    .restart local v0    # "br":Ljava/io/BufferedReader;
    .local v2, "e":Ljava/io/IOException;
    :goto_1
    :try_start_2
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 746
    if-eqz v0, :cond_0

    .line 748
    :try_start_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 754
    .end local v2    # "e":Ljava/io/IOException;
    :cond_0
    :goto_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5

    .line 746
    .end local v0    # "br":Ljava/io/BufferedReader;
    .restart local v1    # "br":Ljava/io/BufferedReader;
    .restart local v3    # "line":Ljava/lang/String;
    :cond_1
    if-eqz v1, :cond_3

    .line 748
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    move-object v0, v1

    .line 751
    .end local v1    # "br":Ljava/io/BufferedReader;
    .restart local v0    # "br":Ljava/io/BufferedReader;
    goto :goto_2

    .line 749
    .end local v0    # "br":Ljava/io/BufferedReader;
    .restart local v1    # "br":Ljava/io/BufferedReader;
    :catch_1
    move-exception v2

    .line 750
    .restart local v2    # "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v1

    .line 751
    .end local v1    # "br":Ljava/io/BufferedReader;
    .restart local v0    # "br":Ljava/io/BufferedReader;
    goto :goto_2

    .line 749
    .end local v3    # "line":Ljava/lang/String;
    :catch_2
    move-exception v2

    .line 750
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 746
    .end local v2    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v5

    :goto_3
    if-eqz v0, :cond_2

    .line 748
    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 751
    :cond_2
    :goto_4
    throw v5

    .line 749
    :catch_3
    move-exception v2

    .line 750
    .restart local v2    # "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 746
    .end local v0    # "br":Ljava/io/BufferedReader;
    .end local v2    # "e":Ljava/io/IOException;
    .restart local v1    # "br":Ljava/io/BufferedReader;
    :catchall_1
    move-exception v5

    move-object v0, v1

    .end local v1    # "br":Ljava/io/BufferedReader;
    .restart local v0    # "br":Ljava/io/BufferedReader;
    goto :goto_3

    .line 743
    :catch_4
    move-exception v2

    goto :goto_1

    .end local v0    # "br":Ljava/io/BufferedReader;
    .restart local v1    # "br":Ljava/io/BufferedReader;
    .restart local v3    # "line":Ljava/lang/String;
    :cond_3
    move-object v0, v1

    .end local v1    # "br":Ljava/io/BufferedReader;
    .restart local v0    # "br":Ljava/io/BufferedReader;
    goto :goto_2
.end method

.method public static isFavorite(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 886
    invoke-static {p0, p1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private notifyAllToursLoadFailedListener()V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;

    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;->onDataLoadFailed()V

    .line 267
    :cond_0
    return-void
.end method

.method private notifyAllToursLoadedListeners()V
    .locals 2

    .prologue
    .line 259
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getAllToursList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;->onDataLoaded(Ljava/util/ArrayList;)V

    .line 262
    :cond_0
    return-void
.end method

.method private notifyDetailFailedListener()V
    .locals 3

    .prologue
    .line 233
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyDetailLoadedListener:notifyDetailFailedListener: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;->onPoiDetailLoadFailed()V

    .line 237
    :cond_0
    return-void
.end method

.method private notifyDetailLoadedListener()V
    .locals 3

    .prologue
    .line 227
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyDetailLoadedListener:mDetailLoadedListener: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIDetail()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;->onPoiDetailLoaded(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 231
    :cond_0
    return-void
.end method

.method private notifyInitialDataListener()V
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mInitialDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;

    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;->onDataLoaded()V

    .line 177
    return-void
.end method

.method private notifyLimitedDataLoadedListener(Ljava/util/ArrayList;)V
    .locals 1
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
    .line 187
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mLimitedDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;

    invoke-interface {v0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;->onDataLoaded(Ljava/util/ArrayList;)V

    .line 188
    return-void
.end method

.method private notifyLimitedDataUpdatedListener()V
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mLimitedDataUpdatedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataUpdatedListener;

    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataUpdatedListener;->onDataUpdated()V

    .line 199
    return-void
.end method

.method private notifyListeners()V
    .locals 3

    .prologue
    .line 212
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDataChangedListeners:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 213
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDataChangedListeners:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDataChangedListener;

    .line 214
    .local v0, "l":Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDataChangedListener;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    invoke-interface {v0, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDataChangedListener;->onPoiDataChanged(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 217
    .end local v0    # "l":Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDataChangedListener;
    :cond_0
    return-void
.end method

.method private notifyOnUnclusteredPoisChangedListener()V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mOnUnclusteredMapMarkersListener:Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mOnUnclusteredMapMarkersListener:Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;

    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;->onUnclusteredPoisChanged()V

    .line 125
    :cond_0
    return-void
.end method

.method private notifyOnUnclusteredPoisLoadedListener()V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mOnUnclusteredMapMarkersListener:Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mOnUnclusteredMapMarkersListener:Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredClusteredPoiList:Ljava/util/ArrayList;

    invoke-interface {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;->onUnclusteredPoisLoaded(Ljava/util/ArrayList;)V

    .line 129
    :cond_0
    return-void
.end method

.method private notifyTourDetailFailedListener()V
    .locals 3

    .prologue
    .line 248
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyDetailLoadedListener:notifyDetailFailedListener: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mTourDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mTourDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mTourDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;

    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;->onTourDetailLoadFailed()V

    .line 252
    :cond_0
    return-void
.end method

.method private notifyTourDetailLoadedListeners()V
    .locals 2

    .prologue
    .line 245
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mTourDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;->onTourDetailLoaded(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 246
    return-void
.end method

.method public static removeFavorite(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 894
    invoke-static {p0, p1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->removeFavorite(Landroid/content/Context;Ljava/lang/String;)V

    .line 895
    return-void
.end method


# virtual methods
.method public getAllToursList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 710
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getAllToursListWithPaddingRow()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 719
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 720
    .local v1, "r":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;

    if-eqz v2, :cond_1

    .line 721
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 722
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 724
    .end local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 726
    :cond_1
    return-object v1
.end method

.method public getCurrentFavoriteList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 855
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentFavoritePoiList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCurrentFavoritesListFromDB(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 2
    .param p1, "mContext"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 801
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getFavorites(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    .line 804
    .local v0, "favs":[Ljava/lang/String;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getFavoritePoiList([Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentFavoritePoiList:Ljava/util/ArrayList;

    .line 805
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentFavoritePoiList:Ljava/util/ArrayList;

    return-object v1
.end method

.method public getCurrentPOIDetail()Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1

    .prologue
    .line 871
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPOIDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object v0
.end method

.method public getCurrentPOIList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 814
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCurrentPOIListWithExtraRow()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 822
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 823
    .local v1, "tempList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 824
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 827
    .end local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x4

    if-le v2, v3, :cond_1

    .line 828
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 829
    :cond_1
    return-object v1
.end method

.method public getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1

    .prologue
    .line 833
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentTourDetailPoi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object v0
.end method

.method public getCurrentTourList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 838
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentTourPoiList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCurrentTourListWithExtraRow()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 861
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 862
    .local v1, "tempList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentTourPoiList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 863
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 865
    .end local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 866
    return-object v1
.end method

.method public declared-synchronized getPOIDetailFromService(Landroid/content/Context;Ljava/lang/String;)V
    .locals 9
    .param p1, "c"    # Landroid/content/Context;
    .param p2, "id"    # Ljava/lang/String;

    .prologue
    .line 760
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 761
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0d003c

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, p1, v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->manageConnectionNotAvailable(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 797
    :goto_0
    monitor-exit p0

    return-void

    .line 764
    :cond_0
    :try_start_1
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    div-long/2addr v5, v7

    long-to-float v5, v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 765
    .local v4, "time":I
    const-string v2, "/place_v2/detail/json/?"

    .line 766
    .local v2, "request":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "poi_id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 767
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mServiceHost:Ljava/lang/String;

    const-string v6, "PNIPTS01"

    const-string v7, "nd78tYq6e4"

    invoke-static {v5, v2, v6, v7, v4}, Lcom/aetn/history/android/historyhere/utils/Signing;->signRequestForPOIWebService(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    .line 768
    .local v3, "signedRequest":Ljava/lang/String;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "setPOIDetailFromService signedRequest"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 770
    new-instance v0, Lcom/android/volley/toolbox/StringRequest;

    const/4 v5, 0x0

    new-instance v6, Lcom/aetn/history/android/historyhere/model/PoiManager$11;

    invoke-direct {v6, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$11;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    new-instance v7, Lcom/aetn/history/android/historyhere/model/PoiManager$12;

    invoke-direct {v7, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$12;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    invoke-direct {v0, v5, v3, v6, v7}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 795
    .local v0, "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    sget-object v5, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    invoke-static {v5}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getRequestQueue()Lcom/android/volley/RequestQueue;

    move-result-object v1

    .line 796
    .local v1, "queue":Lcom/android/volley/RequestQueue;
    invoke-virtual {v1, v0}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 760
    .end local v0    # "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    .end local v1    # "queue":Lcom/android/volley/RequestQueue;
    .end local v2    # "request":Ljava/lang/String;
    .end local v3    # "signedRequest":Ljava/lang/String;
    .end local v4    # "time":I
    :catchall_0
    move-exception v5

    monitor-exit p0

    throw v5
.end method

.method public getPoiById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 2
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 881
    sget-object v1, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getPoiById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    .line 882
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    return-object v0
.end method

.method public declared-synchronized getPoiList(DDJLjava/lang/String;I)V
    .locals 13
    .param p1, "_lat"    # D
    .param p3, "_lng"    # D
    .param p5, "radius"    # J
    .param p7, "categories"    # Ljava/lang/String;
    .param p8, "maxResults"    # I

    .prologue
    .line 281
    monitor-enter p0

    :try_start_0
    const-string v7, "/place/proximity/json/?"

    .line 282
    .local v7, "service":Ljava/lang/String;
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, ","

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    move-wide/from16 v0, p3

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 283
    .local v3, "latlng":Ljava/lang/String;
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    const-wide/16 v11, 0x3e8

    div-long/2addr v9, v11

    long-to-float v9, v9

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 284
    .local v8, "time":I
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "location="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "&radius="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    move-wide/from16 v0, p5

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "&detail=true"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "&max_results="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    move/from16 v0, p8

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 290
    .local v6, "request":Ljava/lang/String;
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mServiceHost:Ljava/lang/String;

    const-string v10, "PNIPTS01"

    const-string v11, "nd78tYq6e4"

    invoke-static {v9, v6, v10, v11, v8}, Lcom/aetn/history/android/historyhere/utils/Signing;->signRequestForPOIWebService(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 291
    .local v2, "finalRequestString":Ljava/lang/String;
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "getPoiList(): The final string is"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    new-instance v4, Lcom/android/volley/toolbox/StringRequest;

    const/4 v9, 0x0

    new-instance v10, Lcom/aetn/history/android/historyhere/model/PoiManager$1;

    invoke-direct {v10, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$1;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    new-instance v11, Lcom/aetn/history/android/historyhere/model/PoiManager$2;

    invoke-direct {v11, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$2;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    invoke-direct {v4, v9, v2, v10, v11}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 332
    .local v4, "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    sget-object v9, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    invoke-static {v9}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v9

    invoke-virtual {v9}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getRequestQueue()Lcom/android/volley/RequestQueue;

    move-result-object v5

    .line 333
    .local v5, "queue":Lcom/android/volley/RequestQueue;
    invoke-virtual {v5, v4}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    monitor-exit p0

    return-void

    .line 281
    .end local v2    # "finalRequestString":Ljava/lang/String;
    .end local v3    # "latlng":Ljava/lang/String;
    .end local v4    # "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    .end local v5    # "queue":Lcom/android/volley/RequestQueue;
    .end local v6    # "request":Ljava/lang/String;
    .end local v7    # "service":Ljava/lang/String;
    .end local v8    # "time":I
    :catchall_0
    move-exception v9

    monitor-exit p0

    throw v9
.end method

.method public getPoiListWithinBounds(DDDD)Ljava/util/ArrayList;
    .locals 9
    .param p1, "top"    # D
    .param p3, "bottom"    # D
    .param p5, "left"    # D
    .param p7, "right"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDDD)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 271
    sget-object v0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-wide/from16 v7, p7

    invoke-virtual/range {v0 .. v8}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getPoiListWithinBounds(DDDD)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    .line 272
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyListeners()V

    .line 273
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIList()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getTourItemFromToursListById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 3
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 845
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getAllToursList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 846
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 850
    .end local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public declared-synchronized getTourPOIDetailFromService(Landroid/content/Context;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 12
    .param p1, "c"    # Landroid/content/Context;
    .param p2, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 644
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 645
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0d003e

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, p1, v8}, Lcom/aetn/history/android/historyhere/model/PoiManager;->manageConnectionNotAvailable(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 696
    :goto_0
    monitor-exit p0

    return-void

    .line 648
    :cond_0
    :try_start_1
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentTourDetailPoi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 650
    const-string v2, ""

    .line 652
    .local v2, "poiList":Ljava/lang/String;
    invoke-virtual {p2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTourListString()Ljava/lang/String;

    move-result-object v2

    .line 654
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {p2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 657
    .local v1, "location":Ljava/lang/String;
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    div-long/2addr v8, v10

    long-to-float v8, v8

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 658
    .local v7, "time":I
    const-string v6, "/place_v2/detail/json/?"

    .line 660
    .local v6, "service":Ljava/lang/String;
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "&poi_id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 662
    .local v5, "request":Ljava/lang/String;
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mServiceHost:Ljava/lang/String;

    const-string v9, "PNIPTS01"

    const-string v10, "nd78tYq6e4"

    invoke-static {v8, v5, v9, v10, v7}, Lcom/aetn/history/android/historyhere/utils/Signing;->signRequestForPOIWebService(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 663
    .local v0, "finalURL":Ljava/lang/String;
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "getTourPOIDetailFromService signedrequest: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 667
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "getTourPOIDetailFromService finalURL: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    new-instance v3, Lcom/android/volley/toolbox/StringRequest;

    const/4 v8, 0x0

    new-instance v9, Lcom/aetn/history/android/historyhere/model/PoiManager$9;

    invoke-direct {v9, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$9;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    new-instance v10, Lcom/aetn/history/android/historyhere/model/PoiManager$10;

    invoke-direct {v10, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$10;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    invoke-direct {v3, v8, v0, v9, v10}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 694
    .local v3, "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v8

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getRequestQueue()Lcom/android/volley/RequestQueue;

    move-result-object v4

    .line 695
    .local v4, "queue":Lcom/android/volley/RequestQueue;
    invoke-virtual {v4, v3}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 644
    .end local v0    # "finalURL":Ljava/lang/String;
    .end local v1    # "location":Ljava/lang/String;
    .end local v2    # "poiList":Ljava/lang/String;
    .end local v3    # "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    .end local v4    # "queue":Lcom/android/volley/RequestQueue;
    .end local v5    # "request":Ljava/lang/String;
    .end local v6    # "service":Ljava/lang/String;
    .end local v7    # "time":I
    :catchall_0
    move-exception v8

    monitor-exit p0

    throw v8
.end method

.method public isInUnclusteredMapMarkers(Ljava/lang/String;)Z
    .locals 3
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 155
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public declared-synchronized loadAllToursList()V
    .locals 13

    .prologue
    .line 555
    monitor-enter p0

    :try_start_0
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    const-string v10, "loadAllToursList():"

    invoke-static {v9, v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    const-string v6, "/place_v2/proximity/json/?"

    .line 561
    .local v6, "service":Ljava/lang/String;
    const-string v0, "24.329561,-64.48493,48.605661,-127.1509548"

    .line 562
    .local v0, "bbox":Ljava/lang/String;
    const-string v7, "aetn\\-tour"

    .line 563
    .local v7, "tags":Ljava/lang/String;
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    const-wide/16 v11, 0x3e8

    div-long/2addr v9, v11

    long-to-float v9, v9

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 564
    .local v8, "time":I
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "&bbox="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "&category=itinerary"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "&detail=true"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "&tags="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "&max_results="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const/16 v10, 0x64

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 572
    .local v5, "request":Ljava/lang/String;
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mServiceHost:Ljava/lang/String;

    const-string v10, "PNIPTS01"

    const-string v11, "nd78tYq6e4"

    invoke-static {v9, v5, v10, v11, v8}, Lcom/aetn/history/android/historyhere/utils/Signing;->signRequestForPOIWebService(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 573
    .local v1, "finalRequestString":Ljava/lang/String;
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "loadAllToursList(): signedrequest: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    const-string v2, ""

    .line 578
    .local v2, "finalURL":Ljava/lang/String;
    move-object v2, v1

    .line 580
    new-instance v3, Lcom/android/volley/toolbox/StringRequest;

    const/4 v9, 0x0

    new-instance v10, Lcom/aetn/history/android/historyhere/model/PoiManager$7;

    invoke-direct {v10, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$7;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    new-instance v11, Lcom/aetn/history/android/historyhere/model/PoiManager$8;

    invoke-direct {v11, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$8;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    invoke-direct {v3, v9, v2, v10, v11}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 637
    .local v3, "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    sget-object v9, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    invoke-static {v9}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v9

    invoke-virtual {v9}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getRequestQueue()Lcom/android/volley/RequestQueue;

    move-result-object v4

    .line 638
    .local v4, "queue":Lcom/android/volley/RequestQueue;
    invoke-virtual {v4, v3}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 639
    monitor-exit p0

    return-void

    .line 555
    .end local v0    # "bbox":Ljava/lang/String;
    .end local v1    # "finalRequestString":Ljava/lang/String;
    .end local v2    # "finalURL":Ljava/lang/String;
    .end local v3    # "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    .end local v4    # "queue":Lcom/android/volley/RequestQueue;
    .end local v5    # "request":Ljava/lang/String;
    .end local v6    # "service":Ljava/lang/String;
    .end local v7    # "tags":Ljava/lang/String;
    .end local v8    # "time":I
    :catchall_0
    move-exception v9

    monitor-exit p0

    throw v9
.end method

.method public declared-synchronized loadFullPoiListFromAssets(Landroid/content/Context;)V
    .locals 4
    .param p1, "mContext"    # Landroid/content/Context;

    .prologue
    .line 343
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    const-string v1, "loadFullPoiListFromAssets(): running"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    new-instance v0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "start"

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    monitor-exit p0

    return-void

    .line 343
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized loadFullPoiListFromDataDump(Landroid/content/Context;)V
    .locals 9
    .param p1, "mContext"    # Landroid/content/Context;

    .prologue
    .line 392
    monitor-enter p0

    :try_start_0
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    const-string v6, "loadFullPoiListFromDataDump(): running"

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    div-long/2addr v5, v7

    long-to-float v5, v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 396
    .local v4, "time":I
    const-string v2, "/place_v2/dump/json/?"

    .line 397
    .local v2, "request":Ljava/lang/String;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mServiceHost:Ljava/lang/String;

    const-string v6, "PNIPTS01"

    const-string v7, "nd78tYq6e4"

    invoke-static {v5, v2, v6, v7, v4}, Lcom/aetn/history/android/historyhere/utils/Signing;->signRequestForPOIDataDump(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    .line 398
    .local v3, "signedRequest":Ljava/lang/String;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "loadFullPoiListFromDataDump: signedRequest: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    new-instance v0, Lcom/android/volley/toolbox/StringRequest;

    const/4 v5, 0x0

    new-instance v6, Lcom/aetn/history/android/historyhere/model/PoiManager$3;

    invoke-direct {v6, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$3;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    new-instance v7, Lcom/aetn/history/android/historyhere/model/PoiManager$4;

    invoke-direct {v7, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$4;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    invoke-direct {v0, v5, v3, v6, v7}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 415
    .local v0, "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getRequestQueue()Lcom/android/volley/RequestQueue;

    move-result-object v1

    .line 416
    .local v1, "queue":Lcom/android/volley/RequestQueue;
    invoke-virtual {v1, v0}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    monitor-exit p0

    return-void

    .line 392
    .end local v0    # "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    .end local v1    # "queue":Lcom/android/volley/RequestQueue;
    .end local v2    # "request":Ljava/lang/String;
    .end local v3    # "signedRequest":Ljava/lang/String;
    .end local v4    # "time":I
    :catchall_0
    move-exception v5

    monitor-exit p0

    throw v5
.end method

.method public declared-synchronized loadLimitedListFromDataDump(Landroid/content/Context;Ljava/lang/String;)V
    .locals 10
    .param p1, "mContext"    # Landroid/content/Context;
    .param p2, "date"    # Ljava/lang/String;

    .prologue
    .line 449
    monitor-enter p0

    :try_start_0
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    const-string v7, "loadLimitedListFromDataDump(): running"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    long-to-float v6, v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 453
    .local v5, "time":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "T00:00Z"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 456
    .local v0, "dateStamp":Ljava/lang/String;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "/place_v2/dump/json/?modified_after="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 457
    .local v3, "request":Ljava/lang/String;
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mServiceHost:Ljava/lang/String;

    const-string v7, "PNIPTS01"

    const-string v8, "nd78tYq6e4"

    invoke-static {v6, v3, v7, v8, v5}, Lcom/aetn/history/android/historyhere/utils/Signing;->signRequestForPOIDataDump(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 458
    .local v4, "signedRequest":Ljava/lang/String;
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "loadLimitedListFromDataDump: signedRequest: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    new-instance v1, Lcom/android/volley/toolbox/StringRequest;

    const/4 v6, 0x0

    new-instance v7, Lcom/aetn/history/android/historyhere/model/PoiManager$5;

    invoke-direct {v7, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$5;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    new-instance v8, Lcom/aetn/history/android/historyhere/model/PoiManager$6;

    invoke-direct {v8, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$6;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    invoke-direct {v1, v6, v4, v7, v8}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 473
    .local v1, "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getRequestQueue()Lcom/android/volley/RequestQueue;

    move-result-object v2

    .line 474
    .local v2, "queue":Lcom/android/volley/RequestQueue;
    invoke-virtual {v2, v1}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 477
    monitor-exit p0

    return-void

    .line 449
    .end local v0    # "dateStamp":Ljava/lang/String;
    .end local v1    # "poiRequest":Lcom/android/volley/toolbox/StringRequest;
    .end local v2    # "queue":Lcom/android/volley/RequestQueue;
    .end local v3    # "request":Ljava/lang/String;
    .end local v4    # "signedRequest":Ljava/lang/String;
    .end local v5    # "time":I
    :catchall_0
    move-exception v6

    monitor-exit p0

    throw v6
.end method

.method public loadUnclusteredMapPois()V
    .locals 4

    .prologue
    .line 160
    const/4 v0, 0x0

    .line 161
    .local v0, "finalList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 162
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadUnclusteredMapPois: final stringlist: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    sget-object v1, Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getPoisFromList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredClusteredPoiList:Ljava/util/ArrayList;

    .line 165
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mUnclusteredClusteredPoiList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredClusteredPoiList:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyOnUnclusteredPoisLoadedListener()V

    .line 170
    :goto_0
    return-void

    .line 168
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    const-string v2, "loadUnclusteredMapPois(): mUnclusteredMapMarkersString.isEmpty()"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public manageConnectionNotAvailable(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .param p1, "c"    # Landroid/content/Context;
    .param p2, "msg"    # Ljava/lang/String;

    .prologue
    .line 909
    return-void
.end method

.method public setCurrentPOIDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p1, "detail"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 875
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPOIDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 876
    return-void
.end method

.method public setCurrentPOIList(Ljava/util/ArrayList;)V
    .locals 0
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
    .line 818
    .local p1, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;

    .line 819
    return-void
.end method

.method public setInitialDataLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;

    .prologue
    .line 173
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mInitialDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;

    .line 174
    return-void
.end method

.method public setLimitedDataLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;

    .prologue
    .line 184
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mLimitedDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;

    .line 185
    return-void
.end method

.method public setLimitedDataUpdatedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataUpdatedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataUpdatedListener;

    .prologue
    .line 195
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mLimitedDataUpdatedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataUpdatedListener;

    .line 196
    return-void
.end method

.method public setOnAllToursDataLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;

    .prologue
    .line 255
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursDataLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;

    .line 256
    return-void
.end method

.method public setOnDataChangedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDataChangedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDataChangedListener;

    .prologue
    .line 205
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDataChangedListeners:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 206
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDataChangedListeners:Ljava/util/ArrayList;

    .line 208
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDataChangedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    return-void
.end method

.method public setOnDetailLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

    .prologue
    .line 223
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;

    .line 224
    return-void
.end method

.method public setOnTourDetailLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;

    .prologue
    .line 241
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mTourDetailLoadedListener:Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;

    .line 242
    return-void
.end method

.method public setOnUnclusteredMapMarkersListener(Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;

    .prologue
    .line 119
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mOnUnclusteredMapMarkersListener:Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;

    .line 120
    return-void
.end method

.method public setUnclusteredPoiString()V
    .locals 5

    .prologue
    .line 143
    const-string v2, ""

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    .line 144
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredPois:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 145
    .local v1, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\',"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    goto :goto_0

    .line 147
    .end local v1    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .local v0, "b":Ljava/lang/StringBuilder;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const-string v4, ""

    invoke-virtual {v0, v2, v3, v4}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredMapMarkersString:Ljava/lang/String;

    .line 152
    .end local v0    # "b":Ljava/lang/StringBuilder;
    :cond_1
    return-void
.end method

.method public setUnclusteredPois(Ljava/util/ArrayList;)V
    .locals 0
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
    .line 137
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->mUnclusteredPois:Ljava/util/ArrayList;

    .line 138
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setUnclusteredPoiString()V

    .line 139
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyOnUnclusteredPoisChangedListener()V

    .line 140
    return-void
.end method

.method public declared-synchronized updateLimitedListFromDataDump(Ljava/util/ArrayList;)V
    .locals 3
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
    .line 500
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;

    const-string v1, "updateLimitedListFromDataDump(): running"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    new-instance v0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/util/ArrayList;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 502
    monitor-exit p0

    return-void

    .line 500
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
