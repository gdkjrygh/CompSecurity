.class public interface abstract Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;
.super Ljava/lang/Object;
.source "IBrailleServiceCallback.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback$Stub;
    }
.end annotation


# virtual methods
.method public abstract onDisplayConnected(Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract onDisplayDisconnected()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract onInput(Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
