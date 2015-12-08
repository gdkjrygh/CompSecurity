.class public final Lcom/crashlytics/android/Crashlytics;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/crashlytics/android/Crashlytics;

.field private static c:I

.field private static o:Landroid/content/ContextWrapper;

.field private static p:Ljava/lang/String;

.field private static q:Ljava/lang/String;

.field private static r:Ljava/lang/String;

.field private static s:Ljava/lang/String;

.field private static t:Ljava/lang/String;

.field private static u:Ljava/lang/String;

.field private static v:Ljava/lang/String;

.field private static w:Ljava/io/File;

.field private static x:Z

.field private static y:Lcom/crashlytics/android/PinningInfoProvider;


# instance fields
.field a:Ljava/lang/String;

.field private final d:J

.field private final e:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Lcom/crashlytics/android/au;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/crashlytics/android/CrashlyticsListener;

.field private h:Lcom/crashlytics/android/E;

.field private i:Lcom/crashlytics/android/IdManager;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Lcom/crashlytics/android/SettingsController;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 112
    sput-object v1, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    .line 139
    const/4 v0, 0x4

    sput v0, Lcom/crashlytics/android/Crashlytics;->c:I

    .line 174
    const/4 v0, 0x0

    sput-boolean v0, Lcom/crashlytics/android/Crashlytics;->x:Z

    .line 175
    sput-object v1, Lcom/crashlytics/android/Crashlytics;->y:Lcom/crashlytics/android/PinningInfoProvider;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/Crashlytics;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 154
    iput-object v1, p0, Lcom/crashlytics/android/Crashlytics;->i:Lcom/crashlytics/android/IdManager;

    .line 156
    iput-object v1, p0, Lcom/crashlytics/android/Crashlytics;->j:Ljava/lang/String;

    .line 157
    iput-object v1, p0, Lcom/crashlytics/android/Crashlytics;->k:Ljava/lang/String;

    .line 158
    iput-object v1, p0, Lcom/crashlytics/android/Crashlytics;->l:Ljava/lang/String;

    .line 159
    iput-object v1, p0, Lcom/crashlytics/android/Crashlytics;->a:Ljava/lang/String;

    .line 179
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/Crashlytics;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 180
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/crashlytics/android/Crashlytics;->d:J

    .line 181
    return-void
.end method

.method static synthetic a(Lcom/crashlytics/android/Crashlytics;FI)I
    .locals 1

    .prologue
    .line 50
    int-to-float v0, p2

    mul-float/2addr v0, p1

    float-to-int v0, v0

    return v0
.end method

.method private a(Lcom/crashlytics/android/ak;)Lcom/crashlytics/android/h;
    .locals 11

    .prologue
    .line 1102
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/crashlytics/android/Crashlytics;->m:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/crashlytics/android/aB;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1103
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->q:Ljava/lang/String;

    invoke-static {v0}, Lcom/crashlytics/android/B;->a(Ljava/lang/String;)Lcom/crashlytics/android/B;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/B;->a()I

    move-result v7

    .line 1105
    new-instance v0, Lcom/crashlytics/android/h;

    sget-object v1, Lcom/crashlytics/android/Crashlytics;->u:Ljava/lang/String;

    sget-object v2, Lcom/crashlytics/android/Crashlytics;->p:Ljava/lang/String;

    sget-object v3, Lcom/crashlytics/android/Crashlytics;->t:Ljava/lang/String;

    sget-object v4, Lcom/crashlytics/android/Crashlytics;->s:Ljava/lang/String;

    sget-object v6, Lcom/crashlytics/android/Crashlytics;->r:Ljava/lang/String;

    sget-object v8, Lcom/crashlytics/android/Crashlytics;->v:Ljava/lang/String;

    const-string v9, "0"

    move-object v10, p1

    invoke-direct/range {v0 .. v10}, Lcom/crashlytics/android/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/ak;)V

    return-object v0
.end method

.method private a(Lcom/crashlytics/android/D;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/crashlytics/android/D",
            "<TT;>;TT;)TT;"
        }
    .end annotation

    .prologue
    .line 767
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/au;

    .line 768
    if-nez v0, :cond_0

    :goto_0
    return-object p2

    :cond_0
    invoke-interface {p1, v0}, Lcom/crashlytics/android/D;->a(Lcom/crashlytics/android/au;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    const/16 v1, 0x400

    .line 816
    if-eqz p0, :cond_0

    .line 817
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 818
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_0

    .line 819
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 822
    :cond_0
    return-object p0
.end method

.method static synthetic a(Lcom/crashlytics/android/Crashlytics;Landroid/content/Context;F)V
    .locals 12

    .prologue
    .line 50
    const-string v0, "https://settings.crashlytics.com/spi/v1/platforms/android/apps/%s/settings"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    sget-object v3, Lcom/crashlytics/android/Crashlytics;->p:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v8, Lcom/crashlytics/android/ae;

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->l()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v8, v1, v0}, Lcom/crashlytics/android/ae;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Lcom/crashlytics/android/ac;

    invoke-direct {v9}, Lcom/crashlytics/android/ac;-><init>()V

    new-instance v10, Lcom/crashlytics/android/av;

    invoke-direct {v10}, Lcom/crashlytics/android/av;-><init>()V

    new-instance v11, Lcom/crashlytics/android/m;

    invoke-direct {v11}, Lcom/crashlytics/android/m;-><init>()V

    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->n:Lcom/crashlytics/android/SettingsController;

    if-nez v0, :cond_0

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->u:Ljava/lang/String;

    sget-object v1, Lcom/crashlytics/android/Crashlytics;->p:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/crashlytics/android/Crashlytics;->m:Ljava/lang/String;

    aput-object v3, v0, v1

    invoke-static {v0}, Lcom/crashlytics/android/aB;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->q:Ljava/lang/String;

    invoke-static {v0}, Lcom/crashlytics/android/B;->a(Ljava/lang/String;)Lcom/crashlytics/android/B;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/B;->a()I

    move-result v6

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->v()Ljava/lang/String;

    move-result-object v7

    new-instance v0, Lcom/crashlytics/android/aw;

    sget-object v1, Lcom/crashlytics/android/Crashlytics;->u:Ljava/lang/String;

    sget-object v4, Lcom/crashlytics/android/Crashlytics;->t:Ljava/lang/String;

    sget-object v5, Lcom/crashlytics/android/Crashlytics;->s:Ljava/lang/String;

    invoke-direct/range {v0 .. v7}, Lcom/crashlytics/android/aw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/crashlytics/android/SettingsController;

    move-object v2, v0

    move-object v3, v9

    move-object v4, v10

    move-object v5, v11

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Lcom/crashlytics/android/SettingsController;-><init>(Lcom/crashlytics/android/aw;Lcom/crashlytics/android/ac;Lcom/crashlytics/android/av;Lcom/crashlytics/android/m;Lcom/crashlytics/android/ay;)V

    iput-object v1, p0, Lcom/crashlytics/android/Crashlytics;->n:Lcom/crashlytics/android/SettingsController;

    :cond_0
    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->n:Lcom/crashlytics/android/SettingsController;

    invoke-virtual {v0}, Lcom/crashlytics/android/SettingsController;->a()Lcom/crashlytics/android/au;

    move-result-object v2

    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v2

    :goto_0
    if-eqz v5, :cond_8

    :try_start_1
    invoke-virtual {v5}, Lcom/crashlytics/android/au;->b()Lcom/crashlytics/android/i;

    move-result-object v2

    const/4 v0, 0x1

    invoke-virtual {v2}, Lcom/crashlytics/android/i;->d()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->w()Lcom/crashlytics/android/ak;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/crashlytics/android/Crashlytics;->a(Lcom/crashlytics/android/ak;)Lcom/crashlytics/android/h;

    move-result-object v0

    new-instance v6, Lcom/crashlytics/android/Z;

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->l()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/crashlytics/android/i;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v7, v2}, Lcom/crashlytics/android/Z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lcom/crashlytics/android/Z;->a(Lcom/crashlytics/android/h;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/crashlytics/android/Crashlytics;->u()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    :cond_1
    :goto_1
    move v2, v0

    :goto_2
    :try_start_2
    invoke-virtual {v5}, Lcom/crashlytics/android/au;->c()Lcom/crashlytics/android/ax;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/ax;->a()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result v0

    :goto_3
    if-eqz v2, :cond_7

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    :try_start_3
    iget-object v1, p0, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    invoke-virtual {v1}, Lcom/crashlytics/android/E;->b()V

    invoke-virtual {p0}, Lcom/crashlytics/android/Crashlytics;->s()Lcom/crashlytics/android/ab;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lcom/crashlytics/android/ar;

    invoke-direct {v2, v1}, Lcom/crashlytics/android/ar;-><init>(Lcom/crashlytics/android/ab;)V

    invoke-virtual {v2, p1, p2}, Lcom/crashlytics/android/ar;->a(Landroid/content/Context;F)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :cond_2
    :goto_4
    if-eqz v0, :cond_3

    const-string v0, "Crash reporting disabled."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    :cond_3
    return-void

    :catch_0
    move-exception v0

    const-string v5, "Error dealing with settings"

    invoke-static {v5, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v5, v2

    goto :goto_0

    :cond_4
    :try_start_4
    const-string v0, "Failed to create app with Crashlytics service."

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Lcom/crashlytics/android/i;->e()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-direct {p0}, Lcom/crashlytics/android/Crashlytics;->u()Z

    move-result v0

    goto :goto_1

    :cond_6
    invoke-virtual {v2}, Lcom/crashlytics/android/i;->c()Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "Server says an update is required - forcing a full App update."

    invoke-static {v6}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->w()Lcom/crashlytics/android/ak;

    move-result-object v6

    invoke-direct {p0, v6}, Lcom/crashlytics/android/Crashlytics;->a(Lcom/crashlytics/android/ak;)Lcom/crashlytics/android/h;

    move-result-object v6

    new-instance v7, Lcom/crashlytics/android/aA;

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->l()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/crashlytics/android/i;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v7, v8, v2}, Lcom/crashlytics/android/aA;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Lcom/crashlytics/android/aA;->a(Lcom/crashlytics/android/h;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v2, "Error performing auto configuration."

    invoke-static {v2, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v2, v4

    goto :goto_2

    :catch_2
    move-exception v0

    const-string v4, "Error getting collect reports setting."

    invoke-static {v4, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v3

    goto :goto_3

    :catch_3
    move-exception v1

    const-string v2, "Error sending crash report"

    invoke-static {v2, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_7
    move v0, v1

    goto :goto_4

    :cond_8
    move v0, v3

    move v2, v4

    goto :goto_3
.end method

.method private declared-synchronized a(Ljava/lang/String;Landroid/content/Context;F)V
    .locals 9

    .prologue
    .line 832
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 833
    const-string v0, "Crashlytics already started, ignoring re-initialization attempt."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 957
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 837
    :cond_1
    :try_start_1
    sput-object p1, Lcom/crashlytics/android/Crashlytics;->u:Ljava/lang/String;

    .line 838
    new-instance v0, Landroid/content/ContextWrapper;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    .line 840
    const/4 v0, 0x4

    const-string v1, "Crashlytics"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Initializing Crashlytics "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getCrashlyticsVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/crashlytics/android/aB;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 843
    :try_start_2
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/Crashlytics;->p:Ljava/lang/String;

    .line 844
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 846
    sget-object v1, Lcom/crashlytics/android/Crashlytics;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/crashlytics/android/Crashlytics;->q:Ljava/lang/String;

    .line 847
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Installer package name is: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/crashlytics/android/Crashlytics;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 849
    sget-object v1, Lcom/crashlytics/android/Crashlytics;->p:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 850
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/crashlytics/android/Crashlytics;->s:Ljava/lang/String;

    .line 851
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v0, "0.0"

    :goto_1
    sput-object v0, Lcom/crashlytics/android/Crashlytics;->t:Ljava/lang/String;

    .line 852
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/Crashlytics;->r:Ljava/lang/String;

    .line 854
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/Crashlytics;->v:Ljava/lang/String;

    .line 857
    const/4 v0, 0x0

    sget-object v1, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    const-string v2, "com.crashlytics.android.build_id"

    const-string v3, "string"

    invoke-static {v1, v2, v3}, Lcom/crashlytics/android/aB;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Build ID is: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    :cond_2
    iput-object v0, p0, Lcom/crashlytics/android/Crashlytics;->m:Ljava/lang/String;

    .line 859
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v2, "com.crashlytics.sdk.android"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v1, Lcom/crashlytics/android/Crashlytics;->w:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->w:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 864
    :cond_3
    :goto_2
    :try_start_3
    new-instance v0, Lcom/crashlytics/android/IdManager;

    sget-object v1, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-direct {v0, v1}, Lcom/crashlytics/android/IdManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/crashlytics/android/Crashlytics;->i:Lcom/crashlytics/android/IdManager;

    .line 867
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->i:Lcom/crashlytics/android/IdManager;

    invoke-virtual {v0}, Lcom/crashlytics/android/IdManager;->g()Ljava/lang/String;

    .line 870
    new-instance v0, Lcom/crashlytics/android/j;

    iget-object v1, p0, Lcom/crashlytics/android/Crashlytics;->m:Ljava/lang/String;

    sget-object v2, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    const-string v3, "com.crashlytics.RequireBuildId"

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lcom/crashlytics/android/aB;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/crashlytics/android/j;-><init>(Ljava/lang/String;Z)V

    sget-object v1, Lcom/crashlytics/android/Crashlytics;->p:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/j;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 873
    :try_start_4
    const-string v0, "Installing exception handler..."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 874
    new-instance v0, Lcom/crashlytics/android/E;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    iget-object v2, p0, Lcom/crashlytics/android/Crashlytics;->g:Lcom/crashlytics/android/CrashlyticsListener;

    iget-object v3, p0, Lcom/crashlytics/android/Crashlytics;->m:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/crashlytics/android/E;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/crashlytics/android/CrashlyticsListener;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    .line 876
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    invoke-virtual {v0}, Lcom/crashlytics/android/E;->d()V

    .line 877
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 878
    const-string v0, "Successfully installed exception handler."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 885
    :goto_3
    :try_start_5
    new-instance v2, Ljava/io/File;

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->w:Ljava/io/File;

    const-string v1, "initialization_marker"

    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 889
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v7

    .line 891
    if-eqz v7, :cond_4

    .line 892
    const-string v0, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 897
    :cond_4
    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 903
    new-instance v6, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 905
    new-instance v8, Ljava/lang/Thread;

    new-instance v0, Lcom/crashlytics/android/A;

    move-object v1, p0

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/crashlytics/android/A;-><init>(Lcom/crashlytics/android/Crashlytics;Ljava/io/File;Ljava/util/concurrent/CountDownLatch;Landroid/content/Context;FLjava/util/concurrent/CountDownLatch;)V

    const-string v1, "Crashlytics Initializer"

    invoke-direct {v8, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Thread;->start()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 938
    const-wide/16 v0, 0x1f4

    :try_start_6
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 947
    :goto_4
    if-eqz v7, :cond_0

    .line 951
    const-wide/16 v0, 0xdac

    :try_start_7
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v0, v1, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_0

    .line 953
    :catch_0
    move-exception v0

    const/4 v0, 0x5

    :try_start_8
    const-string v1, "Crashlytics"

    const-string v2, "Crashlytics initialization was not completed in the allotted time."

    invoke-static {v0, v1, v2}, Lcom/crashlytics/android/aB;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto/16 :goto_0

    .line 832
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 851
    :cond_5
    :try_start_9
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto/16 :goto_1

    .line 860
    :catch_1
    move-exception v0

    .line 861
    :try_start_a
    const-string v1, "Error setting up app properties"

    invoke-static {v1, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_2

    .line 879
    :catch_2
    move-exception v0

    .line 880
    const-string v1, "There was a problem installing the exception handler."

    invoke-static {v1, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 940
    :catch_3
    move-exception v0

    const/4 v0, 0x5

    const-string v1, "Crashlytics"

    const-string v2, "Crashlytics initialization marker file was not created in the allotted time."

    invoke-static {v0, v1, v2}, Lcom/crashlytics/android/aB;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_4
.end method

.method static a(Z)V
    .locals 3

    .prologue
    .line 603
    invoke-static {}, Lcom/crashlytics/android/aB;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "always_send_reports_opt_in"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 604
    return-void
.end method

.method static synthetic a(Lcom/crashlytics/android/Crashlytics;Landroid/app/Activity;Lcom/crashlytics/android/am;)Z
    .locals 6

    .prologue
    .line 50
    new-instance v4, Lcom/crashlytics/android/af;

    invoke-direct {v4, p1, p2}, Lcom/crashlytics/android/af;-><init>(Landroid/content/Context;Lcom/crashlytics/android/am;)V

    new-instance v3, Lcom/crashlytics/android/C;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lcom/crashlytics/android/C;-><init>(Lcom/crashlytics/android/Crashlytics;B)V

    new-instance v0, Lcom/crashlytics/android/w;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/crashlytics/android/w;-><init>(Lcom/crashlytics/android/Crashlytics;Landroid/app/Activity;Lcom/crashlytics/android/C;Lcom/crashlytics/android/af;Lcom/crashlytics/android/am;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const-string v0, "Waiting for user opt-in."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/crashlytics/android/C;->b()V

    invoke-virtual {v3}, Lcom/crashlytics/android/C;->a()Z

    move-result v0

    return v0
.end method

.method static b()I
    .locals 1

    .prologue
    .line 519
    sget v0, Lcom/crashlytics/android/Crashlytics;->c:I

    return v0
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 772
    .line 775
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 776
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 777
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v3, 0x80

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 779
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 780
    if-eqz v0, :cond_2

    .line 781
    const-string v2, "com.crashlytics.ApiKey"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 789
    :goto_0
    invoke-static {v0}, Lcom/crashlytics/android/aB;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 791
    const-string v2, "com.crashlytics.ApiKey"

    const-string v3, "string"

    invoke-static {p0, v2, v3}, Lcom/crashlytics/android/aB;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 792
    if-eqz v2, :cond_0

    .line 793
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 797
    :cond_0
    invoke-static {v0}, Lcom/crashlytics/android/aB;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 798
    sget-boolean v2, Lcom/crashlytics/android/Crashlytics;->x:Z

    if-nez v2, :cond_1

    invoke-static {p0}, Lcom/crashlytics/android/aB;->d(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 799
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 783
    :catch_0
    move-exception v0

    .line 786
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Caught non-fatal exception while retrieving apiKey: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    :cond_2
    move-object v0, v1

    goto :goto_0

    .line 801
    :cond_3
    const-string v2, "Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>"

    invoke-static {v2, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 805
    :cond_4
    return-object v0
.end method

.method static d()Landroid/content/ContextWrapper;
    .locals 1

    .prologue
    .line 527
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    return-object v0
.end method

.method static e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 536
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->p:Ljava/lang/String;

    return-object v0
.end method

.method static f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 546
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->q:Ljava/lang/String;

    return-object v0
.end method

.method static g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 550
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->t:Ljava/lang/String;

    return-object v0
.end method

.method public static getCrashlyticsVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 508
    const-string v0, "1.0.4.15"

    return-object v0
.end method

.method public static declared-synchronized getInstance()Lcom/crashlytics/android/Crashlytics;
    .locals 2

    .prologue
    .line 225
    const-class v1, Lcom/crashlytics/android/Crashlytics;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    if-nez v0, :cond_0

    .line 226
    new-instance v0, Lcom/crashlytics/android/Crashlytics;

    invoke-direct {v0}, Lcom/crashlytics/android/Crashlytics;-><init>()V

    sput-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    .line 229
    :cond_0
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 225
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static getPinningInfoProvider()Lcom/crashlytics/android/PinningInfoProvider;
    .locals 1

    .prologue
    .line 462
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->y:Lcom/crashlytics/android/PinningInfoProvider;

    return-object v0
.end method

.method static h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 554
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->s:Ljava/lang/String;

    return-object v0
.end method

.method static i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 558
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->u:Ljava/lang/String;

    return-object v0
.end method

.method static j()Ljava/io/File;
    .locals 1

    .prologue
    .line 562
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->w:Ljava/io/File;

    return-object v0
.end method

.method static k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 566
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->r:Ljava/lang/String;

    return-object v0
.end method

.method static l()Ljava/lang/String;
    .locals 2

    .prologue
    .line 570
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    const-string v1, "com.crashlytics.ApiEndpoint"

    invoke-static {v0, v1}, Lcom/crashlytics/android/aB;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static log(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "priority"    # I
    .param p1, "tag"    # Ljava/lang/String;
    .param p2, "msg"    # Ljava/lang/String;

    .prologue
    .line 284
    invoke-static {p2}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    .line 286
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/crashlytics/android/aB;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 287
    return-void
.end method

.method public static log(Ljava/lang/String;)V
    .locals 4
    .param p0, "msg"    # Ljava/lang/String;

    .prologue
    .line 261
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    iget-object v0, v0, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    if-nez v0, :cond_1

    .line 262
    :cond_0
    const-string v0, "Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging messages."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 268
    :goto_0
    return-void

    .line 266
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    iget-wide v2, v2, Lcom/crashlytics/android/Crashlytics;->d:J

    sub-long/2addr v0, v2

    .line 267
    sget-object v2, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    iget-object v2, v2, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    invoke-virtual {v2, v0, v1, p0}, Lcom/crashlytics/android/E;->a(JLjava/lang/String;)V

    goto :goto_0
.end method

.method public static logException(Ljava/lang/Throwable;)V
    .locals 2
    .param p0, "throwable"    # Ljava/lang/Throwable;

    .prologue
    .line 241
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    iget-object v0, v0, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    if-nez v0, :cond_1

    .line 242
    :cond_0
    const-string v0, "Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging exceptions."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 248
    :goto_0
    return-void

    .line 247
    :cond_1
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    iget-object v0, v0, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lcom/crashlytics/android/E;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static n()Z
    .locals 3

    .prologue
    .line 599
    invoke-static {}, Lcom/crashlytics/android/aB;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "always_send_reports_opt_in"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static setApplicationInstallationIdentifier(Ljava/lang/String;)V
    .locals 2
    .param p0, "identifier"    # Ljava/lang/String;

    .prologue
    .line 336
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    invoke-static {p0}, Lcom/crashlytics/android/Crashlytics;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/crashlytics/android/Crashlytics;->a:Ljava/lang/String;

    .line 337
    return-void
.end method

.method public static setBool(Ljava/lang/String;Z)V
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # Z

    .prologue
    .line 376
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    return-void
.end method

.method public static setDouble(Ljava/lang/String;D)V
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # D

    .prologue
    .line 385
    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    return-void
.end method

.method public static setFloat(Ljava/lang/String;F)V
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # F

    .prologue
    .line 394
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    return-void
.end method

.method public static setInt(Ljava/lang/String;I)V
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # I

    .prologue
    .line 403
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    return-void
.end method

.method public static setLong(Ljava/lang/String;J)V
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # J

    .prologue
    .line 412
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/crashlytics/android/Crashlytics;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    return-void
.end method

.method public static setPinningInfoProvider(Lcom/crashlytics/android/PinningInfoProvider;)V
    .locals 1
    .param p0, "pinningInfo"    # Lcom/crashlytics/android/PinningInfoProvider;

    .prologue
    .line 455
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->y:Lcom/crashlytics/android/PinningInfoProvider;

    if-eq v0, p0, :cond_0

    .line 456
    sput-object p0, Lcom/crashlytics/android/Crashlytics;->y:Lcom/crashlytics/android/PinningInfoProvider;

    .line 457
    invoke-static {}, Lcom/crashlytics/android/aB;->g()V

    .line 459
    :cond_0
    return-void
.end method

.method public static setString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 348
    if-nez p0, :cond_1

    .line 349
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-static {v0}, Lcom/crashlytics/android/aB;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Custom attribute key cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 352
    :cond_0
    const-string v0, "Attempting to set custom attribute with null key, ignoring."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 368
    :goto_0
    return-void

    .line 356
    :cond_1
    invoke-static {p0}, Lcom/crashlytics/android/Crashlytics;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 357
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    iget-object v0, v0, Lcom/crashlytics/android/Crashlytics;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    const/16 v1, 0x40

    if-lt v0, v1, :cond_2

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    iget-object v0, v0, Lcom/crashlytics/android/Crashlytics;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 359
    :cond_2
    if-nez p1, :cond_3

    .line 360
    const-string p1, ""

    .line 364
    :goto_1
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->b:Lcom/crashlytics/android/Crashlytics;

    iget-object v0, v0, Lcom/crashlytics/android/Crashlytics;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 362
    :cond_3
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 366
    :cond_4
    const-string v0, "Exceeded maximum number of custom attributes (64)"

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static setUserEmail(Ljava/lang/String;)V
    .locals 2
    .param p0, "email"    # Ljava/lang/String;

    .prologue
    .line 329
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    invoke-static {p0}, Lcom/crashlytics/android/Crashlytics;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/crashlytics/android/Crashlytics;->k:Ljava/lang/String;

    .line 330
    return-void
.end method

.method public static setUserIdentifier(Ljava/lang/String;)V
    .locals 2
    .param p0, "identifier"    # Ljava/lang/String;

    .prologue
    .line 311
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    invoke-static {p0}, Lcom/crashlytics/android/Crashlytics;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/crashlytics/android/Crashlytics;->j:Ljava/lang/String;

    .line 312
    return-void
.end method

.method public static setUserName(Ljava/lang/String;)V
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 320
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    invoke-static {p0}, Lcom/crashlytics/android/Crashlytics;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/crashlytics/android/Crashlytics;->l:Ljava/lang/String;

    .line 321
    return-void
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 190
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p0, v0}, Lcom/crashlytics/android/Crashlytics;->start(Landroid/content/Context;F)V

    .line 191
    return-void
.end method

.method public static start(Landroid/content/Context;F)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "delay"    # F

    .prologue
    .line 201
    if-nez p0, :cond_0

    .line 202
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_0
    invoke-static {p0}, Lcom/crashlytics/android/Crashlytics;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 207
    if-nez v0, :cond_1

    .line 219
    :goto_0
    return-void

    .line 212
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v1

    invoke-direct {v1, v0, p0, p1}, Lcom/crashlytics/android/Crashlytics;->a(Ljava/lang/String;Landroid/content/Context;F)V
    :try_end_0
    .catch Lcom/crashlytics/android/CrashlyticsMissingDependencyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 213
    :catch_0
    move-exception v0

    .line 215
    throw v0

    .line 216
    :catch_1
    move-exception v0

    .line 217
    const-string v1, "Crashlytics was not started due to an exception during initialization"

    invoke-static {v1, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private u()Z
    .locals 3

    .prologue
    .line 1070
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->n:Lcom/crashlytics/android/SettingsController;

    sget-object v1, Lcom/crashlytics/android/SettingsController$CacheBehavior;->SKIP_CACHE_LOOKUP:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/SettingsController;->a(Lcom/crashlytics/android/SettingsController$CacheBehavior;)Lcom/crashlytics/android/au;

    move-result-object v0

    .line 1071
    iget-object v1, p0, Lcom/crashlytics/android/Crashlytics;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1073
    if-nez v0, :cond_0

    .line 1074
    const-string v1, "Failed to force reload of settings from Crashlytics."

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1077
    :cond_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static v()Ljava/lang/String;
    .locals 5

    .prologue
    .line 1118
    const/4 v1, 0x0

    .line 1121
    :try_start_0
    const-string v0, "SHA-1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 1123
    sget-object v2, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 1124
    sget-object v3, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1

    .line 1126
    const/16 v2, 0x400

    new-array v2, v2, [B

    .line 1130
    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    .line 1131
    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4, v3}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1135
    :catch_0
    move-exception v0

    .line 1136
    :try_start_1
    const-string v2, "Could not calculate hash for app icon."

    invoke-static {v2, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1138
    const-string v0, "Failed to close icon input stream."

    invoke-static {v1, v0}, Lcom/crashlytics/android/aB;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 1141
    const-string v0, ""

    :goto_1
    return-object v0

    .line 1134
    :cond_0
    :try_start_2
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->b([B)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 1138
    const-string v2, "Failed to close icon input stream."

    invoke-static {v1, v2}, Lcom/crashlytics/android/aB;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    const-string v2, "Failed to close icon input stream."

    invoke-static {v1, v2}, Lcom/crashlytics/android/aB;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0
.end method

.method private static w()Lcom/crashlytics/android/ak;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 1153
    :try_start_0
    sget-object v1, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 1154
    sget-object v2, Lcom/crashlytics/android/Crashlytics;->o:Landroid/content/ContextWrapper;

    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 1155
    :try_start_1
    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 1157
    if-nez v3, :cond_0

    .line 1159
    const/4 v1, 0x5

    const-string v3, "Crashlytics"

    const-string v4, "Crashlytics could not load the application\'s icon."

    invoke-static {v1, v3, v4}, Lcom/crashlytics/android/aB;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1168
    :goto_0
    const-string v1, "Failed to close icon input stream."

    invoke-static {v2, v1}, Lcom/crashlytics/android/aB;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 1171
    :goto_1
    return-object v0

    .line 1161
    :cond_0
    :try_start_2
    invoke-static {v3}, Lcom/crashlytics/android/aB;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v4

    .line 1162
    invoke-static {v4}, Lcom/crashlytics/android/aB;->a([B)Ljava/lang/String;

    move-result-object v5

    .line 1163
    new-instance v1, Lcom/crashlytics/android/ak;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-direct {v1, v5, v4, v6, v3}, Lcom/crashlytics/android/ak;-><init>(Ljava/lang/String;[BII)V
    :try_end_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v0, v1

    goto :goto_0

    .line 1165
    :catch_0
    move-exception v1

    move-object v2, v0

    .line 1166
    :goto_2
    :try_start_3
    const-string v3, "Failed to load icon"

    invoke-static {v3, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1168
    const-string v1, "Failed to close icon input stream."

    invoke-static {v2, v1}, Lcom/crashlytics/android/aB;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_3
    const-string v1, "Failed to close icon input stream."

    invoke-static {v2, v1}, Lcom/crashlytics/android/aB;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_3

    .line 1165
    :catch_1
    move-exception v1

    goto :goto_2
.end method


# virtual methods
.method final a()Ljava/util/Map;
    .locals 1
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
    .line 417
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method final a(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 632
    new-instance v0, Lcom/crashlytics/android/t;

    invoke-direct {v0, p0, p1}, Lcom/crashlytics/android/t;-><init>(Lcom/crashlytics/android/Crashlytics;Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/Crashlytics;->a(Lcom/crashlytics/android/D;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method final c()Lcom/crashlytics/android/IdManager;
    .locals 1

    .prologue
    .line 523
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->i:Lcom/crashlytics/android/IdManager;

    return-object v0
.end method

.method public final crash()V
    .locals 1

    .prologue
    .line 515
    new-instance v0, Lcom/crashlytics/android/CrashTest;

    invoke-direct {v0}, Lcom/crashlytics/android/CrashTest;-><init>()V

    invoke-virtual {v0}, Lcom/crashlytics/android/CrashTest;->indexOutOfBounds()V

    .line 516
    return-void
.end method

.method public final getDebugMode()Z
    .locals 1

    .prologue
    .line 447
    sget-boolean v0, Lcom/crashlytics/android/Crashlytics;->x:Z

    return v0
.end method

.method final m()Z
    .locals 2

    .prologue
    .line 586
    new-instance v0, Lcom/crashlytics/android/s;

    invoke-direct {v0, p0}, Lcom/crashlytics/android/s;-><init>(Lcom/crashlytics/android/Crashlytics;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/Crashlytics;->a(Lcom/crashlytics/android/D;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method final o()Lcom/crashlytics/android/E;
    .locals 1

    .prologue
    .line 607
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->h:Lcom/crashlytics/android/E;

    return-object v0
.end method

.method final p()Ljava/lang/String;
    .locals 1

    .prologue
    .line 611
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->i:Lcom/crashlytics/android/IdManager;

    invoke-virtual {v0}, Lcom/crashlytics/android/IdManager;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->j:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final q()Ljava/lang/String;
    .locals 1

    .prologue
    .line 615
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->i:Lcom/crashlytics/android/IdManager;

    invoke-virtual {v0}, Lcom/crashlytics/android/IdManager;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->k:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final r()Ljava/lang/String;
    .locals 1

    .prologue
    .line 619
    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->i:Lcom/crashlytics/android/IdManager;

    invoke-virtual {v0}, Lcom/crashlytics/android/IdManager;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/crashlytics/android/Crashlytics;->l:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final s()Lcom/crashlytics/android/ab;
    .locals 2

    .prologue
    .line 650
    new-instance v0, Lcom/crashlytics/android/u;

    invoke-direct {v0, p0}, Lcom/crashlytics/android/u;-><init>(Lcom/crashlytics/android/Crashlytics;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/Crashlytics;->a(Lcom/crashlytics/android/D;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/ab;

    return-object v0
.end method

.method public final setDebugMode(Z)V
    .locals 1
    .param p1, "debug"    # Z

    .prologue
    .line 435
    sput-boolean p1, Lcom/crashlytics/android/Crashlytics;->x:Z

    .line 438
    if-eqz p1, :cond_0

    const/4 v0, 0x3

    :goto_0
    sput v0, Lcom/crashlytics/android/Crashlytics;->c:I

    .line 439
    return-void

    .line 438
    :cond_0
    const/4 v0, 0x4

    goto :goto_0
.end method

.method public final setListener(Lcom/crashlytics/android/CrashlyticsListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/crashlytics/android/CrashlyticsListener;

    .prologue
    .line 426
    iput-object p1, p0, Lcom/crashlytics/android/Crashlytics;->g:Lcom/crashlytics/android/CrashlyticsListener;

    .line 427
    return-void
.end method

.method final t()Lcom/crashlytics/android/ax;
    .locals 2

    .prologue
    .line 663
    new-instance v0, Lcom/crashlytics/android/v;

    invoke-direct {v0, p0}, Lcom/crashlytics/android/v;-><init>(Lcom/crashlytics/android/Crashlytics;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/Crashlytics;->a(Lcom/crashlytics/android/D;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/ax;

    return-object v0
.end method

.method public final verifyPinning(Ljava/net/URL;)Z
    .locals 4
    .param p1, "url"    # Ljava/net/URL;

    .prologue
    const/4 v1, 0x0

    .line 475
    :try_start_0
    sget-object v0, Lcom/crashlytics/android/Crashlytics;->y:Lcom/crashlytics/android/PinningInfoProvider;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/net/URL;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v2

    sget-object v0, Lcom/crashlytics/android/Crashlytics;->y:Lcom/crashlytics/android/PinningInfoProvider;

    invoke-static {v0}, Lcom/crashlytics/android/aB;->a(Lcom/crashlytics/android/PinningInfoProvider;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    invoke-virtual {v2}, Lcom/crashlytics/android/HttpRequest;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, v3}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljavax/net/ssl/HttpsURLConnection;->setInstanceFollowRedirects(Z)V

    invoke-virtual {v2}, Lcom/crashlytics/android/HttpRequest;->b()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    .line 478
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 475
    goto :goto_0

    .line 476
    :catch_0
    move-exception v0

    .line 477
    const-string v2, "Could not verify SSL pinning"

    invoke-static {v2, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    .line 478
    goto :goto_0
.end method
