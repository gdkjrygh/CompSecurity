.class public Lcom/bumptech/glide/load/c/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/c/s",
        "<",
        "Ljava/net/URL;",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/c/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/c/s",
            "<",
            "Lcom/bumptech/glide/load/c/e;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/c/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c/s",
            "<",
            "Lcom/bumptech/glide/load/c/e;",
            "TT;>;)V"
        }
    .end annotation

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/bumptech/glide/load/c/y;->a:Lcom/bumptech/glide/load/c/s;

    .line 19
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;
    .locals 2

    .prologue
    .line 14
    check-cast p1, Ljava/net/URL;

    .line 1023
    iget-object v0, p0, Lcom/bumptech/glide/load/c/y;->a:Lcom/bumptech/glide/load/c/s;

    new-instance v1, Lcom/bumptech/glide/load/c/e;

    invoke-direct {v1, p1}, Lcom/bumptech/glide/load/c/e;-><init>(Ljava/net/URL;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/bumptech/glide/load/c/s;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;

    move-result-object v0

    .line 14
    return-object v0
.end method
