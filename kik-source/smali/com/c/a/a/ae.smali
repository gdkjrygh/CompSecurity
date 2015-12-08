.class final Lcom/c/a/a/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field final synthetic a:Ljava/lang/CharSequence;

.field final synthetic b:Lcom/c/a/a/ab;


# direct methods
.method constructor <init>(Lcom/c/a/a/ab;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 388
    iput-object p1, p0, Lcom/c/a/a/ae;->b:Lcom/c/a/a/ab;

    iput-object p2, p0, Lcom/c/a/a/ae;->a:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .prologue
    .line 390
    iget-object v0, p0, Lcom/c/a/a/ae;->b:Lcom/c/a/a/ab;

    iget-object v1, p0, Lcom/c/a/a/ae;->a:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lcom/c/a/a/ab;->a(Lcom/c/a/a/ab;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 393
    const-string v0, ", "

    invoke-static {v0}, Lcom/c/a/a/r;->a(Ljava/lang/String;)Lcom/c/a/a/r;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/c/a/a/r;->a(Ljava/lang/StringBuilder;Ljava/util/Iterator;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
