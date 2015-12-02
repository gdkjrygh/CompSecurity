.class public Lcom/facebook/orca/presence/f;
.super Ljava/lang/Object;
.source "MobilePresenceIconExperiment.java"


# instance fields
.field public final a:Lcom/facebook/orca/presence/g;

.field public final b:Z

.field public final c:Z


# direct methods
.method private constructor <init>(Lcom/facebook/orca/presence/g;ZZ)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/facebook/orca/presence/f;->a:Lcom/facebook/orca/presence/g;

    .line 70
    iput-boolean p2, p0, Lcom/facebook/orca/presence/f;->b:Z

    .line 71
    iput-boolean p3, p0, Lcom/facebook/orca/presence/f;->c:Z

    .line 72
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/presence/g;ZZLcom/facebook/orca/presence/e;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/presence/f;-><init>(Lcom/facebook/orca/presence/g;ZZ)V

    return-void
.end method
