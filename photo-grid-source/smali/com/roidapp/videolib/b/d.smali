.class final Lcom/roidapp/videolib/b/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/gl/e;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/b/c;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/b/c;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/roidapp/videolib/b/d;->a:Lcom/roidapp/videolib/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    return v0
.end method

.method public final a()[Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 85
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 90
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()I
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lcom/roidapp/videolib/b/d;->a:Lcom/roidapp/videolib/b/c;

    iget-object v0, v0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/d;->a:Lcom/roidapp/videolib/b/c;

    invoke-static {v0}, Lcom/roidapp/videolib/b/c;->a(Lcom/roidapp/videolib/b/c;)I

    move-result v0

    if-gez v0, :cond_1

    .line 101
    :cond_0
    const/4 v0, -0x1

    .line 102
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/d;->a:Lcom/roidapp/videolib/b/c;

    iget-object v0, v0, Lcom/roidapp/videolib/b/c;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/d;->a:Lcom/roidapp/videolib/b/c;

    invoke-static {v1}, Lcom/roidapp/videolib/b/c;->a(Lcom/roidapp/videolib/b/c;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->b(I)I

    move-result v0

    goto :goto_0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 107
    const/4 v0, 0x0

    return v0
.end method
