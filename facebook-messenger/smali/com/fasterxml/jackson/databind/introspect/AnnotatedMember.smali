.class public abstract Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
.super Lcom/fasterxml/jackson/databind/introspect/Annotated;
.source "AnnotatedMember.java"


# instance fields
.field protected final _annotations:Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->_annotations:Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    .line 23
    return-void
.end method


# virtual methods
.method public final addIfNotPresent(Ljava/lang/annotation/Annotation;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->_annotations:Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->addIfNotPresent(Ljava/lang/annotation/Annotation;)V

    .line 50
    return-void
.end method

.method public final addOrOverride(Ljava/lang/annotation/Annotation;)V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->_annotations:Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->add(Ljava/lang/annotation/Annotation;)V

    .line 41
    return-void
.end method

.method public final fixAccess()V
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getMember()Ljava/lang/reflect/Member;

    move-result-object v0

    invoke-static {v0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->checkAndFixAccess(Ljava/lang/reflect/Member;)V

    .line 59
    return-void
.end method

.method protected getAllAnnotations()Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->_annotations:Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    return-object v0
.end method

.method public abstract getDeclaringClass()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end method

.method public abstract getMember()Ljava/lang/reflect/Member;
.end method

.method public abstract getValue(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract setValue(Ljava/lang/Object;Ljava/lang/Object;)V
.end method
