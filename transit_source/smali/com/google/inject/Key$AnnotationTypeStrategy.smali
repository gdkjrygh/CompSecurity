.class Lcom/google/inject/Key$AnnotationTypeStrategy;
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
    name = "AnnotationTypeStrategy"
.end annotation


# instance fields
.field final annotation:Ljava/lang/annotation/Annotation;

.field final annotationType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V
    .locals 1
    .param p2, "annotation"    # Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    .prologue
    .line 446
    .local p1, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 447
    const-string v0, "annotation type"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    iput-object v0, p0, Lcom/google/inject/Key$AnnotationTypeStrategy;->annotationType:Ljava/lang/Class;

    .line 448
    iput-object p2, p0, Lcom/google/inject/Key$AnnotationTypeStrategy;->annotation:Ljava/lang/annotation/Annotation;

    .line 449
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 468
    instance-of v1, p1, Lcom/google/inject/Key$AnnotationTypeStrategy;

    if-nez v1, :cond_0

    .line 469
    const/4 v1, 0x0

    .line 473
    :goto_0
    return v1

    :cond_0
    move-object v0, p1

    .line 472
    check-cast v0, Lcom/google/inject/Key$AnnotationTypeStrategy;

    .line 473
    .local v0, "other":Lcom/google/inject/Key$AnnotationTypeStrategy;
    iget-object v1, p0, Lcom/google/inject/Key$AnnotationTypeStrategy;->annotationType:Ljava/lang/Class;

    iget-object v2, v0, Lcom/google/inject/Key$AnnotationTypeStrategy;->annotationType:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method public getAnnotation()Ljava/lang/annotation/Annotation;
    .locals 1

    .prologue
    .line 460
    iget-object v0, p0, Lcom/google/inject/Key$AnnotationTypeStrategy;->annotation:Ljava/lang/annotation/Annotation;

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
    .line 464
    iget-object v0, p0, Lcom/google/inject/Key$AnnotationTypeStrategy;->annotationType:Ljava/lang/Class;

    return-object v0
.end method

.method public hasAttributes()Z
    .locals 1

    .prologue
    .line 452
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lcom/google/inject/Key$AnnotationTypeStrategy;->annotationType:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 481
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/Key$AnnotationTypeStrategy;->annotationType:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withoutAttributes()Lcom/google/inject/Key$AnnotationStrategy;
    .locals 2

    .prologue
    .line 456
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Key already has no attributes."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
