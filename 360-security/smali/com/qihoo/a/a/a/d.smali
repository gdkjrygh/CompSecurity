.class Lcom/qihoo/a/a/a/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

.field private d:Landroid/content/SharedPreferences;

.field private final e:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/qihoo/a/a/a/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/a/a/a/d;->a:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Lcom/qihoo/a/a/a/d$1;

    invoke-direct {v0, p0}, Lcom/qihoo/a/a/a/d$1;-><init>(Lcom/qihoo/a/a/a/d;)V

    iput-object v0, p0, Lcom/qihoo/a/a/a/d;->e:Landroid/content/BroadcastReceiver;

    .line 37
    iput-object p1, p0, Lcom/qihoo/a/a/a/d;->b:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lcom/qihoo/a/a/a/d;->c:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    .line 39
    invoke-direct {p0}, Lcom/qihoo/a/a/a/d;->b()Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate;

    move-result-object v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "no foud IUpdate implement class , please add"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 43
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/qihoo/a/a/a/d;->c:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    if-eqz v0, :cond_1

    .line 66
    iget-object v0, p0, Lcom/qihoo/a/a/a/d;->c:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    const-class v1, Lcom/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;->query(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    .line 67
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences;

    if-eqz v1, :cond_1

    .line 68
    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences;

    .line 69
    if-nez p1, :cond_0

    .line 70
    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 75
    :goto_0
    return-object v0

    .line 72
    :cond_0
    invoke-interface {v0, p1}, Lcom/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences;->getSharedPreferences(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    goto :goto_0

    .line 75
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/a/a/a/d;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0}, Lcom/qihoo/a/a/a/d;->c()V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/a/a/a/d;)Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/qihoo/a/a/a/d;->d:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method private b()Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate;
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lcom/qihoo/a/a/a/d;->c:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/qihoo/a/a/a/d;->c:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    const-class v1, Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;->query(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    .line 81
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate;

    if-eqz v1, :cond_0

    .line 82
    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate;

    .line 85
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 8

    .prologue
    .line 89
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/a/a/a/d;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/a/a/a/d;->d:Landroid/content/SharedPreferences;

    .line 90
    iget-object v0, p0, Lcom/qihoo/a/a/a/d;->d:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 91
    iget-object v1, p0, Lcom/qihoo/a/a/a/d;->b:Landroid/content/Context;

    const-string/jumbo v2, "shared_pref_clear_sdk"

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xa

    if-lt v0, v3, :cond_3

    const/4 v0, 0x4

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/a/a/a/d;->d:Landroid/content/SharedPreferences;

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/qihoo/a/a/a/d;->d:Landroid/content/SharedPreferences;

    const-string/jumbo v1, "clear_s_u_t"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 100
    sub-long v4, v2, v0

    const-wide/32 v6, 0x1ee6280

    cmp-long v4, v4, v6

    if-gez v4, :cond_1

    cmp-long v0, v2, v0

    if-gez v0, :cond_2

    .line 102
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/a/a/a/d;->b()Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate;

    move-result-object v0

    .line 104
    if-eqz v0, :cond_2

    .line 108
    new-instance v1, Lcom/qihoo/a/a/a/d$2;

    invoke-direct {v1, p0}, Lcom/qihoo/a/a/a/d$2;-><init>(Lcom/qihoo/a/a/a/d;)V

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate;->doUpdate(Lcom/qihoo360/mobilesafe/opti/i/plugins/IUpdate$UpdateCallback;)V

    .line 126
    :cond_2
    return-void

    .line 91
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 132
    invoke-direct {p0}, Lcom/qihoo/a/a/a/d;->c()V

    .line 134
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 135
    const-string/jumbo v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 136
    iget-object v1, p0, Lcom/qihoo/a/a/a/d;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/a/a/a/d;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 137
    return-void
.end method
