.class public final Lcom/bumptech/glide/load/c/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/c/t",
        "<",
        "Lcom/bumptech/glide/load/c/e;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/c/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/c/p",
            "<",
            "Lcom/bumptech/glide/load/c/e;",
            "Lcom/bumptech/glide/load/c/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lcom/bumptech/glide/load/c/p;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/bumptech/glide/load/c/p;-><init>(I)V

    iput-object v0, p0, Lcom/bumptech/glide/load/c/b/b;->a:Lcom/bumptech/glide/load/c/p;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/bumptech/glide/load/c/c;)Lcom/bumptech/glide/load/c/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/load/c/c;",
            ")",
            "Lcom/bumptech/glide/load/c/s",
            "<",
            "Lcom/bumptech/glide/load/c/e;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .prologue
    .line 31
    new-instance v0, Lcom/bumptech/glide/load/c/b/a;

    iget-object v1, p0, Lcom/bumptech/glide/load/c/b/b;->a:Lcom/bumptech/glide/load/c/p;

    invoke-direct {v0, v1}, Lcom/bumptech/glide/load/c/b/a;-><init>(Lcom/bumptech/glide/load/c/p;)V

    return-object v0
.end method
