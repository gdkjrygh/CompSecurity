.class public interface abstract Lorg/apache/cordova/api/CordovaInterface;
.super Ljava/lang/Object;
.source "CordovaInterface.java"


# virtual methods
.method public abstract cancelLoadUrl()V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getActivity()Landroid/app/Activity;
.end method

.method public abstract getContext()Landroid/content/Context;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getThreadPool()Ljava/util/concurrent/ExecutorService;
.end method

.method public abstract onMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract setActivityResultCallback(Lorg/apache/cordova/api/CordovaPlugin;)V
.end method

.method public abstract startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V
.end method
