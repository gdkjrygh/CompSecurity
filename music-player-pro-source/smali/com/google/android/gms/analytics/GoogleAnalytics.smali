.class public Lcom/google/android/gms/analytics/GoogleAnalytics;
.super Lcom/google/android/gms/analytics/TrackerHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/analytics/GoogleAnalytics$b;,
        Lcom/google/android/gms/analytics/GoogleAnalytics$a;
    }
.end annotation


# static fields
.field private static Bm:Z

.field private static Bs:Lcom/google/android/gms/analytics/GoogleAnalytics;


# instance fields
.field private Bn:Lcom/google/android/gms/analytics/aj;

.field private volatile Bo:Ljava/lang/Boolean;

.field private Bp:Lcom/google/android/gms/analytics/Logger;

.field private Bq:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/analytics/GoogleAnalytics$a;",
            ">;"
        }
    .end annotation
.end field

.field private Br:Z

.field private mContext:Landroid/content/Context;

.field private yV:Lcom/google/android/gms/analytics/f;

.field private ya:Ljava/lang/String;

.field private yb:Ljava/lang/String;

.field private yt:Z


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/analytics/x;->A(Landroid/content/Context;)Lcom/google/android/gms/analytics/x;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/analytics/v;->eu()Lcom/google/android/gms/analytics/v;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;-><init>(Landroid/content/Context;Lcom/google/android/gms/analytics/f;Lcom/google/android/gms/analytics/aj;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/analytics/f;Lcom/google/android/gms/analytics/aj;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "thread"    # Lcom/google/android/gms/analytics/f;
    .param p3, "serviceManager"    # Lcom/google/android/gms/analytics/aj;

    .prologue
    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/TrackerHandler;-><init>()V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bo:Ljava/lang/Boolean;

    iput-boolean v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Br:Z

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yV:Lcom/google/android/gms/analytics/f;

    iput-object p3, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bn:Lcom/google/android/gms/analytics/aj;

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/analytics/g;->y(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/analytics/ai;->y(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/analytics/k;->y(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/analytics/p;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/p;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bp:Lcom/google/android/gms/analytics/Logger;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bq:Ljava/util/Set;

    invoke-direct {p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->eZ()V

    return-void
.end method

.method private a(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->ya:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "&an"

    iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->ya:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yb:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "&av"

    iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yb:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method private ai(Ljava/lang/String;)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "verbose"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const-string v1, "info"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "warning"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    const-string v1, "error"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x3

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    goto :goto_0
.end method

.method static eY()Lcom/google/android/gms/analytics/GoogleAnalytics;
    .locals 2

    const-class v1, Lcom/google/android/gms/analytics/GoogleAnalytics;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bs:Lcom/google/android/gms/analytics/GoogleAnalytics;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private eZ()V
    .locals 4

    sget-boolean v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bm:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x81

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    if-nez v0, :cond_2

    const-string v0, "Couldn\'t get ApplicationInfo to load gloabl config."

    invoke-static {v0}, Lcom/google/android/gms/analytics/ae;->W(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PackageManager doesn\'t know about package: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/ae;->V(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_1

    :cond_2
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const-string v1, "com.google.android.gms.analytics.globalConfigResource"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    new-instance v1, Lcom/google/android/gms/analytics/z;

    iget-object v2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/google/android/gms/analytics/z;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/analytics/z;->x(I)Lcom/google/android/gms/analytics/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/aa;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/aa;)V

    goto :goto_0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const-class v1, Lcom/google/android/gms/analytics/GoogleAnalytics;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bs:Lcom/google/android/gms/analytics/GoogleAnalytics;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bs:Lcom/google/android/gms/analytics/GoogleAnalytics;

    :cond_0
    sget-object v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bs:Lcom/google/android/gms/analytics/GoogleAnalytics;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method a(Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bq:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Application;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->enableAutoActivityReports(Landroid/app/Application;)V

    :cond_0
    return-void
.end method

.method a(Lcom/google/android/gms/analytics/aa;)V
    .locals 3

    const-string v0, "Loading global config values."

    invoke-static {v0}, Lcom/google/android/gms/analytics/ae;->V(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eO()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eP()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->ya:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "app name loaded: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->ya:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/ae;->V(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eQ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eR()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yb:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "app version loaded: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yb:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/ae;->V(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eS()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eT()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->ai(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "log level loaded: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/analytics/ae;->V(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/analytics/Logger;->setLogLevel(I)V

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eU()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bn:Lcom/google/android/gms/analytics/aj;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eV()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/aj;->setLocalDispatchPeriod(I)V

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eW()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/aa;->eX()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->setDryRun(Z)V

    :cond_4
    return-void
.end method

.method b(Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bq:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method dY()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yV:Lcom/google/android/gms/analytics/f;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/f;->dY()V

    return-void
.end method

.method public dispatchLocalHits()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bn:Lcom/google/android/gms/analytics/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/aj;->dispatchLocalHits()V

    return-void
.end method

.method public enableAutoActivityReports(Landroid/app/Application;)V
    .locals 2
    .param p1, "application"    # Landroid/app/Application;

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Br:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/analytics/GoogleAnalytics$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/GoogleAnalytics$b;-><init>(Lcom/google/android/gms/analytics/GoogleAnalytics;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Br:Z

    :cond_0
    return-void
.end method

.method g(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bq:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/GoogleAnalytics$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics$a;->i(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getAppOptOut()Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/y$a;->AN:Lcom/google/android/gms/analytics/y$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->a(Lcom/google/android/gms/analytics/y$a;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bo:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getLogger()Lcom/google/android/gms/analytics/Logger;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bp:Lcom/google/android/gms/analytics/Logger;

    return-object v0
.end method

.method h(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bq:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/GoogleAnalytics$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics$a;->j(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public isDryRunEnabled()Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/y$a;->AZ:Lcom/google/android/gms/analytics/y$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->a(Lcom/google/android/gms/analytics/y$a;)V

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yt:Z

    return v0
.end method

.method public newTracker(I)Lcom/google/android/gms/analytics/Tracker;
    .locals 3
    .param p1, "configResId"    # I

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/y$a;->AJ:Lcom/google/android/gms/analytics/y$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->a(Lcom/google/android/gms/analytics/y$a;)V

    new-instance v1, Lcom/google/android/gms/analytics/Tracker;

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p0, v2}, Lcom/google/android/gms/analytics/Tracker;-><init>(Ljava/lang/String;Lcom/google/android/gms/analytics/TrackerHandler;Landroid/content/Context;)V

    if-lez p1, :cond_0

    new-instance v0, Lcom/google/android/gms/analytics/al;

    iget-object v2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/google/android/gms/analytics/al;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/al;->x(I)Lcom/google/android/gms/analytics/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/am;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/analytics/Tracker;->a(Lcom/google/android/gms/analytics/am;)V

    :cond_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public newTracker(Ljava/lang/String;)Lcom/google/android/gms/analytics/Tracker;
    .locals 2
    .param p1, "trackingId"    # Ljava/lang/String;

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/y$a;->AJ:Lcom/google/android/gms/analytics/y$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->a(Lcom/google/android/gms/analytics/y$a;)V

    new-instance v0, Lcom/google/android/gms/analytics/Tracker;

    iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;

    invoke-direct {v0, p1, p0, v1}, Lcom/google/android/gms/analytics/Tracker;-><init>(Ljava/lang/String;Lcom/google/android/gms/analytics/TrackerHandler;Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public reportActivityStart(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Br:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->g(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public reportActivityStop(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Br:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->h(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public setAppOptOut(Z)V
    .locals 2
    .param p1, "optOut"    # Z

    .prologue
    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/y$a;->AM:Lcom/google/android/gms/analytics/y$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->a(Lcom/google/android/gms/analytics/y$a;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bo:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bo:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yV:Lcom/google/android/gms/analytics/f;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/f;->dQ()V

    :cond_0
    return-void
.end method

.method public setDryRun(Z)V
    .locals 2
    .param p1, "dryRun"    # Z

    .prologue
    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/y$a;->AY:Lcom/google/android/gms/analytics/y$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->a(Lcom/google/android/gms/analytics/y$a;)V

    iput-boolean p1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yt:Z

    return-void
.end method

.method public setLocalDispatchPeriod(I)V
    .locals 1
    .param p1, "dispatchPeriodInSeconds"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bn:Lcom/google/android/gms/analytics/aj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/aj;->setLocalDispatchPeriod(I)V

    return-void
.end method

.method public setLogger(Lcom/google/android/gms/analytics/Logger;)V
    .locals 2
    .param p1, "logger"    # Lcom/google/android/gms/analytics/Logger;

    .prologue
    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/y$a;->Ba:Lcom/google/android/gms/analytics/y$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->a(Lcom/google/android/gms/analytics/y$a;)V

    iput-object p1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Bp:Lcom/google/android/gms/analytics/Logger;

    return-void
.end method

.method u(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "hit cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    const-string v0, "&ul"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "&sr"

    invoke-static {}, Lcom/google/android/gms/analytics/ai;->fl()Lcom/google/android/gms/analytics/ai;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/analytics/q;)V

    const-string v0, "&_u"

    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/y;->eM()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/y;->eL()Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->yV:Lcom/google/android/gms/analytics/f;

    invoke-interface {v0, p1}, Lcom/google/android/gms/analytics/f;->u(Ljava/util/Map;)V

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method
