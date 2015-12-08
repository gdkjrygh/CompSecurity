.class public Lroboguice/RoboGuice;
.super Ljava/lang/Object;
.source "RoboGuice.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/RoboGuice$util;
    }
.end annotation


# static fields
.field public static DEFAULT_STAGE:Lcom/google/inject/Stage;

.field protected static injectors:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/app/Application;",
            "Lcom/google/inject/Injector;",
            ">;"
        }
    .end annotation
.end field

.field protected static modulesResourceId:I

.field protected static resourceListeners:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/app/Application;",
            "Lroboguice/inject/ResourceListener;",
            ">;"
        }
    .end annotation
.end field

.field protected static viewListeners:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/app/Application;",
            "Lroboguice/inject/ViewListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/google/inject/Stage;->PRODUCTION:Lcom/google/inject/Stage;

    sput-object v0, Lroboguice/RoboGuice;->DEFAULT_STAGE:Lcom/google/inject/Stage;

    .line 38
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lroboguice/RoboGuice;->injectors:Ljava/util/WeakHashMap;

    .line 39
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lroboguice/RoboGuice;->resourceListeners:Ljava/util/WeakHashMap;

    .line 40
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lroboguice/RoboGuice;->viewListeners:Ljava/util/WeakHashMap;

    .line 41
    const/4 v0, 0x0

    sput v0, Lroboguice/RoboGuice;->modulesResourceId:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    return-void
.end method

.method public static destroyInjector(Landroid/content/Context;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 198
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    .line 199
    .local v0, "injector":Lroboguice/inject/RoboInjector;
    const-class v1, Lroboguice/event/EventManager;

    invoke-interface {v0, v1}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/event/EventManager;

    invoke-virtual {v1}, Lroboguice/event/EventManager;->destroy()V

    .line 200
    sget-object v1, Lroboguice/RoboGuice;->injectors:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    return-void
.end method

.method public static getBaseApplicationInjector(Landroid/app/Application;)Lcom/google/inject/Injector;
    .locals 4
    .param p0, "application"    # Landroid/app/Application;

    .prologue
    .line 50
    sget-object v2, Lroboguice/RoboGuice;->injectors:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/Injector;

    .line 51
    .local v1, "rtrn":Lcom/google/inject/Injector;
    if-eqz v1, :cond_0

    move-object v2, v1

    .line 59
    :goto_0
    return-object v2

    .line 54
    :cond_0
    const-class v3, Lroboguice/RoboGuice;

    monitor-enter v3

    .line 55
    :try_start_0
    sget-object v2, Lroboguice/RoboGuice;->injectors:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lcom/google/inject/Injector;

    move-object v1, v0

    .line 56
    if-eqz v1, :cond_1

    .line 57
    monitor-exit v3

    move-object v2, v1

    goto :goto_0

    .line 59
    :cond_1
    sget-object v2, Lroboguice/RoboGuice;->DEFAULT_STAGE:Lcom/google/inject/Stage;

    invoke-static {p0, v2}, Lroboguice/RoboGuice;->setBaseApplicationInjector(Landroid/app/Application;Lcom/google/inject/Stage;)Lcom/google/inject/Injector;

    move-result-object v2

    monitor-exit v3

    goto :goto_0

    .line 60
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public static getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 148
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    .line 149
    .local v0, "application":Landroid/app/Application;
    new-instance v1, Lroboguice/inject/ContextScopedRoboInjector;

    invoke-static {v0}, Lroboguice/RoboGuice;->getBaseApplicationInjector(Landroid/app/Application;)Lcom/google/inject/Injector;

    move-result-object v2

    invoke-static {v0}, Lroboguice/RoboGuice;->getViewListener(Landroid/app/Application;)Lroboguice/inject/ViewListener;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3}, Lroboguice/inject/ContextScopedRoboInjector;-><init>(Landroid/content/Context;Lcom/google/inject/Injector;Lroboguice/inject/ViewListener;)V

    return-object v1
.end method

.method protected static getResourceListener(Landroid/app/Application;)Lroboguice/inject/ResourceListener;
    .locals 4
    .param p0, "application"    # Landroid/app/Application;

    .prologue
    .line 172
    sget-object v2, Lroboguice/RoboGuice;->resourceListeners:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lroboguice/inject/ResourceListener;

    .line 173
    .local v0, "resourceListener":Lroboguice/inject/ResourceListener;
    if-nez v0, :cond_1

    .line 174
    const-class v3, Lroboguice/RoboGuice;

    monitor-enter v3

    .line 175
    if-nez v0, :cond_0

    .line 176
    :try_start_0
    new-instance v1, Lroboguice/inject/ResourceListener;

    invoke-direct {v1, p0}, Lroboguice/inject/ResourceListener;-><init>(Landroid/app/Application;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .end local v0    # "resourceListener":Lroboguice/inject/ResourceListener;
    .local v1, "resourceListener":Lroboguice/inject/ResourceListener;
    :try_start_1
    sget-object v2, Lroboguice/RoboGuice;->resourceListeners:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v1

    .line 179
    .end local v1    # "resourceListener":Lroboguice/inject/ResourceListener;
    .restart local v0    # "resourceListener":Lroboguice/inject/ResourceListener;
    :cond_0
    :try_start_2
    monitor-exit v3

    .line 181
    :cond_1
    return-object v0

    .line 179
    :catchall_0
    move-exception v2

    :goto_0
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .end local v0    # "resourceListener":Lroboguice/inject/ResourceListener;
    .restart local v1    # "resourceListener":Lroboguice/inject/ResourceListener;
    :catchall_1
    move-exception v2

    move-object v0, v1

    .end local v1    # "resourceListener":Lroboguice/inject/ResourceListener;
    .restart local v0    # "resourceListener":Lroboguice/inject/ResourceListener;
    goto :goto_0
.end method

.method protected static getViewListener(Landroid/app/Application;)Lroboguice/inject/ViewListener;
    .locals 4
    .param p0, "application"    # Landroid/app/Application;

    .prologue
    .line 185
    sget-object v2, Lroboguice/RoboGuice;->viewListeners:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lroboguice/inject/ViewListener;

    .line 186
    .local v0, "viewListener":Lroboguice/inject/ViewListener;
    if-nez v0, :cond_1

    .line 187
    const-class v3, Lroboguice/RoboGuice;

    monitor-enter v3

    .line 188
    if-nez v0, :cond_0

    .line 189
    :try_start_0
    new-instance v1, Lroboguice/inject/ViewListener;

    invoke-direct {v1}, Lroboguice/inject/ViewListener;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .end local v0    # "viewListener":Lroboguice/inject/ViewListener;
    .local v1, "viewListener":Lroboguice/inject/ViewListener;
    :try_start_1
    sget-object v2, Lroboguice/RoboGuice;->viewListeners:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v1

    .line 192
    .end local v1    # "viewListener":Lroboguice/inject/ViewListener;
    .restart local v0    # "viewListener":Lroboguice/inject/ViewListener;
    :cond_0
    :try_start_2
    monitor-exit v3

    .line 194
    :cond_1
    return-object v0

    .line 192
    :catchall_0
    move-exception v2

    :goto_0
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .end local v0    # "viewListener":Lroboguice/inject/ViewListener;
    .restart local v1    # "viewListener":Lroboguice/inject/ViewListener;
    :catchall_1
    move-exception v2

    move-object v0, v1

    .end local v1    # "viewListener":Lroboguice/inject/ViewListener;
    .restart local v0    # "viewListener":Lroboguice/inject/ViewListener;
    goto :goto_0
.end method

.method public static injectMembers(Landroid/content/Context;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "TT;)TT;"
        }
    .end annotation

    .prologue
    .line 156
    .local p1, "t":Ljava/lang/Object;, "TT;"
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    invoke-interface {v0, p1}, Lroboguice/inject/RoboInjector;->injectMembers(Ljava/lang/Object;)V

    .line 157
    return-object p1
.end method

.method public static newDefaultRoboModule(Landroid/app/Application;)Lroboguice/config/DefaultRoboModule;
    .locals 4
    .param p0, "application"    # Landroid/app/Application;

    .prologue
    .line 163
    new-instance v0, Lroboguice/config/DefaultRoboModule;

    new-instance v1, Lroboguice/inject/ContextScope;

    invoke-direct {v1, p0}, Lroboguice/inject/ContextScope;-><init>(Landroid/app/Application;)V

    invoke-static {p0}, Lroboguice/RoboGuice;->getViewListener(Landroid/app/Application;)Lroboguice/inject/ViewListener;

    move-result-object v2

    invoke-static {p0}, Lroboguice/RoboGuice;->getResourceListener(Landroid/app/Application;)Lroboguice/inject/ResourceListener;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Lroboguice/config/DefaultRoboModule;-><init>(Landroid/app/Application;Lroboguice/inject/ContextScope;Lroboguice/inject/ViewListener;Lroboguice/inject/ResourceListener;)V

    return-object v0
.end method

.method public static setBaseApplicationInjector(Landroid/app/Application;Lcom/google/inject/Stage;)Lcom/google/inject/Injector;
    .locals 20
    .param p0, "application"    # Landroid/app/Application;
    .param p1, "stage"    # Lcom/google/inject/Stage;

    .prologue
    .line 113
    const-class v16, Lroboguice/RoboGuice;

    monitor-enter v16

    .line 114
    :try_start_0
    sget v8, Lroboguice/RoboGuice;->modulesResourceId:I

    .line 115
    .local v8, "id":I
    if-nez v8, :cond_0

    .line 116
    invoke-virtual/range {p0 .. p0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    const-string v17, "roboguice_modules"

    const-string v18, "array"

    invoke-virtual/range {p0 .. p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v15, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    .line 118
    :cond_0
    if-lez v8, :cond_1

    invoke-virtual/range {p0 .. p0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v11

    .line 119
    .local v11, "moduleNames":[Ljava/lang/String;
    :goto_0
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .local v12, "modules":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/inject/Module;>;"
    invoke-static/range {p0 .. p0}, Lroboguice/RoboGuice;->newDefaultRoboModule(Landroid/app/Application;)Lroboguice/config/DefaultRoboModule;

    move-result-object v5

    .line 122
    .local v5, "defaultRoboModule":Lroboguice/config/DefaultRoboModule;
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    move-object v3, v11

    .local v3, "arr$":[Ljava/lang/String;
    :try_start_1
    array-length v10, v3

    .local v10, "len$":I
    const/4 v7, 0x0

    .local v7, "i$":I
    :goto_1
    if-ge v7, v10, :cond_2

    aget-object v13, v3, v7

    .line 126
    .local v13, "name":Ljava/lang/String;
    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v15

    const-class v17, Lcom/google/inject/Module;

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 129
    .local v4, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/inject/Module;>;"
    const/4 v15, 0x1

    :try_start_2
    new-array v15, v15, [Ljava/lang/Class;

    const/16 v17, 0x0

    const-class v18, Landroid/content/Context;

    aput-object v18, v15, v17

    invoke-virtual {v4, v15}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v15

    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    aput-object p0, v17, v18

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 118
    .end local v3    # "arr$":[Ljava/lang/String;
    .end local v4    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/inject/Module;>;"
    .end local v5    # "defaultRoboModule":Lroboguice/config/DefaultRoboModule;
    .end local v7    # "i$":I
    .end local v10    # "len$":I
    .end local v11    # "moduleNames":[Ljava/lang/String;
    .end local v12    # "modules":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/inject/Module;>;"
    .end local v13    # "name":Ljava/lang/String;
    :cond_1
    const/4 v15, 0x0

    :try_start_3
    new-array v11, v15, [Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 130
    .restart local v3    # "arr$":[Ljava/lang/String;
    .restart local v4    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/inject/Module;>;"
    .restart local v5    # "defaultRoboModule":Lroboguice/config/DefaultRoboModule;
    .restart local v7    # "i$":I
    .restart local v10    # "len$":I
    .restart local v11    # "moduleNames":[Ljava/lang/String;
    .restart local v12    # "modules":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/inject/Module;>;"
    .restart local v13    # "name":Ljava/lang/String;
    :catch_0
    move-exception v9

    .line 131
    .local v9, "ignored":Ljava/lang/NoSuchMethodException;
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 135
    .end local v4    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/inject/Module;>;"
    .end local v7    # "i$":I
    .end local v9    # "ignored":Ljava/lang/NoSuchMethodException;
    .end local v10    # "len$":I
    .end local v13    # "name":Ljava/lang/String;
    :catch_1
    move-exception v6

    .line 136
    .local v6, "e":Ljava/lang/Exception;
    :try_start_5
    new-instance v15, Ljava/lang/RuntimeException;

    invoke-direct {v15, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v15

    .line 142
    .end local v3    # "arr$":[Ljava/lang/String;
    .end local v5    # "defaultRoboModule":Lroboguice/config/DefaultRoboModule;
    .end local v6    # "e":Ljava/lang/Exception;
    .end local v8    # "id":I
    .end local v11    # "moduleNames":[Ljava/lang/String;
    .end local v12    # "modules":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/inject/Module;>;"
    :catchall_0
    move-exception v15

    monitor-exit v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v15

    .line 139
    .restart local v3    # "arr$":[Ljava/lang/String;
    .restart local v5    # "defaultRoboModule":Lroboguice/config/DefaultRoboModule;
    .restart local v7    # "i$":I
    .restart local v8    # "id":I
    .restart local v10    # "len$":I
    .restart local v11    # "moduleNames":[Ljava/lang/String;
    .restart local v12    # "modules":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/inject/Module;>;"
    :cond_2
    :try_start_6
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v15

    new-array v15, v15, [Lcom/google/inject/Module;

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v15

    check-cast v15, [Lcom/google/inject/Module;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v1, v15}, Lroboguice/RoboGuice;->setBaseApplicationInjector(Landroid/app/Application;Lcom/google/inject/Stage;[Lcom/google/inject/Module;)Lcom/google/inject/Injector;

    move-result-object v14

    .line 140
    .local v14, "rtrn":Lcom/google/inject/Injector;
    sget-object v15, Lroboguice/RoboGuice;->injectors:Ljava/util/WeakHashMap;

    move-object/from16 v0, p0

    invoke-virtual {v15, v0, v14}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    return-object v14
.end method

.method public static varargs setBaseApplicationInjector(Landroid/app/Application;Lcom/google/inject/Stage;[Lcom/google/inject/Module;)Lcom/google/inject/Injector;
    .locals 5
    .param p0, "application"    # Landroid/app/Application;
    .param p1, "stage"    # Lcom/google/inject/Stage;
    .param p2, "modules"    # [Lcom/google/inject/Module;

    .prologue
    .line 83
    invoke-static {p2}, Lcom/google/inject/spi/Elements;->getElements([Lcom/google/inject/Module;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/spi/Element;

    .line 84
    .local v0, "element":Lcom/google/inject/spi/Element;
    new-instance v3, Lroboguice/RoboGuice$1;

    invoke-direct {v3, p0}, Lroboguice/RoboGuice$1;-><init>(Landroid/app/Application;)V

    invoke-interface {v0, v3}, Lcom/google/inject/spi/Element;->acceptVisitor(Lcom/google/inject/spi/ElementVisitor;)Ljava/lang/Object;

    goto :goto_0

    .line 93
    .end local v0    # "element":Lcom/google/inject/spi/Element;
    :cond_0
    const-class v4, Lroboguice/RoboGuice;

    monitor-enter v4

    .line 94
    :try_start_0
    invoke-static {p1, p2}, Lcom/google/inject/Guice;->createInjector(Lcom/google/inject/Stage;[Lcom/google/inject/Module;)Lcom/google/inject/Injector;

    move-result-object v2

    .line 95
    .local v2, "rtrn":Lcom/google/inject/Injector;
    sget-object v3, Lroboguice/RoboGuice;->injectors:Ljava/util/WeakHashMap;

    invoke-virtual {v3, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    monitor-exit v4

    return-object v2

    .line 97
    .end local v2    # "rtrn":Lcom/google/inject/Injector;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public static setModulesResourceId(I)V
    .locals 0
    .param p0, "modulesResourceId"    # I

    .prologue
    .line 105
    sput p0, Lroboguice/RoboGuice;->modulesResourceId:I

    .line 106
    return-void
.end method
