.class final Lcom/google/a/b/z;
.super Lcom/google/a/b/ab;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/b/v",
        "<TV;>.com/google/a/b/ab<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/a/b/y;


# direct methods
.method constructor <init>(Lcom/google/a/b/y;)V
    .locals 2

    .prologue
    .line 402
    iput-object p1, p0, Lcom/google/a/b/z;->a:Lcom/google/a/b/y;

    iget-object v0, p1, Lcom/google/a/b/y;->a:Lcom/google/a/b/v;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/a/b/ab;-><init>(Lcom/google/a/b/v;B)V

    return-void
.end method


# virtual methods
.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 402
    .line 1404
    invoke-virtual {p0}, Lcom/google/a/b/z;->a()Lcom/google/a/b/aa;

    move-result-object v0

    iget-object v0, v0, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    .line 402
    return-object v0
.end method
