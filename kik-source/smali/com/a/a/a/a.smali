.class public Lcom/a/a/a/a;
.super Lb/a/a/a/l;
.source "SourceFile"


# instance fields
.field a:Lcom/a/a/a/o;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lb/a/a/a/a/f/b;

.field private j:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lb/a/a/a/l;-><init>()V

    return-void
.end method

.method public static c()Lcom/a/a/a/a;
    .locals 1

    .prologue
    .line 55
    const-class v0, Lcom/a/a/a/a;

    invoke-static {v0}, Lb/a/a/a/d;->a(Ljava/lang/Class;)Lb/a/a/a/l;

    move-result-object v0

    check-cast v0, Lcom/a/a/a/a;

    return-object v0
.end method

.method private f()Ljava/lang/Boolean;
    .locals 14

    .prologue
    .line 146
    invoke-virtual {p0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v12

    .line 148
    :try_start_0
    new-instance v0, Lcom/a/a/a/s;

    invoke-direct {v0}, Lcom/a/a/a/s;-><init>()V

    new-instance v1, Lb/a/a/a/a/b/z;

    invoke-direct {v1}, Lb/a/a/a/a/b/z;-><init>()V

    new-instance v2, Lb/a/a/a/a/d/q;

    invoke-virtual {p0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lb/a/a/a/a/f/a;

    invoke-direct {v4, p0}, Lb/a/a/a/a/f/a;-><init>(Lb/a/a/a/l;)V

    invoke-virtual {v4}, Lb/a/a/a/a/f/a;->a()Ljava/io/File;

    move-result-object v4

    const-string v5, "session_analytics.tap"

    const-string v6, "session_analytics_to_send"

    invoke-direct {v2, v3, v4, v5, v6}, Lb/a/a/a/a/d/q;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lcom/a/a/a/m;

    invoke-direct {v13, v12, v0, v1, v2}, Lcom/a/a/a/m;-><init>(Landroid/content/Context;Lcom/a/a/a/s;Lb/a/a/a/a/b/m;Lb/a/a/a/a/d/l;)V

    invoke-virtual {p0}, Lcom/a/a/a/a;->u()Lb/a/a/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->g()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->b()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lb/a/a/a/a/b/t$a;->d:Lb/a/a/a/a/b/t$a;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v0, Lb/a/a/a/a/b/t$a;->g:Lb/a/a/a/a/b/t$a;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v0, Lb/a/a/a/a/b/t$a;->c:Lb/a/a/a/a/b/t$a;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v12}, Lb/a/a/a/a/b/j;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lb/a/a/a/a/b/t;->d()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lb/a/a/a/a/b/t;->e()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Lcom/a/a/a/r;

    iget-object v10, p0, Lcom/a/a/a/a;->b:Ljava/lang/String;

    iget-object v11, p0, Lcom/a/a/a/a;->c:Ljava/lang/String;

    invoke-direct/range {v0 .. v11}, Lcom/a/a/a/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    if-eqz v1, :cond_1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v2, v3, :cond_1

    new-instance v2, Lb/a/a/a/a/e/b;

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    invoke-direct {v2, v3}, Lb/a/a/a/a/e/b;-><init>(Lb/a/a/a/o;)V

    const-string v3, "Crashlytics Trace Manager"

    invoke-static {v3}, Lb/a/a/a/a/b/p;->b(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    new-instance v4, Lcom/a/a/a/f;

    invoke-direct {v4, v1, v3, v13, v2}, Lcom/a/a/a/f;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/a/a/a/m;Lb/a/a/a/a/e/g;)V

    new-instance v2, Lcom/a/a/a/t;

    invoke-direct {v2, v1, v4, v13, v3}, Lcom/a/a/a/t;-><init>(Landroid/content/Context;Lb/a/a/a/a/d/n;Lcom/a/a/a/m;Ljava/util/concurrent/ScheduledExecutorService;)V

    new-instance v3, Lcom/a/a/a/c;

    invoke-direct {v3, v0, v2, v1}, Lcom/a/a/a/c;-><init>(Lcom/a/a/a/r;Lcom/a/a/a/t;Landroid/app/Application;)V

    iput-object v3, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;

    :goto_0
    iget-wide v0, p0, Lcom/a/a/a/a;->j:J

    iget-object v2, p0, Lcom/a/a/a/a;->d:Lb/a/a/a/a/f/b;

    invoke-interface {v2}, Lb/a/a/a/a/f/b;->a()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "analytics_launched"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    const-wide/32 v2, 0x36ee80

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :goto_2
    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    iget-object v0, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;

    iget-object v1, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    invoke-static {v0}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    iget-object v0, p0, Lcom/a/a/a/a;->d:Lb/a/a/a/a/f/b;

    iget-object v1, p0, Lcom/a/a/a/a;->d:Lb/a/a/a/a/f/b;

    invoke-interface {v1}, Lb/a/a/a/a/f/b;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "analytics_launched"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v0, v1}, Lb/a/a/a/a/f/b;->a(Landroid/content/SharedPreferences$Editor;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    :cond_0
    :goto_3
    :try_start_1
    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/g/q;->b()Lb/a/a/a/a/g/t;

    move-result-object v0

    .line 151
    if-nez v0, :cond_4

    .line 152
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 168
    :goto_4
    return-object v0

    .line 148
    :cond_1
    :try_start_2
    new-instance v1, Lb/a/a/a/a/e/b;

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    invoke-direct {v1, v2}, Lb/a/a/a/a/e/b;-><init>(Lb/a/a/a/o;)V

    const-string v2, "Crashlytics SAM"

    invoke-static {v2}, Lb/a/a/a/a/b/p;->b(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Lcom/a/a/a/f;

    invoke-direct {v3, v12, v2, v13, v1}, Lcom/a/a/a/f;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/a/a/a/m;Lb/a/a/a/a/e/g;)V

    new-instance v1, Lcom/a/a/a/t;

    invoke-direct {v1, v12, v3, v13, v2}, Lcom/a/a/a/t;-><init>(Landroid/content/Context;Lb/a/a/a/a/d/n;Lcom/a/a/a/m;Ljava/util/concurrent/ScheduledExecutorService;)V

    new-instance v2, Lcom/a/a/a/o;

    invoke-direct {v2, v0, v1}, Lcom/a/a/a/o;-><init>(Lcom/a/a/a/r;Lcom/a/a/a/t;)V

    iput-object v2, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Crashlytics failed to initialize session analytics."

    invoke-static {v12, v0}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    .line 155
    :cond_4
    :try_start_3
    iget-object v1, v0, Lb/a/a/a/a/g/t;->d:Lb/a/a/a/a/g/m;

    iget-boolean v1, v1, Lb/a/a/a/a/g/m;->d:Z

    if-eqz v1, :cond_5

    .line 156
    iget-object v1, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;

    iget-object v0, v0, Lb/a/a/a/a/g/t;->e:Lb/a/a/a/a/g/b;

    invoke-virtual {p0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v2

    const-string v3, "com.crashlytics.ApiEndpoint"

    invoke-static {v2, v3}, Lb/a/a/a/a/b/j;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/o;->a(Lb/a/a/a/a/g/b;Ljava/lang/String;)V

    .line 158
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_4

    .line 160
    :cond_5
    invoke-static {v12}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 162
    iget-object v0, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;

    invoke-virtual {v0}, Lcom/a/a/a/o;->a()V

    .line 163
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v0

    goto :goto_4

    .line 165
    :catch_1
    move-exception v0

    .line 166
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Error dealing with settings"

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 168
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_4
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    const-string v0, "1.2.2.56"

    return-object v0
.end method

.method public final a(Lb/a/a/a/a/b/l$a;)V
    .locals 4

    .prologue
    .line 109
    iget-object v0, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;

    if-eqz v0, :cond_1

    .line 110
    iget-object v0, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;

    invoke-virtual {p1}, Lb/a/a/a/a/b/l$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-ne v2, v3, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "onCrash called from main thread!!!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v2, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    invoke-static {v0, v1}, Lcom/a/a/a/q;->b(Lcom/a/a/a/r;Ljava/lang/String;)Lcom/a/a/a/q;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/a/a/a/t;->a(Ljava/lang/Object;)V

    .line 112
    :cond_1
    return-void
.end method

.method public final a(Lb/a/a/a/a/b/l$b;)V
    .locals 3

    .prologue
    .line 103
    iget-object v0, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/a/a/a/a;->a:Lcom/a/a/a/o;

    invoke-virtual {p1}, Lb/a/a/a/a/b/l$b;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    invoke-static {v0, v1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Ljava/lang/String;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    .line 106
    :cond_0
    return-void
.end method

.method protected final a_()Z
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 118
    :try_start_0
    new-instance v1, Lb/a/a/a/a/f/c;

    invoke-direct {v1, p0}, Lb/a/a/a/a/f/c;-><init>(Lb/a/a/a/l;)V

    iput-object v1, p0, Lcom/a/a/a/a;->d:Lb/a/a/a/a/f/b;

    .line 120
    invoke-virtual {p0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v2

    .line 121
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 122
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 124
    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 126
    iget v1, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/a/a/a/a;->b:Ljava/lang/String;

    .line 127
    iget-object v1, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "0.0"

    :goto_0
    iput-object v1, p0, Lcom/a/a/a/a;->c:Ljava/lang/String;

    .line 130
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x9

    if-lt v1, v4, :cond_1

    .line 131
    iget-wide v2, v3, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iput-wide v2, p0, Lcom/a/a/a/a;->j:J

    .line 137
    :goto_1
    const/4 v0, 0x1

    .line 141
    :goto_2
    return v0

    .line 127
    :cond_0
    iget-object v1, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    goto :goto_0

    .line 133
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 135
    new-instance v2, Ljava/io/File;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/a/a/a/a;->j:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 138
    :catch_0
    move-exception v1

    .line 139
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Answers"

    const-string v4, "Error setting up app properties"

    invoke-interface {v2, v3, v4, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 173
    const-string v0, "com.crashlytics.sdk.android:answers"

    return-object v0
.end method

.method protected final synthetic e()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/a/a/a/a;->f()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
