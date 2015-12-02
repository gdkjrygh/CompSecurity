.class public abstract Lcom/facebook/common/json/jsonmirror/a/a;
.super Ljava/lang/Object;
.source "JMBase.java"


# static fields
.field public static final a:Lcom/facebook/common/json/jsonmirror/a/l;

.field public static final b:Lcom/facebook/common/json/jsonmirror/a/b;

.field public static final c:Lcom/facebook/common/json/jsonmirror/a/i;

.field public static final d:Lcom/facebook/common/json/jsonmirror/a/d;

.field public static final e:Lcom/facebook/common/json/jsonmirror/a/j;

.field protected static f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    new-instance v0, Lcom/facebook/common/json/jsonmirror/a/l;

    invoke-direct {v0}, Lcom/facebook/common/json/jsonmirror/a/l;-><init>()V

    sput-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->a:Lcom/facebook/common/json/jsonmirror/a/l;

    .line 13
    new-instance v0, Lcom/facebook/common/json/jsonmirror/a/b;

    invoke-direct {v0}, Lcom/facebook/common/json/jsonmirror/a/b;-><init>()V

    sput-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->b:Lcom/facebook/common/json/jsonmirror/a/b;

    .line 14
    new-instance v0, Lcom/facebook/common/json/jsonmirror/a/i;

    invoke-direct {v0}, Lcom/facebook/common/json/jsonmirror/a/i;-><init>()V

    sput-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->c:Lcom/facebook/common/json/jsonmirror/a/i;

    .line 15
    new-instance v0, Lcom/facebook/common/json/jsonmirror/a/d;

    invoke-direct {v0}, Lcom/facebook/common/json/jsonmirror/a/d;-><init>()V

    sput-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->d:Lcom/facebook/common/json/jsonmirror/a/d;

    .line 16
    new-instance v0, Lcom/facebook/common/json/jsonmirror/a/j;

    invoke-direct {v0}, Lcom/facebook/common/json/jsonmirror/a/j;-><init>()V

    sput-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->e:Lcom/facebook/common/json/jsonmirror/a/j;

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->f:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/facebook/common/json/jsonmirror/a/a;"
        }
    .end annotation

    .prologue
    .line 28
    const-class v1, Lcom/facebook/common/json/jsonmirror/a/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->f:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/a;

    .line 29
    if-nez v0, :cond_1

    .line 30
    const-class v2, Ljava/lang/String;

    if-ne p0, v2, :cond_2

    .line 31
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->a:Lcom/facebook/common/json/jsonmirror/a/l;

    .line 56
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 57
    sget-object v2, Lcom/facebook/common/json/jsonmirror/a/a;->f:Ljava/util/Map;

    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :cond_1
    monitor-exit v1

    return-object v0

    .line 32
    :cond_2
    :try_start_1
    const-class v2, Ljava/lang/Boolean;

    if-eq p0, v2, :cond_3

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p0, v2, :cond_4

    .line 33
    :cond_3
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->b:Lcom/facebook/common/json/jsonmirror/a/b;

    goto :goto_0

    .line 34
    :cond_4
    const-class v2, Ljava/lang/Long;

    if-eq p0, v2, :cond_5

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq p0, v2, :cond_5

    const-class v2, Ljava/lang/Integer;

    if-eq p0, v2, :cond_5

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p0, v2, :cond_6

    .line 36
    :cond_5
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->c:Lcom/facebook/common/json/jsonmirror/a/i;

    goto :goto_0

    .line 37
    :cond_6
    const-class v2, Ljava/lang/Double;

    if-eq p0, v2, :cond_7

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq p0, v2, :cond_7

    const-class v2, Ljava/lang/Float;

    if-eq p0, v2, :cond_7

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p0, v2, :cond_8

    .line 39
    :cond_7
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->d:Lcom/facebook/common/json/jsonmirror/a/d;

    goto :goto_0

    .line 40
    :cond_8
    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 41
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/a;->e:Lcom/facebook/common/json/jsonmirror/a/j;

    goto :goto_0

    .line 42
    :cond_9
    const-class v2, Lcom/facebook/common/json/jsonmirror/a/a;

    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-eqz v2, :cond_0

    .line 44
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/a;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    :try_start_3
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error instantiating element parser for class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 28
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 49
    :catch_1
    move-exception v0

    .line 50
    :try_start_4
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error instantiating element parser for class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method
