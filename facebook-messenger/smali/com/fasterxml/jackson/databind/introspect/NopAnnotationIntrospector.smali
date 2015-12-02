.class public abstract Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;
.super Lcom/fasterxml/jackson/databind/AnnotationIntrospector;
.source "NopAnnotationIntrospector.java"


# static fields
.field public static final instance:Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector$1;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector$1;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;->instance:Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;-><init>()V

    return-void
.end method


# virtual methods
.method public version()Lcom/fasterxml/jackson/core/Version;
    .locals 1

    .prologue
    .line 29
    invoke-static {}, Lcom/fasterxml/jackson/core/Version;->unknownVersion()Lcom/fasterxml/jackson/core/Version;

    move-result-object v0

    return-object v0
.end method
