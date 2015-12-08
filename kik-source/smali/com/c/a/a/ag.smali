.class public final Lcom/c/a/a/ag;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Throwable;Ljava/lang/Class;)V
    .locals 1
    .param p0    # Ljava/lang/Throwable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 108
    invoke-static {p0, p1}, Lcom/c/a/a/ag;->b(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 109
    const-class v0, Ljava/lang/Error;

    invoke-static {p0, v0}, Lcom/c/a/a/ag;->b(Ljava/lang/Throwable;Ljava/lang/Class;)V

    const-class v0, Ljava/lang/RuntimeException;

    invoke-static {p0, v0}, Lcom/c/a/a/ag;->b(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 110
    return-void
.end method

.method private static b(Ljava/lang/Throwable;Ljava/lang/Class;)V
    .locals 1
    .param p0    # Ljava/lang/Throwable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 63
    if-eqz p0, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 66
    :cond_0
    return-void
.end method
