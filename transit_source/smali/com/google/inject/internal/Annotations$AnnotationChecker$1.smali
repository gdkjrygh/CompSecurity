.class Lcom/google/inject/internal/Annotations$AnnotationChecker$1;
.super Ljava/lang/Object;
.source "Annotations.java"

# interfaces
.implements Lcom/google/inject/internal/util/$Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/Annotations$AnnotationChecker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/util/$Function",
        "<",
        "Ljava/lang/Class",
        "<+",
        "Ljava/lang/annotation/Annotation;",
        ">;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/internal/Annotations$AnnotationChecker;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Annotations$AnnotationChecker;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/google/inject/internal/Annotations$AnnotationChecker$1;->this$0:Lcom/google/inject/internal/Annotations$AnnotationChecker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Class;)Ljava/lang/Boolean;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 93
    .local p1, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-virtual {p1}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    .local v1, "arr$":[Ljava/lang/annotation/Annotation;
    array-length v3, v1

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v0, v1, v2

    .line 94
    .local v0, "annotation":Ljava/lang/annotation/Annotation;
    iget-object v4, p0, Lcom/google/inject/internal/Annotations$AnnotationChecker$1;->this$0:Lcom/google/inject/internal/Annotations$AnnotationChecker;

    # getter for: Lcom/google/inject/internal/Annotations$AnnotationChecker;->annotationTypes:Ljava/util/Collection;
    invoke-static {v4}, Lcom/google/inject/internal/Annotations$AnnotationChecker;->access$000(Lcom/google/inject/internal/Annotations$AnnotationChecker;)Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 95
    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 98
    .end local v0    # "annotation":Ljava/lang/annotation/Annotation;
    :goto_1
    return-object v4

    .line 93
    .restart local v0    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 98
    .end local v0    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_1
    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 91
    check-cast p1, Ljava/lang/Class;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/Annotations$AnnotationChecker$1;->apply(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
