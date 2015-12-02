.class public Lcom/facebook/inject/at;
.super Ljava/lang/Object;
.source "RequiredBindingThrowingProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/inject/at;->a:Lcom/google/inject/a;

    .line 22
    return-void
.end method

.method public static a(Ljava/lang/Class;)Lcom/facebook/inject/at;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/inject/at",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 29
    new-instance v0, Lcom/facebook/inject/at;

    invoke-static {p0}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/inject/at;-><init>(Lcom/google/inject/a;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/at;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/facebook/inject/at",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 35
    new-instance v0, Lcom/facebook/inject/at;

    invoke-static {p0, p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/inject/at;-><init>(Lcom/google/inject/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 40
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Application did not provide a binding for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/inject/at;->a:Lcom/google/inject/a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
