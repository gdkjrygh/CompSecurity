.class public final Lcom/roidapp/cloudlib/google/j;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/util/List",
        "<",
        "Lcom/roidapp/cloudlib/google/i;",
        ">;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/google/SearchPhotoFragment;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:I


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/google/j;->c:I

    .line 16
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/j;->a:Ljava/lang/ref/WeakReference;

    .line 17
    iput-object p2, p0, Lcom/roidapp/cloudlib/google/j;->b:Ljava/lang/String;

    .line 18
    return-void
.end method

.method private varargs a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/google/i;",
            ">;"
        }
    .end annotation

    .prologue
    .line 32
    new-instance v0, Lcom/roidapp/cloudlib/google/q;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/google/q;-><init>()V

    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/j;->b:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/cloudlib/google/j;->c:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/google/q;->b(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    .line 36
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/j;->b:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/cloudlib/google/j;->c:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/google/q;->a(Ljava/lang/String;I)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 47
    :cond_1
    :goto_0
    return-object v0

    .line 40
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    .line 42
    if-eqz v0, :cond_2

    .line 43
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Ljava/lang/Exception;)V

    .line 45
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 47
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 21
    iput p1, p0, Lcom/roidapp/cloudlib/google/j;->c:I

    .line 22
    return-void
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/roidapp/cloudlib/google/j;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected final onCancelled()V
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    .line 61
    if-eqz v0, :cond_0

    .line 62
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Ljava/util/List;)V

    .line 64
    :cond_0
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 9
    check-cast p1, Ljava/util/List;

    .line 1052
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    .line 1053
    if-eqz v0, :cond_0

    .line 1054
    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Ljava/util/List;)V

    .line 9
    :cond_0
    return-void
.end method

.method protected final onPreExecute()V
    .locals 0

    .prologue
    .line 27
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 28
    return-void
.end method
