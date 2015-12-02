.class public Lcom/facebook/contacts/g/c;
.super Ljava/lang/Object;
.source "ContactClaimFormatHelper.java"


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
    .line 18
    const-class v0, Lcom/facebook/contacts/g/c;

    sput-object v0, Lcom/facebook/contacts/g/c;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonFactory;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/contacts/g/c;->b:Lcom/fasterxml/jackson/core/JsonFactory;

    .line 26
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 29
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 31
    :try_start_0
    iget-object v1, p0, Lcom/facebook/contacts/g/c;->b:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonGenerator(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 33
    const-string v2, "PHONE"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 34
    const-string v2, "phone_number"

    invoke-virtual {v1, v2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v2, "field_label_type"

    invoke-virtual {v1, v2, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumberField(Ljava/lang/String;I)V

    .line 36
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 37
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 38
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->flush()V

    .line 39
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 42
    :goto_0
    return-object v0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    sget-object v1, Lcom/facebook/contacts/g/c;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 42
    const/4 v0, 0x0

    goto :goto_0
.end method
