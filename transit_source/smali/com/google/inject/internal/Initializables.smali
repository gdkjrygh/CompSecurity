.class final Lcom/google/inject/internal/Initializables;
.super Ljava/lang/Object;
.source "Initializables.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static of(Ljava/lang/Object;)Lcom/google/inject/internal/Initializable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/google/inject/internal/Initializable",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 28
    .local p0, "instance":Ljava/lang/Object;, "TT;"
    new-instance v0, Lcom/google/inject/internal/Initializables$1;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/Initializables$1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
