.class public Lcom/qihoo/security/opti/b/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/b/a$a;,
        Lcom/qihoo/security/opti/b/a$b;
    }
.end annotation


# static fields
.field private static a:Z

.field private static b:Z

.field private static c:Z

.field private static d:Z

.field private static e:Lcom/qihoo/security/opti/b/a$b;

.field private static f:Lcom/qihoo/security/opti/b/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/opti/b/a;->a:Z

    .line 34
    new-instance v0, Lcom/qihoo/security/opti/b/a$1;

    invoke-direct {v0}, Lcom/qihoo/security/opti/b/a$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/b/a;->f:Lcom/qihoo/security/opti/b/a$a;

    return-void
.end method

.method public static a()V
    .locals 2

    .prologue
    .line 62
    sget-boolean v0, Lcom/qihoo/security/opti/b/a;->c:Z

    if-eqz v0, :cond_2

    sget-boolean v0, Lcom/qihoo/security/opti/b/a;->b:Z

    if-eqz v0, :cond_2

    .line 63
    sget-boolean v0, Lcom/qihoo/security/opti/b/a;->d:Z

    if-nez v0, :cond_1

    sget-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/a$b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/a$b;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    .line 64
    :cond_0
    new-instance v0, Lcom/qihoo/security/opti/b/a$b;

    sget-object v1, Lcom/qihoo/security/opti/b/a;->f:Lcom/qihoo/security/opti/b/a$a;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/b/a$b;-><init>(Lcom/qihoo/security/opti/b/a$a;)V

    sput-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    .line 65
    sget-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/a$b;->start()V

    .line 76
    :cond_1
    :goto_0
    return-void

    .line 68
    :cond_2
    sget-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/a$b;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 69
    sget-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/a$b;->b()V

    .line 70
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/opti/b/a;->e:Lcom/qihoo/security/opti/b/a$b;

    .line 72
    :cond_3
    sget-object v0, Lcom/qihoo/security/opti/b/a;->f:Lcom/qihoo/security/opti/b/a$a;

    if-eqz v0, :cond_1

    .line 73
    sget-object v0, Lcom/qihoo/security/opti/b/a;->f:Lcom/qihoo/security/opti/b/a$a;

    invoke-interface {v0}, Lcom/qihoo/security/opti/b/a$a;->b()V

    goto :goto_0
.end method

.method public static a(Z)V
    .locals 0

    .prologue
    .line 49
    sput-boolean p0, Lcom/qihoo/security/opti/b/a;->d:Z

    .line 50
    return-void
.end method

.method public static b()V
    .locals 6

    .prologue
    .line 79
    const-wide/16 v0, 0x5

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v4

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    add-long/2addr v0, v2

    .line 83
    new-instance v2, Ljava/util/Timer;

    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    .line 84
    new-instance v3, Lcom/qihoo/security/opti/b/a$2;

    invoke-direct {v3}, Lcom/qihoo/security/opti/b/a$2;-><init>()V

    .line 91
    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    invoke-virtual {v2, v3, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 92
    return-void
.end method

.method public static b(Z)V
    .locals 0

    .prologue
    .line 53
    sput-boolean p0, Lcom/qihoo/security/opti/b/a;->b:Z

    .line 54
    return-void
.end method

.method public static c(Z)V
    .locals 1

    .prologue
    .line 57
    sput-boolean p0, Lcom/qihoo/security/opti/b/a;->c:Z

    .line 58
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/opti/b/a;->d:Z

    .line 59
    return-void
.end method

.method public static c()Z
    .locals 1

    .prologue
    .line 95
    invoke-static {}, Lcom/qihoo/security/opti/b/b;->a()Lcom/qihoo/security/opti/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/b;->d()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 3

    .prologue
    .line 99
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "malware_is_scanning"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method static synthetic e()Z
    .locals 1

    .prologue
    .line 13
    sget-boolean v0, Lcom/qihoo/security/opti/b/a;->a:Z

    return v0
.end method
