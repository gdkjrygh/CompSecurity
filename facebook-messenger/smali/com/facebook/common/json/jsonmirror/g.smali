.class public Lcom/facebook/common/json/jsonmirror/g;
.super Ljava/lang/Object;
.source "JMParser.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/common/json/jsonmirror/g;

    sput-object v0, Lcom/facebook/common/json/jsonmirror/g;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;)",
            "Lcom/facebook/common/json/jsonmirror/a/a;"
        }
    .end annotation

    .prologue
    .line 95
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/a;

    .line 96
    invoke-static {p0, v0}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 101
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static a(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Boolean;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressWarnings;
        justification = "We\'re using this as a tristate."
    .end annotation

    .prologue
    .line 182
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 184
    const-class v1, Lcom/facebook/common/json/jsonmirror/a/b;

    invoke-static {v1, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 185
    new-instance v1, Ljava/lang/Boolean;

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {v1, v0}, Ljava/lang/Boolean;-><init>(Z)V

    move-object v0, v1

    .line 189
    :goto_1
    return-object v0

    .line 185
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 188
    :cond_1
    invoke-static {v0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Ljava/util/Set;)V

    .line 189
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static a(Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/common/json/jsonmirror/a/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 473
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    .line 474
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 475
    invoke-static {p0, v0}, Lcom/facebook/common/json/jsonmirror/g;->d(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<typeClass:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Ljava/lang/Class",
            "<TtypeClass;>;)TtypeClass;"
        }
    .end annotation

    .prologue
    .line 512
    invoke-static {p1}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/c;

    move-result-object v0

    .line 513
    invoke-static {p0, v0}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/common/json/jsonmirror/a/a;)Ljava/lang/Object;

    move-result-object v1

    .line 515
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 517
    return-object v1

    .line 515
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static a(Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonToken;",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    .line 115
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne p0, v0, :cond_2

    :cond_0
    const-class v0, Lcom/facebook/common/json/jsonmirror/a/i;

    invoke-static {v0, p2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 118
    :try_start_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 173
    :cond_1
    :goto_0
    return-object v0

    .line 119
    :catch_0
    move-exception v0

    .line 124
    :cond_2
    const-class v0, Lcom/facebook/common/json/jsonmirror/a/d;

    invoke-static {v0, p2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 126
    :try_start_1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 127
    :catch_1
    move-exception v0

    .line 132
    :cond_3
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq p0, v0, :cond_4

    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne p0, v0, :cond_6

    :cond_4
    const-class v0, Lcom/facebook/common/json/jsonmirror/a/b;

    invoke-static {v0, p2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 134
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 135
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 136
    :cond_5
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 137
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 141
    :cond_6
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne p0, v0, :cond_7

    const-class v0, Lcom/facebook/common/json/jsonmirror/a/f;

    invoke-static {v0, p2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 143
    instance-of v1, v0, Lcom/facebook/common/json/jsonmirror/a/f;

    invoke-static {v1}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 144
    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/f;

    .line 145
    iget-object v1, v0, Lcom/facebook/common/json/jsonmirror/a/f;->h:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v1

    .line 149
    invoke-static {v1}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 152
    :try_start_2
    iget-object v0, v0, Lcom/facebook/common/json/jsonmirror/a/f;->g:Lcom/facebook/common/json/jsonmirror/a/a;

    invoke-static {v1, v0}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/common/json/jsonmirror/a/a;)Ljava/lang/Object;
    :try_end_2
    .catch Lcom/facebook/common/json/jsonmirror/e; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    .line 153
    if-nez v0, :cond_1

    .line 163
    :cond_7
    :goto_1
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne p0, v0, :cond_8

    const-class v0, Lcom/facebook/common/json/jsonmirror/a/l;

    invoke-static {v0, p2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 165
    instance-of v1, v0, Lcom/facebook/common/json/jsonmirror/a/l;

    invoke-static {v1}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 166
    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/l;

    .line 168
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/common/json/jsonmirror/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 172
    :cond_8
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Ljava/util/Set;)V

    .line 173
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 156
    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method protected static a(Lcom/fasterxml/jackson/core/JsonToken;Lcom/facebook/common/json/jsonmirror/a/a;)V
    .locals 2

    .prologue
    .line 44
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    :goto_0
    return-void

    .line 47
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected token "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonToken;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    if-eqz p1, :cond_1

    .line 50
    const-string v1, "; expecting a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    sget-object v1, Lcom/facebook/common/json/jsonmirror/g;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 54
    :cond_1
    const-string v1, "; field not defined."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    sget-object v1, Lcom/facebook/common/json/jsonmirror/g;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected static a(Lcom/fasterxml/jackson/core/JsonToken;Ljava/util/Set;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonToken;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 60
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    :goto_0
    return-void

    .line 64
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected token "

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonToken;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    const-string v0, "; expecting one of the following: ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/a;

    .line 68
    if-ne v1, v2, :cond_1

    .line 69
    const/4 v1, 0x0

    .line 73
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 71
    :cond_1
    const-string v5, ", "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 75
    :cond_2
    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    sget-object v0, Lcom/facebook/common/json/jsonmirror/g;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected static a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ")Z"
        }
    .end annotation

    .prologue
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static b(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<typeClass:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Ljava/lang/Class",
            "<TtypeClass;>;)",
            "Ljava/util/List",
            "<TtypeClass;>;"
        }
    .end annotation

    .prologue
    .line 529
    invoke-static {p1}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/c;

    move-result-object v0

    .line 530
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 531
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 532
    new-instance v0, Lcom/facebook/common/json/jsonmirror/a/h;

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/a/h;-><init>(Ljava/util/Set;)V

    .line 534
    invoke-static {p0, v0}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/common/json/jsonmirror/a/a;)Ljava/lang/Object;

    move-result-object v0

    .line 536
    if-eqz v0, :cond_0

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-static {v1}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 538
    check-cast v0, Ljava/util/List;

    return-object v0

    .line 536
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method protected static b(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 202
    const-class v0, Lcom/facebook/common/json/jsonmirror/a/h;

    invoke-static {v0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/h;

    .line 204
    if-eqz v0, :cond_2

    .line 206
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 208
    invoke-virtual {v0}, Lcom/facebook/common/json/jsonmirror/a/h;->a()Ljava/util/Set;

    move-result-object v2

    .line 209
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 210
    :goto_0
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v3, :cond_1

    .line 212
    invoke-static {p0, v2}, Lcom/facebook/common/json/jsonmirror/g;->d(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Object;

    move-result-object v0

    .line 213
    if-eqz v0, :cond_0

    .line 214
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 211
    :cond_0
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    goto :goto_0

    .line 217
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 225
    :goto_1
    return-object v0

    .line 220
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Ljava/util/Set;)V

    .line 223
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    .line 225
    const/4 v0, 0x0

    goto :goto_1
.end method

.method protected static c(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 240
    .line 242
    const-class v0, Lcom/facebook/common/json/jsonmirror/a/c;

    invoke-static {v0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    if-eqz v0, :cond_1c

    .line 243
    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/c;

    .line 244
    invoke-virtual {v0}, Lcom/facebook/common/json/jsonmirror/a/c;->a()Lcom/facebook/common/json/jsonmirror/b;

    move-result-object v4

    .line 246
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    move-object v6, v1

    move-object v5, v7

    .line 247
    :goto_0
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v6, v1, :cond_1a

    .line 253
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v1, :cond_0

    .line 254
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    .line 248
    :goto_1
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    move-object v6, v2

    move-object v5, v1

    goto :goto_0

    .line 259
    :cond_0
    invoke-static {v5}, Lcom/facebook/debug/b/a;->a(Ljava/lang/Object;)V

    .line 260
    invoke-virtual {v0, v5}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Ljava/lang/String;)Lcom/facebook/common/w/s;

    move-result-object v2

    .line 264
    if-eqz v2, :cond_30

    .line 265
    iget-object v1, v2, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 266
    iget-object v2, v2, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    check-cast v2, Lcom/facebook/common/json/jsonmirror/a/a;

    move-object v8, v1

    .line 271
    :goto_2
    const-class v1, Lcom/facebook/common/json/jsonmirror/a/g;

    invoke-static {v1, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 274
    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/JsonToken;->isScalarValue()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 275
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    .line 283
    :goto_3
    invoke-virtual {v0, v4, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v5

    .line 284
    goto :goto_1

    .line 277
    :cond_1
    new-instance v1, Ljava/io/CharArrayWriter;

    invoke-direct {v1}, Ljava/io/CharArrayWriter;-><init>()V

    .line 278
    sget-object v2, Lcom/facebook/common/json/c;->a:Lcom/facebook/common/json/c;

    invoke-virtual {v2, v1}, Lcom/facebook/common/json/c;->createJsonGenerator(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v2

    .line 279
    invoke-virtual {v2, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentStructure(Lcom/fasterxml/jackson/core/JsonParser;)V

    .line 280
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    .line 281
    invoke-virtual {v1}, Ljava/io/CharArrayWriter;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    .line 287
    :cond_2
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v6, v1, :cond_3

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v6, v1, :cond_3

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v1, :cond_d

    .line 291
    :cond_3
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v6, v1, :cond_4

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v1, :cond_2f

    :cond_4
    const-class v1, Lcom/facebook/common/json/jsonmirror/a/i;

    invoke-static {v1, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z

    move-result v1

    if-eqz v1, :cond_2f

    .line 294
    :try_start_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    invoke-virtual {v0, v4, v8, v11, v12}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move v11, v9

    .line 301
    :goto_4
    if-nez v11, :cond_6

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v6, v1, :cond_5

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v1, :cond_6

    :cond_5
    const-class v1, Lcom/facebook/common/json/jsonmirror/a/b;

    invoke-static {v1, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 304
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v3, "0"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    move v1, v10

    move v11, v9

    .line 312
    :goto_5
    if-eqz v11, :cond_6

    .line 313
    invoke-virtual {v0, v4, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Z)V

    .line 317
    :cond_6
    if-nez v11, :cond_7

    const-class v1, Lcom/facebook/common/json/jsonmirror/a/d;

    invoke-static {v1, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 319
    :try_start_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    invoke-virtual {v0, v4, v8, v12, v13}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;D)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_3

    move v11, v9

    .line 329
    :cond_7
    :goto_6
    if-nez v11, :cond_2d

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v1, :cond_2d

    const-class v1, Lcom/facebook/common/json/jsonmirror/a/f;

    invoke-static {v1, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z

    move-result v1

    if-eqz v1, :cond_2d

    move-object v1, v2

    .line 331
    check-cast v1, Lcom/facebook/common/json/jsonmirror/a/f;

    .line 332
    iget-object v3, v1, Lcom/facebook/common/json/jsonmirror/a/f;->h:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v3

    .line 335
    invoke-static {v3}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 337
    iget-object v12, v1, Lcom/facebook/common/json/jsonmirror/a/f;->g:Lcom/facebook/common/json/jsonmirror/a/a;

    invoke-static {v3, v12}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/common/json/jsonmirror/a/a;)Ljava/lang/Object;

    move-result-object v3

    .line 339
    if-eqz v3, :cond_2d

    .line 340
    iget-object v12, v1, Lcom/facebook/common/json/jsonmirror/a/f;->g:Lcom/facebook/common/json/jsonmirror/a/a;

    instance-of v12, v12, Lcom/facebook/common/json/jsonmirror/a/h;

    if-eqz v12, :cond_b

    move-object v1, v3

    .line 341
    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v4, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/util/List;)V

    move v1, v9

    .line 356
    :goto_7
    if-nez v1, :cond_8

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v3, :cond_8

    const-class v3, Lcom/facebook/common/json/jsonmirror/a/l;

    invoke-static {v3, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z

    move-result v3

    if-eqz v3, :cond_8

    move-object v1, v2

    .line 358
    check-cast v1, Lcom/facebook/common/json/jsonmirror/a/l;

    .line 360
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/facebook/common/json/jsonmirror/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/String;)V

    move v1, v9

    .line 365
    :cond_8
    if-nez v1, :cond_9

    invoke-virtual {v0}, Lcom/facebook/common/json/jsonmirror/a/c;->b()Z

    move-result v1

    if-nez v1, :cond_9

    .line 366
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Lcom/facebook/common/json/jsonmirror/a/a;)V

    :cond_9
    move-object v1, v5

    .line 368
    goto/16 :goto_1

    .line 296
    :catch_0
    move-exception v1

    move v11, v10

    goto/16 :goto_4

    .line 307
    :cond_a
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v3, "1"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e

    move v1, v9

    move v11, v9

    .line 309
    goto/16 :goto_5

    .line 343
    :cond_b
    iget-object v12, v1, Lcom/facebook/common/json/jsonmirror/a/f;->g:Lcom/facebook/common/json/jsonmirror/a/a;

    instance-of v12, v12, Lcom/facebook/common/json/jsonmirror/a/c;

    if-eqz v12, :cond_c

    .line 344
    check-cast v3, Lcom/facebook/common/json/jsonmirror/b;

    invoke-virtual {v0, v4, v8, v3}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Lcom/facebook/common/json/jsonmirror/b;)V

    move v1, v9

    .line 346
    goto :goto_7

    .line 347
    :cond_c
    iget-object v1, v1, Lcom/facebook/common/json/jsonmirror/a/f;->g:Lcom/facebook/common/json/jsonmirror/a/a;

    instance-of v1, v1, Lcom/facebook/common/json/jsonmirror/a/j;

    if-eqz v1, :cond_2d

    .line 348
    check-cast v3, Ljava/util/Map;

    invoke-virtual {v0, v4, v8, v3}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/util/Map;)V

    move v1, v9

    .line 350
    goto :goto_7

    .line 368
    :cond_d
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v6, v1, :cond_e

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v1, :cond_11

    .line 369
    :cond_e
    const-class v1, Lcom/facebook/common/json/jsonmirror/a/b;

    invoke-static {v1, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Lcom/facebook/common/json/jsonmirror/a/a;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 370
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v1, :cond_f

    move v1, v9

    :goto_8
    invoke-virtual {v0, v4, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Z)V

    move-object v1, v5

    goto/16 :goto_1

    :cond_f
    move v1, v10

    goto :goto_8

    .line 372
    :cond_10
    invoke-static {v6, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Lcom/facebook/common/json/jsonmirror/a/a;)V

    move-object v1, v5

    goto/16 :goto_1

    .line 374
    :cond_11
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v6, v1, :cond_12

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v6, v1, :cond_19

    .line 375
    :cond_12
    if-nez v2, :cond_14

    .line 376
    invoke-virtual {v0}, Lcom/facebook/common/json/jsonmirror/a/c;->b()Z

    move-result v1

    if-nez v1, :cond_13

    .line 377
    invoke-static {v6, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Lcom/facebook/common/json/jsonmirror/a/a;)V

    .line 379
    :cond_13
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    move-object v1, v5

    goto/16 :goto_1

    .line 381
    :cond_14
    invoke-static {p0, v2}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/common/json/jsonmirror/a/a;)Ljava/lang/Object;

    move-result-object v1

    .line 382
    if-eqz v1, :cond_19

    .line 383
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v6, v2, :cond_15

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-ne v1, v2, :cond_16

    .line 384
    :cond_15
    instance-of v2, v1, Ljava/util/List;

    invoke-static {v2}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 385
    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v4, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/util/List;)V

    move-object v1, v5

    goto/16 :goto_1

    .line 386
    :cond_16
    instance-of v2, v1, Lcom/facebook/common/json/jsonmirror/b;

    if-eqz v2, :cond_17

    .line 387
    check-cast v1, Lcom/facebook/common/json/jsonmirror/b;

    invoke-virtual {v0, v4, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Lcom/facebook/common/json/jsonmirror/b;)V

    move-object v1, v5

    goto/16 :goto_1

    .line 388
    :cond_17
    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_18

    .line 389
    check-cast v1, Ljava/util/Map;

    invoke-virtual {v0, v4, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/c;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/util/Map;)V

    move-object v1, v5

    goto/16 :goto_1

    .line 393
    :cond_18
    sget-object v1, Lcom/facebook/common/json/jsonmirror/g;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "got a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " but don\'t know what to do with it."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    :cond_19
    move-object v1, v5

    goto/16 :goto_1

    .line 400
    :cond_1a
    instance-of v1, v4, Lcom/facebook/common/json/jsonmirror/c;

    if-eqz v1, :cond_1b

    move-object v1, v4

    .line 401
    check-cast v1, Lcom/facebook/common/json/jsonmirror/c;

    invoke-interface {v1, v0}, Lcom/facebook/common/json/jsonmirror/c;->a(Lcom/facebook/common/json/jsonmirror/a/c;)V

    .line 468
    :cond_1b
    :goto_9
    return-object v4

    .line 405
    :cond_1c
    const-class v0, Lcom/facebook/common/json/jsonmirror/a/j;

    invoke-static {v0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    if-eqz v0, :cond_27

    .line 409
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 411
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    move-object v1, v0

    move-object v0, v7

    .line 412
    :goto_a
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v1, v3, :cond_26

    .line 414
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_1e

    .line 415
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    .line 413
    :cond_1d
    :goto_b
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    goto :goto_a

    .line 419
    :cond_1e
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_1f

    .line 420
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getLongValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_b

    .line 421
    :cond_1f
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_20

    .line 422
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getDoubleValue()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_b

    .line 423
    :cond_20
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_21

    .line 427
    :try_start_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_b

    .line 428
    :catch_1
    move-exception v1

    .line 430
    :try_start_3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_b

    .line 431
    :catch_2
    move-exception v1

    .line 432
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_b

    .line 435
    :cond_21
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v1, v3, :cond_22

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_24

    .line 436
    :cond_22
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_23

    move v1, v9

    :goto_c
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_b

    :cond_23
    move v1, v10

    goto :goto_c

    .line 437
    :cond_24
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v1, v3, :cond_25

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_1d

    .line 438
    :cond_25
    sget-object v1, Lcom/facebook/common/json/jsonmirror/g;->a:Ljava/lang/Class;

    const-string v3, "Unexpected object/array in simple dictionary"

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 439
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_b

    .line 443
    :cond_26
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v4

    goto/16 :goto_9

    .line 444
    :cond_27
    const-class v0, Lcom/facebook/common/json/jsonmirror/a/h;

    invoke-static {v0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Ljava/lang/Class;Ljava/util/Set;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    if-eqz v0, :cond_2b

    .line 447
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 449
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_28

    .line 451
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto/16 :goto_9

    .line 454
    :cond_28
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-static {v1, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Ljava/util/Set;)V

    .line 458
    :goto_d
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_2c

    .line 459
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_29

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_2a

    .line 460
    :cond_29
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    .line 458
    :cond_2a
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    goto :goto_d

    .line 464
    :cond_2b
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Ljava/util/Set;)V

    .line 465
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->skipChildren()Lcom/fasterxml/jackson/core/JsonParser;

    :cond_2c
    move-object v4, v7

    .line 468
    goto/16 :goto_9

    .line 321
    :catch_3
    move-exception v1

    goto/16 :goto_6

    :cond_2d
    move v1, v11

    goto/16 :goto_7

    :cond_2e
    move v1, v10

    goto/16 :goto_5

    :cond_2f
    move v11, v10

    goto/16 :goto_4

    :cond_30
    move-object v2, v7

    move-object v8, v7

    goto/16 :goto_2
.end method

.method public static d(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    .line 482
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getTokenLocation()Lcom/fasterxml/jackson/core/JsonLocation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonLocation;->getCharOffset()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 483
    invoke-static {p0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;

    .line 486
    :cond_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    .line 487
    const/4 v0, 0x0

    .line 489
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v2, :cond_3

    .line 491
    :cond_1
    invoke-static {v1, p0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Object;

    move-result-object v0

    .line 500
    :cond_2
    :goto_0
    return-object v0

    .line 492
    :cond_3
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v1, v2, :cond_4

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v2, :cond_5

    .line 493
    :cond_4
    invoke-static {p0, p1}, Lcom/facebook/common/json/jsonmirror/g;->a(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 494
    :cond_5
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v2, :cond_6

    .line 495
    invoke-static {p0, p1}, Lcom/facebook/common/json/jsonmirror/g;->b(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 496
    :cond_6
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v2, :cond_2

    .line 497
    invoke-static {p0, p1}, Lcom/facebook/common/json/jsonmirror/g;->c(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/Set;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method
