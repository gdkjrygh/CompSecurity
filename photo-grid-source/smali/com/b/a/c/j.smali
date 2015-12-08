.class final Lcom/b/a/c/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/c/h;


# direct methods
.method constructor <init>(Lcom/b/a/c/h;)V
    .locals 0

    .prologue
    .line 796
    iput-object p1, p0, Lcom/b/a/c/j;->a:Lcom/b/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 796
    .line 1801
    iget-object v0, p0, Lcom/b/a/c/j;->a:Lcom/b/a/c/h;

    invoke-static {v0}, Lcom/b/a/c/h;->a(Lcom/b/a/c/h;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 1802
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1803
    const/4 v0, 0x0

    .line 796
    return-object v0
.end method
