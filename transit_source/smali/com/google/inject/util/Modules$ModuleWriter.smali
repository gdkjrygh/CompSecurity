.class Lcom/google/inject/util/Modules$ModuleWriter;
.super Lcom/google/inject/spi/DefaultElementVisitor;
.source "Modules.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/util/Modules;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ModuleWriter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/spi/DefaultElementVisitor",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field protected final binder:Lcom/google/inject/Binder;


# direct methods
.method constructor <init>(Lcom/google/inject/Binder;)V
    .locals 0
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 288
    invoke-direct {p0}, Lcom/google/inject/spi/DefaultElementVisitor;-><init>()V

    .line 289
    iput-object p1, p0, Lcom/google/inject/util/Modules$ModuleWriter;->binder:Lcom/google/inject/Binder;

    .line 290
    return-void
.end method


# virtual methods
.method protected bridge synthetic visitOther(Lcom/google/inject/spi/Element;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/Element;

    .prologue
    .line 285
    invoke-virtual {p0, p1}, Lcom/google/inject/util/Modules$ModuleWriter;->visitOther(Lcom/google/inject/spi/Element;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected visitOther(Lcom/google/inject/spi/Element;)Ljava/lang/Void;
    .locals 1
    .param p1, "element"    # Lcom/google/inject/spi/Element;

    .prologue
    .line 293
    iget-object v0, p0, Lcom/google/inject/util/Modules$ModuleWriter;->binder:Lcom/google/inject/Binder;

    invoke-interface {p1, v0}, Lcom/google/inject/spi/Element;->applyTo(Lcom/google/inject/Binder;)V

    .line 294
    const/4 v0, 0x0

    return-object v0
.end method

.method writeAll(Ljava/lang/Iterable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/spi/Element;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 298
    .local p1, "elements":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lcom/google/inject/spi/Element;>;"
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/spi/Element;

    .line 299
    .local v0, "element":Lcom/google/inject/spi/Element;
    invoke-interface {v0, p0}, Lcom/google/inject/spi/Element;->acceptVisitor(Lcom/google/inject/spi/ElementVisitor;)Ljava/lang/Object;

    goto :goto_0

    .line 301
    .end local v0    # "element":Lcom/google/inject/spi/Element;
    :cond_0
    return-void
.end method
