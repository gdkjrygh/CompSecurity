.class public abstract Lcom/facebook/reflex/d;
.super Lcom/facebook/reflex/Countable;
.source "Content.java"


# instance fields
.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5
    invoke-direct {p0}, Lcom/facebook/reflex/Countable;-><init>()V

    .line 6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/d;->b:Z

    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected abstract c()V
.end method

.method public d()V
    .locals 1

    .prologue
    .line 13
    invoke-virtual {p0}, Lcom/facebook/reflex/d;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 14
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/d;->b:Z

    .line 15
    invoke-virtual {p0}, Lcom/facebook/reflex/d;->f()V

    .line 17
    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 20
    iget-boolean v0, p0, Lcom/facebook/reflex/d;->b:Z

    return v0
.end method

.method public f()V
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0}, Lcom/facebook/reflex/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {p0}, Lcom/facebook/reflex/d;->c()V

    .line 30
    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    .prologue
    .line 38
    invoke-virtual {p0}, Lcom/facebook/reflex/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/d;->b:Z

    .line 40
    invoke-virtual {p0}, Lcom/facebook/reflex/d;->a()V

    .line 42
    :cond_0
    return-void
.end method
