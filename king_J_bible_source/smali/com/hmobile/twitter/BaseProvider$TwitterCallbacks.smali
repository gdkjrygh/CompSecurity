.class public interface abstract Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;
.super Ljava/lang/Object;
.source "BaseProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/twitter/BaseProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TwitterCallbacks"
.end annotation


# virtual methods
.method public abstract TwitterLogedIn()V
.end method

.method public abstract TwitterLoggedInFailed(Ljava/lang/String;)V
.end method

.method public abstract TwitterLoggedOut()V
.end method

.method public abstract TwitterLoggedOutFailed(Ljava/lang/String;)V
.end method

.method public abstract TwitterPostFailed(Ljava/lang/String;)V
.end method

.method public abstract TwitterPostedSuccessfully()V
.end method
