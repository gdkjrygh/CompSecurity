.class public abstract Lcom/kik/cards/web/plugin/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field protected final c:Lorg/c/b;

.field private d:Z

.field private e:Ljava/util/List;

.field private f:Z

.field private final g:Lcom/kik/g/k;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-boolean v1, p0, Lcom/kik/cards/web/plugin/d;->d:Z

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/d;->e:Ljava/util/List;

    .line 21
    iput-boolean v1, p0, Lcom/kik/cards/web/plugin/d;->f:Z

    .line 24
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/d;->g:Lcom/kik/g/k;

    .line 33
    invoke-static {p1}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/plugin/d;->c:Lorg/c/b;

    .line 35
    const/4 v0, 0x1

    iput v0, p0, Lcom/kik/cards/web/plugin/d;->a:I

    .line 36
    iput-object p1, p0, Lcom/kik/cards/web/plugin/d;->b:Ljava/lang/String;

    .line 37
    return-void
.end method

.method protected static a(Lcom/kik/cards/web/plugin/a;ILorg/json/JSONObject;)V
    .locals 1

    .prologue
    .line 61
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, p1, p2}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V

    invoke-interface {p0, v0}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 62
    return-void
.end method


# virtual methods
.method protected final a(Lcom/kik/cards/web/plugin/f;)V
    .locals 1

    .prologue
    .line 107
    iget-boolean v0, p0, Lcom/kik/cards/web/plugin/d;->f:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/kik/cards/web/plugin/d;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/plugin/d;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_0
    :goto_0
    return-void

    .line 107
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/plugin/d;->g:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x0

    return v0
.end method

.method protected final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 112
    new-instance v0, Lcom/kik/cards/web/plugin/f;

    invoke-direct {v0, p1}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/plugin/d;->a(Lcom/kik/cards/web/plugin/f;)V

    .line 113
    return-void
.end method

.method protected final e()Z
    .locals 1

    .prologue
    .line 41
    iget-boolean v0, p0, Lcom/kik/cards/web/plugin/d;->f:Z

    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/kik/cards/web/plugin/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f_()V
    .locals 0

    .prologue
    .line 118
    return-void
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/kik/cards/web/plugin/d;->a:I

    return v0
.end method

.method public getInfo(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 80
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "name"

    iget-object v2, p0, Lcom/kik/cards/web/plugin/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "version"

    iget v2, p0, Lcom/kik/cards/web/plugin/d;->a:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    .line 81
    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    .line 83
    return-object v1
.end method

.method public final h()Ljava/util/List;
    .locals 2

    .prologue
    .line 71
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/web/plugin/d;->f:Z

    .line 72
    iget-object v0, p0, Lcom/kik/cards/web/plugin/d;->e:Ljava/util/List;

    .line 73
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/kik/cards/web/plugin/d;->e:Ljava/util/List;

    .line 74
    return-object v0
.end method

.method public final i()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/kik/cards/web/plugin/d;->g:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method
