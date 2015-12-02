.class public Lcom/facebook/analytics/periodicreporters/m;
.super Ljava/lang/Object;
.source "ProcessStatusPeriodicReporter.java"

# interfaces
.implements Lcom/facebook/analytics/periodicreporters/l;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/analytics/ak;

.field private final d:Lcom/facebook/base/a/d;

.field private final e:Lcom/facebook/prefs/shared/d;

.field private final f:Ljava/lang/String;

.field private g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/analytics/periodicreporters/m;

    sput-object v0, Lcom/facebook/analytics/periodicreporters/m;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/analytics/ak;Lcom/facebook/base/a/d;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/process/d;)V
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/periodicreporters/m;->g:J

    .line 49
    iput-object p1, p0, Lcom/facebook/analytics/periodicreporters/m;->b:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lcom/facebook/analytics/periodicreporters/m;->c:Lcom/facebook/analytics/ak;

    .line 51
    iput-object p3, p0, Lcom/facebook/analytics/periodicreporters/m;->d:Lcom/facebook/base/a/d;

    .line 52
    iput-object p4, p0, Lcom/facebook/analytics/periodicreporters/m;->e:Lcom/facebook/prefs/shared/d;

    .line 53
    invoke-interface {p5}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/process/c;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/periodicreporters/m;->f:Ljava/lang/String;

    .line 54
    return-void
.end method

.method private a()J
    .locals 4

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/m;->e:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->o:Lcom/facebook/prefs/shared/ae;

    const-wide/32 v2, 0x1d4c0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 12

    .prologue
    const/high16 v9, 0x44800000    # 1024.0f

    .line 100
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/m;->b:Landroid/content/Context;

    const-string v2, "activity"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 104
    new-instance v2, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 105
    invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 106
    new-instance v3, Landroid/os/Debug$MemoryInfo;

    invoke-direct {v3}, Landroid/os/Debug$MemoryInfo;-><init>()V

    .line 107
    invoke-static {v3}, Landroid/os/Debug;->getMemoryInfo(Landroid/os/Debug$MemoryInfo;)V

    .line 109
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0

    .line 110
    const/high16 v4, 0x42c80000    # 100.0f

    iget v5, v3, Landroid/os/Debug$MemoryInfo;->nativePrivateDirty:I

    iget v6, v3, Landroid/os/Debug$MemoryInfo;->dalvikPrivateDirty:I

    add-int/2addr v5, v6

    int-to-float v5, v5

    int-to-float v6, v0

    mul-float/2addr v6, v9

    div-float/2addr v5, v6

    mul-float/2addr v4, v5

    float-to-int v4, v4

    .line 112
    iget v5, v3, Landroid/os/Debug$MemoryInfo;->nativePrivateDirty:I

    mul-int/lit8 v5, v5, 0x64

    int-to-float v5, v5

    int-to-float v6, v0

    mul-float/2addr v6, v9

    div-float/2addr v5, v6

    float-to-int v5, v5

    .line 113
    iget v6, v3, Landroid/os/Debug$MemoryInfo;->nativePrivateDirty:I

    iget v7, v3, Landroid/os/Debug$MemoryInfo;->dalvikPrivateDirty:I

    add-int/2addr v6, v7

    iget v7, v3, Landroid/os/Debug$MemoryInfo;->otherPrivateDirty:I

    add-int/2addr v6, v7

    mul-int/lit8 v6, v6, 0x64

    int-to-float v6, v6

    int-to-float v7, v0

    mul-float/2addr v7, v9

    div-float/2addr v6, v7

    float-to-int v6, v6

    .line 116
    iget v7, v3, Landroid/os/Debug$MemoryInfo;->otherPrivateDirty:I

    mul-int/lit8 v7, v7, 0x64

    int-to-float v7, v7

    int-to-float v8, v0

    mul-float/2addr v8, v9

    div-float/2addr v7, v8

    float-to-int v7, v7

    .line 117
    const-wide/16 v8, 0x64

    iget-wide v10, v2, Landroid/app/ActivityManager$MemoryInfo;->threshold:J

    mul-long/2addr v8, v10

    long-to-float v8, v8

    iget-wide v9, v2, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    long-to-float v9, v9

    div-float/2addr v8, v9

    float-to-int v8, v8

    .line 121
    const-string v9, "pct_dirty_dalvik_native"

    invoke-virtual {v1, v9, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 122
    const-string v4, "pct_dirty_native"

    invoke-virtual {v1, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 123
    const-string v4, "pct_dirty_dalvik_native_other"

    invoke-virtual {v1, v4, v6}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 124
    const-string v4, "pct_dirty_other"

    invoke-virtual {v1, v4, v7}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 127
    const-string v4, "mem_available"

    iget-wide v5, v2, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    invoke-virtual {v1, v4, v5, v6}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 128
    const-string v4, "mem_threshold"

    iget-wide v5, v2, Landroid/app/ActivityManager$MemoryInfo;->threshold:J

    invoke-virtual {v1, v4, v5, v6}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 129
    const-string v4, "mem_is_low"

    iget-boolean v2, v2, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    invoke-virtual {v1, v4, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 130
    const-string v2, "mem_pct_total"

    invoke-virtual {v1, v2, v8}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 131
    const-string v2, "mem_class"

    invoke-virtual {v1, v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 135
    const-string v0, "debug_kb_private_dalvik"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->dalvikPrivateDirty:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 136
    const-string v0, "debug_kb_proportional_dalvik"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->dalvikPss:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 137
    const-string v0, "debug_kb_shared_dalvik"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->dalvikSharedDirty:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 139
    const-string v0, "debug_kb_private_native"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->nativePrivateDirty:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 140
    const-string v0, "debug_kb_proportional_native"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->nativePss:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 141
    const-string v0, "debug_kb_shared_native"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->nativeSharedDirty:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 143
    const-string v0, "debug_kb_private_other"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->otherPrivateDirty:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 144
    const-string v0, "debug_kb_proportional_other"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->otherPss:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 145
    const-string v0, "debug_kb_shared_other"

    iget v2, v3, Landroid/os/Debug$MemoryInfo;->otherSharedDirty:I

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 148
    const-string v0, "gc_total_count"

    invoke-static {}, Landroid/os/Debug;->getGlobalGcInvocationCount()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 149
    const-string v0, "gc_freed_size"

    invoke-static {}, Landroid/os/Debug;->getGlobalFreedSize()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 150
    const-string v0, "gc_freed_count"

    invoke-static {}, Landroid/os/Debug;->getGlobalFreedCount()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 153
    const-string v0, "native_heap_size"

    invoke-static {}, Landroid/os/Debug;->getNativeHeapSize()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 154
    const-string v0, "native_heap_allocated"

    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 155
    const-string v0, "native_heap_free"

    invoke-static {}, Landroid/os/Debug;->getNativeHeapFreeSize()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 158
    const-string v0, "thread_alloc_count"

    invoke-static {}, Landroid/os/Debug;->getThreadAllocCount()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 159
    const-string v0, "thread_alloc_size"

    invoke-static {}, Landroid/os/Debug;->getThreadAllocSize()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 161
    const-string v0, "memory_info"

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 162
    return-void
.end method

.method private b(J)Lcom/facebook/analytics/ca;
    .locals 2

    .prologue
    .line 88
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "process_status"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 89
    invoke-direct {p0, v0}, Lcom/facebook/analytics/periodicreporters/m;->a(Lcom/facebook/analytics/cb;)V

    .line 90
    invoke-virtual {v0, p1, p2}, Lcom/facebook/analytics/cb;->a(J)Lcom/facebook/analytics/ca;

    .line 91
    const-string v1, "process"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 92
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/m;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->d(Ljava/lang/String;)V

    .line 93
    return-object v0
.end method


# virtual methods
.method public a(JLjava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/analytics/ca;",
            ">;"
        }
    .end annotation

    .prologue
    .line 72
    iput-wide p1, p0, Lcom/facebook/analytics/periodicreporters/m;->g:J

    .line 73
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/periodicreporters/m;->b(J)Lcom/facebook/analytics/ca;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(J)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 59
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/m;->d:Lcom/facebook/base/a/d;

    invoke-virtual {v1}, Lcom/facebook/base/a/d;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 65
    :cond_0
    :goto_0
    return v0

    .line 62
    :cond_1
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/m;->c:Lcom/facebook/analytics/ak;

    invoke-interface {v1}, Lcom/facebook/analytics/ak;->a()Lcom/facebook/analytics/al;

    move-result-object v1

    sget-object v2, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-ne v1, v2, :cond_0

    .line 65
    iget-wide v1, p0, Lcom/facebook/analytics/periodicreporters/m;->g:J

    sub-long v1, p1, v1

    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/m;->a()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method
