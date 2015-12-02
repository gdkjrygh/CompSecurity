.class public Lcom/facebook/common/hardware/u;
.super Ljava/lang/Object;
.source "SystemBatteryStateManager.java"

# interfaces
.implements Lcom/facebook/common/hardware/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/common/hardware/b;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/content/BroadcastReceiver;

.field private final d:Landroid/content/BroadcastReceiver;

.field private final e:Landroid/content/BroadcastReceiver;

.field private final f:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/hardware/u;->b:Ljava/util/Map;

    .line 30
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/facebook/common/hardware/u;->a:Landroid/content/Context;

    .line 32
    new-instance v0, Lcom/facebook/common/hardware/v;

    invoke-direct {v0, p0}, Lcom/facebook/common/hardware/v;-><init>(Lcom/facebook/common/hardware/u;)V

    iput-object v0, p0, Lcom/facebook/common/hardware/u;->c:Landroid/content/BroadcastReceiver;

    .line 41
    new-instance v0, Lcom/facebook/common/hardware/w;

    invoke-direct {v0, p0}, Lcom/facebook/common/hardware/w;-><init>(Lcom/facebook/common/hardware/u;)V

    iput-object v0, p0, Lcom/facebook/common/hardware/u;->d:Landroid/content/BroadcastReceiver;

    .line 50
    new-instance v0, Lcom/facebook/common/hardware/x;

    invoke-direct {v0, p0}, Lcom/facebook/common/hardware/x;-><init>(Lcom/facebook/common/hardware/u;)V

    iput-object v0, p0, Lcom/facebook/common/hardware/u;->e:Landroid/content/BroadcastReceiver;

    .line 59
    new-instance v0, Lcom/facebook/common/hardware/y;

    invoke-direct {v0, p0}, Lcom/facebook/common/hardware/y;-><init>(Lcom/facebook/common/hardware/u;)V

    iput-object v0, p0, Lcom/facebook/common/hardware/u;->f:Landroid/content/BroadcastReceiver;

    .line 67
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/hardware/u;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/common/hardware/u;->b:Ljava/util/Map;

    return-object v0
.end method

.method private d()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 185
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 186
    iget-object v1, p0, Lcom/facebook/common/hardware/u;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()F
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/high16 v0, -0x40800000    # -1.0f

    .line 137
    invoke-direct {p0}, Lcom/facebook/common/hardware/u;->d()Landroid/content/Intent;

    move-result-object v1

    .line 138
    if-nez v1, :cond_1

    .line 146
    :cond_0
    :goto_0
    return v0

    .line 141
    :cond_1
    const-string v2, "level"

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 142
    const-string v3, "scale"

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 143
    if-ltz v2, :cond_0

    if-ltz v1, :cond_0

    .line 146
    int-to-float v0, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    goto :goto_0
.end method

.method public b()Lcom/facebook/common/hardware/c;
    .locals 3

    .prologue
    .line 151
    invoke-direct {p0}, Lcom/facebook/common/hardware/u;->d()Landroid/content/Intent;

    move-result-object v0

    .line 152
    if-nez v0, :cond_0

    .line 153
    sget-object v0, Lcom/facebook/common/hardware/c;->UNKNOWN:Lcom/facebook/common/hardware/c;

    .line 180
    :goto_0
    return-object v0

    .line 155
    :cond_0
    const-string v1, "status"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 159
    packed-switch v1, :pswitch_data_0

    .line 180
    sget-object v0, Lcom/facebook/common/hardware/c;->UNKNOWN:Lcom/facebook/common/hardware/c;

    goto :goto_0

    .line 161
    :pswitch_0
    sget-object v0, Lcom/facebook/common/hardware/c;->FULL:Lcom/facebook/common/hardware/c;

    goto :goto_0

    .line 163
    :pswitch_1
    const-string v1, "plugged"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 164
    packed-switch v0, :pswitch_data_1

    .line 171
    sget-object v0, Lcom/facebook/common/hardware/c;->UNKNOWN:Lcom/facebook/common/hardware/c;

    goto :goto_0

    .line 166
    :pswitch_2
    sget-object v0, Lcom/facebook/common/hardware/c;->CHARGING_AC:Lcom/facebook/common/hardware/c;

    goto :goto_0

    .line 168
    :pswitch_3
    sget-object v0, Lcom/facebook/common/hardware/c;->CHARGING_USB:Lcom/facebook/common/hardware/c;

    goto :goto_0

    .line 175
    :pswitch_4
    sget-object v0, Lcom/facebook/common/hardware/c;->DISCHARGING:Lcom/facebook/common/hardware/c;

    goto :goto_0

    .line 177
    :pswitch_5
    sget-object v0, Lcom/facebook/common/hardware/c;->NOT_CHARGING:Lcom/facebook/common/hardware/c;

    goto :goto_0

    .line 159
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_0
    .end packed-switch

    .line 164
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public c()Lcom/facebook/common/hardware/d;
    .locals 3

    .prologue
    .line 108
    invoke-direct {p0}, Lcom/facebook/common/hardware/u;->d()Landroid/content/Intent;

    move-result-object v0

    .line 109
    if-nez v0, :cond_0

    .line 110
    sget-object v0, Lcom/facebook/common/hardware/d;->UNKNOWN:Lcom/facebook/common/hardware/d;

    .line 131
    :goto_0
    return-object v0

    .line 113
    :cond_0
    const-string v1, "health"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 116
    packed-switch v0, :pswitch_data_0

    .line 131
    sget-object v0, Lcom/facebook/common/hardware/d;->UNKNOWN:Lcom/facebook/common/hardware/d;

    goto :goto_0

    .line 118
    :pswitch_0
    sget-object v0, Lcom/facebook/common/hardware/d;->COLD:Lcom/facebook/common/hardware/d;

    goto :goto_0

    .line 120
    :pswitch_1
    sget-object v0, Lcom/facebook/common/hardware/d;->DEAD:Lcom/facebook/common/hardware/d;

    goto :goto_0

    .line 122
    :pswitch_2
    sget-object v0, Lcom/facebook/common/hardware/d;->GOOD:Lcom/facebook/common/hardware/d;

    goto :goto_0

    .line 124
    :pswitch_3
    sget-object v0, Lcom/facebook/common/hardware/d;->OVERHEAT:Lcom/facebook/common/hardware/d;

    goto :goto_0

    .line 126
    :pswitch_4
    sget-object v0, Lcom/facebook/common/hardware/d;->OVER_VOLTAGE:Lcom/facebook/common/hardware/d;

    goto :goto_0

    .line 128
    :pswitch_5
    sget-object v0, Lcom/facebook/common/hardware/d;->UNSPECIFIED_FAILURE:Lcom/facebook/common/hardware/d;

    goto :goto_0

    .line 116
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method
