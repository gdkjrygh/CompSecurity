.class public Lcom/facebook/contacts/contactslist/g;
.super Ljava/lang/Object;
.source "ContactsListLoader.java"


# instance fields
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/Contact;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Z


# direct methods
.method public constructor <init>(Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/Contact;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactslist/g;-><init>(Lcom/google/common/a/es;Z)V

    .line 35
    return-void
.end method

.method public constructor <init>(Lcom/google/common/a/es;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/Contact;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/contacts/contactslist/g;->a:Lcom/google/common/a/es;

    .line 30
    iput-boolean p2, p0, Lcom/facebook/contacts/contactslist/g;->b:Z

    .line 31
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/Contact;",
            ">;"
        }
    .end annotation

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/g;->a:Lcom/google/common/a/es;

    return-object v0
.end method
