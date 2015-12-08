.class public abstract Lcom/bumptech/glide/load/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/a/c",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/content/res/AssetManager;

.field private c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/bumptech/glide/load/a/a;->b:Landroid/content/res/AssetManager;

    .line 23
    iput-object p2, p0, Lcom/bumptech/glide/load/a/a;->a:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .prologue
    .line 28
    iget-object v0, p0, Lcom/bumptech/glide/load/a/a;->b:Landroid/content/res/AssetManager;

    iget-object v1, p0, Lcom/bumptech/glide/load/a/a;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/bumptech/glide/load/a/a;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/a/a;->c:Ljava/lang/Object;

    .line 29
    iget-object v0, p0, Lcom/bumptech/glide/load/a/a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method protected abstract a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/AssetManager;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 34
    iget-object v0, p0, Lcom/bumptech/glide/load/a/a;->c:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 45
    :goto_0
    return-void

    .line 38
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/a/a;->c:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/load/a/a;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    const-string v0, "AssetUriFetcher"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    goto :goto_0
.end method

.method protected abstract a(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/bumptech/glide/load/a/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 55
    return-void
.end method
