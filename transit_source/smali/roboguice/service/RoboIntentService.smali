.class public abstract Lroboguice/service/RoboIntentService;
.super Landroid/app/IntentService;
.source "RoboIntentService.java"

# interfaces
.implements Lroboguice/util/RoboContext;


# instance fields
.field protected eventManager:Lroboguice/event/EventManager;

.field protected scopedObjects:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 51
    invoke-direct {p0, p1}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lroboguice/service/RoboIntentService;->scopedObjects:Ljava/util/HashMap;

    .line 52
    return-void
.end method


# virtual methods
.method public getScopedObjectMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 94
    iget-object v0, p0, Lroboguice/service/RoboIntentService;->scopedObjects:Ljava/util/HashMap;

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 87
    invoke-virtual {p0}, Lroboguice/service/RoboIntentService;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 88
    .local v0, "currentConfig":Landroid/content/res/Configuration;
    invoke-super {p0, p1}, Landroid/app/IntentService;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 89
    iget-object v1, p0, Lroboguice/service/RoboIntentService;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/service/event/OnConfigurationChangedEvent;

    invoke-direct {v2, v0, p1}, Lroboguice/service/event/OnConfigurationChangedEvent;-><init>(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 90
    return-void
.end method

.method public onCreate()V
    .locals 3

    .prologue
    .line 57
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    .line 58
    .local v0, "injector":Lcom/google/inject/Injector;
    const-class v1, Lroboguice/event/EventManager;

    invoke-interface {v0, v1}, Lcom/google/inject/Injector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/event/EventManager;

    iput-object v1, p0, Lroboguice/service/RoboIntentService;->eventManager:Lroboguice/event/EventManager;

    .line 59
    invoke-interface {v0, p0}, Lcom/google/inject/Injector;->injectMembers(Ljava/lang/Object;)V

    .line 60
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 61
    iget-object v1, p0, Lroboguice/service/RoboIntentService;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/service/event/OnCreateEvent;

    invoke-direct {v2}, Lroboguice/service/event/OnCreateEvent;-><init>()V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 74
    :try_start_0
    iget-object v0, p0, Lroboguice/service/RoboIntentService;->eventManager:Lroboguice/event/EventManager;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lroboguice/service/RoboIntentService;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/service/event/OnDestroyEvent;

    invoke-direct {v1}, Lroboguice/service/event/OnDestroyEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    :cond_0
    :try_start_1
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    .line 83
    return-void

    .line 80
    :catchall_0
    move-exception v0

    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    throw v0

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    :try_start_2
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 80
    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    throw v0

    :catchall_2
    move-exception v0

    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    throw v0
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "startId"    # I

    .prologue
    .line 66
    invoke-super {p0, p1, p2}, Landroid/app/IntentService;->onStart(Landroid/content/Intent;I)V

    .line 67
    iget-object v0, p0, Lroboguice/service/RoboIntentService;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/service/event/OnStartEvent;

    invoke-direct {v1}, Lroboguice/service/event/OnStartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 68
    return-void
.end method
