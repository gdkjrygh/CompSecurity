.class public Lcom/aetn/history/android/historyhere/model/InitializationManager;
.super Ljava/lang/Object;
.source "InitializationManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;
    }
.end annotation


# static fields
.field private static mContext:Landroid/content/Context;

.field private static mInitializationManager:Lcom/aetn/history/android/historyhere/model/InitializationManager;


# instance fields
.field private final TAG:Ljava/lang/String;

.field private isInited:Ljava/lang/Boolean;

.field private isIniting:Z

.field private mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private mInitializationListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v1, 0x0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-string v0, "InitializationManager"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->TAG:Ljava/lang/String;

    .line 19
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->isInited:Ljava/lang/Boolean;

    .line 21
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->isIniting:Z

    .line 39
    sput-object p1, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 41
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->notifyListenersOnFailedPlayServices()V

    return-void
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadConfig()V

    return-void
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->initDataBaseLoad()V

    return-void
.end method

.method static synthetic access$300()Landroid/content/Context;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->checkForLatestRecords()V

    return-void
.end method

.method static synthetic access$500(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadAllTours()V

    return-void
.end method

.method static synthetic access$600(Lcom/aetn/history/android/historyhere/model/InitializationManager;Ljava/util/ArrayList;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->updateLimitedData(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic access$700(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->hasFinishedInitialization()V

    return-void
.end method

.method private checkForLatestRecords()V
    .locals 3

    .prologue
    .line 219
    const-string v1, "InitializationManager"

    const-string v2, "checkForLatestRecords()"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    sget-object v1, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    new-instance v2, Lcom/aetn/history/android/historyhere/model/InitializationManager$5;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$5;-><init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setLimitedDataLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;)V

    .line 234
    sget-object v1, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getLimitedDatabaseUpdateDate(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 236
    .local v0, "limitedDataUpdateDate":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 237
    const-string v0, "2015-01-22"

    .line 239
    :cond_0
    sget-object v1, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    sget-object v2, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->loadLimitedListFromDataDump(Landroid/content/Context;Ljava/lang/String;)V

    .line 241
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/InitializationManager;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 32
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationManager:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationManager:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .line 35
    :cond_0
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationManager:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    return-object v0
.end method

.method private hasFinishedInitialization()V
    .locals 2

    .prologue
    .line 292
    const-string v0, "InitializationManager"

    const-string v1, "hasFinishedInitialization(): has successfully gone through all the steps so we can fire off inited"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->isInited:Ljava/lang/Boolean;

    .line 295
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->isIniting:Z

    .line 296
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->notifyListenersOnInitialization()V

    .line 297
    return-void
.end method

.method private initDataBaseLoad()V
    .locals 5

    .prologue
    .line 147
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v2

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/model/Configuration;->poiDatabaseRefreshDate:Ljava/lang/String;

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDateFromString(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 148
    .local v1, "dbRefreshDateFromConfig":Ljava/util/Date;
    const-string v2, "InitializationManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig(): dbRefreshDateFromConfig: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    sget-object v2, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getFullDatabaseRefreshDate(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 152
    const-string v2, "InitializationManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig(): NOT EMPTY! - PreferenceManager.getFullDatabaseRefreshDate(mContext): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v4}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getFullDatabaseRefreshDate(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    sget-object v2, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getFullDatabaseRefreshDate(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDateFromISO8601String(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 159
    .local v0, "dbRefreshDateFromApp":Ljava/util/Date;
    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 161
    const-string v2, "InitializationManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig(): LOAD FROM NEW DATADUMP: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadDataFromDataDump()V

    .line 177
    :goto_1
    return-void

    .line 155
    .end local v0    # "dbRefreshDateFromApp":Ljava/util/Date;
    :cond_0
    const-string v2, "InitializationManager"

    const-string v3, "loadConfig(): Config.INITIAL_DB_DATE: 2015-01-22"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v2, "2015-01-22"

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDateFromString(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .restart local v0    # "dbRefreshDateFromApp":Ljava/util/Date;
    goto :goto_0

    .line 164
    :cond_1
    const-string v2, "InitializationManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig(): LOAD FROM LOCAL COPY: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    sget-object v2, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->hasHadFirstRun(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 167
    const-string v2, "InitializationManager"

    const-string v3, "loadConfig(): DB NOT loaded yet - so do the initial load"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadDataFromDisk()V

    goto :goto_1

    .line 171
    :cond_2
    const-string v2, "InitializationManager"

    const-string v3, "loadConfig(): DB already loaded - so load all tours"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->checkForLatestRecords()V

    goto :goto_1
.end method

.method private loadAllTours()V
    .locals 2

    .prologue
    .line 271
    const-string v0, "InitializationManager"

    const-string v1, "loadAllTours()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/model/InitializationManager$7;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$7;-><init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setOnAllToursDataLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;)V

    .line 284
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->loadAllToursList()V

    .line 285
    return-void
.end method

.method private loadConfig()V
    .locals 2

    .prologue
    .line 131
    const-string v0, "InitializationManager"

    const-string v1, "loadConfig()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    new-instance v1, Lcom/aetn/history/android/historyhere/model/InitializationManager$2;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$2;-><init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->loadConfig(Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;)V

    .line 140
    return-void
.end method

.method private loadDataFromDataDump()V
    .locals 2

    .prologue
    .line 198
    const-string v0, "InitializationManager"

    const-string v1, "loadDataFromDataDump()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/model/InitializationManager$4;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$4;-><init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setInitialDataLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;)V

    .line 212
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    sget-object v1, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->loadFullPoiListFromDataDump(Landroid/content/Context;)V

    .line 213
    return-void
.end method

.method private loadDataFromDisk()V
    .locals 2

    .prologue
    .line 182
    const-string v0, "InitializationManager"

    const-string v1, "loadDataFromDisk()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/model/InitializationManager$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$3;-><init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setInitialDataLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;)V

    .line 194
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    sget-object v1, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->loadFullPoiListFromAssets(Landroid/content/Context;)V

    .line 195
    return-void
.end method

.method private notifyListenersOnFailedPlayServices()V
    .locals 3

    .prologue
    .line 72
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationListeners:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;

    .line 73
    .local v0, "l":Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;
    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;->onFailedToGetLatestPlayServices()V

    goto :goto_0

    .line 75
    .end local v0    # "l":Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;
    :cond_0
    return-void
.end method

.method private notifyListenersOnInitialization()V
    .locals 3

    .prologue
    .line 58
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationListeners:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;

    .line 59
    .local v0, "l":Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;
    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;->onInitialization()V

    goto :goto_0

    .line 61
    .end local v0    # "l":Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;
    :cond_0
    return-void
.end method

.method private notifyListenersOnNoNetworkConnection()V
    .locals 3

    .prologue
    .line 81
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationListeners:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;

    .line 82
    .local v0, "l":Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;
    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;->onNoNetworkConnection()V

    goto :goto_0

    .line 84
    .end local v0    # "l":Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;
    :cond_0
    return-void
.end method

.method private updateLimitedData(Ljava/util/ArrayList;)V
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
    .line 248
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const-string v0, "InitializationManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadLimitedData(): data:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/model/InitializationManager$6;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$6;-><init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setLimitedDataUpdatedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataUpdatedListener;)V

    .line 260
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->updateLimitedListFromDataDump(Ljava/util/ArrayList;)V

    .line 262
    return-void
.end method


# virtual methods
.method public init()V
    .locals 2

    .prologue
    .line 108
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->notifyListenersOnNoNetworkConnection()V

    .line 128
    :goto_0
    return-void

    .line 112
    :cond_0
    const-string v0, "InitializationManager"

    const-string v1, "init()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->isIniting:Z

    .line 114
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/model/InitializationManager$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager$1;-><init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->setOnPlayServiceInstalledListener(Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;)V

    .line 127
    sget-object v0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->init()V

    goto :goto_0
.end method

.method public isInited()Z
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->isInited:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isIniting()Z
    .locals 1

    .prologue
    .line 64
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->isIniting:Z

    return v0
.end method

.method public setOnInitializationListener(Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;

    .prologue
    .line 48
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationListeners:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationListeners:Ljava/util/ArrayList;

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager;->mInitializationListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    return-void
.end method
