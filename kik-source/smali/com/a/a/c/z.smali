.class final Lcom/a/a/c/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Lcom/a/a/c/x;


# direct methods
.method constructor <init>(Lcom/a/a/c/x;)V
    .locals 0

    .prologue
    .line 456
    iput-object p1, p0, Lcom/a/a/c/z;->a:Lcom/a/a/c/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 456
    iget-object v0, p0, Lcom/a/a/c/z;->a:Lcom/a/a/c/x;

    invoke-virtual {v0}, Lcom/a/a/c/x;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/z;->a:Lcom/a/a/c/x;

    invoke-static {v0}, Lcom/a/a/c/x;->c(Lcom/a/a/c/x;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
