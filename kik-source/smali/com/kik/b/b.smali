.class public final Lcom/kik/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;


# instance fields
.field private b:Ljava/util/List;

.field private final c:Lcom/kik/b/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 23
    const-string v0, "(www.)?kik.com"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/kik/b/b;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lcom/kik/b/a;)V
    .locals 2

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/kik/b/b;->b:Ljava/util/List;

    .line 30
    iput-object p1, p0, Lcom/kik/b/b;->c:Lcom/kik/b/a;

    .line 31
    iget-object v0, p0, Lcom/kik/b/b;->c:Lcom/kik/b/a;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must set a default handler"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_0
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 86
    iget-object v0, p0, Lcom/kik/b/b;->c:Lcom/kik/b/a;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/kik/b/a;->a(Ljava/util/Map;Ljava/util/Map;)V

    .line 87
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/b/a;)V
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/kik/b/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 46
    :try_start_0
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    .line 47
    const-string v0, "UTF-8"

    invoke-static {v3, v0}, Lorg/apache/http/client/utils/URLEncodedUtils;->parse(Ljava/net/URI;Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 55
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 56
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    .line 57
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 59
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    :cond_0
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 51
    :catch_0
    move-exception v0

    invoke-direct {p0}, Lcom/kik/b/b;->a()V

    .line 82
    :goto_1
    return-void

    .line 65
    :cond_1
    const-string v0, "kik"

    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    .line 67
    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/kik/b/b;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    .line 68
    :goto_2
    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    const-string v2, "users"

    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    .line 70
    :cond_2
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v3

    if-eqz v3, :cond_4

    if-nez v1, :cond_4

    if-nez v0, :cond_4

    if-nez v2, :cond_4

    .line 71
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid request url recieved"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move v0, v2

    .line 67
    goto :goto_2

    .line 74
    :cond_4
    iget-object v0, p0, Lcom/kik/b/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/b/a;

    .line 75
    invoke-virtual {v0, p1}, Lcom/kik/b/a;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 76
    invoke-virtual {v0, p1}, Lcom/kik/b/a;->a(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v1

    .line 77
    invoke-virtual {v0, v1, v4}, Lcom/kik/b/a;->a(Ljava/util/Map;Ljava/util/Map;)V

    goto :goto_1

    .line 81
    :cond_6
    invoke-direct {p0}, Lcom/kik/b/b;->a()V

    goto :goto_1
.end method
