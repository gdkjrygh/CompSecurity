.class public interface abstract Lme/grantland/twitter/Twitter$DialogListener;
.super Ljava/lang/Object;
.source "Twitter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/grantland/twitter/Twitter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DialogListener"
.end annotation


# virtual methods
.method public abstract onCancel()V
.end method

.method public abstract onComplete(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onError(Lme/grantland/twitter/TwitterError;)V
.end method
