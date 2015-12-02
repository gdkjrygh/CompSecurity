.class Lcom/facebook/orca/notify/bh;
.super Ljava/lang/Object;
.source "OrcaNotificationManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method private constructor <init>(ZZ)V
    .locals 0

    .prologue
    .line 595
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 596
    iput-boolean p1, p0, Lcom/facebook/orca/notify/bh;->a:Z

    .line 597
    iput-boolean p2, p0, Lcom/facebook/orca/notify/bh;->b:Z

    .line 598
    return-void
.end method

.method synthetic constructor <init>(ZZLcom/facebook/orca/notify/aw;)V
    .locals 0

    .prologue
    .line 591
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/notify/bh;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 601
    iget-boolean v0, p0, Lcom/facebook/orca/notify/bh;->a:Z

    return v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 605
    iget-boolean v0, p0, Lcom/facebook/orca/notify/bh;->b:Z

    return v0
.end method
