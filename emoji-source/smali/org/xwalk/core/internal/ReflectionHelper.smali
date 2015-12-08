.class public Lorg/xwalk/core/internal/ReflectionHelper;
.super Ljava/lang/Object;
.source "ReflectionHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final INTERNAL_PACKAGE:Ljava/lang/String; = "org.xwalk.core.internal"

.field private static final LIBRARY_APK_PACKAGE:Ljava/lang/String; = "org.xwalk.core"

.field private static sBridgeContext:Landroid/content/Context;

.field private static sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

.field private static sBridgeWrapperMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field private static sConstructorHelperMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;",
            ">;"
        }
    .end annotation
.end field

.field private static sConstructorMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor",
            "<*>;>;"
        }
    .end annotation
.end field

.field private static sIsWrapper:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 22
    const-class v0, Lorg/xwalk/core/internal/ReflectionHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/xwalk/core/internal/ReflectionHelper;->$assertionsDisabled:Z

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeWrapperMap:Ljava/util/Map;

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    .line 69
    sput-object v1, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    .line 70
    sput-object v1, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    .line 332
    invoke-static {}, Lorg/xwalk/core/internal/ReflectionHelper;->isWrapper()Z

    move-result v0

    sput-boolean v0, Lorg/xwalk/core/internal/ReflectionHelper;->sIsWrapper:Z

    .line 333
    return-void

    .line 22
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    return-void
.end method

.method public static varargs createInstance(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "parameters"    # [Ljava/lang/Object;

    .prologue
    .line 249
    const/4 v3, 0x0

    .line 250
    .local v3, "ret":Ljava/lang/Object;
    sget-object v4, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    invoke-interface {v4, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 251
    .local v0, "creator":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    if-nez v0, :cond_0

    .line 252
    sget-object v4, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    invoke-interface {v4, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;

    .line 253
    .local v2, "helper":Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;
    if-eqz v2, :cond_0

    .line 254
    invoke-virtual {v2}, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;->loadConstructor()Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 255
    sget-object v4, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    invoke-interface {v4, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .end local v2    # "helper":Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;
    :cond_0
    if-eqz v0, :cond_1

    .line 260
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v3

    .line 271
    .end local v3    # "ret":Ljava/lang/Object;
    :cond_1
    :goto_0
    return-object v3

    .line 261
    .restart local v3    # "ret":Ljava/lang/Object;
    :catch_0
    move-exception v1

    .line 262
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    invoke-static {v1}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 263
    .end local v1    # "e":Ljava/lang/IllegalArgumentException;
    :catch_1
    move-exception v1

    .line 264
    .local v1, "e":Ljava/lang/InstantiationException;
    invoke-static {v1}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 265
    .end local v1    # "e":Ljava/lang/InstantiationException;
    :catch_2
    move-exception v1

    .line 266
    .local v1, "e":Ljava/lang/IllegalAccessException;
    invoke-static {v1}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 267
    .end local v1    # "e":Ljava/lang/IllegalAccessException;
    :catch_3
    move-exception v1

    .line 268
    .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-static {v1}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static getBridgeContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 123
    sget-object v0, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    return-object v0
.end method

.method public static getBridgeOrWrapper(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p0, "instance"    # Ljava/lang/Object;

    .prologue
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 295
    sget-object v5, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v5, :cond_1

    .line 324
    :cond_0
    :goto_0
    return-object v4

    .line 296
    :cond_1
    if-eqz p0, :cond_0

    .line 297
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 298
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    sget-object v5, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeWrapperMap:Ljava/util/Map;

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    .line 299
    .local v2, "method":Ljava/lang/reflect/Method;
    if-nez v2, :cond_4

    .line 300
    const-string v3, "getBridge"

    .line 301
    .local v3, "methodName":Ljava/lang/String;
    sget-boolean v5, Lorg/xwalk/core/internal/ReflectionHelper;->sIsWrapper:Z

    if-eqz v5, :cond_2

    .line 302
    const-string v3, "getWrapper"

    .line 305
    :cond_2
    const/4 v5, 0x0

    :try_start_0
    new-array v5, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 310
    :goto_1
    if-nez v2, :cond_3

    .line 311
    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v2, p0, v5}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    .line 306
    :catch_0
    move-exception v1

    .line 307
    .local v1, "e":Ljava/lang/NoSuchMethodException;
    invoke-static {v1}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_1

    .line 313
    .end local v1    # "e":Ljava/lang/NoSuchMethodException;
    :cond_3
    sget-object v5, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeWrapperMap:Ljava/util/Map;

    invoke-interface {v5, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .end local v3    # "methodName":Ljava/lang/String;
    :cond_4
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->isAccessible()Z

    move-result v5

    if-eqz v5, :cond_5

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v2, p0, v5}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    .line 321
    :cond_5
    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 322
    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v2, p0, v5}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 323
    .local v4, "ret":Ljava/lang/Object;
    invoke-virtual {v2, v6}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    goto :goto_0
.end method

.method public static handleException(Ljava/lang/Exception;)V
    .locals 1
    .param p0, "e"    # Ljava/lang/Exception;

    .prologue
    .line 235
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 241
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static handleException(Ljava/lang/String;)V
    .locals 1
    .param p0, "e"    # Ljava/lang/String;

    .prologue
    .line 245
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    .line 246
    return-void
.end method

.method public static init()V
    .locals 1

    .prologue
    .line 133
    sget-boolean v0, Lorg/xwalk/core/internal/ReflectionHelper;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {}, Lorg/xwalk/core/internal/ReflectionHelper;->isWrapper()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 161
    :cond_0
    return-void
.end method

.method public static initClassLoader(Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 13
    .param p0, "loader"    # Ljava/lang/ClassLoader;
    .param p1, "bridgeContext"    # Landroid/content/Context;

    .prologue
    .line 164
    sput-object p0, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    .line 165
    sput-object p1, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    .line 166
    sget-object v9, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeWrapperMap:Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->clear()V

    .line 167
    sget-object v9, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->clear()V

    .line 169
    :try_start_0
    sget-object v9, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 170
    .local v6, "name":Ljava/lang/String;
    sget-object v9, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;

    .line 171
    .local v1, "helper":Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;
    if-eqz v1, :cond_0

    sget-object v9, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;->loadConstructor()Ljava/lang/reflect/Constructor;

    move-result-object v10

    invoke-interface {v9, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 193
    .end local v1    # "helper":Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v6    # "name":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 194
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    .line 196
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_1
    return-void

    .line 173
    .restart local v3    # "i$":Ljava/util/Iterator;
    :cond_1
    :try_start_1
    sget-boolean v9, Lorg/xwalk/core/internal/ReflectionHelper;->sIsWrapper:Z

    if-eqz v9, :cond_2

    .line 176
    sget-object v9, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    const-string v10, "org.xwalk.core.internal.ReflectionHelper"

    invoke-virtual {v9, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 178
    .local v2, "helperInBridge":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v9, "initClassLoader"

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Class;

    const/4 v11, 0x0

    const-class v12, Ljava/lang/ClassLoader;

    aput-object v12, v10, v11

    const/4 v11, 0x1

    const-class v12, Landroid/content/Context;

    aput-object v12, v10, v11

    invoke-virtual {v2, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 180
    .local v4, "initInBridge":Ljava/lang/reflect/Method;
    const/4 v9, 0x0

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    const-class v12, Lorg/xwalk/core/internal/ReflectionHelper;

    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    aput-object v12, v10, v11

    const/4 v11, 0x1

    sget-object v12, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    aput-object v12, v10, v11

    invoke-virtual {v4, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 184
    .end local v2    # "helperInBridge":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v4    # "initInBridge":Ljava/lang/reflect/Method;
    :cond_2
    sget-object v9, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    const-string v10, "org.xwalk.core.JavascriptInterface"

    invoke-virtual {v9, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 186
    .local v5, "javascriptInterface":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v9, Lorg/xwalk/core/internal/ReflectionHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    const-string v10, "org.xwalk.core.internal.XWalkContent"

    invoke-virtual {v9, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    .line 189
    .local v8, "xwalkContentInInternal":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v9, "setJavascriptInterfaceClass"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    aput-object v12, v10, v11

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 191
    .local v7, "setJavascriptInterface":Ljava/lang/reflect/Method;
    const/4 v9, 0x0

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v5, v10, v11

    invoke-virtual {v7, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public static varargs invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p0, "m"    # Ljava/lang/reflect/Method;
    .param p1, "instance"    # Ljava/lang/Object;
    .param p2, "parameters"    # [Ljava/lang/Object;

    .prologue
    .line 275
    sget-object v2, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v2, :cond_1

    const/4 v1, 0x0

    .line 290
    :cond_0
    :goto_0
    return-object v1

    .line 276
    :cond_1
    const/4 v1, 0x0

    .line 277
    .local v1, "ret":Ljava/lang/Object;
    if-eqz p0, :cond_0

    .line 279
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v1

    goto :goto_0

    .line 280
    :catch_0
    move-exception v0

    .line 281
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 282
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :catch_1
    move-exception v0

    .line 283
    .local v0, "e":Ljava/lang/IllegalAccessException;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 284
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_2
    move-exception v0

    .line 285
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 286
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_3
    move-exception v0

    .line 287
    .local v0, "e":Ljava/lang/NullPointerException;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private static isWrapper()Z
    .locals 2

    .prologue
    .line 328
    const-class v0, Lorg/xwalk/core/internal/ReflectionHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "org.xwalk.core.internal"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static loadClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3
    .param p0, "clazz"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 205
    sget-object v2, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v2, :cond_0

    invoke-static {}, Lorg/xwalk/core/internal/ReflectionHelper;->init()V

    .line 206
    :cond_0
    sget-object v2, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v2, :cond_1

    .line 211
    :goto_0
    return-object v1

    .line 208
    :cond_1
    :try_start_0
    sget-object v2, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    invoke-virtual {v2, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 209
    :catch_0
    move-exception v0

    .line 210
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static varargs loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "paramTypes"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .prologue
    .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v4, 0x0

    .line 216
    sget-object v5, Lorg/xwalk/core/internal/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v5, :cond_0

    .line 230
    :goto_0
    return-object v4

    .line 217
    :cond_0
    array-length v5, p2

    new-array v2, v5, [Ljava/lang/Class;

    .line 218
    .local v2, "params":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    array-length v5, p2

    if-ge v1, v5, :cond_3

    .line 219
    aget-object v3, p2, v1

    .line 220
    .local v3, "type":Ljava/lang/Object;
    instance-of v5, v3, Ljava/lang/Class;

    if-eqz v5, :cond_2

    .line 221
    check-cast v3, Ljava/lang/Class;

    .end local v3    # "type":Ljava/lang/Object;
    aput-object v3, v2, v1

    .line 218
    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 222
    .restart local v3    # "type":Ljava/lang/Object;
    :cond_2
    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 223
    check-cast v3, Ljava/lang/String;

    .end local v3    # "type":Ljava/lang/Object;
    invoke-static {v3}, Lorg/xwalk/core/internal/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aput-object v5, v2, v1

    goto :goto_2

    .line 227
    :cond_3
    :try_start_0
    invoke-virtual {p0, p1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    goto :goto_0

    .line 228
    :catch_0
    move-exception v0

    .line 229
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static varargs registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "clazz"    # Ljava/lang/String;
    .param p2, "params"    # [Ljava/lang/Object;

    .prologue
    .line 199
    sget-object v0, Lorg/xwalk/core/internal/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    new-instance v1, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;

    invoke-direct {v1, p1, p2}, Lorg/xwalk/core/internal/ReflectionHelper$ConstructorHelper;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    return-void
.end method
