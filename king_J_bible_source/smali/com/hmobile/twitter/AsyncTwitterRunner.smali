.class public Lcom/hmobile/twitter/AsyncTwitterRunner;
.super Ljava/lang/Object;
.source "AsyncTwitterRunner.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;
    }
.end annotation


# instance fields
.field tw:Lcom/hmobile/twitter/Twitter;


# direct methods
.method public constructor <init>(Lcom/hmobile/twitter/Twitter;)V
    .locals 0
    .param p1, "tw"    # Lcom/hmobile/twitter/Twitter;

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/hmobile/twitter/AsyncTwitterRunner;->tw:Lcom/hmobile/twitter/Twitter;

    .line 50
    return-void
.end method


# virtual methods
.method public logout(Landroid/content/Context;Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "listener"    # Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;

    .prologue
    .line 71
    new-instance v0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/hmobile/twitter/AsyncTwitterRunner$1;-><init>(Lcom/hmobile/twitter/AsyncTwitterRunner;Landroid/content/Context;Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;)V

    .line 90
    invoke-virtual {v0}, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->start()V

    .line 91
    return-void
.end method
