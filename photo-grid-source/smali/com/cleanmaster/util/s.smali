.class public Lcom/cleanmaster/util/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:Z

.field private static final b:Ljava/lang/Object;

.field private static c:Z

.field private static d:Landroid/os/Handler;

.field private static e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 20
    const-class v0, Lcom/cleanmaster/util/s;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lcom/cleanmaster/util/s;->a:Z

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/cleanmaster/util/s;->b:Ljava/lang/Object;

    .line 24
    sput-boolean v2, Lcom/cleanmaster/util/s;->c:Z

    .line 26
    const/4 v0, 0x0

    sput-object v0, Lcom/cleanmaster/util/s;->d:Landroid/os/Handler;

    .line 30
    sput-boolean v1, Lcom/cleanmaster/util/s;->e:Z

    return-void

    :cond_0
    move v0, v2

    .line 20
    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Landroid/os/Handler;
    .locals 3

    .prologue
    .line 66
    sget-object v1, Lcom/cleanmaster/util/s;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 67
    :try_start_0
    sget-object v0, Lcom/cleanmaster/util/s;->d:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 68
    sget-boolean v0, Lcom/cleanmaster/util/s;->c:Z

    if-eqz v0, :cond_0

    .line 69
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Did not yet override the UI thread"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 71
    :cond_0
    :try_start_1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/cleanmaster/util/s;->d:Landroid/os/Handler;

    .line 73
    :cond_1
    sget-object v0, Lcom/cleanmaster/util/s;->d:Landroid/os/Handler;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0
.end method

.method public static a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 190
    invoke-static {}, Lcom/cleanmaster/util/s;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 191
    return-void
.end method
