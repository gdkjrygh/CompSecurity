.class public Lcom/facebook/contacts/contactslist/f;
.super Landroid/support/v4/a/a;
.source "ContactsListLoader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/a/a",
        "<",
        "Lcom/facebook/contacts/contactslist/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final m:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Lcom/facebook/contacts/e/c;

.field private o:Lcom/facebook/contacts/contactslist/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/contacts/contactslist/f;

    sput-object v0, Lcom/facebook/contacts/contactslist/f;->m:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/contacts/e/c;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Landroid/support/v4/a/a;-><init>(Landroid/content/Context;)V

    .line 54
    iput-object p2, p0, Lcom/facebook/contacts/contactslist/f;->n:Lcom/facebook/contacts/e/c;

    .line 55
    return-void
.end method

.method private s()Lcom/facebook/contacts/contactslist/g;
    .locals 2

    .prologue
    .line 79
    invoke-direct {p0}, Lcom/facebook/contacts/contactslist/f;->t()Lcom/google/common/a/es;

    move-result-object v0

    .line 82
    new-instance v1, Lcom/facebook/contacts/contactslist/g;

    invoke-direct {v1, v0}, Lcom/facebook/contacts/contactslist/g;-><init>(Lcom/google/common/a/es;)V

    return-object v1
.end method

.method private t()Lcom/google/common/a/es;
    .locals 3
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
    .line 87
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/f;->n:Lcom/facebook/contacts/e/c;

    sget-object v1, Lcom/facebook/contacts/models/a/a;->ALL_TYPES:Lcom/google/common/a/es;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/e/c;->a(Lcom/google/common/a/es;)Lcom/facebook/contacts/e/b;

    move-result-object v0

    .line 91
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 93
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/contacts/e/b;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 94
    invoke-virtual {v1, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/contacts/e/b;->close()V

    .line 98
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    invoke-virtual {p0}, Lcom/facebook/contacts/contactslist/f;->r()Lcom/facebook/contacts/contactslist/g;

    move-result-object v0

    return-object v0
.end method

.method protected i()V
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Landroid/support/v4/a/a;->i()V

    .line 60
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/f;->o:Lcom/facebook/contacts/contactslist/g;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/f;->o:Lcom/facebook/contacts/contactslist/g;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactslist/f;->b(Ljava/lang/Object;)V

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/f;->o:Lcom/facebook/contacts/contactslist/g;

    if-nez v0, :cond_1

    .line 66
    invoke-virtual {p0}, Lcom/facebook/contacts/contactslist/f;->j()V

    .line 68
    :cond_1
    return-void
.end method

.method public r()Lcom/facebook/contacts/contactslist/g;
    .locals 1

    .prologue
    .line 72
    invoke-direct {p0}, Lcom/facebook/contacts/contactslist/f;->s()Lcom/facebook/contacts/contactslist/g;

    move-result-object v0

    return-object v0
.end method
