.class public final Lcom/facebook/reflex/animation/System;
.super Lcom/facebook/reflex/Countable;
.source "System.java"


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/animation/SystemConfig;)V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/reflex/Countable;-><init>()V

    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/reflex/animation/System;->initialize(Lcom/facebook/reflex/animation/SystemConfig;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/animation/System;->a(I)V

    .line 15
    return-void
.end method

.method private native initialize(Lcom/facebook/reflex/animation/SystemConfig;)I
.end method


# virtual methods
.method public native applyChange(Lcom/facebook/reflex/animation/Change;)V
.end method

.method public native bindWidget(Ljava/lang/String;Lcom/facebook/reflex/Widget;)V
.end method
