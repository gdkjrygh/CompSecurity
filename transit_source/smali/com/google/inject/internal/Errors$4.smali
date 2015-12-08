.class final Lcom/google/inject/internal/Errors$4;
.super Lcom/google/inject/internal/Errors$Converter;
.source "Errors.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/Errors;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/internal/Errors$Converter",
        "<",
        "Lcom/google/inject/Key;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 653
    .local p1, "x0":Ljava/lang/Class;, "Ljava/lang/Class<Lcom/google/inject/Key;>;"
    invoke-direct {p0, p1}, Lcom/google/inject/internal/Errors$Converter;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public toString(Lcom/google/inject/Key;)Ljava/lang/String;
    .locals 2
    .param p1, "key"    # Lcom/google/inject/Key;

    .prologue
    .line 655
    invoke-virtual {p1}, Lcom/google/inject/Key;->getAnnotationType()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 656
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/inject/Key;->getTypeLiteral()Lcom/google/inject/TypeLiteral;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " annotated with "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/inject/Key;->getAnnotation()Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/inject/Key;->getAnnotation()Ljava/lang/annotation/Annotation;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 659
    :goto_1
    return-object v0

    .line 656
    :cond_0
    invoke-virtual {p1}, Lcom/google/inject/Key;->getAnnotationType()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    .line 659
    :cond_1
    invoke-virtual {p1}, Lcom/google/inject/Key;->getTypeLiteral()Lcom/google/inject/TypeLiteral;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/TypeLiteral;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public bridge synthetic toString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 653
    check-cast p1, Lcom/google/inject/Key;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/Errors$4;->toString(Lcom/google/inject/Key;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
