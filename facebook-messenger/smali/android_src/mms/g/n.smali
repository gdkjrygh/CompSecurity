.class public Landroid_src/mms/g/n;
.super Ljava/lang/Object;
.source "SendingProgressTokenManager.java"


# static fields
.field private static final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroid_src/mms/g/n;->a:Ljava/util/HashMap;

    .line 34
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/Object;)J
    .locals 3

    .prologue
    .line 37
    const-class v2, Landroid_src/mms/g/n;

    monitor-enter v2

    :try_start_0
    sget-object v0, Landroid_src/mms/g/n;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 41
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    :goto_0
    monitor-exit v2

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method public static declared-synchronized b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 55
    const-class v1, Landroid_src/mms/g/n;

    monitor-enter v1

    :try_start_0
    sget-object v0, Landroid_src/mms/g/n;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    monitor-exit v1

    return-void

    .line 55
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
