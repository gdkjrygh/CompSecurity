.class public final Lcom/bumptech/glide/load/c/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/i/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/i/e",
            "<",
            "Lcom/bumptech/glide/load/c/r",
            "<TA;>;TB;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    const/16 v0, 0xfa

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/c/p;-><init>(I)V

    .line 23
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lcom/bumptech/glide/load/c/q;

    invoke-direct {v0, p0, p1}, Lcom/bumptech/glide/load/c/q;-><init>(Lcom/bumptech/glide/load/c/p;I)V

    iput-object v0, p0, Lcom/bumptech/glide/load/c/p;->a:Lcom/bumptech/glide/i/e;

    .line 32
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)TB;"
        }
    .end annotation

    .prologue
    .line 44
    invoke-static {p1}, Lcom/bumptech/glide/load/c/r;->a(Ljava/lang/Object;)Lcom/bumptech/glide/load/c/r;

    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/bumptech/glide/load/c/p;->a:Lcom/bumptech/glide/i/e;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/i/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 46
    invoke-virtual {v0}, Lcom/bumptech/glide/load/c/r;->a()V

    .line 47
    return-object v1
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;TB;)V"
        }
    .end annotation

    .prologue
    .line 59
    invoke-static {p1}, Lcom/bumptech/glide/load/c/r;->a(Ljava/lang/Object;)Lcom/bumptech/glide/load/c/r;

    move-result-object v0

    .line 60
    iget-object v1, p0, Lcom/bumptech/glide/load/c/p;->a:Lcom/bumptech/glide/i/e;

    invoke-virtual {v1, v0, p2}, Lcom/bumptech/glide/i/e;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    return-void
.end method
