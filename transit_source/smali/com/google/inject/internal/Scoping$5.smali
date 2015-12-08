.class final Lcom/google/inject/internal/Scoping$5;
.super Lcom/google/inject/internal/Scoping;
.source "Scoping.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/Scoping;->forAnnotation(Ljava/lang/Class;)Lcom/google/inject/internal/Scoping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$scopingAnnotation:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .prologue
    .line 120
    iput-object p1, p0, Lcom/google/inject/internal/Scoping$5;->val$scopingAnnotation:Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/inject/internal/Scoping;-><init>(Lcom/google/inject/internal/Scoping$1;)V

    return-void
.end method


# virtual methods
.method public acceptVisitor(Lcom/google/inject/spi/BindingScopingVisitor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/BindingScopingVisitor",
            "<TV;>;)TV;"
        }
    .end annotation

    .prologue
    .line 122
    .local p1, "visitor":Lcom/google/inject/spi/BindingScopingVisitor;, "Lcom/google/inject/spi/BindingScopingVisitor<TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/Scoping$5;->val$scopingAnnotation:Ljava/lang/Class;

    invoke-interface {p1, v0}, Lcom/google/inject/spi/BindingScopingVisitor;->visitScopeAnnotation(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/binder/ScopedBindingBuilder;)V
    .locals 1
    .param p1, "scopedBindingBuilder"    # Lcom/google/inject/binder/ScopedBindingBuilder;

    .prologue
    .line 134
    iget-object v0, p0, Lcom/google/inject/internal/Scoping$5;->val$scopingAnnotation:Ljava/lang/Class;

    invoke-interface {p1, v0}, Lcom/google/inject/binder/ScopedBindingBuilder;->in(Ljava/lang/Class;)V

    .line 135
    return-void
.end method

.method public getScopeAnnotation()Ljava/lang/Class;
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
    .line 126
    iget-object v0, p0, Lcom/google/inject/internal/Scoping$5;->val$scopingAnnotation:Ljava/lang/Class;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/google/inject/internal/Scoping$5;->val$scopingAnnotation:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
