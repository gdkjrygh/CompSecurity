.class public Lcom/facebook/contacts/data/a;
.super Ljava/lang/Object;
.source "ContactSerialization.java"


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private final b:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/contacts/data/a;->a:Landroid/content/res/Resources;

    .line 33
    iput-object p2, p0, Lcom/facebook/contacts/data/a;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 34
    return-void
.end method


# virtual methods
.method public a(Lcom/google/common/a/es;)Lcom/facebook/contacts/models/EntrySection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/entry/PhoneEntry;",
            ">;)",
            "Lcom/facebook/contacts/models/EntrySection;"
        }
    .end annotation

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/contacts/data/a;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->contact_card_contact_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 49
    new-instance v1, Lcom/facebook/contacts/models/EntrySection;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v1, v0, p1, v2}, Lcom/facebook/contacts/models/EntrySection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    return-object v1
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/contacts/models/EntrySection;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 37
    new-instance v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    const/4 v2, 0x1

    const-wide/16 v4, -0x1

    const/4 v7, 0x2

    move-object v3, v1

    move-object v6, p1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/contacts/models/entry/PhoneEntry;-><init>(Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;I)V

    .line 44
    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/a;->a(Lcom/google/common/a/es;)Lcom/facebook/contacts/models/EntrySection;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/models/Contact;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "serializeContact ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/facebook/contacts/data/a;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 56
    return-object v1
.end method

.method public a(Lcom/facebook/contacts/models/ContactDetails;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "serializeContactDetails ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/contacts/models/ContactDetails;->getContactId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 68
    iget-object v1, p0, Lcom/facebook/contacts/data/a;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 70
    return-object v1
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/contacts/models/Contact;
    .locals 3

    .prologue
    .line 60
    const-string v0, "deserializeContact"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 61
    iget-object v0, p0, Lcom/facebook/contacts/data/a;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v2, Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v0, p1, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/Contact;

    .line 62
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 63
    return-object v0
.end method
