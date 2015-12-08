.class public interface abstract Lorg/chromium/content/browser/PositionObserver;
.super Ljava/lang/Object;
.source "PositionObserver.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/PositionObserver$Listener;
    }
.end annotation


# virtual methods
.method public abstract addListener(Lorg/chromium/content/browser/PositionObserver$Listener;)V
.end method

.method public abstract clearListener()V
.end method

.method public abstract getPositionX()I
.end method

.method public abstract getPositionY()I
.end method

.method public abstract removeListener(Lorg/chromium/content/browser/PositionObserver$Listener;)V
.end method
