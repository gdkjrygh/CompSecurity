.class final Lcom/bumptech/glide/load/b/b/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/b/r;


# instance fields
.field private final a:Landroid/util/DisplayMetrics;


# direct methods
.method public constructor <init>(Landroid/util/DisplayMetrics;)V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Lcom/bumptech/glide/load/b/b/q;->a:Landroid/util/DisplayMetrics;

    .line 105
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/q;->a:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/q;->a:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    return v0
.end method
