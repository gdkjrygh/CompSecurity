.class public Lcom/facebook/contacts/g/a/h;
.super Ljava/lang/Object;
.source "SearchPhoneNumberMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/g/a/i;",
        "Lcom/facebook/user/User;",
        ">;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/Immutable;
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


# instance fields
.field private final b:Lcom/facebook/phonenumbers/PhoneNumberUtil;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/contacts/g/a/h;

    sput-object v0, Lcom/facebook/contacts/g/a/h;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/phonenumbers/PhoneNumberUtil;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/phonenumbers/PhoneNumberUtil;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/facebook/contacts/g/a/h;->b:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    .line 54
    iput-object p2, p0, Lcom/facebook/contacts/g/a/h;->c:Ljavax/inject/a;

    .line 55
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 108
    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/g/a/h;->b:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    move-result-object v0

    .line 109
    iget-object v1, p0, Lcom/facebook/contacts/g/a/h;->b:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    sget-object v2, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->E164:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->format(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
    :try_end_0
    .catch Lcom/facebook/phonenumbers/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p1

    .line 117
    :goto_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 119
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 120
    const-string v2, "cell"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 121
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 123
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 111
    :catch_0
    move-exception v0

    .line 112
    sget-object v1, Lcom/facebook/contacts/g/a/h;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot parse number: ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "] in region: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/g/a/i;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 59
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 60
    iget-object v0, p0, Lcom/facebook/contacts/g/a/h;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 61
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "entries"

    invoke-static {p1}, Lcom/facebook/contacts/g/a/i;->a(Lcom/facebook/contacts/g/a/i;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, v0}, Lcom/facebook/contacts/g/a/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "format"

    const-string v3, "json"

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    if-eqz v0, :cond_0

    .line 68
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "country_code"

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_0
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "searchPhoneNumberMethod"

    const-string v2, "GET"

    const-string v3, "method/phonebook.lookup"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 34
    check-cast p1, Lcom/facebook/contacts/g/a/i;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/a/h;->a(Lcom/facebook/contacts/g/a/i;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/g/a/i;Lcom/facebook/http/protocol/r;)Lcom/facebook/user/User;
    .locals 5

    .prologue
    .line 82
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 83
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 84
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 85
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 86
    const-string v1, "name"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 87
    const-string v2, "uid"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 88
    const-string v3, "pic_square_with_logo"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 90
    new-instance v3, Lcom/facebook/user/o;

    invoke-direct {v3}, Lcom/facebook/user/o;-><init>()V

    .line 91
    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v3, v4, v2}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    .line 92
    invoke-virtual {v3, v1}, Lcom/facebook/user/o;->a(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 93
    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {v3, v0}, Lcom/facebook/user/o;->b(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 96
    :cond_0
    invoke-virtual {v3}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    .line 98
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 34
    check-cast p1, Lcom/facebook/contacts/g/a/i;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/a/h;->a(Lcom/facebook/contacts/g/a/i;Lcom/facebook/http/protocol/r;)Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method
