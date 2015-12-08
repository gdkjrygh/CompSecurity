.class public interface abstract annotation Llombok/NoArgsConstructor;
.super Ljava/lang/Object;
.source "NoArgsConstructor.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Llombok/NoArgsConstructor;
        access = .enum Llombok/AccessLevel;->PUBLIC:Llombok/AccessLevel;
        onConstructor = {}
        staticName = ""
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llombok/NoArgsConstructor$AnyAnnotation;
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

.method public abstract onConstructor()[Llombok/NoArgsConstructor$AnyAnnotation;
.end method

.method public abstract staticName()Ljava/lang/String;
.end method
