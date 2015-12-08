.class public abstract Lroboguice/activity/RoboPreferenceActivity;
.super Landroid/preference/PreferenceActivity;
.source "RoboPreferenceActivity.java"

# interfaces
.implements Lroboguice/util/RoboContext;


# instance fields
.field protected eventManager:Lroboguice/event/EventManager;

.field ignored:Lroboguice/inject/ContentViewListener;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field protected preferenceListener:Lroboguice/inject/PreferenceListener;

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
    .line 52
    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->scopedObjects:Ljava/util/HashMap;

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
    .line 160
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->scopedObjects:Ljava/util/HashMap;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 154
    invoke-super {p0, p1, p2, p3}, Landroid/preference/PreferenceActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 155
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnActivityResultEvent;

    invoke-direct {v1, p1, p2, p3}, Lroboguice/activity/event/OnActivityResultEvent;-><init>(IILandroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 156
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 140
    invoke-virtual {p0}, Lroboguice/activity/RoboPreferenceActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 141
    .local v0, "currentConfig":Landroid/content/res/Configuration;
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 142
    iget-object v1, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnConfigurationChangedEvent;

    invoke-direct {v2, v0, p1}, Lroboguice/activity/event/OnConfigurationChangedEvent;-><init>(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 143
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 147
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onContentChanged()V

    .line 148
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectViewMembers(Landroid/app/Activity;)V

    .line 149
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnContentChangedEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnContentChangedEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 150
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 63
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    .line 64
    .local v0, "injector":Lroboguice/inject/RoboInjector;
    const-class v1, Lroboguice/event/EventManager;

    invoke-interface {v0, v1}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/event/EventManager;

    iput-object v1, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    .line 65
    const-class v1, Lroboguice/inject/PreferenceListener;

    invoke-interface {v0, v1}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/inject/PreferenceListener;

    iput-object v1, p0, Lroboguice/activity/RoboPreferenceActivity;->preferenceListener:Lroboguice/inject/PreferenceListener;

    .line 66
    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectMembersWithoutViews(Ljava/lang/Object;)V

    .line 67
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 68
    iget-object v1, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnCreateEvent;

    invoke-direct {v2, p1}, Lroboguice/activity/event/OnCreateEvent;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 69
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 128
    :try_start_0
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnDestroyEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnDestroyEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 131
    :try_start_1
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    .line 136
    return-void

    .line 133
    :catchall_0
    move-exception v0

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    throw v0

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    :try_start_2
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 133
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    throw v0

    :catchall_2
    move-exception v0

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    throw v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 112
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 113
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnNewIntentEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnNewIntentEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 114
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 106
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onPause()V

    .line 107
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnPauseEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnPauseEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 108
    return-void
.end method

.method protected onRestart()V
    .locals 2

    .prologue
    .line 88
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onRestart()V

    .line 89
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnRestartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnRestartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 90
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 100
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onResume()V

    .line 101
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnResumeEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnResumeEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 102
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 94
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStart()V

    .line 95
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 96
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 119
    :try_start_0
    iget-object v0, p0, Lroboguice/activity/RoboPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStopEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStopEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStop()V

    .line 123
    return-void

    .line 121
    :catchall_0
    move-exception v0

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStop()V

    throw v0
.end method

.method public setPreferenceScreen(Landroid/preference/PreferenceScreen;)V
    .locals 3
    .param p1, "preferenceScreen"    # Landroid/preference/PreferenceScreen;

    .prologue
    .line 73
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 75
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v1

    const-class v2, Lroboguice/inject/ContextScope;

    invoke-interface {v1, v2}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lroboguice/inject/ContextScope;

    .line 76
    .local v0, "scope":Lroboguice/inject/ContextScope;
    const-class v2, Lroboguice/inject/ContextScope;

    monitor-enter v2

    .line 77
    :try_start_0
    invoke-virtual {v0, p0}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 79
    :try_start_1
    iget-object v1, p0, Lroboguice/activity/RoboPreferenceActivity;->preferenceListener:Lroboguice/inject/PreferenceListener;

    invoke-virtual {v1}, Lroboguice/inject/PreferenceListener;->injectPreferenceViews()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    :try_start_2
    invoke-virtual {v0, p0}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    .line 83
    monitor-exit v2

    .line 84
    return-void

    .line 81
    :catchall_0
    move-exception v1

    invoke-virtual {v0, p0}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v1

    .line 83
    :catchall_1
    move-exception v1

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
