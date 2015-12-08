.class public Lcom/roidapp/photogrid/common/PhotoGridGlideModule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/e/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/i;)V
    .locals 2

    .prologue
    .line 22
    invoke-static {}, Lcom/bumptech/glide/g/b/l;->f()V

    .line 23
    new-instance v0, Lcom/bumptech/glide/load/b/b/h;

    new-instance v1, Lcom/roidapp/photogrid/common/ao;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/common/ao;-><init>(Lcom/roidapp/photogrid/common/PhotoGridGlideModule;)V

    invoke-direct {v0, v1}, Lcom/bumptech/glide/load/b/b/h;-><init>(Lcom/bumptech/glide/load/b/b/i;)V

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/i;->a(Lcom/bumptech/glide/load/b/b/b;)Lcom/bumptech/glide/i;

    .line 30
    return-void
.end method
