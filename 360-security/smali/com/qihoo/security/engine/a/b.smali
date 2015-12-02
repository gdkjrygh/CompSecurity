.class public Lcom/qihoo/security/engine/a/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lcom/qihoo/security/engine/a/a;

.field private final b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private final d:I

.field private final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/qihoo/security/engine/a/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lcom/qihoo/security/engine/a/a;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qihoo/security/engine/a/b;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/qihoo/security/engine/a/b;->c:Ljava/lang/String;

    iput p3, p0, Lcom/qihoo/security/engine/a/b;->d:I

    iput-object p4, p0, Lcom/qihoo/security/engine/a/b;->a:Lcom/qihoo/security/engine/a/a;

    iput-object p5, p0, Lcom/qihoo/security/engine/a/b;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Lcom/qihoo/security/engine/a/b;->f:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/qihoo/security/engine/a/b;
    .locals 8

    const/4 v7, 0x0

    if-nez p0, :cond_0

    move-object v0, v7

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    const-string/jumbo v0, "name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v0, "des"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v0, "ris"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string/jumbo v0, "fbs"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/engine/a/a;->a(Lorg/json/JSONArray;)Lcom/qihoo/security/engine/a/a;

    move-result-object v4

    new-instance v0, Lcom/qihoo/security/engine/a/b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/engine/a/b;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/qihoo/security/engine/a/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v7

    goto :goto_0
.end method

.method public static a(II)Z
    .locals 1

    and-int v0, p1, p0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/a/b;->d:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/a/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/a/b;->c:Ljava/lang/String;

    return-object v0
.end method
