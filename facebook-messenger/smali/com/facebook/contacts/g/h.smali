.class public Lcom/facebook/contacts/g/h;
.super Ljava/lang/Object;
.source "FetchContactMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/FetchContactParams;",
        "Lcom/facebook/contacts/server/FetchContactResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/contacts/c/a;

.field private final b:Lcom/facebook/contacts/c/b;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/c/a;Lcom/facebook/contacts/c/b;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/facebook/contacts/g/h;->a:Lcom/facebook/contacts/c/a;

    .line 53
    iput-object p2, p0, Lcom/facebook/contacts/g/h;->b:Lcom/facebook/contacts/c/b;

    .line 54
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/Contact;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/contacts/g/h;->a:Lcom/facebook/contacts/c/a;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/c/a;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/b;

    move-result-object v0

    .line 92
    invoke-virtual {v0}, Lcom/facebook/contacts/models/b;->u()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/g/a/b;)Lcom/facebook/g/a/b;
    .locals 4

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/contacts/g/h;->b:Lcom/facebook/contacts/c/b;

    invoke-interface {v0, p1}, Lcom/facebook/contacts/c/b;->a(Lcom/facebook/g/a/b;)V

    .line 216
    const-string v0, "rows"

    invoke-static {v0}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "nodes"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "label"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "entries"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/contacts/g/h;->b(Lcom/facebook/g/a/b;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "hidden_entries"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/contacts/g/h;->b(Lcom/facebook/g/a/b;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    .line 225
    const-string v1, "represented_profile"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "has_timeline"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "complete_represented_profile"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->d(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "info_sections"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "nodes"

    invoke-static {v3}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v3, "label"

    invoke-virtual {v0, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    .line 238
    return-object p1
.end method

.method private a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 2

    .prologue
    .line 81
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 82
    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 83
    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne p1, v1, :cond_0

    .line 84
    const-string v1, "contact"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 86
    :cond_0
    return-object v0
.end method

.method private a(Lcom/facebook/user/UserKey;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 108
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 112
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_2

    .line 113
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    .line 114
    const-string v1, "contact"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/contacts/g/h;->a(Lcom/facebook/g/a/b;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    .line 116
    invoke-static {v0}, Lcom/facebook/g/a/a;->a(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    .line 125
    :goto_1
    invoke-virtual {v0}, Lcom/facebook/g/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 108
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 120
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    .line 121
    invoke-static {v0}, Lcom/facebook/g/a/a;->a(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/h;->a(Lcom/facebook/g/a/b;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    goto :goto_1
.end method

.method private a(Lcom/google/common/a/et;Lcom/google/common/a/et;Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/contacts/models/entry/PhoneEntry;",
            ">;",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/contacts/models/entry/PhoneEntry;",
            ">;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")V"
        }
    .end annotation

    .prologue
    .line 159
    const-string v0, "label"

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    .line 160
    const-string v0, "entries"

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 161
    const-string v1, "hidden_entries"

    invoke-virtual {p3, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 163
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 164
    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/h;->d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/entry/PhoneEntry;

    move-result-object v0

    .line 165
    if-eqz v0, :cond_0

    .line 166
    invoke-virtual {p1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 169
    :cond_1
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 170
    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/h;->d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/entry/PhoneEntry;

    move-result-object v0

    .line 171
    if-eqz v0, :cond_2

    .line 172
    invoke-virtual {p2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 175
    :cond_3
    return-void
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/ContactDetails;
    .locals 5

    .prologue
    .line 96
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 97
    const-string v1, "info_sections"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 98
    const-string v2, "complete_represented_profile"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    const-string v3, "has_timeline"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v2

    .line 101
    new-instance v3, Lcom/facebook/contacts/models/ContactDetails;

    const-string v4, "nodes"

    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/contacts/g/h;->c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/EntrySection;

    move-result-object v1

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/contacts/models/ContactDetails;-><init>(Ljava/lang/String;Lcom/facebook/contacts/models/EntrySection;Z)V

    return-object v3
.end method

.method private b(Lcom/facebook/g/a/b;)Lcom/facebook/g/a/b;
    .locals 4

    .prologue
    .line 242
    const-string v0, "graph_api_write_id"

    invoke-virtual {p1, v0}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "primary_field"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "value"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "source"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "creation_time"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "__type__"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "phone"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "display_number"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "universal_number"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/EntrySection;
    .locals 5

    .prologue
    .line 129
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 130
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 132
    const-string v1, "label"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v1

    .line 134
    const-string v2, "rows"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 135
    const-string v2, "nodes"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 137
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 138
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 139
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 140
    invoke-direct {p0, v2, v3, v0}, Lcom/facebook/contacts/g/h;->a(Lcom/google/common/a/et;Lcom/google/common/a/et;Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_0

    .line 142
    :cond_0
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    .line 143
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v3

    .line 144
    new-instance v0, Lcom/facebook/contacts/models/EntrySection;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/contacts/models/EntrySection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    .line 146
    :goto_1
    return-object v0

    :cond_1
    new-instance v0, Lcom/facebook/contacts/models/EntrySection;

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v2

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/contacts/models/EntrySection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    goto :goto_1
.end method

.method private d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/entry/PhoneEntry;
    .locals 9

    .prologue
    const/4 v6, 0x0

    .line 178
    const-string v0, "is_verified"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v2

    .line 179
    const-string v0, "graph_api_write_id"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 181
    const-string v0, "primary_field"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v7

    .line 183
    const-string v0, "__type__"

    invoke-virtual {v7, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 185
    if-eqz v0, :cond_2

    .line 186
    const-string v3, "name"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 189
    :goto_0
    const-string v3, "source"

    invoke-virtual {v7, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 191
    if-eqz v3, :cond_1

    .line 192
    const-string v4, "text"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 195
    :goto_1
    const-string v4, "creation_time"

    invoke-virtual {v7, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v4

    .line 197
    const-string v8, "ContactPhone"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    const-string v0, "phone"

    invoke-virtual {v7, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v6, "universal_number"

    invoke-virtual {v0, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v6

    .line 200
    new-instance v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    const/4 v7, 0x2

    invoke-direct/range {v0 .. v7}, Lcom/facebook/contacts/models/entry/PhoneEntry;-><init>(Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;I)V

    .line 208
    :goto_2
    return-object v0

    :cond_0
    move-object v0, v6

    goto :goto_2

    :cond_1
    move-object v3, v6

    goto :goto_1

    :cond_2
    move-object v0, v6

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/FetchContactParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchContactResult;
    .locals 6

    .prologue
    .line 66
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 69
    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchContactParams;->a()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 70
    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/facebook/contacts/g/h;->a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 71
    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/h;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/Contact;

    move-result-object v4

    .line 72
    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/h;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v5

    .line 74
    new-instance v0, Lcom/facebook/contacts/server/FetchContactResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/server/FetchContactResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/server/FetchContactParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 58
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 59
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchContactParams;->a()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/contacts/g/h;->a(Lcom/facebook/user/UserKey;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchContact"

    const-string v2, "GET"

    const-string v3, "graphql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 44
    check-cast p1, Lcom/facebook/contacts/server/FetchContactParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/h;->a(Lcom/facebook/contacts/server/FetchContactParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    check-cast p1, Lcom/facebook/contacts/server/FetchContactParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/h;->a(Lcom/facebook/contacts/server/FetchContactParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchContactResult;

    move-result-object v0

    return-object v0
.end method
