.class Lcom/jirbo/adcolony/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Ljava/lang/String;

.field static b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/aa$a;",
            ">;"
        }
    .end annotation
.end field

.field static c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/aa$a;",
            ">;"
        }
    .end annotation
.end field

.field static d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field static e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field static volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 19
    new-instance v0, Ljava/lang/String;

    const-string v1, "mutex"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/jirbo/adcolony/aa;->a:Ljava/lang/String;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/aa;->b:Ljava/util/ArrayList;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/aa;->c:Ljava/util/ArrayList;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/aa;->d:Ljava/util/ArrayList;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/aa;->e:Ljava/util/ArrayList;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    return-void
.end method

.method static a()V
    .locals 2

    .prologue
    .line 28
    invoke-static {}, Lcom/jirbo/adcolony/aa;->c()V

    .line 29
    sget-object v1, Lcom/jirbo/adcolony/aa;->a:Ljava/lang/String;

    monitor-enter v1

    .line 31
    :try_start_0
    sget-object v0, Lcom/jirbo/adcolony/aa;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 32
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-static {}, Lcom/jirbo/adcolony/aa;->b()V

    .line 34
    return-void

    .line 32
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static a(Ljava/lang/Runnable;)V
    .locals 3

    .prologue
    .line 43
    const/4 v0, 0x0

    .line 44
    sget-object v2, Lcom/jirbo/adcolony/aa;->a:Ljava/lang/String;

    monitor-enter v2

    .line 46
    :try_start_0
    sget-boolean v1, Lcom/jirbo/adcolony/aa;->f:Z

    if-eqz v1, :cond_0

    .line 48
    sget-object v0, Lcom/jirbo/adcolony/aa;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    monitor-exit v2

    .line 72
    :goto_0
    return-void

    .line 52
    :cond_0
    sget-object v1, Lcom/jirbo/adcolony/aa;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 53
    if-lez v1, :cond_2

    sget-object v0, Lcom/jirbo/adcolony/aa;->b:Ljava/util/ArrayList;

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/aa$a;

    move-object v1, v0

    .line 54
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-nez v1, :cond_1

    .line 58
    new-instance v0, Lcom/jirbo/adcolony/aa$a;

    invoke-direct {v0}, Lcom/jirbo/adcolony/aa$a;-><init>()V

    .line 59
    sget-object v1, Lcom/jirbo/adcolony/aa;->a:Ljava/lang/String;

    monitor-enter v1

    .line 61
    :try_start_1
    sget-object v2, Lcom/jirbo/adcolony/aa;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    iput-object p0, v0, Lcom/jirbo/adcolony/aa$a;->a:Ljava/lang/Runnable;

    .line 64
    invoke-virtual {v0}, Lcom/jirbo/adcolony/aa$a;->start()V

    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 62
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 68
    :cond_1
    monitor-enter v1

    .line 70
    :try_start_4
    iput-object p0, v1, Lcom/jirbo/adcolony/aa$a;->a:Ljava/lang/Runnable;

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 72
    monitor-exit v1

    goto :goto_0

    :catchall_2
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    :cond_2
    move-object v1, v0

    goto :goto_1
.end method

.method static b()V
    .locals 3

    .prologue
    .line 78
    sget-object v1, Lcom/jirbo/adcolony/aa;->a:Ljava/lang/String;

    monitor-enter v1

    .line 80
    const/4 v0, 0x0

    :try_start_0
    sput-boolean v0, Lcom/jirbo/adcolony/aa;->f:Z

    .line 81
    sget-object v0, Lcom/jirbo/adcolony/aa;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 82
    sget-object v0, Lcom/jirbo/adcolony/aa;->e:Ljava/util/ArrayList;

    sget-object v2, Lcom/jirbo/adcolony/aa;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 83
    sget-object v0, Lcom/jirbo/adcolony/aa;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 84
    sget-object v0, Lcom/jirbo/adcolony/aa;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 85
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    sget-object v0, Lcom/jirbo/adcolony/aa;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 89
    invoke-static {v0}, Lcom/jirbo/adcolony/aa;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 85
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 91
    :cond_0
    return-void
.end method

.method static c()V
    .locals 3

    .prologue
    .line 98
    sget-object v2, Lcom/jirbo/adcolony/aa;->a:Ljava/lang/String;

    monitor-enter v2

    .line 100
    const/4 v0, 0x1

    :try_start_0
    sput-boolean v0, Lcom/jirbo/adcolony/aa;->f:Z

    .line 102
    sget-object v0, Lcom/jirbo/adcolony/aa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/aa$a;

    .line 104
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 106
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 107
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    .line 114
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 110
    :cond_0
    :try_start_3
    sget-object v1, Lcom/jirbo/adcolony/aa;->a:Ljava/lang/String;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 112
    :try_start_4
    sget-object v0, Lcom/jirbo/adcolony/aa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 113
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 114
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    return-void

    .line 113
    :catchall_2
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1
.end method
