.class public Lcom/facebook/device_id/l;
.super Ljava/lang/Object;
.source "UniqueIdForDeviceHolder.java"

# interfaces
.implements Lcom/facebook/base/c;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private volatile b:Lcom/facebook/device_id/i;

.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/device_id/l;

    sput-object v0, Lcom/facebook/device_id/l;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/device_id/l;->c:Lcom/facebook/prefs/shared/d;

    .line 44
    iput-object p2, p0, Lcom/facebook/device_id/l;->d:Lcom/facebook/common/time/a;

    .line 45
    return-void
.end method

.method public static a(Lcom/facebook/common/time/a;)Lcom/facebook/device_id/i;
    .locals 4

    .prologue
    .line 102
    new-instance v0, Lcom/facebook/device_id/i;

    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/device_id/i;-><init>(Ljava/lang/String;J)V

    return-object v0
.end method

.method private e()V
    .locals 5

    .prologue
    const-wide v3, 0x7fffffffffffffffL

    .line 79
    sget-object v0, Lcom/facebook/device_id/l;->a:Ljava/lang/Class;

    const-string v1, "loading device id from shared prefs"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/device_id/l;->c:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->e:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 81
    iget-object v1, p0, Lcom/facebook/device_id/l;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/prefs/shared/aj;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v1

    .line 83
    if-eqz v0, :cond_0

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/facebook/device_id/l;->d:Lcom/facebook/common/time/a;

    invoke-static {v0}, Lcom/facebook/device_id/l;->a(Lcom/facebook/common/time/a;)Lcom/facebook/device_id/i;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    .line 85
    invoke-direct {p0}, Lcom/facebook/device_id/l;->f()V

    .line 89
    :goto_0
    sget-object v0, Lcom/facebook/device_id/l;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loaded device id from shared prefs: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 90
    return-void

    .line 87
    :cond_1
    new-instance v3, Lcom/facebook/device_id/i;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/device_id/i;-><init>(Ljava/lang/String;J)V

    iput-object v3, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    goto :goto_0
.end method

.method private f()V
    .locals 5

    .prologue
    .line 93
    sget-object v0, Lcom/facebook/device_id/l;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "saving device id from shared prefs: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    .line 95
    iget-object v1, p0, Lcom/facebook/device_id/l;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/prefs/shared/aj;->f:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/device_id/i;->b()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/prefs/shared/aj;->e:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/device_id/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 99
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0}, Lcom/facebook/device_id/l;->e()V

    .line 76
    return-void
.end method

.method public a(Lcom/facebook/device_id/i;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    .line 65
    invoke-direct {p0}, Lcom/facebook/device_id/l;->f()V

    .line 66
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    if-nez v0, :cond_0

    .line 49
    const/4 v0, 0x0

    .line 51
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    invoke-virtual {v0}, Lcom/facebook/device_id/i;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 3

    .prologue
    .line 55
    invoke-virtual {p0}, Lcom/facebook/device_id/l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    const/4 v1, 0x0

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/facebook/device_id/i;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/device_id/l;->b:Lcom/facebook/device_id/i;

    return-object v0
.end method
