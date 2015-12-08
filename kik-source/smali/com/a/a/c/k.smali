.class final Lcom/a/a/c/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Lcom/a/a/c/g;


# direct methods
.method constructor <init>(Lcom/a/a/c/g;)V
    .locals 0

    .prologue
    .line 828
    iput-object p1, p0, Lcom/a/a/c/k;->a:Lcom/a/a/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 828
    iget-object v0, p0, Lcom/a/a/c/k;->a:Lcom/a/a/c/g;

    invoke-static {v0}, Lcom/a/a/c/g;->a(Lcom/a/a/c/g;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
