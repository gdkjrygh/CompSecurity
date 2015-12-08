.class public interface abstract Lorg/chromium/net/IRemoteAndroidKeyStoreCallbacks;
.super Ljava/lang/Object;
.source "IRemoteAndroidKeyStoreCallbacks.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/net/IRemoteAndroidKeyStoreCallbacks$Stub;
    }
.end annotation


# virtual methods
.method public abstract onDisabled()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract onInitComplete()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
