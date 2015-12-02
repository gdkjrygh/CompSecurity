.class public final Lcom/google/inject/b/a;
.super Ljava/lang/Object;
.source "Providers.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 42
    new-instance v0, Lcom/google/inject/b/b;

    invoke-direct {v0, p0}, Lcom/google/inject/b/b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
