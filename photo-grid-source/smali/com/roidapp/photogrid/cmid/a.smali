.class public final Lcom/roidapp/photogrid/cmid/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Landroid/content/SharedPreferences;

.field private static b:Lcom/roidapp/photogrid/cmid/a;


# instance fields
.field private c:Lcom/roidapp/photogrid/cmid/b;

.field private d:Lcom/roidapp/photogrid/cmid/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    new-instance v0, Lcom/roidapp/photogrid/cmid/a;

    invoke-direct {v0}, Lcom/roidapp/photogrid/cmid/a;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/cmid/a;->b:Lcom/roidapp/photogrid/cmid/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Lcom/roidapp/photogrid/cmid/a;->c:Lcom/roidapp/photogrid/cmid/b;

    .line 32
    iput-object v0, p0, Lcom/roidapp/photogrid/cmid/a;->d:Lcom/roidapp/photogrid/cmid/c;

    .line 199
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;
    .locals 3

    .prologue
    .line 49
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.photoGrid.LOGIN_DATABASE"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/cmid/a;->a:Landroid/content/SharedPreferences;

    .line 50
    sget-object v0, Lcom/roidapp/photogrid/cmid/a;->b:Lcom/roidapp/photogrid/cmid/a;

    return-object v0
.end method

.method private declared-synchronized c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 72
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    sget-object v0, Lcom/roidapp/photogrid/cmid/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "com.photoGrid.KEY_LOGIN_SID_INIT"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :cond_0
    monitor-exit p0

    return-void

    .line 72
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static e()Ljava/lang/String;
    .locals 3

    .prologue
    .line 110
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 112
    :try_start_0
    const-string v0, "regist_sid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getRegistSid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    const-string v0, "regist_sid_sig"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getRegistSidSig()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    const-string v0, "third_sid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    const-string v0, "third_sid_sig"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSidSig()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    const-string v0, "login_sid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    const-string v0, "login_sid_sig"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSidSig()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 119
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    .prologue
    .line 54
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->sdkInitialize(Landroid/content/Context;)V

    .line 55
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    invoke-static {}, Lcom/roidapp/photogrid/cmid/a;->e()Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v1

    invoke-direct {v1, v0}, Lcom/roidapp/photogrid/cmid/a;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    monitor-exit p0

    return-void

    .line 54
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(J)V
    .locals 3

    .prologue
    .line 106
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/cmid/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "com.photoGrid.REFRESH_TIME"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    monitor-exit p0

    return-void

    .line 106
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 79
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    sget-object v0, Lcom/roidapp/photogrid/cmid/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "com.photoGrid.LOGIN_DATA"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    :cond_0
    monitor-exit p0

    return-void

    .line 79
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()Lcom/roidapp/photogrid/cmid/c;
    .locals 3

    .prologue
    .line 60
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/a;->d:Lcom/roidapp/photogrid/cmid/c;

    if-nez v0, :cond_0

    .line 62
    sget-object v0, Lcom/roidapp/photogrid/cmid/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "com.photoGrid.KEY_LOGIN_SID_INIT"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 64
    new-instance v1, Lcom/roidapp/photogrid/cmid/c;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/cmid/c;-><init>(Lcom/roidapp/photogrid/cmid/a;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/cmid/a;->d:Lcom/roidapp/photogrid/cmid/c;

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/a;->d:Lcom/roidapp/photogrid/cmid/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 60
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 96
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    sget-object v0, Lcom/roidapp/photogrid/cmid/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "com.photoGrid.LOGIN_USER_INFO"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    :cond_0
    monitor-exit p0

    return-void

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c()Lcom/roidapp/photogrid/cmid/b;
    .locals 3

    .prologue
    .line 85
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/a;->c:Lcom/roidapp/photogrid/cmid/b;

    if-nez v0, :cond_0

    .line 86
    sget-object v0, Lcom/roidapp/photogrid/cmid/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "com.photoGrid.LOGIN_USER_INFO"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 88
    new-instance v1, Lcom/roidapp/photogrid/cmid/b;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/cmid/b;-><init>(Lcom/roidapp/photogrid/cmid/a;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/cmid/a;->c:Lcom/roidapp/photogrid/cmid/b;

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/a;->c:Lcom/roidapp/photogrid/cmid/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 85
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()J
    .locals 4

    .prologue
    .line 102
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/cmid/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "com.photoGrid.REFRESH_TIME"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
