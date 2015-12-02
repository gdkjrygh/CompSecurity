.class public final Lcom/facebook/reflex/animation/Node;
.super Ljava/lang/Object;
.source "Node.java"


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# instance fields
.field private final a:Lcom/facebook/reflex/animation/SystemConfig;

.field private final mNativePtr:I
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILcom/facebook/reflex/animation/SystemConfig;)V
    .locals 0
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Lcom/facebook/reflex/animation/Node;->mNativePtr:I

    .line 13
    iput-object p2, p0, Lcom/facebook/reflex/animation/Node;->a:Lcom/facebook/reflex/animation/SystemConfig;

    .line 14
    return-void
.end method
