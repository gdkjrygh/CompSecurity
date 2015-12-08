.class final Lcom/google/inject/spi/Elements$2;
.super Ljava/lang/Object;
.source "Elements.java"

# interfaces
.implements Lcom/google/inject/Module;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/spi/Elements;->getModule(Ljava/lang/Iterable;)Lcom/google/inject/Module;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$elements:Ljava/lang/Iterable;


# direct methods
.method constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/google/inject/spi/Elements$2;->val$elements:Ljava/lang/Iterable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lcom/google/inject/Binder;)V
    .locals 3
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 112
    iget-object v2, p0, Lcom/google/inject/spi/Elements$2;->val$elements:Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/spi/Element;

    .line 113
    .local v0, "element":Lcom/google/inject/spi/Element;
    invoke-interface {v0, p1}, Lcom/google/inject/spi/Element;->applyTo(Lcom/google/inject/Binder;)V

    goto :goto_0

    .line 115
    .end local v0    # "element":Lcom/google/inject/spi/Element;
    :cond_0
    return-void
.end method
