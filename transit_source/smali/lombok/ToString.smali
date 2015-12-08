.class public interface abstract annotation Llombok/ToString;
.super Ljava/lang/Object;
.source "ToString.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Llombok/ToString;
        callSuper = false
        doNotUseGetters = false
        exclude = {}
        includeFieldNames = true
        of = {}
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract callSuper()Z
.end method

.method public abstract doNotUseGetters()Z
.end method

.method public abstract exclude()[Ljava/lang/String;
.end method

.method public abstract includeFieldNames()Z
.end method

.method public abstract of()[Ljava/lang/String;
.end method
