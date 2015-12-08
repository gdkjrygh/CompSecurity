.class public interface abstract annotation Llombok/Getter;
.super Ljava/lang/Object;
.source "Getter.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Llombok/Getter;
        lazy = false
        onMethod = {
            .subannotation Llombok/Getter$AnyAnnotation;
            .end subannotation
        }
        value = .enum Llombok/AccessLevel;->PUBLIC:Llombok/AccessLevel;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llombok/Getter$AnyAnnotation;
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
.method public abstract lazy()Z
.end method

.method public abstract onMethod()[Llombok/Getter$AnyAnnotation;
.end method

.method public abstract value()Llombok/AccessLevel;
.end method
