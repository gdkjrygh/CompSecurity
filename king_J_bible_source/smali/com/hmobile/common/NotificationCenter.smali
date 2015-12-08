.class public Lcom/hmobile/common/NotificationCenter;
.super Ljava/lang/Object;
.source "NotificationCenter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/common/NotificationCenter$Observer;
    }
.end annotation


# static fields
.field private static volatile _instance:Lcom/hmobile/common/NotificationCenter;


# instance fields
.field m_observerCollection:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue",
            "<",
            "Lcom/hmobile/common/NotificationCenter$Observer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    sput-object v0, Lcom/hmobile/common/NotificationCenter;->_instance:Lcom/hmobile/common/NotificationCenter;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/common/NotificationCenter;->m_observerCollection:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/hmobile/common/NotificationCenter;->m_observerCollection:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 12
    return-void
.end method

.method public static Instance()Lcom/hmobile/common/NotificationCenter;
    .locals 3

    .prologue
    .line 17
    const-class v1, Lcom/hmobile/common/NotificationCenter;

    monitor-enter v1

    .line 18
    :try_start_0
    sget-object v0, Lcom/hmobile/common/NotificationCenter;->_instance:Lcom/hmobile/common/NotificationCenter;

    if-nez v0, :cond_1

    .line 19
    const-class v2, Lcom/hmobile/common/NotificationCenter;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    :try_start_1
    sget-object v0, Lcom/hmobile/common/NotificationCenter;->_instance:Lcom/hmobile/common/NotificationCenter;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lcom/hmobile/common/NotificationCenter;

    invoke-direct {v0}, Lcom/hmobile/common/NotificationCenter;-><init>()V

    sput-object v0, Lcom/hmobile/common/NotificationCenter;->_instance:Lcom/hmobile/common/NotificationCenter;

    .line 19
    :cond_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    :cond_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    sget-object v0, Lcom/hmobile/common/NotificationCenter;->_instance:Lcom/hmobile/common/NotificationCenter;

    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0

    .line 17
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method private callMethod(Lcom/hmobile/common/NotificationCenter$Observer;)V
    .locals 8
    .param p1, "observer"    # Lcom/hmobile/common/NotificationCenter$Observer;

    .prologue
    const/4 v4, 0x0

    .line 60
    iget-object v5, p1, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    if-nez v5, :cond_1

    .line 61
    iget-object v4, p1, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    invoke-virtual {p0, v4}, Lcom/hmobile/common/NotificationCenter;->removeObserver(Ljava/lang/Object;)V

    .line 95
    :cond_0
    :goto_0
    return-void

    .line 64
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .local v0, "argumentTypes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Class<*>;>;"
    iget-object v5, p1, Lcom/hmobile/common/NotificationCenter$Observer;->Params:[Ljava/lang/Object;

    if-eqz v5, :cond_2

    .line 66
    iget-object v5, p1, Lcom/hmobile/common/NotificationCenter$Observer;->Params:[Ljava/lang/Object;

    array-length v6, v5

    :goto_1
    if-lt v4, v6, :cond_3

    .line 72
    :cond_2
    const/4 v2, 0x0

    .line 73
    .local v2, "meth":Ljava/lang/reflect/Method;
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gtz v4, :cond_4

    .line 74
    iget-object v4, p1, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    .line 75
    iget-object v5, p1, Lcom/hmobile/common/NotificationCenter$Observer;->MethodName:Ljava/lang/String;

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Class;

    .line 74
    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 81
    :goto_2
    if-eqz v2, :cond_0

    .line 82
    iget-object v4, p1, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    iget-object v5, p1, Lcom/hmobile/common/NotificationCenter$Observer;->Params:[Ljava/lang/Object;

    invoke-virtual {v2, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_0

    .line 85
    :catch_0
    move-exception v1

    .line 86
    .local v1, "e":Ljava/lang/NoSuchMethodException;
    invoke-virtual {v1}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_0

    .line 66
    .end local v1    # "e":Ljava/lang/NoSuchMethodException;
    .end local v2    # "meth":Ljava/lang/reflect/Method;
    :cond_3
    aget-object v3, v5, v4

    .line 67
    .local v3, "obj":Ljava/lang/Object;
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 77
    .end local v3    # "obj":Ljava/lang/Object;
    .restart local v2    # "meth":Ljava/lang/reflect/Method;
    :cond_4
    :try_start_1
    iget-object v4, p1, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    .line 78
    iget-object v6, p1, Lcom/hmobile/common/NotificationCenter$Observer;->MethodName:Ljava/lang/String;

    .line 79
    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Class;

    .line 77
    invoke-virtual {v5, v6, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v2

    goto :goto_2

    .line 88
    :catch_1
    move-exception v1

    .line 89
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0

    .line 90
    .end local v1    # "e":Ljava/lang/IllegalArgumentException;
    :catch_2
    move-exception v1

    .line 91
    .local v1, "e":Ljava/lang/IllegalAccessException;
    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    .line 92
    .end local v1    # "e":Ljava/lang/IllegalAccessException;
    :catch_3
    move-exception v1

    .line 93
    .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public addObserver(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7
    .param p1, "cls"    # Ljava/lang/Object;
    .param p2, "notificationType"    # Ljava/lang/String;
    .param p3, "methodName"    # Ljava/lang/String;
    .param p4, "params"    # [Ljava/lang/Object;

    .prologue
    .line 33
    new-instance v0, Lcom/hmobile/common/NotificationCenter$Observer;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/hmobile/common/NotificationCenter$Observer;-><init>(Lcom/hmobile/common/NotificationCenter;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .local v0, "newObserver":Lcom/hmobile/common/NotificationCenter$Observer;
    iget-object v1, p0, Lcom/hmobile/common/NotificationCenter;->m_observerCollection:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 40
    iget-object v1, p0, Lcom/hmobile/common/NotificationCenter;->m_observerCollection:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 41
    :goto_0
    return-void

    .line 35
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/hmobile/common/NotificationCenter$Observer;

    .line 36
    .local v6, "observer":Lcom/hmobile/common/NotificationCenter$Observer;
    invoke-virtual {v6, v0}, Lcom/hmobile/common/NotificationCenter$Observer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0
.end method

.method public postNotification(Ljava/lang/String;)V
    .locals 3
    .param p1, "notificationType"    # Ljava/lang/String;

    .prologue
    .line 52
    iget-object v1, p0, Lcom/hmobile/common/NotificationCenter;->m_observerCollection:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 57
    return-void

    .line 52
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/common/NotificationCenter$Observer;

    .line 53
    .local v0, "observer":Lcom/hmobile/common/NotificationCenter$Observer;
    iget-object v2, v0, Lcom/hmobile/common/NotificationCenter$Observer;->NotificationType:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 54
    invoke-direct {p0, v0}, Lcom/hmobile/common/NotificationCenter;->callMethod(Lcom/hmobile/common/NotificationCenter$Observer;)V

    goto :goto_0
.end method

.method public removeObserver(Ljava/lang/Object;)V
    .locals 4
    .param p1, "cls"    # Ljava/lang/Object;

    .prologue
    .line 44
    iget-object v1, p0, Lcom/hmobile/common/NotificationCenter;->m_observerCollection:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 49
    return-void

    .line 44
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/common/NotificationCenter$Observer;

    .line 45
    .local v0, "obs":Lcom/hmobile/common/NotificationCenter$Observer;
    iget-object v2, v0, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_0

    .line 46
    iget-object v2, p0, Lcom/hmobile/common/NotificationCenter;->m_observerCollection:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method
