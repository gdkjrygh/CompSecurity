.class final Lcom/bumptech/glide/load/c/i;
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
        "Lcom/bumptech/glide/load/c/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/a/c",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/bumptech/glide/load/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/a/c",
            "<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/a/c;Lcom/bumptech/glide/load/a/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/a/c",
            "<",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/bumptech/glide/load/a/c",
            "<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    .line 60
    iput-object p2, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    .line 61
    return-void
.end method

.method private b(I)Lcom/bumptech/glide/load/c/j;
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x2

    .line 67
    .line 68
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    if-eqz v0, :cond_1

    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0, p1}, Lcom/bumptech/glide/load/a/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    .line 81
    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    if-eqz v0, :cond_0

    .line 83
    :try_start_1
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0, p1}, Lcom/bumptech/glide/load/a/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/ParcelFileDescriptor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v2, v0

    .line 93
    :cond_0
    new-instance v0, Lcom/bumptech/glide/load/c/j;

    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/c/j;-><init>(Ljava/io/InputStream;Landroid/os/ParcelFileDescriptor;)V

    return-object v0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    const-string v1, "IVML"

    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 75
    iget-object v1, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    if-nez v1, :cond_1

    .line 76
    throw v0

    .line 84
    :catch_1
    move-exception v0

    .line 85
    const-string v3, "IVML"

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 88
    if-nez v1, :cond_0

    .line 89
    throw v0

    :cond_1
    move-object v1, v2

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/c/i;->b(I)Lcom/bumptech/glide/load/c/j;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/a/c;->a()V

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    if-eqz v0, :cond_1

    .line 103
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/a/c;->a()V

    .line 105
    :cond_1
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/a/c;->b()Ljava/lang/String;

    move-result-object v0

    .line 113
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/a/c;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->a:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/a/c;->c()V

    .line 122
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    if-eqz v0, :cond_1

    .line 123
    iget-object v0, p0, Lcom/bumptech/glide/load/c/i;->b:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/a/c;->c()V

    .line 125
    :cond_1
    return-void
.end method
