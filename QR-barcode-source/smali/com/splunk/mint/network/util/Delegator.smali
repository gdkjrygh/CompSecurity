.class public Lcom/splunk/mint/network/util/Delegator;
.super Ljava/lang/Object;
.source "Delegator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;
    }
.end annotation


# instance fields
.field private final delegate:Ljava/lang/Object;

.field private final source:Ljava/lang/Object;

.field private final superclass:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 0
    .param p1, "source"    # Ljava/lang/Object;
    .param p2, "superclass"    # Ljava/lang/Class;
    .param p3, "delegate"    # Ljava/lang/Object;

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/splunk/mint/network/util/Delegator;->source:Ljava/lang/Object;

    .line 19
    iput-object p2, p0, Lcom/splunk/mint/network/util/Delegator;->superclass:Ljava/lang/Class;

    .line 20
    iput-object p3, p0, Lcom/splunk/mint/network/util/Delegator;->delegate:Ljava/lang/Object;

    .line 21
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 5
    .param p1, "source"    # Ljava/lang/Object;
    .param p2, "superclass"    # Ljava/lang/Class;
    .param p3, "delegateClassName"    # Ljava/lang/String;

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    :try_start_0
    iput-object p1, p0, Lcom/splunk/mint/network/util/Delegator;->source:Ljava/lang/Object;

    .line 26
    iput-object p2, p0, Lcom/splunk/mint/network/util/Delegator;->superclass:Ljava/lang/Class;

    .line 27
    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 28
    .local v2, "implCl":Ljava/lang/Class;
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 29
    .local v0, "delegateConstructor":Ljava/lang/reflect/Constructor;
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 30
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/network/util/Delegator;->delegate:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 36
    return-void

    .line 31
    .end local v0    # "delegateConstructor":Ljava/lang/reflect/Constructor;
    .end local v2    # "implCl":Ljava/lang/Class;
    :catch_0
    move-exception v1

    .line 32
    .local v1, "e":Ljava/lang/RuntimeException;
    throw v1

    .line 33
    .end local v1    # "e":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v1

    .line 34
    .local v1, "e":Ljava/lang/Exception;
    new-instance v3, Lcom/splunk/mint/network/util/DelegationException;

    const-string v4, "Could not make delegate object"

    invoke-direct {v3, v4, v1}, Lcom/splunk/mint/network/util/DelegationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method

.method static synthetic access$000(Lcom/splunk/mint/network/util/Delegator;)Ljava/lang/Class;
    .locals 1
    .param p0, "x0"    # Lcom/splunk/mint/network/util/Delegator;

    .prologue
    .line 12
    iget-object v0, p0, Lcom/splunk/mint/network/util/Delegator;->superclass:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic access$100(Lcom/splunk/mint/network/util/Delegator;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lcom/splunk/mint/network/util/Delegator;
    .param p1, "x1"    # Ljava/lang/reflect/Method;
    .param p2, "x2"    # [Ljava/lang/Object;

    .prologue
    .line 12
    invoke-direct {p0, p1, p2}, Lcom/splunk/mint/network/util/Delegator;->invoke0(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private convertPrimitiveClass(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 114
    .local p1, "primitive":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_1

    .line 116
    const-class p1, Ljava/lang/Integer;

    .line 140
    .end local p1    # "primitive":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_0
    :goto_0
    return-object p1

    .line 118
    .restart local p1    # "primitive":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_2

    .line 119
    const-class p1, Ljava/lang/Boolean;

    goto :goto_0

    .line 121
    :cond_2
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_3

    .line 122
    const-class p1, Ljava/lang/Float;

    goto :goto_0

    .line 124
    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_4

    .line 125
    const-class p1, Ljava/lang/Long;

    goto :goto_0

    .line 127
    :cond_4
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_5

    .line 128
    const-class p1, Ljava/lang/Double;

    goto :goto_0

    .line 130
    :cond_5
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_6

    .line 131
    const-class p1, Ljava/lang/Short;

    goto :goto_0

    .line 133
    :cond_6
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_7

    .line 134
    const-class p1, Ljava/lang/Byte;

    goto :goto_0

    .line 136
    :cond_7
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_0

    .line 137
    const-class p1, Ljava/lang/Character;

    goto :goto_0
.end method

.method private extractMethodName()Ljava/lang/String;
    .locals 4

    .prologue
    .line 77
    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    .line 78
    .local v1, "t":Ljava/lang/Throwable;
    invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    .line 79
    .local v0, "methodName":Ljava/lang/String;
    return-object v0
.end method

.method private findMethod(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 10
    .param p1, "methodName"    # Ljava/lang/String;
    .param p2, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    .prologue
    .line 84
    iget-object v2, p0, Lcom/splunk/mint/network/util/Delegator;->superclass:Ljava/lang/Class;

    .line 85
    .local v2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    array-length v7, p2

    if-nez v7, :cond_1

    .line 86
    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Class;

    invoke-virtual {v2, p1, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 108
    :cond_0
    return-object v5

    .line 88
    :cond_1
    const/4 v5, 0x0

    .line 89
    .local v5, "match":Ljava/lang/reflect/Method;
    invoke-static {v2}, Lcom/splunk/mint/network/util/ReflectionUtil;->getAllMethods(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/reflect/Method;

    .line 90
    .local v6, "method":Ljava/lang/reflect/Method;
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 91
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    .line 92
    .local v1, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    array-length v7, v1

    array-length v8, p2

    if-ne v7, v8, :cond_2

    .line 93
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    array-length v7, v1

    if-ge v3, v7, :cond_3

    .line 94
    aget-object v0, v1, v3

    .line 95
    .local v0, "argType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, v0}, Lcom/splunk/mint/network/util/Delegator;->convertPrimitiveClass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 96
    aget-object v7, p2, v3

    invoke-virtual {v0, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 93
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 99
    .end local v0    # "argType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_3
    if-nez v5, :cond_4

    .line 100
    move-object v5, v6

    goto :goto_0

    .line 102
    :cond_4
    new-instance v7, Lcom/splunk/mint/network/util/DelegationException;

    const-string v8, "Duplicate matches"

    invoke-direct {v7, v8}, Lcom/splunk/mint/network/util/DelegationException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 107
    .end local v1    # "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    .end local v3    # "i":I
    .end local v6    # "method":Ljava/lang/reflect/Method;
    :cond_5
    if-nez v5, :cond_0

    .line 110
    new-instance v7, Lcom/splunk/mint/network/util/DelegationException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Could not find method: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/splunk/mint/network/util/DelegationException;-><init>(Ljava/lang/String;)V

    throw v7
.end method

.method private invoke0(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "method"    # Ljava/lang/reflect/Method;
    .param p2, "args"    # [Ljava/lang/Object;

    .prologue
    .line 54
    :try_start_0
    iget-object v2, p0, Lcom/splunk/mint/network/util/Delegator;->superclass:Ljava/lang/Class;

    iget-object v3, p0, Lcom/splunk/mint/network/util/Delegator;->source:Ljava/lang/Object;

    iget-object v4, p0, Lcom/splunk/mint/network/util/Delegator;->delegate:Ljava/lang/Object;

    invoke-direct {p0, v2, v3, v4}, Lcom/splunk/mint/network/util/Delegator;->writeFields(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 56
    iget-object v2, p0, Lcom/splunk/mint/network/util/Delegator;->delegate:Ljava/lang/Object;

    invoke-virtual {p1, v2, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 57
    .local v1, "result":Ljava/lang/Object;
    iget-object v2, p0, Lcom/splunk/mint/network/util/Delegator;->superclass:Ljava/lang/Class;

    iget-object v3, p0, Lcom/splunk/mint/network/util/Delegator;->delegate:Ljava/lang/Object;

    iget-object v4, p0, Lcom/splunk/mint/network/util/Delegator;->source:Ljava/lang/Object;

    invoke-direct {p0, v2, v3, v4}, Lcom/splunk/mint/network/util/Delegator;->writeFields(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 58
    return-object v1

    .line 59
    .end local v1    # "result":Ljava/lang/Object;
    :catch_0
    move-exception v0

    .line 60
    .local v0, "e":Ljava/lang/RuntimeException;
    throw v0

    .line 61
    .end local v0    # "e":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v0

    .line 62
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    new-instance v2, Lcom/splunk/mint/network/util/DelegationException;

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/splunk/mint/network/util/DelegationException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 63
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_2
    move-exception v0

    .line 64
    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Lcom/splunk/mint/network/util/DelegationException;

    invoke-direct {v2, v0}, Lcom/splunk/mint/network/util/DelegationException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method private writeFields(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5
    .param p1, "clazz"    # Ljava/lang/Class;
    .param p2, "from"    # Ljava/lang/Object;
    .param p3, "to"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 70
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Field;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 71
    .local v1, "field":Ljava/lang/reflect/Field;
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 72
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p3, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 74
    .end local v1    # "field":Ljava/lang/reflect/Field;
    :cond_0
    return-void
.end method


# virtual methods
.method public varargs delegateTo(Ljava/lang/String;[Ljava/lang/Class;)Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;
    .locals 1
    .param p1, "methodName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;"
        }
    .end annotation

    .prologue
    .line 145
    .local p2, "parameters":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    new-instance v0, Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;

    invoke-direct {v0, p0, p1, p2}, Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;-><init>(Lcom/splunk/mint/network/util/Delegator;Ljava/lang/String;[Ljava/lang/Class;)V

    return-object v0
.end method

.method public final varargs invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 40
    :try_start_0
    invoke-direct {p0}, Lcom/splunk/mint/network/util/Delegator;->extractMethodName()Ljava/lang/String;

    move-result-object v2

    .line 43
    .local v2, "methodName":Ljava/lang/String;
    invoke-direct {p0, v2, p1}, Lcom/splunk/mint/network/util/Delegator;->findMethod(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 45
    .local v1, "method":Ljava/lang/reflect/Method;
    invoke-direct {p0, v1, p1}, Lcom/splunk/mint/network/util/Delegator;->invoke0(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 46
    .local v3, "t":Ljava/lang/Object;, "TT;"
    return-object v3

    .line 47
    .end local v1    # "method":Ljava/lang/reflect/Method;
    .end local v2    # "methodName":Ljava/lang/String;
    .end local v3    # "t":Ljava/lang/Object;, "TT;"
    :catch_0
    move-exception v0

    .line 48
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    new-instance v4, Lcom/splunk/mint/network/util/DelegationException;

    invoke-direct {v4, v0}, Lcom/splunk/mint/network/util/DelegationException;-><init>(Ljava/lang/Throwable;)V

    throw v4
.end method
