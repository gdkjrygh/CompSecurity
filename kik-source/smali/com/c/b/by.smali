.class public final Lcom/c/b/by;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/be;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/by$c;,
        Lcom/c/b/by$b;,
        Lcom/c/b/by$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/c/b/by;

.field private static final c:Lcom/c/b/by$c;


# instance fields
.field private b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 82
    new-instance v0, Lcom/c/b/by;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/c/b/by;-><init>(Ljava/util/Map;)V

    sput-object v0, Lcom/c/b/by;->a:Lcom/c/b/by;

    .line 1006
    new-instance v0, Lcom/c/b/by$c;

    invoke-direct {v0}, Lcom/c/b/by$c;-><init>()V

    sput-object v0, Lcom/c/b/by;->c:Lcom/c/b/by$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    .line 91
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Map;B)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/c/b/by;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static a(Lcom/c/b/by;)Lcom/c/b/by$a;
    .locals 1

    .prologue
    .line 72
    invoke-static {}, Lcom/c/b/by$a;->d()Lcom/c/b/by$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/by$a;->a(Lcom/c/b/by;)Lcom/c/b/by$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/by;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    return-object v0
.end method

.method public static c()Lcom/c/b/by$a;
    .locals 1

    .prologue
    .line 64
    invoke-static {}, Lcom/c/b/by$a;->d()Lcom/c/b/by$a;

    move-result-object v0

    return-object v0
.end method

.method public static e()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 77
    sget-object v0, Lcom/c/b/by;->a:Lcom/c/b/by;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    .line 130
    iget-object v0, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 131
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/by$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0, p1}, Lcom/c/b/by$b;->a(ILcom/c/b/h;)V

    goto :goto_0

    .line 133
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 234
    const/4 v0, 0x1

    return v0
.end method

.method public final b()I
    .locals 4

    .prologue
    .line 199
    const/4 v0, 0x0

    .line 200
    iget-object v1, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 201
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/by$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/c/b/by$b;->a(I)I

    move-result v0

    add-int/2addr v0, v2

    move v2, v0

    .line 202
    goto :goto_0

    .line 203
    :cond_0
    return v2
.end method

.method public final b(Lcom/c/b/h;)V
    .locals 3

    .prologue
    .line 212
    iget-object v0, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 213
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/by$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0, p1}, Lcom/c/b/by$b;->b(ILcom/c/b/h;)V

    goto :goto_0

    .line 216
    :cond_0
    return-void
.end method

.method public final d()Lcom/c/b/f;
    .locals 3

    .prologue
    .line 151
    :try_start_0
    invoke-virtual {p0}, Lcom/c/b/by;->b()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/f;->b(I)Lcom/c/b/f$b;

    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lcom/c/b/f$b;->b()Lcom/c/b/h;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 154
    invoke-virtual {v0}, Lcom/c/b/f$b;->a()Lcom/c/b/f;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 155
    :catch_0
    move-exception v0

    .line 156
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a ByteString threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 97
    if-ne p0, p1, :cond_1

    .line 100
    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lcom/c/b/by;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    check-cast p1, Lcom/c/b/by;

    iget-object v2, p1, Lcom/c/b/by;->b:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Ljava/util/Map;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    return-object v0
.end method

.method public final g()I
    .locals 4

    .prologue
    .line 223
    const/4 v0, 0x0

    .line 224
    iget-object v1, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 225
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/by$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/c/b/by$b;->b(I)I

    move-result v0

    add-int/2addr v0, v2

    move v2, v0

    .line 227
    goto :goto_0

    .line 228
    :cond_0
    return v2
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/c/b/by;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 59
    sget-object v0, Lcom/c/b/by;->c:Lcom/c/b/by$c;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    invoke-static {p0}, Lcom/c/b/bu;->a(Lcom/c/b/by;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 59
    invoke-static {}, Lcom/c/b/by$a;->d()Lcom/c/b/by$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/by$a;->a(Lcom/c/b/by;)Lcom/c/b/by$a;

    move-result-object v0

    return-object v0
.end method
