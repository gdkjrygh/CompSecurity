.class public interface abstract annotation Llombok/experimental/Wither;
.super Ljava/lang/Object;
.source "Wither.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Llombok/experimental/Wither;
        onMethod = {}
        onParam = {}
        value = .enum Llombok/AccessLevel;->PUBLIC:Llombok/AccessLevel;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llombok/experimental/Wither$AnyAnnotation;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract onMethod()[Llombok/experimental/Wither$AnyAnnotation;
.end method

.method public abstract onParam()[Llombok/experimental/Wither$AnyAnnotation;
.end method

.method public abstract value()Llombok/AccessLevel;
.end method
