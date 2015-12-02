.class public interface abstract annotation Ledu/umd/cs/findbugs/annotations/DefaultAnnotationForFields;
.super Ljava/lang/Object;
.source "DefaultAnnotationForFields.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Ledu/umd/cs/findbugs/annotations/DefaultAnnotationForFields;
        confidence = .enum Ledu/umd/cs/findbugs/annotations/a;->MEDIUM:Ledu/umd/cs/findbugs/annotations/a;
        priority = .enum Ledu/umd/cs/findbugs/annotations/b;->MEDIUM:Ledu/umd/cs/findbugs/annotations/b;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation

.annotation runtime Ljava/lang/annotation/Documented;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->PACKAGE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract confidence()Ledu/umd/cs/findbugs/annotations/a;
.end method

.method public abstract priority()Ledu/umd/cs/findbugs/annotations/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
