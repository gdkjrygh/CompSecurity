.class public Lcom/facebook/contacts/data/d;
.super Lcom/facebook/inject/c;
.source "ContactsModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 76
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 29
    new-instance v0, Lcom/facebook/contacts/a;

    invoke-direct {v0}, Lcom/facebook/contacts/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/d;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 31
    const-class v0, Lcom/facebook/contacts/contactslist/e;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/data/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/data/f;-><init>(Lcom/facebook/contacts/data/d;Lcom/facebook/contacts/data/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 35
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/annotations/IsContactsListEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/contactslist/h;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 39
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ShowOtherContactsDivebar;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/divebar/br;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 43
    const-class v0, Lcom/facebook/contacts/data/p;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/data/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/data/h;-><init>(Lcom/facebook/contacts/data/d;Lcom/facebook/contacts/data/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 46
    const-class v0, Lcom/facebook/contacts/models/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/models/a/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 50
    const-class v0, Lcom/facebook/contacts/contactslist/f;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/data/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/contacts/data/g;-><init>(Lcom/facebook/contacts/data/d;Lcom/facebook/contacts/data/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 52
    return-void
.end method
