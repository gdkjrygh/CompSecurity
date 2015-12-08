.class public abstract Lcom/hmobile/twitter/BaseProvider;
.super Ljava/lang/Object;
.source "BaseProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract isLoggedIn()Z
.end method

.method public abstract login()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/twitter/SocialException;
        }
    .end annotation
.end method

.method public abstract logout()V
.end method

.method public abstract post(Ljava/lang/String;)V
.end method

.method public abstract postImage(Ljava/lang/String;Ljava/lang/String;)V
.end method
