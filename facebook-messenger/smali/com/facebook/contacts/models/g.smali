.class public Lcom/facebook/contacts/models/g;
.super Ljava/lang/Object;
.source "ContactUtils.java"


# instance fields
.field private final a:Lcom/facebook/contacts/a/b;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/a/b;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/contacts/models/g;->a:Lcom/facebook/contacts/a/b;

    .line 22
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/contacts/models/entry/PhoneEntry;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 28
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    invoke-direct {v0, v2, p1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 29
    iget-object v2, p0, Lcom/facebook/contacts/models/g;->a:Lcom/facebook/contacts/a/b;

    invoke-virtual {v2, v0}, Lcom/facebook/contacts/a/b;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v0

    .line 30
    if-nez v0, :cond_0

    move-object v0, v1

    .line 41
    :goto_0
    return-object v0

    .line 33
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/contacts/models/ContactDetails;->getContactInfoSection()Lcom/facebook/contacts/models/EntrySection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/models/EntrySection;->getEntries()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 34
    invoke-interface {v0}, Lcom/facebook/contacts/models/entry/Entry;->a()Lcom/facebook/contacts/models/entry/d;

    move-result-object v3

    sget-object v4, Lcom/facebook/contacts/models/entry/d;->PHONE_NUMBER:Lcom/facebook/contacts/models/entry/d;

    if-ne v3, v4, :cond_1

    .line 35
    check-cast v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 36
    invoke-virtual {v0}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getNumber()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 41
    goto :goto_0
.end method
