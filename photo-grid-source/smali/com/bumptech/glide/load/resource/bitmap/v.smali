.class public final Lcom/bumptech/glide/load/resource/bitmap/v;
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
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/bitmap/w;

.field private final b:Lcom/bumptech/glide/load/resource/bitmap/b;

.field private final c:Lcom/bumptech/glide/load/c/v;

.field private final d:Lcom/bumptech/glide/load/resource/b/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/resource/b/c",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lcom/bumptech/glide/load/c/v;

    invoke-direct {v0}, Lcom/bumptech/glide/load/c/v;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->c:Lcom/bumptech/glide/load/c/v;

    .line 29
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/w;

    invoke-direct {v0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/w;-><init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->a:Lcom/bumptech/glide/load/resource/bitmap/w;

    .line 30
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/b;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/b;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->b:Lcom/bumptech/glide/load/resource/bitmap/b;

    .line 31
    new-instance v0, Lcom/bumptech/glide/load/resource/b/c;

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->a:Lcom/bumptech/glide/load/resource/bitmap/w;

    invoke-direct {v0, v1}, Lcom/bumptech/glide/load/resource/b/c;-><init>(Lcom/bumptech/glide/load/e;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->d:Lcom/bumptech/glide/load/resource/b/c;

    .line 32
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
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->d:Lcom/bumptech/glide/load/resource/b/c;

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
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->a:Lcom/bumptech/glide/load/resource/bitmap/w;

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
    .line 46
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->c:Lcom/bumptech/glide/load/c/v;

    return-object v0
.end method

.method public final d()Lcom/bumptech/glide/load/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/f",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 51
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/v;->b:Lcom/bumptech/glide/load/resource/bitmap/b;

    return-object v0
.end method
