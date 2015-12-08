.class final Lcom/bumptech/glide/load/resource/c/h;
.super Lcom/bumptech/glide/g/b/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/g/b/g",
        "<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:I

.field private final c:J

.field private d:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/os/Handler;IJ)V
    .locals 1

    .prologue
    .line 152
    invoke-direct {p0}, Lcom/bumptech/glide/g/b/g;-><init>()V

    .line 153
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/h;->a:Landroid/os/Handler;

    .line 154
    iput p2, p0, Lcom/bumptech/glide/load/resource/c/h;->b:I

    .line 155
    iput-wide p3, p0, Lcom/bumptech/glide/load/resource/c/h;->c:J

    .line 156
    return-void
.end method

.method static synthetic a(Lcom/bumptech/glide/load/resource/c/h;)I
    .locals 1

    .prologue
    .line 146
    iget v0, p0, Lcom/bumptech/glide/load/resource/c/h;->b:I

    return v0
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/h;->d:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final synthetic a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V
    .locals 4

    .prologue
    .line 146
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1164
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/h;->d:Landroid/graphics/Bitmap;

    .line 1165
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/h;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 1166
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/h;->a:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/bumptech/glide/load/resource/c/h;->c:J

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 146
    return-void
.end method
