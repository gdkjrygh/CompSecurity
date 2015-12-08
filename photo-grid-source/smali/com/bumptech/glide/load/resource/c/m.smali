.class final Lcom/bumptech/glide/load/resource/c/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/a/c",
        "<",
        "Lcom/bumptech/glide/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/b/a;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/b/a;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/m;->a:Lcom/bumptech/glide/b/a;

    .line 20
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 15
    .line 1024
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/m;->a:Lcom/bumptech/glide/b/a;

    .line 15
    return-object v0
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 30
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/m;->a:Lcom/bumptech/glide/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/b/a;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 40
    return-void
.end method
