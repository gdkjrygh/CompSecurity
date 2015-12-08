.class public Lcom/cleanmaster/ui/app/market/data/filter/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/data/filter/b;


# static fields
.field public static a:Lcom/cleanmaster/data/filter/d;

.field public static b:Lcom/cleanmaster/data/filter/a;


# instance fields
.field protected c:I

.field protected d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    new-instance v0, Lcom/cleanmaster/data/filter/d;

    invoke-direct {v0}, Lcom/cleanmaster/data/filter/d;-><init>()V

    sput-object v0, Lcom/cleanmaster/ui/app/market/data/filter/b;->a:Lcom/cleanmaster/data/filter/d;

    .line 22
    new-instance v0, Lcom/cleanmaster/data/filter/a;

    invoke-direct {v0}, Lcom/cleanmaster/data/filter/a;-><init>()V

    sput-object v0, Lcom/cleanmaster/ui/app/market/data/filter/b;->b:Lcom/cleanmaster/data/filter/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/b;->c:I

    .line 41
    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/b;->d:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/cleanmaster/data/filter/b;
    .locals 3

    .prologue
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 28
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/data/filter/c;->b(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/c;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Ljava/util/ArrayList;Lcom/cleanmaster/ui/app/market/data/filter/b;)V

    .line 29
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/data/filter/d;->b(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/d;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Ljava/util/ArrayList;Lcom/cleanmaster/ui/app/market/data/filter/b;)V

    .line 30
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/data/filter/f;->b(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/f;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Ljava/util/ArrayList;Lcom/cleanmaster/ui/app/market/data/filter/b;)V

    .line 31
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/data/filter/h;->b(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/h;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Ljava/util/ArrayList;Lcom/cleanmaster/ui/app/market/data/filter/b;)V

    .line 32
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/data/filter/g;->b(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/g;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Ljava/util/ArrayList;Lcom/cleanmaster/ui/app/market/data/filter/b;)V

    .line 33
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/data/filter/e;->c(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/e;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Ljava/util/ArrayList;Lcom/cleanmaster/ui/app/market/data/filter/b;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/cleanmaster/ui/app/market/data/filter/b;->a:Lcom/cleanmaster/data/filter/d;

    :goto_1
    return-object v0

    .line 35
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v1}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Ljava/util/ArrayList;)Lcom/cleanmaster/data/filter/b;

    move-result-object v0

    goto :goto_1
.end method

.method private static a(Ljava/util/ArrayList;)Lcom/cleanmaster/data/filter/b;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 104
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 105
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/data/filter/b;

    .line 112
    :goto_0
    return-object v0

    .line 107
    :cond_0
    new-instance v2, Lcom/cleanmaster/data/filter/c;

    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/data/filter/b;

    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/cleanmaster/data/filter/b;

    invoke-direct {v2, v0, v1}, Lcom/cleanmaster/data/filter/c;-><init>(Lcom/cleanmaster/data/filter/b;Lcom/cleanmaster/data/filter/b;)V

    .line 108
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v2

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/data/filter/b;

    .line 109
    new-instance v2, Lcom/cleanmaster/data/filter/c;

    invoke-direct {v2, v1, v0}, Lcom/cleanmaster/data/filter/c;-><init>(Lcom/cleanmaster/data/filter/b;Lcom/cleanmaster/data/filter/b;)V

    move-object v1, v2

    .line 110
    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method private static a(Ljava/util/ArrayList;Lcom/cleanmaster/ui/app/market/data/filter/b;)V
    .locals 0

    .prologue
    .line 116
    if-eqz p1, :cond_0

    .line 117
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/b;
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 58
    if-eqz p1, :cond_0

    .line 59
    const-string v0, "lt"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/b;->c:I

    .line 60
    const-string v0, "gt"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/b;->d:I

    .line 62
    :cond_0
    return-object p0
.end method

.method protected a(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 68
    iget v1, p0, Lcom/cleanmaster/ui/app/market/data/filter/b;->c:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 80
    :cond_0
    :goto_0
    return v0

    .line 74
    :cond_1
    iget v1, p0, Lcom/cleanmaster/ui/app/market/data/filter/b;->c:I

    if-le p1, v1, :cond_0

    const/4 v0, 0x0

    .line 80
    goto :goto_0
.end method

.method public final a(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/data/filter/b;->b(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z

    move-result v0

    .line 50
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 17
    check-cast p1, Lcom/cleanmaster/ui/app/market/data/filter/a;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/util/Set;Ljava/util/Collection;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 139
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v1

    .line 147
    :goto_0
    return v0

    .line 142
    :cond_1
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 143
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 147
    goto :goto_0
.end method

.method protected b(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 86
    iget v1, p0, Lcom/cleanmaster/ui/app/market/data/filter/b;->d:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 98
    :cond_0
    :goto_0
    return v0

    .line 92
    :cond_1
    iget v1, p0, Lcom/cleanmaster/ui/app/market/data/filter/b;->d:I

    if-ge p1, v1, :cond_0

    const/4 v0, 0x0

    .line 98
    goto :goto_0
.end method

.method protected b(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 135
    const-string v0, "%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
