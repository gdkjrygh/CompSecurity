.class public final Lcom/google/inject/internal/util/$SourceProvider;
.super Ljava/lang/Object;
.source "SourceProvider.java"


# static fields
.field public static final DEFAULT_INSTANCE:Lcom/google/inject/internal/util/$SourceProvider;

.field public static final UNKNOWN_SOURCE:Ljava/lang/Object;


# instance fields
.field private final classNamesToSkip:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 30
    const-string v0, "[unknown source]"

    sput-object v0, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    .line 34
    new-instance v0, Lcom/google/inject/internal/util/$SourceProvider;

    const-class v1, Lcom/google/inject/internal/util/$SourceProvider;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$SourceProvider;-><init>(Ljava/lang/Iterable;)V

    sput-object v0, Lcom/google/inject/internal/util/$SourceProvider;->DEFAULT_INSTANCE:Lcom/google/inject/internal/util/$SourceProvider;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 37
    .local p1, "classesToSkip":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$SourceProvider;->classNamesToSkip:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 39
    return-void
.end method

.method private static varargs asStrings([Ljava/lang/Class;)Ljava/util/List;
    .locals 6
    .param p0, "classes"    # [Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 48
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v4

    .line 49
    .local v4, "strings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    move-object v0, p0

    .local v0, "arr$":[Ljava/lang/Class;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 50
    .local v1, "c":Ljava/lang/Class;
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 52
    .end local v1    # "c":Ljava/lang/Class;
    :cond_0
    return-object v4
.end method


# virtual methods
.method public get()Ljava/lang/StackTraceElement;
    .locals 6

    .prologue
    .line 60
    new-instance v5, Ljava/lang/Throwable;

    invoke-direct {v5}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v5}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/StackTraceElement;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_1

    aget-object v2, v0, v3

    .line 61
    .local v2, "element":Ljava/lang/StackTraceElement;
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v1

    .line 62
    .local v1, "className":Ljava/lang/String;
    iget-object v5, p0, Lcom/google/inject/internal/util/$SourceProvider;->classNamesToSkip:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-virtual {v5, v1}, Lcom/google/inject/internal/util/$ImmutableSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 63
    return-object v2

    .line 60
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 66
    .end local v1    # "className":Ljava/lang/String;
    .end local v2    # "element":Ljava/lang/StackTraceElement;
    :cond_1
    new-instance v5, Ljava/lang/AssertionError;

    invoke-direct {v5}, Ljava/lang/AssertionError;-><init>()V

    throw v5
.end method

.method public varargs plusSkippedClasses([Ljava/lang/Class;)Lcom/google/inject/internal/util/$SourceProvider;
    .locals 3
    .param p1, "moreClassesToSkip"    # [Ljava/lang/Class;

    .prologue
    .line 43
    new-instance v0, Lcom/google/inject/internal/util/$SourceProvider;

    iget-object v1, p0, Lcom/google/inject/internal/util/$SourceProvider;->classNamesToSkip:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-static {p1}, Lcom/google/inject/internal/util/$SourceProvider;->asStrings([Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/inject/internal/util/$Iterables;->concat(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$SourceProvider;-><init>(Ljava/lang/Iterable;)V

    return-object v0
.end method
