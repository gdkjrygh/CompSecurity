.class public final Lcom/roidapp/imagelib/d/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/imagelib/d/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/imagelib/d/b;->a:Lcom/roidapp/imagelib/d/c;

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/roidapp/imagelib/d/b;->a:Lcom/roidapp/imagelib/d/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/d/c;->cancel(Z)Z

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/d/b;->a:Lcom/roidapp/imagelib/d/c;

    .line 27
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/graphics/Bitmap;ILcom/roidapp/imagelib/d/d;)V
    .locals 6

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/imagelib/d/b;->a:Lcom/roidapp/imagelib/d/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/d/b;->a:Lcom/roidapp/imagelib/d/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/d/c;->getStatus$2cfd0ac4()I

    move-result v0

    sget v1, Lcom/roidapp/baselib/c/l;->c:I

    if-eq v0, v1, :cond_0

    .line 35
    :goto_0
    return-void

    .line 33
    :cond_0
    new-instance v0, Lcom/roidapp/imagelib/d/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/d/c;-><init>(Lcom/roidapp/imagelib/d/b;Ljava/lang/String;Landroid/graphics/Bitmap;ILcom/roidapp/imagelib/d/d;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/d/b;->a:Lcom/roidapp/imagelib/d/c;

    .line 34
    iget-object v0, p0, Lcom/roidapp/imagelib/d/b;->a:Lcom/roidapp/imagelib/d/c;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/d/c;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_0
.end method
