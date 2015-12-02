.class public Lcom/facebook/common/time/b;
.super Ljava/lang/Object;
.source "MonotonicClock.java"

# interfaces
.implements Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method
