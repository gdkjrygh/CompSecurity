.class final Lcom/fasterxml/jackson/databind/util/ViewMatcher$Empty;
.super Lcom/fasterxml/jackson/databind/util/ViewMatcher;
.source "ViewMatcher.java"


# static fields
.field static final instance:Lcom/fasterxml/jackson/databind/util/ViewMatcher$Empty;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ViewMatcher$Empty;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ViewMatcher$Empty;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/util/ViewMatcher$Empty;->instance:Lcom/fasterxml/jackson/databind/util/ViewMatcher$Empty;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/util/ViewMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method public isVisibleForView(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 34
    const/4 v0, 0x0

    return v0
.end method
