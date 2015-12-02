.class public Lcom/facebook/contacts/models/f;
.super Ljava/lang/Object;
.source "ContactUserKey.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/UserKey;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 18
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getLookupKey()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 19
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v1, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getLookupKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 35
    :cond_0
    :goto_0
    return-object v0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v0, v2, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    invoke-direct {v0, v2, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static b(Lcom/facebook/contacts/models/Contact;)Lcom/google/common/a/em;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/models/Contact;",
            ")",
            "Lcom/google/common/a/em",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 43
    new-instance v0, Lcom/google/common/a/fk;

    invoke-direct {v0}, Lcom/google/common/a/fk;-><init>()V

    .line 44
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    new-instance v2, Lcom/facebook/user/UserKey;

    sget-object v3, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v2, v3, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    new-instance v2, Lcom/facebook/user/UserKey;

    sget-object v3, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    invoke-direct {v2, v3, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 53
    :cond_2
    invoke-virtual {v0}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0

    .line 39
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
