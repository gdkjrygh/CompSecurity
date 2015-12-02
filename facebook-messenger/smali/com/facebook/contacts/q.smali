.class Lcom/facebook/contacts/q;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/data/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 491
    iput-object p1, p0, Lcom/facebook/contacts/q;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 491
    invoke-direct {p0, p1}, Lcom/facebook/contacts/q;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/data/c;
    .locals 1

    .prologue
    .line 495
    new-instance v0, Lcom/facebook/contacts/data/c;

    invoke-direct {v0}, Lcom/facebook/contacts/data/c;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 491
    invoke-virtual {p0}, Lcom/facebook/contacts/q;->a()Lcom/facebook/contacts/data/c;

    move-result-object v0

    return-object v0
.end method
