.class public Landroid_src/mms/g/d;
.super Ljava/lang/Object;
.source "DownloadManager.java"


# static fields
.field private static g:Landroid_src/mms/g/d;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Handler;

.field private final c:Landroid/content/SharedPreferences;

.field private d:Z

.field private final e:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

.field private final f:Landroid/content/BroadcastReceiver;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Landroid_src/mms/g/e;

    invoke-direct {v0, p0}, Landroid_src/mms/g/e;-><init>(Landroid_src/mms/g/d;)V

    iput-object v0, p0, Landroid_src/mms/g/d;->e:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 67
    new-instance v0, Landroid_src/mms/g/f;

    invoke-direct {v0, p0}, Landroid_src/mms/g/f;-><init>(Landroid_src/mms/g/d;)V

    iput-object v0, p0, Landroid_src/mms/g/d;->f:Landroid/content/BroadcastReceiver;

    .line 78
    iput-object p1, p0, Landroid_src/mms/g/d;->a:Landroid/content/Context;

    .line 79
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroid_src/mms/g/d;->b:Landroid/os/Handler;

    .line 80
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/g/d;->c:Landroid/content/SharedPreferences;

    .line 81
    iget-object v0, p0, Landroid_src/mms/g/d;->c:Landroid/content/SharedPreferences;

    iget-object v1, p0, Landroid_src/mms/g/d;->e:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 83
    iget-object v0, p0, Landroid_src/mms/g/d;->f:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.SERVICE_STATE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 87
    iget-object v0, p0, Landroid_src/mms/g/d;->c:Landroid/content/SharedPreferences;

    invoke-static {v0}, Landroid_src/mms/g/d;->a(Landroid/content/SharedPreferences;)Z

    move-result v0

    iput-boolean v0, p0, Landroid_src/mms/g/d;->d:Z

    .line 91
    return-void
.end method

.method static synthetic a(Landroid_src/mms/g/d;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Landroid_src/mms/g/d;->a:Landroid/content/Context;

    return-object v0
.end method

.method private a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 192
    const-string v0, ""

    return-object v0
.end method

.method static synthetic a(Landroid_src/mms/g/d;Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0, p1}, Landroid_src/mms/g/d;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 102
    sget-object v0, Landroid_src/mms/g/d;->g:Landroid_src/mms/g/d;

    if-eqz v0, :cond_0

    .line 103
    const-string v0, "DownloadManager"

    const-string v1, "Already initialized."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    :cond_0
    new-instance v0, Landroid_src/mms/g/d;

    invoke-direct {v0, p0}, Landroid_src/mms/g/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Landroid_src/mms/g/d;->g:Landroid_src/mms/g/d;

    .line 106
    return-void
.end method

.method static a(Landroid/content/SharedPreferences;)Z
    .locals 1

    .prologue
    .line 116
    invoke-static {}, Landroid_src/mms/g/d;->c()Z

    move-result v0

    invoke-static {p0, v0}, Landroid_src/mms/g/d;->a(Landroid/content/SharedPreferences;Z)Z

    move-result v0

    return v0
.end method

.method static a(Landroid/content/SharedPreferences;Z)Z
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x1

    return v0
.end method

.method public static b()Landroid_src/mms/g/d;
    .locals 2

    .prologue
    .line 109
    sget-object v0, Landroid_src/mms/g/d;->g:Landroid_src/mms/g/d;

    if-nez v0, :cond_0

    .line 110
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Uninitialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 112
    :cond_0
    sget-object v0, Landroid_src/mms/g/d;->g:Landroid_src/mms/g/d;

    return-object v0
.end method

.method static c()Z
    .locals 1

    .prologue
    .line 126
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .prologue
    .line 177
    .line 178
    iget-object v0, p0, Landroid_src/mms/g/d;->b:Landroid/os/Handler;

    new-instance v1, Landroid_src/mms/g/i;

    invoke-direct {v1, p0, p1}, Landroid_src/mms/g/i;-><init>(Landroid_src/mms/g/d;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 188
    return-void
.end method

.method public a(Landroid/net/Uri;I)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 132
    :try_start_0
    iget-object v0, p0, Landroid_src/mms/g/d;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid_src/mms/e/t;->a(Landroid/net/Uri;)Landroid_src/mms/e/f;

    move-result-object v0

    check-cast v0, Landroid_src/mms/e/h;

    .line 134
    invoke-virtual {v0}, Landroid_src/mms/e/h;->c()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v5, 0x3e8

    div-long/2addr v2, v5

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/16 v0, 0x81

    if-ne p2, v0, :cond_0

    .line 136
    iget-object v0, p0, Landroid_src/mms/g/d;->b:Landroid/os/Handler;

    new-instance v1, Landroid_src/mms/g/g;

    invoke-direct {v1, p0}, Landroid_src/mms/g/g;-><init>(Landroid_src/mms/g/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 143
    iget-object v0, p0, Landroid_src/mms/g/d;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/g/d;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, p1, v2, v3}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid_src/mms/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    :goto_0
    return-void

    .line 146
    :catch_0
    move-exception v0

    .line 147
    const-string v1, "DownloadManager"

    invoke-virtual {v0}, Landroid_src/mms/d;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 152
    :cond_0
    const/16 v0, 0x87

    if-ne p2, v0, :cond_2

    .line 153
    iget-object v0, p0, Landroid_src/mms/g/d;->b:Landroid/os/Handler;

    new-instance v1, Landroid_src/mms/g/h;

    invoke-direct {v1, p0, p1}, Landroid_src/mms/g/h;-><init>(Landroid_src/mms/g/d;Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 170
    :cond_1
    :goto_1
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 171
    const-string v0, "st"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 172
    iget-object v0, p0, Landroid_src/mms/g/d;->a:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/g/d;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    move-object v2, p1

    move-object v5, v4

    invoke-static/range {v0 .. v5}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    .line 164
    :cond_2
    iget-boolean v0, p0, Landroid_src/mms/g/d;->d:Z

    if-nez v0, :cond_1

    .line 165
    or-int/lit8 p2, p2, 0x4

    goto :goto_1
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 94
    iget-boolean v0, p0, Landroid_src/mms/g/d;->d:Z

    return v0
.end method
