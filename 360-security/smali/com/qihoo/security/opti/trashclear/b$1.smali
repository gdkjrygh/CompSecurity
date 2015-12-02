.class Lcom/qihoo/security/opti/trashclear/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Ljava/util/Map;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/b;

.field private final b:Ljava/text/Collator;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/b;)V
    .locals 1

    .prologue
    .line 428
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/b$1;->a:Lcom/qihoo/security/opti/trashclear/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 429
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/b$1;->b:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;Ljava/util/Map;)I
    .locals 3

    .prologue
    .line 433
    const-string/jumbo v0, "pkgMemorySize"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string/jumbo v0, "pkgMemorySize"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 435
    const/4 v0, 0x1

    .line 452
    :goto_0
    return v0

    .line 437
    :cond_0
    const-string/jumbo v0, "pkgMemorySize"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string/jumbo v0, "pkgMemorySize"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v1, v0, :cond_1

    .line 439
    const/4 v0, -0x1

    goto :goto_0

    .line 441
    :cond_1
    const-string/jumbo v0, "pkgName"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 442
    const-string/jumbo v1, "pkgName"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 443
    if-nez v0, :cond_2

    .line 444
    const-string/jumbo v0, ""

    .line 446
    :cond_2
    if-nez v1, :cond_3

    .line 447
    const-string/jumbo v1, ""

    .line 452
    :cond_3
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/b$1;->b:Ljava/text/Collator;

    invoke-virtual {v2, v0, v1}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 428
    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/b$1;->a(Ljava/util/Map;Ljava/util/Map;)I

    move-result v0

    return v0
.end method
