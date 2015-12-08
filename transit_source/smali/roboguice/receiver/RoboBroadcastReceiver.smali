.class public abstract Lroboguice/receiver/RoboBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "RoboBroadcastReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method protected handleReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 40
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-static {v1}, Lroboguice/RoboGuice;->getBaseApplicationInjector(Landroid/app/Application;)Lcom/google/inject/Injector;

    move-result-object v0

    .line 26
    .local v0, "injector":Lcom/google/inject/Injector;
    invoke-interface {v0, p0}, Lcom/google/inject/Injector;->injectMembers(Ljava/lang/Object;)V

    .line 27
    invoke-virtual {p0, p1, p2}, Lroboguice/receiver/RoboBroadcastReceiver;->handleReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 28
    return-void
.end method
