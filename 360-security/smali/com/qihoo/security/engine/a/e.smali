.class public Lcom/qihoo/security/engine/a/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/a/e$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/engine/a/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/a/e;->e:Ljava/util/HashMap;

    iput v1, p0, Lcom/qihoo/security/engine/a/e;->b:I

    iput v1, p0, Lcom/qihoo/security/engine/a/e;->a:I

    iput v1, p0, Lcom/qihoo/security/engine/a/e;->f:I

    iput v1, p0, Lcom/qihoo/security/engine/a/e;->c:I

    iput v1, p0, Lcom/qihoo/security/engine/a/e;->d:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/qihoo/security/engine/a/e;->a:I

    return-void
.end method

.method public a()Z
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/a/e;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/engine/AdPluginInfo;)Z
    .locals 7

    iget v0, p0, Lcom/qihoo/security/engine/a/e;->b:I

    iput v0, p1, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllRisk:I

    iget v0, p0, Lcom/qihoo/security/engine/a/e;->a:I

    iput v0, p1, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllType:I

    iget v0, p0, Lcom/qihoo/security/engine/a/e;->f:I

    new-array v3, v0, [Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    iget-object v0, p0, Lcom/qihoo/security/engine/a/e;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/a/e;->f:I

    if-lt v2, v0, :cond_1

    :cond_0
    iput-object v3, p1, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    const/4 v0, 0x1

    return v0

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/engine/a/e$a;

    iget-object v1, v1, Lcom/qihoo/security/engine/a/e$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/a/e$a;

    iget-object v5, v0, Lcom/qihoo/security/engine/a/e$a;->b:Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v1, v2

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    invoke-direct {v2}, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;-><init>()V

    iput-object v0, v2, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->name:Ljava/lang/String;

    iput-object v5, v2, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->description:Ljava/lang/String;

    aput-object v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    new-instance v0, Lcom/qihoo/security/engine/a/e$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/a/e$a;-><init>(Lcom/qihoo/security/engine/a/e;)V

    iput-object p3, v0, Lcom/qihoo/security/engine/a/e$a;->b:Ljava/lang/String;

    iput-object p2, v0, Lcom/qihoo/security/engine/a/e$a;->a:Ljava/util/Set;

    iget-object v1, p0, Lcom/qihoo/security/engine/a/e;->e:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/a/e;->f:I

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/engine/a/e;->f:I

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/qihoo/security/engine/a/e;->b:I

    return-void
.end method
