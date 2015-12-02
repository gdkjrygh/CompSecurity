.class public final Lcom/facebook/reflex/animation/Change;
.super Ljava/lang/Object;
.source "Change.java"


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/facebook/reflex/animation/PropertyName;",
            "Lcom/facebook/reflex/animation/a;",
            ">;"
        }
    .end annotation
.end field

.field private mNativePtr:I
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-direct {p0}, Lcom/facebook/reflex/animation/Change;->initialize()I

    move-result v0

    iput v0, p0, Lcom/facebook/reflex/animation/Change;->mNativePtr:I

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/animation/Change;->a:Ljava/util/HashMap;

    .line 20
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/animation/Change;Lcom/facebook/reflex/animation/PropertyName;F)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1, p2}, Lcom/facebook/reflex/animation/Change;->changeTo(Lcom/facebook/reflex/animation/PropertyName;F)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/animation/Change;Lcom/facebook/reflex/animation/PropertyName;Lcom/facebook/reflex/animation/Transition;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1, p2}, Lcom/facebook/reflex/animation/Change;->changeWith(Lcom/facebook/reflex/animation/PropertyName;Lcom/facebook/reflex/animation/Transition;)V

    return-void
.end method

.method private native changeTo(Lcom/facebook/reflex/animation/PropertyName;F)V
.end method

.method private native changeWith(Lcom/facebook/reflex/animation/PropertyName;Lcom/facebook/reflex/animation/Transition;)V
.end method

.method private native destroy()V
.end method

.method private native initialize()I
.end method

.method private native setPausedState(Lcom/facebook/reflex/animation/PropertyName;Z)V
.end method


# virtual methods
.method public a(Lcom/facebook/reflex/animation/PropertyName;)Lcom/facebook/reflex/animation/a;
    .locals 2

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/reflex/animation/Change;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/animation/a;

    .line 44
    if-eqz v0, :cond_0

    .line 49
    :goto_0
    return-object v0

    .line 47
    :cond_0
    new-instance v0, Lcom/facebook/reflex/animation/a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/reflex/animation/a;-><init>(Lcom/facebook/reflex/animation/Change;Lcom/facebook/reflex/animation/PropertyName;)V

    .line 48
    iget-object v1, p0, Lcom/facebook/reflex/animation/Change;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/facebook/reflex/animation/Change;->mNativePtr:I

    if-eqz v0, :cond_0

    .line 24
    invoke-direct {p0}, Lcom/facebook/reflex/animation/Change;->destroy()V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/reflex/animation/Change;->mNativePtr:I

    .line 27
    :cond_0
    return-void
.end method

.method protected finalize()V
    .locals 0

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/facebook/reflex/animation/Change;->a()V

    .line 31
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 32
    return-void
.end method
