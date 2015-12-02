.class public interface abstract annotation Ljavax/annotation/Nonnegative;
.super Ljava/lang/Object;
.source "Nonnegative.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Ljavax/annotation/Nonnegative;
        when = .enum Ljavax/annotation/meta/a;->ALWAYS:Ljavax/annotation/meta/a;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Documented;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljavax/annotation/meta/TypeQualifier;
    applicableTo = Ljava/lang/Number;
.end annotation


# virtual methods
.method public abstract when()Ljavax/annotation/meta/a;
.end method
