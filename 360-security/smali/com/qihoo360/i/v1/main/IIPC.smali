.class public interface abstract Lcom/qihoo360/i/v1/main/IIPC;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/i/IModule;


# virtual methods
.method public abstract getCurrentProcessName()Ljava/lang/String;
.end method

.method public abstract getRunningProcessPID(Landroid/content/Context;Ljava/lang/String;)I
.end method

.method public abstract getUIProcessPID(Landroid/content/Context;)I
.end method

.method public abstract isContactProcess()Z
.end method

.method public abstract isPersistentProcess()Z
.end method

.method public abstract isPersistentUIProcess()Z
.end method

.method public abstract isRunningProcess(Ljava/lang/String;)Z
.end method

.method public abstract isUIProcess()Z
.end method

.method public abstract sendIntent2PersistentProcess(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public abstract sendIntent2UIProcess(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public abstract sendLocalBroadcast2MainUI(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public abstract sendLocalBroadcast2MobileSafes(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public abstract sendLocalBroadcast2Persist(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public abstract sendLocalBroadcast2PersistAndMainUI(Landroid/content/Context;Landroid/content/Intent;)V
.end method
