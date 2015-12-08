.class public interface abstract Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;
.super Ljava/lang/Object;
.source "ImeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/input/ImeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ImeAdapterDelegate"
.end annotation


# virtual methods
.method public abstract getAttachedView()Landroid/view/View;
.end method

.method public abstract getNewShowKeyboardReceiver()Landroid/os/ResultReceiver;
.end method

.method public abstract onDismissInput()V
.end method

.method public abstract onImeEvent()V
.end method
