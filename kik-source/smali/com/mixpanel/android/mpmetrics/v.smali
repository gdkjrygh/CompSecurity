.class public final Lcom/mixpanel/android/mpmetrics/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/v$1;,
        Lcom/mixpanel/android/mpmetrics/v$d;,
        Lcom/mixpanel/android/mpmetrics/v$c;,
        Lcom/mixpanel/android/mpmetrics/v$a;,
        Lcom/mixpanel/android/mpmetrics/v$b;
    }
.end annotation


# static fields
.field private static final i:Ljava/util/Map;

.field private static final j:Lcom/mixpanel/android/mpmetrics/af;

.field private static k:Ljava/util/concurrent/Future;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/mixpanel/android/mpmetrics/a;

.field private final c:Lcom/mixpanel/android/mpmetrics/t;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/mixpanel/android/mpmetrics/v$c;

.field private final f:Lcom/mixpanel/android/mpmetrics/ac;

.field private final g:Lcom/mixpanel/android/mpmetrics/v$d;

.field private h:Lcom/mixpanel/android/mpmetrics/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1648
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/v;->i:Ljava/util/Map;

    .line 1649
    new-instance v0, Lcom/mixpanel/android/mpmetrics/af;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/af;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/v;->j:Lcom/mixpanel/android/mpmetrics/af;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Future;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/v;->a:Landroid/content/Context;

    .line 120
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/v;->d:Ljava/lang/String;

    .line 121
    new-instance v0, Lcom/mixpanel/android/mpmetrics/v$c;

    invoke-direct {v0, p0, v3}, Lcom/mixpanel/android/mpmetrics/v$c;-><init>(Lcom/mixpanel/android/mpmetrics/v;B)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->e:Lcom/mixpanel/android/mpmetrics/v$c;

    .line 122
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/a;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->b:Lcom/mixpanel/android/mpmetrics/a;

    .line 123
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/t;->a(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->c:Lcom/mixpanel/android/mpmetrics/t;

    .line 124
    new-instance v0, Lcom/mixpanel/android/mpmetrics/w;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/mpmetrics/w;-><init>(Lcom/mixpanel/android/mpmetrics/v;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "com.mixpanel.android.mpmetrics.MixpanelAPI_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/mixpanel/android/mpmetrics/v;->j:Lcom/mixpanel/android/mpmetrics/af;

    invoke-virtual {v2, p1, v1, v0}, Lcom/mixpanel/android/mpmetrics/af;->a(Landroid/content/Context;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/af$b;)Ljava/util/concurrent/Future;

    move-result-object v0

    new-instance v1, Lcom/mixpanel/android/mpmetrics/ac;

    invoke-direct {v1, p2, v0}, Lcom/mixpanel/android/mpmetrics/ac;-><init>(Ljava/util/concurrent/Future;Ljava/util/concurrent/Future;)V

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    .line 126
    new-instance v0, Lcom/mixpanel/android/mpmetrics/v$d;

    invoke-direct {v0, p0, v3}, Lcom/mixpanel/android/mpmetrics/v$d;-><init>(Lcom/mixpanel/android/mpmetrics/v;B)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->g:Lcom/mixpanel/android/mpmetrics/v$d;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->h:Lcom/mixpanel/android/mpmetrics/h;

    .line 131
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ac;->d()Ljava/lang/String;

    move-result-object v0

    .line 132
    if-eqz v0, :cond_0

    .line 133
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/v;->g:Lcom/mixpanel/android/mpmetrics/v$d;

    new-instance v2, Lcom/mixpanel/android/mpmetrics/h;

    invoke-direct {v2, p3, v0, v1}, Lcom/mixpanel/android/mpmetrics/h;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/h$a;)V

    iput-object v2, p0, Lcom/mixpanel/android/mpmetrics/v;->h:Lcom/mixpanel/android/mpmetrics/h;

    .line 136
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->c:Lcom/mixpanel/android/mpmetrics/t;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/t;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    new-instance v1, Lcom/mixpanel/android/mpmetrics/ab;

    invoke-direct {v1, p0}, Lcom/mixpanel/android/mpmetrics/ab;-><init>(Lcom/mixpanel/android/mpmetrics/v;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 138
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->h:Lcom/mixpanel/android/mpmetrics/h;

    if-eqz v0, :cond_2

    .line 139
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->b:Lcom/mixpanel/android/mpmetrics/a;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/v;->h:Lcom/mixpanel/android/mpmetrics/h;

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/h;)V

    .line 141
    :cond_2
    return-void

    .line 136
    :cond_3
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/ac;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/v;
    .locals 11

    .prologue
    const/4 v1, 0x0

    .line 170
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 195
    :cond_0
    :goto_0
    return-object v1

    .line 173
    :cond_1
    sget-object v4, Lcom/mixpanel/android/mpmetrics/v;->i:Ljava/util/Map;

    monitor-enter v4

    .line 174
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 176
    sget-object v1, Lcom/mixpanel/android/mpmetrics/v;->k:Ljava/util/concurrent/Future;

    if-nez v1, :cond_2

    .line 177
    sget-object v1, Lcom/mixpanel/android/mpmetrics/v;->j:Lcom/mixpanel/android/mpmetrics/af;

    const-string v2, "com.mixpanel.android.mpmetrics.ReferralInfo"

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v2, v3}, Lcom/mixpanel/android/mpmetrics/af;->a(Landroid/content/Context;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/af$b;)Ljava/util/concurrent/Future;

    move-result-object v1

    sput-object v1, Lcom/mixpanel/android/mpmetrics/v;->k:Ljava/util/concurrent/Future;

    .line 180
    :cond_2
    sget-object v1, Lcom/mixpanel/android/mpmetrics/v;->i:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 181
    if-nez v1, :cond_5

    .line 182
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 183
    sget-object v2, Lcom/mixpanel/android/mpmetrics/v;->i:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v3, v1

    .line 186
    :goto_1
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/v;

    .line 187
    if-nez v1, :cond_4

    .line 188
    new-instance v2, Lcom/mixpanel/android/mpmetrics/v;

    sget-object v1, Lcom/mixpanel/android/mpmetrics/v;->k:Ljava/util/concurrent/Future;

    invoke-direct {v2, v5, v1, p1}, Lcom/mixpanel/android/mpmetrics/v;-><init>(Landroid/content/Context;Ljava/util/concurrent/Future;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    :try_start_1
    const-string v1, "android.support.v4.content.LocalBroadcastManager"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v6, "getInstance"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    const-class v9, Landroid/content/Context;

    aput-object v9, v7, v8

    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const-string v7, "registerReceiver"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Class;

    const/4 v9, 0x0

    const-class v10, Landroid/content/BroadcastReceiver;

    aput-object v10, v8, v9

    const/4 v9, 0x1

    const-class v10, Landroid/content/IntentFilter;

    aput-object v10, v8, v9

    invoke-virtual {v1, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v7, 0x0

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object p0, v8, v9

    invoke-virtual {v6, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    new-instance v9, Lcom/mixpanel/android/mpmetrics/x;

    invoke-direct {v9, v2}, Lcom/mixpanel/android/mpmetrics/x;-><init>(Lcom/mixpanel/android/mpmetrics/v;)V

    aput-object v9, v7, v8

    const/4 v8, 0x1

    new-instance v9, Landroid/content/IntentFilter;

    const-string v10, "com.parse.bolts.measurement_event"

    invoke-direct {v9, v10}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    aput-object v9, v7, v8

    invoke-virtual {v1, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    :goto_2
    :try_start_2
    invoke-interface {v3, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    :goto_3
    instance-of v1, p0, Landroid/app/Activity;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    :try_start_3
    const-string v1, "bolts.AppLinks"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    move-object v1, v0

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v5, "getTargetUrlFromInboundIntent"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Landroid/content/Context;

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-class v8, Landroid/content/Intent;

    aput-object v8, v6, v7

    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p0, v6, v7

    const/4 v7, 0x1

    aput-object v1, v6, v7

    invoke-virtual {v3, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 195
    :cond_3
    :goto_4
    :try_start_4
    monitor-exit v4

    move-object v1, v2

    goto/16 :goto_0

    .line 189
    :catch_0
    move-exception v1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "To enable App Links tracking android.support.v4 must be installed: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 196
    :catchall_0
    move-exception v1

    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1

    .line 189
    :catch_1
    move-exception v1

    :try_start_5
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "To enable App Links tracking android.support.v4 must be installed: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :catch_2
    move-exception v1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "App Links tracking will not be enabled due to this exception: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 193
    :catch_3
    move-exception v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Please install the Bolts library >= 1.1.2 to track App Links: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :catch_4
    move-exception v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Please install the Bolts library >= 1.1.2 to track App Links: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :catch_5
    move-exception v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Unable to detect inbound App Links: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_4

    :catch_6
    move-exception v1

    goto :goto_4

    .line 189
    :catch_7
    move-exception v1

    goto/16 :goto_2

    :cond_4
    move-object v2, v1

    goto/16 :goto_3

    :cond_5
    move-object v3, v1

    goto/16 :goto_1
.end method

.method static a(Lcom/mixpanel/android/mpmetrics/v$a;)V
    .locals 4

    .prologue
    .line 946
    sget-object v1, Lcom/mixpanel/android/mpmetrics/v;->i:Ljava/util/Map;

    monitor-enter v1

    .line 947
    :try_start_0
    sget-object v0, Lcom/mixpanel/android/mpmetrics/v;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 948
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/v;

    .line 949
    invoke-interface {p0, v0}, Lcom/mixpanel/android/mpmetrics/v$a;->a(Lcom/mixpanel/android/mpmetrics/v;)V

    goto :goto_0

    .line 952
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method static synthetic a(Lcom/mixpanel/android/mpmetrics/v;Lorg/json/JSONArray;)V
    .locals 4

    .prologue
    .line 108
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/v;->b:Lcom/mixpanel/android/mpmetrics/a;

    invoke-virtual {v2, v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "MixpanelAPI"

    const-string v3, "Malformed people record stored pending identity, will not send it."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/mixpanel/android/mpmetrics/v;Lorg/json/JSONObject;)V
    .locals 1

    .prologue
    .line 108
    const-string v0, "$distinct_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->b:Lcom/mixpanel/android/mpmetrics/a;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/a;->a(Lorg/json/JSONObject;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/ac;->a(Lorg/json/JSONObject;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/h;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->h:Lcom/mixpanel/android/mpmetrics/h;

    return-object v0
.end method

.method static synthetic c(Lcom/mixpanel/android/mpmetrics/v;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/mixpanel/android/mpmetrics/v;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/t;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->c:Lcom/mixpanel/android/mpmetrics/t;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 381
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->b:Lcom/mixpanel/android/mpmetrics/a;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/a;->a()V

    .line 382
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/ac;->a(Ljava/lang/String;)V

    .line 311
    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 6

    .prologue
    .line 331
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 333
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ac;->b()Ljava/util/Map;

    move-result-object v0

    .line 334
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 335
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 336
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 337
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 364
    :catch_0
    move-exception v0

    .line 365
    const-string v1, "MixpanelAPI"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception tracking event "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 367
    :goto_1
    return-void

    .line 340
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ac;->a()Lorg/json/JSONObject;

    move-result-object v1

    .line 341
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 342
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 343
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 344
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    .line 349
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v4, 0x3e8

    div-long/2addr v0, v4

    .line 350
    const-string v3, "time"

    invoke-virtual {v2, v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 351
    const-string v0, "distinct_id"

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/ac;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 353
    if-eqz p2, :cond_2

    .line 354
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 355
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 356
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 357
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 361
    :cond_2
    new-instance v0, Lcom/mixpanel/android/mpmetrics/a$a;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/v;->d:Ljava/lang/String;

    invoke-direct {v0, p1, v2, v1}, Lcom/mixpanel/android/mpmetrics/a$a;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 363
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/v;->b:Lcom/mixpanel/android/mpmetrics/a;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/a$a;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    .prologue
    .line 431
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/ac;->b(Lorg/json/JSONObject;)V

    .line 432
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 409
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ac;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 445
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->f:Lcom/mixpanel/android/mpmetrics/ac;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/ac;->c(Ljava/lang/String;)V

    .line 446
    return-void
.end method

.method public final c()Lcom/mixpanel/android/mpmetrics/v$b;
    .locals 1

    .prologue
    .line 484
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->e:Lcom/mixpanel/android/mpmetrics/v$c;

    return-object v0
.end method

.method final d()Z
    .locals 1

    .prologue
    .line 995
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v;->h:Lcom/mixpanel/android/mpmetrics/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
