.class public Lroboguice/activity/RoboExpandableListActivity;
.super Landroid/app/ExpandableListActivity;
.source "RoboExpandableListActivity.java"

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
    .line 45
    invoke-direct {p0}, Landroid/app/ExpandableListActivity;-><init>()V

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->scopedObjects:Ljava/util/HashMap;

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
    .line 135
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->scopedObjects:Ljava/util/HashMap;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 129
    invoke-super {p0, p1, p2, p3}, Landroid/app/ExpandableListActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 130
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnActivityResultEvent;

    invoke-direct {v1, p1, p2, p3}, Lroboguice/activity/event/OnActivityResultEvent;-><init>(IILandroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 131
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 115
    invoke-virtual {p0}, Lroboguice/activity/RoboExpandableListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 116
    .local v0, "currentConfig":Landroid/content/res/Configuration;
    invoke-super {p0, p1}, Landroid/app/ExpandableListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 117
    iget-object v1, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnConfigurationChangedEvent;

    invoke-direct {v2, v0, p1}, Lroboguice/activity/event/OnConfigurationChangedEvent;-><init>(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 118
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 122
    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onContentChanged()V

    .line 123
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectViewMembers(Landroid/app/Activity;)V

    .line 124
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnContentChangedEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnContentChangedEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 125
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 54
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    .line 55
    .local v0, "injector":Lroboguice/inject/RoboInjector;
    const-class v1, Lroboguice/event/EventManager;

    invoke-interface {v0, v1}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/event/EventManager;

    iput-object v1, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    .line 56
    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectMembersWithoutViews(Ljava/lang/Object;)V

    .line 57
    invoke-super {p0, p1}, Landroid/app/ExpandableListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 58
    iget-object v1, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnCreateEvent;

    invoke-direct {v2, p1}, Lroboguice/activity/event/OnCreateEvent;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 59
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 103
    :try_start_0
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnDestroyEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnDestroyEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 106
    :try_start_1
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onDestroy()V

    .line 111
    return-void

    .line 108
    :catchall_0
    move-exception v0

    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onDestroy()V

    throw v0

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    :try_start_2
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 108
    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onDestroy()V

    throw v0

    :catchall_2
    move-exception v0

    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onDestroy()V

    throw v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 87
    invoke-super {p0, p1}, Landroid/app/ExpandableListActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 88
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnNewIntentEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnNewIntentEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 89
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 81
    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onPause()V

    .line 82
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnPauseEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnPauseEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 83
    return-void
.end method

.method protected onRestart()V
    .locals 2

    .prologue
    .line 63
    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onRestart()V

    .line 64
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnRestartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnRestartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 65
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 75
    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onResume()V

    .line 76
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnResumeEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnResumeEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 77
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 69
    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onStart()V

    .line 70
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 71
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 94
    :try_start_0
    iget-object v0, p0, Lroboguice/activity/RoboExpandableListActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStopEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStopEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onStop()V

    .line 98
    return-void

    .line 96
    :catchall_0
    move-exception v0

    invoke-super {p0}, Landroid/app/ExpandableListActivity;->onStop()V

    throw v0
.end method
