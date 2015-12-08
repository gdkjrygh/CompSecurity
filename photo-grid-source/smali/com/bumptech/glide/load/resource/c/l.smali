.class final Lcom/bumptech/glide/load/resource/c/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/c/s",
        "<",
        "Lcom/bumptech/glide/b/a;",
        "Lcom/bumptech/glide/b/a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;
    .locals 1

    .prologue
    .line 8
    check-cast p1, Lcom/bumptech/glide/b/a;

    .line 1012
    new-instance v0, Lcom/bumptech/glide/load/resource/c/m;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/load/resource/c/m;-><init>(Lcom/bumptech/glide/b/a;)V

    .line 8
    return-object v0
.end method
