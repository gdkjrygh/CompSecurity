.class public final Lcom/google/android/gms/internal/qr;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/qv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/qv",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private static b:Lcom/google/android/gms/internal/tm;

.field private static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/qr;->c:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/qs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qs;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/qr;->a:Lcom/google/android/gms/internal/qv;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/qr;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/tm;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/qr;->b:Lcom/google/android/gms/internal/tm;

    return-void
.end method

.method private static a(Landroid/content/Context;)Lcom/google/android/gms/internal/tm;
    .locals 2

    .prologue
    .line 0
    sget-object v1, Lcom/google/android/gms/internal/qr;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/qr;->b:Lcom/google/android/gms/internal/tm;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 1000
    invoke-static {v0}, Lcom/google/android/gms/internal/d;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/tm;

    move-result-object v0

    .line 0
    sput-object v0, Lcom/google/android/gms/internal/qr;->b:Lcom/google/android/gms/internal/tm;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/qr;->b:Lcom/google/android/gms/internal/tm;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rl;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/qv",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/rl",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/qy;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/qy;-><init>(Lcom/google/android/gms/internal/qr;B)V

    sget-object v1, Lcom/google/android/gms/internal/qr;->b:Lcom/google/android/gms/internal/tm;

    new-instance v2, Lcom/google/android/gms/internal/qw;

    invoke-direct {v2, p1, p2, v0}, Lcom/google/android/gms/internal/qw;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/qv;Lcom/google/android/gms/internal/vq;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/tm;->a(Lcom/google/android/gms/internal/tj;)Lcom/google/android/gms/internal/tj;

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)Lcom/google/android/gms/internal/rl;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/internal/rl",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v3, Lcom/google/android/gms/internal/qy;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/qy;-><init>(Lcom/google/android/gms/internal/qr;B)V

    new-instance v4, Lcom/google/android/gms/internal/qt;

    invoke-direct {v4, p0, p1, v3}, Lcom/google/android/gms/internal/qt;-><init>(Lcom/google/android/gms/internal/qr;Ljava/lang/String;Lcom/google/android/gms/internal/qy;)V

    new-instance v0, Lcom/google/android/gms/internal/qu;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/qu;-><init>(Lcom/google/android/gms/internal/qr;Ljava/lang/String;Lcom/google/android/gms/internal/vq;Lcom/google/android/gms/internal/vp;Ljava/util/Map;)V

    sget-object v1, Lcom/google/android/gms/internal/qr;->b:Lcom/google/android/gms/internal/tm;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/tm;->a(Lcom/google/android/gms/internal/tj;)Lcom/google/android/gms/internal/tj;

    return-object v3
.end method
