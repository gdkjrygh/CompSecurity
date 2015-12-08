.class public final Lcom/bumptech/glide/b;
.super Lcom/bumptech/glide/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ModelType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bumptech/glide/a",
        "<TModelType;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final g:Lcom/bumptech/glide/load/c/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/c/s",
            "<TModelType;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/bumptech/glide/load/c/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/c/s",
            "<TModelType;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/bumptech/glide/h;

.field private final j:Lcom/bumptech/glide/u;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/e;Lcom/bumptech/glide/load/c/s;Lcom/bumptech/glide/load/c/s;Lcom/bumptech/glide/u;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/e",
            "<TModelType;***>;",
            "Lcom/bumptech/glide/load/c/s",
            "<TModelType;",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/bumptech/glide/load/c/s",
            "<TModelType;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;",
            "Lcom/bumptech/glide/u;",
            ")V"
        }
    .end annotation

    .prologue
    .line 52
    iget-object v0, p1, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/h;

    const-class v1, Landroid/graphics/Bitmap;

    .line 1033
    if-nez p2, :cond_0

    if-nez p3, :cond_0

    .line 1034
    const/4 v0, 0x0

    .line 52
    :goto_0
    const-class v1, Landroid/graphics/Bitmap;

    invoke-direct {p0, v0, v1, p1}, Lcom/bumptech/glide/a;-><init>(Lcom/bumptech/glide/f/f;Ljava/lang/Class;Lcom/bumptech/glide/e;)V

    .line 54
    iput-object p2, p0, Lcom/bumptech/glide/b;->g:Lcom/bumptech/glide/load/c/s;

    .line 55
    iput-object p3, p0, Lcom/bumptech/glide/b;->h:Lcom/bumptech/glide/load/c/s;

    .line 56
    iget-object v0, p1, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/h;

    iput-object v0, p0, Lcom/bumptech/glide/b;->i:Lcom/bumptech/glide/h;

    .line 57
    iput-object p4, p0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/u;

    .line 58
    return-void

    .line 1038
    :cond_0
    const-class v2, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v2, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/resource/e/c;

    move-result-object v1

    .line 1040
    const-class v2, Lcom/bumptech/glide/load/c/j;

    const-class v3, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v2, v3}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/f/b;

    move-result-object v2

    .line 1042
    new-instance v3, Lcom/bumptech/glide/load/c/h;

    invoke-direct {v3, p2, p3}, Lcom/bumptech/glide/load/c/h;-><init>(Lcom/bumptech/glide/load/c/s;Lcom/bumptech/glide/load/c/s;)V

    .line 1045
    new-instance v0, Lcom/bumptech/glide/f/e;

    invoke-direct {v0, v3, v1, v2}, Lcom/bumptech/glide/f/e;-><init>(Lcom/bumptech/glide/load/c/s;Lcom/bumptech/glide/load/resource/e/c;Lcom/bumptech/glide/f/b;)V

    goto :goto_0
.end method
