.class public Lcom/qihoo/security/clearengine/b/b;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Lcom/qihoo/security/clearengine/a/a;

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/clearengine/a/a;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/b;->b:Ljava/util/Set;

    .line 27
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/b;->a:Lcom/qihoo/security/clearengine/a/a;

    .line 28
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    .line 40
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 42
    const/4 v0, 0x4

    new-array v2, v0, [I

    fill-array-data v2, :array_0

    .line 49
    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 67
    return-void

    .line 49
    :cond_0
    aget v0, v2, v1

    .line 51
    :try_start_0
    iget-object v4, p0, Lcom/qihoo/security/clearengine/b/b;->a:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v4, v0}, Lcom/qihoo/security/clearengine/a/a;->a(I)Ljava/util/List;

    move-result-object v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 49
    :cond_2
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 53
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 54
    if-eqz v0, :cond_1

    iget-object v5, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 55
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 56
    iget-object v5, p0, Lcom/qihoo/security/clearengine/b/b;->b:Ljava/util/Set;

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 63
    :catch_0
    move-exception v0

    .line 64
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_2

    .line 42
    :array_0
    .array-data 4
        0x4
        0x3
        0x3e9
        0x2
    .end array-data
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 74
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    :goto_0
    return-void

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/b;->b:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 101
    iget v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    .line 102
    invoke-static {v1}, Lcom/qihoo/security/clearengine/d/a;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 121
    :cond_0
    :goto_0
    return v0

    .line 109
    :cond_1
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 111
    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/b;->b:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 115
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 86
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    :goto_0
    return-void

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/b;->b:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method
