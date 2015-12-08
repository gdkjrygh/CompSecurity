.class public interface abstract Lcom/hmobile/twitter/Twitter$DialogListener;
.super Ljava/lang/Object;
.source "Twitter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/twitter/Twitter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DialogListener"
.end annotation


# virtual methods
.method public abstract onCancel()V
.end method

.method public abstract onComplete(Landroid/os/Bundle;)V
.end method

.method public abstract onError(Lcom/hmobile/twitter/DialogError;)V
.end method

.method public abstract onTwitterError(Lcom/hmobile/twitter/TwitterError;)V
.end method
