.class public Lcom/google/inject/internal/util/$StackTraceElements;
.super Ljava/lang/Object;
.source "StackTraceElements.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static forMember(Ljava/lang/reflect/Member;)Ljava/lang/Object;
    .locals 7
    .param p0, "member"    # Ljava/lang/reflect/Member;

    .prologue
    .line 46
    if-nez p0, :cond_0

    .line 47
    sget-object v5, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    .line 65
    :goto_0
    return-object v5

    .line 50
    :cond_0
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    .line 59
    .local v0, "declaringClass":Ljava/lang/Class;
    const/4 v1, 0x0

    .line 60
    .local v1, "fileName":Ljava/lang/String;
    const/4 v2, -0x1

    .line 63
    .local v2, "lineNumber":I
    invoke-static {p0}, Lcom/google/inject/internal/util/$Classes;->memberType(Ljava/lang/reflect/Member;)Ljava/lang/Class;

    move-result-object v4

    .line 64
    .local v4, "memberType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/reflect/Member;>;"
    const-class v5, Ljava/lang/reflect/Constructor;

    if-ne v4, v5, :cond_1

    const-string v3, "<init>"

    .line 65
    .local v3, "memberName":Ljava/lang/String;
    :goto_1
    new-instance v5, Ljava/lang/StackTraceElement;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v3, v1, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 64
    .end local v3    # "memberName":Ljava/lang/String;
    :cond_1
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_1
.end method

.method public static forType(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    .line 75
    .local p0, "implementation":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v0, 0x0

    .line 76
    .local v0, "fileName":Ljava/lang/String;
    const/4 v1, -0x1

    .line 79
    .local v1, "lineNumber":I
    new-instance v2, Ljava/lang/StackTraceElement;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "class"

    invoke-direct {v2, v3, v4, v0, v1}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v2
.end method
