.class public Lcom/facebook/bugreporter/d;
.super Ljava/lang/Object;
.source "BugReportUploadMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/bugreporter/e;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
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
    .line 40
    const-class v0, Lcom/facebook/bugreporter/d;

    sput-object v0, Lcom/facebook/bugreporter/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/bugreporter/e;)Lcom/facebook/http/protocol/n;
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 44
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 45
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "desc"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "log"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->e()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "format"

    const-string v4, "json-strings"

    invoke-direct {v1, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v3, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 51
    const-string v3, "Git_Hash"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 53
    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->j()Ljava/lang/String;

    move-result-object v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    const-string v4, "Git_Branch"

    invoke-virtual {v1, v4, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 58
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->i()Ljava/lang/String;

    move-result-object v3

    .line 59
    if-eqz v3, :cond_1

    .line 60
    const-string v4, "Build_Time"

    invoke-virtual {v1, v4, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 63
    :cond_1
    const-string v3, "Build_Num"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 64
    const-string v3, "OS_Version"

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 65
    const-string v3, "Manufacturer"

    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 66
    const-string v3, "Model"

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 67
    const-string v3, "Locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 68
    const-string v3, "Network_Type"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 69
    const-string v3, "Network_Subtype"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 70
    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "info"

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 73
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "category_id"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->f()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 77
    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->b()Lcom/google/common/a/es;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 79
    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 81
    :try_start_0
    new-instance v5, Ljava/io/File;

    new-instance v6, Ljava/net/URI;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 82
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v5}, Ljava/io/File;->canRead()Z

    move-result v0

    if-nez v0, :cond_4

    .line 83
    :cond_3
    sget-object v0, Lcom/facebook/bugreporter/d;->a:Ljava/lang/Class;

    const-string v5, "Ignoring invalid screen shot file"

    invoke-static {v0, v5}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 91
    :catch_0
    move-exception v0

    .line 92
    sget-object v5, Lcom/facebook/bugreporter/d;->a:Ljava/lang/Class;

    const-string v6, "Ignoring invalid screen shot"

    invoke-static {v5, v6, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    :goto_1
    move v1, v0

    .line 93
    goto :goto_0

    .line 86
    :cond_4
    :try_start_1
    const-string v0, "screenshot-%d.png"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v0, v6}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 88
    new-instance v6, Lcom/facebook/http/protocol/ad;

    const-string v7, "image/png"

    invoke-direct {v6, v5, v7, v0}, Lcom/facebook/http/protocol/ad;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    new-instance v5, Lcom/facebook/http/a/a/a/a;

    invoke-direct {v5, v0, v6}, Lcom/facebook/http/a/a/a/a;-><init>(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    add-int/lit8 v0, v1, 0x1

    goto :goto_1

    .line 98
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->c()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 101
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v6, "[^a-zA-Z0-9_ ]"

    const-string v7, "_"

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v6, 0x9

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 107
    :cond_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/String;)[B

    move-result-object v0

    .line 108
    new-instance v1, Lcom/facebook/http/protocol/aa;

    const-string v4, "text/plain"

    const-string v5, "extra_data.txt"

    invoke-direct {v1, v0, v4, v5}, Lcom/facebook/http/protocol/aa;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    .line 113
    new-instance v0, Lcom/facebook/http/a/a/a/a;

    const-string v4, "extra_data.txt"

    invoke-direct {v0, v4, v1}, Lcom/facebook/http/a/a/a/a;-><init>(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    invoke-virtual {p1}, Lcom/facebook/bugreporter/e;->d()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 117
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 118
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 120
    :try_start_2
    new-instance v5, Ljava/io/File;

    new-instance v6, Ljava/net/URI;

    invoke-direct {v6, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 123
    const-string v0, ".jpg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, ".jpeg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 124
    :cond_7
    new-instance v0, Lcom/facebook/http/protocol/ad;

    const-string v6, "image/jpeg"

    invoke-direct {v0, v5, v6, v1}, Lcom/facebook/http/protocol/ad;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    :goto_4
    new-instance v5, Lcom/facebook/http/a/a/a/a;

    invoke-direct {v5, v1, v0}, Lcom/facebook/http/a/a/a/a;-><init>(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    .line 132
    :catch_1
    move-exception v0

    .line 133
    sget-object v5, Lcom/facebook/bugreporter/d;->a:Ljava/lang/Class;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Ignoring invalid debug attachment: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 126
    :cond_8
    :try_start_3
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/google/common/b/f;->b(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    .line 127
    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/String;)[B

    move-result-object v5

    .line 128
    new-instance v0, Lcom/facebook/http/protocol/aa;

    const-string v6, "text/plain"

    invoke-direct {v0, v5, v6, v1}, Lcom/facebook/http/protocol/aa;-><init>([BLjava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/net/URISyntaxException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_4

    .line 137
    :cond_9
    invoke-static {}, Lcom/facebook/http/protocol/n;->newBuilder()Lcom/facebook/http/protocol/p;

    move-result-object v0

    const-string v1, "bugReportUpload"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    const-string v1, "method/bug.create"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->c(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/p;->a(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    sget-object v1, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->a(Lcom/facebook/http/protocol/t;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/http/protocol/p;->b(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/p;->k()Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 37
    check-cast p1, Lcom/facebook/bugreporter/e;

    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/d;->a(Lcom/facebook/bugreporter/e;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/bugreporter/e;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 151
    .line 152
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->a()I

    move-result v2

    const/16 v3, 0xc8

    if-eq v2, v3, :cond_0

    .line 154
    sget-object v2, Lcom/facebook/bugreporter/d;->a:Ljava/lang/Class;

    const-string v3, "Bug report upload failed: %s"

    new-array v4, v1, [Ljava/lang/Object;

    const-string v5, "error code: %d, msg: %s"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->a()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->d()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v5, v6}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v0

    invoke-static {v3, v4}, Lcom/facebook/common/w/m;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 158
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 37
    check-cast p1, Lcom/facebook/bugreporter/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/bugreporter/d;->a(Lcom/facebook/bugreporter/e;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
