.class final Lcom/b/a/c/i;
.super La/a/a/a/a/c/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/a/c/s",
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
    .line 658
    iput-object p1, p0, Lcom/b/a/c/i;->a:Lcom/b/a/c/h;

    invoke-direct {p0}, La/a/a/a/a/c/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 666
    sget v0, La/a/a/a/a/c/o;->d:I

    return v0
.end method

.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 658
    .line 1661
    iget-object v0, p0, Lcom/b/a/c/i;->a:Lcom/b/a/c/h;

    invoke-virtual {v0}, Lcom/b/a/c/h;->e()Ljava/lang/Void;

    move-result-object v0

    .line 658
    return-object v0
.end method
