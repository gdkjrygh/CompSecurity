.class public final Lcom/facebook/reflex/animation/SystemConfig;
.super Lcom/facebook/reflex/Countable;
.source "SystemConfig.java"


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Lcom/facebook/reflex/Countable;-><init>()V

    .line 11
    invoke-direct {p0}, Lcom/facebook/reflex/animation/SystemConfig;->initialize()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/animation/SystemConfig;->a(I)V

    .line 12
    return-void
.end method

.method private native initialize()I
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/reflex/animation/b;Lcom/facebook/reflex/animation/PropertyName;)V
    .locals 2

    .prologue
    .line 22
    new-instance v0, Lcom/facebook/reflex/animation/PropertyName;

    invoke-direct {v0, p1, p2}, Lcom/facebook/reflex/animation/PropertyName;-><init>(Ljava/lang/String;Lcom/facebook/reflex/animation/b;)V

    invoke-virtual {p0, p3}, Lcom/facebook/reflex/animation/SystemConfig;->variableNode(Lcom/facebook/reflex/animation/PropertyName;)Lcom/facebook/reflex/animation/Node;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/reflex/animation/SystemConfig;->bindNode(Lcom/facebook/reflex/animation/PropertyName;Lcom/facebook/reflex/animation/Node;)V

    .line 23
    return-void
.end method

.method public native add(Lcom/facebook/reflex/animation/Node;Lcom/facebook/reflex/animation/Node;)Lcom/facebook/reflex/animation/Node;
.end method

.method public native bindNode(Lcom/facebook/reflex/animation/PropertyName;Lcom/facebook/reflex/animation/Node;)V
.end method

.method public native bindNode(Ljava/lang/String;Lcom/facebook/reflex/animation/Node;)V
.end method

.method public native clampNode(Lcom/facebook/reflex/animation/Node;Lcom/facebook/reflex/animation/Node;Lcom/facebook/reflex/animation/Node;)Lcom/facebook/reflex/animation/Node;
.end method

.method public native constantNode(F)Lcom/facebook/reflex/animation/Node;
.end method

.method public native declareVariable(Lcom/facebook/reflex/animation/PropertyName;F)V
.end method

.method public native declareVariable(Ljava/lang/String;F)V
.end method

.method public native declareWidget(Ljava/lang/String;)V
.end method

.method public native divide(Lcom/facebook/reflex/animation/Node;Lcom/facebook/reflex/animation/Node;)Lcom/facebook/reflex/animation/Node;
.end method

.method public native multiply(Lcom/facebook/reflex/animation/Node;Lcom/facebook/reflex/animation/Node;)Lcom/facebook/reflex/animation/Node;
.end method

.method public native subtract(Lcom/facebook/reflex/animation/Node;Lcom/facebook/reflex/animation/Node;)Lcom/facebook/reflex/animation/Node;
.end method

.method public native transition(Lcom/facebook/reflex/animation/Transition;Lcom/facebook/reflex/animation/Node;)Lcom/facebook/reflex/animation/Node;
.end method

.method public native variableNode(Lcom/facebook/reflex/animation/PropertyName;)Lcom/facebook/reflex/animation/Node;
.end method

.method public native variableNode(Ljava/lang/String;)Lcom/facebook/reflex/animation/Node;
.end method
