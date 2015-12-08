.class Lcom/google/inject/internal/util/$Finalizer$ShutDown;
.super Ljava/lang/Exception;
.source "Finalizer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$Finalizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ShutDown"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 179
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/internal/util/$Finalizer$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/internal/util/$Finalizer$1;

    .prologue
    .line 179
    invoke-direct {p0}, Lcom/google/inject/internal/util/$Finalizer$ShutDown;-><init>()V

    return-void
.end method
