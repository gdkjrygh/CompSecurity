.class public interface abstract Lcom/googlecode/eyesfree/braille/display/IBrailleService;
.super Ljava/lang/Object;
.source "IBrailleService.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub;
    }
.end annotation


# virtual methods
.method public abstract displayDots([B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract registerCallback(Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract unregisterCallback(Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
