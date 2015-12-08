.class public final Lcom/bumptech/glide/load/b/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/bumptech/glide/load/b/l;

.field private final b:Lcom/bumptech/glide/g/f;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/g/f;Lcom/bumptech/glide/load/b/l;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/bumptech/glide/load/b/i;->b:Lcom/bumptech/glide/g/f;

    .line 53
    iput-object p2, p0, Lcom/bumptech/glide/load/b/i;->a:Lcom/bumptech/glide/load/b/l;

    .line 54
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/bumptech/glide/load/b/i;->a:Lcom/bumptech/glide/load/b/l;

    iget-object v1, p0, Lcom/bumptech/glide/load/b/i;->b:Lcom/bumptech/glide/g/f;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/b/l;->b(Lcom/bumptech/glide/g/f;)V

    .line 58
    return-void
.end method
