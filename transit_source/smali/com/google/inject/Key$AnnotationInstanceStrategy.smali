.class Lcom/google/inject/Key$AnnotationInstanceStrategy;
.super Ljava/lang/Object;
.source "Key.java"

# interfaces
.implements Lcom/google/inject/Key$AnnotationStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/Key;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AnnotationInstanceStrategy"
.end annotation


# instance fields
.field final annotation:Ljava/lang/annotation/Annotation;


# direct methods
.method constructor <init>(Ljava/lang/annotation/Annotation;)V
    .locals 1
    .param p1, "annotation"    # Ljava/lang/annotation/Annotation;

    .prologue
    .line 400
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 401
    const-string v0, "annotation"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Annotation;

    iput-object v0, p0, Lcom/google/inject/Key$AnnotationInstanceStrategy;->annotation:Ljava/lang/annotation/Annotation;

    .line 402
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 421
    instance-of v1, p1, Lcom/google/inject/Key$AnnotationInstanceStrategy;

    if-nez v1, :cond_0

    .line 422
    const/4 v1, 0x0

    .line 426
    :goto_0
    return v1

    :cond_0
    move-object v0, p1

    .line 425
    check-cast v0, Lcom/google/inject/Key$AnnotationInstanceStrategy;

    .line 426
    .local v0, "other":Lcom/google/inject/Key$AnnotationInstanceStrategy;
    iget-object v1, p0, Lcom/google/inject/Key$AnnotationInstanceStrategy;->annotation:Ljava/lang/annotation/Annotation;

    iget-object v2, v0, Lcom/google/inject/Key$AnnotationInstanceStrategy;->annotation:Ljava/lang/annotation/Annotation;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method public getAnnotation()Ljava/lang/annotation/Annotation;
    .locals 1

    .prologue
    .line 413
    iget-object v0, p0, Lcom/google/inject/Key$AnnotationInstanceStrategy;->annotation:Ljava/lang/annotation/Annotation;

    return-object v0
.end method

.method public getAnnotationType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 417
    iget-object v0, p0, Lcom/google/inject/Key$AnnotationInstanceStrategy;->annotation:Ljava/lang/annotation/Annotation;

    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public hasAttributes()Z
    .locals 1

    .prologue
    .line 405
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Lcom/google/inject/Key$AnnotationInstanceStrategy;->annotation:Ljava/lang/annotation/Annotation;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 434
    iget-object v0, p0, Lcom/google/inject/Key$AnnotationInstanceStrategy;->annotation:Ljava/lang/annotation/Annotation;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withoutAttributes()Lcom/google/inject/Key$AnnotationStrategy;
    .locals 3

    .prologue
    .line 409
    new-instance v0, Lcom/google/inject/Key$AnnotationTypeStrategy;

    invoke-virtual {p0}, Lcom/google/inject/Key$AnnotationInstanceStrategy;->getAnnotationType()Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Lcom/google/inject/Key$AnnotationInstanceStrategy;->annotation:Ljava/lang/annotation/Annotation;

    invoke-direct {v0, v1, v2}, Lcom/google/inject/Key$AnnotationTypeStrategy;-><init>(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
