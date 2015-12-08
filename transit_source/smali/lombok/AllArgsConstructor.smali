.class public interface abstract annotation Llombok/AllArgsConstructor;
.super Ljava/lang/Object;
.source "AllArgsConstructor.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Llombok/AllArgsConstructor;
        access = .enum Llombok/AccessLevel;->PUBLIC:Llombok/AccessLevel;
        onConstructor = {}
        staticName = ""
        suppressConstructorProperties = false
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llombok/AllArgsConstructor$AnyAnnotation;
    }
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
.method public abstract access()Llombok/AccessLevel;
.end method

.method public abstract onConstructor()[Llombok/AllArgsConstructor$AnyAnnotation;
.end method

.method public abstract staticName()Ljava/lang/String;
.end method

.method public abstract suppressConstructorProperties()Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
