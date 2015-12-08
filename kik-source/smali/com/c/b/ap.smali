.class public final Lcom/c/b/ap;
.super Lcom/c/b/aq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/ap$1;,
        Lcom/c/b/ap$a;,
        Lcom/c/b/ap$b;
    }
.end annotation


# static fields
.field private static final e:Lcom/c/b/ap;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 324
    new-instance v0, Lcom/c/b/ap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/c/b/ap;-><init>(B)V

    sput-object v0, Lcom/c/b/ap;->e:Lcom/c/b/ap;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 287
    invoke-direct {p0}, Lcom/c/b/aq;-><init>()V

    .line 288
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/ap;->a:Ljava/util/Map;

    .line 289
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/ap;->b:Ljava/util/Map;

    .line 290
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/ap;->c:Ljava/util/Map;

    .line 292
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/ap;->d:Ljava/util/Map;

    .line 294
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    .line 314
    invoke-static {}, Lcom/c/b/aq;->d()Lcom/c/b/aq;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/c/b/aq;-><init>(Lcom/c/b/aq;)V

    .line 315
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ap;->a:Ljava/util/Map;

    .line 317
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ap;->b:Ljava/util/Map;

    .line 319
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ap;->c:Ljava/util/Map;

    .line 321
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ap;->d:Ljava/util/Map;

    .line 323
    return-void
.end method

.method public static a()Lcom/c/b/ap;
    .locals 1

    .prologue
    .line 99
    new-instance v0, Lcom/c/b/ap;

    invoke-direct {v0}, Lcom/c/b/ap;-><init>()V

    return-object v0
.end method

.method public static b()Lcom/c/b/ap;
    .locals 1

    .prologue
    .line 104
    sget-object v0, Lcom/c/b/ap;->e:Lcom/c/b/ap;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/c/b/ak$a;I)Lcom/c/b/ap$b;
    .locals 2

    .prologue
    .line 184
    iget-object v0, p0, Lcom/c/b/ap;->c:Ljava/util/Map;

    new-instance v1, Lcom/c/b/ap$a;

    invoke-direct {v1, p1, p2}, Lcom/c/b/ap$a;-><init>(Lcom/c/b/ak$a;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ap$b;

    return-object v0
.end method

.method public final a(Lcom/c/b/an;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 238
    invoke-virtual {p1}, Lcom/c/b/an;->b()I

    move-result v0

    sget v1, Lcom/c/b/an$a;->a:I

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/c/b/an;->b()I

    move-result v0

    sget v1, Lcom/c/b/an$a;->b:I

    if-eq v0, v1, :cond_1

    .line 244
    :cond_0
    :goto_0
    return-void

    .line 243
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/an;->a()Lcom/c/b/ak$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/c/b/an;->c()Lcom/c/b/be;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Registered message-type extension had null default instance: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/c/b/an;->a()Lcom/c/b/ak$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/ak$f;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v1, Lcom/c/b/ap$b;

    invoke-virtual {p1}, Lcom/c/b/an;->a()Lcom/c/b/ak$f;

    move-result-object v2

    invoke-virtual {p1}, Lcom/c/b/an;->c()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    invoke-direct {v1, v2, v0, v3}, Lcom/c/b/ap$b;-><init>(Lcom/c/b/ak$f;Lcom/c/b/bd;B)V

    move-object v0, v1

    :goto_1
    invoke-virtual {p1}, Lcom/c/b/an;->b()I

    move-result v1

    iget-object v2, v0, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    invoke-virtual {v2}, Lcom/c/b/ak$f;->s()Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Lcom/c/b/ap$b;

    invoke-virtual {p1}, Lcom/c/b/an;->a()Lcom/c/b/ak$f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/ap$b;-><init>(Lcom/c/b/ak$f;Lcom/c/b/bd;B)V

    goto :goto_1

    :cond_4
    sget-object v2, Lcom/c/b/ap$1;->a:[I

    add-int/lit8 v1, v1, -0x1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v1, p0, Lcom/c/b/ap;->a:Ljava/util/Map;

    iget-object v2, p0, Lcom/c/b/ap;->c:Ljava/util/Map;

    :goto_2
    iget-object v3, v0, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    invoke-virtual {v3}, Lcom/c/b/ak$f;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/c/b/ap$a;

    iget-object v4, v0, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    invoke-virtual {v4}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v4

    iget-object v5, v0, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    invoke-virtual {v5}, Lcom/c/b/ak$f;->e()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lcom/c/b/ap$a;-><init>(Lcom/c/b/ak$a;I)V

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    invoke-virtual {v2}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/i$s;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v3

    sget-object v4, Lcom/c/b/ak$f$b;->k:Lcom/c/b/ak$f$b;

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Lcom/c/b/ak$f;->n()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/c/b/ak$f;->v()Lcom/c/b/ak$a;

    move-result-object v3

    invoke-virtual {v2}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v4

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/ak$a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :pswitch_1
    iget-object v1, p0, Lcom/c/b/ap;->b:Ljava/util/Map;

    iget-object v2, p0, Lcom/c/b/ap;->d:Ljava/util/Map;

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
