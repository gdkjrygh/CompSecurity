.class Lcom/qihoo/security/ui/main/BoosterFragment$a;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 1566
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$a;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$1;)V
    .locals 0

    .prologue
    .line 1566
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment$a;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/high16 v4, 0x41200000    # 10.0f

    const/4 v0, 0x0

    .line 1569
    if-eqz p2, :cond_1

    const-string/jumbo v1, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1570
    const-string/jumbo v1, "level"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 1571
    const-string/jumbo v2, "scale"

    const/16 v3, 0x64

    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 1572
    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment$a;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    mul-int/lit8 v1, v1, 0x64

    div-int/2addr v1, v2

    invoke-static {v3, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->d(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    .line 1574
    const-string/jumbo v1, "temperature"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 1575
    int-to-float v2, v1

    div-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lcom/qihoo/security/ui/main/BoosterFragment$a;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v3}, Lcom/qihoo/security/ui/main/BoosterFragment;->y(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    if-eq v2, v3, :cond_0

    const/4 v0, 0x1

    .line 1576
    :cond_0
    if-eqz v0, :cond_1

    .line 1577
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$a;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->e(Lcom/qihoo/security/ui/main/BoosterFragment;I)I

    .line 1578
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$a;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->f(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "sp_key_battery_temperature"

    invoke-static {v0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 1581
    :cond_1
    return-void
.end method
