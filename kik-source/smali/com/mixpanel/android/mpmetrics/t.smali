.class public final Lcom/mixpanel/android/mpmetrics/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z

.field private static n:Lcom/mixpanel/android/mpmetrics/t;

.field private static final o:Ljava/lang/Object;


# instance fields
.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Z

.field private final f:Z

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x0

    sput-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    .line 202
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/t;->o:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const-string v2, "com.mixpanel.android.MPConfig.EnableDebugLogging"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    sput-boolean v2, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    .line 40
    const-string v2, "com.mixpanel.android.MPConfig.AutoCheckForSurveys"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 41
    const-string v2, "MixpanelAPI.MPConfig"

    const-string v3, "com.mixpanel.android.MPConfig.AutoCheckForSurveys has been deprecated in favor of com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates. Please update this key as soon as possible."

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    :cond_0
    const-string v2, "com.mixpanel.android.MPConfig.BulkUploadLimit"

    const/16 v3, 0x28

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/mixpanel/android/mpmetrics/t;->b:I

    .line 46
    const-string v2, "com.mixpanel.android.MPConfig.FlushInterval"

    const v3, 0xea60

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/mixpanel/android/mpmetrics/t;->c:I

    .line 47
    const-string v2, "com.mixpanel.android.MPConfig.DataExpiration"

    const v3, 0x19bfcc00

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/mixpanel/android/mpmetrics/t;->d:I

    .line 48
    const-string v2, "com.mixpanel.android.MPConfig.DisableFallback"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/mixpanel/android/mpmetrics/t;->e:Z

    .line 51
    const-string v2, "com.mixpanel.android.MPConfig.AutoCheckForSurveys"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 52
    const-string v3, "com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates"

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 53
    if-eqz v2, :cond_8

    if-eqz v3, :cond_8

    :goto_0
    iput-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/t;->m:Z

    .line 55
    const-string v0, "com.mixpanel.android.MPConfig.TestMode"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/t;->f:Z

    .line 57
    const-string v0, "com.mixpanel.android.MPConfig.EventsEndpoint"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    if-nez v0, :cond_1

    .line 59
    const-string v0, "https://api.mixpanel.com/track?ip=1"

    .line 61
    :cond_1
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->g:Ljava/lang/String;

    .line 63
    const-string v0, "com.mixpanel.android.MPConfig.EventsFallbackEndpoint"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    const-string v0, "http://api.mixpanel.com/track?ip=1"

    .line 67
    :cond_2
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->h:Ljava/lang/String;

    .line 69
    const-string v0, "com.mixpanel.android.MPConfig.PeopleEndpoint"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    const-string v0, "https://api.mixpanel.com/engage"

    .line 73
    :cond_3
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->i:Ljava/lang/String;

    .line 75
    const-string v0, "com.mixpanel.android.MPConfig.PeopleFallbackEndpoint"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    if-nez v0, :cond_4

    .line 77
    const-string v0, "http://api.mixpanel.com/engage"

    .line 79
    :cond_4
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->j:Ljava/lang/String;

    .line 81
    const-string v0, "com.mixpanel.android.MPConfig.DecideEndpoint"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 82
    if-nez v0, :cond_5

    .line 83
    const-string v0, "https://decide.mixpanel.com/decide"

    .line 85
    :cond_5
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->k:Ljava/lang/String;

    .line 87
    const-string v0, "com.mixpanel.android.MPConfig.DecideFallbackEndpoint"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 88
    if-nez v0, :cond_6

    .line 89
    const-string v0, "http://decide.mixpanel.com/decide"

    .line 91
    :cond_6
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->l:Ljava/lang/String;

    .line 93
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v0, :cond_7

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Mixpanel configured with:\n    AutoShowMixpanelUpdates "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    iget-boolean v1, p0, Lcom/mixpanel/android/mpmetrics/t;->m:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    BulkUploadLimit "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 97
    iget v1, p0, Lcom/mixpanel/android/mpmetrics/t;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    FlushInterval "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 98
    iget v1, p0, Lcom/mixpanel/android/mpmetrics/t;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    DataExpiration "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 99
    iget v1, p0, Lcom/mixpanel/android/mpmetrics/t;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    DisableFallback "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 100
    iget-boolean v1, p0, Lcom/mixpanel/android/mpmetrics/t;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    EnableDebugLogging "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-boolean v1, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    TestMode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 102
    iget-boolean v1, p0, Lcom/mixpanel/android/mpmetrics/t;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    EventsEndpoint "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/t;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    PeopleEndpoint "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 104
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/t;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    DecideEndpoint "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 105
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/t;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    EventsFallbackEndpoint "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 106
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/t;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    PeopleFallbackEndpoint "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 107
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/t;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n    DecideFallbackEndpoint "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 108
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/t;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    :cond_7
    return-void

    :cond_8
    move v0, v1

    .line 53
    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/t;
    .locals 2

    .prologue
    .line 27
    sget-object v1, Lcom/mixpanel/android/mpmetrics/t;->o:Ljava/lang/Object;

    monitor-enter v1

    .line 28
    :try_start_0
    sget-object v0, Lcom/mixpanel/android/mpmetrics/t;->n:Lcom/mixpanel/android/mpmetrics/t;

    if-nez v0, :cond_0

    .line 29
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 30
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/t;->b(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v0

    sput-object v0, Lcom/mixpanel/android/mpmetrics/t;->n:Lcom/mixpanel/android/mpmetrics/t;

    .line 32
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    sget-object v0, Lcom/mixpanel/android/mpmetrics/t;->n:Lcom/mixpanel/android/mpmetrics/t;

    return-object v0

    .line 32
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private static b(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/t;
    .locals 5

    .prologue
    .line 175
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 177
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 178
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 179
    if-nez v0, :cond_0

    .line 180
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 182
    :cond_0
    new-instance v2, Lcom/mixpanel/android/mpmetrics/t;

    invoke-direct {v2, v0}, Lcom/mixpanel/android/mpmetrics/t;-><init>(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    .line 183
    :catch_0
    move-exception v0

    .line 184
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t configure Mixpanel with package name "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 115
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/t;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 120
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/t;->c:I

    return v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 125
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/t;->d:I

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 129
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/t;->e:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 133
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/t;->f:Z

    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/t;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    .prologue
    .line 168
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/t;->m:Z

    return v0
.end method
