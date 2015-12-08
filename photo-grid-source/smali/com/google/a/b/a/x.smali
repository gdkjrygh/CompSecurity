.class final Lcom/google/a/b/a/x;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/a/am",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/a/k;

.field private final b:Lcom/google/a/am;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Lcom/google/a/k;Lcom/google/a/am;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/k;",
            "Lcom/google/a/am",
            "<TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/google/a/b/a/x;->a:Lcom/google/a/k;

    .line 34
    iput-object p2, p0, Lcom/google/a/b/a/x;->b:Lcom/google/a/am;

    .line 35
    iput-object p3, p0, Lcom/google/a/b/a/x;->c:Ljava/lang/reflect/Type;

    .line 36
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/d/a;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lcom/google/a/b/a/x;->b:Lcom/google/a/am;

    invoke-virtual {v0, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/d/f;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 52
    iget-object v1, p0, Lcom/google/a/b/a/x;->b:Lcom/google/a/am;

    .line 53
    iget-object v0, p0, Lcom/google/a/b/a/x;->c:Ljava/lang/reflect/Type;

    .line 1075
    if-eqz p2, :cond_1

    const-class v2, Ljava/lang/Object;

    if-eq v0, v2, :cond_0

    instance-of v2, v0, Ljava/lang/reflect/TypeVariable;

    if-nez v2, :cond_0

    instance-of v2, v0, Ljava/lang/Class;

    if-eqz v2, :cond_1

    .line 1077
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 54
    :cond_1
    iget-object v2, p0, Lcom/google/a/b/a/x;->c:Ljava/lang/reflect/Type;

    if-eq v0, v2, :cond_3

    .line 55
    iget-object v1, p0, Lcom/google/a/b/a/x;->a:Lcom/google/a/k;

    invoke-static {v0}, Lcom/google/a/c/a;->a(Ljava/lang/reflect/Type;)Lcom/google/a/c/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/a/k;->a(Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v0

    .line 56
    instance-of v1, v0, Lcom/google/a/b/a/r;

    if-eqz v1, :cond_2

    .line 59
    iget-object v1, p0, Lcom/google/a/b/a/x;->b:Lcom/google/a/am;

    instance-of v1, v1, Lcom/google/a/b/a/r;

    if-nez v1, :cond_2

    .line 62
    iget-object v0, p0, Lcom/google/a/b/a/x;->b:Lcom/google/a/am;

    .line 68
    :cond_2
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    .line 69
    return-void

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method
