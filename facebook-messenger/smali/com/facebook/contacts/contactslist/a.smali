.class public Lcom/facebook/contacts/contactslist/a;
.super Ljava/lang/Object;
.source "ContactComparatorByName.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/contacts/models/Contact;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/text/Collator;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/a;->a:Ljava/text/Collator;

    .line 20
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/a;->a:Ljava/text/Collator;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/Collator;->setStrength(I)V

    .line 21
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/Contact;)I
    .locals 3

    .prologue
    .line 25
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-virtual {p2}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/facebook/contacts/contactslist/a;->a:Ljava/text/Collator;

    invoke-virtual {v2, v0, v1}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 14
    check-cast p1, Lcom/facebook/contacts/models/Contact;

    check-cast p2, Lcom/facebook/contacts/models/Contact;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/contactslist/a;->a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/Contact;)I

    move-result v0

    return v0
.end method
