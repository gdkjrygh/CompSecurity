.class public Lcom/facebook/reflex/Countable;
.super Ljava/lang/Object;
.source "Countable.java"


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private mInstance:I
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7
    const-class v0, Lcom/facebook/reflex/Countable;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/facebook/reflex/Countable;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private native addref()V
.end method

.method private native release()V
.end method


# virtual methods
.method protected a(I)V
    .locals 1

    .prologue
    .line 14
    sget-boolean v0, Lcom/facebook/reflex/Countable;->a:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/reflex/Countable;->mInstance:I

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 15
    :cond_0
    iput p1, p0, Lcom/facebook/reflex/Countable;->mInstance:I

    .line 16
    invoke-direct {p0}, Lcom/facebook/reflex/Countable;->addref()V

    .line 17
    return-void
.end method

.method protected finalize()V
    .locals 0

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/facebook/reflex/Countable;->h()V

    .line 31
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 32
    return-void
.end method

.method public h()V
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/facebook/reflex/Countable;->mInstance:I

    if-eqz v0, :cond_0

    .line 24
    invoke-direct {p0}, Lcom/facebook/reflex/Countable;->release()V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/reflex/Countable;->mInstance:I

    .line 27
    :cond_0
    return-void
.end method
