.class final La/a/a/a/a/c/r;
.super La/a/a/a/a/c/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/a/c/t",
        "<TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:La/a/a/a/a/c/q;


# direct methods
.method constructor <init>(La/a/a/a/a/c/q;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 114
    iput-object p1, p0, La/a/a/a/a/c/r;->a:La/a/a/a/a/c/q;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, La/a/a/a/a/c/t;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()La/a/a/a/a/c/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "La/a/a/a/a/c/l",
            "<",
            "La/a/a/a/a/c/y;",
            ">;:",
            "La/a/a/a/a/c/u;",
            ":",
            "La/a/a/a/a/c/y;",
            ">()TT;"
        }
    .end annotation

    .prologue
    .line 119
    iget-object v0, p0, La/a/a/a/a/c/r;->a:La/a/a/a/a/c/q;

    invoke-static {v0}, La/a/a/a/a/c/q;->a(La/a/a/a/a/c/q;)La/a/a/a/a/c/p;

    move-result-object v0

    return-object v0
.end method
