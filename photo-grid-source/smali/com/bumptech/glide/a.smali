.class public Lcom/bumptech/glide/a;
.super Lcom/bumptech/glide/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ModelType:",
        "Ljava/lang/Object;",
        "TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bumptech/glide/e",
        "<TModelType;",
        "Lcom/bumptech/glide/load/c/j;",
        "Landroid/graphics/Bitmap;",
        "TTranscodeType;>;"
    }
.end annotation


# instance fields
.field private final g:Lcom/bumptech/glide/load/b/a/e;

.field private h:Lcom/bumptech/glide/load/resource/bitmap/f;

.field private i:Lcom/bumptech/glide/load/a;

.field private j:Lcom/bumptech/glide/load/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/e",
            "<",
            "Ljava/io/InputStream;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/bumptech/glide/load/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/e",
            "<",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/bumptech/glide/f/f;Ljava/lang/Class;Lcom/bumptech/glide/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/f/f",
            "<TModelType;",
            "Lcom/bumptech/glide/load/c/j;",
            "Landroid/graphics/Bitmap;",
            "TTranscodeType;>;",
            "Ljava/lang/Class",
            "<TTranscodeType;>;",
            "Lcom/bumptech/glide/e",
            "<TModelType;***>;)V"
        }
    .end annotation

    .prologue
    .line 57
    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/e;-><init>(Lcom/bumptech/glide/f/f;Ljava/lang/Class;Lcom/bumptech/glide/e;)V

    .line 50
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->a:Lcom/bumptech/glide/load/resource/bitmap/f;

    iput-object v0, p0, Lcom/bumptech/glide/a;->h:Lcom/bumptech/glide/load/resource/bitmap/f;

    .line 58
    iget-object v0, p3, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/h;

    invoke-virtual {v0}, Lcom/bumptech/glide/h;->a()Lcom/bumptech/glide/load/b/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/a;->g:Lcom/bumptech/glide/load/b/a/e;

    .line 59
    iget-object v0, p3, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/h;

    invoke-virtual {v0}, Lcom/bumptech/glide/h;->g()Lcom/bumptech/glide/load/a;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/a;->i:Lcom/bumptech/glide/load/a;

    .line 61
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/w;

    iget-object v1, p0, Lcom/bumptech/glide/a;->g:Lcom/bumptech/glide/load/b/a/e;

    iget-object v2, p0, Lcom/bumptech/glide/a;->i:Lcom/bumptech/glide/load/a;

    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/w;-><init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V

    iput-object v0, p0, Lcom/bumptech/glide/a;->j:Lcom/bumptech/glide/load/e;

    .line 62
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/k;

    iget-object v1, p0, Lcom/bumptech/glide/a;->g:Lcom/bumptech/glide/load/b/a/e;

    iget-object v2, p0, Lcom/bumptech/glide/a;->i:Lcom/bumptech/glide/load/a;

    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/k;-><init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V

    iput-object v0, p0, Lcom/bumptech/glide/a;->k:Lcom/bumptech/glide/load/e;

    .line 63
    return-void
.end method


# virtual methods
.method public final a()Lcom/bumptech/glide/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/a",
            "<TModelType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 321
    invoke-super {p0}, Lcom/bumptech/glide/e;->e()Lcom/bumptech/glide/e;

    .line 322
    return-object p0
.end method

.method public final a(Lcom/bumptech/glide/a;)Lcom/bumptech/glide/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/a",
            "<*TTranscodeType;>;)",
            "Lcom/bumptech/glide/a",
            "<TModelType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 151
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/e;)Lcom/bumptech/glide/e;

    .line 152
    return-object p0
.end method

.method public final a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/e;",
            ")",
            "Lcom/bumptech/glide/a",
            "<TModelType;TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 426
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;

    .line 427
    return-object p0
.end method

.method public final bridge synthetic a(I)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 9359
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(I)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a(II)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 6435
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/e;->a(II)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 8368
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a(Lcom/bumptech/glide/e;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 12445
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/e;)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a(Lcom/bumptech/glide/load/b;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 11454
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/b;)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 5469
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a(Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 12169
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 4475
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Object;)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a(Z)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 7417
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Z)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final bridge synthetic a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 11302
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method public final a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Lcom/bumptech/glide/g/b/k",
            "<TTranscodeType;>;"
        }
    .end annotation

    .prologue
    .line 498
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 11426
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method

.method final b()V
    .locals 3

    .prologue
    .line 503
    .line 1291
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/bumptech/glide/load/resource/bitmap/d;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/bumptech/glide/a;->c:Lcom/bumptech/glide/h;

    invoke-virtual {v2}, Lcom/bumptech/glide/h;->d()Lcom/bumptech/glide/load/resource/bitmap/l;

    move-result-object v2

    aput-object v2, v0, v1

    .line 2264
    invoke-super {p0, v0}, Lcom/bumptech/glide/e;->a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;

    .line 504
    return-void
.end method

.method final c()V
    .locals 3

    .prologue
    .line 508
    .line 2278
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/bumptech/glide/load/resource/bitmap/d;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/bumptech/glide/a;->c:Lcom/bumptech/glide/h;

    invoke-virtual {v2}, Lcom/bumptech/glide/h;->c()Lcom/bumptech/glide/load/resource/bitmap/e;

    move-result-object v2

    aput-object v2, v0, v1

    .line 3264
    invoke-super {p0, v0}, Lcom/bumptech/glide/e;->a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;

    .line 509
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    .line 12481
    invoke-super {p0}, Lcom/bumptech/glide/e;->d()Lcom/bumptech/glide/e;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a;

    .line 46
    return-object v0
.end method

.method public final bridge synthetic d()Lcom/bumptech/glide/e;
    .locals 1

    .prologue
    .line 46
    .line 3481
    invoke-super {p0}, Lcom/bumptech/glide/e;->d()Lcom/bumptech/glide/e;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a;

    .line 46
    return-object v0
.end method

.method public final bridge synthetic e()Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 46
    .line 10321
    invoke-super {p0}, Lcom/bumptech/glide/e;->e()Lcom/bumptech/glide/e;

    .line 46
    return-object p0
.end method
