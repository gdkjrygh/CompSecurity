.class public abstract Lcom/google/zxing/client/android/common/PlatformSupportManager;
.super Ljava/lang/Object;
.source "PlatformSupportManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final defaultImplementation:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final implementations:Ljava/util/SortedMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final managedInterface:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-class v0, Lcom/google/zxing/client/android/common/PlatformSupportManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->TAG:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;TT;)V"
        }
    .end annotation

    .prologue
    .line 53
    .local p0, "this":Lcom/google/zxing/client/android/common/PlatformSupportManager;, "Lcom/google/zxing/client/android/common/PlatformSupportManager<TT;>;"
    .local p1, "managedInterface":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "defaultImplementation":Ljava/lang/Object;, "TT;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 57
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 58
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 60
    :cond_1
    iput-object p1, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->managedInterface:Ljava/lang/Class;

    .line 61
    iput-object p2, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->defaultImplementation:Ljava/lang/Object;

    .line 62
    new-instance v0, Ljava/util/TreeMap;

    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->implementations:Ljava/util/SortedMap;

    .line 63
    return-void
.end method


# virtual methods
.method protected final addImplementationClass(ILjava/lang/String;)V
    .locals 2
    .param p1, "minVersion"    # I
    .param p2, "className"    # Ljava/lang/String;

    .prologue
    .line 66
    .local p0, "this":Lcom/google/zxing/client/android/common/PlatformSupportManager;, "Lcom/google/zxing/client/android/common/PlatformSupportManager<TT;>;"
    iget-object v0, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->implementations:Ljava/util/SortedMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    return-void
.end method

.method public final build()Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 70
    .local p0, "this":Lcom/google/zxing/client/android/common/PlatformSupportManager;, "Lcom/google/zxing/client/android/common/PlatformSupportManager<TT;>;"
    iget-object v8, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->implementations:Ljava/util/SortedMap;

    invoke-interface {v8}, Ljava/util/SortedMap;->keySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_1

    .line 90
    sget-object v8, Lcom/google/zxing/client/android/common/PlatformSupportManager;->TAG:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Using default implementation "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->defaultImplementation:Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " of "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget-object v10, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->managedInterface:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    iget-object v8, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->defaultImplementation:Ljava/lang/Object;

    :goto_1
    return-object v8

    .line 70
    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    .line 71
    .local v6, "minVersion":Ljava/lang/Integer;
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-lt v9, v10, :cond_0

    .line 72
    iget-object v9, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->implementations:Ljava/util/SortedMap;

    invoke-interface {v9, v6}, Ljava/util/SortedMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 74
    .local v0, "className":Ljava/lang/String;
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    iget-object v10, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->managedInterface:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 75
    .local v1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+TT;>;"
    sget-object v9, Lcom/google/zxing/client/android/common/PlatformSupportManager;->TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Using implementation "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " of "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/google/zxing/client/android/common/PlatformSupportManager;->managedInterface:Ljava/lang/Class;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " for SDK "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Class;

    invoke-virtual {v1, v9}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Object;

    invoke-virtual {v9, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v8

    goto :goto_1

    .line 77
    .end local v1    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+TT;>;"
    :catch_0
    move-exception v2

    .line 78
    .local v2, "cnfe":Ljava/lang/ClassNotFoundException;
    sget-object v9, Lcom/google/zxing/client/android/common/PlatformSupportManager;->TAG:Ljava/lang/String;

    invoke-static {v9, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 79
    .end local v2    # "cnfe":Ljava/lang/ClassNotFoundException;
    :catch_1
    move-exception v3

    .line 80
    .local v3, "iae":Ljava/lang/IllegalAccessException;
    sget-object v9, Lcom/google/zxing/client/android/common/PlatformSupportManager;->TAG:Ljava/lang/String;

    invoke-static {v9, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 81
    .end local v3    # "iae":Ljava/lang/IllegalAccessException;
    :catch_2
    move-exception v4

    .line 82
    .local v4, "ie":Ljava/lang/InstantiationException;
    sget-object v9, Lcom/google/zxing/client/android/common/PlatformSupportManager;->TAG:Ljava/lang/String;

    invoke-static {v9, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 83
    .end local v4    # "ie":Ljava/lang/InstantiationException;
    :catch_3
    move-exception v7

    .line 84
    .local v7, "nsme":Ljava/lang/NoSuchMethodException;
    sget-object v9, Lcom/google/zxing/client/android/common/PlatformSupportManager;->TAG:Ljava/lang/String;

    invoke-static {v9, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 85
    .end local v7    # "nsme":Ljava/lang/NoSuchMethodException;
    :catch_4
    move-exception v5

    .line 86
    .local v5, "ite":Ljava/lang/reflect/InvocationTargetException;
    sget-object v9, Lcom/google/zxing/client/android/common/PlatformSupportManager;->TAG:Ljava/lang/String;

    invoke-static {v9, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0
.end method
