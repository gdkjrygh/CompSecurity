.class public Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;
.super Lcom/actionbarsherlock/app/SherlockPreferenceActivity;
.source "RoboSherlockPreferenceActivity.java"

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
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;-><init>()V

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->scopedObjects:Ljava/util/HashMap;

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
    .line 159
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->scopedObjects:Ljava/util/HashMap;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 153
    invoke-super {p0, p1, p2, p3}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 154
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnActivityResultEvent;

    invoke-direct {v1, p1, p2, p3}, Lroboguice/activity/event/OnActivityResultEvent;-><init>(IILandroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 155
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 139
    invoke-virtual {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 140
    .local v0, "currentConfig":Landroid/content/res/Configuration;
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 141
    iget-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnConfigurationChangedEvent;

    invoke-direct {v2, v0, p1}, Lroboguice/activity/event/OnConfigurationChangedEvent;-><init>(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 142
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .prologue
    .line 146
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onContentChanged()V

    .line 147
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectViewMembers(Landroid/app/Activity;)V

    .line 148
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnContentChangedEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnContentChangedEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 149
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 62
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    .line 63
    .local v0, "injector":Lroboguice/inject/RoboInjector;
    const-class v1, Lroboguice/event/EventManager;

    invoke-interface {v0, v1}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/event/EventManager;

    iput-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    .line 64
    const-class v1, Lroboguice/inject/PreferenceListener;

    invoke-interface {v0, v1}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/inject/PreferenceListener;

    iput-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->preferenceListener:Lroboguice/inject/PreferenceListener;

    .line 65
    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectMembersWithoutViews(Ljava/lang/Object;)V

    .line 66
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 67
    iget-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v2, Lroboguice/activity/event/OnCreateEvent;

    invoke-direct {v2, p1}, Lroboguice/activity/event/OnCreateEvent;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 68
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 127
    :try_start_0
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnDestroyEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnDestroyEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 130
    :try_start_1
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onDestroy()V

    .line 135
    return-void

    .line 132
    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onDestroy()V

    throw v0

    .line 129
    :catchall_1
    move-exception v0

    .line 130
    :try_start_2
    invoke-static {p0}, Lroboguice/RoboGuice;->destroyInjector(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 132
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onDestroy()V

    throw v0

    :catchall_2
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onDestroy()V

    throw v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 111
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 112
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnNewIntentEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnNewIntentEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 113
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 105
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onPause()V

    .line 106
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnPauseEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnPauseEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 107
    return-void
.end method

.method protected onRestart()V
    .locals 2

    .prologue
    .line 87
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onRestart()V

    .line 88
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnRestartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnRestartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 89
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 99
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onResume()V

    .line 100
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnResumeEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnResumeEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 101
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 93
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onStart()V

    .line 94
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStartEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStartEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V

    .line 95
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 118
    :try_start_0
    iget-object v0, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->eventManager:Lroboguice/event/EventManager;

    new-instance v1, Lroboguice/activity/event/OnStopEvent;

    invoke-direct {v1}, Lroboguice/activity/event/OnStopEvent;-><init>()V

    invoke-virtual {v0, v1}, Lroboguice/event/EventManager;->fire(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onStop()V

    .line 122
    return-void

    .line 120
    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onStop()V

    throw v0
.end method

.method public setPreferenceScreen(Landroid/preference/PreferenceScreen;)V
    .locals 3
    .param p1, "preferenceScreen"    # Landroid/preference/PreferenceScreen;

    .prologue
    .line 72
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 74
    invoke-static {p0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v1

    const-class v2, Lroboguice/inject/ContextScope;

    invoke-interface {v1, v2}, Lroboguice/inject/RoboInjector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lroboguice/inject/ContextScope;

    .line 75
    .local v0, "scope":Lroboguice/inject/ContextScope;
    const-class v2, Lroboguice/inject/ContextScope;

    monitor-enter v2

    .line 76
    :try_start_0
    invoke-virtual {v0, p0}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    :try_start_1
    iget-object v1, p0, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockPreferenceActivity;->preferenceListener:Lroboguice/inject/PreferenceListener;

    invoke-virtual {v1}, Lroboguice/inject/PreferenceListener;->injectPreferenceViews()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    :try_start_2
    invoke-virtual {v0, p0}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    .line 82
    monitor-exit v2

    .line 83
    return-void

    .line 80
    :catchall_0
    move-exception v1

    invoke-virtual {v0, p0}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v1

    .line 82
    :catchall_1
    move-exception v1

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
