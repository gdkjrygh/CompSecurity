.class public Lcom/facebook/contacts/g/k;
.super Ljava/lang/Object;
.source "UploadBulkContactsMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/UploadBulkContactsParams;",
        "Lcom/facebook/contacts/server/UploadBulkContactsResult;",
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


# instance fields
.field private final b:Lcom/fasterxml/jackson/core/JsonFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-class v0, Lcom/facebook/contacts/g/k;

    sput-object v0, Lcom/facebook/contacts/g/k;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonFactory;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/facebook/contacts/g/k;->b:Lcom/fasterxml/jackson/core/JsonFactory;

    .line 53
    return-void
.end method

.method private a(Lcom/facebook/contacts/server/ContactInteractionEvent;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 244
    sget-object v0, Lcom/facebook/contacts/g/l;->b:[I

    invoke-virtual {p1}, Lcom/facebook/contacts/server/ContactInteractionEvent;->a()Lcom/facebook/contacts/server/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/server/c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 259
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :pswitch_0
    const-string v0, "sms_sent"

    .line 256
    :goto_0
    return-object v0

    .line 248
    :pswitch_1
    const-string v0, "sms_received"

    goto :goto_0

    .line 250
    :pswitch_2
    const-string v0, "mms_sent"

    goto :goto_0

    .line 252
    :pswitch_3
    const-string v0, "mms_received"

    goto :goto_0

    .line 254
    :pswitch_4
    const-string v0, "call_sent"

    goto :goto_0

    .line 256
    :pswitch_5
    const-string v0, "call_received"

    goto :goto_0

    .line 244
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private a(Lcom/facebook/contacts/server/UploadBulkContactChange;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 210
    sget-object v0, Lcom/facebook/contacts/g/l;->a:[I

    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactChange;->c()Lcom/facebook/contacts/server/ad;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/server/ad;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 219
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 212
    :pswitch_0
    const-string v0, "add"

    goto :goto_0

    .line 214
    :pswitch_1
    const-string v0, "modify"

    goto :goto_0

    .line 216
    :pswitch_2
    const-string v0, "delete"

    goto :goto_0

    .line 210
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/facebook/user/UserEmailAddress;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 310
    invoke-virtual {p1}, Lcom/facebook/user/UserEmailAddress;->b()I

    move-result v0

    .line 312
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 313
    const-string v0, "home"

    .line 317
    :goto_0
    return-object v0

    .line 314
    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 315
    const-string v0, "work"

    goto :goto_0

    .line 317
    :cond_1
    const-string v0, "other"

    goto :goto_0
.end method

.method private a(Lcom/facebook/user/UserPhoneNumber;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 322
    invoke-virtual {p1}, Lcom/facebook/user/UserPhoneNumber;->f()I

    move-result v0

    .line 324
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 325
    const-string v0, "home"

    .line 339
    :goto_0
    return-object v0

    .line 326
    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 327
    const-string v0, "work"

    goto :goto_0

    .line 328
    :cond_1
    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 329
    const-string v0, "mobile"

    goto :goto_0

    .line 330
    :cond_2
    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 331
    const-string v0, "fax_home"

    goto :goto_0

    .line 332
    :cond_3
    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 333
    const-string v0, "fax_work"

    goto :goto_0

    .line 334
    :cond_4
    const/16 v1, 0xd

    if-ne v0, v1, :cond_5

    .line 335
    const-string v0, "fax_other"

    goto :goto_0

    .line 336
    :cond_5
    const/4 v1, 0x6

    if-ne v0, v1, :cond_6

    .line 337
    const-string v0, "pager"

    goto :goto_0

    .line 339
    :cond_6
    const-string v0, "other"

    goto :goto_0
.end method

.method private a(Lcom/google/common/a/es;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/server/UploadBulkContactChange;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 188
    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 189
    iget-object v0, p0, Lcom/facebook/contacts/g/k;->b:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonGenerator(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v2

    .line 190
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 191
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/UploadBulkContactChange;

    .line 192
    invoke-direct {p0, v0, v2}, Lcom/facebook/contacts/g/k;->a(Lcom/facebook/contacts/server/UploadBulkContactChange;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    goto :goto_0

    .line 194
    :cond_0
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 195
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->flush()V

    .line 196
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/contacts/server/UploadBulkContactChange;Lcom/fasterxml/jackson/core/JsonGenerator;)V
    .locals 2

    .prologue
    .line 201
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 202
    const-string v0, "client_contact_id"

    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactChange;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    const-string v0, "update_type"

    invoke-direct {p0, p1}, Lcom/facebook/contacts/g/k;->a(Lcom/facebook/contacts/server/UploadBulkContactChange;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactChange;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/contacts/g/k;->a(Lcom/google/common/a/es;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 205
    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactChange;->b()Lcom/facebook/user/User;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/contacts/g/k;->a(Lcom/facebook/user/User;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 206
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 207
    return-void
.end method

.method private a(Lcom/facebook/user/User;Lcom/fasterxml/jackson/core/JsonGenerator;)V
    .locals 4

    .prologue
    .line 264
    const-string v0, "contact"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 266
    const-string v0, "name"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 268
    invoke-virtual {p1}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v0

    .line 269
    const-string v1, "formatted"

    invoke-virtual {v0}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    invoke-virtual {v0}, Lcom/facebook/user/Name;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 271
    const-string v1, "first"

    invoke-virtual {v0}, Lcom/facebook/user/Name;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/user/Name;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 275
    const-string v1, "last"

    invoke-virtual {v0}, Lcom/facebook/user/Name;->getLastName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    :cond_1
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 280
    invoke-virtual {p1}, Lcom/facebook/user/User;->j()Lcom/google/common/a/es;

    move-result-object v0

    .line 281
    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 282
    const-string v1, "emails"

    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 283
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserEmailAddress;

    .line 284
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 285
    const-string v2, "type"

    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/k;->a(Lcom/facebook/user/UserEmailAddress;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v2, "email"

    invoke-virtual {v0}, Lcom/facebook/user/UserEmailAddress;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto :goto_0

    .line 290
    :cond_2
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 293
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v0

    .line 294
    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 295
    const-string v1, "phones"

    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 296
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserPhoneNumber;

    .line 297
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 298
    const-string v2, "type"

    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/k;->a(Lcom/facebook/user/UserPhoneNumber;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    const-string v2, "number"

    invoke-virtual {v0}, Lcom/facebook/user/UserPhoneNumber;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto :goto_1

    .line 303
    :cond_4
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 306
    :cond_5
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 307
    return-void
.end method

.method private a(Lcom/google/common/a/es;Lcom/fasterxml/jackson/core/JsonGenerator;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/server/ContactInteractionEvent;",
            ">;",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            ")V"
        }
    .end annotation

    .prologue
    .line 225
    const-string v0, "interaction_events"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 226
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/ContactInteractionEvent;

    .line 227
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 228
    const-string v2, "type"

    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/k;->a(Lcom/facebook/contacts/server/ContactInteractionEvent;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    const-string v2, "count"

    invoke-virtual {v0}, Lcom/facebook/contacts/server/ContactInteractionEvent;->b()I

    move-result v3

    invoke-virtual {p2, v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumberField(Ljava/lang/String;I)V

    .line 232
    const-string v2, "timestamps"

    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 233
    invoke-virtual {v0}, Lcom/facebook/contacts/server/ContactInteractionEvent;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 234
    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {p2, v3, v4}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(J)V

    goto :goto_1

    .line 236
    :cond_0
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 237
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto :goto_0

    .line 240
    :cond_1
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 241
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/UploadBulkContactsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/UploadBulkContactsResult;
    .locals 13

    .prologue
    .line 81
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 82
    sget-object v1, Lcom/facebook/contacts/g/k;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got response: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 84
    const-string v1, "import_id"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v6

    .line 86
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v7

    .line 88
    const-string v1, "contact_changes"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object v8

    .line 91
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 92
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 93
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 94
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 96
    const-string v1, "update_type"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 99
    const-string v3, "add"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 100
    sget-object v1, Lcom/facebook/contacts/server/ag;->ADD:Lcom/facebook/contacts/server/ag;

    .line 112
    :goto_1
    const-string v3, "contact"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 113
    const-string v4, "id"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 115
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v9

    .line 118
    const-string v4, "field_matches"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    .line 119
    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 122
    const-string v5, "match_type"

    invoke-virtual {v4, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 123
    const-string v11, "hard"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 124
    sget-object v5, Lcom/facebook/contacts/server/ai;->HARD:Lcom/facebook/contacts/server/ai;

    .line 134
    :goto_3
    const-string v11, "value_type"

    invoke-virtual {v4, v11}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 135
    const-string v11, "name"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 136
    sget-object v4, Lcom/facebook/contacts/server/aj;->NAME:Lcom/facebook/contacts/server/aj;

    .line 150
    :goto_4
    new-instance v11, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;

    invoke-direct {v11, v5, v4}, Lcom/facebook/contacts/server/UploadBulkContactFieldMatch;-><init>(Lcom/facebook/contacts/server/ai;Lcom/facebook/contacts/server/aj;)V

    invoke-virtual {v9, v11}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_2

    .line 101
    :cond_0
    const-string v3, "modify"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 102
    sget-object v1, Lcom/facebook/contacts/server/ag;->MODIFY:Lcom/facebook/contacts/server/ag;

    goto :goto_1

    .line 103
    :cond_1
    const-string v3, "remove"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 104
    sget-object v1, Lcom/facebook/contacts/server/ag;->REMOVE:Lcom/facebook/contacts/server/ag;

    goto :goto_1

    .line 105
    :cond_2
    const-string v3, "none"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 106
    sget-object v1, Lcom/facebook/contacts/server/ag;->NONE:Lcom/facebook/contacts/server/ag;

    goto :goto_1

    .line 108
    :cond_3
    sget-object v0, Lcom/facebook/contacts/g/k;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unrecognized contact change type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", skipping"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 125
    :cond_4
    const-string v11, "soft"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 126
    sget-object v5, Lcom/facebook/contacts/server/ai;->SOFT:Lcom/facebook/contacts/server/ai;

    goto :goto_3

    .line 128
    :cond_5
    sget-object v4, Lcom/facebook/contacts/g/k;->a:Ljava/lang/Class;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Unrecognized contact field match type: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v11, ", skipping"

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 137
    :cond_6
    const-string v11, "email"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    .line 138
    sget-object v4, Lcom/facebook/contacts/server/aj;->EMAIL:Lcom/facebook/contacts/server/aj;

    goto :goto_4

    .line 139
    :cond_7
    const-string v11, "phone"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 140
    sget-object v4, Lcom/facebook/contacts/server/aj;->PHONE:Lcom/facebook/contacts/server/aj;

    goto/16 :goto_4

    .line 141
    :cond_8
    const-string v11, "email_public_hash"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    .line 142
    sget-object v4, Lcom/facebook/contacts/server/aj;->EMAIL_PUBLIC_HASH:Lcom/facebook/contacts/server/aj;

    goto/16 :goto_4

    .line 143
    :cond_9
    const-string v11, "phone_public_hash"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 144
    sget-object v4, Lcom/facebook/contacts/server/aj;->PHONE_PUBLIC_HASH:Lcom/facebook/contacts/server/aj;

    goto/16 :goto_4

    .line 146
    :cond_a
    sget-object v5, Lcom/facebook/contacts/g/k;->a:Ljava/lang/Class;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Unrecognized contact field value type: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v11, ", skipping"

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 153
    :cond_b
    const-string v4, "match_confidence"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 155
    const-string v4, "high"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 156
    sget-object v5, Lcom/facebook/contacts/server/af;->HIGH:Lcom/facebook/contacts/server/af;

    .line 170
    :goto_5
    new-instance v0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;

    invoke-virtual {v9}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;-><init>(Lcom/facebook/contacts/server/ag;Ljava/lang/String;Ljava/lang/String;Lcom/google/common/a/es;Lcom/facebook/contacts/server/af;)V

    invoke-virtual {v7, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto/16 :goto_0

    .line 157
    :cond_c
    const-string v4, "medium"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 158
    sget-object v5, Lcom/facebook/contacts/server/af;->MEDIUM:Lcom/facebook/contacts/server/af;

    goto :goto_5

    .line 159
    :cond_d
    const-string v4, "low"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 160
    sget-object v5, Lcom/facebook/contacts/server/af;->LOW:Lcom/facebook/contacts/server/af;

    goto :goto_5

    .line 161
    :cond_e
    const-string v4, "very_low"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    .line 162
    sget-object v5, Lcom/facebook/contacts/server/af;->VERY_LOW:Lcom/facebook/contacts/server/af;

    goto :goto_5

    .line 163
    :cond_f
    const-string v4, "unknown"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    .line 164
    sget-object v5, Lcom/facebook/contacts/server/af;->UNKNOWN:Lcom/facebook/contacts/server/af;

    goto :goto_5

    .line 166
    :cond_10
    sget-object v4, Lcom/facebook/contacts/g/k;->a:Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Unrecognized confidence type: "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 167
    sget-object v5, Lcom/facebook/contacts/server/af;->UNKNOWN:Lcom/facebook/contacts/server/af;

    goto :goto_5

    .line 179
    :cond_11
    new-instance v0, Lcom/facebook/contacts/server/UploadBulkContactsResult;

    invoke-virtual {v7}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    sget-object v3, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/server/UploadBulkContactsResult;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Lcom/facebook/fbservice/c/b;J)V

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/server/UploadBulkContactsParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 57
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 58
    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactsParams;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 59
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "import_id"

    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactsParams;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_0
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "contact_changes"

    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactsParams;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/contacts/g/k;->a(Lcom/google/common/a/es;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    sget-object v0, Lcom/facebook/contacts/g/k;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Uploading contacts: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 69
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "graphUploadBulkContacts"

    const-string v2, "POST"

    const-string v3, "me/bulkcontacts"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 45
    check-cast p1, Lcom/facebook/contacts/server/UploadBulkContactsParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/k;->a(Lcom/facebook/contacts/server/UploadBulkContactsParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    check-cast p1, Lcom/facebook/contacts/server/UploadBulkContactsParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/k;->a(Lcom/facebook/contacts/server/UploadBulkContactsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/UploadBulkContactsResult;

    move-result-object v0

    return-object v0
.end method
