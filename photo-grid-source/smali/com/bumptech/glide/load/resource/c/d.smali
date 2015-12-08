.class public final Lcom/bumptech/glide/load/resource/c/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/f/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/f/b",
        "<",
        "Ljava/io/InputStream;",
        "Lcom/bumptech/glide/load/resource/c/b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/c/o;

.field private final b:Lcom/bumptech/glide/load/resource/c/r;

.field private final c:Lcom/bumptech/glide/load/c/v;

.field private final d:Lcom/bumptech/glide/load/resource/b/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/resource/b/c",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/b/a/e;)V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lcom/bumptech/glide/load/resource/c/o;

    invoke-direct {v0, p1, p2}, Lcom/bumptech/glide/load/resource/c/o;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/b/a/e;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/d;->a:Lcom/bumptech/glide/load/resource/c/o;

    .line 28
    new-instance v0, Lcom/bumptech/glide/load/resource/b/c;

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/d;->a:Lcom/bumptech/glide/load/resource/c/o;

    invoke-direct {v0, v1}, Lcom/bumptech/glide/load/resource/b/c;-><init>(Lcom/bumptech/glide/load/e;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/d;->d:Lcom/bumptech/glide/load/resource/b/c;

    .line 29
    new-instance v0, Lcom/bumptech/glide/load/resource/c/r;

    invoke-direct {v0, p2}, Lcom/bumptech/glide/load/resource/c/r;-><init>(Lcom/bumptech/glide/load/b/a/e;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/d;->b:Lcom/bumptech/glide/load/resource/c/r;

    .line 30
    new-instance v0, Lcom/bumptech/glide/load/c/v;

    invoke-direct {v0}, Lcom/bumptech/glide/load/c/v;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/d;->c:Lcom/bumptech/glide/load/c/v;

    .line 31
    return-void
.end method


# virtual methods
.method public final a()Lcom/bumptech/glide/load/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/e",
            "<",
            "Ljava/io/File;",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/d;->d:Lcom/bumptech/glide/load/resource/b/c;

    return-object v0
.end method

.method public final b()Lcom/bumptech/glide/load/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/e",
            "<",
            "Ljava/io/InputStream;",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/d;->a:Lcom/bumptech/glide/load/resource/c/o;

    return-object v0
.end method

.method public final c()Lcom/bumptech/glide/load/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/b",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/d;->c:Lcom/bumptech/glide/load/c/v;

    return-object v0
.end method

.method public final d()Lcom/bumptech/glide/load/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/f",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 50
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/d;->b:Lcom/bumptech/glide/load/resource/c/r;

    return-object v0
.end method
