.class public interface abstract annotation Llombok/experimental/FieldDefaults;
.super Ljava/lang/Object;
.source "FieldDefaults.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Llombok/experimental/FieldDefaults;
        level = .enum Llombok/AccessLevel;->NONE:Llombok/AccessLevel;
        makeFinal = false
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
.method public abstract level()Llombok/AccessLevel;
.end method

.method public abstract makeFinal()Z
.end method
