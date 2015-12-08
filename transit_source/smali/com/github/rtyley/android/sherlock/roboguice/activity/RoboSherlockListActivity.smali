.class public Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;
.super Lcom/actionbarsherlock/app/SherlockListActivity;
.source "RoboSherlockListActivity.java"

# interfaces
.implements Lroboguice/util/RoboContext;


# instance fields
.field protected eventManager:Lroboguice/event/EventManager;

.field ignored:Lroboguice/inject/ContentViewListener;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

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
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;-><init>()V

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->scopedObjects:Ljava/util/HashMap;

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
    .line 139
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->scopedObjects:Ljava/util/HashMap;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 133
    invoke-super {p0, p1, p2, p3}, Lcom/actionbarsherlock/app/SherlockListActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 134
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnActivityResultEvent;

    invoke-direct {v1, p1, p2, p3}, Lroboguice/activity/event/OnActivityResultEvent;-><init>(IILandroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 135
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 119
    invoke-virtual {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 120
    .local v0, "currentConfig":Landroid/content/res/Configuration;
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 121
    iget-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnConfigurationChangedEvent;

    invoke-direct {v2, v0, p1}, Lroboguice/activity/event/OnConfigurationChangedEvent;-><init>(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 122
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 126
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onContentChanged()V

    .line 127
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectViewMembers(Landroid/app/Activity;)V

    .line 128
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnContentChangedEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnContentChangedEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 129
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 58
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    .line 59
    .local v0, "injector":Lroboguice/inject/RoboInjector;
    const-class v1, Lroboguice/event/EventManager;

    invoke-interface {v0, v1}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/event/EventManager;

    iput-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    .line 60
    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectMembersWithoutViews(Ljava/lang/Object;)V

    .line 61
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    iget-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnCreateEvent;

    invoke-direct {v2, p1}, Lroboguice/activity/event/OnCreateEvent;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 63
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 107
    :try_start_0
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnDestroyEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnDestroyEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 110
    :try_start_1
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onDestroy()V

    .line 115
    return-void

    .line 112
    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onDestroy()V

    throw v0

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    :try_start_2
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 112
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onDestroy()V

    throw v0

    :catchall_2
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onDestroy()V

    throw v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 91
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockListActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 92
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnNewIntentEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnNewIntentEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 93
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 85
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onPause()V

    .line 86
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnPauseEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnPauseEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 87
    return-void
.end method

.method protected onRestart()V
    .locals 2

    .prologue
    .line 67
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onRestart()V

    .line 68
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnRestartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnRestartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 69
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 79
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onResume()V

    .line 80
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnResumeEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnResumeEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 81
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 73
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onStart()V

    .line 74
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 75
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 98
    :try_start_0
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStopEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStopEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onStop()V

    .line 102
    return-void

    .line 100
    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockListActivity;->onStop()V

    throw v0
.end method
