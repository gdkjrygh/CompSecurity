.class final Lorg/xwalk/core/internal/XWalkContent$DestroyRunnable;
.super Ljava/lang/Object;
.source "XWalkContent.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "DestroyRunnable"
.end annotation


# instance fields
.field private final mNativeContent:J


# direct methods
.method private constructor <init>(J)V
    .locals 1
    .param p1, "nativeXWalkContent"    # J

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-wide p1, p0, Lorg/xwalk/core/internal/XWalkContent$DestroyRunnable;->mNativeContent:J

    .line 85
    return-void
.end method

.method synthetic constructor <init>(JLorg/xwalk/core/internal/XWalkContent$1;)V
    .locals 1
    .param p1, "x0"    # J
    .param p3, "x1"    # Lorg/xwalk/core/internal/XWalkContent$1;

    .prologue
    .line 81
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkContent$DestroyRunnable;-><init>(J)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 89
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkContent$DestroyRunnable;->mNativeContent:J

    # invokes: Lorg/xwalk/core/internal/XWalkContent;->nativeDestroy(J)V
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/XWalkContent;->access$000(J)V

    .line 90
    return-void
.end method
