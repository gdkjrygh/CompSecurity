.class public abstract Lcom/google/common/a/l;
.super Lcom/google/common/a/mh;
.source "AbstractIterator.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/mh",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/common/a/n;

.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/google/common/a/mh;-><init>()V

    .line 63
    sget-object v0, Lcom/google/common/a/n;->NOT_READY:Lcom/google/common/a/n;

    iput-object v0, p0, Lcom/google/common/a/l;->a:Lcom/google/common/a/n;

    .line 66
    return-void
.end method

.method private c()Z
    .locals 2

    .prologue
    .line 140
    sget-object v0, Lcom/google/common/a/n;->FAILED:Lcom/google/common/a/n;

    iput-object v0, p0, Lcom/google/common/a/l;->a:Lcom/google/common/a/n;

    .line 141
    invoke-virtual {p0}, Lcom/google/common/a/l;->a()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/l;->b:Ljava/lang/Object;

    .line 142
    iget-object v0, p0, Lcom/google/common/a/l;->a:Lcom/google/common/a/n;

    sget-object v1, Lcom/google/common/a/n;->DONE:Lcom/google/common/a/n;

    if-eq v0, v1, :cond_0

    .line 143
    sget-object v0, Lcom/google/common/a/n;->READY:Lcom/google/common/a/n;

    iput-object v0, p0, Lcom/google/common/a/l;->a:Lcom/google/common/a/n;

    .line 144
    const/4 v0, 0x1

    .line 146
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected abstract a()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method protected final b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 122
    sget-object v0, Lcom/google/common/a/n;->DONE:Lcom/google/common/a/n;

    iput-object v0, p0, Lcom/google/common/a/l;->a:Lcom/google/common/a/n;

    .line 123
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hasNext()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 128
    iget-object v0, p0, Lcom/google/common/a/l;->a:Lcom/google/common/a/n;

    sget-object v3, Lcom/google/common/a/n;->FAILED:Lcom/google/common/a/n;

    if-eq v0, v3, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 129
    sget-object v0, Lcom/google/common/a/m;->a:[I

    iget-object v3, p0, Lcom/google/common/a/l;->a:Lcom/google/common/a/n;

    invoke-virtual {v3}, Lcom/google/common/a/n;->ordinal()I

    move-result v3

    aget v0, v0, v3

    packed-switch v0, :pswitch_data_0

    .line 136
    invoke-direct {p0}, Lcom/google/common/a/l;->c()Z

    move-result v2

    :goto_1
    :pswitch_0
    return v2

    :cond_0
    move v0, v2

    .line 128
    goto :goto_0

    :pswitch_1
    move v2, v1

    .line 133
    goto :goto_1

    .line 129
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 151
    invoke-virtual {p0}, Lcom/google/common/a/l;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 152
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 154
    :cond_0
    sget-object v0, Lcom/google/common/a/n;->NOT_READY:Lcom/google/common/a/n;

    iput-object v0, p0, Lcom/google/common/a/l;->a:Lcom/google/common/a/n;

    .line 155
    iget-object v0, p0, Lcom/google/common/a/l;->b:Ljava/lang/Object;

    return-object v0
.end method
