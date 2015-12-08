.class public final Lkik/a/f/c/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;

.field private static final b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 18
    const-string v0, "IncomingRouting"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/f/c/e;->a:Lorg/c/b;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 24
    sput-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    const-string v1, "chat"

    const-class v2, Lkik/a/f/c/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    sget-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    const-string v1, "groupchat"

    const-class v2, Lkik/a/f/c/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    sget-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    const-string v1, "pic"

    const-class v2, Lkik/a/f/c/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    const-string v1, "is-typing"

    const-class v2, Lkik/a/f/c/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    const-string v1, "scan-notification"

    const-class v2, Lkik/a/f/c/a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    const-string v1, "error"

    const-class v2, Lkik/a/f/c/b;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    sget-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    const-string v1, "receipt"

    const-class v2, Lkik/a/f/c/d;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    return-void
.end method

.method public static a(Lkik/a/f/n;Ljava/security/KeyPair;Lkik/a/e/o;)Lkik/a/f/c/c;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 35
    .line 37
    invoke-virtual {p0, v0, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v1

    .line 41
    const-string v2, "message"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "msg"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 42
    :cond_0
    const-string v2, "type"

    invoke-virtual {p0, v0, v2}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 44
    sget-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 45
    sget-object v0, Lkik/a/f/c/e;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 47
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/c/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :goto_0
    if-eqz v0, :cond_1

    .line 61
    :try_start_1
    invoke-virtual {v0, p0, p1, p2}, Lkik/a/f/c/c;->a(Lkik/a/f/n;Ljava/security/KeyPair;Lkik/a/e/o;)V
    :try_end_1
    .catch Lkik/a/f/g; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 75
    invoke-virtual {p0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 79
    invoke-virtual {p0}, Lkik/a/f/n;->skipSubTree()V

    .line 82
    :cond_2
    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lkik/a/f/c/c;->h()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    .line 83
    :cond_3
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Message is missing bin or corrospondent"

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :catch_0
    move-exception v0

    .line 50
    sget-object v1, Lkik/a/f/c/e;->a:Lorg/c/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Class map failed to instantiate class for type: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 52
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 54
    :cond_4
    new-instance v0, Lkik/a/f/c/f;

    invoke-direct {v0}, Lkik/a/f/c/f;-><init>()V

    goto :goto_0

    .line 63
    :catch_1
    move-exception v2

    .line 64
    sget-object v3, Lkik/a/f/c/e;->a:Lorg/c/b;

    const-string v4, "Encryption error parsing stanza"

    invoke-interface {v3, v4, v2}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 68
    :cond_5
    const-string v2, "iq"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 70
    const/4 v2, 0x3

    const-string v3, "iq"

    invoke-virtual {p0, v2, v3}, Lkik/a/f/n;->a(ILjava/lang/String;)V

    goto :goto_1

    .line 85
    :cond_6
    return-object v0
.end method
