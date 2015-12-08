.class Lcom/google/inject/internal/Exceptions;
.super Ljava/lang/Object;
.source "Exceptions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/Exceptions$UnhandledCheckedUserException;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    return-void
.end method

.method public static throwCleanly(Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/RuntimeException;
    .locals 2
    .param p0, "exception"    # Ljava/lang/reflect/InvocationTargetException;

    .prologue
    .line 35
    move-object v0, p0

    .line 36
    .local v0, "cause":Ljava/lang/Throwable;
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 39
    :cond_0
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_1

    .line 40
    check-cast v0, Ljava/lang/RuntimeException;

    .end local v0    # "cause":Ljava/lang/Throwable;
    throw v0

    .line 41
    .restart local v0    # "cause":Ljava/lang/Throwable;
    :cond_1
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_2

    .line 42
    check-cast v0, Ljava/lang/Error;

    .end local v0    # "cause":Ljava/lang/Throwable;
    throw v0

    .line 44
    .restart local v0    # "cause":Ljava/lang/Throwable;
    :cond_2
    new-instance v1, Lcom/google/inject/internal/Exceptions$UnhandledCheckedUserException;

    invoke-direct {v1, v0}, Lcom/google/inject/internal/Exceptions$UnhandledCheckedUserException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
