.class public Lcom/fasterxml/jackson/databind/type/TypeParser;
.super Ljava/lang/Object;
.source "TypeParser.java"


# instance fields
.field final _factory:Lcom/fasterxml/jackson/databind/type/TypeFactory;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/type/TypeFactory;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/type/TypeParser;->_factory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    .line 20
    return-void
.end method


# virtual methods
.method protected _problem(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;
    .locals 3

    .prologue
    .line 84
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to parse type \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->getAllInput()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' (remaining: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->getRemainingInput()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected findClass(Ljava/lang/String;Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;",
            ")",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 73
    :try_start_0
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->findClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_0

    .line 76
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 78
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can not locate class \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\', problem: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lcom/fasterxml/jackson/databind/type/TypeParser;->_problem(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
.end method

.method public parse(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JavaType;
    .locals 3

    .prologue
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 26
    new-instance v1, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;-><init>(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/type/TypeParser;->parseType(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 29
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->hasMoreTokens()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 30
    const-string v0, "Unexpected tokens after complete type"

    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/databind/type/TypeParser;->_problem(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 32
    :cond_0
    return-object v0
.end method

.method protected parseType(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;)Lcom/fasterxml/jackson/databind/JavaType;
    .locals 3

    .prologue
    .line 38
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->hasMoreTokens()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    const-string v0, "Unexpected end-of-string"

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/databind/type/TypeParser;->_problem(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 41
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/fasterxml/jackson/databind/type/TypeParser;->findClass(Ljava/lang/String;Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;)Ljava/lang/Class;

    move-result-object v0

    .line 43
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->hasMoreTokens()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 44
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    .line 45
    const-string v2, "<"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 46
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeParser;->_factory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/type/TypeParser;->parseTypes(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->_fromParameterizedClass(Ljava/lang/Class;Ljava/util/List;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 51
    :goto_0
    return-object v0

    .line 49
    :cond_1
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->pushBack(Ljava/lang/String;)V

    .line 51
    :cond_2
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeParser;->_factory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->_fromClass(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/type/TypeBindings;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    goto :goto_0
.end method

.method protected parseTypes(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->hasMoreTokens()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 59
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/type/TypeParser;->parseType(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->hasMoreTokens()Z

    move-result v1

    if-nez v1, :cond_2

    .line 67
    :cond_1
    const-string v0, "Unexpected end-of-string"

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/databind/type/TypeParser;->_problem(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 61
    :cond_2
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    .line 62
    const-string v2, ">"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v0

    .line 63
    :cond_3
    const-string v2, ","

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected token \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', expected \',\' or \'>\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/databind/type/TypeParser;->_problem(Lcom/fasterxml/jackson/databind/type/TypeParser$MyTokenizer;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
.end method
