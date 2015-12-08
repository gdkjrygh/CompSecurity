.class Lorg/xwalk/core/internal/InMemorySharedPreferences;
.super Ljava/lang/Object;
.source "InMemorySharedPreferences.java"

# interfaces
.implements Landroid/content/SharedPreferences;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/InMemorySharedPreferences$1;,
        Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;
    }
.end annotation


# instance fields
.field private final mData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 28
    .local p1, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    .line 30
    return-void
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/InMemorySharedPreferences;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/InMemorySharedPreferences;

    .prologue
    .line 19
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public contains(Ljava/lang/String;)Z
    .locals 2
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 102
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    monitor-enter v1

    .line 103
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    monitor-exit v1

    return v0

    .line 104
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public edit()Landroid/content/SharedPreferences$Editor;
    .locals 2

    .prologue
    .line 109
    new-instance v0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;-><init>(Lorg/xwalk/core/internal/InMemorySharedPreferences;Lorg/xwalk/core/internal/InMemorySharedPreferences$1;)V

    return-object v0
.end method

.method public getAll()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    .prologue
    .line 34
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    monitor-enter v1

    .line 35
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 36
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defValue"    # Z

    .prologue
    .line 92
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    monitor-enter v1

    .line 93
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .end local p2    # "defValue":Z
    monitor-exit v1

    .line 97
    :goto_0
    return p2

    .line 96
    .restart local p2    # "defValue":Z
    :cond_0
    monitor-exit v1

    goto :goto_0

    .end local p2    # "defValue":Z
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getFloat(Ljava/lang/String;F)F
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defValue"    # F

    .prologue
    .line 82
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    monitor-enter v1

    .line 83
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result p2

    .end local p2    # "defValue":F
    monitor-exit v1

    .line 87
    :goto_0
    return p2

    .line 86
    .restart local p2    # "defValue":F
    :cond_0
    monitor-exit v1

    goto :goto_0

    .end local p2    # "defValue":F
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getInt(Ljava/lang/String;I)I
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defValue"    # I

    .prologue
    .line 62
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    monitor-enter v1

    .line 63
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .end local p2    # "defValue":I
    monitor-exit v1

    .line 67
    :goto_0
    return p2

    .line 66
    .restart local p2    # "defValue":I
    :cond_0
    monitor-exit v1

    goto :goto_0

    .end local p2    # "defValue":I
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getLong(Ljava/lang/String;J)J
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defValue"    # J

    .prologue
    .line 72
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    monitor-enter v1

    .line 73
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    .end local p2    # "defValue":J
    monitor-exit v1

    .line 77
    :goto_0
    return-wide p2

    .line 76
    .restart local p2    # "defValue":J
    :cond_0
    monitor-exit v1

    goto :goto_0

    .end local p2    # "defValue":J
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defValue"    # Ljava/lang/String;

    .prologue
    .line 41
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    monitor-enter v1

    .line 42
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    monitor-exit v1

    .line 46
    :goto_0
    return-object v0

    .line 45
    :cond_0
    monitor-exit v1

    move-object v0, p2

    .line 46
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 52
    .local p2, "defValues":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    monitor-enter v1

    .line 53
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    .end local p2    # "defValues":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    monitor-exit v1

    .line 57
    :goto_0
    return-object p2

    .line 56
    .restart local p2    # "defValues":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_0
    monitor-exit v1

    goto :goto_0

    .end local p2    # "defValues":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .prologue
    .line 116
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .prologue
    .line 122
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
