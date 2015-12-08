.class public final Lcom/roidapp/cloudlib/sns/basepost/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/ExecutorService;

.field private static c:Lcom/roidapp/cloudlib/sns/basepost/d;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/d;->b:Ljava/util/List;

    .line 44
    return-void
.end method

.method public static a()Lcom/roidapp/cloudlib/sns/basepost/d;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->c:Lcom/roidapp/cloudlib/sns/basepost/d;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/d;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/basepost/d;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->c:Lcom/roidapp/cloudlib/sns/basepost/d;

    .line 51
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->c:Lcom/roidapp/cloudlib/sns/basepost/d;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/d;)Ljava/util/List;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/d;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/d;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/d;->b:Ljava/util/List;

    return-object p1
.end method

.method public static a(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 149
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 164
    :goto_0
    return-object v0

    .line 152
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 154
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 155
    const-string v3, "data"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 156
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v2, v4, :cond_1

    .line 157
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 159
    goto :goto_0

    .line 161
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    .prologue
    .line 170
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/d;->b:Ljava/util/List;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x32

    if-le v0, v1, :cond_0

    .line 172
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/d;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 175
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 57
    sget-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->a:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 58
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->a:Ljava/util/concurrent/ExecutorService;

    .line 60
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/roidapp/cloudlib/sns/basepost/e;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/basepost/e;-><init>(Lcom/roidapp/cloudlib/sns/basepost/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 101
    return-void
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 104
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/d;->b:Ljava/util/List;

    return-object v0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 109
    sget-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->a:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 110
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->a:Ljava/util/concurrent/ExecutorService;

    .line 112
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/basepost/d;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/roidapp/cloudlib/sns/basepost/f;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/basepost/f;-><init>(Lcom/roidapp/cloudlib/sns/basepost/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 146
    return-void
.end method
