.class Lcom/localytics/android/LocalyticsProvider;
.super Ljava/lang/Object;
.source "LocalyticsProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/LocalyticsProvider$ProfileDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$AmpConditionValuesDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$AmpConditionsDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$AmpRuleEventDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$AmpDisplayedDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$AmpRulesDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$UploadBlobsDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$UploadBlobEventsDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$SessionsDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$EventHistoryDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$EventsDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$IdentifiersDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$InfoDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$ApiKeysDbColumns;,
        Lcom/localytics/android/LocalyticsProvider$DatabaseHelper;
    }
.end annotation


# static fields
.field static final DATABASE_FILE:Ljava/lang/String; = "com.localytics.android.%s.sqlite"

.field private static final DATABASE_VERSION:I = 0x12

.field static final USER_ID:Ljava/lang/String; = "id"

.field static final USER_TYPE:Ljava/lang/String; = "type"

.field private static final USER_TYPE_ANONYMOUS:Ljava/lang/String; = "anonymous"

.field private static final USER_TYPE_KNOWN:Ljava/lang/String; = "known"

.field private static final sCountProjectionMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final sLocalyticsProviderIntrinsicLock:[Ljava/lang/Object;

.field private static final sLocalyticsProviderMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/localytics/android/LocalyticsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private static final sValidTables:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mDb:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 82
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/localytics/android/LocalyticsProvider;->sLocalyticsProviderMap:Ljava/util/Map;

    .line 90
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/localytics/android/LocalyticsProvider;->sLocalyticsProviderIntrinsicLock:[Ljava/lang/Object;

    .line 95
    invoke-static {}, Lcom/localytics/android/LocalyticsProvider;->getCountProjectionMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/LocalyticsProvider;->sCountProjectionMap:Ljava/util/Map;

    .line 100
    invoke-static {}, Lcom/localytics/android/LocalyticsProvider;->getValidTables()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/LocalyticsProvider;->sValidTables:Ljava/util/Set;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "apiKey"    # Ljava/lang/String;

    .prologue
    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    new-instance v0, Lcom/localytics/android/LocalyticsProvider$DatabaseHelper;

    const-string v1, "com.localytics.android.%s.sqlite"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p2}, Lcom/localytics/android/DatapointHelper;->getSha256_buggy(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x12

    invoke-direct {v0, p1, v1, v2}, Lcom/localytics/android/LocalyticsProvider$DatabaseHelper;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsProvider$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    .line 173
    return-void
.end method

.method private static deleteDirectory(Ljava/io/File;)Z
    .locals 6
    .param p0, "directory"    # Ljava/io/File;

    .prologue
    .line 531
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 533
    invoke-virtual {p0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v1, v0, v2

    .line 535
    .local v1, "child":Ljava/lang/String;
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v5}, Lcom/localytics/android/LocalyticsProvider;->deleteDirectory(Ljava/io/File;)Z

    move-result v4

    .line 536
    .local v4, "success":Z
    if-nez v4, :cond_0

    .line 538
    const/4 v5, 0x0

    .line 544
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v1    # "child":Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .end local v4    # "success":Z
    :goto_1
    return v5

    .line 533
    .restart local v0    # "arr$":[Ljava/lang/String;
    .restart local v1    # "child":Ljava/lang/String;
    .restart local v2    # "i$":I
    .restart local v3    # "len$":I
    .restart local v4    # "success":Z
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 544
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v1    # "child":Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .end local v4    # "success":Z
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v5

    goto :goto_1
.end method

.method static deleteOldFiles(Landroid/content/Context;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 514
    if-nez p0, :cond_0

    .line 516
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 520
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "localytics"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/localytics/android/LocalyticsProvider;->deleteDirectory(Ljava/io/File;)Z

    .line 521
    return-void
.end method

.method private static getCountProjectionMap()Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 496
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 497
    .local v0, "temp":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "_count"

    const-string v2, "COUNT(*)"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/localytics/android/LocalyticsProvider;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "apiKey"    # Ljava/lang/String;

    .prologue
    .line 128
    if-nez p0, :cond_0

    .line 130
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "context cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 138
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.test.RenamingDelegatingContext"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 140
    new-instance v0, Lcom/localytics/android/LocalyticsProvider;

    invoke-direct {v0, p0, p1}, Lcom/localytics/android/LocalyticsProvider;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 153
    :goto_0
    return-object v0

    .line 143
    :cond_1
    sget-object v2, Lcom/localytics/android/LocalyticsProvider;->sLocalyticsProviderIntrinsicLock:[Ljava/lang/Object;

    monitor-enter v2

    .line 145
    :try_start_0
    sget-object v1, Lcom/localytics/android/LocalyticsProvider;->sLocalyticsProviderMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/localytics/android/LocalyticsProvider;

    .line 147
    .local v0, "provider":Lcom/localytics/android/LocalyticsProvider;
    if-nez v0, :cond_2

    .line 149
    new-instance v0, Lcom/localytics/android/LocalyticsProvider;

    .end local v0    # "provider":Lcom/localytics/android/LocalyticsProvider;
    invoke-direct {v0, p0, p1}, Lcom/localytics/android/LocalyticsProvider;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 150
    .restart local v0    # "provider":Lcom/localytics/android/LocalyticsProvider;
    sget-object v1, Lcom/localytics/android/LocalyticsProvider;->sLocalyticsProviderMap:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    :cond_2
    monitor-exit v2

    goto :goto_0

    .line 154
    .end local v0    # "provider":Lcom/localytics/android/LocalyticsProvider;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static getValidTables()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 469
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 471
    .local v0, "tables":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    const-string v1, "api_keys"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 472
    const-string v1, "attributes"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 473
    const-string v1, "events"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 474
    const-string v1, "event_history"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 475
    const-string v1, "sessions"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 476
    const-string v1, "upload_blobs"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 477
    const-string v1, "upload_blob_events"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 478
    const-string v1, "info"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 479
    const-string v1, "identifiers"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 480
    const-string v1, "amp_rules"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 481
    const-string v1, "amp_ruleevent"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 482
    const-string v1, "amp_conditions"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 483
    const-string v1, "amp_condition_values"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 484
    const-string v1, "amp_displayed"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 485
    const-string v1, "custom_dimensions"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 486
    const-string v1, "profile"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 488
    return-object v0
.end method

.method private static isValidTable(Ljava/lang/String;)Z
    .locals 1
    .param p0, "table"    # Ljava/lang/String;

    .prologue
    .line 454
    if-nez p0, :cond_0

    .line 456
    const/4 v0, 0x0

    .line 459
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/localytics/android/LocalyticsProvider;->sValidTables:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method close()V
    .locals 6

    .prologue
    .line 425
    sget-object v5, Lcom/localytics/android/LocalyticsProvider;->sLocalyticsProviderIntrinsicLock:[Ljava/lang/Object;

    monitor-enter v5

    .line 427
    const/4 v3, 0x0

    .line 428
    .local v3, "key":Ljava/lang/String;
    :try_start_0
    sget-object v4, Lcom/localytics/android/LocalyticsProvider;->sLocalyticsProviderMap:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 430
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/localytics/android/LocalyticsProvider;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-ne p0, v4, :cond_0

    .line 432
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Ljava/lang/String;

    move-object v3, v0

    .line 437
    .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/localytics/android/LocalyticsProvider;>;"
    :cond_1
    if-eqz v3, :cond_2

    .line 439
    sget-object v4, Lcom/localytics/android/LocalyticsProvider;->sLocalyticsProviderMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    :cond_2
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 443
    iget-object v4, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 444
    return-void

    .line 441
    .end local v2    # "i$":Ljava/util/Iterator;
    :catchall_0
    move-exception v4

    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v4
.end method

.method getUserIdAndType()Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 564
    const-string v7, ""

    .line 565
    .local v7, "id":Ljava/lang/String;
    const/4 v8, 0x0

    .line 567
    .local v8, "loggedIn":Z
    const/4 v6, 0x0

    .line 570
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "identifiers"

    const/4 v2, 0x0

    const-string v3, "key = \"customer_id\""

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 572
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 574
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 575
    const/4 v8, 0x1

    .line 580
    :cond_0
    if-eqz v6, :cond_1

    .line 582
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 583
    const/4 v6, 0x0

    .line 587
    :cond_1
    if-nez v8, :cond_3

    .line 591
    :try_start_1
    const-string v1, "api_keys"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "uuid"

    aput-object v3, v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 593
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 595
    const-string v0, "uuid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v7

    .line 600
    :cond_2
    if-eqz v6, :cond_3

    .line 602
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 603
    const/4 v6, 0x0

    .line 608
    :cond_3
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 609
    .local v9, "user":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v0, "id"

    invoke-virtual {v9, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    const-string v1, "type"

    if-eqz v8, :cond_6

    const-string v0, "known"

    :goto_0
    invoke-virtual {v9, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    return-object v9

    .line 580
    .end local v9    # "user":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_4

    .line 582
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 583
    const/4 v6, 0x0

    :cond_4
    throw v0

    .line 600
    :catchall_1
    move-exception v0

    if-eqz v6, :cond_5

    .line 602
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 603
    const/4 v6, 0x0

    :cond_5
    throw v0

    .line 610
    .restart local v9    # "user":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_6
    const-string v0, "anonymous"

    goto :goto_0
.end method

.method public insert(Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 8
    .param p1, "tableName"    # Ljava/lang/String;
    .param p2, "values"    # Landroid/content/ContentValues;

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 190
    invoke-static {p1}, Lcom/localytics/android/LocalyticsProvider;->isValidTable(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 192
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "tableName %s is invalid"

    new-array v4, v7, [Ljava/lang/Object;

    aput-object p1, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 195
    :cond_0
    if-nez p2, :cond_1

    .line 197
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "values cannot be null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 201
    :cond_1
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_2

    .line 203
    const-string v2, "Localytics"

    const-string v3, "Insert table: %s, values: %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v6

    invoke-virtual {p2}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    :cond_2
    iget-object v2, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3, p2}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    .line 208
    .local v0, "result":J
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_3

    .line 210
    const-string v2, "Localytics"

    const-string v3, "Inserted row with new id %d"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    :cond_3
    return-wide v0
.end method

.method public query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10
    .param p1, "tableName"    # Ljava/lang/String;
    .param p2, "projection"    # [Ljava/lang/String;
    .param p3, "selection"    # Ljava/lang/String;
    .param p4, "selectionArgs"    # [Ljava/lang/String;
    .param p5, "sortOrder"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x0

    const/4 v9, 0x1

    const/4 v7, 0x0

    .line 234
    invoke-static {p1}, Lcom/localytics/android/LocalyticsProvider;->isValidTable(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 236
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "tableName %s is invalid"

    new-array v3, v9, [Ljava/lang/Object;

    aput-object p1, v3, v7

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 240
    :cond_0
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_1

    .line 242
    const-string v1, "Localytics"

    const-string v2, "Query table: %s, projection: %s, selection: %s, selectionArgs: %s"

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v7

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v9

    const/4 v4, 0x2

    aput-object p3, v3, v4

    const/4 v4, 0x3

    invoke-static {p4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    :cond_1
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 246
    .local v0, "qb":Landroid/database/sqlite/SQLiteQueryBuilder;
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 248
    if-eqz p2, :cond_2

    array-length v1, p2

    if-ne v9, v1, :cond_2

    const-string v1, "_count"

    aget-object v2, p2, v7

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 250
    sget-object v1, Lcom/localytics/android/LocalyticsProvider;->sCountProjectionMap:Ljava/util/Map;

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setProjectionMap(Ljava/util/Map;)V

    .line 253
    :cond_2
    iget-object v1, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, v5

    move-object v7, p5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 255
    .local v8, "result":Landroid/database/Cursor;
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_3

    .line 257
    const-string v1, "Localytics"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Query result is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v8}, Landroid/database/DatabaseUtils;->dumpCursorToString(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    :cond_3
    return-object v8
.end method

.method public remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 8
    .param p1, "tableName"    # Ljava/lang/String;
    .param p2, "selection"    # Ljava/lang/String;
    .param p3, "selectionArgs"    # [Ljava/lang/String;

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 314
    invoke-static {p1}, Lcom/localytics/android/LocalyticsProvider;->isValidTable(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 316
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "tableName %s is invalid"

    new-array v3, v7, [Ljava/lang/Object;

    aput-object p1, v3, v6

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 320
    :cond_0
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_1

    .line 322
    const-string v1, "Localytics"

    const-string v2, "Delete table: %s, selection: %s, selectionArgs: %s"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v6

    aput-object p2, v3, v7

    const/4 v4, 0x2

    invoke-static {p3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 326
    :cond_1
    if-nez p2, :cond_3

    .line 328
    iget-object v1, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "1"

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 335
    .local v0, "count":I
    :goto_0
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_2

    .line 337
    const-string v1, "Localytics"

    const-string v2, "Deleted %d rows"

    new-array v3, v7, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 340
    :cond_2
    return v0

    .line 332
    .end local v0    # "count":I
    :cond_3
    iget-object v1, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .restart local v0    # "count":I
    goto :goto_0
.end method

.method public runBatchTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    .line 395
    .local p1, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<Ljava/lang/Object;>;"
    if-nez p1, :cond_0

    .line 397
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "callable cannot be null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 401
    :cond_0
    iget-object v2, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 404
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    .line 405
    .local v1, "result":Ljava/lang/Object;
    iget-object v2, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    iget-object v2, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-object v1

    .line 408
    .end local v1    # "result":Ljava/lang/Object;
    :catch_0
    move-exception v0

    .line 410
    .local v0, "e":Ljava/lang/Exception;
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Database batch transaction failed"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 414
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v2

    iget-object v3, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v2
.end method

.method public runBatchTransaction(Ljava/lang/Runnable;)V
    .locals 2
    .param p1, "runnable"    # Ljava/lang/Runnable;

    .prologue
    .line 360
    if-nez p1, :cond_0

    .line 362
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "runnable cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 366
    :cond_0
    iget-object v0, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 369
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 370
    iget-object v0, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    iget-object v0, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 376
    return-void

    .line 374
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 5
    .param p1, "tableName"    # Ljava/lang/String;
    .param p2, "values"    # Landroid/content/ContentValues;
    .param p3, "selection"    # Ljava/lang/String;
    .param p4, "selectionArgs"    # [Ljava/lang/String;

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 281
    invoke-static {p1}, Lcom/localytics/android/LocalyticsProvider;->isValidTable(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 283
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "tableName %s is invalid"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 287
    :cond_0
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_1

    .line 289
    const-string v0, "Localytics"

    const-string v1, "Update table: %s, values: %s, selection: %s, selectionArgs: %s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-virtual {p2}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object p3, v2, v3

    const/4 v3, 0x3

    invoke-static {p4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    :cond_1
    iget-object v0, p0, Lcom/localytics/android/LocalyticsProvider;->mDb:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
