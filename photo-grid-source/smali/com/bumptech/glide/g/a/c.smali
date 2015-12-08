.class public final Lcom/bumptech/glide/g/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/g/a/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/graphics/drawable/Drawable;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/g/a/d",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/g/a/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/a/d",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/g/a/d;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g/a/d",
            "<TT;>;I)V"
        }
    .end annotation

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/bumptech/glide/g/a/c;->a:Lcom/bumptech/glide/g/a/d;

    .line 26
    iput p2, p0, Lcom/bumptech/glide/g/a/c;->b:I

    .line 27
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/e;)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 14
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 1044
    invoke-interface {p2}, Lcom/bumptech/glide/g/a/e;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1045
    if-eqz v2, :cond_0

    .line 1046
    new-instance v3, Landroid/graphics/drawable/TransitionDrawable;

    const/4 v4, 0x2

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v4, v1

    aput-object p1, v4, v0

    invoke-direct {v3, v4}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 1047
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 1048
    iget v1, p0, Lcom/bumptech/glide/g/a/c;->b:I

    invoke-virtual {v3, v1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 1049
    invoke-interface {p2, v3}, Lcom/bumptech/glide/g/a/e;->a(Landroid/graphics/drawable/Drawable;)V

    .line 1050
    :goto_0
    return v0

    .line 1052
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/g/a/c;->a:Lcom/bumptech/glide/g/a/d;

    invoke-interface {v0, p1, p2}, Lcom/bumptech/glide/g/a/d;->a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/e;)Z

    move v0, v1

    .line 14
    goto :goto_0
.end method
