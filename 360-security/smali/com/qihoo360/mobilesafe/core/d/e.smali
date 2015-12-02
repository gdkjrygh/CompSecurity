.class public Lcom/qihoo360/mobilesafe/core/d/e;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/core/d/e$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/qihoo360/mobilesafe/core/d/e;


# instance fields
.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo360/mobilesafe/core/d/e$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/qihoo360/mobilesafe/core/d/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/d/e;->a:Ljava/lang/String;

    .line 20
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/d/e;->b:Lcom/qihoo360/mobilesafe/core/d/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/e$1;

    const/16 v1, 0x4b

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/core/d/e$1;-><init>(Lcom/qihoo360/mobilesafe/core/d/e;IFZ)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/e;->c:Ljava/util/HashMap;

    .line 47
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/e;->c:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 48
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo360/mobilesafe/core/d/e;
    .locals 2

    .prologue
    .line 24
    const-class v1, Lcom/qihoo360/mobilesafe/core/d/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/core/d/e;->b:Lcom/qihoo360/mobilesafe/core/d/e;

    if-nez v0, :cond_0

    .line 25
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/e;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/core/d/e;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/core/d/e;->b:Lcom/qihoo360/mobilesafe/core/d/e;

    .line 27
    :cond_0
    sget-object v0, Lcom/qihoo360/mobilesafe/core/d/e;->b:Lcom/qihoo360/mobilesafe/core/d/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 24
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(Landroid/content/pm/PackageInfo;)Lcom/qihoo360/mobilesafe/core/d/e$a;
    .locals 1

    .prologue
    .line 55
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/e$a;

    invoke-direct {v0, p1}, Lcom/qihoo360/mobilesafe/core/d/e$a;-><init>(Landroid/content/pm/PackageInfo;)V

    .line 56
    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/core/d/e$a;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/e;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/d/e$a;

    .line 61
    return-object v0
.end method

.method public a(Ljava/lang/String;Landroid/content/pm/PackageInfo;)V
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/e;->c:Ljava/util/HashMap;

    invoke-virtual {p0, p2}, Lcom/qihoo360/mobilesafe/core/d/e;->a(Landroid/content/pm/PackageInfo;)Lcom/qihoo360/mobilesafe/core/d/e$a;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    return-void
.end method
