.class public Llombok/Lombok;
.super Ljava/lang/Object;
.source "Lombok.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static preventNullAnalysis(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    .prologue
    .line 72
    .local p0, "value":Ljava/lang/Object;, "TT;"
    return-object p0
.end method

.method public static sneakyThrow(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    .locals 2
    .param p0, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 51
    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "t"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_0
    invoke-static {p0}, Llombok/Lombok;->sneakyThrow0(Ljava/lang/Throwable;)V

    .line 53
    const/4 v0, 0x0

    return-object v0
.end method

.method private static sneakyThrow0(Ljava/lang/Throwable;)V
    .locals 0
    .param p0, "t"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Throwable;",
            ")V^TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    .line 58
    throw p0
.end method
