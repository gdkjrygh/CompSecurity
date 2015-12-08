.class public Lcom/google/inject/internal/util/$Join$JoinException;
.super Ljava/lang/RuntimeException;
.source "Join.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$Join;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "JoinException"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method private constructor <init>(Ljava/io/IOException;)V
    .locals 0
    .param p1, "cause"    # Ljava/io/IOException;

    .prologue
    .line 310
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 311
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/IOException;Lcom/google/inject/internal/util/$Join$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/IOException;
    .param p2, "x1"    # Lcom/google/inject/internal/util/$Join$1;

    .prologue
    .line 308
    invoke-direct {p0, p1}, Lcom/google/inject/internal/util/$Join$JoinException;-><init>(Ljava/io/IOException;)V

    return-void
.end method
