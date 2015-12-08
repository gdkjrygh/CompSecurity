.class final Lcom/google/a/b/af;
.super Lcom/google/a/b/ae;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/reflect/Method;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/google/a/b/af;->a:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lcom/google/a/b/af;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/a/b/ae;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 48
    iget-object v0, p0, Lcom/google/a/b/af;->a:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lcom/google/a/b/af;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
