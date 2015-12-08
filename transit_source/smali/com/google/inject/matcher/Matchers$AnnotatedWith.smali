.class Lcom/google/inject/matcher/Matchers$AnnotatedWith;
.super Lcom/google/inject/matcher/AbstractMatcher;
.source "Matchers.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/matcher/Matchers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AnnotatedWith"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/matcher/AbstractMatcher",
        "<",
        "Ljava/lang/reflect/AnnotatedElement;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field private final annotation:Ljava/lang/annotation/Annotation;


# direct methods
.method public constructor <init>(Ljava/lang/annotation/Annotation;)V
    .locals 1
    .param p1, "annotation"    # Ljava/lang/annotation/Annotation;

    .prologue
    .line 153
    invoke-direct {p0}, Lcom/google/inject/matcher/AbstractMatcher;-><init>()V

    .line 154
    const-string v0, "annotation"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Annotation;

    iput-object v0, p0, Lcom/google/inject/matcher/Matchers$AnnotatedWith;->annotation:Ljava/lang/annotation/Annotation;

    .line 155
    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v0

    # invokes: Lcom/google/inject/matcher/Matchers;->checkForRuntimeRetention(Ljava/lang/Class;)V
    invoke-static {v0}, Lcom/google/inject/matcher/Matchers;->access$200(Ljava/lang/Class;)V

    .line 156
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 164
    instance-of v0, p1, Lcom/google/inject/matcher/Matchers$AnnotatedWith;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/inject/matcher/Matchers$AnnotatedWith;

    .end local p1    # "other":Ljava/lang/Object;
    iget-object v0, p1, Lcom/google/inject/matcher/Matchers$AnnotatedWith;->annotation:Ljava/lang/annotation/Annotation;

    iget-object v1, p0, Lcom/google/inject/matcher/Matchers$AnnotatedWith;->annotation:Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lcom/google/inject/matcher/Matchers$AnnotatedWith;->annotation:Ljava/lang/annotation/Annotation;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    return v0
.end method

.method public bridge synthetic matches(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 149
    check-cast p1, Ljava/lang/reflect/AnnotatedElement;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/matcher/Matchers$AnnotatedWith;->matches(Ljava/lang/reflect/AnnotatedElement;)Z

    move-result v0

    return v0
.end method

.method public matches(Ljava/lang/reflect/AnnotatedElement;)Z
    .locals 2
    .param p1, "element"    # Ljava/lang/reflect/AnnotatedElement;

    .prologue
    .line 159
    iget-object v1, p0, Lcom/google/inject/matcher/Matchers$AnnotatedWith;->annotation:Ljava/lang/annotation/Annotation;

    invoke-interface {v1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/lang/reflect/AnnotatedElement;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 160
    .local v0, "fromElement":Ljava/lang/annotation/Annotation;
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/inject/matcher/Matchers$AnnotatedWith;->annotation:Ljava/lang/annotation/Annotation;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "annotatedWith("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/matcher/Matchers$AnnotatedWith;->annotation:Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
