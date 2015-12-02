.class public abstract Lcom/facebook/common/hardware/aa;
.super Ljava/lang/Object;
.source "WakeLockHolder.java"


# instance fields
.field public final a:Lcom/facebook/common/hardware/o;


# direct methods
.method public constructor <init>(Lcom/facebook/common/hardware/n;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Lcom/facebook/common/hardware/n;->a(ILjava/lang/String;)Lcom/facebook/common/hardware/o;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/hardware/aa;->a:Lcom/facebook/common/hardware/o;

    .line 16
    return-void
.end method
