.class public Lcom/facebook/common/v/d;
.super Ljava/lang/Object;
.source "DeviceUserInteractionManager.java"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Lcom/facebook/base/broadcast/a;

.field private final f:Lcom/facebook/common/hardware/q;

.field private final g:Lcom/facebook/common/time/a;

.field private volatile h:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 14
    const-class v0, Lcom/facebook/common/v/d;

    sput-object v0, Lcom/facebook/common/v/d;->d:Ljava/lang/Class;

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/common/v/d;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ACTIVITY_MAYBE_CHANGED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/v/d;->a:Ljava/lang/String;

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/common/v/d;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".USER_ENTERED_DEVICE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/v/d;->b:Ljava/lang/String;

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/common/v/d;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".USER_LEFT_DEVICE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/v/d;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/base/broadcast/a;Lcom/facebook/common/hardware/q;Lcom/facebook/common/time/a;)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/common/v/d;->e:Lcom/facebook/base/broadcast/a;

    .line 38
    iput-object p2, p0, Lcom/facebook/common/v/d;->f:Lcom/facebook/common/hardware/q;

    .line 39
    iput-object p3, p0, Lcom/facebook/common/v/d;->g:Lcom/facebook/common/time/a;

    .line 41
    iget-object v0, p0, Lcom/facebook/common/v/d;->f:Lcom/facebook/common/hardware/q;

    new-instance v1, Lcom/facebook/common/v/e;

    invoke-direct {v1, p0}, Lcom/facebook/common/v/e;-><init>(Lcom/facebook/common/v/d;)V

    invoke-virtual {v0, v1}, Lcom/facebook/common/hardware/q;->a(Lcom/facebook/common/hardware/t;)V

    .line 52
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/v/d;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/common/v/d;->c()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/common/v/d;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/common/v/d;->d()V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 80
    sget-object v0, Lcom/facebook/common/v/d;->d:Ljava/lang/Class;

    const-string v1, "onScreenOn"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/facebook/common/v/d;->e:Lcom/facebook/base/broadcast/a;

    sget-object v1, Lcom/facebook/common/v/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/facebook/common/v/d;->e:Lcom/facebook/base/broadcast/a;

    sget-object v1, Lcom/facebook/common/v/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 83
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 86
    sget-object v0, Lcom/facebook/common/v/d;->d:Ljava/lang/Class;

    const-string v1, "onScreenOff"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/facebook/common/v/d;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/common/v/d;->h:J

    .line 88
    iget-object v0, p0, Lcom/facebook/common/v/d;->e:Lcom/facebook/base/broadcast/a;

    sget-object v1, Lcom/facebook/common/v/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/facebook/common/v/d;->e:Lcom/facebook/base/broadcast/a;

    sget-object v1, Lcom/facebook/common/v/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 90
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 68
    iget-wide v0, p0, Lcom/facebook/common/v/d;->h:J

    return-wide v0
.end method

.method public a(J)Z
    .locals 4

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/common/v/d;->f:Lcom/facebook/common/hardware/q;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/q;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/v/d;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/common/v/d;->h:J

    sub-long/2addr v0, v2

    cmp-long v0, v0, p1

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/common/v/d;->f:Lcom/facebook/common/hardware/q;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/q;->a()Z

    move-result v0

    return v0
.end method
