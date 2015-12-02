.class Lcom/facebook/contacts/n;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Lcom/facebook/contacts/n;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 451
    invoke-direct {p0, p1}, Lcom/facebook/contacts/n;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/a/b;
    .locals 1

    .prologue
    .line 455
    new-instance v0, Lcom/facebook/contacts/a/b;

    invoke-direct {v0}, Lcom/facebook/contacts/a/b;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 451
    invoke-virtual {p0}, Lcom/facebook/contacts/n;->a()Lcom/facebook/contacts/a/b;

    move-result-object v0

    return-object v0
.end method
