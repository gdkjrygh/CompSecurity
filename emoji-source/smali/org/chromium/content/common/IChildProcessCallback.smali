.class public interface abstract Lorg/chromium/content/common/IChildProcessCallback;
.super Ljava/lang/Object;
.source "IChildProcessCallback.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/common/IChildProcessCallback$Stub;
    }
.end annotation


# virtual methods
.method public abstract establishSurfacePeer(ILandroid/view/Surface;II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract getSurfaceTextureSurface(II)Lorg/chromium/content/common/SurfaceWrapper;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract getViewSurface(I)Lorg/chromium/content/common/SurfaceWrapper;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
