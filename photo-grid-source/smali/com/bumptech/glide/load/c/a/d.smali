.class public final Lcom/bumptech/glide/load/c/a/d;
.super Lcom/bumptech/glide/load/c/u;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/load/c/u",
        "<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;",
        "Lcom/bumptech/glide/load/c/a/c",
        "<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/c/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/load/c/s",
            "<",
            "Landroid/net/Uri;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 41
    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/load/c/u;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/c/s;)V

    .line 42
    return-void
.end method
