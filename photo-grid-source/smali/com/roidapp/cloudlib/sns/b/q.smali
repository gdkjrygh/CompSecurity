.class public Lcom/roidapp/cloudlib/sns/b/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/cloudlib/sns/b/q;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/roidapp/cloudlib/sns/b/p;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->b:Landroid/content/Context;

    .line 1053
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->b:Landroid/content/Context;

    const-string v1, "sns_profile"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 1054
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1055
    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1056
    new-instance v1, Lcom/google/a/s;

    invoke-direct {v1}, Lcom/google/a/s;-><init>()V

    .line 1057
    const-class v2, Lcom/roidapp/cloudlib/sns/b/c;

    new-instance v3, Lcom/roidapp/cloudlib/sns/b/t;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/roidapp/cloudlib/sns/b/t;-><init>(B)V

    invoke-virtual {v1, v2, v3}, Lcom/google/a/s;->a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/a/s;

    .line 1058
    invoke-virtual {v1}, Lcom/google/a/s;->a()Lcom/google/a/k;

    move-result-object v1

    .line 1059
    new-instance v2, Lcom/roidapp/cloudlib/sns/b/r;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/b/r;-><init>(Lcom/roidapp/cloudlib/sns/b/q;)V

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/r;->b()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/p;

    .line 38
    :goto_0
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    .line 39
    return-void

    .line 1061
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;
    .locals 2

    .prologue
    .line 42
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/q;->a:Lcom/roidapp/cloudlib/sns/b/q;

    if-nez v0, :cond_1

    .line 43
    const-class v1, Lcom/roidapp/cloudlib/sns/b/q;

    monitor-enter v1

    .line 44
    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/q;->a:Lcom/roidapp/cloudlib/sns/b/q;

    if-nez v0, :cond_0

    .line 45
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/q;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/b/q;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/q;->a:Lcom/roidapp/cloudlib/sns/b/q;

    .line 47
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/q;->a:Lcom/roidapp/cloudlib/sns/b/q;

    return-object v0

    .line 47
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    .prologue
    .line 80
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->b:Landroid/content/Context;

    const-string v1, "sns_profile"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V

    .line 83
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "QPicFailed"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 84
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "QPicCode"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 86
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v0, :cond_0

    .line 88
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/push/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 90
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    monitor-exit p0

    return-void

    .line 80
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Lcom/roidapp/cloudlib/sns/b/p;)V
    .locals 5

    .prologue
    .line 65
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->b:Landroid/content/Context;

    const-string v1, "sns_profile"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 66
    new-instance v1, Lcom/google/a/s;

    invoke-direct {v1}, Lcom/google/a/s;-><init>()V

    .line 67
    const-class v2, Lcom/roidapp/cloudlib/sns/b/c;

    new-instance v3, Lcom/roidapp/cloudlib/sns/b/t;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/roidapp/cloudlib/sns/b/t;-><init>(B)V

    invoke-virtual {v1, v2, v3}, Lcom/google/a/s;->a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/a/s;

    .line 68
    invoke-virtual {v1}, Lcom/google/a/s;->a()Lcom/google/a/k;

    move-result-object v1

    .line 69
    new-instance v2, Lcom/roidapp/cloudlib/sns/b/s;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/b/s;-><init>(Lcom/roidapp/cloudlib/sns/b/q;)V

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/s;->b()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/google/a/k;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {v1, v0, v2}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    .line 71
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 73
    :cond_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 76
    :cond_1
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    monitor-exit p0

    return-void

    .line 65
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()Z
    .locals 6

    .prologue
    .line 94
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/p;->c:J

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v4, Lcom/roidapp/cloudlib/sns/b/x;->o:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c()Lcom/roidapp/cloudlib/sns/b/p;
    .locals 1

    .prologue
    .line 99
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/q;->c:Lcom/roidapp/cloudlib/sns/b/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
