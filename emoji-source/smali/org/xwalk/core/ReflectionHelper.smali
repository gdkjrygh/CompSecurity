.class public Lorg/xwalk/core/ReflectionHelper;
.super Ljava/lang/Object;
.source "ReflectionHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final INTERNAL_PACKAGE:Ljava/lang/String; = "org.xwalk.core.internal"

.field private static final LIBRARY_APK_PACKAGE:Ljava/lang/String; = "org.xwalk.core"

.field private static sAllowCrossPackage:Z

.field private static sAlreadyUsingLibrary:Z

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
            "Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;",
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

.field private static sExceptionHandler:Lorg/xwalk/core/SharedXWalkExceptionHandler;

.field private static sIsWrapper:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 22
    const-class v0, Lorg/xwalk/core/ReflectionHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/xwalk/core/ReflectionHelper;->$assertionsDisabled:Z

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/xwalk/core/ReflectionHelper;->sBridgeWrapperMap:Ljava/util/Map;

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/xwalk/core/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/xwalk/core/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    .line 69
    sput-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    .line 70
    sput-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    .line 74
    sput-boolean v1, Lorg/xwalk/core/ReflectionHelper;->sAllowCrossPackage:Z

    .line 75
    sput-boolean v1, Lorg/xwalk/core/ReflectionHelper;->sAlreadyUsingLibrary:Z

    .line 76
    sput-object v2, Lorg/xwalk/core/ReflectionHelper;->sExceptionHandler:Lorg/xwalk/core/SharedXWalkExceptionHandler;

    .line 324
    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->isWrapper()Z

    move-result v0

    sput-boolean v0, Lorg/xwalk/core/ReflectionHelper;->sIsWrapper:Z

    .line 325
    return-void

    :cond_0
    move v0, v1

    .line 22
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

.method public static allowCrossPackage()V
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x1

    sput-boolean v0, Lorg/xwalk/core/ReflectionHelper;->sAllowCrossPackage:Z

    .line 126
    return-void
.end method

.method public static varargs createInstance(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "parameters"    # [Ljava/lang/Object;

    .prologue
    .line 241
    const/4 v3, 0x0

    .line 242
    .local v3, "ret":Ljava/lang/Object;
    sget-object v4, Lorg/xwalk/core/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    invoke-interface {v4, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 243
    .local v0, "creator":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    if-nez v0, :cond_0

    .line 244
    sget-object v4, Lorg/xwalk/core/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    invoke-interface {v4, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;

    .line 245
    .local v2, "helper":Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;
    if-eqz v2, :cond_0

    .line 246
    invoke-virtual {v2}, Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;->loadConstructor()Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 247
    sget-object v4, Lorg/xwalk/core/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    invoke-interface {v4, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .end local v2    # "helper":Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;
    :cond_0
    if-eqz v0, :cond_1

    .line 252
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v3

    .line 263
    .end local v3    # "ret":Ljava/lang/Object;
    :cond_1
    :goto_0
    return-object v3

    .line 253
    .restart local v3    # "ret":Ljava/lang/Object;
    :catch_0
    move-exception v1

    .line 254
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    invoke-static {v1}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 255
    .end local v1    # "e":Ljava/lang/IllegalArgumentException;
    :catch_1
    move-exception v1

    .line 256
    .local v1, "e":Ljava/lang/InstantiationException;
    invoke-static {v1}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 257
    .end local v1    # "e":Ljava/lang/InstantiationException;
    :catch_2
    move-exception v1

    .line 258
    .local v1, "e":Ljava/lang/IllegalAccessException;
    invoke-static {v1}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 259
    .end local v1    # "e":Ljava/lang/IllegalAccessException;
    :catch_3
    move-exception v1

    .line 260
    .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-static {v1}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static getBridgeContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 121
    sget-object v0, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    return-object v0
.end method

.method public static getBridgeOrWrapper(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p0, "instance"    # Ljava/lang/Object;

    .prologue
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 287
    sget-object v5, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v5, :cond_1

    .line 316
    :cond_0
    :goto_0
    return-object v4

    .line 288
    :cond_1
    if-eqz p0, :cond_0

    .line 289
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 290
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    sget-object v5, Lorg/xwalk/core/ReflectionHelper;->sBridgeWrapperMap:Ljava/util/Map;

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    .line 291
    .local v2, "method":Ljava/lang/reflect/Method;
    if-nez v2, :cond_4

    .line 292
    const-string v3, "getBridge"

    .line 293
    .local v3, "methodName":Ljava/lang/String;
    sget-boolean v5, Lorg/xwalk/core/ReflectionHelper;->sIsWrapper:Z

    if-eqz v5, :cond_2

    .line 294
    const-string v3, "getWrapper"

    .line 297
    :cond_2
    const/4 v5, 0x0

    :try_start_0
    new-array v5, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 302
    :goto_1
    if-nez v2, :cond_3

    .line 303
    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v2, p0, v5}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    .line 298
    :catch_0
    move-exception v1

    .line 299
    .local v1, "e":Ljava/lang/NoSuchMethodException;
    invoke-static {v1}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_1

    .line 305
    .end local v1    # "e":Ljava/lang/NoSuchMethodException;
    :cond_3
    sget-object v5, Lorg/xwalk/core/ReflectionHelper;->sBridgeWrapperMap:Ljava/util/Map;

    invoke-interface {v5, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .end local v3    # "methodName":Ljava/lang/String;
    :cond_4
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->isAccessible()Z

    move-result v5

    if-eqz v5, :cond_5

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v2, p0, v5}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    .line 313
    :cond_5
    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 314
    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v2, p0, v5}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 315
    .local v4, "ret":Ljava/lang/Object;
    invoke-virtual {v2, v6}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    goto :goto_0
.end method

.method public static handleException(Ljava/lang/Exception;)V
    .locals 1
    .param p0, "e"    # Ljava/lang/Exception;

    .prologue
    .line 229
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 230
    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->isWrapper()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/xwalk/core/ReflectionHelper;->sExceptionHandler:Lorg/xwalk/core/SharedXWalkExceptionHandler;

    if-eqz v0, :cond_0

    .line 231
    sget-object v0, Lorg/xwalk/core/ReflectionHelper;->sExceptionHandler:Lorg/xwalk/core/SharedXWalkExceptionHandler;

    invoke-virtual {v0, p0}, Lorg/xwalk/core/SharedXWalkExceptionHandler;->handleException(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 233
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static handleException(Ljava/lang/String;)V
    .locals 1
    .param p0, "e"    # Ljava/lang/String;

    .prologue
    .line 237
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    .line 238
    return-void
.end method

.method public static init()V
    .locals 4

    .prologue
    .line 129
    sget-boolean v2, Lorg/xwalk/core/ReflectionHelper;->$assertionsDisabled:Z

    if-nez v2, :cond_0

    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->isWrapper()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 130
    :cond_0
    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->shouldUseLibrary()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 131
    sget-boolean v2, Lorg/xwalk/core/ReflectionHelper;->sAllowCrossPackage:Z

    if-nez v2, :cond_1

    .line 132
    const-string v2, "Use SharedXWalkView if you want to support shared mode"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/String;)V

    .line 134
    :cond_1
    invoke-static {}, Lorg/xwalk/core/XWalkApplication;->getApplication()Lorg/xwalk/core/XWalkApplication;

    move-result-object v0

    .line 135
    .local v0, "app":Lorg/xwalk/core/XWalkApplication;
    if-nez v0, :cond_3

    .line 137
    const-string v2, "Shared mode requires XWalkApplication"

    invoke-static {v2}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/String;)V

    .line 155
    .end local v0    # "app":Lorg/xwalk/core/XWalkApplication;
    :cond_2
    :goto_0
    return-void

    .line 141
    .restart local v0    # "app":Lorg/xwalk/core/XWalkApplication;
    :cond_3
    :try_start_0
    const-string v2, "org.xwalk.core"

    const/4 v3, 0x3

    invoke-virtual {v0, v2, v3}, Lorg/xwalk/core/XWalkApplication;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v2

    sput-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    .line 144
    const/4 v2, 0x1

    sput-boolean v2, Lorg/xwalk/core/ReflectionHelper;->sAlreadyUsingLibrary:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :goto_1
    sget-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    if-eqz v2, :cond_2

    .line 149
    sget-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/xwalk/core/XWalkApplication;->addResource(Landroid/content/res/Resources;)V

    .line 150
    sget-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    sget-object v3, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    invoke-static {v2, v3}, Lorg/xwalk/core/ReflectionHelper;->initClassLoader(Ljava/lang/ClassLoader;Landroid/content/Context;)V

    goto :goto_0

    .line 145
    :catch_0
    move-exception v1

    .line 146
    .local v1, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    invoke-static {v1}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_1

    .line 153
    .end local v0    # "app":Lorg/xwalk/core/XWalkApplication;
    .end local v1    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    :cond_4
    const-class v2, Lorg/xwalk/core/ReflectionHelper;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lorg/xwalk/core/ReflectionHelper;->initClassLoader(Ljava/lang/ClassLoader;Landroid/content/Context;)V

    goto :goto_0
.end method

.method public static initClassLoader(Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 13
    .param p0, "loader"    # Ljava/lang/ClassLoader;
    .param p1, "bridgeContext"    # Landroid/content/Context;

    .prologue
    .line 158
    sput-object p0, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    .line 159
    sput-object p1, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    .line 160
    sget-object v9, Lorg/xwalk/core/ReflectionHelper;->sBridgeWrapperMap:Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->clear()V

    .line 161
    sget-object v9, Lorg/xwalk/core/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->clear()V

    .line 163
    :try_start_0
    sget-object v9, Lorg/xwalk/core/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

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

    .line 164
    .local v6, "name":Ljava/lang/String;
    sget-object v9, Lorg/xwalk/core/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;

    .line 165
    .local v1, "helper":Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;
    if-eqz v1, :cond_0

    sget-object v9, Lorg/xwalk/core/ReflectionHelper;->sConstructorMap:Ljava/util/Map;

    invoke-virtual {v1}, Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;->loadConstructor()Ljava/lang/reflect/Constructor;

    move-result-object v10

    invoke-interface {v9, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 187
    .end local v1    # "helper":Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v6    # "name":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 188
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    .line 190
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_1
    return-void

    .line 167
    .restart local v3    # "i$":Ljava/util/Iterator;
    :cond_1
    :try_start_1
    sget-boolean v9, Lorg/xwalk/core/ReflectionHelper;->sIsWrapper:Z

    if-eqz v9, :cond_2

    .line 170
    sget-object v9, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    const-string v10, "org.xwalk.core.internal.ReflectionHelper"

    invoke-virtual {v9, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 172
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

    .line 174
    .local v4, "initInBridge":Ljava/lang/reflect/Method;
    const/4 v9, 0x0

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    const-class v12, Lorg/xwalk/core/ReflectionHelper;

    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    aput-object v12, v10, v11

    const/4 v11, 0x1

    sget-object v12, Lorg/xwalk/core/ReflectionHelper;->sBridgeContext:Landroid/content/Context;

    aput-object v12, v10, v11

    invoke-virtual {v4, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 178
    .end local v2    # "helperInBridge":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v4    # "initInBridge":Ljava/lang/reflect/Method;
    :cond_2
    sget-object v9, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    const-string v10, "org.xwalk.core.JavascriptInterface"

    invoke-virtual {v9, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 180
    .local v5, "javascriptInterface":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v9, Lorg/xwalk/core/ReflectionHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    const-string v10, "org.xwalk.core.internal.XWalkContent"

    invoke-virtual {v9, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    .line 183
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

    .line 185
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
    .line 267
    sget-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v2, :cond_1

    const/4 v1, 0x0

    .line 282
    :cond_0
    :goto_0
    return-object v1

    .line 268
    :cond_1
    const/4 v1, 0x0

    .line 269
    .local v1, "ret":Ljava/lang/Object;
    if-eqz p0, :cond_0

    .line 271
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v1

    goto :goto_0

    .line 272
    :catch_0
    move-exception v0

    .line 273
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 274
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :catch_1
    move-exception v0

    .line 275
    .local v0, "e":Ljava/lang/IllegalAccessException;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 276
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_2
    move-exception v0

    .line 277
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 278
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_3
    move-exception v0

    .line 279
    .local v0, "e":Ljava/lang/NullPointerException;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method static isUsingLibrary()Z
    .locals 1

    .prologue
    .line 83
    sget-boolean v0, Lorg/xwalk/core/ReflectionHelper;->sAlreadyUsingLibrary:Z

    return v0
.end method

.method private static isWrapper()Z
    .locals 2

    .prologue
    .line 320
    const-class v0, Lorg/xwalk/core/ReflectionHelper;

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

    .line 199
    sget-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v2, :cond_0

    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->init()V

    .line 200
    :cond_0
    sget-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v2, :cond_1

    .line 205
    :goto_0
    return-object v1

    .line 202
    :cond_1
    :try_start_0
    sget-object v2, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    invoke-virtual {v2, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 203
    :catch_0
    move-exception v0

    .line 204
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

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

    .line 210
    sget-object v5, Lorg/xwalk/core/ReflectionHelper;->sBridgeOrWrapperLoader:Ljava/lang/ClassLoader;

    if-nez v5, :cond_0

    .line 224
    :goto_0
    return-object v4

    .line 211
    :cond_0
    array-length v5, p2

    new-array v2, v5, [Ljava/lang/Class;

    .line 212
    .local v2, "params":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    array-length v5, p2

    if-ge v1, v5, :cond_3

    .line 213
    aget-object v3, p2, v1

    .line 214
    .local v3, "type":Ljava/lang/Object;
    instance-of v5, v3, Ljava/lang/Class;

    if-eqz v5, :cond_2

    .line 215
    check-cast v3, Ljava/lang/Class;

    .end local v3    # "type":Ljava/lang/Object;
    aput-object v3, v2, v1

    .line 212
    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 216
    .restart local v3    # "type":Ljava/lang/Object;
    :cond_2
    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 217
    check-cast v3, Ljava/lang/String;

    .end local v3    # "type":Ljava/lang/Object;
    invoke-static {v3}, Lorg/xwalk/core/ReflectionHelper;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aput-object v5, v2, v1

    goto :goto_2

    .line 221
    :cond_3
    :try_start_0
    invoke-virtual {p0, p1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    goto :goto_0

    .line 222
    :catch_0
    move-exception v0

    .line 223
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static varargs registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "clazz"    # Ljava/lang/String;
    .param p2, "params"    # [Ljava/lang/Object;

    .prologue
    .line 193
    sget-object v0, Lorg/xwalk/core/ReflectionHelper;->sConstructorHelperMap:Ljava/util/Map;

    new-instance v1, Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;

    invoke-direct {v1, p1, p2}, Lorg/xwalk/core/ReflectionHelper$ConstructorHelper;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    return-void
.end method

.method static setExceptionHandler(Lorg/xwalk/core/SharedXWalkExceptionHandler;)V
    .locals 0
    .param p0, "handler"    # Lorg/xwalk/core/SharedXWalkExceptionHandler;

    .prologue
    .line 79
    sput-object p0, Lorg/xwalk/core/ReflectionHelper;->sExceptionHandler:Lorg/xwalk/core/SharedXWalkExceptionHandler;

    .line 80
    return-void
.end method

.method static shouldUseLibrary()Z
    .locals 10

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 87
    sget-boolean v4, Lorg/xwalk/core/ReflectionHelper;->sAlreadyUsingLibrary:Z

    if-eqz v4, :cond_0

    move v4, v5

    .line 117
    .local v1, "delegateClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    return v4

    .line 92
    .end local v1    # "delegateClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_0
    sget-boolean v4, Lorg/xwalk/core/ReflectionHelper;->$assertionsDisabled:Z

    if-nez v4, :cond_1

    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->isWrapper()Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4

    .line 93
    :cond_1
    const/4 v1, 0x0

    .line 95
    .restart local v1    # "delegateClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :try_start_0
    const-class v4, Lorg/xwalk/core/ReflectionHelper;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 96
    .local v0, "classLoader":Ljava/lang/ClassLoader;
    const-string v4, "org.xwalk.core.internal.XWalkViewDelegate"

    invoke-virtual {v0, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 101
    if-nez v1, :cond_2

    move v4, v5

    goto :goto_0

    .line 98
    .end local v0    # "classLoader":Ljava/lang/ClassLoader;
    :catch_0
    move-exception v2

    .local v2, "e":Ljava/lang/ClassNotFoundException;
    move v4, v5

    .line 99
    goto :goto_0

    .line 103
    .end local v2    # "e":Ljava/lang/ClassNotFoundException;
    .restart local v0    # "classLoader":Ljava/lang/ClassLoader;
    :cond_2
    :try_start_1
    const-string v4, "loadXWalkLibrary"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    const-class v9, Landroid/content/Context;

    aput-object v9, v7, v8

    invoke-virtual {v1, v4, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 105
    .local v3, "loadXWalkLibrary":Ljava/lang/reflect/Method;
    const/4 v7, 0x0

    const/4 v4, 0x1

    new-array v8, v4, [Ljava/lang/Object;

    const/4 v9, 0x0

    const/4 v4, 0x0

    check-cast v4, Landroid/content/Context;

    aput-object v4, v8, v9

    invoke-virtual {v3, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_5

    move v4, v6

    .line 117
    goto :goto_0

    .line 106
    .end local v3    # "loadXWalkLibrary":Ljava/lang/reflect/Method;
    :catch_1
    move-exception v2

    .local v2, "e":Ljava/lang/NoSuchMethodException;
    move v4, v5

    .line 107
    goto :goto_0

    .line 108
    .end local v2    # "e":Ljava/lang/NoSuchMethodException;
    :catch_2
    move-exception v2

    .local v2, "e":Ljava/lang/IllegalArgumentException;
    move v4, v5

    .line 109
    goto :goto_0

    .line 110
    .end local v2    # "e":Ljava/lang/IllegalArgumentException;
    :catch_3
    move-exception v2

    .local v2, "e":Ljava/lang/IllegalAccessException;
    move v4, v5

    .line 111
    goto :goto_0

    .line 112
    .end local v2    # "e":Ljava/lang/IllegalAccessException;
    :catch_4
    move-exception v2

    .local v2, "e":Ljava/lang/reflect/InvocationTargetException;
    move v4, v5

    .line 113
    goto :goto_0

    .line 114
    .end local v2    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_5
    move-exception v2

    .local v2, "e":Ljava/lang/UnsatisfiedLinkError;
    move v4, v5

    .line 115
    goto :goto_0
.end method
