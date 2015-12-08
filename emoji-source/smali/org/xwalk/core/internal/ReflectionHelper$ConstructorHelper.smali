.class Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;
.super Ljava/lang/Object;
.source "ReflectionHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/ReflectionHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ConstructorHelper"
.end annotation


# instance fields
.field private fullClassName:Ljava/lang/String;

.field private paramTypes:[Ljava/lang/Object;


# direct methods
.method varargs constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0
    .param p1, "className"    # Ljava/lang/String;
    .param p2, "paramTypes"    # [Ljava/lang/Object;

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;->fullClassName:Ljava/lang/String;

    .line 61
    iput-object p2, p0, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;->paramTypes:[Ljava/lang/Object;

    .line 62
    return-void
.end method


# virtual methods
.method loadConstructor()Ljava/lang/reflect/Constructor;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor",
            "<*>;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 37
    iget-object v6, p0, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;->fullClassName:Ljava/lang/String;

    invoke-static {v6}, Lorg/xwalk/core/internal/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 38
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-nez v0, :cond_0

    .line 55
    :goto_0
    return-object v5

    .line 39
    :cond_0
    iget-object v6, p0, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;->paramTypes:[Ljava/lang/Object;

    array-length v6, v6

    new-array v3, v6, [Ljava/lang/Class;

    .line 40
    .local v3, "params":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    iget-object v6, p0, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;->paramTypes:[Ljava/lang/Object;

    array-length v6, v6

    if-ge v2, v6, :cond_3

    .line 41
    iget-object v6, p0, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;->paramTypes:[Ljava/lang/Object;

    aget-object v4, v6, v2

    .line 45
    .local v4, "type":Ljava/lang/Object;
    instance-of v6, v4, Ljava/lang/Class;

    if-eqz v6, :cond_2

    .line 46
    check-cast v4, Ljava/lang/Class;

    .end local v4    # "type":Ljava/lang/Object;
    aput-object v4, v3, v2

    .line 40
    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 47
    .restart local v4    # "type":Ljava/lang/Object;
    :cond_2
    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_1

    .line 48
    check-cast v4, Ljava/lang/String;

    .end local v4    # "type":Ljava/lang/Object;
    invoke-static {v4}, Lorg/xwalk/core/internal/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aput-object v6, v3, v2

    goto :goto_2

    .line 52
    :cond_3
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    goto :goto_0

    .line 53
    :catch_0
    move-exception v1

    .line 54
    .local v1, "e":Ljava/lang/NoSuchMethodException;
    invoke-static {v1}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method
