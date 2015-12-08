.class public final Lcom/roidapp/cloudlib/facebook/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-string v0, "https://graph.facebook.com/v2.3/"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/w;->a:Ljava/lang/String;

    .line 20
    const-string v0, "/picture?type=album&access_token="

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/w;->b:Ljava/lang/String;

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/util/List",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 24
    .line 1058
    invoke-static {p0, p1}, Lcom/roidapp/cloudlib/facebook/w;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    .line 24
    check-cast v0, Lcom/roidapp/cloudlib/facebook/m;

    .line 25
    if-eqz v0, :cond_1

    .line 26
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/m;->a()Ljava/util/List;

    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    return-object v0

    .line 30
    :cond_0
    new-instance v0, Lorg/json/JSONException;

    const-string v1, "FbApiresponse.list is empty"

    invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_1
    new-instance v0, Lorg/json/JSONException;

    const-string v1, "Empty response"

    invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 41
    :try_start_0
    new-instance v0, Lcom/google/a/s;

    invoke-direct {v0}, Lcom/google/a/s;-><init>()V

    invoke-virtual {v0}, Lcom/google/a/s;->a()Lcom/google/a/k;

    move-result-object v0

    .line 42
    invoke-virtual {v0, p0, p1}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/a/ag; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 49
    :catch_0
    move-exception v0

    .line 50
    new-instance v1, Lorg/json/JSONException;

    invoke-virtual {v0}, Lcom/google/a/ag;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 51
    :catch_1
    move-exception v0

    .line 52
    new-instance v1, Lorg/json/JSONException;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/FbFriend;",
            ">;"
        }
    .end annotation

    .prologue
    .line 88
    new-instance v0, Lcom/roidapp/cloudlib/facebook/y;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/y;-><init>(Lcom/roidapp/cloudlib/facebook/w;)V

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/y;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 89
    invoke-static {p1, v0}, Lcom/roidapp/cloudlib/facebook/w;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 63
    new-instance v0, Lcom/roidapp/cloudlib/facebook/x;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/x;-><init>(Lcom/roidapp/cloudlib/facebook/w;)V

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/x;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 64
    invoke-static {p2, v0}, Lcom/roidapp/cloudlib/facebook/w;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object v1

    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 67
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/b;

    .line 69
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->b()Ljava/lang/String;

    move-result-object v4

    .line 70
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 71
    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 72
    const-string v5, "https://graph.facebook.com/v2.3/"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/picture?type=album&access_token="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/facebook/b;->a(Ljava/lang/String;)V

    .line 81
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "album["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "],count["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->a()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "], coverUrl="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 79
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 83
    :cond_1
    return-object v1
.end method

.method public final b(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/af;",
            ">;"
        }
    .end annotation

    .prologue
    .line 94
    new-instance v0, Lcom/roidapp/cloudlib/facebook/z;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/z;-><init>(Lcom/roidapp/cloudlib/facebook/w;)V

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/z;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 95
    invoke-static {p1, v0}, Lcom/roidapp/cloudlib/facebook/w;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
