.class public interface abstract Lorg/apache/cordova/CordovaInterface;
.super Ljava/lang/Object;
.source "CordovaInterface.java"


# virtual methods
.method public abstract getActivity()Landroid/app/Activity;
.end method

.method public abstract getThreadPool()Ljava/util/concurrent/ExecutorService;
.end method

.method public abstract onMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract setActivityResultCallback(Lorg/apache/cordova/CordovaPlugin;)V
.end method

.method public abstract startActivityForResult(Lorg/apache/cordova/CordovaPlugin;Landroid/content/Intent;I)V
.end method
