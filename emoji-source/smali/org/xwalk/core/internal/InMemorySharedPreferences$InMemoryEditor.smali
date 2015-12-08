.class Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;
.super Ljava/lang/Object;
.source "InMemorySharedPreferences.java"

# interfaces
.implements Landroid/content/SharedPreferences$Editor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/InMemorySharedPreferences;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "InMemoryEditor"
.end annotation


# instance fields
.field private volatile mApplyCalled:Z

.field private final mChanges:Ljava/util/Map;
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

.field private mClearCalled:Z

.field final synthetic this$0:Lorg/xwalk/core/internal/InMemorySharedPreferences;


# direct methods
.method private constructor <init>(Lorg/xwalk/core/internal/InMemorySharedPreferences;)V
    .locals 1

    .prologue
    .line 125
    iput-object p1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->this$0:Lorg/xwalk/core/internal/InMemorySharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lorg/xwalk/core/internal/InMemorySharedPreferences;Lorg/xwalk/core/internal/InMemorySharedPreferences$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/xwalk/core/internal/InMemorySharedPreferences;
    .param p2, "x1"    # Lorg/xwalk/core/internal/InMemorySharedPreferences$1;

    .prologue
    .line 125
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;-><init>(Lorg/xwalk/core/internal/InMemorySharedPreferences;)V

    return-void
.end method


# virtual methods
.method public apply()V
    .locals 7

    .prologue
    .line 213
    iget-object v4, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->this$0:Lorg/xwalk/core/internal/InMemorySharedPreferences;

    # getter for: Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;
    invoke-static {v4}, Lorg/xwalk/core/internal/InMemorySharedPreferences;->access$100(Lorg/xwalk/core/internal/InMemorySharedPreferences;)Ljava/util/Map;

    move-result-object v5

    monitor-enter v5

    .line 214
    :try_start_0
    iget-object v6, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 215
    :try_start_1
    iget-boolean v4, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v4, :cond_0

    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-direct {v4}, Ljava/lang/IllegalStateException;-><init>()V

    throw v4

    .line 233
    :catchall_0
    move-exception v4

    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v4

    .line 234
    :catchall_1
    move-exception v4

    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v4

    .line 216
    :cond_0
    :try_start_3
    iget-boolean v4, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mClearCalled:Z

    if-eqz v4, :cond_1

    .line 217
    iget-object v4, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->this$0:Lorg/xwalk/core/internal/InMemorySharedPreferences;

    # getter for: Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;
    invoke-static {v4}, Lorg/xwalk/core/internal/InMemorySharedPreferences;->access$100(Lorg/xwalk/core/internal/InMemorySharedPreferences;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->clear()V

    .line 219
    :cond_1
    iget-object v4, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 220
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 221
    .local v2, "key":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 222
    .local v3, "value":Ljava/lang/Object;
    if-ne v3, p0, :cond_2

    .line 224
    iget-object v4, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->this$0:Lorg/xwalk/core/internal/InMemorySharedPreferences;

    # getter for: Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;
    invoke-static {v4}, Lorg/xwalk/core/internal/InMemorySharedPreferences;->access$100(Lorg/xwalk/core/internal/InMemorySharedPreferences;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 226
    :cond_2
    iget-object v4, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->this$0:Lorg/xwalk/core/internal/InMemorySharedPreferences;

    # getter for: Lorg/xwalk/core/internal/InMemorySharedPreferences;->mData:Ljava/util/Map;
    invoke-static {v4}, Lorg/xwalk/core/internal/InMemorySharedPreferences;->access$100(Lorg/xwalk/core/internal/InMemorySharedPreferences;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 232
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v2    # "key":Ljava/lang/String;
    .end local v3    # "value":Ljava/lang/Object;
    :cond_3
    const/4 v4, 0x1

    iput-boolean v4, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    .line 233
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 234
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 235
    return-void
.end method

.method public clear()Landroid/content/SharedPreferences$Editor;
    .locals 2

    .prologue
    .line 198
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v1

    .line 199
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 202
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 200
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mClearCalled:Z

    .line 201
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0
.end method

.method public commit()Z
    .locals 1

    .prologue
    .line 207
    invoke-virtual {p0}, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->apply()V

    .line 208
    const/4 v0, 0x1

    return v0
.end method

.method public putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    .locals 3
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Z

    .prologue
    .line 179
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v1

    .line 180
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 183
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 181
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0
.end method

.method public putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
    .locals 3
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # F

    .prologue
    .line 170
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v1

    .line 171
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 174
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 172
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0
.end method

.method public putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    .locals 3
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # I

    .prologue
    .line 152
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v1

    .line 153
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 156
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 154
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0
.end method

.method public putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    .locals 4
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # J

    .prologue
    .line 161
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v1

    .line 162
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 165
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 163
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 134
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v1

    .line 135
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 138
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 136
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0
.end method

.method public putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
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
            "Landroid/content/SharedPreferences$Editor;"
        }
    .end annotation

    .prologue
    .line 143
    .local p2, "values":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v1

    .line 144
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 147
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 145
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0
.end method

.method public remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 188
    iget-object v1, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    monitor-enter v1

    .line 189
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mApplyCalled:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 193
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 191
    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/xwalk/core/internal/InMemorySharedPreferences$InMemoryEditor;->mChanges:Ljava/util/Map;

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0
.end method
