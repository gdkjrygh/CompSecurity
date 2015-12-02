.class public interface abstract annotation Ledu/umd/cs/findbugs/annotations/OverrideMustInvoke;
.super Ljava/lang/Object;
.source "OverrideMustInvoke.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Ledu/umd/cs/findbugs/annotations/OverrideMustInvoke;
        value = .enum Ledu/umd/cs/findbugs/annotations/c;->ANYTIME:Ledu/umd/cs/findbugs/annotations/c;
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
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract value()Ledu/umd/cs/findbugs/annotations/c;
.end method
