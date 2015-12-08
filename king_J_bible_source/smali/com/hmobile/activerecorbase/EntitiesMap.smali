.class Lcom/hmobile/activerecorbase/EntitiesMap;
.super Ljava/lang/Object;
.source "EntitiesMap.java"


# instance fields
.field _map:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/hmobile/activerecorbase/EntitiesMap;->map:Ljava/util/Map;

    .line 19
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/hmobile/activerecorbase/EntitiesMap;->_map:Ljava/util/WeakHashMap;

    .line 17
    return-void
.end method

.method private makeKey(Ljava/lang/Class;J)Ljava/lang/String;
    .locals 2
    .param p1, "entityType"    # Ljava/lang/Class;
    .param p2, "id"    # J

    .prologue
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .local v0, "sb":Ljava/lang/StringBuilder;
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method get(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 4
    .param p2, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;J)TT;"
        }
    .end annotation

    .prologue
    .line 23
    .local p1, "c":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-direct {p0, p1, p2, p3}, Lcom/hmobile/activerecorbase/EntitiesMap;->makeKey(Ljava/lang/Class;J)Ljava/lang/String;

    move-result-object v1

    .line 24
    .local v1, "key":Ljava/lang/String;
    iget-object v2, p0, Lcom/hmobile/activerecorbase/EntitiesMap;->map:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 25
    .local v0, "i":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Lcom/hmobile/activerecorbase/ActiveRecordBase;>;"
    if-nez v0, :cond_0

    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    return-object v2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    goto :goto_0
.end method

.method set(Lcom/hmobile/activerecorbase/ActiveRecordBase;)V
    .locals 4
    .param p1, "e"    # Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .prologue
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getID()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/hmobile/activerecorbase/EntitiesMap;->makeKey(Ljava/lang/Class;J)Ljava/lang/String;

    move-result-object v0

    .line 32
    .local v0, "key":Ljava/lang/String;
    iget-object v1, p0, Lcom/hmobile/activerecorbase/EntitiesMap;->map:Ljava/util/Map;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    return-void
.end method
