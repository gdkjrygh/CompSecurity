.class public abstract Lcom/facebook/auth/c/c;
.super Lcom/facebook/c/a/c;
.source "AuthEventSubscriber.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/facebook/auth/c/a;",
        ">",
        "Lcom/facebook/c/a/c",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Lcom/facebook/c/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/facebook/auth/c/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public bridge synthetic a(Lcom/facebook/c/a/a;)V
    .locals 0

    .prologue
    .line 10
    check-cast p1, Lcom/facebook/auth/c/a;

    invoke-virtual {p0, p1}, Lcom/facebook/auth/c/c;->a(Lcom/facebook/auth/c/a;)V

    return-void
.end method
