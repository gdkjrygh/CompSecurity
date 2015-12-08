.class public final Lcom/bumptech/glide/load/c/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/b",
        "<",
        "Lcom/bumptech/glide/load/c/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/bumptech/glide/load/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b",
            "<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b;Lcom/bumptech/glide/load/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b",
            "<",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/bumptech/glide/load/b",
            "<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/bumptech/glide/load/c/k;->a:Lcom/bumptech/glide/load/b;

    .line 23
    iput-object p2, p0, Lcom/bumptech/glide/load/c/k;->b:Lcom/bumptech/glide/load/b;

    .line 24
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lcom/bumptech/glide/load/c/k;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/bumptech/glide/load/c/k;->a:Lcom/bumptech/glide/load/b;

    invoke-interface {v1}, Lcom/bumptech/glide/load/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/load/c/k;->b:Lcom/bumptech/glide/load/b;

    invoke-interface {v1}, Lcom/bumptech/glide/load/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/c/k;->c:Ljava/lang/String;

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/k;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic a(Ljava/lang/Object;Ljava/io/OutputStream;)Z
    .locals 2

    .prologue
    .line 15
    check-cast p1, Lcom/bumptech/glide/load/c/j;

    .line 1028
    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/j;->a()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1029
    iget-object v0, p0, Lcom/bumptech/glide/load/c/k;->a:Lcom/bumptech/glide/load/b;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/j;->a()Ljava/io/InputStream;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/bumptech/glide/load/b;->a(Ljava/lang/Object;Ljava/io/OutputStream;)Z

    move-result v0

    :goto_0
    return v0

    .line 1031
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/k;->b:Lcom/bumptech/glide/load/b;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/j;->b()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/bumptech/glide/load/b;->a(Ljava/lang/Object;Ljava/io/OutputStream;)Z

    move-result v0

    goto :goto_0
.end method
