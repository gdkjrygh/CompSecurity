.class public final Lcom/google/inject/internal/Errors;
.super Ljava/lang/Object;
.source "Errors.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/Errors$Converter;
    }
.end annotation


# static fields
.field private static final CONSTRUCTOR_RULES:Ljava/lang/String; = "Classes must have either one (and only one) constructor annotated with @Inject or a zero-argument constructor that is not private."

.field private static final converters:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/google/inject/internal/Errors$Converter",
            "<*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private errors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final parent:Lcom/google/inject/internal/Errors;

.field private final root:Lcom/google/inject/internal/Errors;

.field private final source:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 642
    new-instance v0, Lcom/google/inject/internal/Errors$2;

    const-class v1, Ljava/lang/Class;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/Errors$2;-><init>(Ljava/lang/Class;)V

    new-instance v1, Lcom/google/inject/internal/Errors$3;

    const-class v2, Ljava/lang/reflect/Member;

    invoke-direct {v1, v2}, Lcom/google/inject/internal/Errors$3;-><init>(Ljava/lang/Class;)V

    new-instance v2, Lcom/google/inject/internal/Errors$4;

    const-class v3, Lcom/google/inject/Key;

    invoke-direct {v2, v3}, Lcom/google/inject/internal/Errors$4;-><init>(Ljava/lang/Class;)V

    invoke-static {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableList;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    sput-object v0, Lcom/google/inject/internal/Errors;->converters:Ljava/util/Collection;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    iput-object p0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/inject/internal/Errors;->parent:Lcom/google/inject/internal/Errors;

    .line 95
    sget-object v0, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/inject/internal/Errors;->source:Ljava/lang/Object;

    .line 96
    return-void
.end method

.method private constructor <init>(Lcom/google/inject/internal/Errors;Ljava/lang/Object;)V
    .locals 1
    .param p1, "parent"    # Lcom/google/inject/internal/Errors;
    .param p2, "source"    # Ljava/lang/Object;

    .prologue
    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iget-object v0, p1, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iput-object v0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    .line 106
    iput-object p1, p0, Lcom/google/inject/internal/Errors;->parent:Lcom/google/inject/internal/Errors;

    .line 107
    iput-object p2, p0, Lcom/google/inject/internal/Errors;->source:Ljava/lang/Object;

    .line 108
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1, "source"    # Ljava/lang/Object;

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/inject/internal/Errors;->parent:Lcom/google/inject/internal/Errors;

    .line 101
    iput-object p1, p0, Lcom/google/inject/internal/Errors;->source:Ljava/lang/Object;

    .line 102
    return-void
.end method

.method private varargs addMessage(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "cause"    # Ljava/lang/Throwable;
    .param p2, "messageFormat"    # Ljava/lang/String;
    .param p3, "arguments"    # [Ljava/lang/Object;

    .prologue
    .line 508
    invoke-static {p2, p3}, Lcom/google/inject/internal/Errors;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 509
    .local v0, "message":Ljava/lang/String;
    new-instance v1, Lcom/google/inject/spi/Message;

    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->getSources()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2, v0, p1}, Lcom/google/inject/spi/Message;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Lcom/google/inject/spi/Message;)Lcom/google/inject/internal/Errors;

    .line 510
    return-object p0
.end method

.method public static convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p0, "o"    # Ljava/lang/Object;

    .prologue
    .line 665
    sget-object v2, Lcom/google/inject/internal/Errors;->converters:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/Errors$Converter;

    .line 666
    .local v0, "converter":Lcom/google/inject/internal/Errors$Converter;, "Lcom/google/inject/internal/Errors$Converter<*>;"
    invoke-virtual {v0, p0}, Lcom/google/inject/internal/Errors$Converter;->appliesTo(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 667
    invoke-virtual {v0, p0}, Lcom/google/inject/internal/Errors$Converter;->convert(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 670
    .end local v0    # "converter":Lcom/google/inject/internal/Errors$Converter;, "Lcom/google/inject/internal/Errors$Converter<*>;"
    .end local p0    # "o":Ljava/lang/Object;
    :cond_1
    return-object p0
.end method

.method public static format(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    .locals 15
    .param p0, "heading"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 545
    .local p1, "errorMessages":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/inject/spi/Message;>;"
    new-instance v11, Ljava/util/Formatter;

    invoke-direct {v11}, Ljava/util/Formatter;-><init>()V

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-virtual {v11, p0, v12}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v11

    const-string v12, ":%n%n"

    const/4 v13, 0x0

    new-array v13, v13, [Ljava/lang/Object;

    invoke-virtual {v11, v12, v13}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v4

    .line 546
    .local v4, "fmt":Ljava/util/Formatter;
    const/4 v7, 0x1

    .line 547
    .local v7, "index":I
    invoke-static/range {p1 .. p1}, Lcom/google/inject/internal/Errors;->getOnlyCause(Ljava/util/Collection;)Ljava/lang/Throwable;

    move-result-object v11

    if-nez v11, :cond_0

    const/4 v2, 0x1

    .line 549
    .local v2, "displayCauses":Z
    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .local v6, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/inject/spi/Message;

    .line 550
    .local v3, "errorMessage":Lcom/google/inject/spi/Message;
    const-string v11, "%s) %s%n"

    const/4 v12, 0x2

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    add-int/lit8 v8, v7, 0x1

    .end local v7    # "index":I
    .local v8, "index":I
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v12, v13

    const/4 v13, 0x1

    invoke-virtual {v3}, Lcom/google/inject/spi/Message;->getMessage()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-virtual {v4, v11, v12}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 552
    invoke-virtual {v3}, Lcom/google/inject/spi/Message;->getSources()Ljava/util/List;

    move-result-object v1

    .line 553
    .local v1, "dependencies":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v11

    add-int/lit8 v5, v11, -0x1

    .local v5, "i":I
    :goto_2
    if-ltz v5, :cond_1

    .line 554
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 555
    .local v9, "source":Ljava/lang/Object;
    invoke-static {v4, v9}, Lcom/google/inject/internal/Errors;->formatSource(Ljava/util/Formatter;Ljava/lang/Object;)V

    .line 553
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    .line 547
    .end local v1    # "dependencies":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    .end local v2    # "displayCauses":Z
    .end local v3    # "errorMessage":Lcom/google/inject/spi/Message;
    .end local v5    # "i":I
    .end local v6    # "i$":Ljava/util/Iterator;
    .end local v8    # "index":I
    .end local v9    # "source":Ljava/lang/Object;
    .restart local v7    # "index":I
    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 558
    .end local v7    # "index":I
    .restart local v1    # "dependencies":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    .restart local v2    # "displayCauses":Z
    .restart local v3    # "errorMessage":Lcom/google/inject/spi/Message;
    .restart local v5    # "i":I
    .restart local v6    # "i$":Ljava/util/Iterator;
    .restart local v8    # "index":I
    :cond_1
    invoke-virtual {v3}, Lcom/google/inject/spi/Message;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 559
    .local v0, "cause":Ljava/lang/Throwable;
    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    .line 560
    new-instance v10, Ljava/io/StringWriter;

    invoke-direct {v10}, Ljava/io/StringWriter;-><init>()V

    .line 561
    .local v10, "writer":Ljava/io/StringWriter;
    new-instance v11, Ljava/io/PrintWriter;

    invoke-direct {v11, v10}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v0, v11}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 562
    const-string v11, "Caused by: %s"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v10}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-virtual {v4, v11, v12}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 565
    .end local v10    # "writer":Ljava/io/StringWriter;
    :cond_2
    const-string v11, "%n"

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-virtual {v4, v11, v12}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move v7, v8

    .line 566
    .end local v8    # "index":I
    .restart local v7    # "index":I
    goto :goto_1

    .line 568
    .end local v0    # "cause":Ljava/lang/Throwable;
    .end local v1    # "dependencies":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    .end local v3    # "errorMessage":Lcom/google/inject/spi/Message;
    .end local v5    # "i":I
    :cond_3
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_4

    .line 569
    const-string v11, "1 error"

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-virtual {v4, v11, v12}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 574
    :goto_3
    invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v11

    return-object v11

    .line 571
    :cond_4
    const-string v11, "%s errors"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-virtual {v4, v11, v12}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_3
.end method

.method public static varargs format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2
    .param p0, "messageFormat"    # Ljava/lang/String;
    .param p1, "arguments"    # [Ljava/lang/Object;

    .prologue
    .line 522
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 523
    aget-object v1, p1, v0

    invoke-static {v1}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aput-object v1, p1, v0

    .line 522
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 525
    :cond_0
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static formatInjectionPoint(Ljava/util/Formatter;Lcom/google/inject/spi/Dependency;Lcom/google/inject/spi/InjectionPoint;)V
    .locals 7
    .param p0, "formatter"    # Ljava/util/Formatter;
    .param p2, "injectionPoint"    # Lcom/google/inject/spi/InjectionPoint;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Formatter;",
            "Lcom/google/inject/spi/Dependency",
            "<*>;",
            "Lcom/google/inject/spi/InjectionPoint;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 706
    invoke-virtual {p2}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v0

    .line 707
    .local v0, "member":Ljava/lang/reflect/Member;
    invoke-static {v0}, Lcom/google/inject/internal/util/$Classes;->memberType(Ljava/lang/reflect/Member;)Ljava/lang/Class;

    move-result-object v1

    .line 709
    .local v1, "memberType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/reflect/Member;>;"
    const-class v2, Ljava/lang/reflect/Field;

    if-ne v1, v2, :cond_0

    .line 710
    invoke-virtual {p2}, Lcom/google/inject/spi/InjectionPoint;->getDependencies()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    .end local p1    # "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    check-cast p1, Lcom/google/inject/spi/Dependency;

    .line 711
    .restart local p1    # "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    const-string v2, "  while locating %s%n"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/inject/spi/Dependency;->getKey()Lcom/google/inject/Key;

    move-result-object v4

    invoke-static {v4}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 712
    const-string v2, "    for field at %s%n"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/inject/internal/util/$StackTraceElements;->forMember(Ljava/lang/reflect/Member;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 722
    :goto_0
    return-void

    .line 714
    :cond_0
    if-eqz p1, :cond_1

    .line 715
    const-string v2, "  while locating %s%n"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/inject/spi/Dependency;->getKey()Lcom/google/inject/Key;

    move-result-object v4

    invoke-static {v4}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 716
    const-string v2, "    for parameter %s at %s%n"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/inject/spi/Dependency;->getParameterIndex()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v0}, Lcom/google/inject/internal/util/$StackTraceElements;->forMember(Ljava/lang/reflect/Member;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p0, v2, v3}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_0

    .line 720
    :cond_1
    invoke-virtual {p2}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/google/inject/internal/Errors;->formatSource(Ljava/util/Formatter;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static formatSource(Ljava/util/Formatter;Ljava/lang/Object;)V
    .locals 7
    .param p0, "formatter"    # Ljava/util/Formatter;
    .param p1, "source"    # Ljava/lang/Object;

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 674
    instance-of v3, p1, Lcom/google/inject/spi/Dependency;

    if-eqz v3, :cond_1

    move-object v0, p1

    .line 675
    check-cast v0, Lcom/google/inject/spi/Dependency;

    .line 676
    .local v0, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    invoke-virtual {v0}, Lcom/google/inject/spi/Dependency;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v1

    .line 677
    .local v1, "injectionPoint":Lcom/google/inject/spi/InjectionPoint;
    if-eqz v1, :cond_0

    .line 678
    invoke-static {p0, v0, v1}, Lcom/google/inject/internal/Errors;->formatInjectionPoint(Ljava/util/Formatter;Lcom/google/inject/spi/Dependency;Lcom/google/inject/spi/InjectionPoint;)V

    .line 702
    .end local v0    # "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    .end local v1    # "injectionPoint":Lcom/google/inject/spi/InjectionPoint;
    .end local p1    # "source":Ljava/lang/Object;
    :goto_0
    return-void

    .line 680
    .restart local v0    # "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    .restart local v1    # "injectionPoint":Lcom/google/inject/spi/InjectionPoint;
    .restart local p1    # "source":Ljava/lang/Object;
    :cond_0
    invoke-virtual {v0}, Lcom/google/inject/spi/Dependency;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-static {p0, v3}, Lcom/google/inject/internal/Errors;->formatSource(Ljava/util/Formatter;Ljava/lang/Object;)V

    goto :goto_0

    .line 683
    .end local v0    # "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    .end local v1    # "injectionPoint":Lcom/google/inject/spi/InjectionPoint;
    :cond_1
    instance-of v3, p1, Lcom/google/inject/spi/InjectionPoint;

    if-eqz v3, :cond_2

    .line 684
    const/4 v3, 0x0

    check-cast p1, Lcom/google/inject/spi/InjectionPoint;

    .end local p1    # "source":Ljava/lang/Object;
    invoke-static {p0, v3, p1}, Lcom/google/inject/internal/Errors;->formatInjectionPoint(Ljava/util/Formatter;Lcom/google/inject/spi/Dependency;Lcom/google/inject/spi/InjectionPoint;)V

    goto :goto_0

    .line 686
    .restart local p1    # "source":Ljava/lang/Object;
    :cond_2
    instance-of v3, p1, Ljava/lang/Class;

    if-eqz v3, :cond_3

    .line 687
    const-string v3, "  at %s%n"

    new-array v4, v4, [Ljava/lang/Object;

    check-cast p1, Ljava/lang/Class;

    .end local p1    # "source":Ljava/lang/Object;
    invoke-static {p1}, Lcom/google/inject/internal/util/$StackTraceElements;->forType(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {p0, v3, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_0

    .line 689
    .restart local p1    # "source":Ljava/lang/Object;
    :cond_3
    instance-of v3, p1, Ljava/lang/reflect/Member;

    if-eqz v3, :cond_4

    .line 690
    const-string v3, "  at %s%n"

    new-array v4, v4, [Ljava/lang/Object;

    check-cast p1, Ljava/lang/reflect/Member;

    .end local p1    # "source":Ljava/lang/Object;
    invoke-static {p1}, Lcom/google/inject/internal/util/$StackTraceElements;->forMember(Ljava/lang/reflect/Member;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {p0, v3, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_0

    .line 692
    .restart local p1    # "source":Ljava/lang/Object;
    :cond_4
    instance-of v3, p1, Lcom/google/inject/TypeLiteral;

    if-eqz v3, :cond_5

    .line 693
    const-string v3, "  while locating %s%n"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v6

    invoke-virtual {p0, v3, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_0

    .line 695
    :cond_5
    instance-of v3, p1, Lcom/google/inject/Key;

    if-eqz v3, :cond_6

    move-object v2, p1

    .line 696
    check-cast v2, Lcom/google/inject/Key;

    .line 697
    .local v2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    const-string v3, "  while locating %s%n"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {p0, v3, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_0

    .line 700
    .end local v2    # "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    :cond_6
    const-string v3, "  at %s%n"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v6

    invoke-virtual {p0, v3, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_0
.end method

.method public static getMessagesFromThrowable(Ljava/lang/Throwable;)Ljava/util/Collection;
    .locals 1
    .param p0, "throwable"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 373
    instance-of v0, p0, Lcom/google/inject/ProvisionException;

    if-eqz v0, :cond_0

    .line 374
    check-cast p0, Lcom/google/inject/ProvisionException;

    .end local p0    # "throwable":Ljava/lang/Throwable;
    invoke-virtual {p0}, Lcom/google/inject/ProvisionException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v0

    .line 380
    .restart local p0    # "throwable":Ljava/lang/Throwable;
    :goto_0
    return-object v0

    .line 375
    :cond_0
    instance-of v0, p0, Lcom/google/inject/ConfigurationException;

    if-eqz v0, :cond_1

    .line 376
    check-cast p0, Lcom/google/inject/ConfigurationException;

    .end local p0    # "throwable":Ljava/lang/Throwable;
    invoke-virtual {p0}, Lcom/google/inject/ConfigurationException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v0

    goto :goto_0

    .line 377
    .restart local p0    # "throwable":Ljava/lang/Throwable;
    :cond_1
    instance-of v0, p0, Lcom/google/inject/CreationException;

    if-eqz v0, :cond_2

    .line 378
    check-cast p0, Lcom/google/inject/CreationException;

    .end local p0    # "throwable":Ljava/lang/Throwable;
    invoke-virtual {p0}, Lcom/google/inject/CreationException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v0

    goto :goto_0

    .line 380
    .restart local p0    # "throwable":Ljava/lang/Throwable;
    :cond_2
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->of()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    goto :goto_0
.end method

.method public static getOnlyCause(Ljava/util/Collection;)Ljava/lang/Throwable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    .prologue
    .line 602
    .local p0, "messages":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/inject/spi/Message;>;"
    const/4 v3, 0x0

    .line 603
    .local v3, "onlyCause":Ljava/lang/Throwable;
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/spi/Message;

    .line 604
    .local v1, "message":Lcom/google/inject/spi/Message;
    invoke-virtual {v1}, Lcom/google/inject/spi/Message;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    .line 605
    .local v2, "messageCause":Ljava/lang/Throwable;
    if-eqz v2, :cond_0

    .line 609
    if-eqz v3, :cond_2

    .line 610
    const/4 v3, 0x0

    .line 616
    .end local v1    # "message":Lcom/google/inject/spi/Message;
    .end local v2    # "messageCause":Ljava/lang/Throwable;
    .end local v3    # "onlyCause":Ljava/lang/Throwable;
    :cond_1
    return-object v3

    .line 613
    .restart local v1    # "message":Lcom/google/inject/spi/Message;
    .restart local v2    # "messageCause":Ljava/lang/Throwable;
    .restart local v3    # "onlyCause":Ljava/lang/Throwable;
    :cond_2
    move-object v3, v2

    .line 614
    goto :goto_0
.end method

.method private merge(Lcom/google/inject/spi/Message;)Lcom/google/inject/spi/Message;
    .locals 4
    .param p1, "message"    # Lcom/google/inject/spi/Message;

    .prologue
    .line 455
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    .line 456
    .local v0, "sources":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->getSources()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 457
    invoke-virtual {p1}, Lcom/google/inject/spi/Message;->getSources()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 458
    new-instance v1, Lcom/google/inject/spi/Message;

    invoke-virtual {p1}, Lcom/google/inject/spi/Message;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/inject/spi/Message;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/google/inject/spi/Message;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method private unwrap(Ljava/lang/RuntimeException;)Ljava/lang/Throwable;
    .locals 1
    .param p1, "runtimeException"    # Ljava/lang/RuntimeException;

    .prologue
    .line 395
    instance-of v0, p1, Lcom/google/inject/internal/Exceptions$UnhandledCheckedUserException;

    if-eqz v0, :cond_0

    .line 396
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 398
    .end local p1    # "runtimeException":Ljava/lang/RuntimeException;
    :cond_0
    return-object p1
.end method


# virtual methods
.method public addMessage(Lcom/google/inject/spi/Message;)Lcom/google/inject/internal/Errors;
    .locals 2
    .param p1, "message"    # Lcom/google/inject/spi/Message;

    .prologue
    .line 514
    iget-object v0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v0, v0, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    if-nez v0, :cond_0

    .line 515
    iget-object v0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    .line 517
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v0, v0, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 518
    return-object p0
.end method

.method public varargs addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;
    .locals 1
    .param p1, "messageFormat"    # Ljava/lang/String;
    .param p2, "arguments"    # [Ljava/lang/Object;

    .prologue
    .line 504
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public ambiguousTypeConversion(Ljava/lang/String;Ljava/lang/Object;Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeConverterBinding;Lcom/google/inject/spi/TypeConverterBinding;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p1, "stringValue"    # Ljava/lang/String;
    .param p2, "source"    # Ljava/lang/Object;
    .param p4, "a"    # Lcom/google/inject/spi/TypeConverterBinding;
    .param p5, "b"    # Lcom/google/inject/spi/TypeConverterBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 165
    .local p3, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "Multiple converters can convert \'%s\' (bound at %s) to %s:%n %s and%n %s.%n Please adjust your type converter configuration to avoid overlapping matches."

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    const/4 v2, 0x3

    aput-object p4, v1, v2

    const/4 v2, 0x4

    aput-object p5, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public bindingAlreadySet(Lcom/google/inject/Key;Ljava/lang/Object;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p2, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 295
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    const-string v0, "A binding to %s was already configured at %s."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public bindingToProvider()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 173
    const-string v0, "Binding to Provider is not allowed."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotBindToGuiceType(Ljava/lang/String;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "simpleName"    # Ljava/lang/String;

    .prologue
    .line 208
    const-string v0, "Binding to core guice framework type is not allowed: %s."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectAbstractMethod(Ljava/lang/reflect/Method;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "method"    # Ljava/lang/reflect/Method;

    .prologue
    .line 274
    const-string v0, "Injected method %s cannot be abstract."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectFinalField(Ljava/lang/reflect/Field;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "field"    # Ljava/lang/reflect/Field;

    .prologue
    .line 270
    const-string v0, "Injected field %s cannot be final."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectInnerClass(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 259
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "Injecting into inner classes is not supported.  Please use a \'static\' class (top-level or nested) instead of %s."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectMethodWithTypeParameters(Ljava/lang/reflect/Method;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "method"    # Ljava/lang/reflect/Method;

    .prologue
    .line 282
    const-string v0, "Injected method %s cannot declare type parameters of its own."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectNonVoidMethod(Ljava/lang/reflect/Method;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "method"    # Ljava/lang/reflect/Method;

    .prologue
    .line 278
    const-string v0, "Injected method %s must return void."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectRawMembersInjector()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 407
    const-string v0, "Cannot inject a MembersInjector that has no type parameter"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectRawProvider()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 403
    const-string v0, "Cannot inject a Provider that has no type parameter"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectRawTypeLiteral()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 415
    const-string v0, "Cannot inject a TypeLiteral that has no type parameter"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotInjectTypeLiteralOf(Ljava/lang/reflect/Type;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "unsupportedType"    # Ljava/lang/reflect/Type;

    .prologue
    .line 411
    const-string v0, "Cannot inject a TypeLiteral of %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public cannotSatisfyCircularDependency(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 419
    .local p1, "expectedType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "Tried proxying %s to support a circular dependency, but it is not an interface."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public checkForNull(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/inject/spi/Dependency;)Ljava/lang/Object;
    .locals 6
    .param p2, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/spi/Dependency",
            "<*>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 583
    .local p1, "value":Ljava/lang/Object;, "TT;"
    .local p3, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    if-nez p1, :cond_0

    invoke-virtual {p3}, Lcom/google/inject/spi/Dependency;->isNullable()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 584
    :cond_0
    return-object p1

    .line 587
    :cond_1
    invoke-virtual {p3}, Lcom/google/inject/spi/Dependency;->getParameterIndex()I

    move-result v0

    .line 588
    .local v0, "parameterIndex":I
    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parameter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 591
    .local v1, "parameterName":Ljava/lang/String;
    :goto_0
    const-string v2, "null returned by binding at %s%n but %s%s is not @Nullable"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    invoke-virtual {p3}, Lcom/google/inject/spi/Dependency;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    .line 594
    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v2

    throw v2

    .line 588
    .end local v1    # "parameterName":Ljava/lang/String;
    :cond_2
    const-string v1, ""

    goto :goto_0
.end method

.method public childBindingAlreadySet(Lcom/google/inject/Key;Ljava/util/Set;)Lcom/google/inject/internal/Errors;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    .local p2, "sources":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Object;>;"
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 303
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    .line 304
    .local v0, "allSources":Ljava/util/Formatter;
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 305
    .local v3, "source":Ljava/lang/Object;
    if-nez v3, :cond_0

    .line 306
    const-string v4, "%n    (bound by a just-in-time binding)"

    new-array v5, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v4, v5}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_0

    .line 308
    :cond_0
    const-string v4, "%n    bound at %s"

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v3, v5, v6

    invoke-virtual {v0, v4, v5}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_0

    .line 311
    .end local v3    # "source":Ljava/lang/Object;
    :cond_1
    const-string v4, "Unable to create binding for %s. It was already configured on one or more child injectors or private modules%s%n  If it was in a PrivateModule, did you forget to expose the binding?"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v6

    invoke-virtual {v0}, Ljava/util/Formatter;->out()Ljava/lang/Appendable;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-virtual {p0, v4, v5}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    .line 317
    .local v1, "errors":Lcom/google/inject/internal/Errors;
    return-object v1
.end method

.method public circularProxiesDisabled(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 425
    .local p1, "expectedType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "Tried proxying %s to support a circular dependency, but circular proxies are disabled."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public constructorNotDefinedByType(Ljava/lang/reflect/Constructor;Lcom/google/inject/TypeLiteral;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor",
            "<*>;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 241
    .local p1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "%s does not define %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public conversionError(Ljava/lang/String;Ljava/lang/Object;Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeConverterBinding;Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p1, "stringValue"    # Ljava/lang/String;
    .param p2, "source"    # Ljava/lang/Object;
    .param p4, "typeConverterBinding"    # Lcom/google/inject/spi/TypeConverterBinding;
    .param p5, "cause"    # Ljava/lang/RuntimeException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            "Ljava/lang/RuntimeException;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 157
    .local p3, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "Error converting \'%s\' (bound at %s) to %s%n using %s.%n Reason: %s"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    const/4 v2, 0x3

    aput-object p4, v1, v2

    const/4 v2, 0x4

    aput-object p5, v1, v2

    invoke-virtual {p0, p5, v0, v1}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public conversionTypeError(Ljava/lang/String;Ljava/lang/Object;Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeConverterBinding;Ljava/lang/Object;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p1, "stringValue"    # Ljava/lang/String;
    .param p2, "source"    # Ljava/lang/Object;
    .param p4, "typeConverterBinding"    # Lcom/google/inject/spi/TypeConverterBinding;
    .param p5, "converted"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 149
    .local p3, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "Type mismatch converting \'%s\' (bound at %s) to %s%n using %s.%n Converter returned %s."

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    const/4 v2, 0x3

    aput-object p4, v1, v2

    const/4 v2, 0x4

    aput-object p5, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public converterReturnedNull(Ljava/lang/String;Ljava/lang/Object;Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeConverterBinding;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p1, "stringValue"    # Ljava/lang/String;
    .param p2, "source"    # Ljava/lang/Object;
    .param p4, "typeConverterBinding"    # Lcom/google/inject/spi/TypeConverterBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 142
    .local p3, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "Received null converting \'%s\' (bound at %s) to %s%n using %s."

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    const/4 v2, 0x3

    aput-object p4, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public duplicateBindingAnnotations(Ljava/lang/reflect/Member;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "member"    # Ljava/lang/reflect/Member;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Member;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 265
    .local p2, "a":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    .local p3, "b":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-string v0, "%s has more than one annotation annotated with @BindingAnnotation: %s and %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public duplicateScopeAnnotations(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 287
    .local p1, "a":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    .local p2, "b":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-string v0, "More than one scope annotation was found: %s and %s."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public duplicateScopes(Lcom/google/inject/Scope;Ljava/lang/Class;Lcom/google/inject/Scope;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "existing"    # Lcom/google/inject/Scope;
    .param p3, "scope"    # Lcom/google/inject/Scope;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Scope;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/google/inject/Scope;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 246
    .local p2, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-string v0, "Scope %s is already bound to %s. Cannot bind %s."

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public errorCheckingDuplicateBinding(Lcom/google/inject/Key;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p2, "source"    # Ljava/lang/Object;
    .param p3, "t"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Throwable;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 321
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    const-string v0, "A binding to %s was already configured at %s and an error was thrown while checking duplicate bindings.  Error: %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public errorEnhancingClass(Ljava/lang/Class;Ljava/lang/Throwable;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p2, "cause"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Throwable;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 369
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "Unable to method intercept: %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, p2, v0, v1}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public errorInProvider(Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p1, "runtimeException"    # Ljava/lang/RuntimeException;

    .prologue
    .line 344
    invoke-direct {p0, p1}, Lcom/google/inject/internal/Errors;->unwrap(Ljava/lang/RuntimeException;)Ljava/lang/Throwable;

    move-result-object v0

    .line 345
    .local v0, "unwrapped":Ljava/lang/Throwable;
    const-string v1, "Error in custom provider, %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    return-object v1
.end method

.method public varargs errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;
    .locals 2
    .param p1, "cause"    # Ljava/lang/Throwable;
    .param p2, "messageFormat"    # Ljava/lang/String;
    .param p3, "arguments"    # [Ljava/lang/Object;

    .prologue
    .line 385
    invoke-static {p1}, Lcom/google/inject/internal/Errors;->getMessagesFromThrowable(Ljava/lang/Throwable;)Ljava/util/Collection;

    move-result-object v0

    .line 387
    .local v0, "messages":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/inject/spi/Message;>;"
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 388
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/Errors;->merge(Ljava/util/Collection;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    .line 390
    :goto_0
    return-object v1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    goto :goto_0
.end method

.method public errorInUserInjector(Lcom/google/inject/MembersInjector;Lcom/google/inject/TypeLiteral;Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p3, "cause"    # Ljava/lang/RuntimeException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/MembersInjector",
            "<*>;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/RuntimeException;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 350
    .local p1, "listener":Lcom/google/inject/MembersInjector;, "Lcom/google/inject/MembersInjector<*>;"
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "Error injecting %s using %s.%n Reason: %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    invoke-virtual {p0, p3, v0, v1}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public errorInjectingConstructor(Ljava/lang/Throwable;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "cause"    # Ljava/lang/Throwable;

    .prologue
    .line 340
    const-string v0, "Error injecting constructor, %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public errorInjectingMethod(Ljava/lang/Throwable;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "cause"    # Ljava/lang/Throwable;

    .prologue
    .line 328
    const-string v0, "Error injecting method, %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public errorNotifyingInjectionListener(Lcom/google/inject/spi/InjectionListener;Lcom/google/inject/TypeLiteral;Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p3, "cause"    # Ljava/lang/RuntimeException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/InjectionListener",
            "<*>;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/RuntimeException;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 356
    .local p1, "listener":Lcom/google/inject/spi/InjectionListener;, "Lcom/google/inject/spi/InjectionListener<*>;"
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "Error notifying InjectionListener %s of %s.%n Reason: %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    invoke-virtual {p0, p3, v0, v1}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public errorNotifyingTypeListener(Lcom/google/inject/spi/TypeListenerBinding;Lcom/google/inject/TypeLiteral;Ljava/lang/Throwable;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p1, "listener"    # Lcom/google/inject/spi/TypeListenerBinding;
    .param p3, "cause"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/TypeListenerBinding;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/Throwable;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 333
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "Error notifying TypeListener %s (bound at %s) of %s.%n Reason: %s"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/inject/spi/TypeListenerBinding;->getListener()Lcom/google/inject/spi/TypeListener;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p1}, Lcom/google/inject/spi/TypeListenerBinding;->getSource()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    const/4 v2, 0x3

    aput-object p3, v1, v2

    invoke-virtual {p0, p3, v0, v1}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public exposedButNotBound(Lcom/google/inject/Key;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 361
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    const-string v0, "Could not expose() %s, it must be explicitly bound."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public getMessages()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 529
    iget-object v1, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v1, v1, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    if-nez v1, :cond_0

    .line 530
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    .line 540
    :goto_0
    return-object v0

    .line 533
    :cond_0
    iget-object v1, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v1, v1, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    invoke-static {v1}, Lcom/google/inject/internal/util/$Lists;->newArrayList(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 534
    .local v0, "result":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/Message;>;"
    new-instance v1, Lcom/google/inject/internal/Errors$1;

    invoke-direct {v1, p0}, Lcom/google/inject/internal/Errors$1;-><init>(Lcom/google/inject/internal/Errors;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0
.end method

.method public getSources()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 478
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v1

    .line 479
    .local v1, "sources":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    move-object v0, p0

    .local v0, "e":Lcom/google/inject/internal/Errors;
    :goto_0
    if-eqz v0, :cond_1

    .line 480
    iget-object v2, v0, Lcom/google/inject/internal/Errors;->source:Ljava/lang/Object;

    sget-object v3, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    if-eq v2, v3, :cond_0

    .line 481
    const/4 v2, 0x0

    iget-object v3, v0, Lcom/google/inject/internal/Errors;->source:Ljava/lang/Object;

    invoke-interface {v1, v2, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 479
    :cond_0
    iget-object v0, v0, Lcom/google/inject/internal/Errors;->parent:Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 484
    :cond_1
    return-object v1
.end method

.method public hasErrors()Z
    .locals 1

    .prologue
    .line 500
    iget-object v0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v0, v0, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public jitBindingAlreadySet(Lcom/google/inject/Key;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 299
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    const-string v0, "A just-in-time binding to %s was already configured on a parent injector."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public jitDisabled(Lcom/google/inject/Key;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "key"    # Lcom/google/inject/Key;

    .prologue
    .line 137
    const-string v0, "Explicit bindings are required and %s is not explicitly bound."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public keyNotFullySpecified(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 365
    .local p1, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const-string v0, "%s cannot be used as a key; It is not fully specified."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;
    .locals 2
    .param p1, "moreErrors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 469
    iget-object v0, p1, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v1, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    if-eq v0, v1, :cond_0

    iget-object v0, p1, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v0, v0, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    if-nez v0, :cond_1

    .line 474
    :cond_0
    :goto_0
    return-object p0

    .line 473
    :cond_1
    iget-object v0, p1, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v0, v0, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/Errors;->merge(Ljava/util/Collection;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method

.method public merge(Ljava/util/Collection;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 462
    .local p1, "messages":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/inject/spi/Message;>;"
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/spi/Message;

    .line 463
    .local v1, "message":Lcom/google/inject/spi/Message;
    invoke-direct {p0, v1}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/spi/Message;)Lcom/google/inject/spi/Message;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/google/inject/internal/Errors;->addMessage(Lcom/google/inject/spi/Message;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 465
    .end local v1    # "message":Lcom/google/inject/spi/Message;
    :cond_0
    return-object p0
.end method

.method public misplacedBindingAnnotation(Ljava/lang/reflect/Member;Ljava/lang/annotation/Annotation;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "member"    # Ljava/lang/reflect/Member;
    .param p2, "bindingAnnotation"    # Ljava/lang/annotation/Annotation;

    .prologue
    .line 222
    const-string v0, "%s is annotated with %s, but binding annotations should be applied to its parameters instead."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public missingConstantValues()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 255
    const-string v0, "Missing constant value. Please call to(...)."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public missingConstructor(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 231
    .local p1, "implementation":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "Could not find a suitable constructor in %s. Classes must have either one (and only one) constructor annotated with @Inject or a zero-argument constructor that is not private."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public missingImplementation(Lcom/google/inject/Key;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "key"    # Lcom/google/inject/Key;

    .prologue
    .line 133
    const-string v0, "No implementation for %s was bound."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public missingRuntimeRetention(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p1, "source"    # Ljava/lang/Object;

    .prologue
    .line 194
    const-string v0, "Please annotate with @Retention(RUNTIME).%n Bound at %s."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public missingScopeAnnotation()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 199
    const-string v0, "Please annotate with @ScopeAnnotation."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public notASubtype(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 182
    .local p1, "implementationType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p2, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "%s doesn\'t extend %s."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public optionalConstructor(Ljava/lang/reflect/Constructor;)Lcom/google/inject/internal/Errors;
    .locals 3
    .param p1, "constructor"    # Ljava/lang/reflect/Constructor;

    .prologue
    .line 203
    const-string v0, "%s is annotated @Inject(optional=true), but constructors cannot be optional."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public recursiveBinding()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 291
    const-string v0, "Binding points to itself."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public recursiveImplementationType()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 186
    const-string v0, "@ImplementedBy points to the same class it annotates."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public recursiveProviderType()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 190
    const-string v0, "@ProvidedBy points to the same class it annotates."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public scopeAnnotationOnAbstractType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/inject/internal/Errors;
    .locals 4
    .param p3, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 217
    .local p1, "scopeAnnotation":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    .local p2, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "%s is annotated with %s, but scope annotations are not supported for abstract types.%n Bound at %s."

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    invoke-static {p3}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public scopeNotFound(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 212
    .local p1, "scopeAnnotation":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-string v0, "No scope is bound to %s."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 620
    iget-object v0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v0, v0, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/Errors;->root:Lcom/google/inject/internal/Errors;

    iget-object v0, v0, Lcom/google/inject/internal/Errors;->errors:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public subtypeNotProvided(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/inject/Provider",
            "<*>;>;",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 178
    .local p1, "providerType":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/inject/Provider<*>;>;"
    .local p2, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "%s doesn\'t provide instances of %s."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public throwConfigurationExceptionIfErrorsExist()V
    .locals 2

    .prologue
    .line 439
    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->hasErrors()Z

    move-result v0

    if-nez v0, :cond_0

    .line 440
    return-void

    .line 443
    :cond_0
    new-instance v0, Lcom/google/inject/ConfigurationException;

    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/ConfigurationException;-><init>(Ljava/lang/Iterable;)V

    throw v0
.end method

.method public throwCreationExceptionIfErrorsExist()V
    .locals 2

    .prologue
    .line 431
    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->hasErrors()Z

    move-result v0

    if-nez v0, :cond_0

    .line 432
    return-void

    .line 435
    :cond_0
    new-instance v0, Lcom/google/inject/CreationException;

    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/CreationException;-><init>(Ljava/util/Collection;)V

    throw v0
.end method

.method public throwIfNewErrors(I)V
    .locals 1
    .param p1, "expectedSize"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 488
    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->size()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 489
    return-void

    .line 492
    :cond_0
    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v0

    throw v0
.end method

.method public throwProvisionExceptionIfErrorsExist()V
    .locals 2

    .prologue
    .line 447
    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->hasErrors()Z

    move-result v0

    if-nez v0, :cond_0

    .line 448
    return-void

    .line 451
    :cond_0
    new-instance v0, Lcom/google/inject/ProvisionException;

    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/ProvisionException;-><init>(Ljava/lang/Iterable;)V

    throw v0
.end method

.method public toException()Lcom/google/inject/internal/ErrorsException;
    .locals 1

    .prologue
    .line 496
    new-instance v0, Lcom/google/inject/internal/ErrorsException;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/ErrorsException;-><init>(Lcom/google/inject/internal/Errors;)V

    return-object v0
.end method

.method public tooManyConstructors(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/internal/Errors;"
        }
    .end annotation

    .prologue
    .line 236
    .local p1, "implementation":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "%s has more than one constructor annotated with @Inject. Classes must have either one (and only one) constructor annotated with @Inject or a zero-argument constructor that is not private."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public voidProviderMethod()Lcom/google/inject/internal/Errors;
    .locals 2

    .prologue
    .line 251
    const-string v0, "Provider methods must return a value. Do not return void."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    return-object v0
.end method

.method public withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;
    .locals 1
    .param p1, "source"    # Ljava/lang/Object;

    .prologue
    .line 114
    sget-object v0, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    .end local p0    # "this":Lcom/google/inject/internal/Errors;
    :goto_0
    return-object p0

    .restart local p0    # "this":Lcom/google/inject/internal/Errors;
    :cond_0
    new-instance v0, Lcom/google/inject/internal/Errors;

    invoke-direct {v0, p0, p1}, Lcom/google/inject/internal/Errors;-><init>(Lcom/google/inject/internal/Errors;Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0
.end method
