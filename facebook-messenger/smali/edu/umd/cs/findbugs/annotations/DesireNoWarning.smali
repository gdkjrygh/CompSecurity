.class public interface abstract annotation Ledu/umd/cs/findbugs/annotations/DesireNoWarning;
.super Ljava/lang/Object;
.source "DesireNoWarning.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Ledu/umd/cs/findbugs/annotations/DesireNoWarning;
        confidence = .enum Ledu/umd/cs/findbugs/annotations/a;->LOW:Ledu/umd/cs/findbugs/annotations/a;
        priority = .enum Ledu/umd/cs/findbugs/annotations/b;->LOW:Ledu/umd/cs/findbugs/annotations/b;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# virtual methods
.method public abstract confidence()Ledu/umd/cs/findbugs/annotations/a;
.end method

.method public abstract priority()Ledu/umd/cs/findbugs/annotations/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract value()Ljava/lang/String;
.end method
