.class public final Lcom/facebook/reflex/animation/Transition;
.super Lcom/facebook/reflex/Countable;
.source "Transition.java"


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/facebook/reflex/Countable;-><init>()V

    .line 12
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/animation/Transition;->a(I)V

    .line 13
    invoke-direct {p0}, Lcom/facebook/reflex/animation/Transition;->releaseExtraRef()V

    .line 14
    return-void
.end method

.method public static a(D)Lcom/facebook/reflex/animation/Transition;
    .locals 2

    .prologue
    .line 30
    double-to-long v0, p0

    invoke-static {v0, v1}, Lcom/facebook/reflex/animation/Transition;->a(J)Lcom/facebook/reflex/animation/Transition;

    move-result-object v0

    return-object v0
.end method

.method public static a(J)Lcom/facebook/reflex/animation/Transition;
    .locals 2

    .prologue
    .line 33
    new-instance v0, Lcom/facebook/reflex/animation/Transition;

    invoke-static {p0, p1}, Lcom/facebook/reflex/animation/Transition;->makeLinear(J)I

    move-result v1

    invoke-direct {v0, v1}, Lcom/facebook/reflex/animation/Transition;-><init>(I)V

    return-object v0
.end method

.method private static native makeCurve(JFFFF)I
.end method

.method private static native makeLinear(J)I
.end method

.method private static native makeSnap()I
.end method

.method private static native makeSpring(FF)I
.end method

.method private native releaseExtraRef()V
.end method
