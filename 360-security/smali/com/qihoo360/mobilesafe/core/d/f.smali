.class public Lcom/qihoo360/mobilesafe/core/d/f;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/core/d/f$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/qihoo360/mobilesafe/core/d/f;


# instance fields
.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/qihoo360/mobilesafe/core/d/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    const-class v0, Lcom/qihoo360/mobilesafe/core/d/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/d/f;->a:Ljava/lang/String;

    .line 19
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/d/f;->b:Lcom/qihoo360/mobilesafe/core/d/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/f$1;

    const/16 v1, 0x4b

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/core/d/f$1;-><init>(Lcom/qihoo360/mobilesafe/core/d/f;IFZ)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/f;->c:Ljava/util/HashMap;

    .line 46
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/f;->c:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 47
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo360/mobilesafe/core/d/f;
    .locals 2

    .prologue
    .line 23
    const-class v1, Lcom/qihoo360/mobilesafe/core/d/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/core/d/f;->b:Lcom/qihoo360/mobilesafe/core/d/f;

    if-nez v0, :cond_0

    .line 24
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/f;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/core/d/f;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/core/d/f;->b:Lcom/qihoo360/mobilesafe/core/d/f;

    .line 26
    :cond_0
    sget-object v0, Lcom/qihoo360/mobilesafe/core/d/f;->b:Lcom/qihoo360/mobilesafe/core/d/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 23
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(I)Lcom/qihoo360/mobilesafe/core/d/f$a;
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/f;->c:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/d/f$a;

    .line 66
    return-object v0
.end method

.method public a(ILcom/qihoo360/mobilesafe/core/d/f$a;)V
    .locals 2

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/f;->c:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    return-void
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 50
    const/4 v0, 0x0

    .line 51
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/f;->c:Ljava/util/HashMap;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/f;->c:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 52
    const/4 v0, 0x1

    .line 57
    :cond_0
    return v0
.end method
