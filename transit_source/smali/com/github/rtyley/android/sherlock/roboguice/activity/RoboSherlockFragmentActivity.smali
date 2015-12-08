.class public Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;
.super Lcom/actionbarsherlock/app/SherlockFragmentActivity;
.source "RoboSherlockFragmentActivity.java"

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
    .line 23
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->scopedObjects:Ljava/util/HashMap;

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
    .line 112
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->scopedObjects:Ljava/util/HashMap;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 106
    invoke-super {p0, p1, p2, p3}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 107
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnActivityResultEvent;

    invoke-direct {v1, p1, p2, p3}, Lroboguice/activity/event/OnActivityResultEvent;-><init>(IILandroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 108
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 93
    .local v0, "currentConfig":Landroid/content/res/Configuration;
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 94
    iget-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnConfigurationChangedEvent;

    invoke-direct {v2, v0, p1}, Lroboguice/activity/event/OnConfigurationChangedEvent;-><init>(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 95
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 99
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onContentChanged()V

    .line 100
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectViewMembers(Landroid/app/Activity;)V

    .line 101
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnContentChangedEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnContentChangedEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 102
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 31
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    .line 32
    .local v0, "injector":Lroboguice/inject/RoboInjector;
    const-class v1, Lroboguice/event/EventManager;

    invoke-interface {v0, v1}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/event/EventManager;

    iput-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    .line 33
    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectMembersWithoutViews(Ljava/lang/Object;)V

    .line 34
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 35
    iget-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnCreateEvent;

    invoke-direct {v2, p1}, Lroboguice/activity/event/OnCreateEvent;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 36
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 80
    :try_start_0
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnDestroyEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnDestroyEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 83
    :try_start_1
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onDestroy()V

    .line 88
    return-void

    .line 85
    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onDestroy()V

    throw v0

    .line 82
    :catchall_1
    move-exception v0

    .line 83
    :try_start_2
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 85
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onDestroy()V

    throw v0

    :catchall_2
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onDestroy()V

    throw v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 64
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 65
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnNewIntentEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnNewIntentEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 66
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 58
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onPause()V

    .line 59
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnPauseEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnPauseEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 60
    return-void
.end method

.method protected onRestart()V
    .locals 2

    .prologue
    .line 40
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onRestart()V

    .line 41
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnRestartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnRestartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 42
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 52
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onResume()V

    .line 53
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnResumeEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnResumeEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 54
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 46
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onStart()V

    .line 47
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 48
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 71
    :try_start_0
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStopEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStopEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onStop()V

    .line 75
    return-void

    .line 73
    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onStop()V

    throw v0
.end method
